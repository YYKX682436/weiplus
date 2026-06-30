package ai0;

/* loaded from: classes14.dex */
public final class e implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 f86584d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f86585e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.n1 f86586f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ai0.g f86587g;

    public e(com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x80773040, android.content.Context context, vh0.n1 n1Var, ai0.g gVar) {
        this.f86584d = c10697x80773040;
        this.f86585e = context;
        this.f86586f = n1Var;
        this.f86587g = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/widget/PrivacyAgreementDialog$build$spanContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.p772xce036727.C10697x80773040 c10697x80773040 = this.f86584d;
        java.lang.String str = c10697x80773040 != null ? c10697x80773040.f149394f : null;
        android.content.Context context = this.f86585e;
        if (str == null) {
            str = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.n6w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
        }
        ((vh0.f3) this.f86586f).Zi(context, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportServiceClick ");
        ai0.g gVar = this.f86587g;
        java.lang.String str2 = gVar.f86592c;
        sb6.append(str2);
        sb6.append(", ");
        int i17 = gVar.f86593d;
        sb6.append(i17);
        sb6.append(", ");
        java.lang.String str3 = gVar.f86594e;
        sb6.append(str3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PrivacyAgreementDialog", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", str2);
        hashMap.put("enter_type", java.lang.Integer.valueOf(i17));
        hashMap.put("enter_sessionid", str3);
        hashMap.put("view_id", "yuanbao_service_detail");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/widget/PrivacyAgreementDialog$build$spanContent$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
