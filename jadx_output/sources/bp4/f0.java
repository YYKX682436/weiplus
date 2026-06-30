package bp4;

/* loaded from: classes2.dex */
public final class f0 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f23165d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z17) {
        super(1);
        this.f23165d = z17;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        android.graphics.Matrix it = (android.graphics.Matrix) obj;
        kotlin.jvm.internal.o.g(it, "it");
        return java.lang.Boolean.valueOf(this.f23165d);
    }
}
