package q92;

@j95.b
/* loaded from: classes10.dex */
public final class h extends l85.m1 implements m40.g0 {

    /* renamed from: i, reason: collision with root package name */
    public static final java.lang.String[] f442433i;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f442434g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f442435h;

    static {
        l75.e0 e0Var = m92.b.T1;
        f442433i = new java.lang.String[]{l75.n0.m145250x3fdc6f77(m92.b.T1, "FinderAccount")};
    }

    public h() {
        super("PluginFinderAccount");
        this.f442434g = jz5.h.b(new q92.e(this));
        this.f442435h = jz5.h.b(new q92.f(this));
    }

    public boolean Ai(java.lang.String username) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        ya2.b2 b17 = ya2.h.f542017a.b(username);
        if (b17 == null) {
            return false;
        }
        int i17 = b17.f69313xcad4ef95;
        l75.e0 e0Var = ya2.b2.O2;
        return i17 != ya2.b2.Q2;
    }

    @Override // i95.w
    /* renamed from: onAccountInitialized */
    public void mo204xfac946a6(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo204xfac946a6(context);
        ((g92.a) pf5.u.f435469a.e(m40.g0.class).c(g92.a.class)).r5(context);
    }

    @Override // l85.m1, i95.w
    /* renamed from: onAccountReleased */
    public void mo836xb8969aab(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        super.mo836xb8969aab(context);
    }
}
