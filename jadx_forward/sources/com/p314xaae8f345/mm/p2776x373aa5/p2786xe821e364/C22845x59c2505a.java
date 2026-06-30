package com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/tencent/mm/view/recyclerview/ObservableGridLayoutManager;", "Lcom/tencent/mm/view/recyclerview/WxGridLayoutManager;", "in5/t", "libmmui_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.view.recyclerview.ObservableGridLayoutManager */
/* loaded from: classes10.dex */
public class C22845x59c2505a extends com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22846x6072c67c {
    public in5.t D;

    @Override // com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22846x6072c67c, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutChildren */
    public void mo2418x457c9b08(p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        in5.t tVar = this.D;
        if (tVar != null) {
            i33.y0 y0Var = ((i33.v0) tVar).f369814a;
            i33.t0 t0Var = (i33.t0) ((jz5.n) y0Var.f369825h).mo141623x754a37bb();
            if (t0Var != null ? t0Var.f369781g : false) {
                y0Var.W6();
                p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = y0Var.T6().mo7946xf939df19();
                e33.b0 b0Var = mo7946xf939df19 instanceof e33.b0 ? (e33.b0) mo7946xf939df19 : null;
                if (b0Var != null) {
                    b0Var.f328679y = true;
                }
            }
        }
        super.mo2418x457c9b08(z2Var, h3Var);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: onLayoutCompleted */
    public void mo7921x1c165a62(p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        super.mo7921x1c165a62(h3Var);
        in5.t tVar = this.D;
        if (tVar != null) {
            i33.y0 y0Var = ((i33.v0) tVar).f369814a;
            java.lang.String str = y0Var.f369823f;
            y0Var.X6(0L);
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.C1161x57298f5d, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de, p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager
    /* renamed from: scrollVerticallyBy */
    public int mo7922xd8d712a7(int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.z2 z2Var, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 h3Var) {
        return super.mo7922xd8d712a7(i17, z2Var, h3Var);
    }
}
