package rb5;

/* loaded from: classes11.dex */
public class g implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ rb5.l f475402d;

    public g(rb5.l lVar) {
        this.f475402d = lVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        rb5.l lVar = this.f475402d;
        lVar.mo2326xb052149b(1.0f);
        com.p314xaae8f345.mm.ui.p2740x696c9db.C22559x35245a10 c22559x35245a10 = lVar.f475418i;
        if (c22559x35245a10 != null && lVar.f475415f != null) {
            c22559x35245a10.c();
        }
        lVar.f475416g.mo78434x27949de2();
        lVar.m();
    }
}
