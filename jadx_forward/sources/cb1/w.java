package cb1;

/* loaded from: classes7.dex */
public final class w extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f121857d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ eb1.d f121858e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121859f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ cb1.i f121860g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(vi1.j2 j2Var, eb1.d dVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, cb1.i iVar) {
        super(0);
        this.f121857d = j2Var;
        this.f121858e = dVar;
        this.f121859f = v5Var;
        this.f121860g = iVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        r45.i7 i7Var;
        vi1.j2 j2Var = this.f121857d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518893i);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            j2Var.f518893i = valueOf.longValue() + 1;
        }
        cb1.i iVar = this.f121860g;
        java.lang.String str = (iVar == null || (i7Var = iVar.f121786b) == null) ? null : i7Var.f458307e;
        if (str == null) {
            str = "";
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121859f;
        this.f121858e.h(v5Var, str, (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1) v5Var.q(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.r1.class)).r(v5Var);
        return jz5.f0.f384359a;
    }
}
