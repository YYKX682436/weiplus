package bp4;

/* loaded from: classes10.dex */
public final class u3 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f23392d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(ju3.d0 d0Var) {
        super(1);
        this.f23392d = d0Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("EDIT_TRACK_DURATION_SCALE", floatValue);
        this.f23392d.w(ju3.c0.f301896p2, bundle);
        return jz5.f0.f302826a;
    }
}
