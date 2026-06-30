package cx;

/* loaded from: classes7.dex */
public final class s0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f305992d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cx.w0 f305993e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305994f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305995g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f305996h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s0(int i17, cx.w0 w0Var, java.lang.String str, java.lang.String str2, java.lang.String str3) {
        super(0);
        this.f305992d = i17;
        this.f305993e = w0Var;
        this.f305994f = str;
        this.f305995g = str2;
        this.f305996h = str3;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e enumC10865x672e806e = this.f305992d == 3 ? com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29654x7c8dffe4 : com.p314xaae8f345.mm.p2621x8fb0427b.c2.f275338c ? com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29655x437ba46 : com.p314xaae8f345.mm.p840x5dc4f1ad.p841xc5476f33.scl.p846xe68be4e1.EnumC10865x672e806e.f29657x8d7557bd;
        cx.w0 w0Var = this.f305993e;
        hq0.e0 e0Var = (hq0.e0) w0Var.A.get("frames");
        if (e0Var != null) {
            java.lang.String str = this.f305994f;
            java.lang.String str2 = this.f305996h;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("preLayout from native ");
            sb6.append(e0Var);
            sb6.append(".id frameSet:");
            sb6.append(str);
            sb6.append(" data:");
            java.lang.String str3 = this.f305995g;
            sb6.append(str3.length());
            sb6.append(" ext:");
            sb6.append(str2);
            sb6.append(" reportScene:");
            sb6.append(enumC10865x672e806e);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicBrandBaseBiz", sb6.toString());
            w0Var.f306012x.l(e0Var.f364517e, str, str3, enumC10865x672e806e, str2, cx.r0.f305990d);
        }
        return jz5.f0.f384359a;
    }
}
