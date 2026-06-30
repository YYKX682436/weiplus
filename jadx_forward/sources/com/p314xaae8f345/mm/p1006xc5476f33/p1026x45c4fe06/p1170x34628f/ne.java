package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f;

/* loaded from: classes7.dex */
public final class ne {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f168464a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f168465b;

    /* renamed from: c, reason: collision with root package name */
    public int f168466c;

    public ne(android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.n7 pageView, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.h3 actionSheetController) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pageView, "pageView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(actionSheetController, "actionSheetController");
        this.f168464a = "MicroMsg.AppBrand.SupportRecentForwardController.ReportLogic#" + hashCode();
        this.f168465b = "";
        this.f168466c = 1;
        actionSheetController.f168051n = new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.le(this);
        ((java.util.HashSet) actionSheetController.f168050m).add(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.me(this, context));
    }

    public final void a(boolean z17) {
        int i17;
        if (z17) {
            i17 = this.f168465b.length() > 0 ? 3 : 2;
        } else {
            i17 = 4;
        }
        this.f168466c = i17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f168464a, "doSomethingOnMenuClick, toUser: " + this.f168465b + ", exitType: " + this.f168466c);
    }
}
