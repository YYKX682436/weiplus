package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db;

/* loaded from: classes8.dex */
public class c7 implements db5.t4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 f265607d;

    public c7(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var) {
        this.f265607d = c6Var;
    }

    @Override // db5.t4
    /* renamed from: onMMMenuItemSelected */
    public void mo888x34063ac(android.view.MenuItem menuItem, int i17) {
        int itemId = menuItem.getItemId();
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.c6 c6Var = this.f265607d;
        if (itemId == 1) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(c6Var.c().F7(), 1, 1, c6Var.b().getStringExtra("KPublisherId"), c6Var.b().getStringExtra("KAppId"), c6Var.b().getStringExtra("srcUsername"));
            c6Var.c().H8(1);
        } else {
            if (itemId != 2) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.t5.a(c6Var.c().F7(), 2, 1, c6Var.b().getStringExtra("KPublisherId"), c6Var.b().getStringExtra("KAppId"), c6Var.b().getStringExtra("srcUsername"));
            c6Var.e0(c6Var.f265588l.containsKey(c6Var.c().f265348f.mo120156xb5887639()) ? ((java.lang.Integer) c6Var.f265588l.get(c6Var.c().f265348f.mo120156xb5887639())).intValue() : 0, 1);
        }
    }
}
