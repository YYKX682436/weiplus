package al4;

/* loaded from: classes11.dex */
public final class c extends com.p314xaae8f345.p3118xeeebfacc.AbstractC26825x3e3f5190 implements jm4.g2 {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.CopyOnWriteArraySet f87392d = new java.util.concurrent.CopyOnWriteArraySet();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p2284x3652ee.p2290x822d9a5b.C18714x68753021 f87393e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.plugin.ting.floatball.TingMinimizeManagerJava$floatballEventListener$1] */
    public c() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f87393e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6169x1d2189d9>(a0Var) { // from class: com.tencent.mm.plugin.ting.floatball.TingMinimizeManagerJava$floatballEventListener$1
            {
                this.f39173x3fe91575 = 1371600873;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6169x1d2189d9 c6169x1d2189d9) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C6169x1d2189d9 event = c6169x1d2189d9;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                java.util.Iterator it = al4.c.this.f87392d.iterator();
                while (it.hasNext()) {
                    jm4.e2 e2Var = (jm4.e2) it.next();
                    p3380x6a61f93.p3381xf512d0a5.C30515x21ba3116.m169512x21b9bf91(((jm4.f2) e2Var).m105978x2737f10(), event.f136429g.f87826a);
                }
                return false;
            }
        };
    }
}
