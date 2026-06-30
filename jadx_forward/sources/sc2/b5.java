package sc2;

/* loaded from: classes2.dex */
public class b5 extends ad2.h {

    /* renamed from: y, reason: collision with root package name */
    public static final java.util.Map f487314y = new java.util.LinkedHashMap();

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487315w = "Finder.FeedJumperNextLiveNoticeObserver";

    /* renamed from: x, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f487316x;

    public static final void G(sc2.b5 b5Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, boolean z17) {
        b5Var.getClass();
        f487314y.put(java.lang.Long.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11()), java.lang.Boolean.valueOf(z17));
    }

    public final boolean H(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5) {
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.util.LinkedHashMap) f487314y).get(java.lang.Long.valueOf(abstractC14490x69736cb5.getFeedObject().getFeedObject().m76784x5db1b11())), java.lang.Boolean.TRUE);
    }

    public final void I(android.view.View view, boolean z17) {
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.toz);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(textView);
        com.p314xaae8f345.mm.ui.fk.a(textView);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) view.findViewById(com.p314xaae8f345.mm.R.id.f566351tp1);
        if (z17) {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkl);
            c22699x3dcdb352.setVisibility(0);
        } else {
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.nkj);
            c22699x3dcdb352.setVisibility(8);
        }
    }

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? gs2.a.f356585h : gs2.a.f356593s;
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487315w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        java.lang.String str2 = this.f487315w;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "#onBindView");
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = infoEx.f534767a.m76521x7528c3fb();
        r45.gw4 gw4Var = null;
        if (m76521x7528c3fb != null) {
            java.util.Iterator<T> it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it.next();
                    if (((r45.wf6) obj).m75939xb282bd08(2) == 37) {
                        break;
                    }
                }
            }
            r45.wf6 wf6Var = (r45.wf6) obj;
            if (wf6Var != null) {
                gw4Var = (r45.gw4) wf6Var.m75936x14adae67(46);
            }
        }
        if (gw4Var == null) {
            D(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "return because styleData is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        if (abstractC14490x69736cb5 == null || (feedObject = abstractC14490x69736cb5.getFeedObject()) == null || (str = feedObject.m59299x6bf53a6c()) == null) {
            str = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "show now. wording=" + gw4Var.m75945x2fec8307(0) + " anchor=" + str);
        ym5.a1.h(jumpView, new sc2.v4(str, jumpView));
        I(jumpView, H(feed));
        ((android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.f566353tp3)).setText(gw4Var.m75945x2fec8307(0));
        jumpView.findViewById(com.p314xaae8f345.mm.R.id.f566350tp0).setOnClickListener(new sc2.a5(this, feed, jumpView, str));
    }
}
