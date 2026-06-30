package zb3;

/* loaded from: classes9.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zb3.o f552811d;

    public n(zb3.o oVar) {
        this.f552811d = oVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        zb3.o oVar = this.f552811d;
        oVar.f552815g.m66122xd46dd964();
        ((android.view.inputmethod.InputMethodManager) oVar.f552815g.mo55332x76847179().getSystemService("input_method")).showSoftInput(oVar.f552814f, 0);
    }
}
