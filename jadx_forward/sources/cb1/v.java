package cb1;

/* loaded from: classes7.dex */
public final class v extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ vi1.j2 f121848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 f121849e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f121850f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f121851g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ km5.b f121852h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(vi1.j2 j2Var, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1170x34628f.v5 v5Var, java.lang.String str, boolean z17, km5.b bVar) {
        super(1);
        this.f121848d = j2Var;
        this.f121849e = v5Var;
        this.f121850f = str;
        this.f121851g = z17;
        this.f121852h = bVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        int intValue = ((java.lang.Number) obj).intValue();
        km5.b bVar = this.f121852h;
        vi1.j2 j2Var = this.f121848d;
        if (intValue == -1) {
            if (j2Var != null) {
                j2Var.f518886b = 1L;
            }
            if (j2Var != null) {
                java.lang.Long valueOf = java.lang.Long.valueOf(j2Var.f518887c);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                j2Var.f518887c = valueOf.longValue() + 1;
            }
            java.lang.String mo48798x74292566 = this.f121849e.mo48798x74292566();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo48798x74292566, "getAppId(...)");
            new vi1.m(mo48798x74292566, this.f121850f, this.f121851g).a(new cb1.u(bVar));
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiGetPhoneNumberNew", "bind wechat phone number fail");
            if (j2Var != null) {
                j2Var.f518886b = 0L;
            }
            bVar.a("user cancel");
        }
        return jz5.f0.f384359a;
    }
}
