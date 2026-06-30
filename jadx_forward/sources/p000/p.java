package p000;

/* loaded from: classes5.dex */
public final class p implements com.p314xaae8f345.mm.p947xba6de98f.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f431865a;

    public p(java.lang.ref.WeakReference weakReference) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakReference, "weakReference");
        this.f431865a = weakReference;
    }

    @Override // com.p314xaae8f345.mm.p947xba6de98f.q0
    public void a(com.p314xaae8f345.mm.p947xba6de98f.n1 event) {
        java.lang.ref.WeakReference weakReference;
        com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c c4001x1040777c;
        dn.g gVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasTemplateCdnManager", "event " + event + ' ');
        p000.t tVar = (p000.t) this.f431865a.get();
        if (tVar == null || (weakReference = tVar.f495787d) == null || (c4001x1040777c = (com.p314xaae8f345.p457x3304c6.p461x3a6d265.C4001x1040777c) weakReference.get()) == null) {
            return;
        }
        java.lang.Object obj = tVar.f495786c;
        java.util.HashMap hashMap = tVar.f495785b;
        java.lang.String str = event.f152637b;
        java.lang.String str2 = (java.lang.String) hashMap.get(str);
        if (str2 == null) {
            return;
        }
        int ordinal = event.f152636a.ordinal();
        if (ordinal == 0) {
            int m33752x130a215f = com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b.MaasEC.NetworkFailed.m33752x130a215f();
            dn.h hVar = event.f152641f;
            c4001x1040777c.a(str2, new com.p314xaae8f345.p457x3304c6.p470x35bb6d35.p471x2e06d1.C4093x6b88526b(m33752x130a215f, java.lang.String.valueOf(hVar != null ? java.lang.Integer.valueOf(hVar.f69553xb5f54fe9) : null)));
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("cdn client id:");
            sb6.append(str);
            sb6.append(" sceneResult.retCode:");
            dn.h hVar2 = event.f152641f;
            sb6.append(hVar2 != null ? java.lang.Integer.valueOf(hVar2.f69553xb5f54fe9) : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MaasTemplateCdnManager", sb6.toString());
            synchronized (tVar.f495786c) {
                if (tVar.f495785b.containsKey(str)) {
                    tVar.f495785b.remove(str);
                }
            }
            tVar.f();
            return;
        }
        if (ordinal == 1) {
            c4001x1040777c.c(str2);
            synchronized (tVar.f495786c) {
                if (tVar.f495785b.containsKey(str)) {
                    tVar.f495785b.remove(str);
                }
            }
            tVar.f();
            return;
        }
        if (ordinal == 2 && (gVar = event.f152640e) != null) {
            synchronized (obj) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MaasTemplateCdnManager", "field_finishedLength:" + gVar.f69496x83ec3dd + " field_toltalLength:" + gVar.f69500x8ab84c59);
                java.lang.String str3 = (java.lang.String) hashMap.get(str);
                if (str3 != null) {
                    c4001x1040777c.b(str3, gVar.f69496x83ec3dd, gVar.f69500x8ab84c59, 0.0f, 0.0f);
                }
            }
        }
    }
}
