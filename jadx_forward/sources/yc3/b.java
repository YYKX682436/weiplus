package yc3;

/* loaded from: classes7.dex */
public final class b extends lc3.b0 {
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
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28, "");
        java.lang.String optString2 = data.optString("content", "");
        java.lang.String optString3 = data.optString("confirmText", "");
        java.lang.String optString4 = data.optString("cancelText");
        boolean optBoolean = data.optBoolean("showCancel", true);
        java.lang.String optString5 = data.optString("confirmColor");
        java.lang.String optString6 = data.optString("cancelColor");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString);
        if (optString.length() == 0) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
            if (optString2.length() == 0) {
                h(1, "modal title and content null");
            }
        }
        wc3.b bVar = (wc3.b) this.f399423a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0 j0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.j0(bVar != null ? bVar.B0() : null);
        j0Var.t(optString2);
        j0Var.setTitle(optString);
        j0Var.B(android.graphics.Color.parseColor(optString5));
        j0Var.x(android.graphics.Color.parseColor(optString6));
        j0Var.A(optString3, true, yc3.a.f542369d);
        if (optBoolean) {
            j0Var.w(optString4, true, null);
        }
        j0Var.show();
        k();
    }
}
