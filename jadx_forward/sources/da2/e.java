package da2;

/* loaded from: classes2.dex */
public final class e implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ da2.g f309273d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.zi2 f309274e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f309275f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f309276g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f309277h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ long f309278i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f309279m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f309280n;

    public e(da2.g gVar, r45.zi2 zi2Var, long j17, java.lang.String str, int i17, long j18, int i18, android.content.Context context) {
        this.f309273d = gVar;
        this.f309274e = zi2Var;
        this.f309275f = j17;
        this.f309276g = str;
        this.f309277h = i17;
        this.f309278i = j18;
        this.f309279m = i18;
        this.f309280n = context;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public final void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        menuItem.getItemId();
        if (menuItem.getItemId() == 1001 && da2.g.l(this.f309273d, this.f309274e, this.f309275f, this.f309276g, this.f309277h, this.f309278i, this.f309279m, false, null, 128, null)) {
            return;
        }
        this.f309273d.i(menuItem.getItemId(), this.f309280n, this.f309278i);
    }
}
