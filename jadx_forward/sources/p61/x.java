package p61;

/* loaded from: classes14.dex */
public class x implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11359x4d6f2c6f f433940d;

    public x(com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11359x4d6f2c6f activityC11359x4d6f2c6f) {
        this.f433940d = activityC11359x4d6f2c6f;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1008xb9d38a2d.p1009x2e243d.ui.ActivityC11359x4d6f2c6f activityC11359x4d6f2c6f = this.f433940d;
        if (!activityC11359x4d6f2c6f.f154478h) {
            activityC11359x4d6f2c6f.getClass();
            android.content.Intent intent = new android.content.Intent();
            intent.putExtra("rawUrl", "http://www.linkedin.com/bind/plugin/");
            intent.putExtra("geta8key_username", c01.z1.r());
            if (activityC11359x4d6f2c6f.f154479i) {
                intent.putExtra("geta8key_scene", 3);
            } else {
                intent.putExtra("geta8key_scene", 8);
            }
            j45.l.n(activityC11359x4d6f2c6f, "webview", "com.tencent.mm.plugin.webview.ui.tools.WebViewUI", intent, 100);
        } else if (activityC11359x4d6f2c6f.f154474d) {
            db5.e1.u(activityC11359x4d6f2c6f, activityC11359x4d6f2c6f.getString(com.p314xaae8f345.mm.R.C30867xcad56011.bee), null, new p61.v(this), new p61.w(this));
        } else {
            activityC11359x4d6f2c6f.T6(false);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/account/bind/ui/BindLinkedInUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
