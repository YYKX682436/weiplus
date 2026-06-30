package bp4;

/* loaded from: classes10.dex */
public final class u3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ju3.d0 f104925d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u3(ju3.d0 d0Var) {
        super(1);
        this.f104925d = d0Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putFloat("EDIT_TRACK_DURATION_SCALE", floatValue);
        this.f104925d.w(ju3.c0.f383429p2, bundle);
        return jz5.f0.f384359a;
    }
}
