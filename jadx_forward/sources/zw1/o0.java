package zw1;

/* loaded from: classes5.dex */
public class o0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 f558279d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ zw1.q0 f558280e;

    public o0(zw1.q0 q0Var, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6) {
        this.f558280e = q0Var;
        this.f558279d = c22695xac2d47d6;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2758x5f8b9e37.C22695xac2d47d6 c22695xac2d47d6 = this.f558279d;
        c22695xac2d47d6.requestFocus();
        ((android.view.inputmethod.InputMethodManager) this.f558280e.f558296a.mo55332x76847179().getSystemService("input_method")).showSoftInput(c22695xac2d47d6, 0);
    }
}
