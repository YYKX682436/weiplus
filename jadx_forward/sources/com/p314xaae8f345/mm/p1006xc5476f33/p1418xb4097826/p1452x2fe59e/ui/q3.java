package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class q3 implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 f191975a;

    public q3(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88) {
        this.f191975a = activityC13958x14958e88;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 wxRVData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxRVData, "wxRVData");
        int i17 = wxRVData.f374681a;
        if (i17 == 0 || i17 == 8) {
            int i18 = 0;
            for (java.lang.Object obj : wxRVData.f374686f) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                in5.x0 x0Var = (in5.x0) obj;
                in5.c cVar = x0Var.f374691a;
                if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    java.lang.String u17 = pm0.v.u(cVar.mo2128x1ed62e84());
                    int i27 = x0Var.f374693c;
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC13958x14958e88 activityC13958x14958e88 = this.f191975a;
                    activityC13958x14958e88.getClass();
                    activityC13958x14958e88.a(u17, i27, 1);
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192883a.d(cVar.mo2128x1ed62e84(), activityC13958x14958e88.M, i19, activityC13958x14958e88.f190798w);
                }
                i18 = i19;
            }
        }
    }
}
