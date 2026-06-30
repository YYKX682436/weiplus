package hw;

/* loaded from: classes7.dex */
public final class a0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f366887d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hw.c0 f366888e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366889f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366890g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f366891h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(int i17, hw.c0 c0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f366887d = i17;
        this.f366888e = c0Var;
        this.f366889f = str;
        this.f366890g = str2;
        this.f366891h = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e enumC10865x672e806e = this.f366887d == 3 ? com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29654x7c8dffe4 : com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275338c ? com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29655x437ba46 : com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29657x8d7557bd;
        hw.c0 c0Var = this.f366888e;
        hq0.e0 e0Var = (hq0.e0) c0Var.A.get("frames");
        if (e0Var != null) {
            java.lang.String str = this.f366889f;
            java.lang.String str2 = this.f366891h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preLayout from native ");
            sb6.append(e0Var);
            sb6.append(".id frameSet:");
            sb6.append(str);
            sb6.append(" data:");
            java.lang.String str3 = this.f366890g;
            sb6.append(str3.length());
            sb6.append(" ext:");
            sb6.append(str2);
            sb6.append(" reportScene:");
            sb6.append(enumC10865x672e806e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicEcsTLBaseBiz", sb6.toString());
            c0Var.f366895x.l(e0Var.f364517e, str, str3, enumC10865x672e806e, str2, hw.z.f366984d);
        }
        return jz5.f0.f384359a;
    }
}
