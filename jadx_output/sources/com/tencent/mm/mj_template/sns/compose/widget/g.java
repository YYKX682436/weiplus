package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class g extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.mj_template.sns.compose.widget.q f69961d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(com.tencent.mm.mj_template.sns.compose.widget.q qVar) {
        super(2);
        this.f69961d = qVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        s1.l2 SubcomposeLayout = (s1.l2) obj;
        long j17 = ((p2.c) obj2).f351377a;
        kotlin.jvm.internal.o.g(SubcomposeLayout, "$this$SubcomposeLayout");
        long a17 = p2.c.a(j17, 0, 0, 0, p2.c.i(j17), 7, null);
        java.util.List b17 = ((s1.l0) SubcomposeLayout).b(1, u0.j.c(1748706044, true, new com.tencent.mm.mj_template.sns.compose.widget.f(this.f69961d)));
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(b17, 10));
        java.util.Iterator it = b17.iterator();
        while (it.hasNext()) {
            arrayList.add(((s1.r0) it.next()).m(a17));
        }
        return s1.v0.b(SubcomposeLayout, p2.c.h(j17), p2.c.g(j17), null, new com.tencent.mm.mj_template.sns.compose.widget.e(arrayList), 4, null);
    }
}
