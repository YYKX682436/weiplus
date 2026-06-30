package sc2;

/* loaded from: classes2.dex */
public final class c5 extends ad2.h {
    @Override // ad2.h, ad2.k
    public void c(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.c(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h, ad2.k
    public void d(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        super.d(holder, jumpView, infoEx, z17, aVar);
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        r45.cd5 cd5Var;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        r45.wf6 wf6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        r45.wf6 wf6Var2 = this.f84682m;
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                }
                wf6Var = it.next();
                r45.wf6 wf6Var3 = (r45.wf6) wf6Var;
                boolean z17 = true;
                if (wf6Var3.m75939xb282bd08(1) != infoEx.f534789r || wf6Var3.m75939xb282bd08(2) != 34) {
                    z17 = false;
                }
                if (z17) {
                    break;
                }
            }
            wf6Var2 = wf6Var;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedJumperObserver", "[onBindView] hashCode:" + hashCode() + "holder: " + holder.hashCode() + " holder position: " + holder.m8188xa86cd69f() + " feedId=" + pm0.v.u(this.f84678f) + " showPosition=" + infoEx.f534789r + " showStyle=" + infoEx.f534790s + " businessType=" + c19786x6a1e2862.m76480xe2ee1ca3() + " jumpType=" + c19786x6a1e2862.m76503x92bc3c07() + ' ');
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) jumpView.findViewById(com.p314xaae8f345.mm.R.id.tc_);
        if (frameLayout != null) {
            frameLayout.removeAllViews();
        }
        if (wf6Var2 == null || (cd5Var = (r45.cd5) wf6Var2.m75936x14adae67(43)) == null || (m75934xbce7f2f = cd5Var.m75934xbce7f2f(0)) == null) {
            return;
        }
        r45.rg0 rg0Var = new r45.rg0();
        rg0Var.mo11468x92b714fd(m75934xbce7f2f.g());
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15218x93cb9366 c15218x93cb9366 = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15218x93cb9366(context);
        c15218x93cb9366.b(rg0Var);
        if (frameLayout != null) {
            frameLayout.addView(c15218x93cb9366, new android.widget.FrameLayout.LayoutParams(-1, -2));
        }
    }
}
