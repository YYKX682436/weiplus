package cb1;

/* loaded from: classes7.dex */
public final class f0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f121769d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121770e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eb1.d f121771f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(vi1.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, eb1.d dVar) {
        super(0);
        this.f121769d = j2Var;
        this.f121770e = v5Var;
        this.f121771f = dVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String mo48798x74292566;
        vi1.j2 j2Var = this.f121769d;
        if (j2Var != null) {
            java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518895k);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            j2Var.f518895k = valueOf.longValue() + 1;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121770e;
        java.lang.String mo48798x742925662 = v5Var.mo48798x74292566();
        if (mo48798x742925662 != null) {
            vi1.l2.f518934a.c(mo48798x742925662);
        }
        android.content.Context f229340d = v5Var.getF229340d();
        if (f229340d != null && (mo48798x74292566 = v5Var.mo48798x74292566()) != null) {
            vi1.g0 a17 = vi1.l1.f518932a.a();
            java.lang.String Y1 = v5Var.Y1();
            if (Y1 == null) {
                Y1 = "";
            }
            a17.oc(f229340d, mo48798x74292566, Y1, new cb1.e0(this.f121771f, v5Var));
        }
        return jz5.f0.f384359a;
    }
}
