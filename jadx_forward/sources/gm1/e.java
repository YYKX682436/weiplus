package gm1;

/* loaded from: classes7.dex */
public final class e extends wm3.a {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3 c3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173683a;
        c3Var.getClass();
        f06.v[] vVarArr = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173684b;
        boolean[] zArr = {((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173685c.b(c3Var, vVarArr[0])).booleanValue(), ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173686d.b(c3Var, vVarArr[1])).booleanValue(), ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1235xdf5911d.c3.f173687e.b(c3Var, vVarArr[2])).booleanValue()};
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(m158354x19263085());
        builder.setTitle(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.mdc));
        builder.setMultiChoiceItems(new java.lang.String[]{"关闭CloseApplet时同时转发小程序", "启动无头模式前台UI", "是否启动无头小程序"}, zArr, new gm1.a(zArr));
        builder.setPositiveButton("OK", new gm1.b(zArr, this));
        builder.setNegativeButton("Cancel", new gm1.c(this));
        builder.setOnDismissListener(new gm1.d(this));
        builder.create().show();
    }
}
