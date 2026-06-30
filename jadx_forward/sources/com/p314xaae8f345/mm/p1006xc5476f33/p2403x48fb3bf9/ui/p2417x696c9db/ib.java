package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class ib implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f266369d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266370e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f266371f;

    public ib(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d, boolean z17, java.lang.String str) {
        this.f266371f = viewOnCreateContextMenuListenerC19337x37f3384d;
        this.f266369d = z17;
        this.f266370e = str;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        boolean z17 = this.f266369d;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f266371f;
        if (z17) {
            viewOnCreateContextMenuListenerC19337x37f3384d.V8(this.f266370e);
            return true;
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.X8();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.e3 e3Var = viewOnCreateContextMenuListenerC19337x37f3384d.L1;
        if (e3Var == null) {
            return true;
        }
        e3Var.O0(2);
        return true;
    }
}
