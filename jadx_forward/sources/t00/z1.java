package t00;

/* loaded from: classes9.dex */
public final class z1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ t00.e2 f495916a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f495917b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f495918c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495919d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495920e;

    public z1(t00.e2 e2Var, android.content.Context context, int i17, java.lang.String str, c00.n3 n3Var) {
        this.f495916a = e2Var;
        this.f495917b = context;
        this.f495918c = i17;
        this.f495919d = str;
        this.f495920e = n3Var;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        return t00.e2.h(this.f495916a, this.f495917b, i17, i18, intent, this.f495918c, this.f495919d, this.f495920e);
    }
}
