package dk5;

/* loaded from: classes9.dex */
public class p7 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f316346a;

    /* renamed from: b, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f316347b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f316348c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f316349d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f316350e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f316351f;

    /* renamed from: h, reason: collision with root package name */
    public int f316353h;

    /* renamed from: j, reason: collision with root package name */
    public dk5.o7 f316355j;

    /* renamed from: g, reason: collision with root package name */
    public boolean f316352g = false;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.Runnable f316354i = new dk5.n7(this);

    public p7(android.content.Context context) {
        this.f316346a = context;
    }

    public void a() {
        this.f316349d = true;
        if (true && this.f316348c) {
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.l(this.f316354i);
            dk5.o7 o7Var = this.f316355j;
            if (o7Var != null) {
                o7Var.a(this.f316350e, this.f316351f, this.f316353h, this.f316352g);
            }
        }
    }

    public void b(boolean z17, java.lang.String str, int i17, boolean z18) {
        this.f316348c = true;
        this.f316350e = z17;
        this.f316351f = str;
        this.f316353h = i17;
        this.f316352g = z18;
        if (true && this.f316349d) {
            dk5.o7 o7Var = this.f316355j;
            if (o7Var != null) {
                o7Var.a(z17, str, i17, z18);
                return;
            }
            return;
        }
        if (z17) {
            android.content.Context context = this.f316346a;
            this.f316347b = db5.e1.Q(context, "", context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iij), false, true, null);
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.i(this.f316354i, 5000L);
        }
    }
}
