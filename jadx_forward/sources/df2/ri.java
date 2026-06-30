package df2;

/* loaded from: classes3.dex */
public final class ri extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.m01 f312781d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ df2.wi f312782e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ri(r45.m01 m01Var, df2.wi wiVar) {
        super(1);
        this.f312781d = m01Var;
        this.f312782e = wiVar;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        df2.wi wiVar = this.f312782e;
        if (booleanValue) {
            if (kz5.z.G(new java.lang.Integer[]{1, 5}, java.lang.Integer.valueOf(this.f312781d.m75939xb282bd08(0)))) {
                ((mm2.c1) wiVar.m56788xbba4bfc0(mm2.c1.class)).D5 = true;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19793xceab7f56 c19793xceab7f56 = wiVar.f313226p;
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19788xd7cfd73e c19788xd7cfd73e = wiVar.f313227q;
            if (c19793xceab7f56 != null && c19788xd7cfd73e != null) {
                wiVar.Z6(c19793xceab7f56, c19788xd7cfd73e);
            }
        } else {
            android.content.Context O6 = wiVar.O6();
            pf5.z zVar = pf5.z.f435481a;
            if (!(O6 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                throw new java.lang.IllegalStateException("Check failed.".toString());
            }
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) O6).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1539xa3009fa4.b8.class)).a7();
        }
        return jz5.f0.f384359a;
    }
}
