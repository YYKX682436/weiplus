package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class bb implements com.p314xaae8f345.p3210x3857dc.g1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d f265529a;

    public bb(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d) {
        this.f265529a = viewOnCreateContextMenuListenerC19337x37f3384d;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public boolean a(int i17, int i18, int i19, int i27, int i28, int i29, int i37, int i38, boolean z17, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265529a;
        if (viewOnCreateContextMenuListenerC19337x37f3384d.f265348f == null) {
            return false;
        }
        al5.m2 m2Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265389s3;
        if (m2Var == null) {
            return true;
        }
        m2Var.m(i17, i18, i19, i27, i28, i29, i37, i38, z17);
        return true;
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void b(int i17) {
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void d(int i17, int i18, int i19, int i27, android.view.View view) {
        al5.m2 m2Var = this.f265529a.f265389s3;
        if (m2Var != null) {
            m2Var.d(i17, i18, i19, i27, view);
        }
    }

    @Override // com.p314xaae8f345.p3210x3857dc.g1
    public void e(int i17, int i18, boolean z17, boolean z18, android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ViewOnCreateContextMenuListenerC19337x37f3384d viewOnCreateContextMenuListenerC19337x37f3384d = this.f265529a;
        al5.m2 m2Var = viewOnCreateContextMenuListenerC19337x37f3384d.f265389s3;
        if (m2Var != null) {
            m2Var.e(i17, i18, z17, z18, view);
        }
        viewOnCreateContextMenuListenerC19337x37f3384d.M2 = i18 == 0 && z18;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.ld ldVar = viewOnCreateContextMenuListenerC19337x37f3384d.f265399w2;
        if (ldVar != null) {
            ldVar.m();
        }
    }
}
