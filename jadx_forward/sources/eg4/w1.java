package eg4;

/* loaded from: classes4.dex */
public class w1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 f334358d;

    public w1(com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98) {
        this.f334358d = activityC18506xcc7cdd98;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        js.x0 b17 = r61.q0.b();
        js.x0 x0Var = js.x0.SUCC;
        com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd98 = this.f334358d;
        if (b17 != x0Var) {
            android.content.Intent intent = new android.content.Intent(activityC18506xcc7cdd98.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11360x90d2d970.class);
            intent.putExtra("key_upload_scene", 5);
            com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC18506xcc7cdd98.mo55332x76847179(), intent);
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p2243xcadc13e1.ui.p2246xb4860a9e.ActivityC18506xcc7cdd98 activityC18506xcc7cdd982 = this.f334358d;
            android.content.Intent intent2 = new android.content.Intent(activityC18506xcc7cdd98.mo55332x76847179(), (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11370x9b57e494.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(intent2);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(activityC18506xcc7cdd982, arrayList2.toArray(), "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            activityC18506xcc7cdd982.startActivity((android.content.Intent) arrayList2.get(0));
            yj0.a.f(activityC18506xcc7cdd982, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        }
        tf5.j.O6(activityC18506xcc7cdd98, "mobile_contacts_add");
        yj0.a.h(this, "com/tencent/mm/plugin/subapp/ui/friend/FMessageConversationUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
