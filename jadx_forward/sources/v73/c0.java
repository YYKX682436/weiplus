package v73;

/* loaded from: classes9.dex */
public class c0 extends com.p314xaae8f345.mm.p2802xd031a825.ui.z1 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 f515211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82) {
        super(false);
        this.f515211d = activityC16101x10c7b82;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.ui.z1
    /* renamed from: onRealClick */
    public void mo27114xc7e50b6b(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82 activityC16101x10c7b82 = this.f515211d;
        java.lang.String str = activityC16101x10c7b82.f223793d;
        if (!com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16101x10c7b82.V6(activityC16101x10c7b82)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(activityC16101x10c7b82.f223793d, "over limit when click");
            return;
        }
        activityC16101x10c7b82.mo48632xd46dd964();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16101x10c7b82.f223793d, "go to pwd ui");
        long j07 = com.p314xaae8f345.mm.p2802xd031a825.ui.r1.j0(activityC16101x10c7b82.f223850g.m83183xfb85ada3(), "100");
        java.lang.String stringExtra = activityC16101x10c7b82.getIntent().getStringExtra("key_take_message");
        android.content.Intent intent = new android.content.Intent(activityC16101x10c7b82.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16100x8f3665d6.class);
        intent.putExtra("key_scene", 1);
        intent.putExtra("key_credit_line", j07);
        intent.putExtra("key_take_message", stringExtra);
        intent.putExtra("key_username", activityC16101x10c7b82.f223863w);
        intent.putExtra("key_wishing", activityC16101x10c7b82.f223864x);
        intent.putExtra("key_cardtype", activityC16101x10c7b82.f223866z);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(activityC16101x10c7b82, arrayList.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayGiveCardUI", "gotoPwdUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16101x10c7b82.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(activityC16101x10c7b82, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayGiveCardUI", "gotoPwdUI", "()V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
