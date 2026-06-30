package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class u0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.q2 f10753d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u0(androidx.compose.ui.platform.q2 q2Var) {
        super(1);
        this.f10753d = q2Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        return new androidx.compose.ui.platform.t0(this.f10753d);
    }
}
