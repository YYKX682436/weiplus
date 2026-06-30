package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class l2 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ u1.r1 f10624d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.platform.f4 f10625e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.p f10626f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f10627g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l2(u1.r1 r1Var, androidx.compose.ui.platform.f4 f4Var, yz5.p pVar, int i17) {
        super(2);
        this.f10624d = r1Var;
        this.f10625e = f4Var;
        this.f10626f = pVar;
        this.f10627g = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        ((java.lang.Number) obj2).intValue();
        int i17 = this.f10627g | 1;
        androidx.compose.ui.platform.f4 f4Var = this.f10625e;
        yz5.p pVar = this.f10626f;
        androidx.compose.ui.platform.m2.a(this.f10624d, f4Var, pVar, (n0.o) obj, i17);
        return jz5.f0.f302826a;
    }
}
