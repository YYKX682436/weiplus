package zk3;

/* loaded from: classes8.dex */
public final class p0 implements kk3.d {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Object f555021a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ zk3.w0 f555022b;

    public p0(java.lang.Object obj, zk3.w0 w0Var) {
        this.f555021a = obj;
        this.f555022b = w0Var;
    }

    @Override // kk3.d
    public void b(android.graphics.Bitmap bitmap, int i17) {
        zk3.w0 w0Var = this.f555022b;
        zk3.o0 o0Var = w0Var.f555054h;
        int i18 = w0Var.f555053g;
        o0Var.mo50303x856b99f0(i18);
        o0Var.mo50307xb9e94560(i18, i18);
        o0Var.mo50303x856b99f0(0);
        o0Var.mo50307xb9e94560(0, w0Var.f555052f);
        java.lang.Object obj = this.f555021a;
        if (obj instanceof kk3.d) {
            kk3.d.a((kk3.d) obj, bitmap, 0, 2, null);
        }
    }

    @Override // kk3.d
    public void d(android.graphics.Bitmap bitmap, boolean z17, int i17) {
        java.lang.Object obj = this.f555021a;
        if (obj instanceof kk3.d) {
            kk3.d.c((kk3.d) obj, bitmap, false, 0, 6, null);
        }
        zk3.w0 w0Var = this.f555022b;
        w0Var.X6();
        w0Var.m80380x71e92c1d().setTranslationX(0.0f);
        android.content.Context context = w0Var.m80380x71e92c1d().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).T6(false);
    }

    @Override // kk3.d
    public void e(int i17) {
        java.lang.Object obj = this.f555021a;
        if (obj instanceof kk3.d) {
            kk3.d.f((kk3.d) obj, 0, 1, null);
        }
        zk3.w0 w0Var = this.f555022b;
        w0Var.X6();
        android.content.Context context = w0Var.m80380x71e92c1d().getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1894xb81dc63e.ui.uic.C16620x3de5dd31.class)).T6(true);
    }
}
