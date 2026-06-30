package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class j9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 f266400d;

    public j9(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var) {
        this.f266400d = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.u7 u7Var = this.f266400d;
        if (u7Var.f268462e.get() != null) {
            java.lang.ref.WeakReference weakReference = u7Var.f268462e;
            if (((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).isFinishing()) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = (com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get();
            viewOnCreateContextMenuListenerC19337x37f3384d.getClass();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.oa oaVar = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.oa(viewOnCreateContextMenuListenerC19337x37f3384d);
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.s7 s7Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265337a3;
            s7Var.f268380a = oaVar;
            s7Var.f268384e = true;
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e5 = s7Var.f268382c;
            if (c19312x9ccd54e5 != null) {
                c19312x9ccd54e5.setVisibility(0);
                s7Var.f268382c.m74378x4b85c52a(s7Var);
                s7Var.f268382c.m74376x7bbd57d2(true);
                com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.C19312x9ccd54e5 c19312x9ccd54e52 = s7Var.f268382c;
                c19312x9ccd54e52.f265147p = false;
                c19312x9ccd54e52.m74379x428503fd(s7Var.f268383d);
            }
            android.widget.ImageView imageView = s7Var.f268381b;
            if (imageView != null) {
                imageView.setWillNotDraw(true);
                s7Var.f268381b.setImageResource(com.p314xaae8f345.mm.R.C30861xcebc809e.ci6);
                s7Var.f268381b.setVisibility(0);
                s7Var.f268381b.setAlpha(0.0f);
                s7Var.f268381b.setWillNotDraw(false);
                s7Var.f268381b.invalidate();
            }
            s7Var.b();
        }
    }
}
