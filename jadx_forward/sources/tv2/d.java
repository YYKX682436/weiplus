package tv2;

/* loaded from: classes10.dex */
public final class d extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.e0 f503818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ tv2.f f503819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f503820f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f503821g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var, tv2.f fVar, int i17, int i18) {
        super(1);
        this.f503818d = e0Var;
        this.f503819e = fVar;
        this.f503820f = i17;
        this.f503821g = i18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        float floatValue = ((java.lang.Number) obj).floatValue();
        p3321xbce91901.jvm.p3324x21ffc6bd.e0 e0Var = this.f503818d;
        if (floatValue - e0Var.f391648d > 0.1f) {
            tv2.f fVar = this.f503819e;
            fVar.f503833h.m59260x51f8f5b0();
            fVar.p((this.f503820f + floatValue) / this.f503821g);
            e0Var.f391648d = floatValue;
        }
        return jz5.f0.f384359a;
    }
}
