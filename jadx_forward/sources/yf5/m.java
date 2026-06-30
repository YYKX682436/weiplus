package yf5;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    public final yf5.w f543440a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f543441b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f543442c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a f543443d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f543444e;

    /* renamed from: f, reason: collision with root package name */
    public final yf5.e f543445f;

    public m(p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f activity, yf5.w dataSource) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataSource, "dataSource");
        this.f543440a = dataSource;
        this.f543441b = "MicroMsg.ConversationAdapter.ConversationDataController";
        this.f543442c = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("loadMoreScope", activity, 0, 4, null);
        this.f543443d = new com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a("updateScope", activity, 0, 4, null);
        this.f543444e = new java.util.HashMap();
        this.f543445f = new yf5.e(com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697, 0);
    }

    public final java.util.List a() {
        int i17 = this.f543445f.f543397b;
        yf5.k0 k0Var = new yf5.k0();
        k0Var.f543429b = i17;
        k0Var.f543431d = 30;
        yf5.l0 g17 = this.f543440a.g(k0Var);
        d(i17, g17.f543439d);
        java.util.ArrayList arrayList = g17.f543437b;
        return arrayList != null ? arrayList : new java.util.ArrayList();
    }

    public final void b() {
        synchronized (this.f543445f) {
            yf5.e eVar = this.f543445f;
            eVar.f543397b++;
            eVar.f543396a = com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697;
        }
        yf5.w0 w0Var = this.f543440a.f543498i;
        if (w0Var != null) {
            w0Var.a();
        }
        v65.i.b(this.f543442c, null, new yf5.h(this, this.f543445f.f543397b, new yf5.i(this), null), 1, null);
    }

    public final void c(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        v65.i.b(this.f543443d, null, new yf5.j(this, username, this.f543445f.f543397b, null), 1, null);
    }

    public final void d(int i17, long j17) {
        synchronized (this.f543445f) {
            yf5.e eVar = this.f543445f;
            if (i17 == eVar.f543397b) {
                eVar.f543396a = j17;
            }
        }
    }
}
