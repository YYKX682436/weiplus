package c61;

/* loaded from: classes2.dex */
public final class j2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f39053a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f39054b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f39055c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.storage.FinderItem f39056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f39057e;

    public j2(c61.p2 p2Var, java.lang.String str, android.content.Context context, com.tencent.mm.plugin.finder.storage.FinderItem finderItem, org.json.JSONObject jSONObject) {
        this.f39053a = p2Var;
        this.f39054b = str;
        this.f39055c = context;
        this.f39056d = finderItem;
        this.f39057e = jSONObject;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        java.lang.String str;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        if (fVar.f70615a == 0 && fVar.f70616b == 0) {
            java.util.LinkedList list = ((r45.ua1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list, "getContactList(...)");
            com.tencent.mm.protocal.protobuf.FinderContact finderContact = (com.tencent.mm.protocal.protobuf.FinderContact) kz5.n0.Z(list);
            if (finderContact == null || (str = finderContact.getUsername()) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            java.util.HashMap hashMap = this.f39053a.f39216f;
            java.util.LinkedList list2 = ((r45.ua1) fVar.f70618d).getList(1);
            kotlin.jvm.internal.o.f(list2, "getContactList(...)");
            hashMap.put(this.f39054b, kz5.n0.Z(list2));
            if (com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
                com.tencent.mars.xlog.Log.i("FinderCommonService", "username nil");
                db5.t7.makeText(this.f39055c, com.tencent.mm.R.string.clo, 0).show();
            } else {
                c61.p2 p2Var = this.f39053a;
                android.content.Context context = this.f39055c;
                p2Var.vj(str2, context, this.f39056d, context, this.f39057e);
            }
        } else {
            com.tencent.mars.xlog.Log.i("FinderCommonService", "cgi failed.");
        }
        return jz5.f0.f302826a;
    }
}
