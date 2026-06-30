package ai0;

/* loaded from: classes14.dex */
public final class f implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo f5055d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f5056e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vh0.n1 f5057f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ai0.g f5058g;

    public f(com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo, android.content.Context context, vh0.n1 n1Var, ai0.g gVar) {
        this.f5055d = iYuanBaoAgreement$AgreementInfo;
        this.f5056e = context;
        this.f5057f = n1Var;
        this.f5058g = gVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/yuanbao/widget/PrivacyAgreementDialog$build$spanContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.tencent.mm.feature.yuanbao.IYuanBaoAgreement$AgreementInfo iYuanBaoAgreement$AgreementInfo = this.f5055d;
        java.lang.String str = iYuanBaoAgreement$AgreementInfo != null ? iYuanBaoAgreement$AgreementInfo.f67861f : null;
        android.content.Context context = this.f5056e;
        if (str == null) {
            str = context.getString(com.tencent.mm.R.string.n6r);
            kotlin.jvm.internal.o.f(str, "getString(...)");
        }
        ((vh0.f3) this.f5057f).Zi(context, str);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportPrivateClick ");
        ai0.g gVar = this.f5058g;
        java.lang.String str2 = gVar.f5059c;
        sb6.append(str2);
        sb6.append(", ");
        int i17 = gVar.f5060d;
        sb6.append(i17);
        sb6.append(", ");
        java.lang.String str3 = gVar.f5061e;
        sb6.append(str3);
        com.tencent.mars.xlog.Log.i("MicroMsg.PrivacyAgreementDialog", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", str2);
        hashMap.put("enter_type", java.lang.Integer.valueOf(i17));
        hashMap.put("enter_sessionid", str3);
        hashMap.put("view_id", "yuanbao_private_detail");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        yj0.a.h(this, "com/tencent/mm/feature/yuanbao/widget/PrivacyAgreementDialog$build$spanContent$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
