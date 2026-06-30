package com.p314xaae8f345.mm.ui;

/* loaded from: classes11.dex */
public class m7 implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.o7 f290632d;

    public m7(com.p314xaae8f345.mm.ui.o7 o7Var) {
        this.f290632d = o7Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        android.view.inputmethod.InputMethodManager inputMethodManager;
        android.os.IBinder windowToken;
        com.p314xaae8f345.mm.ui.o7 o7Var = this.f290632d;
        java.lang.String charSequence = o7Var.f290987e.m79028xfb85ada3().toString();
        o7Var.f290987e.m79040x765074af("");
        o7Var.f290987e.clearFocus();
        com.p314xaae8f345.mm.ui.p2642x2e06d1.C21503x6e5a020a c21503x6e5a020a = o7Var.f290987e;
        int i18 = x51.t1.f533619a;
        com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f activityC21401x6ce6f73f = o7Var.f290983a;
        if (c21503x6e5a020a != null && (inputMethodManager = (android.view.inputmethod.InputMethodManager) activityC21401x6ce6f73f.getSystemService("input_method")) != null && (windowToken = c21503x6e5a020a.getWindowToken()) != null) {
            try {
                inputMethodManager.hideSoftInputFromWindow(windowToken, 0);
            } catch (java.lang.IllegalArgumentException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Util", "hide VKB(View) exception %s", e17);
            }
        }
        if (charSequence == null || charSequence.equals("")) {
            db5.e1.m(activityC21401x6ce6f73f, com.p314xaae8f345.mm.R.C30867xcad56011.k67, com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv, new com.p314xaae8f345.mm.ui.k7(this));
            return;
        }
        if (o7Var.f290991i == null) {
            o7Var.f290991i = new com.p314xaae8f345.mm.ui.j7(o7Var);
        }
        c01.d9.e().a(384, o7Var.f290991i);
        com.p314xaae8f345.mm.p957x53236a1b.l1 l1Var = new com.p314xaae8f345.mm.p957x53236a1b.l1(1, charSequence, "", "", "", false);
        c01.d9.e().g(l1Var);
        o7Var.f290989g = db5.e1.Q(o7Var.f290983a, o7Var.c(com.p314xaae8f345.mm.R.C30867xcad56011.f572106yv), o7Var.c(com.p314xaae8f345.mm.R.C30867xcad56011.irw), true, true, new com.p314xaae8f345.mm.ui.l7(this, l1Var));
    }
}
