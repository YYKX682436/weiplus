package dk2;

/* loaded from: classes3.dex */
public final class p2 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f315425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f315426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f315427c;

    public p2(yz5.l lVar, java.lang.String str, dk2.r4 r4Var) {
        this.f315425a = lVar;
        this.f315426b = str;
        this.f315427c = r4Var;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        jz5.f0 f0Var = jz5.f0.f384359a;
        yz5.l lVar = this.f315425a;
        if (i17 == 0 && fVar.f152149b == 0) {
            st2.g3 g3Var = st2.g3.f493859a;
            gk2.e eVar = this.f315427c.f315540b;
            com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
            if (g3Var.s(this.f315426b, eVar, (r45.dv1) resp)) {
                if (lVar != null) {
                    lVar.mo146xb9724478(java.lang.Boolean.TRUE);
                    return f0Var;
                }
            } else if (lVar != null) {
                lVar.mo146xb9724478(java.lang.Boolean.FALSE);
                return f0Var;
            }
        } else if (lVar != null) {
            lVar.mo146xb9724478(java.lang.Boolean.FALSE);
            return f0Var;
        }
        return null;
    }
}
