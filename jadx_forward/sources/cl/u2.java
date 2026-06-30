package cl;

/* loaded from: classes7.dex */
public abstract class u2 {

    /* renamed from: d, reason: collision with root package name */
    public final cl.q0 f124307d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p159x477cd522.p160x333422.C1474xd5ce209a f124308e;

    /* renamed from: f, reason: collision with root package name */
    public final int f124309f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cl.w2 f124310g;

    public u2(cl.w2 w2Var, cl.q0 q0Var, int i17, com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a) {
        this.f124310g = w2Var;
        this.f124307d = q0Var;
        this.f124308e = c1474xd5ce209a;
        this.f124309f = i17;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void a() {
        b();
    }

    abstract void b();

    public void c(com.p159x477cd522.p160x333422.C1469x28b0ccd7 c1469x28b0ccd7) {
        com.p159x477cd522.p160x333422.C1474xd5ce209a c1474xd5ce209a = this.f124308e;
        if (c1474xd5ce209a.mo16335xafdb8087()) {
            return;
        }
        cl.q0 q0Var = this.f124307d;
        if (q0Var.f().m16393xafdb8087()) {
            return;
        }
        c1474xd5ce209a.m16420x2e7a5e(q0Var.f().mo16386x31ca9f38(), c1469x28b0ccd7);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean d() {
        return (this.f124308e.mo16335xafdb8087() || this.f124307d.f().m16393xafdb8087()) ? false : true;
    }
}
