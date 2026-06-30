package zw1;

/* loaded from: classes15.dex */
public class y4 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.jv3 f558393d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 f558394e;

    public y4(com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3, r45.jv3 jv3Var) {
        this.f558394e = activityC13149x63b02cb3;
        this.f558393d = jv3Var;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        r45.wf5 wf5Var = this.f558393d.f459658f;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = this.f558394e;
        activityC13149x63b02cb3.U6(wf5Var, null);
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.y1 y1Var = activityC13149x63b02cb3.G;
        if (y1Var != null && y1Var.f()) {
            activityC13149x63b02cb3.G.q();
            activityC13149x63b02cb3.G = null;
        }
        yj0.a.h(this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$34", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
