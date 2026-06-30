package com.tencent.mm.plugin.fav.ui;

/* loaded from: classes12.dex */
public class x implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DoFavoriteEvent f101587d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f101588e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.autogen.events.DoFavoriteEvent f101589f;

    public x(com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent, int i17, com.tencent.mm.autogen.events.DoFavoriteEvent doFavoriteEvent2) {
        this.f101587d = doFavoriteEvent;
        this.f101588e = i17;
        this.f101589f = doFavoriteEvent2;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        r45.jq0 jq0Var;
        r45.jq0 jq0Var2;
        int i18 = this.f101588e;
        if (i17 == -2) {
            com.tencent.mm.plugin.fav.ui.a0.d(this.f101587d, i18);
            return;
        }
        if (i17 == -1) {
            a82.j1 j1Var = a82.j1.f2045a;
            com.tencent.mm.autogen.events.DoFavoriteEvent event = this.f101589f;
            kotlin.jvm.internal.o.g(event, "event");
            am.c4 c4Var = event.f54090g;
            if (c4Var == null) {
                com.tencent.mars.xlog.Log.e("FavPostReporter", "reportPreCheckFail, event.data is null");
                return;
            }
            com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct favFlowFailedReportStruct = new com.tencent.mm.autogen.mmdata.rpt.FavFlowFailedReportStruct();
            favFlowFailedReportStruct.f56278k = 2;
            favFlowFailedReportStruct.f56271d = c4Var.f6317c;
            r45.bq0 bq0Var = c4Var.f6315a;
            favFlowFailedReportStruct.f56273f = (bq0Var == null || (jq0Var2 = bq0Var.f370962d) == null) ? c4Var.f6327m : jq0Var2.f378034d;
            long j17 = (bq0Var == null || (jq0Var = bq0Var.f370962d) == null) ? 0L : jq0Var.f378044q;
            if (j17 > 1000000000000L) {
                j17 /= 1000;
            }
            favFlowFailedReportStruct.f56282o = j17;
            java.lang.Long valueOf = java.lang.Long.valueOf(j17);
            if (!java.lang.Boolean.valueOf(valueOf.longValue() > 0).booleanValue()) {
                valueOf = null;
            }
            favFlowFailedReportStruct.f56283p = valueOf != null ? java.lang.Long.valueOf((java.lang.System.currentTimeMillis() / 1000) - valueOf.longValue()).longValue() : 0L;
            favFlowFailedReportStruct.f56275h = c01.id.c() / 1000;
            favFlowFailedReportStruct.f56276i = 1;
            favFlowFailedReportStruct.I = 1;
            favFlowFailedReportStruct.f56280m = 2;
            favFlowFailedReportStruct.f56281n = j1Var.b(i18);
            favFlowFailedReportStruct.k();
            java.lang.String n17 = favFlowFailedReportStruct.n();
            kotlin.jvm.internal.o.f(n17, "toShowString(...)");
            com.tencent.mars.xlog.Log.i("FavPostReporter", "report36784 ".concat(r26.i0.t(n17, com.tencent.midas.comm.log.util.APLogFileUtil.SEPARATOR_LINE, " ", false)));
        }
    }
}
