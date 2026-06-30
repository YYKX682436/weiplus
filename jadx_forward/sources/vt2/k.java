package vt2;

/* loaded from: classes3.dex */
public final class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ long f521500d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f521501e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521502f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521503g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ byte[] f521504h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f521505i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.y23 f521506m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ tt2.e1 f521507n;

    public k(long j17, long j18, java.lang.String str, java.lang.String str2, byte[] bArr, java.lang.String str3, r45.y23 y23Var, tt2.e1 e1Var) {
        this.f521500d = j17;
        this.f521501e = j18;
        this.f521502f = str;
        this.f521503g = str2;
        this.f521504h = bArr;
        this.f521505i = str3;
        this.f521506m = y23Var;
        this.f521507n = e1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str;
        boolean z17 = g92.b.f351302e.k2().m75939xb282bd08(4) == 3;
        long j17 = this.f521500d;
        long j18 = this.f521501e;
        java.lang.String str2 = this.f521502f;
        java.lang.String str3 = this.f521503g;
        if (z17) {
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            str = xy2.c.e(context);
        } else {
            str = null;
        }
        java.lang.String str4 = str;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g b17 = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(this.f521504h);
        java.util.LinkedList linkedList = new java.util.LinkedList();
        r45.hj6 hj6Var = new r45.hj6();
        hj6Var.set(0, 2);
        r45.xy2 xy2Var = new r45.xy2();
        r45.y23 y23Var = this.f521506m;
        xy2Var.set(0, java.lang.Long.valueOf(y23Var.m75942xfb822ef2(0)));
        hj6Var.set(1, com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(xy2Var.mo14344x5f01b1f6()));
        linkedList.add(hj6Var);
        new ek2.o2(j17, j18, str2, str3, str4, b17, linkedList, this.f521505i, new vt2.m(this.f521500d, y23Var, new java.lang.ref.WeakReference(this.f521507n)), null).l();
    }
}
