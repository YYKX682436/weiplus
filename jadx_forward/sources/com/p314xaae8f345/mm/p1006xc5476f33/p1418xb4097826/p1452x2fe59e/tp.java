package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class tp implements db5.s4 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr f190634a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f190635b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 f190636c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f190637d;

    public tp(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var, in5.s0 s0Var) {
        this.f190634a = krVar;
        this.f190635b = abstractC14490x69736cb5;
        this.f190636c = k0Var;
        this.f190637d = s0Var;
    }

    @Override // db5.s4
    public final void a(android.view.MenuItem menuItem, int i17) {
        java.lang.Object obj;
        db5.h4 h4Var = menuItem instanceof db5.h4 ? (db5.h4) menuItem : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.kr krVar = this.f190634a;
        if (h4Var != null) {
            o25.y1 quickMenuHelper = krVar.D;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(this.f190637d.f374654e, "getContext(...)");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(quickMenuHelper, "quickMenuHelper");
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 feed = this.f190635b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feed, "feed");
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 sheet = this.f190636c;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sheet, "sheet");
            ((com.p314xaae8f345.mm.p2470x93e71c27.p2472xd7a392c5.m) quickMenuHelper).bj(sheet, h4Var);
            obj = h4Var;
        } else {
            obj = java.lang.Boolean.FALSE;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(krVar.f188776t, "getMoreMenuItemLongSelectedListener :" + obj);
    }
}
