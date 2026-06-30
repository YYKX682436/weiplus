package gq2;

/* loaded from: classes2.dex */
public final class g extends fq2.b {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gq2.d f356090g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ gq2.j f356091h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ hq2.c f356092i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(gq2.d dVar, gq2.j jVar, hq2.c cVar, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf abstractActivityC21394xb3d2c0cf, java.util.LinkedList linkedList) {
        super(abstractActivityC21394xb3d2c0cf, linkedList);
        this.f356090g = dVar;
        this.f356091h = jVar;
        this.f356092i = cVar;
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrollStateChanged */
    public void mo8331xcb2941fe(int i17) {
        lq2.a aVar;
        gq2.j jVar = this.f356091h;
        boolean z17 = jVar.f356099i != i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.AbstractC15290x1a2d74fc.TAG, "onPageScrollStateChanged: state=" + i17 + ", isStateChange=" + z17);
        jVar.f356099i = i17;
        if (z17 && i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 o17 = jVar.o();
            if (o17 != null) {
                lq2.a aVar2 = (lq2.a) pf5.z.f435481a.b(o17).e(lq2.a.class);
                if (aVar2 != null) {
                    boolean z18 = aVar2.f401988e != null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar2.f401987d, "checkTabAutoPlay: source=onScrollStateChange, isInit=" + z18);
                    if (z18) {
                        iq2.d0 d0Var = aVar2.f401988e;
                        if (d0Var == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
                            throw null;
                        }
                        d0Var.d("onScrollStateChange");
                    }
                }
            } else {
                o17 = null;
            }
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1584x260bcaa9.p1590x89bc6776.p1591x9da2e250.C14553xb199db9 c14553xb199db9 : jVar.f356101n) {
                if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(c14553xb199db9, o17) && c14553xb199db9.f203620q && (aVar = (lq2.a) pf5.z.f435481a.b(c14553xb199db9).e(lq2.a.class)) != null) {
                    boolean z19 = aVar.f401988e != null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(aVar.f401987d, "stopTabCurrentView: source=onScrollStateChange, isInit=" + z19);
                    if (z19) {
                        iq2.d0 d0Var2 = aVar.f401988e;
                        if (d0Var2 == null) {
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("liveThemeCallback");
                            throw null;
                        }
                        d0Var2.k("onScrollStateChange", true);
                    } else {
                        continue;
                    }
                }
            }
        }
    }

    @Override // p012xc85e97e9.p114xa324943e.p115xd1075a44.C1190x18d3c3fe.OnPageChangeListener
    /* renamed from: onPageScrolled */
    public void mo8332xf210c75a(int i17, float f17, int i18) {
    }
}
