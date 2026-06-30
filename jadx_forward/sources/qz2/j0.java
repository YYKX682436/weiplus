package qz2;

/* loaded from: classes3.dex */
public class j0 implements android.view.View.OnClickListener {
    public j0(com.p314xaae8f345.mm.p1006xc5476f33.p1693xadfce8e4.ui.ActivityC15526xf0c916c9 activityC15526xf0c916c9) {
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SoterPayTestUI", "hy: regen and upload ask");
        cu5.b.d(new qz2.i0(this), false, null);
        yj0.a.h(this, "com/tencent/mm/plugin/fingerprint/ui/SoterPayTestUI$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
