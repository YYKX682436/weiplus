package com.tencent.mm.plugin.appbrand.keylogger;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84143d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f84144e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f84145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.keylogger.f0 f84146g;

    public c0(com.tencent.mm.plugin.appbrand.keylogger.f0 f0Var, java.lang.String str, java.lang.Object[] objArr, java.lang.String str2) {
        this.f84146g = f0Var;
        this.f84143d = str;
        this.f84144e = objArr;
        this.f84145f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.BufferedWriter bufferedWriter;
        java.lang.String format = java.lang.String.format(this.f84143d, this.f84144e);
        com.tencent.mm.plugin.appbrand.keylogger.f0 f0Var = this.f84146g;
        f0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String d17 = f0Var.d(currentTimeMillis);
        java.io.BufferedWriter bufferedWriter2 = null;
        java.lang.String format2 = com.tencent.mm.sdk.platformtools.t8.K0(d17) ? null : java.lang.String.format("%s%s_%s_%s.keylog", d17, this.f84145f, com.tencent.mm.plugin.appbrand.keylogger.f0.f84150a.format(java.lang.Long.valueOf(currentTimeMillis)), bm5.f1.a());
        if (com.tencent.mm.sdk.platformtools.t8.K0(format2)) {
            return;
        }
        try {
            try {
                try {
                    bufferedWriter = new java.io.BufferedWriter(new com.tencent.mm.vfs.a7(format2, true));
                } catch (java.io.IOException unused) {
                    return;
                }
            } catch (java.io.IOException e17) {
                e = e17;
            }
        } catch (java.lang.Throwable th6) {
            th = th6;
            bufferedWriter = bufferedWriter2;
        }
        try {
            bufferedWriter.write(format);
            bufferedWriter.newLine();
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (java.io.IOException e18) {
            e = e18;
            bufferedWriter2 = bufferedWriter;
            com.tencent.mars.xlog.Log.w("MicroMsg.DefaultKeyStepLogger", "appendLog exp:%s", e.getLocalizedMessage());
            if (bufferedWriter2 != null) {
                bufferedWriter2.close();
            }
        } catch (java.lang.Throwable th7) {
            th = th7;
            if (bufferedWriter != null) {
                try {
                    bufferedWriter.close();
                } catch (java.io.IOException unused2) {
                }
            }
            throw th;
        }
    }
}
