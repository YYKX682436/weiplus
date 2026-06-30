package im2;

/* loaded from: classes3.dex */
public final class l extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd f373952d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ng2.g f373953e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ig2.n f373954f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c f373955g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd, ng2.g gVar, ig2.n nVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c c14221x14e9402c) {
        super(0);
        this.f373952d = c14380x23078afd;
        this.f373953e = gVar;
        this.f373954f = nVar;
        this.f373955g = c14221x14e9402c;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        fm2.c cVar;
        co0.s m129740xd052bc21;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14380x23078afd c14380x23078afd = this.f373952d;
        java.lang.String str = c14380x23078afd.f198514d;
        ng2.g gVar = this.f373953e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1498x9da2e250.C14221x14e9402c fragment = this.f373955g;
        if (fragment != null) {
            ig2.n nVar = this.f373954f;
            if (nVar.f372942h != null) {
                ok2.a Q6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).Q6();
                fo0.n nVar2 = (Q6 == null || (cVar = ((um2.x5) Q6).f101139c) == null || (m129740xd052bc21 = cVar.m129740xd052bc21()) == null) ? null : m129740xd052bc21.f502300p;
                if (nVar2 != null) {
                    android.view.View view = nVar2.f346360n;
                    if (view instanceof mo0.a) {
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(view, "null cannot be cast to non-null type com.tencent.mm.live.core.view.FluentSwitchRelativeLayout");
                        mo0.a aVar = (mo0.a) view;
                        com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf = new com.p314xaae8f345.p2926x359365.ui.ScaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
                        aVar.addView(scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf);
                        mn0.b0 b0Var = nVar.f372942h;
                        if (b0Var != null) {
                            ((mn0.y) b0Var).Q(0);
                        }
                        mn0.b0 b0Var2 = nVar.f372942h;
                        if (b0Var2 != null) {
                            mn0.b0.B(b0Var2, scaleGestureDetectorOnScaleGestureListenerC25492x39be9aaf, null, 2, null);
                        }
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "attachToWindow visibility : " + aVar.getVisibility() + ", player:" + nVar.f372942h);
                        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                        aVar.m148144xf8bfd6b5(new im2.c(c14380x23078afd, c0Var, gVar, aVar));
                        pm0.v.V(150L, new im2.d(c14380x23078afd, c0Var, gVar));
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).U6();
                        ig2.m.f372930e = true;
                        c14380x23078afd.P6("onWindowExit");
                        return jz5.f0.f384359a;
                    }
                }
                gVar.a();
                ig2.m.f372926a.d();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).U6();
                ig2.m.f372930e = true;
                c14380x23078afd.P6("onWindowExit");
                return jz5.f0.f384359a;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(str, "start attachToWindow data = null");
        gVar.a();
        ig2.m.f372926a.d();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fragment, "fragment");
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3) pf5.z.f435481a.b(fragment).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.p1540xac8f1cfd.C14385xe1b728f3.class)).U6();
        ig2.m.f372930e = true;
        c14380x23078afd.P6("onWindowExit");
        return jz5.f0.f384359a;
    }
}
