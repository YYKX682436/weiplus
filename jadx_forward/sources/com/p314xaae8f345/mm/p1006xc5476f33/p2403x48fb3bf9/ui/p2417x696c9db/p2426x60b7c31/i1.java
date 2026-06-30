package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31;

/* loaded from: classes.dex */
public class i1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266716d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.y2 f266717e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f266718f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 f266719g;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var, java.lang.String str, nw4.y2 y2Var, java.lang.String str2) {
        this.f266719g = c1Var;
        this.f266716d = str;
        this.f266717e = y2Var;
        this.f266718f = str2;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.y2 y2Var = this.f266717e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.c1 c1Var = this.f266719g;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MsgHandler", "doShareEmoticon use base64DataString");
        java.lang.String str = this.f266716d;
        int indexOf = str.indexOf(";base64,");
        try {
            byte[] decode = android.util.Base64.decode(indexOf != -1 ? str.substring(indexOf + 8, str.length()) : "", 0);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(decode)) {
                c1Var.i5(y2Var, "shareEmoticon:fail", null);
                return;
            }
            java.lang.String g17 = kk.k.g(decode);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(g17)) {
                c1Var.i5(y2Var, "shareEmoticon:fail empty buffer", null);
                return;
            }
            com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5 x5Var = (com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.x5.class);
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.h2) ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6) i95.n0.c(com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.api.j6.class))).getClass();
            java.lang.String g18 = n22.m.g();
            ((com.p314xaae8f345.mm.p689xc5a27af6.p741x5c28046.o0) x5Var).getClass();
            java.lang.String p17 = com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.p1368x633fb29.C13262xa27596d8.p(g18, "", g17);
            if (!com.p314xaae8f345.mm.vfs.w6.j(p17) || !com.p314xaae8f345.mm.vfs.w6.p(p17).equalsIgnoreCase(g17)) {
                com.p314xaae8f345.mm.vfs.w6.S(p17, decode, 0, decode.length);
            }
            c1Var.getClass();
            com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2426x60b7c31.l1(c1Var, g17, this.f266718f));
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MsgHandler", "doShareEmoticon error:" + e17.getMessage());
            c1Var.i5(y2Var, "shareEmoticon:fail_" + e17.getMessage(), null);
        }
    }
}
