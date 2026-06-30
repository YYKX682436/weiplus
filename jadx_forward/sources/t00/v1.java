package t00;

/* loaded from: classes8.dex */
public final class v1 implements com.p314xaae8f345.mm.ui.da {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yz5.u f495894d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f495895e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f495896f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f495897g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ c00.n3 f495898h;

    public v1(yz5.u uVar, android.content.Context context, int i17, java.lang.String str, c00.n3 n3Var) {
        this.f495894d = uVar;
        this.f495895e = context;
        this.f495896f = i17;
        this.f495897g = str;
        this.f495898h = n3Var;
    }

    @Override // com.p314xaae8f345.mm.ui.xc
    /* renamed from: mmOnActivityResult */
    public final void mo9729x757c998b(int i17, int i18, android.content.Intent intent) {
        this.f495894d.K(this.f495895e, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), intent, java.lang.Integer.valueOf(this.f495896f), this.f495897g, this.f495898h);
    }
}
