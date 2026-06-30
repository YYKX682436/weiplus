package com.tencent.mm.plugin.finder.assist;

/* loaded from: classes2.dex */
public final class a4 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.finder.assist.a4 f102002a = new com.tencent.mm.plugin.finder.assist.a4();

    public final void a(java.lang.String commentScene, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct finderBroadcastEidExposeStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidExposeStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidExposeStruct.f56537d = java.lang.System.currentTimeMillis();
        finderBroadcastEidExposeStruct.u("");
        finderBroadcastEidExposeStruct.p(str != null ? r26.i0.t(str, ",", ";", false) : "");
        finderBroadcastEidExposeStruct.A("");
        finderBroadcastEidExposeStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidExposeStruct.w(Ri);
        if (str2 == null) {
            str2 = "";
        }
        finderBroadcastEidExposeStruct.r(str2);
        finderBroadcastEidExposeStruct.q(commentScene);
        finderBroadcastEidExposeStruct.x("");
        finderBroadcastEidExposeStruct.v("");
        finderBroadcastEidExposeStruct.f56548o = finderBroadcastEidExposeStruct.b("ref_commentscene", "", true);
        if (str3 == null) {
            str3 = "";
        }
        finderBroadcastEidExposeStruct.s(str3);
        finderBroadcastEidExposeStruct.t(str4 != null ? r26.i0.t(str4, ",", ";", false) : "");
        finderBroadcastEidExposeStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidExposeStruct.k();
    }

    public final void b(java.lang.String commentScene, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct finderBroadcastEidClickStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastEidClickStruct();
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        finderBroadcastEidClickStruct.f56522d = java.lang.System.currentTimeMillis();
        finderBroadcastEidClickStruct.u("");
        finderBroadcastEidClickStruct.p("");
        finderBroadcastEidClickStruct.B("");
        finderBroadcastEidClickStruct.y("");
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        finderBroadcastEidClickStruct.w(Ri);
        if (str == null) {
            str = "";
        }
        finderBroadcastEidClickStruct.r(str);
        finderBroadcastEidClickStruct.q(commentScene);
        finderBroadcastEidClickStruct.A("");
        finderBroadcastEidClickStruct.x("");
        finderBroadcastEidClickStruct.v("");
        if (str2 == null) {
            str2 = "";
        }
        finderBroadcastEidClickStruct.s(str2);
        finderBroadcastEidClickStruct.t(str3 != null ? r26.i0.t(str3, ",", ";", false) : "");
        finderBroadcastEidClickStruct.z(((com.tencent.mm.feature.finder.live.v4) ((s40.w0) i95.n0.c(s40.w0.class))).ck());
        finderBroadcastEidClickStruct.k();
    }

    public final void c(java.lang.String hashCode, java.lang.String commentScene, java.lang.String pagId, java.lang.String pgUdfKv) {
        kotlin.jvm.internal.o.g(hashCode, "hashCode");
        kotlin.jvm.internal.o.g(commentScene, "commentScene");
        kotlin.jvm.internal.o.g(pagId, "pagId");
        kotlin.jvm.internal.o.g(pgUdfKv, "pgUdfKv");
        com.tencent.mars.xlog.Log.i("FinderLiveSquareReportUtil", "reportPageEnter commentScene: " + commentScene + " pagId: " + pagId + " pgUdfKv: " + pgUdfKv);
        com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct finderBroadcastPageInStruct = new com.tencent.mm.autogen.mmdata.rpt.FinderBroadcastPageInStruct();
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        finderBroadcastPageInStruct.q(b17);
        finderBroadcastPageInStruct.r(pagId);
        finderBroadcastPageInStruct.p(commentScene);
        finderBroadcastPageInStruct.s(r26.i0.t(pgUdfKv, ",", ";", false));
        ml2.b1.f327211a.b(new ml2.a1(hashCode, finderBroadcastPageInStruct));
    }
}
