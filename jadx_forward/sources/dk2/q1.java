package dk2;

/* loaded from: classes.dex */
public final class q1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.r f315466a;

    public q1(yz5.r rVar) {
        this.f315466a = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        yz5.r rVar = this.f315466a;
        if (rVar == null) {
            return null;
        }
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar.f152148a);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar.f152149b);
        java.lang.String str = fVar.f152150c;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
        rVar.C(valueOf, valueOf2, str, resp);
        return jz5.f0.f384359a;
    }
}
