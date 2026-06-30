package g72;

/* loaded from: classes.dex */
public class m implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f350770d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 f350771e;

    public m(com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4, int i17) {
        this.f350771e = activityC13520x8c9585b4;
        this.f350770d = i17;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.ui.ActivityC13520x8c9585b4 activityC13520x8c9585b4 = this.f350771e;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        try {
            java.lang.String str = activityC13520x8c9585b4.f181590o + "?customInfo=" + fp.s0.b(java.lang.String.format("appid=%s;errcode=%d", activityC13520x8c9585b4.f181593r, java.lang.Integer.valueOf(this.f350770d)), com.p314xaae8f345.p519xbf8bc95e.p532x21ffc6bd.rv.f132803c);
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", str);
            j45.l.j(activityC13520x8c9585b4.mo55332x76847179(), "webview", ".ui.tools.WebViewUI", intent, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FaceDetectConfirmUI", e17, "face start feedback webview exception", new java.lang.Object[0]);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/facedetect/ui/FaceDetectConfirmUI$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
