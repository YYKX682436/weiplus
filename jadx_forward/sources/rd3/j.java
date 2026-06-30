package rd3;

/* loaded from: classes7.dex */
public final class j extends lc3.b0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showModal";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.b0
    public void t(lc3.a0 data) {
        android.content.Context context;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        java.lang.String optString2 = data.optString("content");
        java.lang.String optString3 = data.optString("confirmText");
        java.lang.String optString4 = data.optString("cancelText");
        boolean optBoolean = data.optBoolean("showCancel", true);
        java.lang.String optString5 = data.optString("confirmColor", "");
        int color = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560267fp);
        try {
            color = ik1.w.l(optString5);
        } catch (java.lang.Exception unused) {
        }
        java.lang.String optString6 = data.optString("cancelColor", "");
        int color2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560247f5);
        try {
            color2 = ik1.w.l(optString6);
        } catch (java.lang.Exception unused2) {
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (optString2.length() == 0) {
                s().mo146xb9724478(h(1, "modal title and content null"));
            }
        }
        lc3.e eVar = this.f399423a;
        if (eVar == null || (context = eVar.B0()) == null) {
            context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        }
        java.util.Objects.toString(context);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1 u1Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u1(context);
        u1Var.u(optString);
        u1Var.g(optString2);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.i0 i0Var = u1Var.f293529a;
        i0Var.f293354b.V = color2;
        u1Var.k(color);
        u1Var.n(optString3);
        u1Var.j(optString4);
        u1Var.a(optBoolean);
        u1Var.l(new rd3.f(this));
        u1Var.i(new rd3.g(this));
        i0Var.f293354b.G = new rd3.h(this);
        u1Var.e(rd3.i.f475777d);
        u1Var.q(false);
    }
}
