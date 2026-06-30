package sc2;

/* loaded from: classes2.dex */
public final class o extends ad2.h {

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487642w = "CNYFeedButtonJumperObserver";

    @Override // ad2.h
    public void E(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        f(600L, jumpView, z17, aVar);
        e(true, z17);
    }

    @Override // ad2.h
    public gs2.a j(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 info) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(info, "info");
        return info.m76480xe2ee1ca3() == 2 ? info.m76490xf00280e() == 3 ? gs2.a.f356585h : gs2.a.f356587m : super.j(info);
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487642w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        return true;
    }

    @Override // ad2.h
    public void n(android.view.View jumpView, boolean z17, yz5.a aVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        g(600L, jumpView, z17, aVar);
        e(false, z17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.Object] */
    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        r45.fq fqVar;
        r45.wf6 wf6Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        if (!o(holder, c19786x6a1e2862)) {
            D(8);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedCardJumperObserver", "[onBindView] priority not ok");
            return;
        }
        r45.wf6 wf6Var2 = this.f84682m;
        if (wf6Var2 == null) {
            java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
            java.util.Iterator it = m76521x7528c3fb.iterator();
            while (true) {
                if (!it.hasNext()) {
                    wf6Var = 0;
                    break;
                } else {
                    wf6Var = it.next();
                    if (((r45.wf6) wf6Var).m75939xb282bd08(2) == 12) {
                        break;
                    }
                }
            }
            wf6Var2 = wf6Var;
        }
        if (wf6Var2 != null && (fqVar = (r45.fq) wf6Var2.m75936x14adae67(18)) != null) {
            android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eez);
            android.view.View findViewById = jumpView.findViewById(com.p314xaae8f345.mm.R.id.eey);
            if (textView != null) {
                textView.setText(fqVar.m75945x2fec8307(0));
            }
            if (findViewById != null) {
                try {
                    findViewById.setBackgroundColor(android.graphics.Color.parseColor(fqVar.m75945x2fec8307(2)));
                } catch (java.lang.Throwable th6) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("CNYFeedButtonJumper", th6, "parse color crash, bg_color=" + fqVar.m75945x2fec8307(2) + "， font_color=" + fqVar.m75945x2fec8307(1), new java.lang.Object[0]);
                }
            }
            if (textView != null) {
                textView.setTextColor(android.graphics.Color.parseColor(fqVar.m75945x2fec8307(1)));
            }
        }
        gs2.c.f356605a.e(holder, jumpView, j(c19786x6a1e2862), false);
    }
}
