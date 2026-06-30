package zk3;

/* loaded from: classes8.dex */
public final class n extends p012xc85e97e9.p103xe821e364.p104xd1075a44.z {

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ zk3.g0 f555014t;

    public n(zk3.g0 g0Var) {
        this.f555014t = g0Var;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public void A(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc c16615x299ce7dc;
        if ((k3Var != null ? k3Var.m8183xf806b362() : 0) > 1 || (c16615x299ce7dc = this.f555014t.f554988m) == null) {
            return;
        }
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1902x6580a04.C16615x299ce7dc.I;
        c16615x299ce7dc.m67204x764d6925(-1);
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.n2
    public void q(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 viewHolder) {
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewHolder, "viewHolder");
        zk3.x xVar = this.f555014t.f555000y;
        xVar.getClass();
        zk3.g0 g0Var = xVar.f555055a;
        g0Var.getClass();
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = g0Var.f554987i;
        int i17 = 0;
        if (((c22849x81a93d25 == null || (mo7946xf939df19 = c22849x81a93d25.mo7946xf939df19()) == null) ? 0 : mo7946xf939df19.mo1894x7e414b06()) <= 3) {
            android.view.View findViewById = viewHolder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvf);
            android.view.View findViewById2 = viewHolder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jva);
            if (findViewById == null || findViewById2 == null) {
                return;
            }
            findViewById.setTranslationY(0.0f);
            if ((findViewById2 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185) findViewById2 : null) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185 c16612x87a7d185 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185) findViewById2;
                c16612x87a7d185.topOffset = 0;
                c16612x87a7d185.invalidate();
                return;
            }
            return;
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = g0Var.f554987i;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4.LayoutManager layoutManager = c22849x81a93d252 != null ? c22849x81a93d252.getLayoutManager() : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01 c16610x601b3a01 = layoutManager instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.C16610x601b3a01) layoutManager : null;
        if (c16610x601b3a01 != null) {
            int w17 = c16610x601b3a01.w();
            android.view.View findViewById3 = viewHolder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvf);
            android.view.View findViewById4 = viewHolder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jvd);
            if (findViewById3 == null || findViewById4 == null) {
                return;
            }
            android.graphics.Rect rect = g0Var.f554986h;
            findViewById4.getLocalVisibleRect(rect);
            int height = com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.Q - rect.height();
            if (height <= com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.Q * 0.8f && viewHolder.m8183xf806b362() <= w17 + 1) {
                i17 = height;
            }
            findViewById3.setTranslationY(i17);
            android.view.View findViewById5 = viewHolder.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.jva);
            if ((findViewById5 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185) findViewById5 : null) != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185 c16612x87a7d1852 = (com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.p1900x542314dc.p1901x373aa5.C16612x87a7d185) findViewById5;
                c16612x87a7d1852.topOffset = i17;
                c16612x87a7d1852.invalidate();
            }
        }
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o3
    public void z(p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        zk3.g0 g0Var = this.f555014t;
        if (g0Var.f554985g.size() == 1) {
            g0Var.d7(((uk3.a) g0Var.f554985g.get(0)).f510057d, false, false);
        } else {
            g0Var.d7(null, true, false);
        }
    }
}
