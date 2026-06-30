package cr3;

/* loaded from: classes11.dex */
public class e implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f303472a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f303473b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f303474c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303475d;

    public e(j41.e0 e0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, j41.d0 d0Var, android.content.Context context) {
        this.f303472a = e0Var;
        this.f303473b = z3Var;
        this.f303474c = d0Var;
        this.f303475d = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        java.lang.String str;
        j41.e0 e0Var = this.f303472a;
        try {
            str = new org.json.JSONObject(e0Var.f379156e).optString("mailto");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Profile.OpenIMProfileLogic", e17, "loadProfile", new java.lang.Object[0]);
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15319, this.f303473b.Q0(), java.lang.Integer.valueOf(e0Var.f379155d), this.f303474c.f379150a);
        android.content.Intent intent = new android.content.Intent("android.intent.action.SENDTO");
        intent.setData(android.net.Uri.parse("mailto:" + str));
        try {
            android.content.Context context = this.f303475d;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(intent);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$3", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            context.startActivity((android.content.Intent) arrayList.get(0));
            yj0.a.f(context, "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$3", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
            return true;
        } catch (java.lang.Exception e18) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.Profile.OpenIMProfileLogic", "onPreferenceClick OPENIM_ACTION_OPEN_MAIL_BOX Exception:%s %s", e18.getClass().getSimpleName(), e18.getMessage());
            return true;
        }
    }
}
