package el2;

/* loaded from: classes3.dex */
public final class q1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ el2.c2 f335425a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ r45.y42 f335426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.l f335427c;

    public q1(el2.c2 c2Var, r45.y42 y42Var, yz5.l lVar) {
        this.f335425a = c2Var;
        this.f335426b = y42Var;
        this.f335427c = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.String str = this.f335425a.f335296f;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getJumpInfo] type = ");
        r45.y42 y42Var = this.f335426b;
        sb6.append(y42Var.m75939xb282bd08(1));
        sb6.append(", jumpId:");
        java.lang.String m75945x2fec8307 = y42Var.m75945x2fec8307(4);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        sb6.append(m75945x2fec8307);
        sb6.append(", errcode = ");
        sb6.append(fVar.f152149b);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        int i17 = fVar.f152148a;
        yz5.l lVar = this.f335427c;
        if (i17 == 0 && fVar.f152149b == 0) {
            lVar.mo146xb9724478(fVar.f152151d);
        } else {
            lVar.mo146xb9724478(null);
        }
        return jz5.f0.f384359a;
    }
}
