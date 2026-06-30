package yh4;

/* loaded from: classes.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2263x364492.ActivityC18594xaa2d156f f543949d;

    public f(com.p314xaae8f345.mm.p1006xc5476f33.p2263x364492.ActivityC18594xaa2d156f activityC18594xaa2d156f) {
        this.f543949d = activityC18594xaa2d156f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/test/ExMainSettings$initList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        int i17 = com.tencent.mm.plugin.finder.ui.FinderSettingsUI.g;
        android.content.Intent intent = new android.content.Intent(this.f543949d, (java.lang.Class<?>) com.tencent.mm.plugin.finder.ui.FinderSettingsUI.class);
        com.p314xaae8f345.mm.p1006xc5476f33.p2263x364492.ActivityC18594xaa2d156f activityC18594xaa2d156f = this.f543949d;
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(intent);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(activityC18594xaa2d156f, arrayList2.toArray(), "com/tencent/mm/plugin/test/ExMainSettings$initList$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        activityC18594xaa2d156f.startActivity((android.content.Intent) arrayList2.get(0));
        yj0.a.f(activityC18594xaa2d156f, "com/tencent/mm/plugin/test/ExMainSettings$initList$3", "onClick", "(Landroid/view/View;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        yj0.a.h(this, "com/tencent/mm/plugin/test/ExMainSettings$initList$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
