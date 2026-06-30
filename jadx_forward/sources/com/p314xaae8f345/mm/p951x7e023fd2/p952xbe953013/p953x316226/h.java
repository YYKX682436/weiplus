package com.p314xaae8f345.mm.p951x7e023fd2.p952xbe953013.p953x316226;

/* loaded from: classes12.dex */
public class h implements p11.p {

    /* renamed from: a, reason: collision with root package name */
    public final q11.a f152782a = new q11.a(10);

    public synchronized boolean a(java.lang.String str) {
        boolean k17;
        q11.a aVar = this.f152782a;
        synchronized (aVar) {
            kk.j jVar = aVar.f441063a;
            if (jVar == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            k17 = ((lt0.f) jVar).k(str);
        }
        if (k17) {
            kk.j jVar2 = this.f152782a.f441063a;
            if (jVar2 == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            int intValue = ((java.lang.Integer) ((lt0.f) jVar2).get(str)).intValue();
            this.f152782a.a(str, java.lang.Integer.valueOf(intValue + 1));
            if (intValue >= 50) {
                if (intValue == 50 || intValue % 500 == 0) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.imageloader.DefaultImageRetryDownloadListener", "Url %s retry over time %d current time:%d, then stop retry download", str, 50, java.lang.Integer.valueOf(intValue));
                }
                return false;
            }
        } else {
            this.f152782a.a(str, 1);
        }
        return true;
    }
}
