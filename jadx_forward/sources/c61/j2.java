package c61;

/* loaded from: classes2.dex */
public final class j2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f120586a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120587b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120588c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f120589d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f120590e;

    public j2(c61.p2 p2Var, java.lang.String str, android.content.Context context, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079, org.json.JSONObject jSONObject) {
        this.f120586a = p2Var;
        this.f120587b = str;
        this.f120588c = context;
        this.f120589d = c14994x9b99c079;
        this.f120590e = jSONObject;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            java.util.LinkedList m75941xfb821914 = ((r45.ua1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContactList(...)");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) kz5.n0.Z(m75941xfb821914);
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            java.lang.String str2 = str;
            java.util.HashMap hashMap = this.f120586a.f120749f;
            java.util.LinkedList m75941xfb8219142 = ((r45.ua1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getContactList(...)");
            hashMap.put(this.f120587b, kz5.n0.Z(m75941xfb8219142));
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str2)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "username nil");
                db5.t7.m123882x26a183b(this.f120588c, com.p314xaae8f345.mm.R.C30867xcad56011.clo, 0).show();
            } else {
                c61.p2 p2Var = this.f120586a;
                android.content.Context context = this.f120588c;
                p2Var.vj(str2, context, this.f120589d, context, this.f120590e);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "cgi failed.");
        }
        return jz5.f0.f384359a;
    }
}
