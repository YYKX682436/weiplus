package xc2;

/* loaded from: classes2.dex */
public final class z0 extends xc2.o {
    @Override // xc2.o, xc2.j
    public void r(in5.s0 holder, android.view.View jumpView, xc2.p0 infoEx) {
        java.lang.String str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(infoEx, "infoEx");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = infoEx.f534777f;
        java.lang.String u17 = pm0.v.u(abstractC14490x69736cb5 != null ? abstractC14490x69736cb5.mo2128x1ed62e84() : 0L);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = infoEx.f534777f;
        if (abstractC14490x69736cb52 == null || (feedObject = abstractC14490x69736cb52.getFeedObject()) == null || (str = feedObject.m59299x6bf53a6c()) == null) {
            str = "";
        }
        xc2.y2 y2Var = xc2.y2.f534876a;
        boolean z17 = this.f534699f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f c15196x85976f5f = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1652x6b0147b.C15196x85976f5f) holder.p(com.p314xaae8f345.mm.R.id.e_k);
        int m61469xb7aadf97 = (int) ((c15196x85976f5f != null ? c15196x85976f5f.m61469xb7aadf97() : 0L) / 1000);
        int m61489x6d590e18 = c15196x85976f5f != null ? c15196x85976f5f.m61489x6d590e18() : 0;
        if (z17) {
            m61469xb7aadf97 = m61489x6d590e18;
        }
        int i17 = (int) (((m61469xb7aadf97 * 1.0f) / m61489x6d590e18) * 100);
        java.lang.Integer valueOf = java.lang.Integer.valueOf(m61489x6d590e18);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(i17);
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        java.lang.String e17 = xy2.c.e(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        infoEx.f534786o = "shortvideoid=" + u17 + "&cpid=" + str + "&duration=" + valueOf.intValue() + "&playPercent=" + valueOf2.intValue() + "&visitorUsername=" + e17 + "&commentScene=" + V6.m75939xb282bd08(5);
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("source_feedid", u17);
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        linkedHashMap.put("source_contextid", m75945x2fec8307);
        java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(2);
        linkedHashMap.put("source_tabcontextid", m75945x2fec83072 != null ? m75945x2fec83072 : "");
        linkedHashMap.put("source_commentscene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5)));
        infoEx.f534776e0 = linkedHashMap;
        super.r(holder, jumpView, infoEx);
    }
}
