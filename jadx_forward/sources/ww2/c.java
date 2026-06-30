package ww2;

/* loaded from: classes2.dex */
public final class c implements ww2.b {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f531912b = new java.util.LinkedHashSet();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f531913a;

    public c(boolean z17) {
        this.f531913a = z17;
    }

    @Override // ww2.b
    public java.util.List a(vw2.f event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        if ((event instanceof vw2.e) && ((vw2.e) event).f522371b <= 1 && (!this.f531913a || !hc2.b0.i(data))) {
            com.p314xaae8f345.mm.p2621x8fb0427b.n3 c17 = gm0.j1.u().c();
            com.p314xaae8f345.mm.p2621x8fb0427b.u3 u3Var = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_THUMB_LIKE_EDU_TIMESTAMP_LONG;
            long t17 = c17.t(u3Var, 0L);
            long a17 = c01.id.a();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
            if (!((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209469se).mo141623x754a37bb()).r()).booleanValue()) {
                if (((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209451re).mo141623x754a37bb()).r()).intValue() < 0 || (a17 - t17) / 3600000 < ((java.lang.Number) ((lb2.j) ((jz5.n) r9).mo141623x754a37bb()).r()).intValue()) {
                    return arrayList;
                }
            }
            nv2.o oVar = nv2.o.f422091e;
            if (oVar.b(data.getFeedObject().getFeedObject()) != 0 && !oVar.c(data.getFeedObject().getFeedObject())) {
                java.util.Set set = f531912b;
                if (!set.contains(java.lang.Long.valueOf(data.mo2128x1ed62e84()))) {
                    gm0.j1.u().c().x(u3Var, java.lang.Long.valueOf(a17));
                    set.add(java.lang.Long.valueOf(data.mo2128x1ed62e84()));
                    arrayList.add(new vw2.b(500L, 5000L, vw2.c.f522365d));
                }
            }
        }
        return arrayList;
    }

    @Override // ww2.b
    public void b(java.util.List views, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(views, "views");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList<android.widget.TextView> arrayList = new java.util.ArrayList();
        java.util.Iterator it = views.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            android.widget.TextView textView = lVar.f384366d == vw2.c.f522365d ? (android.widget.TextView) lVar.f384367e : null;
            if (textView != null) {
                arrayList.add(textView);
            }
        }
        for (android.widget.TextView textView2 : arrayList) {
            textView2.setText(textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhx));
        }
    }
}
