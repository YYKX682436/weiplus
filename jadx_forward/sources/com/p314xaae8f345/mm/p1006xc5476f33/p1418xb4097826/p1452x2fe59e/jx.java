package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class jx implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz f188678a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f188679b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f188680c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f188681d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f188682e;

    public jx(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, in5.s0 s0Var) {
        this.f188678a = pzVar;
        this.f188679b = i17;
        this.f188680c = abstractC14490x69736cb5;
        this.f188681d = k0Var;
        this.f188682e = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.pz pzVar = this.f188678a;
        if (h4Var != null) {
            o25.y1 quickMenuHelper = pzVar.f190299r;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f188682e.f374654e, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quickMenuHelper, "quickMenuHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f188680c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet = this.f188681d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) quickMenuHelper).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(pzVar.U, "getMoreMenuItemLongSelectedListener :" + obj + ' ' + this.f188679b);
    }
}
