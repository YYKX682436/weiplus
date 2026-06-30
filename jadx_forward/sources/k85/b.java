package k85;

/* loaded from: classes5.dex */
public final class b extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f386903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ d85.g0 f386904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ d85.f0 f386905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386906g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f386907h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f386908i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(android.app.Activity activity, d85.g0 g0Var, d85.f0 f0Var, yz5.l lVar, yz5.l lVar2, java.lang.String str) {
        super(0);
        this.f386903d = activity;
        this.f386904e = g0Var;
        this.f386905f = f0Var;
        this.f386906g = lVar;
        this.f386907h = lVar2;
        this.f386908i = str;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        k85.t tVar = k85.t.f386972a;
        k85.t.f386973b.remove(this.f386903d + '_' + this.f386904e.f308725d);
        tVar.h(this.f386903d, this.f386904e, this.f386905f, this.f386906g, this.f386907h, this.f386908i);
        return jz5.f0.f384359a;
    }
}
