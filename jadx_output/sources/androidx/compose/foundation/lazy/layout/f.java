package androidx.compose.foundation.lazy.layout;

/* loaded from: classes14.dex */
public final class f extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.foundation.lazy.layout.l f10398d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f10399e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(androidx.compose.foundation.lazy.layout.l lVar, int i17) {
        super(2);
        this.f10398d = lVar;
        this.f10399e = i17;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        n0.o oVar = (n0.o) obj;
        if ((((java.lang.Number) obj2).intValue() & 11) == 2) {
            n0.y0 y0Var = (n0.y0) oVar;
            if (y0Var.v()) {
                y0Var.O();
                return jz5.f0.f302826a;
            }
        }
        this.f10398d.d(this.f10399e, oVar, 0);
        return jz5.f0.f302826a;
    }
}
