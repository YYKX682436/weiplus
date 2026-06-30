package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd;

/* loaded from: classes15.dex */
public final class ja implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 f216371d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ka f216372e;

    public ja(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ka kaVar) {
        this.f216371d = c15449xa84711;
        this.f216372e = kaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.C15449xa84711 c15449xa84711 = this.f216371d;
        p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 m158358x197d1fc6 = c15449xa84711.m158358x197d1fc6();
        if ((m158358x197d1fc6 != null && m158358x197d1fc6.m7482xefa32bc()) || c15449xa84711.m158354x19263085().isDestroyed() || c15449xa84711.m158354x19263085().isFinishing()) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderEmojiListUIC", "[updateState] state=" + c15449xa84711.Q6().f188932e + " cachedState=" + c15449xa84711.Q6().f188933f);
        android.widget.FrameLayout frameLayout = c15449xa84711.f215069e;
        if (frameLayout == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stateLayout");
            throw null;
        }
        frameLayout.setOnClickListener(null);
        frameLayout.setVisibility(8);
        if (c15449xa84711.Q6().f188933f == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p0.f189771e) {
            int ordinal = c15449xa84711.Q6().f188932e.ordinal();
            if (ordinal == 1) {
                android.widget.FrameLayout frameLayout2 = c15449xa84711.f215069e;
                if (frameLayout2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stateLayout");
                    throw null;
                }
                frameLayout2.setVisibility(0);
                c15449xa84711.S6().f516171f.setVisibility(8);
                c15449xa84711.S6().f516172g.setVisibility(8);
                c15449xa84711.S6().f516170e.setVisibility(0);
                return;
            }
            if (ordinal == 2) {
                android.widget.FrameLayout frameLayout3 = c15449xa84711.f215069e;
                if (frameLayout3 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stateLayout");
                    throw null;
                }
                frameLayout3.setVisibility(0);
                c15449xa84711.S6().f516171f.setVisibility(0);
                c15449xa84711.S6().f516172g.setVisibility(8);
                c15449xa84711.S6().f516170e.setVisibility(8);
                return;
            }
            if (ordinal != 3) {
                return;
            }
            android.widget.FrameLayout frameLayout4 = c15449xa84711.f215069e;
            if (frameLayout4 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("stateLayout");
                throw null;
            }
            frameLayout4.setVisibility(0);
            c15449xa84711.S6().f516171f.setVisibility(8);
            c15449xa84711.S6().f516172g.setVisibility(0);
            c15449xa84711.S6().f516170e.setVisibility(8);
            frameLayout4.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ia(this.f216372e));
        }
    }
}
