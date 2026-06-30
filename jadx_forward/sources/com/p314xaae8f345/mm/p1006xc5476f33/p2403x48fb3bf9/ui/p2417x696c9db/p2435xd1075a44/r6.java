package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44;

/* loaded from: classes7.dex */
public class r6 implements android.content.DialogInterface.OnDismissListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6 f269059d;

    public r6(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2435xd1075a44.x6 x6Var) {
        this.f269059d = x6Var;
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(android.content.DialogInterface dialogInterface) {
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21467xa0ba12ff c21467xa0ba12ff = this.f269059d.f269136c;
        if (c21467xa0ba12ff != null) {
            c21467xa0ba12ff.setAdapter((android.widget.ListAdapter) null);
        }
    }
}
