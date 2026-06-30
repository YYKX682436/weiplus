package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5;

/* loaded from: classes5.dex */
public final class j4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f207625a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f207626b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207627c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f207628d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f207629e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f207630f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zy2.bb f207631g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.s f207632h;

    public j4(int i17, android.content.Context context, java.lang.String str, java.lang.String str2, long j17, long j18, zy2.bb bbVar, yz5.s sVar) {
        this.f207625a = i17;
        this.f207626b = context;
        this.f207627c = str;
        this.f207628d = str2;
        this.f207629e = j17;
        this.f207630f = j18;
        this.f207631g = bbVar;
        this.f207632h = sVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        java.lang.String e17;
        java.lang.String m75945x2fec8307;
        java.lang.String m75945x2fec83072;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g m75934xbce7f2f;
        java.lang.String m75945x2fec83073;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        int i17 = fVar.f152148a;
        if (i17 == 0 && fVar.f152149b == 0) {
            r45.vi2 vi2Var = (r45.vi2) ((r45.r81) fVar.f152151d).m75936x14adae67(4);
            java.lang.String str = (vi2Var == null || (m75945x2fec83073 = vi2Var.m75945x2fec8307(1)) == null) ? "" : m75945x2fec83073;
            r45.lo2 lo2Var = new r45.lo2();
            r45.vi2 vi2Var2 = (r45.vi2) ((r45.r81) fVar.f152151d).m75936x14adae67(4);
            if (vi2Var2 == null || (m75934xbce7f2f = vi2Var2.m75934xbce7f2f(4)) == null || lo2Var.mo11468x92b714fd(m75934xbce7f2f.g()) == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Finder.SessionInfoService", "extInfo is null! ");
            }
            int i18 = (lo2Var.m75939xb282bd08(1) & 1) > 0 ? 1 : 0;
            r45.vi2 vi2Var3 = (r45.vi2) ((r45.r81) fVar.f152151d).m75936x14adae67(4);
            java.lang.String str2 = (vi2Var3 == null || (m75945x2fec83072 = vi2Var3.m75945x2fec8307(0)) == null) ? "" : m75945x2fec83072;
            r45.vi2 vi2Var4 = (r45.vi2) ((r45.r81) fVar.f152151d).m75936x14adae67(4);
            int m75939xb282bd08 = vi2Var4 != null ? vi2Var4.m75939xb282bd08(5) : 0;
            r45.vi2 vi2Var5 = (r45.vi2) ((r45.r81) fVar.f152151d).m75936x14adae67(4);
            boolean m75933x41a8a7f2 = vi2Var5 != null ? vi2Var5.m75933x41a8a7f2(6) : false;
            android.content.Context context = this.f207626b;
            int i19 = this.f207625a;
            int i27 = 2;
            if (i19 == 1) {
                e17 = xy2.c.e(context);
            } else if (i19 == 2) {
                e17 = c01.z1.r();
            } else if (i19 != 3) {
                e17 = i19 != 14 ? c01.z1.r() : xy2.c.e(context);
            } else {
                e17 = c01.z1.k();
                i27 = 3;
            }
            java.lang.String str3 = e17;
            int i28 = (lo2Var.m75939xb282bd08(1) & 4) > 0 ? 1 : 0;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[getSessionId] ");
            java.lang.String str4 = this.f207627c;
            sb6.append(str4);
            sb6.append(',');
            sb6.append(this.f207628d);
            sb6.append(',');
            sb6.append(this.f207629e);
            sb6.append('#');
            sb6.append(this.f207630f);
            sb6.append(" => ");
            sb6.append(str);
            sb6.append(" enableAction=");
            sb6.append(i18);
            sb6.append(" from server. username is equal?");
            sb6.append(p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, str4));
            sb6.append(" followFlag=");
            sb6.append(m75939xb282bd08);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SessionInfoService", sb6.toString());
            if (str.length() > 0) {
                if (str2.length() > 0) {
                    if (i19 == 1 && com.p314xaae8f345.mm.p2621x8fb0427b.z3.E4(str2)) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4 m4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a;
                        if (m4Var2.e().z0(str2, 1).length() > 0) {
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SessionInfoService", "build session to alias, but local has save sessionId, the talker has rebuild alias , so delete old sessionInfo");
                            m4Var2.e().y0(m4Var2.e().z0(str2, 1), false);
                        }
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.dj0 e18 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1628x7643c6b5.m4.f207681a.e();
                    zy2.bb bbVar = this.f207631g;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                    e18.L0(str, str2, i27, i18, bbVar, i28, 0, str3, m75939xb282bd08, m75933x41a8a7f2);
                }
            }
            yz5.s sVar = this.f207632h;
            r45.vi2 vi2Var6 = (r45.vi2) ((r45.r81) fVar.f152151d).m75936x14adae67(4);
            sVar.v((vi2Var6 == null || (m75945x2fec8307 = vi2Var6.m75945x2fec8307(1)) == null) ? "" : m75945x2fec8307, java.lang.Boolean.valueOf(m75933x41a8a7f2), java.lang.Integer.valueOf(fVar.f152148a), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        } else {
            this.f207632h.v("", java.lang.Boolean.FALSE, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(fVar.f152149b), fVar.f152150c);
        }
        return jz5.f0.f384359a;
    }
}
