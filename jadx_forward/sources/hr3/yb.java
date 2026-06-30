package hr3;

/* loaded from: classes4.dex */
public class yb implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 f365743d;

    public yb(com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activityC16863xc0e4ffb5) {
        this.f365743d = activityC16863xc0e4ffb5;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/PermissionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16863xc0e4ffb5 activity = this.f365743d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        ((bs3.h) pf5.z.f435481a.a(activity).a(bs3.h.class)).O6(false);
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/PermissionSettingUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
