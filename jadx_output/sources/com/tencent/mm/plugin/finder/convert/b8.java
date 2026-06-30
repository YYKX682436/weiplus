package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class b8 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f102945d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b8(in5.s0 s0Var) {
        super(0);
        this.f102945d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        ws5.g gVar = (ws5.g) i95.n0.c(ws5.g.class);
        android.content.Context context = this.f102945d.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        ((wo2.k) gVar).Bi(context, new android.content.Intent());
        return jz5.f0.f302826a;
    }
}
