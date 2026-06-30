package v73;

/* loaded from: classes9.dex */
public class s0 implements com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r73.a f515275a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa f515276b;

    public s0(com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa, r73.a aVar) {
        this.f515276b = activityC16102xafeab7fa;
        this.f515275a = aVar;
    }

    @Override // com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.x0
    public void a(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r73.a aVar = this.f515275a;
        r45.y00 y00Var = aVar.f474696r;
        r45.bv3 bv3Var = y00Var.f472201f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa activityC16102xafeab7fa = this.f515276b;
        if (bv3Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC16102xafeab7fa.f223793d, "do realname guide");
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("realname_verify_process_jump_activity", ".ui.HoneyPayMainUI");
            u73.h.i(activityC16102xafeab7fa, bundle, aVar.f474696r.f472201f, true);
            return;
        }
        java.util.LinkedList linkedList = y00Var.f472202g;
        int i19 = com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16102xafeab7fa.f223867u;
        activityC16102xafeab7fa.getClass();
        java.util.ArrayList<? extends android.os.Parcelable> arrayList = new java.util.ArrayList<>();
        if (linkedList != null && !linkedList.isEmpty()) {
            java.util.Iterator it = linkedList.iterator();
            while (it.hasNext()) {
                arrayList.add(new com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.p1777x633fb29.C16094x601fe117((r45.av3) it.next()));
            }
        }
        android.content.Intent intent = new android.content.Intent(activityC16102xafeab7fa, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1776xb48c75a4.ui.ActivityC16106x38110247.class);
        intent.putParcelableArrayListExtra("key_card_type_list", arrayList);
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC16102xafeab7fa, arrayList2.toArray(), "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI", "gotoSelectCardTypeUI", "(Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC16102xafeab7fa.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC16102xafeab7fa, "com/tencent/mm/plugin/honey_pay/ui/HoneyPayMainUI", "gotoSelectCardTypeUI", "(Ljava/util/List;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }
}
