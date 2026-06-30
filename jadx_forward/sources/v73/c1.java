package v73;

/* loaded from: classes9.dex */
public class c1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.m f515212a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35 f515213b;

    public c1(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35 activityC16104x97afd35, r73.m mVar) {
        this.f515213b = activityC16104x97afd35;
        this.f515212a = mVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35 activityC16104x97afd35 = this.f515213b;
        java.lang.String str2 = activityC16104x97afd35.f223793d;
        r73.m mVar = this.f515212a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "state: %s", java.lang.Integer.valueOf(mVar.f474711r.f467940f.f453419g));
        r45.tg5 tg5Var = mVar.f474711r;
        if (tg5Var.f467940f.f453419g == 1) {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35.f223895h;
            java.lang.String str3 = activityC16104x97afd35.f223793d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str3, "go to receive card ui");
            android.content.Intent intent = new android.content.Intent(activityC16104x97afd35, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da.class);
            intent.putExtra("key_card_no", activityC16104x97afd35.f223897g);
            try {
                byte[] mo14344x5f01b1f6 = tg5Var.mo14344x5f01b1f6();
                intent.putExtra("key_scene", 1);
                intent.putExtra("key_qry_response", mo14344x5f01b1f6);
            } catch (java.io.IOException e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str3, e17, "", new java.lang.Object[0]);
                intent.putExtra("key_scene", 0);
            }
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16104x97afd35, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoReceiveCardUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16104x97afd35.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16104x97afd35, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoReceiveCardUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        } else {
            int i27 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35.f223895h;
            java.lang.String str4 = activityC16104x97afd35.f223793d;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str4, "go to card detail");
            android.content.Intent intent2 = new android.content.Intent(activityC16104x97afd35, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16097x3486e02.class);
            intent2.putExtra("key_card_no", activityC16104x97afd35.f223897g);
            intent2.putExtra("key_scene", 1);
            try {
                intent2.putExtra("key_qry_response", tg5Var.mo14344x5f01b1f6());
            } catch (java.io.IOException e18) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str4, e18, "", new java.lang.Object[0]);
            }
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC16104x97afd35, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoCardDetailUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16104x97afd35.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC16104x97afd35, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoCardDetailUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyUserDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        activityC16104x97afd35.finish();
    }
}
