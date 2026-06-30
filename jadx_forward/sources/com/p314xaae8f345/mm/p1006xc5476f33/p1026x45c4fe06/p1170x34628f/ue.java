package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class ue {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f168684b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f168685a;

    public ue(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 actionSheet, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h3 actionSheetController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionSheet, "actionSheet");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionSheetController, "actionSheetController");
        java.lang.String str = "MicroMsg.AppBrand.SupportRecentForwardController#" + hashCode();
        this.f168685a = str;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.o6 mo32091x9a3f0ba2 = pageView.mo32091x9a3f0ba2();
        if (mo32091x9a3f0ba2 != null && 1158 == mo32091x9a3f0ba2.g2()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "trySupportIfNeed, not need 1");
            return;
        }
        if (!(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.v0.SHOW_CLICKABLE == com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1159x33155f.l0.d(context, pageView))) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "trySupportIfNeed, not need 2");
            return;
        }
        if (actionSheet.R1 != 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "trySupportIfNeed, not need 3");
            return;
        }
        com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m mVar = ((o25.y1) i95.n0.c(o25.y1.class)) != null ? new com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m() : null;
        if (mVar == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(str, "trySupportIfNeed, recentForwardMenuHelper is null");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne neVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.ne(context, pageView, actionSheetController);
        actionSheet.f293409p = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.qe(mVar, context, actionSheet, actionSheetController);
        actionSheet.f293418w = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.se(mVar, this, context, pageView, neVar);
        actionSheet.f293419x = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.te(mVar, actionSheet);
    }
}
