package mw2;

/* loaded from: classes2.dex */
public final class g extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.q f413248d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f413249e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f413250f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(yz5.q qVar, int i17, int i18) {
        super(1);
        this.f413248d = qVar;
        this.f413249e = i17;
        this.f413250f = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(this.f413249e);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(this.f413250f);
        this.f413248d.mo147xb9724478((android.graphics.Bitmap) obj, valueOf, valueOf2);
        return jz5.f0.f384359a;
    }
}
