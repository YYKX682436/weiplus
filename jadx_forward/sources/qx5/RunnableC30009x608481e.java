package qx5;

/* renamed from: qx5.l0$$b */
/* loaded from: classes13.dex */
public final /* synthetic */ class RunnableC30009x608481e implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f449035d;

    @Override // java.lang.Runnable
    public final void run() {
        java.io.File file;
        java.io.File[] listFiles;
        java.lang.String str = this.f449035d;
        if (!android.text.TextUtils.isEmpty(str)) {
            java.lang.String str2 = (java.lang.String) tx5.j.d(80038, new java.lang.Object[0]);
            if (!android.text.TextUtils.isEmpty(str2) && (listFiles = new java.io.File(str2).listFiles()) != null) {
                int length = listFiles.length;
                for (int i17 = 0; i17 < length; i17++) {
                    file = listFiles[i17];
                    if (file.getName().equals(str)) {
                        break;
                    }
                }
            }
        }
        file = null;
        if (file == null || !file.exists()) {
            by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Can't find file: " + str);
            return;
        }
        by5.c4.f("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Start save file: " + file.getAbsolutePath());
        try {
            java.io.File externalStoragePublicDirectory = android.os.Environment.getExternalStoragePublicDirectory(android.os.Environment.DIRECTORY_DOWNLOADS);
            if (!externalStoragePublicDirectory.exists()) {
                externalStoragePublicDirectory.mkdirs();
            }
            java.io.File file2 = new java.io.File(externalStoragePublicDirectory, str);
            if (!file2.exists()) {
                file2.createNewFile();
            }
            boolean d17 = by5.u.d(file.getAbsolutePath(), file2.getAbsolutePath());
            by5.c4.f("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Save file result:" + d17);
            if (!d17) {
                yu5.c.b(new qx5.RunnableC30012x6084821("保存文件至下载文件夹失败"));
                return;
            }
            final java.lang.String absolutePath = externalStoragePublicDirectory.getAbsolutePath();
            yu5.c.b(new java.lang.Runnable() { // from class: qx5.l0$$d
                @Override // java.lang.Runnable
                public final void run() {
                    android.content.Intent intent = new android.content.Intent("android.intent.action.VIEW");
                    intent.setDataAndType(android.net.Uri.parse(absolutePath), "vnd.android.document/directory");
                    intent.setFlags(268435456);
                    android.content.Context context = org.p3374x6d29641.p3375x2eaf9f.C29937xdd907d12.f429503c;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/xweb/debug/XWebTraceFileListPreference", "lambda$openDocumentApp$3", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/xweb/debug/XWebTraceFileListPreference", "lambda$openDocumentApp$3", "(Ljava/lang/String;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                }
            });
            file.delete();
        } catch (java.lang.Exception unused) {
            by5.c4.c("XWebTraceFileListPreference", "[XWEB_RECORD_TRACE] Save file failed");
            yu5.c.b(new qx5.RunnableC30012x6084821("保存文件至下载文件夹失败"));
        }
    }
}
