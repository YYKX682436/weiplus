package zw1;

/* loaded from: classes15.dex */
public class j4 implements android.view.View.OnLongClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ zw1.k4 f558210d;

    public j4(zw1.k4 k4Var) {
        this.f558210d = k4Var;
    }

    @Override // android.view.View.OnLongClickListener
    public boolean onLongClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$25$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z", this, array);
        zw1.k4 k4Var = this.f558210d;
        ww1.a3 a3Var = k4Var.f558222d;
        a3Var.f531645v = 3;
        com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3 activityC13149x63b02cb3 = k4Var.f558225g;
        r45.vf5 vf5Var = a3Var.f531629f;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1331x3897612a.ui.ActivityC13149x63b02cb3.Q;
        activityC13149x63b02cb3.K7(vf5Var);
        if (k4Var.f558222d.f531629f != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(20032, "wxface2face", "LongClick", "", "", "", "", 3, java.lang.Integer.valueOf(k4Var.f558222d.f531629f.f469720d), 0, k4Var.f558225g.q7(), java.lang.Integer.valueOf(k4Var.f558225g.s7(0)), k4Var.f558225g.r7(0));
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(25983, 13, java.lang.Integer.valueOf(k4Var.f558223e));
        yj0.a.i(true, this, "com/tencent/mm/plugin/collect/ui/WalletCollectQrCodeUI$25$1", "android/view/View$OnLongClickListener", "onLongClick", "(Landroid/view/View;)Z");
        return true;
    }
}
