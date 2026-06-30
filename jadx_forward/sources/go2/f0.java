package go2;

/* loaded from: classes2.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ go2.a1 f355506d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f355507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f355508f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f355509g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f355510h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(go2.a1 a1Var, java.lang.String str, android.content.Context context, boolean z17, boolean z18) {
        super(1);
        this.f355506d = a1Var;
        this.f355507e = str;
        this.f355508f = context;
        this.f355509g = z17;
        this.f355510h = z18;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var2;
        r45.xr0 xr0Var;
        r45.xr0 xr0Var2;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar != null) {
            eo2.f.f337098a.g(this.f355507e, fVar);
        }
        if (!((fVar == null || (xr0Var2 = (r45.xr0) fVar.f152151d) == null || xr0Var2.f471885e != 1) ? false : true)) {
            if (!((fVar == null || (xr0Var = (r45.xr0) fVar.f152151d) == null || xr0Var.f471885e != 2) ? false : true)) {
                if (!this.f355509g) {
                    com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var3 = this.f355506d.f355486m;
                    if ((y1Var3 != null && y1Var3.f()) && (y1Var2 = this.f355506d.f355486m) != null) {
                        y1Var2.q();
                    }
                    go2.a1 a1Var = this.f355506d;
                    a1Var.f355486m = a1Var.U6(this.f355508f, this.f355507e, 0);
                } else if (this.f355510h) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderMemberPayUIC", "doRetry");
                    long currentTimeMillis = java.lang.System.currentTimeMillis();
                    go2.a1 a1Var2 = this.f355506d;
                    if (currentTimeMillis - a1Var2.f355484h > a1Var2.f355485i) {
                        a1Var2.f355484h = currentTimeMillis;
                        ((ku5.t0) ku5.t0.f394148d).k(new go2.e0(this.f355506d, this.f355508f, this.f355507e, this.f355509g), 2000L);
                    }
                }
                return jz5.f0.f384359a;
            }
        }
        go2.a1 a1Var3 = this.f355506d;
        a1Var3.f355481e = false;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var4 = a1Var3.f355486m;
        if ((y1Var4 != null && y1Var4.f()) && (y1Var = this.f355506d.f355486m) != null) {
            y1Var.q();
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f355506d.m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((te2.e4) ((zy2.g8) pf5.z.f435481a.a(activity).c(zy2.g8.class))).f499507d.M0(this.f355507e);
        go2.a1 a1Var4 = this.f355506d;
        android.content.Context context = this.f355508f;
        java.lang.String str = this.f355507e;
        r45.xr0 xr0Var3 = (r45.xr0) fVar.f152151d;
        a1Var4.f355486m = a1Var4.U6(context, str, xr0Var3 != null ? xr0Var3.f471885e : 0);
        return jz5.f0.f384359a;
    }
}
