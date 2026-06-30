package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class i9 implements android.view.MenuItem.OnMenuItemClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.ActivityC19424xb33d1de2 f266735d;

    public i9(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.ActivityC19424xb33d1de2 activityC19424xb33d1de2) {
        this.f266735d = activityC19424xb33d1de2;
    }

    @Override // android.view.MenuItem.OnMenuItemClickListener
    public boolean onMenuItemClick(android.view.MenuItem menuItem) {
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.ActivityC19424xb33d1de2 activityC19424xb33d1de2 = this.f266735d;
        int intExtra = activityC19424xb33d1de2.getIntent().getIntExtra("type", 0);
        java.lang.String stringExtra = activityC19424xb33d1de2.getIntent().getStringExtra("shortUrl");
        java.lang.String obj = activityC19424xb33d1de2.f266430e.getText().toString();
        ((ce0.e) ((de0.j) i95.n0.c(de0.j.class))).getClass();
        com.p314xaae8f345.mm.p957x53236a1b.e1 e1Var = new com.p314xaae8f345.mm.p957x53236a1b.e1(intExtra, stringExtra, obj);
        gm0.j1.d().g(e1Var);
        activityC19424xb33d1de2.f266429d = db5.e1.Q(activityC19424xb33d1de2.mo55332x76847179(), activityC19424xb33d1de2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), activityC19424xb33d1de2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lb6), true, true, new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.h9(this, e1Var));
        return true;
    }
}
