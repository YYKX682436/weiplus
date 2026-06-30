package com.tencent.mm.plugin.aa.ui;

/* loaded from: classes9.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.aa.ui.LaunchAAUI f72854d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f72855e;

    public v5(com.tencent.mm.plugin.aa.ui.LaunchAAUI launchAAUI, java.lang.String str) {
        this.f72854d = launchAAUI;
        this.f72855e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUIC$initImportEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.d(13721, 10, 0, java.lang.Integer.valueOf(this.f72854d.f72504h));
        try {
            java.lang.String str = this.f72855e;
            if (str == null) {
                str = "";
            }
            byte[] decode = android.util.Base64.decode(str, 0);
            if (decode != null && decode.length == 0) {
                z17 = true;
            }
            if (z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAAUIC", "import_bill_info base64 decode result is null");
            } else {
                com.tencent.mars.xlog.Log.i("MicroMsg.LaunchAAUIC", "import_bill_info base64 decode success, goto kinda common route");
                com.tencent.kinda.gen.ITransmitKvData create = com.tencent.kinda.gen.ITransmitKvData.create();
                create.putBinary("route_info", decode);
                ((h45.q) i95.n0.c(h45.q.class)).startUseCase("commonRoute", create, com.tencent.mm.plugin.aa.ui.u5.f72835a);
            }
        } catch (java.lang.Exception unused) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LaunchAAUIC", "import_bill_info base64 decode fail");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC$initImportEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
