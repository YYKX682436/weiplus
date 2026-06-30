package zw1;

/* loaded from: classes15.dex */
public class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jv3 f558117d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 f558118e;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7, r45.jv3 jv3Var) {
        this.f558118e = activityC13144xce1cfbb7;
        this.f558117d = jv3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/CollectMainUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wf5 wf5Var = this.f558117d.f459659g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7 activityC13144xce1cfbb7 = this.f558118e;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13144xce1cfbb7.X6(activityC13144xce1cfbb7, wf5Var);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = activityC13144xce1cfbb7.W1;
        if (y1Var != null && y1Var.f()) {
            activityC13144xce1cfbb7.W1.q();
            activityC13144xce1cfbb7.W1 = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/CollectMainUI$19", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
