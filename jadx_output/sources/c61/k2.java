package c61;

/* loaded from: classes2.dex */
public final class k2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f39084a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39085b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39086c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f39087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39088e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f39089f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f39090g;

    public k2(c61.p2 p2Var, java.lang.String str, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str2, boolean z17, java.util.Map map) {
        this.f39084a = p2Var;
        this.f39085b = str;
        this.f39086c = context;
        this.f39087d = jSONObject;
        this.f39088e = str2;
        this.f39089f = z17;
        this.f39090g = map;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            boolean z17 = true;
            java.util.LinkedList list = ((r45.ua1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getContactList(...)");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) kz5.n0.Z(list);
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            c61.p2 p2Var = this.f39084a;
            java.util.HashMap hashMap = p2Var.f39216f;
            java.util.LinkedList list2 = ((r45.ua1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list2, "getContactList(...)");
            java.lang.Object Z = kz5.n0.Z(list2);
            java.lang.String str2 = this.f39085b;
            hashMap.put(str2, Z);
            boolean K0 = com.tencent.mm.sdk.platformtools.t8.K0(str);
            java.lang.String str3 = this.f39088e;
            android.content.Context context = this.f39086c;
            if (K0) {
                com.tencent.mars.xlog.Log.i("FinderCommonService", "username nil");
                z17 = false;
                db5.t7.makeText(context, com.tencent.mm.R.string.clo, 0).show();
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0,2,");
                sb6.append(str2);
                sb6.append(",2,");
                sb6.append(str3 != null ? str3 : "");
                g0Var.kvStat(21172, sb6.toString());
            } else {
                p2Var.wj(str, context, context, this.f39087d);
                com.tencent.mm.plugin.report.service.g0 g0Var2 = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0,2,");
                sb7.append(str2);
                sb7.append(",1,");
                sb7.append(str3 != null ? str3 : "");
                g0Var2.kvStat(21172, sb7.toString());
            }
            if (this.f39089f) {
                p2Var.Ij(this.f39090g, z17);
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderCommonService", "cgi failed.");
        }
        return jz5.f0.f302826a;
    }
}
