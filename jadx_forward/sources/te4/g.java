package te4;

/* loaded from: classes15.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b f500133d;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2232x688c445.ui.ActivityC18455x8079c32b activityC18455x8079c32b) {
        this.f500133d = activityC18455x8079c32b;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        zt5.k b17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/soter/ui/SoterTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        au5.b bVar = wt5.a.f531070c;
        if (bVar == null) {
            zt5.h.b("Soter.SoterCore", "soter: generateAppGlobalSecureKey IMPL is null, not support soter", new java.lang.Object[0]);
            b17 = new zt5.k(2);
        } else {
            b17 = bVar.b();
        }
        this.f500133d.f253299o.setText(b17.a() ? "passed" : "not support");
        yj0.a.h(this, "com/tencent/mm/plugin/soter/ui/SoterTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
