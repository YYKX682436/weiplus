package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes8.dex */
public class z6 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 f269168d;

    public z6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var) {
        this.f269168d = d7Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.d7 d7Var = this.f269168d;
        android.view.ViewTreeObserver viewTreeObserver = d7Var.f268701n;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                d7Var.f268701n = d7Var.f268696f.getViewTreeObserver();
            }
            d7Var.f268701n.removeGlobalOnLayoutListener(d7Var);
            d7Var.f268701n = null;
        }
        android.graphics.Bitmap bitmap = d7Var.f268702o;
        if (bitmap != null && !bitmap.isRecycled()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WebMenuContainer", "bitmap recycle %s", d7Var.f268702o.toString());
            d7Var.f268702o.recycle();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.f7 f7Var = d7Var.f268694d;
        if (f7Var != null) {
            com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.g.b(f7Var);
        }
    }
}
