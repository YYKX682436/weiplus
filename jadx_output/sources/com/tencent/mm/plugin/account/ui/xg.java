package com.tencent.mm.plugin.account.ui;

/* loaded from: classes14.dex */
public class xg implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.modelbase.m1 f74325d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.account.ui.RegSetInfoUI f74326e;

    public xg(com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI, com.tencent.mm.modelbase.m1 m1Var) {
        this.f74326e = regSetInfoUI;
        this.f74325d = m1Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        com.tencent.mm.plugin.account.ui.RegSetInfoUI regSetInfoUI = this.f74326e;
        java.lang.String trim = regSetInfoUI.f73629d.getText().toString().trim();
        java.lang.String trim2 = regSetInfoUI.f73630e.getText().toString().trim();
        if (trim == null || trim.length() <= 0) {
            db5.e1.i(regSetInfoUI, com.tencent.mm.R.string.f493434k60, com.tencent.mm.R.string.hwx);
            return;
        }
        regSetInfoUI.hideVKB();
        int V6 = regSetInfoUI.V6();
        java.lang.String U6 = regSetInfoUI.U6();
        gm0.j1.d().a(com.tencent.wxmm.v2helper.EMethodSetIosMicAbCheckOff, regSetInfoUI);
        r61.m1 m1Var = new r61.m1(U6, regSetInfoUI.f73637o, V6, trim, trim2, ((r61.l1) ((r61.m1) this.f74325d).f392906d).f392898b.f393003a.f385884f, regSetInfoUI.f73642t.getSecImgCode());
        gm0.j1.d().g(m1Var);
        regSetInfoUI.f73632g = db5.e1.Q(regSetInfoUI, regSetInfoUI.getString(com.tencent.mm.R.string.f490573yv), regSetInfoUI.getString(com.tencent.mm.R.string.hxk), true, true, new com.tencent.mm.plugin.account.ui.wg(this, m1Var));
    }
}
