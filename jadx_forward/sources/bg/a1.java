package bg;

/* loaded from: classes7.dex */
public class a1 extends tf.i {

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f101274h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ bg.b1 f101275i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(bg.b1 b1Var, com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c c3961x5e8e15c, java.lang.Runnable runnable) {
        super(b1Var, c3961x5e8e15c, runnable);
        this.f101275i = b1Var;
        this.f101274h = null;
    }

    @Override // tf.i
    public void b() {
        this.f101275i.h(null);
    }

    @Override // tf.i
    public boolean c(android.view.Surface surface, int i17, int i18) {
        android.view.Surface surface2 = this.f101274h;
        if (surface2 != null && surface2 == surface) {
            return true;
        }
        try {
            boolean T = this.f101275i.f101277g.f343401a.T(surface);
            if (T) {
                this.f101274h = surface;
            }
            return T;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
