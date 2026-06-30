package sd3;

/* loaded from: classes7.dex */
public final class c extends lc3.d0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "showLoading";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.lang.String optString = data.optString(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiShowLoading", "title:" + optString);
        lc3.e eVar = this.f399423a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 c17 = com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3.c(eVar != null ? eVar.B0() : null, optString, false, 3, null);
        c17.show();
        android.app.Dialog dialog = sd3.a.f488213a;
        if (dialog != null) {
            dialog.dismiss();
        }
        sd3.a.f488213a = c17;
        return k();
    }
}
