package sa5;

/* loaded from: classes14.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f486860d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f486861e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f486862f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f486863g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f486864h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f486865i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(android.view.View view, long j17, float f17, long j18, int i17, yz5.a aVar) {
        super(0);
        this.f486860d = view;
        this.f486861e = j17;
        this.f486862f = f17;
        this.f486863g = j18;
        this.f486864h = i17;
        this.f486865i = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        android.view.View view = this.f486860d;
        float f17 = this.f486862f;
        long j17 = this.f486863g;
        int i17 = this.f486864h;
        long j18 = this.f486861e;
        view.postDelayed(new sa5.b(f17, view, j17, i17, j18, this.f486865i), j18);
        return jz5.f0.f384359a;
    }
}
