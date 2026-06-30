package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class r50 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 f195620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f195621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f195622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195623g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.View f195624h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r50(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var2, android.view.View view, android.view.View view2) {
        super(0);
        this.f195620d = r60Var;
        this.f195621e = ep0Var;
        this.f195622f = ep0Var2;
        this.f195623g = view;
        this.f195624h = view2;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.r60 r60Var = this.f195620d;
        r60Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f195621e;
        if (ep0Var instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ea0) {
            r60Var.B1(this.f195622f, ep0Var);
        } else {
            r60Var.D1("addPromoteBubbleAnim", this.f195623g);
            android.view.ViewGroup viewGroup = r60Var.f195635w;
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
                throw null;
            }
            viewGroup.addView(this.f195624h);
            if (viewGroup == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("promoteBubbleContainer");
                throw null;
            }
            viewGroup.requestLayout();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.l.b1(r60Var, null, r60Var.f195631s, false, 4, null);
        }
        return jz5.f0.f384359a;
    }
}
