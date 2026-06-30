package com.p314xaae8f345.mm.ui.p2690x38b72420;

/* loaded from: classes11.dex */
public abstract class g1 {
    public static void a(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, com.p314xaae8f345.mm.p2621x8fb0427b.y8 y8Var, boolean z17, boolean z18, android.os.Bundle bundle, java.lang.String str) {
        if (z3Var == null || y8Var == null || z3Var.d1() == null || z3Var.d1().length() <= 0) {
            return;
        }
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("Contact_User", z3Var.d1());
        intent.putExtra("Contact_Alias", z3Var.t0());
        intent.putExtra("Contact_Nick", z3Var.f2());
        intent.putExtra("Contact_QuanPin", z3Var.U0());
        intent.putExtra("Contact_PyInitial", z3Var.T0());
        intent.putExtra("Contact_Sex", y8Var.f277905o);
        intent.putExtra("Contact_Province", y8Var.f());
        intent.putExtra("Contact_City", y8Var.b());
        intent.putExtra("Contact_Signature", y8Var.f277906p);
        intent.putExtra("Contact_Uin", y8Var.f277900j);
        intent.putExtra("Contact_Mobile_MD5", y8Var.f277898h);
        intent.putExtra("Contact_full_Mobile_MD5", y8Var.f277899i);
        intent.putExtra("Contact_QQNick", y8Var.g());
        intent.putExtra("User_From_Fmessage", true);
        intent.putExtra("Contact_Scene", y8Var.f277897g);
        intent.putExtra("Contact_from_msgType", 40);
        if (z17) {
            intent.putExtra("Contact_ShowUserName", false);
        }
        if (z18) {
            intent.putExtra("Contact_KSnsIFlag", 0);
        }
        if (bundle != null) {
            intent.putExtras(bundle);
        }
        if (!android.text.TextUtils.isEmpty(str)) {
            intent.putExtra("verify_gmail", str);
        }
        j45.l.j(context, com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.C1722x934978bf.f5860x185a1589, ".ui.ContactInfoUI", intent, null);
    }

    public static void b(android.content.Context context, com.p314xaae8f345.mm.p2621x8fb0427b.y8 y8Var, boolean z17, boolean z18, android.os.Bundle bundle) {
        if (context == null || y8Var == null) {
            return;
        }
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var = new com.p314xaae8f345.mm.p2621x8fb0427b.z3();
        z3Var.X1(y8Var.f277891a);
        z3Var.M1(y8Var.c());
        z3Var.R1(y8Var.f277895e);
        z3Var.S1(y8Var.f277894d);
        a(context, z3Var, y8Var, z17, z18, bundle, y8Var.f277914x);
    }

    public static void c(android.content.Intent intent, java.lang.String str) {
        if (intent == null || str == null || str.length() == 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.ContactInfoUtil", "setLocalQQMobile fail, intent = " + intent + ", username = " + str);
            return;
        }
        r61.w1 h17 = m61.k.Ri().h(str);
        if (h17 != null) {
            intent.putExtra("Contact_Uin", h17.f474511a);
            intent.putExtra("Contact_QQNick", h17.c());
        }
        r61.a h18 = m61.k.wi().h(str);
        if (h18 != null) {
            intent.putExtra("Contact_Mobile_MD5", h18.e());
        }
    }
}
