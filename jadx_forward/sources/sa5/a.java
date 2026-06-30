package sa5;

/* loaded from: classes14.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f486846d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f486847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ float f486848f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ long f486849g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f486850h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yz5.a f486851i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(int i17, android.view.View view, float f17, long j17, long j18, yz5.a aVar) {
        super(0);
        this.f486846d = i17;
        this.f486847e = view;
        this.f486848f = f17;
        this.f486849g = j17;
        this.f486850h = j18;
        this.f486851i = aVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        int i17 = this.f486846d;
        if (i17 > 1) {
            sa5.d.e(this.f486847e, this.f486848f, i17 - 1, this.f486849g, this.f486850h, this.f486851i);
        } else {
            yz5.a aVar = this.f486851i;
            if (aVar != null) {
                aVar.mo152xb9724478();
            }
        }
        return jz5.f0.f384359a;
    }
}
