package ts3;

/* loaded from: classes.dex */
public class n implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f503218d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f503219e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 f503220f;

    public n(com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152, org.json.JSONObject jSONObject, java.lang.String str) {
        this.f503220f = activityC16956x7944e152;
        this.f503218d = jSONObject;
        this.f503219e = str;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1977xbdf5c67e.ui.ActivityC16956x7944e152 activityC16956x7944e152 = this.f503220f;
        activityC16956x7944e152.f236594i = 22;
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15413, 22, "", "", "", "", "", 0, 0, activityC16956x7944e152.f236595m, this.f503218d.toString().replaceAll(",", ";"));
        android.content.Intent intent = new android.content.Intent();
        intent.putExtra("rawUrl", this.f503219e);
        intent.putExtra("geta8key_scene", 79);
        j45.l.j(activityC16956x7944e152, "webview", ".ui.tools.WebViewUI", intent, null);
        yj0.a.h(this, "com/tencent/mm/plugin/readerapp/ui/ReaderAppUI$10", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
