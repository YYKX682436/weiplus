package cy2;

/* loaded from: classes3.dex */
public final class f implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1678x73503397.C15439x83466e9c f306279d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1678x73503397.C15439x83466e9c c15439x83466e9c) {
        this.f306279d = c15439x83466e9c;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i17 = cy2.b.f306274a;
        gm0.j1.u().c().x(com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_WHATS_NEW_SHOWN_BOOLEAN_SYNC, java.lang.Boolean.TRUE);
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(1305L, 0L, 1L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1678x73503397.C15439x83466e9c c15439x83466e9c = this.f306279d;
        if (c15439x83466e9c.withEnterAnim) {
            c15439x83466e9c.setTranslationX(c15439x83466e9c.getHeight());
            c15439x83466e9c.animate().translationY(0.0f).setDuration(200L).setListener(new cy2.g(c15439x83466e9c)).start();
        }
    }
}
