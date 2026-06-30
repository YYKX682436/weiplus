package vi1;

/* loaded from: classes7.dex */
public final class x0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.x20 f519026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ vi1.b1 f519027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f519028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f519029g;

    public x0(r45.x20 x20Var, vi1.b1 b1Var, boolean z17, java.lang.String str) {
        this.f519026d = x20Var;
        this.f519027e = b1Var;
        this.f519028f = z17;
        this.f519029g = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.Long valueOf;
        r45.x20 x20Var = this.f519026d;
        int i17 = x20Var.f471223d;
        vi1.b1 b1Var = this.f519027e;
        if (i17 == 0) {
            vi1.l2 l2Var = vi1.l2.f518934a;
            vi1.j2 a17 = l2Var.a(b1Var.f518807b);
            if (a17 != null) {
                vi1.j2 a18 = l2Var.a(b1Var.f518807b);
                valueOf = a18 != null ? java.lang.Long.valueOf(a18.f518900p) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                a17.f518900p = valueOf.longValue() + 1;
            }
            java.lang.String str = x20Var.f471224e;
            java.lang.String str2 = x20Var.f471225f;
            java.lang.String str3 = x20Var.f471226g;
            java.lang.String str4 = x20Var.f471227h;
            java.lang.String str5 = str4 == null ? "" : str4;
            java.lang.String str6 = x20Var.f471228i;
            java.lang.String str7 = str6 == null ? "" : str6;
            if (!this.f519028f) {
                vi1.o0 o0Var = vi1.o0.f518949a;
                java.lang.String str8 = this.f519029g;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
                o0Var.a(new com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1176xef7fce37.C12542x3a17e581(str8, str3, str, str2, str5, false, false, false, true, str7, 224, null));
                b1Var.f518808c.mo152xb9724478();
                return;
            }
            java.lang.String appId = b1Var.f518807b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(appId, "appId");
            java.lang.String mobile = this.f519029g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(mobile, "mobile");
            vi1.w0 w0Var = new vi1.w0(this.f519029g, str3, str, str2, str5, str7, this.f519027e);
            r45.ys6 ys6Var = new r45.ys6();
            ys6Var.f472871d = appId;
            ys6Var.f472872e = mobile;
            ys6Var.f472873f = 0;
            ((km5.q) ((com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0) nd.f.a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1162xe37ee6f4.c0.class)).e1("/cgi-bin/mmbiz-bin/wxaapp/customphone/updateuserphone", appId, ys6Var, r45.zs6.class).n(new vi1.r(w0Var))).s(new vi1.s(w0Var));
            return;
        }
        if (i17 == 1) {
            vi1.l2 l2Var2 = vi1.l2.f518934a;
            vi1.j2 a19 = l2Var2.a(b1Var.f518807b);
            if (a19 != null) {
                vi1.j2 a27 = l2Var2.a(b1Var.f518807b);
                valueOf = a27 != null ? java.lang.Long.valueOf(a27.f518901q) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                a19.f518901q = valueOf.longValue() + 1;
            }
            java.lang.String string = b1Var.f518806a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571680m8);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
            b1Var.a(string);
            return;
        }
        if (i17 == 3) {
            vi1.l2 l2Var3 = vi1.l2.f518934a;
            vi1.j2 a28 = l2Var3.a(b1Var.f518807b);
            if (a28 != null) {
                vi1.j2 a29 = l2Var3.a(b1Var.f518807b);
                valueOf = a29 != null ? java.lang.Long.valueOf(a29.f518901q) : null;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
                a28.f518901q = valueOf.longValue() + 1;
            }
            java.lang.String string2 = b1Var.f518806a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m_);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string2, "getString(...)");
            b1Var.a(string2);
            return;
        }
        vi1.l2 l2Var4 = vi1.l2.f518934a;
        vi1.j2 a37 = l2Var4.a(b1Var.f518807b);
        if (a37 != null) {
            vi1.j2 a38 = l2Var4.a(b1Var.f518807b);
            valueOf = a38 != null ? java.lang.Long.valueOf(a38.f518901q) : null;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(valueOf);
            a37.f518901q = valueOf.longValue() + 1;
        }
        java.lang.String string3 = b1Var.f518806a.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f571684mc);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string3, "getString(...)");
        b1Var.a(string3);
    }
}
