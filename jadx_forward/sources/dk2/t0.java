package dk2;

/* loaded from: classes.dex */
public final class t0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ek2.f f315620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f315621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f315622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315623g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(ek2.f fVar, int i17, int i18, java.lang.String str) {
        super(0);
        this.f315620d = fVar;
        this.f315621e = i17;
        this.f315622f = i18;
        this.f315623g = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        ek2.f fVar = this.f315620d;
        if (fVar != null) {
            fVar.b(this.f315621e, this.f315622f, this.f315623g);
        }
        return jz5.f0.f384359a;
    }
}
