package p000;

/* loaded from: classes2.dex */
public final class k extends ad2.h {
    public final r45.f60 G(xc2.p0 p0Var) {
        java.lang.Object obj;
        r45.wf6 wf6Var = this.f84682m;
        if (wf6Var == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
            if (m76521x7528c3fb != null) {
                java.util.Iterator<T> it = m76521x7528c3fb.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (((r45.wf6) obj).m75939xb282bd08(2) == 42) {
                        break;
                    }
                }
                wf6Var = (r45.wf6) obj;
            } else {
                wf6Var = null;
            }
        }
        if (wf6Var != null) {
            return (r45.f60) wf6Var.m75936x14adae67(50);
        }
        return null;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(G(infoEx) != null ? r2.m75945x2fec8307(0) : null);
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) holder.p(com.p314xaae8f345.mm.R.id.c77);
        linearLayout.setPadding(linearLayout.getPaddingLeft(), linearLayout.getPaddingTop(), linearLayout.getPaddingRight(), 0);
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f565474t05);
        r45.f60 G = G(infoEx);
        textView.setText(G != null ? G.m75945x2fec8307(0) : null);
    }
}
