package xs2;

/* loaded from: classes3.dex */
public final class h extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xs2.m f537864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f537865e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f537866f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(xs2.m mVar, int i17, int i18) {
        super(0);
        this.f537864d = mVar;
        this.f537865e = i17;
        this.f537866f = i18;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        xs2.o oVar = this.f537864d.f537884f;
        if (oVar != null) {
            oVar.f(this.f537865e * 1000, this.f537866f * 1000);
        }
        return jz5.f0.f384359a;
    }
}
