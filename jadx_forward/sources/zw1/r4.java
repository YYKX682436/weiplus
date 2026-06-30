package zw1;

/* loaded from: classes5.dex */
public class r4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 f558312d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.t4 f558313e;

    public r4(zw1.t4 t4Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6) {
        this.f558313e = t4Var;
        this.f558312d = c22695xac2d47d6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6 = this.f558312d;
        c22695xac2d47d6.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f558313e.f558339c.mo55332x76847179().getSystemService("input_method")).showSoftInput(c22695xac2d47d6, 0);
    }
}
