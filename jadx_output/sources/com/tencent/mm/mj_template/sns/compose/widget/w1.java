package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class w1 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ float f70294d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f70295e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f70296f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w1(float f17, com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, androidx.paging.compose.e eVar) {
        super(2);
        this.f70294d = f17;
        this.f70295e = t2Var;
        this.f70296f = eVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        s1.r0 r0Var = (s1.r0) kz5.n0.Z(((s1.l0) SubcomposeLayout).b(0, u0.j.c(-1740260358, true, new com.tencent.mm.mj_template.sns.compose.widget.v1(this.f70295e, this.f70296f, (p2.c.h(j17) / this.f70294d) - (2 * 8)))));
        return s1.v0.b(SubcomposeLayout, p2.c.h(j17), p2.c.g(j17), null, new com.tencent.mm.mj_template.sns.compose.widget.p1(r0Var != null ? r0Var.m(j17) : null), 4, null);
    }
}
