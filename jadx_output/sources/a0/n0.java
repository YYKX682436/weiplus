package a0;

/* loaded from: classes14.dex */
public final class n0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f234d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.y0 f235e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f236f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c0.o f237g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(boolean z17, kotlinx.coroutines.y0 y0Var, n0.v2 v2Var, c0.o oVar) {
        super(1);
        this.f234d = z17;
        this.f235e = y0Var;
        this.f236f = v2Var;
        this.f237g = oVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        n0.b2 DisposableEffect = (n0.b2) obj;
        kotlin.jvm.internal.o.g(DisposableEffect, "$this$DisposableEffect");
        if (!this.f234d) {
            kotlinx.coroutines.l.d(this.f235e, null, null, new a0.l0(this.f236f, this.f237g, null), 3, null);
        }
        return new a0.m0();
    }
}
