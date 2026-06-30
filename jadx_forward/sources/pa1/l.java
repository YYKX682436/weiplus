package pa1;

/* loaded from: classes7.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pa1.o f434495d;

    public l(pa1.o oVar) {
        this.f434495d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.Window window;
        pa1.o oVar = this.f434495d;
        if (!(oVar.mo50352x76847179() instanceof android.app.Activity) || (window = ((android.app.Activity) oVar.mo50352x76847179()).getWindow()) == null) {
            return;
        }
        com.p314xaae8f345.mm.ui.v9.c(window, oVar.f434497m2);
    }
}
