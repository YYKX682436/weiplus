package com.tencent.mm.modelimage.loader.impr;

/* loaded from: classes12.dex */
public class h implements p11.p {

    /* renamed from: a, reason: collision with root package name */
    public final q11.a f71249a = new q11.a(10);

    public synchronized boolean a(java.lang.String str) {
        boolean k17;
        q11.a aVar = this.f71249a;
        synchronized (aVar) {
            kk.j jVar = aVar.f359530a;
            if (jVar == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            k17 = ((lt0.f) jVar).k(str);
        }
        if (k17) {
            kk.j jVar2 = this.f71249a.f359530a;
            if (jVar2 == null) {
                throw new java.lang.NullPointerException("mData == null");
            }
            int intValue = ((java.lang.Integer) ((lt0.f) jVar2).get(str)).intValue();
            this.f71249a.a(str, java.lang.Integer.valueOf(intValue + 1));
            if (intValue >= 50) {
                if (intValue == 50 || intValue % 500 == 0) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.imageloader.DefaultImageRetryDownloadListener", "Url %s retry over time %d current time:%d, then stop retry download", str, 50, java.lang.Integer.valueOf(intValue));
                }
                return false;
            }
        } else {
            this.f71249a.a(str, 1);
        }
        return true;
    }
}
