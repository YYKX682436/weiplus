package cb0;

/* loaded from: classes10.dex */
public abstract class d implements ab0.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f121735a;

    /* renamed from: b, reason: collision with root package name */
    public final int f121736b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f121737c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f121738d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f121739e;

    /* renamed from: f, reason: collision with root package name */
    public final ab0.f0 f121740f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f121741g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f121742h;

    public d(android.content.Context context, int i17, byte[] bArr, java.lang.String str, boolean z17, ab0.f0 f0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f121735a = context;
        this.f121736b = i17;
        this.f121737c = bArr;
        this.f121738d = str;
        this.f121739e = z17;
        this.f121740f = f0Var;
    }

    public void a() {
        com.p314xaae8f345.mm.p944x882e457a.u0 u0Var;
        l41.e0 e0Var;
        java.lang.ref.WeakReference weakReference = this.f121741g;
        if (weakReference != null && (e0Var = (l41.e0) weakReference.get()) != null) {
            gm0.j1.d().d(e0Var);
        }
        java.lang.ref.WeakReference weakReference2 = this.f121742h;
        if (weakReference2 == null || (u0Var = (com.p314xaae8f345.mm.p944x882e457a.u0) weakReference2.get()) == null) {
            return;
        }
        gm0.j1.d().q(vb1.e.f77260x366c91de, u0Var);
    }

    public abstract l41.e0 b();

    public final void c(boolean z17, java.lang.String str, java.lang.String str2) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenIMJumpToProfile", "doCallback() called with: isSucceed = " + z17 + ", errMsg = " + str + ", errTips = " + str2);
        ab0.f0 f0Var = this.f121740f;
        if (f0Var != null) {
            f0Var.mo952x57429edc(z17, str, str2);
        }
    }

    public final void d() {
        l41.e0 b17 = b();
        if (b17 == null) {
            return;
        }
        cb0.c cVar = new cb0.c(b17, this);
        gm0.j1.d().a(vb1.e.f77260x366c91de, cVar);
        gm0.j1.d().g(b17);
        this.f121741g = new java.lang.ref.WeakReference(b17);
        this.f121742h = new java.lang.ref.WeakReference(cVar);
    }
}
