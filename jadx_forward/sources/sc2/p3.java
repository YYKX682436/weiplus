package sc2;

/* loaded from: classes2.dex */
public final class p3 extends ad2.h {
    public final r45.wf6 G(xc2.p0 p0Var) {
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = p0Var.f534767a.m76521x7528c3fb();
        java.lang.Object obj = null;
        if (m76521x7528c3fb == null) {
            return null;
        }
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (((r45.wf6) next).m75939xb282bd08(2) == 44) {
                obj = next;
                break;
            }
        }
        return (r45.wf6) obj;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        r45.nt ntVar;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        r45.wf6 G = G(infoEx);
        if (G == null || (ntVar = (r45.nt) G.m75936x14adae67(53)) == null || (m75945x2fec8307 = ntVar.m75945x2fec8307(1)) == null) {
            return false;
        }
        return m75945x2fec8307.length() > 0;
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String str;
        r45.nt ntVar;
        java.lang.String m75945x2fec8307;
        r45.nt ntVar2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedJumperObserver", "bind");
        if (!o(holder, infoEx.f534767a)) {
            D(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FeedJumperObserver", "[onBindView] priority not ok");
            return;
        }
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.f566023te2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) holder.p(com.p314xaae8f345.mm.R.id.f566022te1);
        r45.wf6 G = G(infoEx);
        if (G == null || (ntVar2 = (r45.nt) G.m75936x14adae67(53)) == null || (str = ntVar2.m75945x2fec8307(1)) == null) {
            str = "";
        }
        textView.setText(str);
        com.p314xaae8f345.mm.ui.fk.b(textView);
        if (G == null || (ntVar = (r45.nt) G.m75936x14adae67(53)) == null || (m75945x2fec8307 = ntVar.m75945x2fec8307(0)) == null) {
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
        sc2.o3 o3Var = sc2.o3.f487652a;
        a17.getClass();
        a17.f529406d = o3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c22699x3dcdb352);
        a17.c(c22699x3dcdb352);
    }
}
