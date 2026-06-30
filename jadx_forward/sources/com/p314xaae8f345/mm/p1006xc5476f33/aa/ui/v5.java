package com.p314xaae8f345.mm.p1006xc5476f33.aa.ui;

/* loaded from: classes9.dex */
public final class v5 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 f154387d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f154388e;

    public v5(com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.ActivityC11351x975a7907 activityC11351x975a7907, java.lang.String str) {
        this.f154387d = activityC11351x975a7907;
        this.f154388e = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/aa/ui/LaunchAAUIC$initImportEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean z17 = false;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(13721, 10, 0, java.lang.Integer.valueOf(this.f154387d.f154037h));
        try {
            java.lang.String str = this.f154388e;
            if (str == null) {
                str = "";
            }
            byte[] decode = android.util.Base64.decode(str, 0);
            if (decode != null && decode.length == 0) {
                z17 = true;
            }
            if (z17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAAUIC", "import_bill_info base64 decode result is null");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LaunchAAUIC", "import_bill_info base64 decode success, goto kinda common route");
                com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e m27539xaf65a0fc = com.p314xaae8f345.p347x615374d.gen.AbstractC3411xcfaed72e.m27539xaf65a0fc();
                m27539xaf65a0fc.mo27555xc6c7e3f0("route_info", decode);
                ((h45.q) i95.n0.c(h45.q.class)).mo24837xef221a95("commonRoute", m27539xaf65a0fc, com.p314xaae8f345.mm.p1006xc5476f33.aa.ui.u5.f154368a);
            }
        } catch (java.lang.Exception unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LaunchAAUIC", "import_bill_info base64 decode fail");
        }
        yj0.a.h(this, "com/tencent/mm/plugin/aa/ui/LaunchAAUIC$initImportEntrance$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
