package te4;

/* loaded from: classes15.dex */
public class h implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b f500134d;

    public h(com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b activityC18455x8079c32b) {
        this.f500134d = activityC18455x8079c32b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f500134d.f253299o.setText(wt5.a.r().a() ? "passed" : "not passed");
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
