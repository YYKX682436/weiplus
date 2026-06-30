package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes8.dex */
public final class j8 implements com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p5 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j8 f289315a = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.j8();

    @Override // com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p5
    public boolean a(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.e8 context, org.json.JSONObject jSONObject) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        if (jSONObject != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.OpenImKefuQuickBubbleDefaultHandler", "handle, can not, customExtraInfo is not null");
            return false;
        }
        yb5.d dVar = context.f289183a;
        r45.g15 g15Var = context.f289184b;
        byte[] bArr = context.f289185c;
        ot0.q qVar = new ot0.q();
        qVar.f430187f = g15Var.f456338e;
        qVar.f430199i = 33;
        java.lang.String str = g15Var.f456344n;
        if (str == null) {
            str = "";
        }
        qVar.f430206j2 = str;
        qVar.f430202i2 = g15Var.f456339f;
        java.lang.String str2 = g15Var.f456343m;
        if (str2 == null) {
            str2 = "";
        }
        qVar.f430210k2 = str2;
        qVar.f430270z2 = g15Var.f456347q;
        qVar.A2 = g15Var.f456348r;
        java.lang.String str3 = g15Var.f456349s;
        if (str3 == null) {
            str3 = "";
        }
        qVar.f430218m2 = str3;
        qVar.f430214l2 = 2;
        java.lang.String str4 = g15Var.f456352v;
        if (str4 == null) {
            str4 = "";
        }
        qVar.f430207k = str4;
        java.lang.String str5 = g15Var.f456346p;
        if (str5 == null) {
            str5 = "";
        }
        qVar.B2 = str5;
        qVar.L1 = "wxapp_" + g15Var.f456343m + g15Var.f456351u;
        java.lang.String str6 = g15Var.f456344n;
        if (str6 == null) {
            str6 = "";
        }
        qVar.f430255w = str6;
        java.lang.String str7 = g15Var.f456345o;
        if (str7 == null) {
            str7 = "";
        }
        qVar.f430259x = str7;
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i8 i8Var = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.i8();
        java.lang.String str8 = g15Var.f456343m;
        i8Var.f289283e = str8 != null ? str8 : "";
        i8Var.f289282d = qVar;
        i8Var.f289287i = g15Var.f456338e;
        i8Var.f289285g = g15Var.f456340g;
        i8Var.f289284f = g15Var.f456342i;
        i8Var.f289286h = dVar.x();
        i8Var.f289288m = g15Var.f456341h;
        i8Var.f289289n = bArr;
        ((ku5.t0) ku5.t0.f394148d).g(i8Var);
        return true;
    }
}
