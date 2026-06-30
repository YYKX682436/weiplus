package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class te extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104608d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public te(in5.s0 s0Var) {
        super(0);
        this.f104608d = s0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        in5.s0 s0Var = this.f104608d;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC finderSpeedControlUIC = (com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.viewmodel.component.FinderSpeedControlUIC.class);
        if (finderSpeedControlUIC != null) {
            finderSpeedControlUIC.X6(s0Var);
        }
        return jz5.f0.f302826a;
    }
}
