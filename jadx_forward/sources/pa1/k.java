package pa1;

/* loaded from: classes7.dex */
public class k implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f434493d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pa1.o f434494e;

    public k(pa1.o oVar, java.lang.String str) {
        this.f434494e = oVar;
        this.f434493d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Window window;
        boolean z17 = al1.j0.a(this.f434493d) == al1.j0.BLACK;
        pa1.o oVar = this.f434494e;
        oVar.f434497m2 = z17;
        if (!(oVar.mo50352x76847179() instanceof android.app.Activity) || (window = ((android.app.Activity) oVar.mo50352x76847179()).getWindow()) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.v9.c(window, oVar.f434497m2);
    }
}
