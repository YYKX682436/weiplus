package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public class j4 implements km5.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f72697a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72698b;

    public j4(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, android.content.Context context) {
        this.f72698b = launchAAUI;
        this.f72697a = context;
    }

    @Override // km5.e
    public void a(java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.Aa.LaunchAAUI", "onInterrupt: %s", obj);
        com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI = this.f72698b;
        android.app.Dialog dialog = launchAAUI.U;
        if (dialog != null) {
            dialog.dismiss();
        }
        if (obj != null && (obj instanceof java.lang.String) && !obj.toString().equalsIgnoreCase("ok")) {
            db5.e1.E(this.f72697a, obj.toString(), "", launchAAUI.getString(com.tencent.mm.R.string.ga_), false, new com.tencent.mm.plugin.aa.ui.h4(this));
        } else if (obj == null || !(obj instanceof r45.g0)) {
            android.content.Context context = this.f72697a;
            if (obj == null || !(obj instanceof r45.a)) {
                dp.a.makeText(context, com.tencent.mm.R.string.f492382ga2, 1).show();
            } else {
                r45.a aVar = (r45.a) obj;
                java.lang.String str = aVar.f369568e;
                java.lang.String str2 = aVar.f369569f;
                java.lang.String str3 = aVar.f369570g;
                com.tencent.mm.ui.widget.dialog.a aVar2 = new com.tencent.mm.ui.widget.dialog.a();
                aVar2.f211729s = str;
                aVar2.f211732v = str3;
                aVar2.E = new com.tencent.mm.plugin.aa.ui.i4(this, aVar);
                aVar2.f211733w = str2;
                com.tencent.mm.ui.widget.dialog.j0 j0Var = new com.tencent.mm.ui.widget.dialog.j0(context, com.tencent.mm.R.style.f494791wd);
                j0Var.e(aVar2);
                com.tencent.mm.ui.widget.dialog.d0 d0Var = aVar2.f211723m;
                if (d0Var != null) {
                    d0Var.a(j0Var.f211837r);
                }
                j0Var.show();
            }
        } else {
            h61.o.e(launchAAUI.getContext(), (r45.g0) obj);
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13722, 5);
    }
}
