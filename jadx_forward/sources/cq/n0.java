package cq;

/* loaded from: classes.dex */
public final class n0 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302780a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f302781b;

    public n0(yz5.l lVar, yz5.l lVar2) {
        this.f302780a = lVar;
        this.f302781b = lVar2;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        boolean b17 = fVar.b();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (b17) {
            yz5.l lVar = this.f302780a;
            if (lVar != null) {
                com.p314xaae8f345.mm.p2495xc50a8b8b.f resp = fVar.f152151d;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp, "resp");
                lVar.mo146xb9724478(resp);
                return f0Var;
            }
        } else {
            yz5.l lVar2 = this.f302781b;
            if (lVar2 != null) {
                lVar2.mo146xb9724478(fVar);
                return f0Var;
            }
        }
        return null;
    }
}
