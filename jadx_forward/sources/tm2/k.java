package tm2;

/* loaded from: classes3.dex */
public final class k extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f502067d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f502068e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(boolean z17, tm2.s2 s2Var) {
        super(1);
        this.f502067d = z17;
        this.f502068e = s2Var;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        if (((java.lang.Boolean) obj).booleanValue()) {
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putBoolean("PARAM_FINDER_LIVE_START_BY_MINI_WINDOW", this.f502067d);
            fm2.b bVar = this.f502068e.f101134c;
            if (bVar != null) {
                bVar.mo46557x60d69242(qo0.b.f446919n, bundle);
            }
        }
        return jz5.f0.f384359a;
    }
}
