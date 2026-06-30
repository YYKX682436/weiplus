package j00;

/* loaded from: classes9.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ j00.k1 f378262d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f378263e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.o f378264f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378265g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f378266h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f378267i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f378268m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yz5.q f378269n;

    public c1(j00.k1 k1Var, android.content.Context context, com.p314xaae8f345.mm.p944x882e457a.o oVar, java.lang.String str, yz5.a aVar, java.lang.String str2, java.util.Map map, yz5.q qVar) {
        this.f378262d = k1Var;
        this.f378263e = context;
        this.f378264f = oVar;
        this.f378265g = str;
        this.f378266h = aVar;
        this.f378267i = str2;
        this.f378268m = map;
        this.f378269n = qVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 Q = db5.e1.Q(j00.k1.Ai(this.f378262d, this.f378263e), null, com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572138zr), true, true, j00.b1.f378250d);
        if (Q != null) {
            Q.show();
        }
        com.p314xaae8f345.mm.p944x882e457a.z2.d(this.f378264f, new j00.a1(this.f378265g, Q, this.f378266h, this.f378262d, this.f378267i, this.f378268m, this.f378269n), false);
    }
}
