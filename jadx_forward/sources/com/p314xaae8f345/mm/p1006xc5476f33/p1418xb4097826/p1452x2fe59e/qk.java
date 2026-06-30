package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class qk implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f190362d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl f190363e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 f190364f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f190365g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f190366h;

    public qk(yz5.a aVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5, int i17, in5.s0 s0Var) {
        this.f190362d = aVar;
        this.f190363e = tlVar;
        this.f190364f = abstractC14490x69736cb5;
        this.f190365g = i17;
        this.f190366h = s0Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        yz5.a aVar = this.f190362d;
        if (aVar != null) {
            aVar.mo152xb9724478();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.tl tlVar = this.f190363e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 = this.f190364f;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(menuItem);
        tlVar.c(abstractC14490x69736cb5, menuItem, i17, this.f190365g, this.f190366h);
    }
}
