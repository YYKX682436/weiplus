package o51;

/* loaded from: classes15.dex */
public class f extends o51.d {

    /* renamed from: d, reason: collision with root package name */
    public int f424623d;

    /* renamed from: e, reason: collision with root package name */
    public int f424624e;

    /* renamed from: f, reason: collision with root package name */
    public p51.a f424625f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f424626g;

    /* renamed from: h, reason: collision with root package name */
    public int f424627h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f424628i;

    public f(int i17, int i18, android.content.Context context) {
        super(i17, i18);
        this.f424628i = context;
        p51.a aVar = this.f424625f;
        this.f424625f = aVar;
        if (aVar == null) {
            this.f424625f = new o51.e(this);
        }
        this.f424623d = i17;
        this.f424624e = i18;
    }

    @Override // o51.d, p51.b
    public java.lang.String a(int i17) {
        return (i17 == 0 && this.f424626g) ? this.f424628i.getString(this.f424627h) : super.a(i17);
    }

    @Override // o51.d, p51.b
    /* renamed from: b */
    public java.lang.Integer mo145523xfb80e389(int i17) {
        if (i17 < 0 || i17 >= mo145524x99620925()) {
            return null;
        }
        return this.f424626g ? java.lang.Integer.valueOf((this.f424623d + i17) - 1) : java.lang.Integer.valueOf(this.f424623d + i17);
    }

    @Override // o51.d
    public int c() {
        return this.f424624e;
    }

    @Override // o51.d
    public int d() {
        return this.f424623d;
    }

    @Override // o51.d, p51.b
    /* renamed from: getItemsCount */
    public int mo145524x99620925() {
        return (this.f424626g ? (this.f424624e - this.f424623d) + 1 : this.f424624e - this.f424623d) + 1;
    }
}
