package p81;

/* loaded from: classes7.dex */
public final class g implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ k91.a3 f434252a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p81.j f434253b;

    public g(k91.a3 a3Var, p81.j jVar) {
        this.f434252a = a3Var;
        this.f434253b = jVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.k6
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o6 request, int i17, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        k91.a3 a3Var = this.f434252a;
        if (a3Var != null) {
            p81.j jVar = this.f434253b;
            java.lang.String field_appId = jVar.f434256a.f67698x28d45f97;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_appId, "field_appId");
            java.lang.String field_packageKey = jVar.f434256a.f67706xbae6789e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_packageKey, "field_packageKey");
            k91.u0 u0Var = (k91.u0) a3Var;
            k91.r0 Bi = u0Var.Bi(field_appId);
            java.util.Map map = Bi.f387290a;
            java.lang.Object obj = map.get(field_packageKey);
            if (obj == null) {
                obj = new k91.m0(false, 0.0f, null, 7, null);
                map.put(field_packageKey, obj);
            }
            k91.x0[] x0VarArr = k91.x0.f387348d;
            java.util.Map map2 = ((k91.m0) obj).f387207c;
            java.lang.Object obj2 = map2.get(1);
            if (obj2 == null) {
                obj2 = new k91.q0(false, 0L, 3, null);
                map2.put(1, obj2);
            }
            k91.q0 q0Var = (k91.q0) obj2;
            q0Var.f387262a = true;
            q0Var.f387263b = java.lang.System.currentTimeMillis();
            u0Var.Ri(field_appId, Bi);
        }
    }
}
