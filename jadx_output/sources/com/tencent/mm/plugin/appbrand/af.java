package com.tencent.mm.plugin.appbrand;

/* loaded from: classes7.dex */
public class af implements android.content.DialogInterface.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.appbrand.o6 f74955d;

    public af(com.tencent.mm.plugin.appbrand.o6 o6Var) {
        this.f74955d = o6Var;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            android.graphics.Bitmap a17 = com.tencent.mm.plugin.appbrand.ye.a(this.f74955d);
            com.tencent.mm.plugin.appbrand.o6 o6Var = this.f74955d;
            java.lang.ThreadLocal threadLocal = com.tencent.mm.plugin.appbrand.ui.s5.f90201a;
            if (o6Var != null && a17 != null && !a17.isRecycled()) {
                com.tencent.mm.plugin.appbrand.ui.s5.f90202b.put(o6Var, a17);
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.AppBrand.RuntimeRestartHelper", "showRestartPromptForCommLibUpdated takeSnapshot appId[%s], e[%s]", this.f74955d.f74803n, e17);
        }
        this.f74955d.z1(null, "CommLibUpdated");
    }
}
