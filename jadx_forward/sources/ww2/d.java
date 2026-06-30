package ww2;

/* loaded from: classes2.dex */
public final class d implements ww2.b {

    /* renamed from: b, reason: collision with root package name */
    public static final java.util.Set f531914b = new java.util.LinkedHashSet();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f531915a;

    public d(boolean z17) {
        this.f531915a = z17;
    }

    @Override // ww2.b
    public java.util.List a(vw2.f event, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        if (!((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209326ke).mo141623x754a37bb()).r()).booleanValue()) {
            return arrayList;
        }
        if ((event instanceof vw2.e) && ((vw2.e) event).f522371b <= 1) {
            if (!this.f531915a || !hc2.b0.i(data)) {
                boolean booleanValue = ((java.lang.Boolean) ((nb2.a) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209398oe).mo141623x754a37bb()).r()).booleanValue();
                bw5.ms0 ms0Var = bw5.ms0.emFinderNewbieGuideType_ThumbHeartLikeEdu;
                if ((booleanValue || com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27311x43a2d090.m112842x9cf0d20b().m112843xefa19018(ms0Var)) && nv2.o.f422091e.b(data.getFeedObject().getFeedObject()) != 0 && data.getFeedObject().m59254xf4204902() != 0) {
                    java.util.Set set = f531914b;
                    if (!set.contains(java.lang.Long.valueOf(data.mo2128x1ed62e84()))) {
                        com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.C27311x43a2d090.m112842x9cf0d20b().m112849xba8311b6(ms0Var);
                        set.add(java.lang.Long.valueOf(data.mo2128x1ed62e84()));
                        long intValue = ((java.lang.Number) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209308je).mo141623x754a37bb()).r()).intValue();
                        jz5.g gVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209344le;
                        arrayList.add(new vw2.b(intValue, ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue(), vw2.c.f522365d));
                        arrayList.add(new vw2.b(((java.lang.Number) ((lb2.j) ((jz5.n) r3).mo141623x754a37bb()).r()).intValue(), ((java.lang.Number) ((lb2.j) ((jz5.n) gVar).mo141623x754a37bb()).r()).intValue(), vw2.c.f522366e));
                    }
                }
                return arrayList;
            }
        }
        return arrayList;
    }

    @Override // ww2.b
    public void b(java.util.List views, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 data) {
        java.lang.String string;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(views, "views");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.Iterator it = views.iterator();
        while (it.hasNext()) {
            jz5.l lVar = (jz5.l) it.next();
            vw2.c cVar = (vw2.c) lVar.f384366d;
            android.widget.TextView textView = (android.widget.TextView) lVar.f384367e;
            int ordinal = cVar.ordinal();
            if (ordinal == 0) {
                string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.ms7);
            } else {
                if (ordinal != 1) {
                    throw new jz5.j();
                }
                string = textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mhw);
            }
            textView.setText(string);
        }
    }
}
