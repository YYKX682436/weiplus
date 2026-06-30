package l72;

/* loaded from: classes14.dex */
public class g implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ l72.i f398379d;

    public g(l72.i iVar) {
        this.f398379d = iVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceActionUI", "click retry");
        com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7 activityC13534x1dc4b4e7 = this.f398379d.f398385h.f398386a;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1408x1e351176.ui.ActivityC13534x1dc4b4e7.f181706J;
        activityC13534x1dc4b4e7.getClass();
        k72.u.B.b(false);
        n72.q qVar = activityC13534x1dc4b4e7.f181726z;
        if (qVar != null) {
            qVar.c();
        }
        activityC13534x1dc4b4e7.f181708e.setVisibility(8);
        activityC13534x1dc4b4e7.f181710g.setVisibility(8);
        activityC13534x1dc4b4e7.f181707d.setVisibility(0);
        activityC13534x1dc4b4e7.V6();
        k72.u.B.c(activityC13534x1dc4b4e7);
        yj0.a.h(this, "com/tencent/mm/plugin/facedetectaction/ui/FaceActionUI$2$4$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
