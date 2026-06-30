package w71;

/* loaded from: classes11.dex */
public final class d1 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ w71.e1 f524928a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ yz5.l f524929b;

    public d1(w71.e1 e1Var, yz5.l lVar) {
        this.f524928a = e1Var;
        this.f524929b = lVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        bw5.a0 a0Var = new bw5.a0();
        a0Var.c(this.f524928a.f524931m);
        a0Var.b(fVar.f152149b);
        a0Var.f106485d = fVar.f152148a;
        boolean[] zArr = a0Var.f106490i;
        zArr[1] = true;
        a0Var.f106488g = com.p314xaae8f345.mm.p2495xc50a8b8b.g.b(((r45.js5) fVar.f152151d).mo14344x5f01b1f6());
        zArr[4] = true;
        this.f524929b.mo146xb9724478(a0Var);
        return jz5.f0.f384359a;
    }
}
