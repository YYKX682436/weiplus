package ai0;

/* loaded from: classes14.dex */
public final class c implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ai0.g f5047a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.widget.dialog.z2 f5048b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ kotlin.coroutines.Continuation f5049c;

    public c(ai0.g gVar, com.tencent.mm.ui.widget.dialog.z2 z2Var, kotlin.coroutines.Continuation continuation) {
        this.f5047a = gVar;
        this.f5048b = z2Var;
        this.f5049c = continuation;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        ai0.g gVar = this.f5047a;
        gVar.f5079b = true;
        this.f5048b.B();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("reportAgreeClick ");
        java.lang.String str = gVar.f5059c;
        sb6.append(str);
        sb6.append(", ");
        int i17 = gVar.f5060d;
        sb6.append(i17);
        sb6.append(", ");
        java.lang.String str2 = gVar.f5061e;
        sb6.append(str2);
        com.tencent.mars.xlog.Log.i("MicroMsg.PrivacyAgreementDialog", sb6.toString());
        java.util.HashMap hashMap = new java.util.HashMap();
        hashMap.put("chat_name", str);
        hashMap.put("enter_type", java.lang.Integer.valueOf(i17));
        hashMap.put("enter_sessionid", str2);
        hashMap.put("view_id", "yuanbao_private_agree");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej("view_clk", hashMap, 34004);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        this.f5049c.resumeWith(kotlin.Result.m521constructorimpl(java.lang.Boolean.TRUE));
    }
}
