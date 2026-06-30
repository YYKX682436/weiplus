package com.tencent.mm.mj_template.sns.compose.widget;

/* loaded from: classes14.dex */
public final class k6 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f70036d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k6(boolean z17) {
        super(1);
        this.f70036d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        java.lang.String r17;
        y1.p0 semantics = (y1.p0) obj;
        kotlin.jvm.internal.o.g(semantics, "$this$semantics");
        if (this.f70036d) {
            r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.d_);
            kotlin.jvm.internal.o.d(r17);
        } else {
            r17 = i65.a.r(com.tencent.mm.sdk.platformtools.x2.f193071a, com.tencent.mm.R.string.f489843db);
            kotlin.jvm.internal.o.d(r17);
        }
        f06.v[] vVarArr = y1.m0.f458770a;
        y1.m0.f458771b.a(semantics, y1.m0.f458770a[0], r17);
        return jz5.f0.f302826a;
    }
}
