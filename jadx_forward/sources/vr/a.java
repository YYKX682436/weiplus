package vr;

/* loaded from: classes5.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vr.g f520923d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ yz5.l f520924e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(vr.g gVar, yz5.l lVar) {
        super(0);
        this.f520923d = gVar;
        this.f520924e = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        float a17 = vr.g.a(this.f520923d);
        boolean z17 = a17 == 0.0f;
        yz5.l lVar = this.f520924e;
        if (z17) {
            lVar.mo146xb9724478(0);
        } else {
            lVar.mo146xb9724478(java.lang.Integer.valueOf(java.lang.Math.round(qk.w9.a(r0.f520936a) / a17)));
        }
        return jz5.f0.f384359a;
    }
}
