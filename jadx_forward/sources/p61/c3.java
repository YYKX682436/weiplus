package p61;

/* loaded from: classes4.dex */
public class c3 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 f433761d;

    public c3(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 activityC11368x3bd82e91) {
        this.f433761d = activityC11368x3bd82e91;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindQQUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11368x3bd82e91 activityC11368x3bd82e91 = this.f433761d;
        com.p314xaae8f345.mm.ui.AbstractActivityC21409xdfe27f5a.X6(activityC11368x3bd82e91, new android.content.Intent(activityC11368x3bd82e91, (java.lang.Class<?>) com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11373x393d8ccd.class));
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindQQUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
