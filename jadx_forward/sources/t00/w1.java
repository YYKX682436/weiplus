package t00;

/* loaded from: classes8.dex */
public final class w1 implements nf.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.u f495900a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f495901b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f495902c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495903d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495904e;

    public w1(yz5.u uVar, android.content.Context context, int i17, java.lang.String str, c00.n3 n3Var) {
        this.f495900a = uVar;
        this.f495901b = context;
        this.f495902c = i17;
        this.f495903d = str;
        this.f495904e = n3Var;
    }

    @Override // nf.k
    public final boolean a(int i17, int i18, android.content.Intent intent) {
        return ((java.lang.Boolean) this.f495900a.K(this.f495901b, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent, java.lang.Integer.valueOf(this.f495902c), this.f495903d, this.f495904e)).booleanValue();
    }
}
