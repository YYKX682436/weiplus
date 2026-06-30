package cb1;

/* loaded from: classes7.dex */
public final class m implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f121801a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121802b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121803c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f121804d;

    public m(cb1.j0 j0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, boolean z17) {
        this.f121801a = j0Var;
        this.f121802b = v5Var;
        this.f121803c = str;
        this.f121804d = z17;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        java.lang.String apiName = this.f121803c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(apiName, "$apiName");
        vi1.l2 l2Var = vi1.l2.f518934a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121802b;
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vi1.j2 a17 = l2Var.a(mo48798x74292566);
        this.f121801a.getClass();
        km5.b c17 = km5.u.c();
        if (a17 != null) {
            a17.f518887c++;
        }
        java.lang.String mo48798x742925662 = v5Var.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x742925662, "getAppId(...)");
        new vi1.m(mo48798x742925662, apiName, this.f121804d).a(new cb1.j(c17, list));
        return null;
    }
}
