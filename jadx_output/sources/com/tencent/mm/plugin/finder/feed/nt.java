package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class nt extends in5.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.yt f108598a;

    public nt(com.tencent.mm.plugin.finder.feed.yt ytVar) {
        this.f108598a = ytVar;
    }

    @Override // in5.p
    public void c(java.util.Set recordsSet) {
        kotlin.jvm.internal.o.g(recordsSet, "recordsSet");
        com.tencent.mars.xlog.Log.i("Finder.FinderTimelineLbsMixPresenter", "onExposeTimeRecorded: size = " + recordsSet.size());
        com.tencent.mm.plugin.finder.feed.yt ytVar = this.f108598a;
        com.tencent.mm.ui.MMActivity context = ytVar.f111197d;
        kotlin.jvm.internal.o.g(context, "context");
        com.tencent.mm.plugin.finder.viewmodel.component.ny nyVar = (com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class);
        com.tencent.mm.plugin.finder.report.r0 a76 = nyVar != null ? nyVar.a7(-1) : null;
        if (a76 instanceof com.tencent.mm.plugin.finder.report.p5) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (java.lang.Object obj : recordsSet) {
                if (((in5.j) obj).f293070a instanceof so2.k) {
                    arrayList.add(obj);
                }
            }
            com.tencent.mm.plugin.finder.report.p5 p5Var = (com.tencent.mm.plugin.finder.report.p5) a76;
            long j17 = ytVar.f111203m;
            p5Var.getClass();
            java.util.Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                in5.j jVar = (in5.j) it.next();
                com.tencent.mm.plugin.finder.storage.o90 o90Var = ((so2.k) jVar.f293070a).f410451d.f126993b;
                if (o90Var != null) {
                    com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct();
                    p5Var.T0(finderLbsCardExposeReportStruct);
                    p5Var.S0(finderLbsCardExposeReportStruct, o90Var);
                    finderLbsCardExposeReportStruct.f57005g = finderLbsCardExposeReportStruct.b("refreshTime", pm0.v.u(j17), true);
                    finderLbsCardExposeReportStruct.f57006h = 1L;
                    finderLbsCardExposeReportStruct.f57008j = jVar.f293074e;
                    long j18 = jVar.f293073d;
                    finderLbsCardExposeReportStruct.f57012n = j18;
                    long j19 = jVar.f293071b;
                    finderLbsCardExposeReportStruct.f57013o = j19;
                    long j27 = jVar.f293072c;
                    finderLbsCardExposeReportStruct.f57014p = j27;
                    finderLbsCardExposeReportStruct.f57017s = j18;
                    finderLbsCardExposeReportStruct.f57018t = j19;
                    finderLbsCardExposeReportStruct.f57019u = j27;
                    int i17 = 0;
                    for (java.lang.Object obj2 : o90Var.f127299b) {
                        int i18 = i17 + 1;
                        if (i17 < 0) {
                            kz5.c0.p();
                            throw null;
                        }
                        com.tencent.mm.plugin.finder.model.BaseFinderFeed baseFinderFeed = (com.tencent.mm.plugin.finder.model.BaseFinderFeed) obj2;
                        if (i17 < 3) {
                            com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct finderLbsCardExposeReportStruct2 = new com.tencent.mm.autogen.mmdata.rpt.FinderLbsCardExposeReportStruct(finderLbsCardExposeReportStruct.m());
                            p5Var.U0(finderLbsCardExposeReportStruct2, baseFinderFeed);
                            finderLbsCardExposeReportStruct2.f57016r = i17;
                            finderLbsCardExposeReportStruct2.k();
                        }
                        i17 = i18;
                    }
                }
            }
        }
    }
}
