package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class v1 implements j35.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266988a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266989b;

    public v1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, nw4.y2 y2Var) {
        this.f266989b = c1Var;
        this.f266988a = y2Var;
    }

    @Override // j35.g0
    public void a(int i17, int i18, android.content.Intent intent) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doChooseImageIdCard back from settings, resultCode: %d", java.lang.Integer.valueOf(i18));
        nw4.y2 y2Var = this.f266988a;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266989b;
        if (i18 == -1) {
            c1Var.w5(y2Var);
        } else {
            c1Var.i5(y2Var, "doChooseIdCard:fail_android_permission_denied", null);
        }
    }
}
