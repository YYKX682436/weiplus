package p61;

/* loaded from: classes3.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11357xf5846456 f433748d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11357xf5846456 activityC11357xf5846456) {
        this.f433748d = activityC11357xf5846456;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11357xf5846456 activityC11357xf5846456 = this.f433748d;
        android.content.Intent intent = new android.content.Intent(activityC11357xf5846456, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11358x5a6f125e.class);
        intent.putExtra("enter_scene", activityC11357xf5846456.f154458o);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11357xf5846456 activityC11357xf58464562 = this.f433748d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC11357xf58464562, arrayList2.toArray(), "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC11357xf58464562.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC11357xf58464562, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindGoogleContactIntroUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
