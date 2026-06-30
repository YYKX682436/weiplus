package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052;

/* loaded from: classes8.dex */
public class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f264784a;

    /* renamed from: b, reason: collision with root package name */
    public long f264785b = 0;

    public f0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f264784a = new java.lang.ref.WeakReference(viewOnCreateContextMenuListenerC19337x37f3384d);
    }

    public void a(java.lang.String str) {
        java.lang.ref.WeakReference weakReference = this.f264784a;
        if (weakReference.get() == null) {
            return;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - this.f264785b < 200) {
            return;
        }
        this.f264785b = currentTimeMillis;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.C19295x315485cc c19295x315485cc = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.C19295x315485cc();
        c19295x315485cc.f264768d = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).x7();
        c19295x315485cc.f264769e = str != null ? str.length() : 0;
        c19295x315485cc.f264770f = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).getIntent().getIntExtra("from_scence", 0);
        c19295x315485cc.f264771g = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d) weakReference.get()).getIntent().getStringExtra("geta8key_username");
        com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a, c19295x315485cc, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2413x7e9e6052.e0.class, null);
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4.f264447i.a(hy4.a0.f367611n);
    }
}
