package com.tencent.mm.plugin.account.ui;

/* loaded from: classes4.dex */
public final class q1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.u3 f74124d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f74125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f74126f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.tencent.mm.ui.widget.dialog.u3 u3Var, android.app.Activity activity, android.content.Intent intent) {
        super(1);
        this.f74124d = u3Var;
        this.f74125e = activity;
        this.f74126f = intent;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData getMobileRespData = (com.tencent.mm.plugin.account.gatewayreg.GetMobileRespData) obj;
        this.f74124d.dismiss();
        android.content.Intent intent = this.f74126f;
        if (getMobileRespData != null) {
            r45.fn4 fn4Var = getMobileRespData.f73186e;
            java.lang.String str = fn4Var != null ? fn4Var.f374463e : null;
            boolean z17 = str == null || str.length() == 0;
            java.lang.String str2 = getMobileRespData.f73187f;
            if (!z17 && (r26.n0.N(str2) ^ true)) {
                java.lang.String str3 = fn4Var != null ? fn4Var.f374463e : null;
                if (str3 == null) {
                    str3 = "";
                }
                int i17 = fn4Var != null ? fn4Var.f374464f : 0;
                java.lang.String str4 = fn4Var != null ? fn4Var.f374465g : null;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = fn4Var != null ? fn4Var.f374466h : null;
                java.lang.String str6 = str5 != null ? str5 : "";
                com.tencent.mars.xlog.Log.i("MicroMsg.GateWayMobileUI", "success start GateWayMobileUI mobile:%s ,simMobileMsgID:%s ,carrierType:%s ", str3, str2, java.lang.Integer.valueOf(i17));
                intent.setClass(this.f74125e, com.tencent.mm.plugin.account.ui.GateWayMobileUI.class);
                intent.putExtra("IntentKey_MobileInfo", getMobileRespData);
                intent.putExtra("IntentKey_ProtocalTitle", str4);
                intent.putExtra("IntentKey_ProtocalUrl", str6);
                android.app.Activity activity = this.f74125e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return jz5.f0.f302826a;
            }
        }
        android.app.Activity activity2 = this.f74125e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity2, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f302826a;
    }
}
