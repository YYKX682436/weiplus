package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266621d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266622e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266623f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266624g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266625h;

    public f1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2, java.lang.String str3) {
        this.f266625h = c1Var;
        this.f266621d = str;
        this.f266622e = y2Var;
        this.f266623f = str2;
        this.f266624g = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.y2 y2Var = this.f266622e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266625h;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doAddToEmoticon use base64DataString");
        java.lang.String str = this.f266621d;
        int indexOf = str.indexOf(";base64,");
        try {
            byte[] decode = android.util.Base64.decode(indexOf != -1 ? str.substring(indexOf + 8, str.length()) : "", 0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(decode)) {
                c1Var.i5(y2Var, "addToEmoticon:fail", null);
                return;
            }
            java.lang.String g17 = kk.k.g(decode);
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
            java.lang.String g18 = n22.m.g();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
            java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g18, "", g17);
            if (!com.p314xaae8f345.mm.vfs.w6.j(p17) || !com.p314xaae8f345.mm.vfs.w6.p(p17).equalsIgnoreCase(g17)) {
                com.p314xaae8f345.mm.vfs.w6.S(p17, decode, 0, decode.length);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1.I3(c1Var, g17, this.f266623f, this.f266624g);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doAddToEmoticon error:" + e17.getMessage());
            c1Var.i5(y2Var, "addToEmoticon:fail_" + e17.getMessage(), null);
        }
    }
}
