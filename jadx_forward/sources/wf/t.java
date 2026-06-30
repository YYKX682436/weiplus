package wf;

/* loaded from: classes7.dex */
public class t extends tf.i {

    /* renamed from: h, reason: collision with root package name */
    public android.view.Surface f527015h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wf.u f527016i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(wf.u uVar, com.p314xaae8f345.p425x1ea3c036.p451xfa7dc33e.p452x1688f2cd.p453xac8f1cfd.p456x6b0147b.C3961x5e8e15c c3961x5e8e15c, java.lang.Runnable runnable) {
        super(uVar, c3961x5e8e15c, runnable);
        this.f527016i = uVar;
        this.f527015h = null;
    }

    @Override // tf.i
    public void b() {
    }

    @Override // tf.i
    public boolean c(android.view.Surface surface, int i17, int i18) {
        boolean z17;
        try {
            android.view.Surface surface2 = this.f527015h;
            if (surface2 != null && surface2 == surface) {
                surface = null;
            }
            wf.u uVar = this.f527016i;
            if (surface != null) {
                wf.b bVar = uVar.f527017g.f543184a;
                bVar.f526950h = surface;
                z17 = bVar.N(surface);
                if (z17) {
                    this.f527015h = surface;
                }
            } else {
                z17 = true;
            }
            if (z17) {
                uVar.f527017g.b(i17, i18);
            }
            return z17;
        } catch (java.lang.Exception unused) {
            return false;
        }
    }
}
