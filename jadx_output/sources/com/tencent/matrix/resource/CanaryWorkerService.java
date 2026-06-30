package com.tencent.matrix.resource;

/* loaded from: classes12.dex */
public class CanaryWorkerService extends com.tencent.matrix.resource.MatrixJobIntentService {

    /* renamed from: n, reason: collision with root package name */
    public static final /* synthetic */ int f52925n = 0;

    @Override // com.tencent.matrix.resource.MatrixJobIntentService
    public void d(android.content.Intent intent) {
        if (intent == null || !"com.tencent.matrix.resource.worker.action.SHRINK_HPROF".equals(intent.getAction())) {
            return;
        }
        try {
            intent.setExtrasClassLoader(getClassLoader());
            ti.w0 w0Var = (ti.w0) intent.getSerializableExtra("com.tencent.matrix.resource.worker.param.HEAPDUMP");
            if (w0Var != null) {
                f(w0Var);
            } else {
                oj.j.b("Matrix.CanaryWorkerService", "failed to deserialize heap dump, give up shrinking and reporting.", new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable th6) {
            oj.j.d("Matrix.CanaryWorkerService", th6, "failed to deserialize heap dump, give up shrinking and reporting.", new java.lang.Object[0]);
        }
    }

    public final void f(ti.w0 w0Var) {
        java.util.zip.ZipOutputStream zipOutputStream;
        java.io.File parentFile = w0Var.f419520d.getParentFile();
        java.io.File file = w0Var.f419520d;
        java.lang.String name = file.getName();
        java.io.File file2 = new java.io.File(parentFile, name.substring(0, name.indexOf(".hprof")) + "_shrink.hprof");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dump_result_");
        sb6.append(android.os.Process.myPid());
        java.io.File file3 = new java.io.File(parentFile, sb6.toString() + '_' + new java.text.SimpleDateFormat("yyyyMMddHHmmss", java.util.Locale.ENGLISH).format(new java.util.Date()) + ".zip");
        try {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            new yi.g().a(file, file2);
            oj.j.c("Matrix.CanaryWorkerService", "shrink hprof file %s, size: %dk to %s, size: %dk, use time:%d", file.getPath(), java.lang.Long.valueOf(file.length() / 1024), file2.getPath(), java.lang.Long.valueOf(file2.length() / 1024), java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
            java.util.zip.ZipOutputStream zipOutputStream2 = new java.util.zip.ZipOutputStream(new java.io.BufferedOutputStream(new java.io.FileOutputStream(file3)));
            try {
                java.util.zip.ZipEntry zipEntry = new java.util.zip.ZipEntry("result.info");
                java.util.zip.ZipEntry zipEntry2 = new java.util.zip.ZipEntry(file2.getName());
                zipOutputStream2.putNextEntry(zipEntry);
                java.io.PrintWriter printWriter = new java.io.PrintWriter(new java.io.OutputStreamWriter(zipOutputStream2, java.nio.charset.Charset.forName(com.tencent.mapsdk.internal.rv.f51270c)));
                printWriter.println("# Resource Canary Result Infomation. THIS FILE IS IMPORTANT FOR THE ANALYZER !!");
                printWriter.println("sdkVersion=" + android.os.Build.VERSION.SDK_INT);
                printWriter.println("manufacturer=" + ((com.tencent.matrix.resource.x) ih.d.d().a(com.tencent.matrix.resource.x.class)).f53000h.f446128d);
                printWriter.println("hprofEntry=" + zipEntry2.getName());
                printWriter.println("leakedActivityKey=" + w0Var.f419521e);
                printWriter.flush();
                zipOutputStream2.closeEntry();
                zipOutputStream2.putNextEntry(zipEntry2);
                vi.c.b(file2, zipOutputStream2);
                zipOutputStream2.closeEntry();
                file2.delete();
                file.delete();
                oj.j.c("Matrix.CanaryWorkerService", "process hprof file use total time:%d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
                try {
                    com.tencent.matrix.resource.CanaryResultService.f(this, file3.getAbsolutePath(), w0Var.f419522f);
                    vi.c.a(zipOutputStream2);
                } catch (java.io.IOException e17) {
                    e = e17;
                    zipOutputStream = zipOutputStream2;
                    try {
                        oj.j.d("Matrix.CanaryWorkerService", e, "", new java.lang.Object[0]);
                        vi.c.a(zipOutputStream);
                    } catch (java.lang.Throwable th6) {
                        th = th6;
                        vi.c.a(zipOutputStream);
                        throw th;
                    }
                } catch (java.lang.Throwable th7) {
                    th = th7;
                    zipOutputStream = zipOutputStream2;
                    vi.c.a(zipOutputStream);
                    throw th;
                }
            } catch (java.io.IOException e18) {
                e = e18;
            } catch (java.lang.Throwable th8) {
                th = th8;
            }
        } catch (java.io.IOException e19) {
            e = e19;
            zipOutputStream = null;
        } catch (java.lang.Throwable th9) {
            th = th9;
            zipOutputStream = null;
        }
    }
}
