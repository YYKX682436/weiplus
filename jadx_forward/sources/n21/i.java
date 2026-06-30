package n21;

/* loaded from: classes8.dex */
public class i extends com.p314xaae8f345.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ n21.o f415803d;

    public i(n21.o oVar) {
        this.f415803d = oVar;
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppBackground */
    public void mo8889x3be51a90(java.lang.String str) {
        n21.o oVar = this.f415803d;
        oVar.getClass();
        android.os.Looper.myQueue().addIdleHandler(new n21.j(oVar));
    }

    @Override // com.p314xaae8f345.mm.app.t2
    /* renamed from: onAppForeground */
    public void mo8890x1952ea5(java.lang.String str) {
        com.p314xaae8f345.mm.sdk.p2603x2137b148.i6 i6Var = this.f415803d.f415810a;
        synchronized (i6Var.f274277f) {
            i6Var.f274273b = true;
        }
    }
}
