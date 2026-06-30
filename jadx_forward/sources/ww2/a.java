package ww2;

/* loaded from: classes2.dex */
public final class a implements ww2.b {

    /* renamed from: a, reason: collision with root package name */
    public static final java.util.Set f531911a = new java.util.LinkedHashSet();

    @Override // ww2.b
    public java.util.List a(vw2.f event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 data) {
        r45.zz3 zz3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if (!(event instanceof vw2.e)) {
            return arrayList;
        }
        if (data.getFeedObject().m59254xf4204902() > 0) {
            java.util.Set set = f531911a;
            if (!set.contains(java.lang.Long.valueOf(data.mo2128x1ed62e84())) && com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079.f36172x233c02ec.e(data.getFeedObject().getFeedObject()) && !data.B0()) {
                set.add(java.lang.Long.valueOf(data.mo2128x1ed62e84()));
                arrayList.add(new vw2.b(500L, 5000L, vw2.c.f522366e));
                return arrayList;
            }
        }
        r45.dm2 m76806xdef68064 = data.getFeedObject().getFeedObject().m76806xdef68064();
        if (m76806xdef68064 != null && (zz3Var = (r45.zz3) m76806xdef68064.m75936x14adae67(41)) != null) {
            zz3Var.m75945x2fec8307(4);
        }
        return arrayList;
    }

    @Override // ww2.b
    public void b(java.util.List views, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 data) {
        r45.vl2 vl2Var;
        r45.wl2 wl2Var;
        r45.zz3 zz3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(views, "views");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = views.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = lVar.f384366d == vw2.c.f522366e ? (android.widget.TextView) lVar.f384367e : null;
            if (textView != null) {
                arrayList.add(textView);
            }
        }
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            android.widget.TextView textView2 = (android.widget.TextView) it6.next();
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 feedObject = data.getFeedObject().getFeedObject();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            boolean z17 = true;
            if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Nd).mo141623x754a37bb()).r()).intValue() == 1) {
                feedObject.m76899x71cce6d8(null);
            }
            r45.dm2 m76806xdef68064 = feedObject.m76806xdef68064();
            java.lang.String m75945x2fec8307 = (m76806xdef68064 == null || (zz3Var = (r45.zz3) m76806xdef68064.m75936x14adae67(41)) == null) ? null : zz3Var.m75945x2fec8307(4);
            r45.dm2 m76806xdef680642 = feedObject.m76806xdef68064();
            java.lang.String m75945x2fec83072 = (m76806xdef680642 == null || (vl2Var = (r45.vl2) m76806xdef680642.m75936x14adae67(27)) == null || (wl2Var = (r45.wl2) vl2Var.m75936x14adae67(1)) == null) ? null : wl2Var.m75945x2fec8307(4);
            if (m75945x2fec8307 == null || m75945x2fec8307.length() == 0) {
                if (m75945x2fec83072 == null || m75945x2fec83072.length() == 0) {
                    r45.bm2 e17 = cu2.f0.f303924a.e(feedObject.m76805x2dd7a70f());
                    m75945x2fec8307 = e17 != null ? e17.m75945x2fec8307(11) : null;
                    if (m75945x2fec8307 != null && m75945x2fec8307.length() != 0) {
                        z17 = false;
                    }
                    if (z17) {
                        m75945x2fec8307 = textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.d1d);
                    }
                } else {
                    m75945x2fec8307 = m75945x2fec83072;
                }
            }
            com.p314xaae8f345.mm.ui.fk.c(textView2);
            textView2.setText(m75945x2fec8307);
        }
    }
}
