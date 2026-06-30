package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8;

/* loaded from: classes2.dex */
public final class f1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f207222d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 f207223e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.MenuItem f207224f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f207225g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160, android.view.MenuItem menuItem, int i17) {
        super(1);
        this.f207222d = abstractC14490x69736cb5;
        this.f207223e = activityC14945x8c20f160;
        this.f207224f = menuItem;
        this.f207225g = i17;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.String userName = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f207222d;
        boolean m59311x25315bf4 = abstractC14490x69736cb5.getFeedObject().m59311x25315bf4();
        android.view.MenuItem menuItem = this.f207224f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.ActivityC14945x8c20f160 activityC14945x8c20f160 = this.f207223e;
        if (m59311x25315bf4) {
            c61.yb ybVar = (c61.yb) i95.n0.c(c61.yb.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14945x8c20f160.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar).Nj(mo55332x76847179, userName, (db5.h4) menuItem, abstractC14490x69736cb5.getFeedObject(), new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.e1(abstractC14490x69736cb5));
        } else {
            c61.yb ybVar2 = (c61.yb) i95.n0.c(c61.yb.class);
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC14945x8c20f160.mo55332x76847179();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(menuItem, "$menuItem");
            ((c61.p2) ybVar2).Mj(mo55332x768471792, userName, (db5.h4) menuItem, abstractC14490x69736cb5.getFeedObject(), null);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3 x3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3.f206965a;
        activityC14945x8c20f160.getClass();
        x3Var.e(activityC14945x8c20f160, userName, abstractC14490x69736cb5.mo2128x1ed62e84(), this.f207225g);
        return jz5.f0.f384359a;
    }
}
