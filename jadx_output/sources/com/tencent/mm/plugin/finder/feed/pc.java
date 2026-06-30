package com.tencent.mm.plugin.finder.feed;

/* loaded from: classes2.dex */
public final class pc extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.id f108712d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pc(com.tencent.mm.plugin.finder.feed.id idVar) {
        super(1);
        this.f108712d = idVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        so2.f1 f1Var = (so2.f1) kz5.n0.a0(this.f108712d.f107007m, ((java.lang.Number) obj).intValue());
        return java.lang.Boolean.valueOf(f1Var == null || (f1Var.f410341i == null && f1Var.f410342m == null && !kotlin.jvm.internal.o.b(f1Var.f410336d.getString(5), c01.z1.r())));
    }
}
