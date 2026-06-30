package b00;

@j95.b
/* loaded from: classes8.dex */
public final class w2 extends i95.w {

    /* renamed from: d, reason: collision with root package name */
    public final b00.v2 f98318d = new b00.v2();

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p689xc5a27af6.ecs.C10518xc3bf6de2 f98319e;

    /* JADX WARN: Type inference failed for: r1v0, types: [com.tencent.mm.feature.ecs.PluginEcs$notifyEntranceListener$1] */
    public w2() {
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f98319e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5214x664d29b2>(a0Var) { // from class: com.tencent.mm.feature.ecs.PluginEcs$notifyEntranceListener$1
            {
                this.f39173x3fe91575 = 1178720674;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5214x664d29b2 c5214x664d29b2) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5214x664d29b2 event = c5214x664d29b2;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                h00.h.a(h00.h.f359353a, 3, null, 2, null);
                return true;
            }
        };
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        java.util.concurrent.CopyOnWriteArraySet N0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginEcs", "onAccountInitialized");
        super.mo204xfac946a6(context);
        this.f98318d.m43071x58998cd();
        mo48813x58998cd();
        h00.h.a(h00.h.f359353a, 2, null, 2, null);
        b00.j0 j0Var = b00.j0.f98226a;
        b00.j0.f98227b = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_ecs_me_reddot_revoke_when_reddot_replace_android, 1) == 1;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("EcsRedDotMgr", "onAccountInitialized enableRevokeMeRedDot=" + b00.j0.f98227b);
        if (b00.j0.f98227b && (N0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0()) != null) {
            N0.add((b00.h0) ((jz5.n) b00.j0.f98228c).mo141623x754a37bb());
        }
        g20.g gVar = (g20.g) ((c00.x3) i95.n0.c(c00.x3.class));
        ((com.p314xaae8f345.mm.sdk.p2603x2137b148.n3) ((jz5.n) gVar.f349307e).mo141623x754a37bb()).mo50293x3498a0(new g20.c(gVar));
    }

    @Override // i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        java.util.concurrent.CopyOnWriteArraySet N0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PluginEcs", "onAccountReleased");
        this.f98318d.m43072x2efc64();
        mo48814x2efc64();
        b00.j0 j0Var = b00.j0.f98226a;
        if (b00.j0.f98227b && (N0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().N0()) != null) {
            N0.remove((b00.h0) ((jz5.n) b00.j0.f98228c).mo141623x754a37bb());
        }
        android.util.LruCache lruCache = y00.h.f540060a;
        int size = lruCache.size();
        lruCache.evictAll();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EcsKfProductCardMemCache", "clear: talkers=%d", java.lang.Integer.valueOf(size));
    }
}
