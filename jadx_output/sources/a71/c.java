package a71;

/* loaded from: classes.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f1902d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1903e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1904f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1905g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f1906h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f1902d = i17;
        this.f1903e = str;
        this.f1904f = str2;
        this.f1905g = str3;
        this.f1906h = str4;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new a71.c(this.f1902d, this.f1903e, this.f1904f, this.f1905g, this.f1906h, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        a71.c cVar = (a71.c) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        cVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("doPolicyCgi isAgree:");
        int i17 = this.f1902d;
        sb6.append(i17);
        sb6.append(" customInfo:");
        java.lang.String str = this.f1903e;
        sb6.append(str);
        sb6.append(" ticket:");
        java.lang.String str2 = this.f1904f;
        sb6.append(str2);
        sb6.append(" policyList:");
        java.lang.String str3 = this.f1905g;
        sb6.append(str3);
        sb6.append(" from:");
        sb6.append(this.f1906h);
        com.tencent.mars.xlog.Log.i("MicroMsg.Account.AccountComplianceReceiver", sb6.toString());
        r45.ia5 ia5Var = new r45.ia5();
        ia5Var.f376889d = i17 == 1 ? 1 : 2;
        ia5Var.f376890e = 1;
        ia5Var.f376891f = str3;
        ia5Var.f376892g = str2;
        ia5Var.f376893h = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5280;
        lVar.f70666c = "/cgi-bin/micromsg-bin/policyagreementop";
        lVar.f70664a = ia5Var;
        lVar.f70665b = new r45.ja5();
        kotlinx.coroutines.flow.j a17 = o01.d.f341891a.a(lVar.a());
        com.tencent.mm.sdk.coroutines.LifecycleScope lifecycleScope = gm0.j1.b().f273245h.f273145e;
        if (lifecycleScope != null) {
            v65.i.b(lifecycleScope, null, new a71.b(a17, this.f1902d, this.f1903e, this.f1904f, this.f1905g, null), 1, null);
        }
        return jz5.f0.f302826a;
    }
}
