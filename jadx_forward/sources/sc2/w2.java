package sc2;

/* loaded from: classes2.dex */
public class w2 extends ad2.h {

    /* renamed from: z, reason: collision with root package name */
    public static final sc2.u2 f487861z = new sc2.u2(null);

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.String f487862w = "FeedJumperAccountAroundObserver";

    /* renamed from: x, reason: collision with root package name */
    public xc2.p0 f487863x;

    /* renamed from: y, reason: collision with root package name */
    public p3325xe03a0797.p3326xc267989b.r2 f487864y;

    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f1  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void G(in5.s0 r14) {
        /*
            Method dump skipped, instructions count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sc2.w2.G(in5.s0):void");
    }

    @Override // ad2.h
    public java.lang.String k() {
        return this.f487862w;
    }

    @Override // ad2.h
    public boolean m(xc2.p0 infoEx) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((r45.wf6) obj).m75939xb282bd08(2) == 20) {
                break;
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.ya yaVar = wf6Var != null ? (r45.ya) wf6Var.m75936x14adae67(27) : null;
        java.lang.String m75945x2fec8307 = yaVar != null ? yaVar.m75945x2fec8307(0) : null;
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String l17 = l(m75945x2fec8307, y2Var.s(context, c19786x6a1e2862));
        return !(l17 == null || l17.length() == 0);
    }

    @Override // ad2.h
    public void q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed, in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx, java.lang.String source) {
        boolean z17;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        super.q(feed, holder, jumpView, infoEx, source);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = infoEx.f534767a;
        java.util.LinkedList<r45.wf6> m76521x7528c3fb = c19786x6a1e2862.m76521x7528c3fb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m76521x7528c3fb, "getStyle(...)");
        java.util.Iterator<T> it = m76521x7528c3fb.iterator();
        while (true) {
            z17 = true;
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((r45.wf6) obj).m75939xb282bd08(2) == 20) {
                    break;
                }
            }
        }
        r45.wf6 wf6Var = (r45.wf6) obj;
        r45.ya yaVar = wf6Var != null ? (r45.ya) wf6Var.m75936x14adae67(27) : null;
        if (infoEx.f534777f == null) {
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f487862w, "[onBindView] hashCode:" + hashCode() + "holder: " + holder.hashCode() + " holder position: " + holder.m8188xa86cd69f() + " feedId=" + pm0.v.u(this.f84678f) + " showPosition=" + infoEx.f534789r + " showStyle=" + infoEx.f534790s + " businessType=" + c19786x6a1e2862.m76480xe2ee1ca3() + " jumpType=" + c19786x6a1e2862.m76503x92bc3c07() + " title=" + c19786x6a1e2862.m76514x1202da9d() + '|' + c19786x6a1e2862.m76523x98b23862() + " icon_url=" + c19786x6a1e2862.m76497x4fe38a1f() + " ext_info=" + c19786x6a1e2862.m76489xefafd82() + ' ');
        android.widget.TextView textView = (android.widget.TextView) jumpView.findViewById(com.p314xaae8f345.mm.R.id.eeq);
        java.lang.String m75945x2fec8307 = yaVar != null ? yaVar.m75945x2fec8307(0) : null;
        xc2.y2 y2Var = xc2.y2.f534876a;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        textView.setText(l(m75945x2fec8307, y2Var.s(context, c19786x6a1e2862)));
        java.lang.CharSequence text = textView.getText();
        if (text != null && text.length() != 0) {
            z17 = false;
        }
        if (!z17) {
            this.f487863x = infoEx;
        }
        G(holder);
    }
}
