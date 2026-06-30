package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class p3 implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 f191927d;

    public p3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88) {
        this.f191927d = activityC13958x14958e88;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        int a07 = i17 - ((in5.n0) adapter).a0();
        if (a07 >= 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88 = this.f191927d;
            if (a07 < activityC13958x14958e88.A.size()) {
                java.util.ArrayList arrayList = activityC13958x14958e88.A;
                so2.j5 j5Var = (so2.j5) kz5.n0.a0(arrayList, a07);
                if (j5Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.C14149x7d40ca9c.B;
                    java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onClick ");
                    sb6.append(a07);
                    sb6.append(" id:");
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) j5Var;
                    sb6.append(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11());
                    sb6.append(", pos:");
                    sb6.append(a07);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderGalleryFragment", sb6.toString());
                    activityC13958x14958e88.a(pm0.v.u(abstractC14490x69736cb5.mo2128x1ed62e84()), i17, 2);
                    long mo2128x1ed62e84 = abstractC14490x69736cb5.mo2128x1ed62e84();
                    boolean z17 = abstractC14490x69736cb5.getFeedObject().getMediaType() == 2;
                    java.lang.String str = activityC13958x14958e88.f190798w;
                    int i19 = i17 + 1;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192887e = str == null ? "" : str;
                    com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387 c6553x54ab9387 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6553x54ab9387();
                    c6553x54ab9387.q(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192884b);
                    c6553x54ab9387.f139025e = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192885c;
                    c6553x54ab9387.f139026f = 5L;
                    c6553x54ab9387.p(z17 ? "pic_feed" : "vid_feed");
                    c6553x54ab9387.f139028h = 6L;
                    java.lang.StringBuilder sb7 = new java.lang.StringBuilder("{\"feedid\":\"");
                    sb7.append(pm0.v.u(mo2128x1ed62e84));
                    sb7.append("\";\"feed_position\":\"");
                    sb7.append(i19);
                    sb7.append("\";\"keyword\":\"");
                    if (str == null) {
                        str = "";
                    }
                    sb7.append(str);
                    sb7.append("\"}");
                    c6553x54ab9387.s(sb7.toString());
                    c6553x54ab9387.r(java.lang.String.valueOf(c01.id.c()));
                    c6553x54ab9387.k();
                    java.lang.String n17 = c6553x54ab9387.n();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(n17, "toShowString(...)");
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderGalleryReportLogic", "report22878 ".concat(r26.i0.t(n17, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20376x98ef612e, " ", false)));
                    if (!activityC13958x14958e88.c7().b()) {
                        activityC13958x14958e88.c7().i(activityC13958x14958e88, activityC13958x14958e88.M, abstractC14490x69736cb5, kz5.j0.I(activityC13958x14958e88.A, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class), null, true);
                        return;
                    }
                    android.content.Intent intent = new android.content.Intent();
                    hc2.e0.b(intent, a07, kz5.j0.I(arrayList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5.class), activityC13958x14958e88.f190801z, null);
                    i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0.class);
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1433xac108269.i0) c17).Dk(activityC13958x14958e88, intent, activityC13958x14958e88.c7().g(), activityC13958x14958e88.c7().f192893a.f192876b, activityC13958x14958e88.c7().f192893a.f192877c, activityC13958x14958e88.M);
                }
            }
        }
    }
}
