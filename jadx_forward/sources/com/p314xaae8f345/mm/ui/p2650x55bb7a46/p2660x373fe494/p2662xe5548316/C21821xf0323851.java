package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2662xe5548316;

/* renamed from: com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC */
/* loaded from: classes10.dex */
public final class C21821xf0323851 extends wm3.a {

    /* renamed from: d, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f283276d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2662xe5548316.C21822x573b98c8 f283277e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC$previewExitEventListener$1] */
    public C21821xf0323851(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 baseActivity) {
        super(baseActivity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(baseActivity, "baseActivity");
        this.f283276d = baseActivity;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        this.f283277e = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5711xb2c0933>(a0Var) { // from class: com.tencent.mm.ui.chatting.history.components.MsgHistoryGalleryPreviewTransitionUIC$previewExitEventListener$1
            {
                this.f39173x3fe91575 = -801824477;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5711xb2c0933 c5711xb2c0933) {
                android.view.View mo7935xa188593e;
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5711xb2c0933 event = c5711xb2c0933;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
                android.view.LayoutInflater.Factory factory = com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.p2662xe5548316.C21821xf0323851.this.f283276d;
                uc5.r rVar = factory instanceof uc5.r ? (uc5.r) factory : null;
                if (rVar == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryPreviewTransitionUIC", "controller is null");
                    return false;
                }
                com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3 activityC21814x1938a8b3 = (com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2660x373fe494.ActivityC21814x1938a8b3) rVar;
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = activityC21814x1938a8b3.m7().mo7946xf939df19();
                xm3.t0 t0Var = mo7946xf939df19 instanceof xm3.t0 ? (xm3.t0) mo7946xf939df19 : null;
                if (t0Var == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryPreviewTransitionUIC", "adapter is null");
                    return false;
                }
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = activityC21814x1938a8b3.m7().getLayoutManager();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d c1161x57298f5d = layoutManager instanceof p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d ? (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d) layoutManager : null;
                if (c1161x57298f5d == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHistoryGalleryPreviewTransitionUIC", "layoutManager is null");
                    return false;
                }
                long j17 = event.f136031g.f89731a;
                int w17 = c1161x57298f5d.w();
                int y17 = c1161x57298f5d.y();
                java.util.List m82898xfb7e5820 = t0Var.m82898xfb7e5820();
                java.util.Iterator it = new e06.k(w17, y17).iterator();
                while (((e06.j) it).hasNext()) {
                    int b17 = ((kz5.x0) it).b();
                    java.lang.Object a07 = kz5.n0.a0(m82898xfb7e5820, b17);
                    uc5.h0 h0Var = a07 instanceof uc5.h0 ? (uc5.h0) a07 : null;
                    if (h0Var != null) {
                        uc5.d dVar = h0Var.f508027d;
                        uc5.d dVar2 = dVar instanceof dd5.n1 ? (dd5.n1) dVar : null;
                        if (dVar2 == null) {
                            dVar2 = dVar instanceof dd5.d3 ? (dd5.d3) dVar : null;
                            if (dVar2 != null) {
                            }
                        }
                        if (dVar2.p().m124847x74d37ac6() == j17 && (mo7935xa188593e = c1161x57298f5d.mo7935xa188593e(b17)) != null) {
                            int[] iArr = new int[2];
                            mo7935xa188593e.getLocationOnScreen(iArr);
                            int i17 = iArr[0];
                            am.wj wjVar = event.f136032h;
                            wjVar.f89821a = i17;
                            wjVar.f89822b = iArr[1];
                            wjVar.f89823c = mo7935xa188593e.getWidth();
                            wjVar.f89824d = mo7935xa188593e.getHeight();
                        }
                    }
                }
                return true;
            }
        };
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStart */
    public void mo2286xb05099c3() {
        super.mo2286xb05099c3();
        mo48813x58998cd();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onStop */
    public void mo2287xc39f8281() {
        super.mo2287xc39f8281();
        mo48814x2efc64();
    }
}
