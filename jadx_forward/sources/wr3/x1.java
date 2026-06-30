package wr3;

/* loaded from: classes11.dex */
public final class x1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ wr3.v1 f530447d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wr3.z1 f530448e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.l5 f530449f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f530450g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.o5 f530451h;

    public x1(wr3.v1 v1Var, wr3.z1 z1Var, r45.l5 l5Var, int i17, r45.o5 o5Var) {
        this.f530447d = v1Var;
        this.f530448e = z1Var;
        this.f530449f = l5Var;
        this.f530450g = i17;
        this.f530451h = o5Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        android.content.Intent intent;
        android.os.Bundle bundleExtra;
        android.content.Intent intent2;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$onBindVideoItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        wr3.v1 v1Var = this.f530447d;
        android.content.Context context = v1Var.f3639x46306858.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        android.widget.ImageView imageView = v1Var.f530435d;
        r45.o5 o5Var = this.f530451h;
        if (o5Var != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizProfileJumpLogic", "onClick jump to url:%s", o5Var.f463450h);
            android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
            int intExtra = (activity == null || (intent2 = activity.getIntent()) == null) ? 10000 : intent2.getIntExtra("KOpenArticleSceneFromScene", 10000);
            android.content.Intent intent3 = new android.content.Intent();
            com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 activityC16840x4302a3e2 = context instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2 ? (com.p314xaae8f345.mm.p1006xc5476f33.p1954xed8e89a9.ui.ActivityC16840x4302a3e2) context : null;
            java.lang.String b17 = ot0.g0.b(o5Var.f463450h, 126, intExtra, ((int) java.lang.System.currentTimeMillis()) / 1000, null, (activityC16840x4302a3e2 == null || (intent = activityC16840x4302a3e2.getIntent()) == null || (bundleExtra = intent.getBundleExtra("Contact_Ext_Args")) == null) ? null : bundleExtra.getString("Contact_Ext_Args_Search_Click_Id", ""));
            intent3.putExtra("rawUrl", b17);
            intent3.putExtra("useJs", true);
            intent3.putExtra("vertical_scroll", true);
            intent3.putExtra("geta8key_scene", 3);
            intent3.putExtra("geta8key_username", "");
            java.lang.String stringExtra = intent3.getStringExtra("prePublishId");
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(stringExtra)) {
                intent3.putExtra("prePublishId", "brand_profile");
                intent3.putExtra("KPublisherId", "brand_profile");
            } else {
                intent3.putExtra("KPublisherId", stringExtra);
                intent3.putExtra("prePublishId", stringExtra);
                intent3.putExtra("preUsername", intent3.getStringExtra("preUsername"));
                intent3.putExtra("preChatName", intent3.getStringExtra("preChatName"));
            }
            intent3.putExtra("preChatTYPE", intent3.getIntExtra("preChatTYPE", 0));
            intent3.putExtra("key_enable_fts_quick", true);
            int intExtra2 = intent3.getIntExtra("KOpenArticleSceneFromScene", 10000);
            ((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).getClass();
            if (com.p314xaae8f345.mm.p1006xc5476f33.p1289x8f4dc54e.ui.p1299x8438d441.p1300xed046e09.t1.e(6)) {
                if (((yq1.z) ((zq1.a0) gm0.j1.s(zq1.a0.class))).E(context, b17, o5Var.f463456p, false, 126, intExtra2, intent3)) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BizProfileJumpLogic", "jump to TmplWebview");
                }
            }
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent3, null);
        }
        wr3.z1 z1Var = this.f530448e;
        if (z1Var.f530459f) {
            gr3.b.f356380a.b(java.lang.Long.valueOf(this.f530449f.f460671d), java.lang.Long.valueOf(this.f530450g), 703L, 0L, (r29 & 16) != 0 ? 0L : 0L, (r29 & 32) != 0 ? "" : "", z1Var.f530460g, (r29 & 128) != 0 ? 0 : 0, (r29 & 256) != 0 ? 0 : 0);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/profile/ui/tab/list/BizProfileTabVideoAdapter$onBindVideoItem$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
