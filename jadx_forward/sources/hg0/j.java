package hg0;

/* loaded from: classes12.dex */
public final class j implements java.util.function.Function {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.c0 f362859a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f362860b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f362861c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f362862d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f362863e;

    public j(p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var, java.lang.String str, boolean z17, boolean z18, boolean z19) {
        this.f362859a = c0Var;
        this.f362860b = str;
        this.f362861c = z17;
        this.f362862d = z18;
        this.f362863e = z19;
    }

    @Override // java.util.function.Function
    public java.lang.Object apply(java.lang.Object obj) {
        java.lang.String it = (java.lang.String) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        this.f362859a.f391645d = true;
        java.lang.String str = this.f362860b;
        boolean z17 = this.f362861c;
        boolean z18 = this.f362862d;
        boolean z19 = this.f362863e;
        boolean z27 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        return new hg0.g(str, z17, z18, z19, z19, android.os.SystemClock.elapsedRealtime(), null, 64, null);
    }
}
