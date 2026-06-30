package na2;

/* loaded from: classes2.dex */
public final class m extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca f417512d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca c14134xc5fab6ca) {
        super(1);
        this.f417512d = c14134xc5fab6ca;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.widget.TextView textView;
        android.widget.TextView textView2;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w5 response = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.w5) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(response, "response");
        java.lang.Object response2 = response.getResponse();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14134xc5fab6ca c14134xc5fab6ca = this.f417512d;
        if (response2 != null && (response2 instanceof r45.l91)) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("First tab refresh callback: title=");
            r45.l91 l91Var = (r45.l91) response2;
            sb6.append(l91Var.m75945x2fec8307(1));
            sb6.append(", subTitle=");
            sb6.append(l91Var.m75945x2fec8307(2));
            sb6.append(", favStatus=");
            sb6.append(l91Var.m75939xb282bd08(6));
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewTabUIC", sb6.toString());
            com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf y07 = c14134xc5fab6ca.y0();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e activityC13661xea07466e = y07 instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1429x2d2bd3d4.ui.ActivityC13661xea07466e) y07 : null;
            if (activityC13661xea07466e != null) {
                java.lang.String m75945x2fec8307 = l91Var.m75945x2fec8307(1);
                java.lang.String m75945x2fec83072 = l91Var.m75945x2fec8307(2);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlayNewUI", "updateTitle: title=" + m75945x2fec8307 + ", subTitle=" + m75945x2fec83072);
                pf5.z zVar = pf5.z.f435481a;
                na2.k kVar = (na2.k) zVar.a(activityC13661xea07466e).a(na2.k.class);
                kVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", "updateTitle: title=" + m75945x2fec8307 + ", subTitle=" + m75945x2fec83072);
                if (m75945x2fec8307 != null && (textView2 = kVar.f417499g) != null) {
                    textView2.setText(m75945x2fec8307);
                }
                if (m75945x2fec83072 != null && (textView = kVar.f417500h) != null) {
                    textView.setText(m75945x2fec83072);
                }
                int m75939xb282bd08 = l91Var.m75939xb282bd08(6);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderPostPlayNewUI", "updateFavStatus: favStatus=" + m75939xb282bd08);
                ((na2.k) zVar.a(activityC13661xea07466e).a(na2.k.class)).V6(m75939xb282bd08);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.AbstractC13834x56f46d28 abstractC13834x56f46d28 = c14134xc5fab6ca.f191578w;
        if (abstractC13834x56f46d28 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedLoader");
            throw null;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) kz5.n0.Z(abstractC13834x56f46d28.m56392xfc5c33e5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class));
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("First tab refresh callback: fallback firstFeed=");
        sb7.append(abstractC14490x69736cb5 != null ? java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84()) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewTabUIC", sb7.toString());
        com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf activity = c14134xc5fab6ca.y0();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        na2.f fVar = (na2.f) pf5.z.f435481a.a(activity).e(na2.f.class);
        if (fVar != null && fVar.f417490d == null) {
            if (abstractC14490x69736cb5 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onRecommendTabFetchRefreshDone: firstFeed is null, skip");
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb5.getFeedObject();
                fVar.f417490d = feedObject;
                fVar.f417491e = abstractC14490x69736cb5;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayAudioExtractorUIC", "onRecommendTabFetchRefreshDone: prepare audio track from recommend first feedId=".concat(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84())));
                qd2.g gVar = (qd2.g) ((jz5.n) fVar.f417493g).mo141623x754a37bb();
                if (gVar.f443261b == null && feedObject != null) {
                    gVar.f443261b = feedObject;
                    gVar.d(null);
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
