package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class cj implements com.tencent.mm.plugin.finder.view.ka {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.convert.oj f103060d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.en2 f103061e;

    public cj(com.tencent.mm.plugin.finder.convert.oj ojVar, r45.en2 en2Var) {
        this.f103060d = ojVar;
        this.f103061e = en2Var;
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void G3(int i17, int i18, int i19, int i27) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void l(int i17, int i18, int i19, int i27) {
        cw2.da daVar;
        java.lang.String str;
        so2.n1 n1Var;
        com.tencent.mm.plugin.finder.convert.oj ojVar = this.f103060d;
        com.tencent.mm.plugin.finder.feed.k8 k8Var = ojVar.f104184f;
        com.tencent.mm.plugin.finder.feed.pz pzVar = k8Var instanceof com.tencent.mm.plugin.finder.feed.pz ? (com.tencent.mm.plugin.finder.feed.pz) k8Var : null;
        java.lang.Integer valueOf = pzVar != null ? java.lang.Integer.valueOf(pzVar.f108762p) : null;
        java.lang.Object obj = ojVar.C;
        java.lang.Object tag = obj != null ? ((android.view.View) obj).getTag() : null;
        com.tencent.mm.plugin.finder.convert.gi giVar = tag instanceof com.tencent.mm.plugin.finder.convert.gi ? (com.tencent.mm.plugin.finder.convert.gi) tag : null;
        java.lang.Integer valueOf2 = giVar != null ? java.lang.Integer.valueOf(giVar.f103491d) : null;
        java.lang.String str2 = ojVar.f104186h;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onFragmentChange placeHold type=");
        r45.en2 en2Var = this.f103061e;
        sb6.append(en2Var.getInteger(2));
        sb6.append(" from=");
        sb6.append(i17);
        sb6.append(" to=");
        sb6.append(i18);
        sb6.append(",fromType=");
        sb6.append(i19);
        sb6.append(" toType=");
        sb6.append(i27);
        sb6.append(",presentTabType=");
        sb6.append(valueOf);
        sb6.append(",targetTabType=");
        sb6.append(valueOf2);
        com.tencent.mars.xlog.Log.i(str2, sb6.toString());
        int integer = en2Var.getInteger(2);
        if (integer == 2 || integer == 6) {
            if (valueOf2 != null && i27 == valueOf2.intValue()) {
                java.lang.Object obj2 = ojVar.C;
                java.lang.Object tag2 = obj2 != null ? ((android.view.View) obj2).getTag() : null;
                com.tencent.mm.plugin.finder.convert.gi giVar2 = tag2 instanceof com.tencent.mm.plugin.finder.convert.gi ? (com.tencent.mm.plugin.finder.convert.gi) tag2 : null;
                if (giVar2 == null || (n1Var = giVar2.f103488a) == null) {
                    com.tencent.mars.xlog.Log.e(ojVar.f104186h, "removeItem " + en2Var.getInteger(2) + " but holderFeed is null!");
                    cw2.da daVar2 = ojVar.C;
                    if (daVar2 != null) {
                        ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar2).pause();
                    }
                } else {
                    ojVar.B(en2Var.getInteger(2) + "_onFragmentChange", n1Var, com.tencent.mm.plugin.finder.convert.fi.f103383e);
                    ojVar.A();
                }
            } else if ((valueOf == null || i27 != valueOf.intValue()) && (daVar = ojVar.C) != null) {
                ((com.tencent.mm.plugin.finder.video.FinderThumbPlayerProxy) daVar).pause();
            }
            java.util.Map map = ojVar.f104200y;
            if (map != null) {
                com.tencent.mm.ui.MMActivity context = ojVar.f104184f.getF122643d();
                kotlin.jvm.internal.o.g(context, "context");
                com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
                r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
                if (V6 == null || (str = V6.getString(2)) == null) {
                    str = "";
                }
                map.put("finder_tab_context_id", str);
                ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Bj("lead_to_rec_card", "view_clk", map, 1, false);
            }
            ojVar.f104200y = null;
        }
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void onPageScrolled(int i17, float f17, int i18) {
    }

    @Override // com.tencent.mm.plugin.finder.view.ka
    public void z(boolean z17, int i17, com.tencent.mm.plugin.finder.ui.fragment.FinderHomeTabFragment fragment) {
        kotlin.jvm.internal.o.g(fragment, "fragment");
    }
}
