package c61;

/* loaded from: classes2.dex */
public final class k2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ c61.p2 f120617a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120618b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f120619c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ org.json.JSONObject f120620d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f120621e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f120622f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f120623g;

    public k2(c61.p2 p2Var, java.lang.String str, android.content.Context context, org.json.JSONObject jSONObject, java.lang.String str2, boolean z17, java.util.Map map) {
        this.f120617a = p2Var;
        this.f120618b = str;
        this.f120619c = context;
        this.f120620d = jSONObject;
        this.f120621e = str2;
        this.f120622f = z17;
        this.f120623g = map;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String str;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            boolean z17 = true;
            java.util.LinkedList m75941xfb821914 = ((r45.ua1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb821914, "getContactList(...)");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) kz5.n0.Z(m75941xfb821914);
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            c61.p2 p2Var = this.f120617a;
            java.util.HashMap hashMap = p2Var.f120749f;
            java.util.LinkedList m75941xfb8219142 = ((r45.ua1) fVar.f152151d).m75941xfb821914(1);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m75941xfb8219142, "getContactList(...)");
            java.lang.Object Z = kz5.n0.Z(m75941xfb8219142);
            java.lang.String str2 = this.f120618b;
            hashMap.put(str2, Z);
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str);
            java.lang.String str3 = this.f120621e;
            android.content.Context context = this.f120619c;
            if (K0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "username nil");
                z17 = false;
                db5.t7.m123882x26a183b(context, com.p314xaae8f345.mm.R.C30867xcad56011.clo, 0).show();
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("0,2,");
                sb6.append(str2);
                sb6.append(",2,");
                sb6.append(str3 != null ? str3 : "");
                g0Var.mo68478xbd3cda5f(21172, sb6.toString());
            } else {
                p2Var.wj(str, context, context, this.f120620d);
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0 g0Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE;
                java.lang.StringBuilder sb7 = new java.lang.StringBuilder("0,2,");
                sb7.append(str2);
                sb7.append(",1,");
                sb7.append(str3 != null ? str3 : "");
                g0Var2.mo68478xbd3cda5f(21172, sb7.toString());
            }
            if (this.f120622f) {
                p2Var.Ij(this.f120623g, z17);
            }
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderCommonService", "cgi failed.");
        }
        return jz5.f0.f384359a;
    }
}
