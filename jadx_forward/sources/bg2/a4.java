package bg2;

/* loaded from: classes2.dex */
public final class a4 implements p3325xe03a0797.p3326xc267989b.p3328x30012e.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bg2.h4 f101450d;

    public a4(bg2.h4 h4Var) {
        this.f101450d = h4Var;
    }

    @Override // p3325xe03a0797.p3326xc267989b.p3328x30012e.k
    /* renamed from: emit */
    public java.lang.Object mo771x2f8fd3(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        r45.bc2 bc2Var = (r45.bc2) obj;
        if (bc2Var != null) {
            bg2.h4 h4Var = this.f101450d;
            tc2.g gVar = h4Var.f498674d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = gVar.f498681h;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = null;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 m59240x7c94657b = (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null) ? null : feedObject.m59240x7c94657b();
            r45.kr0 d17 = m59240x7c94657b != null ? com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.d(m59240x7c94657b) : null;
            if (((r45.px3) bc2Var.m75936x14adae67(0)) != null) {
                android.view.ViewGroup viewGroup = h4Var.f101668e;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                r45.px3 px3Var = (r45.px3) bc2Var.m75936x14adae67(0);
                r45.px3 px3Var2 = (r45.px3) bc2Var.m75936x14adae67(0);
                r45.pl5 pl5Var = px3Var2 != null ? (r45.pl5) px3Var2.m75936x14adae67(4) : null;
                r45.rg6 rg6Var = d17 != null ? (r45.rg6) d17.m75936x14adae67(8) : null;
                if (px3Var != null && pl5Var != null && rg6Var != null) {
                    android.view.View view = h4Var.f101669f;
                    p3325xe03a0797.p3326xc267989b.r2 r2Var2 = h4Var.f101670g;
                    if (r2Var2 != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var2, null, 1, null);
                    }
                    in5.s0 s0Var = gVar.f498682i;
                    if (s0Var != null && (y0Var2 = s0Var.f374653d) != null) {
                        r2Var = p3325xe03a0797.p3326xc267989b.l.d(y0Var2, null, null, new bg2.g4(rg6Var, h4Var, px3Var, pl5Var, view, null), 3, null);
                    }
                    h4Var.f101670g = r2Var;
                }
            } else if (((r45.wk5) bc2Var.m75936x14adae67(1)) != null) {
                android.view.ViewGroup viewGroup2 = h4Var.f101668e;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                r45.wk5 wk5Var = (r45.wk5) bc2Var.m75936x14adae67(1);
                r45.wk5 wk5Var2 = (r45.wk5) bc2Var.m75936x14adae67(1);
                r45.pl5 pl5Var2 = wk5Var2 != null ? (r45.pl5) wk5Var2.m75936x14adae67(1) : null;
                r45.rg6 rg6Var2 = d17 != null ? (r45.rg6) d17.m75936x14adae67(8) : null;
                if (wk5Var != null && pl5Var2 != null && rg6Var2 != null) {
                    android.view.View view2 = h4Var.f101669f;
                    p3325xe03a0797.p3326xc267989b.r2 r2Var3 = h4Var.f101671h;
                    if (r2Var3 != null) {
                        p3325xe03a0797.p3326xc267989b.p2.a(r2Var3, null, 1, null);
                    }
                    in5.s0 s0Var2 = gVar.f498682i;
                    if (s0Var2 != null && (y0Var = s0Var2.f374653d) != null) {
                        r2Var = p3325xe03a0797.p3326xc267989b.l.d(y0Var, null, null, new bg2.f4(rg6Var2, h4Var, wk5Var, pl5Var2, view2, null), 3, null);
                    }
                    h4Var.f101671h = r2Var;
                }
            } else {
                android.view.ViewGroup viewGroup3 = h4Var.f101668e;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(8);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
