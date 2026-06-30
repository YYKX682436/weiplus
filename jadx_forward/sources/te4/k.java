package te4;

/* loaded from: classes15.dex */
public class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b f500137d;

    public k(com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b activityC18455x8079c32b) {
        this.f500137d = activityC18455x8079c32b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        this.f500137d.f253299o.setText(wt5.a.s("sample_auth_key_name", false).a() ? com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.ActionValue.f61537x616964d2 : "not passed");
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$6", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
