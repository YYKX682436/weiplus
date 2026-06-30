package bg2;

/* loaded from: classes2.dex */
public final class a4 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f19917d;

    public a4(bg2.h4 h4Var) {
        this.f19917d = h4Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        kotlinx.coroutines.y0 y0Var;
        kotlinx.coroutines.y0 y0Var2;
        com.tencent.mm.plugin.finder.storage.FinderItem feedObject;
        r45.bc2 bc2Var = (r45.bc2) obj;
        if (bc2Var != null) {
            bg2.h4 h4Var = this.f19917d;
            tc2.g gVar = h4Var.f417141d;
            com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = gVar.f417148h;
            kotlinx.coroutines.r2 r2Var = null;
            com.tencent.mm.protocal.protobuf.FinderObject finderObject = (baseFinderFeed == null || (feedObject = baseFinderFeed.getFeedObject()) == null) ? null : feedObject.getFinderObject();
            r45.kr0 d17 = finderObject != null ? com.tencent.mm.plugin.finder.storage.FinderItem.Companion.d(finderObject) : null;
            if (((r45.px3) bc2Var.getCustom(0)) != null) {
                android.view.ViewGroup viewGroup = h4Var.f20135e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                r45.px3 px3Var = (r45.px3) bc2Var.getCustom(0);
                r45.px3 px3Var2 = (r45.px3) bc2Var.getCustom(0);
                r45.pl5 pl5Var = px3Var2 != null ? (r45.pl5) px3Var2.getCustom(4) : null;
                r45.rg6 rg6Var = d17 != null ? (r45.rg6) d17.getCustom(8) : null;
                if (px3Var != null && pl5Var != null && rg6Var != null) {
                    android.view.View view = h4Var.f20136f;
                    kotlinx.coroutines.r2 r2Var2 = h4Var.f20137g;
                    if (r2Var2 != null) {
                        kotlinx.coroutines.p2.a(r2Var2, null, 1, null);
                    }
                    in5.s0 s0Var = gVar.f417149i;
                    if (s0Var != null && (y0Var2 = s0Var.f293120d) != null) {
                        r2Var = kotlinx.coroutines.l.d(y0Var2, null, null, new bg2.g4(rg6Var, h4Var, px3Var, pl5Var, view, null), 3, null);
                    }
                    h4Var.f20137g = r2Var;
                }
            } else if (((r45.wk5) bc2Var.getCustom(1)) != null) {
                android.view.ViewGroup viewGroup2 = h4Var.f20135e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                r45.wk5 wk5Var = (r45.wk5) bc2Var.getCustom(1);
                r45.wk5 wk5Var2 = (r45.wk5) bc2Var.getCustom(1);
                r45.pl5 pl5Var2 = wk5Var2 != null ? (r45.pl5) wk5Var2.getCustom(1) : null;
                r45.rg6 rg6Var2 = d17 != null ? (r45.rg6) d17.getCustom(8) : null;
                if (wk5Var != null && pl5Var2 != null && rg6Var2 != null) {
                    android.view.View view2 = h4Var.f20136f;
                    kotlinx.coroutines.r2 r2Var3 = h4Var.f20138h;
                    if (r2Var3 != null) {
                        kotlinx.coroutines.p2.a(r2Var3, null, 1, null);
                    }
                    in5.s0 s0Var2 = gVar.f417149i;
                    if (s0Var2 != null && (y0Var = s0Var2.f293120d) != null) {
                        r2Var = kotlinx.coroutines.l.d(y0Var, null, null, new bg2.f4(rg6Var2, h4Var, wk5Var, pl5Var2, view2, null), 3, null);
                    }
                    h4Var.f20138h = r2Var;
                }
            } else {
                android.view.ViewGroup viewGroup3 = h4Var.f20135e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                }
            }
        }
        return jz5.f0.f302826a;
    }
}
