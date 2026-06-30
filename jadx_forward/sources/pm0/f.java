package pm0;

/* loaded from: classes8.dex */
public final class f extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.a f438300d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.View f438301e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pm0.g f438302f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(yz5.a aVar, android.view.View view, pm0.g gVar) {
        super(0);
        this.f438300d = aVar;
        this.f438301e = view;
        this.f438302f = gVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        this.f438300d.mo152xb9724478();
        this.f438301e.removeOnLayoutChangeListener(this.f438302f);
        return jz5.f0.f384359a;
    }
}
