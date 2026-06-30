package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af;

/* loaded from: classes7.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165676d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object[] f165677e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f165678f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0 f165679g;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0 f0Var, java.lang.String str, java.lang.Object[] objArr, java.lang.String str2) {
        this.f165679g = f0Var;
        this.f165676d = str;
        this.f165677e = objArr;
        this.f165678f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.io.BufferedWriter bufferedWriter;
        java.lang.String format = java.lang.String.format(this.f165676d, this.f165677e);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0 f0Var = this.f165679g;
        f0Var.getClass();
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.lang.String d17 = f0Var.d(currentTimeMillis);
        java.io.BufferedWriter bufferedWriter2 = null;
        java.lang.String format2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(d17) ? null : java.lang.String.format("%s%s_%s_%s.keylog", d17, this.f165678f, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1132xb3db10af.f0.f165683a.format(java.lang.Long.valueOf(currentTimeMillis)), bm5.f1.a());
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(format2)) {
            return;
        }
        try {
            try {
                try {
                    bufferedWriter = new java.io.BufferedWriter(new com.p314xaae8f345.mm.vfs.a7(format2, true));
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
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.DefaultKeyStepLogger", "appendLog exp:%s", e.getLocalizedMessage());
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
