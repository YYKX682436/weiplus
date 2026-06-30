package um5;

/* loaded from: classes10.dex */
public final class g0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um5.i0 f510691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f510692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f510693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f510694g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f510695h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.l f510696i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(um5.i0 i0Var, int i17, int i18, int i19, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f510691d = i0Var;
        this.f510692e = i17;
        this.f510693f = i18;
        this.f510694g = i19;
        this.f510695h = str;
        this.f510696i = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int m97623x3164f87f = com.p314xaae8f345.tav.p2959x5befac44.C25779x3338e719.m97623x3164f87f(36197);
        um5.i0 i0Var = this.f510691d;
        xm5.b.c(i0Var.f510700t, "newVideoInputTexture id:" + m97623x3164f87f, new java.lang.Object[0]);
        android.graphics.SurfaceTexture surfaceTexture = new android.graphics.SurfaceTexture(m97623x3164f87f);
        um5.z zVar = new um5.z(this.f510695h, new um5.a0(m97623x3164f87f, true, this.f510692e, this.f510693f, this.f510694g, surfaceTexture), null);
        surfaceTexture.setOnFrameAvailableListener(um5.e0.f510682d);
        i0Var.f510701u.add(zVar);
        xm5.d.b(new um5.f0(this.f510696i, surfaceTexture));
        return jz5.f0.f384359a;
    }
}
