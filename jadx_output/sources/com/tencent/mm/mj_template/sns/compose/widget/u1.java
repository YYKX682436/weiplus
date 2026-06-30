package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes5.dex */
public final class u1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.paging.compose.e f70258d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f70259e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.t2 f70260f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f70261g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(androidx.paging.compose.e eVar, float f17, com.tencent.mm.mj_template.sns.compose.widget.t2 t2Var, n0.e5 e5Var) {
        super(1);
        this.f70258d = eVar;
        this.f70259e = f17;
        this.f70260f = t2Var;
        this.f70261g = e5Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        e0.u0 LazyColumn = (e0.u0) obj;
        kotlin.jvm.internal.o.g(LazyColumn, "$this$LazyColumn");
        androidx.paging.compose.e eVar = this.f70258d;
        if (eVar.d().f268193a instanceof g4.w0) {
            e0.r0.a(LazyColumn, null, null, com.tencent.mm.mj_template.sns.compose.widget.d0.f69914a, 3, null);
        } else if (eVar.d().f268193a instanceof g4.v0) {
            e0.r0.a(LazyColumn, null, null, com.tencent.mm.mj_template.sns.compose.widget.d0.f69915b, 3, null);
        } else if ((eVar.d().f268193a instanceof g4.w0) || (eVar.d().f268195c instanceof g4.w0) || eVar.c() != 0) {
            androidx.paging.compose.j.b(LazyColumn, eVar, com.tencent.mm.mj_template.sns.compose.widget.q1.f70186d, u0.j.c(1508269015, true, new com.tencent.mm.mj_template.sns.compose.widget.t1(this.f70259e, this.f70260f, this.f70261g)));
        } else {
            e0.r0.a(LazyColumn, null, null, com.tencent.mm.mj_template.sns.compose.widget.d0.f69916c, 3, null);
        }
        if (eVar.d().f268195c instanceof g4.w0) {
            e0.r0.a(LazyColumn, null, null, com.tencent.mm.mj_template.sns.compose.widget.d0.f69917d, 3, null);
        }
        return jz5.f0.f302826a;
    }
}
