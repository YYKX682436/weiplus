package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zab implements java.lang.Runnable {
    final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 zaa;
    private final com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zab;

    public zab(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f2, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar) {
        this.zaa = c1893x5f3d25f2;
        this.zab = zagVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.util.Map map;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zam zamVar;
        java.util.Map map2;
        java.util.Map map3;
        java.lang.Object obj;
        java.util.HashSet hashSet;
        java.util.HashSet hashSet2;
        java.util.Map map4;
        java.util.Map map5;
        java.util.Map map6;
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p227x2e06d1.zam zamVar2;
        java.util.Map map7;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1899x39368dcd.m18079x6483284b("LoadImageRunnable must be executed on the main thread");
        map = this.zaa.zah;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver imageReceiver = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver) map.get(this.zab);
        if (imageReceiver != null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f2 = this.zaa;
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar = this.zab;
            map7 = c1893x5f3d25f2.zah;
            map7.remove(zagVar);
            imageReceiver.zac(this.zab);
        }
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar2 = this.zab;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zad zadVar = zagVar2.zaa;
        android.net.Uri uri = zadVar.zaa;
        if (uri == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f22 = this.zaa;
            android.content.Context context = c1893x5f3d25f22.zad;
            zamVar = c1893x5f3d25f22.zag;
            zagVar2.zab(context, zamVar, true);
            return;
        }
        map2 = this.zaa.zaj;
        java.lang.Long l17 = (java.lang.Long) map2.get(uri);
        if (l17 != null) {
            if (android.os.SystemClock.elapsedRealtime() - l17.longValue() < 3600000) {
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar3 = this.zab;
                com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f23 = this.zaa;
                android.content.Context context2 = c1893x5f3d25f23.zad;
                zamVar2 = c1893x5f3d25f23.zag;
                zagVar3.zab(context2, zamVar2, true);
                return;
            }
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f24 = this.zaa;
            android.net.Uri uri2 = zadVar.zaa;
            map6 = c1893x5f3d25f24.zaj;
            map6.remove(uri2);
        }
        this.zab.zaa(null, false, true, false);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f25 = this.zaa;
        android.net.Uri uri3 = zadVar.zaa;
        map3 = c1893x5f3d25f25.zai;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver imageReceiver2 = (com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver) map3.get(uri3);
        if (imageReceiver2 == null) {
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver imageReceiver3 = new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.ImageReceiver(zadVar.zaa);
            com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2 c1893x5f3d25f26 = this.zaa;
            android.net.Uri uri4 = zadVar.zaa;
            map5 = c1893x5f3d25f26.zai;
            map5.put(uri4, imageReceiver3);
            imageReceiver2 = imageReceiver3;
        }
        imageReceiver2.zab(this.zab);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zag zagVar4 = this.zab;
        if (!(zagVar4 instanceof com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.zaf)) {
            map4 = this.zaa.zah;
            map4.put(zagVar4, imageReceiver2);
        }
        obj = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.zaa;
        synchronized (obj) {
            hashSet = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.zab;
            if (!hashSet.contains(zadVar.zaa)) {
                hashSet2 = com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p204xb95a8278.C1893x5f3d25f2.zab;
                hashSet2.add(zadVar.zaa);
                imageReceiver2.zad();
            }
        }
    }
}
