package ka2;

/* loaded from: classes10.dex */
public final /* synthetic */ class v extends p3321xbce91901.jvm.p3324x21ffc6bd.m implements yz5.l {
    public v(java.lang.Object obj) {
        super(1, obj, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.class, "initAdapter", "initAdapter(Ljava/util/ArrayList;)Lcom/tencent/mm/view/recyclerview/WxRecyclerAdapter;", 0);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.ArrayList p07 = (java.util.ArrayList) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(p07, "p0");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4 activityC13659x4f0951e4 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4) this.f72685xcfcbe9ef;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.poi.ui.ActivityC13659x4f0951e4.P;
        activityC13659x4f0951e4.getClass();
        ka2.m mVar = new ka2.m(p07, activityC13659x4f0951e4, new in5.s() { // from class: com.tencent.mm.plugin.finder.activity.poi.ui.FinderPoiNormalLbsListUI$buildItemCoverts$1
            @Override // in5.s
            /* renamed from: getItemConvert */
            public in5.r mo43555xf2bb75ea(int type) {
                switch (type) {
                    case 4:
                        return new ga2.c();
                    case 5:
                        return new ga2.d();
                    case 6:
                        return new ga2.a();
                    case 7:
                        return new ga2.h();
                    case 8:
                        return new ga2.e();
                    default:
                        return new ga2.b();
                }
            }
        });
        mVar.f374639p = new ka2.k(activityC13659x4f0951e4);
        mVar.f374638o = new ka2.l(activityC13659x4f0951e4, p07);
        return mVar;
    }
}
