package cb0;

/* loaded from: classes10.dex */
public abstract class d implements ab0.a {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f40202a;

    /* renamed from: b, reason: collision with root package name */
    public final int f40203b;

    /* renamed from: c, reason: collision with root package name */
    public final byte[] f40204c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f40205d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f40206e;

    /* renamed from: f, reason: collision with root package name */
    public final ab0.f0 f40207f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.ref.WeakReference f40208g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.ref.WeakReference f40209h;

    public d(android.content.Context context, int i17, byte[] bArr, java.lang.String str, boolean z17, ab0.f0 f0Var) {
        kotlin.jvm.internal.o.g(context, "context");
        this.f40202a = context;
        this.f40203b = i17;
        this.f40204c = bArr;
        this.f40205d = str;
        this.f40206e = z17;
        this.f40207f = f0Var;
    }

    public void a() {
        com.tencent.mm.modelbase.u0 u0Var;
        l41.e0 e0Var;
        java.lang.ref.WeakReference weakReference = this.f40208g;
        if (weakReference != null && (e0Var = (l41.e0) weakReference.get()) != null) {
            gm0.j1.d().d(e0Var);
        }
        java.lang.ref.WeakReference weakReference2 = this.f40209h;
        if (weakReference2 == null || (u0Var = (com.tencent.mm.modelbase.u0) weakReference2.get()) == null) {
            return;
        }
        gm0.j1.d().q(vb1.e.CTRL_INDEX, u0Var);
    }

    public abstract l41.e0 b();

    public final void c(boolean z17, java.lang.String str, java.lang.String str2) {
        com.tencent.mars.xlog.Log.i("MicroMsg.OpenIMJumpToProfile", "doCallback() called with: isSucceed = " + z17 + ", errMsg = " + str + ", errTips = " + str2);
        ab0.f0 f0Var = this.f40207f;
        if (f0Var != null) {
            f0Var.onResult(z17, str, str2);
        }
    }

    public final void d() {
        l41.e0 b17 = b();
        if (b17 == null) {
            return;
        }
        cb0.c cVar = new cb0.c(b17, this);
        gm0.j1.d().a(vb1.e.CTRL_INDEX, cVar);
        gm0.j1.d().g(b17);
        this.f40208g = new java.lang.ref.WeakReference(b17);
        this.f40209h = new java.lang.ref.WeakReference(cVar);
    }
}
