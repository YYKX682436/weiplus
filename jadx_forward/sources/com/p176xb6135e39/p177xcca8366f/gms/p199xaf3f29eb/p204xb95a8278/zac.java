package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* loaded from: classes13.dex */
final class zac implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 zaa;
    private final android.net.Uri zab;
    private final android.graphics.Bitmap zac;
    private final java.util.concurrent.CountDownLatch zad;

    public zac(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f2, android.net.Uri uri, android.graphics.Bitmap bitmap, boolean z17, java.util.concurrent.CountDownLatch countDownLatch) {
        this.zaa = c1893x5f3d25f2;
        this.zab = uri;
        this.zac = bitmap;
        this.zad = countDownLatch;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        java.lang.Object obj;
        java.util.HashSet hashSet;
        java.util.ArrayList arrayList;
        java.util.Map map2;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zam zamVar;
        java.util.Map map3;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18079x6483284b("OnBitmapLoadedRunnable must be executed in the main thread");
        map = this.zaa.zai;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver imageReceiver = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver) map.remove(this.zab);
        if (imageReceiver != null) {
            arrayList = imageReceiver.zac;
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag) arrayList.get(i17);
                android.graphics.Bitmap bitmap = this.zac;
                if (bitmap != null) {
                    zagVar.zac(this.zaa.zad, bitmap, false);
                } else {
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f2 = this.zaa;
                    android.net.Uri uri = this.zab;
                    map2 = c1893x5f3d25f2.zaj;
                    map2.put(uri, java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime()));
                    com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f22 = this.zaa;
                    android.content.Context context = c1893x5f3d25f22.zad;
                    zamVar = c1893x5f3d25f22.zag;
                    zagVar.zab(context, zamVar, false);
                }
                if (!(zagVar instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf)) {
                    map3 = this.zaa.zah;
                    map3.remove(zagVar);
                }
            }
        }
        this.zad.countDown();
        obj = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.zaa;
        synchronized (obj) {
            hashSet = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.zab;
            hashSet.remove(this.zab);
        }
    }
}
