package sc2;

/* loaded from: classes2.dex */
public final class g4 extends ad2.h {
    public final r45.wf6 G(xc2.p0 infoEx) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = infoEx.f534767a.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(2) == 29) {
                break;
            }
        }
        return (r45.wf6) obj;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        r45.wy3 wy3Var;
        java.lang.String m75945x2fec8307;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        r45.wf6 G = G(infoEx);
        if (G == null || (wy3Var = (r45.wy3) G.m75936x14adae67(37)) == null || (m75945x2fec8307 = wy3Var.m75945x2fec8307(1)) == null) {
            return false;
        }
        return m75945x2fec8307.length() > 0;
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String str;
        r45.wy3 wy3Var;
        java.lang.String m75945x2fec8307;
        r45.wy3 wy3Var2;
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
        android.widget.TextView textView = (android.widget.TextView) holder.p(com.p314xaae8f345.mm.R.id.qjg);
        android.widget.ImageView imageView = (android.widget.ImageView) holder.p(com.p314xaae8f345.mm.R.id.qje);
        r45.wf6 G = G(infoEx);
        if (G == null || (wy3Var2 = (r45.wy3) G.m75936x14adae67(37)) == null || (str = wy3Var2.m75945x2fec8307(1)) == null) {
            str = "";
        }
        textView.setText(str);
        if (G == null || (wy3Var = (r45.wy3) G.m75936x14adae67(37)) == null || (m75945x2fec8307 = wy3Var.m75945x2fec8307(0)) == null) {
            return;
        }
        wo0.c a17 = new mn2.d1((yo0.e) ((jz5.n) ((mn2.g3) ((mn2.i4) pf5.u.f435469a.e(zy2.b6.class).c(mn2.i4.class))).H).mo141623x754a37bb()).a(new mn2.q3(m75945x2fec8307, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e));
        sc2.f4 f4Var = sc2.f4.f487419a;
        a17.getClass();
        a17.f529406d = f4Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(imageView);
        a17.c(imageView);
    }
}
