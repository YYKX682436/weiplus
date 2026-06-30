package cb1;

/* loaded from: classes7.dex */
public final class r implements km5.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121829a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f121830b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ cb1.j0 f121831c;

    public r(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, int i17, cb1.j0 j0Var) {
        this.f121829a = v5Var;
        this.f121830b = i17;
        this.f121831c = j0Var;
    }

    @Override // km5.f
    public void a(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0 j0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.j0) obj;
        vi1.l2 l2Var = vi1.l2.f518934a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var = this.f121829a;
        java.lang.String mo48798x74292566 = v5Var.mo48798x74292566();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
        vi1.j2 a17 = l2Var.a(mo48798x74292566);
        if (a17 != null) {
            vi1.l1.f518932a.a().ud(a17);
        }
        java.lang.String mo48798x742925662 = v5Var.mo48798x74292566();
        if (mo48798x742925662 != null) {
            l2Var.d(mo48798x742925662);
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("callResult: ");
        sb6.append(j0Var.f162853b);
        sb6.append(' ');
        java.util.Map map = j0Var.f162852a;
        sb6.append(map);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiGetPhoneNumberNew", sb6.toString());
        v5Var.a(this.f121830b, this.f121831c.p(j0Var.f162853b, map));
    }
}
