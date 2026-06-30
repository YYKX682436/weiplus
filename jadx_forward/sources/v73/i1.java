package v73;

/* loaded from: classes9.dex */
public class i1 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.e f515232a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da f515233b;

    public i1(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da activityC16105xbfd7a3da, r73.e eVar) {
        this.f515233b = activityC16105xbfd7a3da;
        this.f515232a = eVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r73.e eVar = this.f515232a;
        r45.bv3 bv3Var = eVar.f474701r.f452293f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da activityC16105xbfd7a3da = this.f515233b;
        if (bv3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16105xbfd7a3da.f223793d, "do real name");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayReceiveCardUI");
            u73.h.i(activityC16105xbfd7a3da, bundle, eVar.f474701r.f452293f, false);
        } else {
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16105xbfd7a3da.E;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16105xbfd7a3da.f223793d, "go to honey pay card detail");
            android.content.Intent intent = new android.content.Intent(activityC16105xbfd7a3da, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16097x3486e02.class);
            intent.putExtra("key_scene", 0);
            intent.putExtra("key_card_no", activityC16105xbfd7a3da.f223915z);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(activityC16105xbfd7a3da, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayReceiveCardUI", "gotoHoneyPayCardDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC16105xbfd7a3da.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(activityC16105xbfd7a3da, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayReceiveCardUI", "gotoHoneyPayCardDetailUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            u73.h.e(1, activityC16105xbfd7a3da.f223915z);
            activityC16105xbfd7a3da.finish();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
        g0Var.C(875L, 4L, 1L);
        if (activityC16105xbfd7a3da.B) {
            activityC16105xbfd7a3da.B = false;
            g0Var.d(24522, 2, 2);
        }
    }
}
