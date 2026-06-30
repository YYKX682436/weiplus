package v73;

/* loaded from: classes4.dex */
public class y implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.c f515286a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 f515287b;

    public y(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d6, r73.c cVar) {
        this.f515287b = activityC16100x8f3665d6;
        this.f515286a = cVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.HoneyPayCheckPwdUI", "create success");
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d6 = this.f515287b;
        android.content.Intent intent = new android.content.Intent(activityC16100x8f3665d6.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa.class);
        intent.putExtra("key_create_succ", true);
        r73.c cVar = this.f515286a;
        r45.bx3 bx3Var = cVar.f474699r.f473330f;
        if (bx3Var != null) {
            intent.putExtra("key_card_no", bx3Var.f452652d);
            intent.putExtra("key_card_type", cVar.f474699r.f473330f.f452664s);
        }
        dp.a.m125853x26a183b(activityC16100x8f3665d6.mo55332x76847179(), com.p314xaae8f345.mm.R.C30867xcad56011.fwt, 1).show();
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6 activityC16100x8f3665d62 = this.f515287b;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16100x8f3665d62, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCheckPwdUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16100x8f3665d62.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16100x8f3665d62, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayCheckPwdUI$5", "onCallback", "(IILjava/lang/String;Lcom/tencent/mm/modelbase/NetSceneBase;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.C(875L, 2L, 1L);
    }
}
