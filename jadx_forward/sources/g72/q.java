package g72;

/* loaded from: classes14.dex */
public class q implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 f350775d;

    public q(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614) {
        this.f350775d = activityC13521xbef6f614;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "hy: user cancelled with left button");
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614.f181602z;
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13521xbef6f614 activityC13521xbef6f614 = this.f350775d;
        activityC13521xbef6f614.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectUI", "onUserCancel");
        e72.g m55278x19468201 = activityC13521xbef6f614.f181613q.m55278x19468201();
        activityC13521xbef6f614.T6(1, m55278x19468201.f331436a, m55278x19468201.f331437b, null);
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectUI$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
