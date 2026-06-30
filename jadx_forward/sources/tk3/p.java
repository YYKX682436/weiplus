package tk3;

/* loaded from: classes8.dex */
public final class p extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tk3.t f501471d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ float f501472e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(tk3.t tVar, float f17) {
        super(0);
        this.f501471d = tVar;
        this.f501472e = f17;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        tk3.d dVar;
        tk3.t tVar = this.f501471d;
        if (tVar.p() && (dVar = tVar.f501482d) != null) {
            dVar.b(this.f501472e);
        }
        return jz5.f0.f384359a;
    }
}
