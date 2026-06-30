package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class ta extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f186134d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186135e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f186136f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar, in5.s0 s0Var) {
        super(0);
        this.f186134d = abstractC14490x69736cb5;
        this.f186135e = qeVar;
        this.f186136f = s0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        zy2.m7 feedTipsStatus;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f186134d;
        zy2.n7 n7Var = (abstractC14490x69736cb5 == null || (feedTipsStatus = abstractC14490x69736cb5.getFeedTipsStatus()) == null) ? null : feedTipsStatus.f559010c;
        if (n7Var != null) {
            n7Var.f559017a = true;
        }
        in5.s0 s0Var = this.f186136f;
        java.lang.Object obj = s0Var.f374658i;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "getAssociatedObject(...)");
        android.view.View p17 = s0Var.p(com.p314xaae8f345.mm.R.id.msw);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(p17, "getView(...)");
        this.f186135e.n0(s0Var, (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) obj, p17, 3);
        return jz5.f0.f384359a;
    }
}
