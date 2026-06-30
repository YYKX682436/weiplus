package v73;

/* loaded from: classes9.dex */
public class b1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.l f515207a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35 f515208b;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35 activityC16104x97afd35, r73.l lVar) {
        this.f515208b = activityC16104x97afd35;
        this.f515207a = lVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r73.l lVar = this.f515207a;
        r45.bx3 bx3Var = lVar.f474710r.f466377f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35 activityC16104x97afd35 = this.f515208b;
        if (bx3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16104x97afd35.f223793d, "state: %s", java.lang.Integer.valueOf(bx3Var.f452655g));
        }
        r45.rg5 rg5Var = lVar.f474710r;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16104x97afd35.f223895h;
        java.lang.String str2 = activityC16104x97afd35.f223793d;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str2, "go to manager ui");
        android.content.Intent intent = new android.content.Intent(activityC16104x97afd35, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16099xbf243344.class);
        intent.putExtra("key_card_no", activityC16104x97afd35.f223897g);
        try {
            byte[] mo14344x5f01b1f6 = rg5Var.mo14344x5f01b1f6();
            intent.putExtra("key_scene", 1);
            intent.putExtra("key_qry_response", mo14344x5f01b1f6);
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(str2, e17, "", new java.lang.Object[0]);
            intent.putExtra("key_scene", 0);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16104x97afd35, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoManagerUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16104x97afd35.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16104x97afd35, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayProxyUI", "gotoManagerUI", "(Lcom/tencent/mm/protocal/protobuf/QryHoneyPayerDetailResp;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16104x97afd35.finish();
    }
}
