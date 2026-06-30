package cr3;

/* loaded from: classes11.dex */
public class d implements com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j41.e0 f303460a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2621x8fb0427b.z3 f303461b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j41.d0 f303462c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f303463d;

    public d(j41.e0 e0Var, com.p314xaae8f345.mm.p2621x8fb0427b.z3 z3Var, j41.d0 d0Var, android.content.Context context) {
        this.f303460a = e0Var;
        this.f303461b = z3Var;
        this.f303462c = d0Var;
        this.f303463d = context;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r0
    public boolean a(com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb c21560x1fce98fb) {
        j41.e0 e0Var = this.f303460a;
        java.lang.String str = e0Var.f379156e;
        try {
            str = new org.json.JSONObject(e0Var.f379156e).optString("tel");
        } catch (org.json.JSONException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.Profile.OpenIMProfileLogic", e17, "OpenIMCustomDetail.OPENIM_ACTION_DIAL_PHONE click parse error", new java.lang.Object[0]);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(15319, this.f303461b.Q0(), java.lang.Integer.valueOf(e0Var.f379155d), this.f303462c.f379150a);
        android.content.Intent intent = new android.content.Intent("android.intent.action.DIAL", android.net.Uri.parse("tel:" + str));
        intent.setFlags(268435456);
        android.content.Context context = this.f303463d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$2", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/plugin/profile/logic/OpenIMProfileLogic$2", "onPreferenceClick", "(Lcom/tencent/mm/ui/base/preference/Preference;)Z", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        return true;
    }
}
