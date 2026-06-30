package g72;

/* loaded from: classes.dex */
public class b implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350759d;

    public b(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4) {
        this.f350759d = activityC13520x8c9585b4;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4 = this.f350759d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.Object[] objArr = new java.lang.Object[1];
            java.lang.String str = activityC13520x8c9585b4.f181593r;
            if (str == null) {
                str = "";
            }
            objArr[0] = str;
            java.lang.String str2 = activityC13520x8c9585b4.f181591p + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s", objArr), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceDetectConfirmUI", "jump realUrl: %s", str2);
            com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4.T6(activityC13520x8c9585b4, str2);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceDetectConfirmUI", e17, "jumpToWebView exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
