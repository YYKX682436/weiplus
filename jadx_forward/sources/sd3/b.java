package sd3;

/* loaded from: classes7.dex */
public final class b extends lc3.d0 {
    @Override // lc3.c0
    public java.lang.String f() {
        return "hideLoading";
    }

    @Override // lc3.c0
    public boolean n() {
        return true;
    }

    @Override // lc3.d0
    public lc3.a0 r(lc3.a0 data) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MBJsApiHideLoading", "invoke");
        android.app.Dialog dialog = sd3.a.f488213a;
        if (dialog != null) {
            dialog.dismiss();
        }
        sd3.a.f488213a = null;
        return k();
    }
}
