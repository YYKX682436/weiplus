package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class pe extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f190247d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af f190248e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pe(boolean z17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar) {
        super(1);
        this.f190247d = z17;
        this.f190248e = afVar;
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar, java.lang.String str, boolean z17) {
        java.lang.String str2;
        java.lang.String m75945x2fec8307;
        java.util.HashMap hashMap = new java.util.HashMap();
        r45.m70 m70Var = afVar.T;
        java.lang.String str3 = "";
        if (m70Var == null || (str2 = m70Var.m75945x2fec8307(0)) == null) {
            str2 = "";
        }
        hashMap.put("activityId", str2);
        hashMap.put("is_fast_share", "1");
        hashMap.put("share_type", "1");
        hashMap.put("share_wx_username", str);
        r45.m70 m70Var2 = afVar.T;
        if (m70Var2 != null && (m75945x2fec8307 = m70Var2.m75945x2fec8307(21)) != null) {
            str3 = m75945x2fec8307;
        }
        hashMap.put("resource_id", str3);
        hashMap.put("enter_sence", afVar.P);
        hashMap.put("share_content_type", z17 ? "2" : "1");
        i95.m c17 = i95.n0.c(ml2.j0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.zb.T8((zy2.zb) c17, ml2.t1.Y1, hashMap, afVar.Z, afVar.f187799p0, null, null, false, 112, null);
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        r45.el4 el4Var;
        r45.el4 el4Var2;
        r45.el4 el4Var3;
        r45.el4 el4Var4;
        java.lang.String str = (java.lang.String) obj;
        if (str != null) {
            boolean z17 = this.f190247d;
            java.lang.String str2 = null;
            r3 = null;
            android.graphics.Bitmap bitmap = null;
            str2 = null;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af afVar = this.f190248e;
            if (z17) {
                afVar.e7();
                java.lang.String str3 = afVar.V;
                if (str3 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str3)) {
                    bitmap = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.w0(com.p314xaae8f345.mm.sdk.p2603x2137b148.x.j0(str3, 140, 140, i65.a.g(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a)), com.p314xaae8f345.mm.p661xcdc6dad4.p664x36f002.C10401x212d30.m43587xb5c99c46(str3).m43592x7a249f0b() >= 0 ? r4 : 0);
                }
                ((r35.k1) ((o25.q1) i95.n0.c(o25.q1.class))).Ni(afVar.m158354x19263085(), str, bitmap, afVar.m158354x19263085().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f572084ya), 3, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.le(str, afVar, z17)).show();
            } else {
                java.lang.String X6 = afVar.X6("1");
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(afVar.f187788d, "#prepareQuickShareMenu finally share url = ".concat(X6));
                ot0.q qVar = new ot0.q();
                r45.m70 m70Var = afVar.T;
                qVar.f430187f = (m70Var == null || (el4Var4 = (r45.el4) m70Var.m75936x14adae67(25)) == null) ? null : el4Var4.m75945x2fec8307(0);
                r45.m70 m70Var2 = afVar.T;
                qVar.f430191g = (m70Var2 == null || (el4Var3 = (r45.el4) m70Var2.m75936x14adae67(25)) == null) ? null : el4Var3.m75945x2fec8307(1);
                qVar.f430195h = "view";
                qVar.f430199i = 5;
                qVar.f430207k = X6;
                r45.m70 m70Var3 = afVar.T;
                qVar.f430267z = (m70Var3 == null || (el4Var2 = (r45.el4) m70Var3.m75936x14adae67(25)) == null) ? null : el4Var2.m75945x2fec8307(3);
                o25.q1 q1Var = (o25.q1) i95.n0.c(o25.q1.class);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = afVar.m158354x19263085();
                r45.m70 m70Var4 = afVar.T;
                if (m70Var4 != null && (el4Var = (r45.el4) m70Var4.m75936x14adae67(25)) != null) {
                    str2 = el4Var.m75945x2fec8307(0);
                }
                ((r35.k1) q1Var).Ri(m158354x19263085, str, str2, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.me(str, qVar, afVar, z17), com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ne.f190107a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.oe.f190171d);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.af.Q6(afVar);
        }
        return jz5.f0.f384359a;
    }
}
