package l72;

/* loaded from: classes14.dex */
public class p implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 f398391d;

    public p(com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7) {
        this.f398391d = activityC13534x1dc4b4e7;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "click finish");
        this.f398391d.T6("fail", 90010, "", "");
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$8", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
