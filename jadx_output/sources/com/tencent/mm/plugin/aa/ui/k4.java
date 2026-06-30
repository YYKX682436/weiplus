package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class k4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72709a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f72710b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72711c;

    public k4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, java.lang.String str, android.content.Context context) {
        this.f72711c = launchAAUI;
        this.f72709a = str;
        this.f72710b = context;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.Boolean bool = (java.lang.Boolean) obj;
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72711c;
        android.app.Dialog dialog = launchAAUI.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        boolean booleanValue = bool.booleanValue();
        android.content.Context context = this.f72710b;
        if (!booleanValue) {
            dp.a.makeText(context, com.tencent.mm.R.string.f492382ga2, 1).show();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 5);
            return null;
        }
        java.lang.String str = this.f72709a;
        com.tencent.mm.plugin.aa.ui.LaunchAAUI.i7(launchAAUI, str);
        dp.a.makeText(context, com.tencent.mm.R.string.gas, 1).show();
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 4);
        ((hn.k0) ((vg3.i4) i95.n0.c(vg3.i4.class))).wi(str);
        return null;
    }
}
