package ld1;

/* loaded from: classes7.dex */
public class c implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0 f399589a = this;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.v0 f399590b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 f399591c;

    public c(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var) {
        this.f399591c = d0Var;
        ld1.b bVar = new ld1.b(this);
        this.f399590b = bVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.a(d0Var.mo48798x74292566(), bVar);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.l0
    public void a(java.lang.Object obj) {
        if (obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1102x25ec1552.C12197xbee4b293) {
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1102x25ec1552.C12197xbee4b293) obj).f164006d;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.d0 d0Var = this.f399591c;
            if (u46.l.c(str, d0Var.mo48798x74292566())) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.ipc.C11895xe75b4e54.F(d0Var.mo48798x74292566(), this.f399589a);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.x0.e(d0Var.mo48798x74292566(), this.f399590b);
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.C11510xdd90c2f2 t37 = d0Var.t3();
                if (t37 != null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9 C0 = t37.C0();
                    ld1.e eVar = new ld1.e();
                    eVar.u(C0);
                    eVar.m();
                }
            }
        }
    }
}
