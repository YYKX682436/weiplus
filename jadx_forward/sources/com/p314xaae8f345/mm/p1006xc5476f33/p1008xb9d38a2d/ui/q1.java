package com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui;

/* loaded from: classes4.dex */
public final class q1 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f155657d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f155658e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f155659f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 u3Var, android.app.Activity activity, android.content.Intent intent) {
        super(1);
        this.f155657d = u3Var;
        this.f155658e = activity;
        this.f155659f = intent;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732 c11384xf0e29732 = (com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1013x38f89bd0.C11384xf0e29732) obj;
        this.f155657d.dismiss();
        android.content.Intent intent = this.f155659f;
        if (c11384xf0e29732 != null) {
            r45.fn4 fn4Var = c11384xf0e29732.f154719e;
            java.lang.String str = fn4Var != null ? fn4Var.f455996e : null;
            boolean z17 = str == null || str.length() == 0;
            java.lang.String str2 = c11384xf0e29732.f154720f;
            if (!z17 && (r26.n0.N(str2) ^ true)) {
                java.lang.String str3 = fn4Var != null ? fn4Var.f455996e : null;
                if (str3 == null) {
                    str3 = "";
                }
                int i17 = fn4Var != null ? fn4Var.f455997f : 0;
                java.lang.String str4 = fn4Var != null ? fn4Var.f455998g : null;
                if (str4 == null) {
                    str4 = "";
                }
                java.lang.String str5 = fn4Var != null ? fn4Var.f455999h : null;
                java.lang.String str6 = str5 != null ? str5 : "";
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GateWayMobileUI", "success start GateWayMobileUI mobile:%s ,simMobileMsgID:%s ,carrierType:%s ", str3, str2, java.lang.Integer.valueOf(i17));
                intent.setClass(this.f155658e, com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.ui.ActivityC11404xb70180da.class);
                intent.putExtra("IntentKey_MobileInfo", c11384xf0e29732);
                intent.putExtra("IntentKey_ProtocalTitle", str4);
                intent.putExtra("IntentKey_ProtocalUrl", str6);
                android.app.Activity activity = this.f155658e;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                arrayList.add(intent);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(activity, arrayList.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                activity.startActivity((android.content.Intent) arrayList.get(0));
                yj0.a.f(activity, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                return jz5.f0.f384359a;
            }
        }
        android.app.Activity activity2 = this.f155658e;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activity2, arrayList2.toArray(), "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activity2.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activity2, "com/tencent/mm/plugin/account/ui/GateWayMobileUI$Companion$tryStartGateWayActivity$1", "invoke", "(Lcom/tencent/mm/plugin/account/gatewayreg/GetMobileRespData;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return jz5.f0.f384359a;
    }
}
