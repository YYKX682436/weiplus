package oc2;

/* loaded from: classes8.dex */
public final class u implements ep0.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f425806a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.g0 f425807b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425808c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f425809d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f425810e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb f425811f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.f03 f425812g;

    public u(p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var, p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var2, java.lang.String str, java.lang.String str2, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb jbVar, r45.f03 f03Var) {
        this.f425806a = g0Var;
        this.f425807b = g0Var2;
        this.f425808c = str;
        this.f425809d = str2;
        this.f425810e = h0Var;
        this.f425811f = jbVar;
        this.f425812g = f03Var;
    }

    @Override // ep0.a
    public final void a(boolean z17, java.lang.Object[] objArr) {
        p3321xbce91901.jvm.p3324x21ffc6bd.g0 g0Var = this.f425806a;
        long j17 = g0Var.f391654d;
        long j18 = 0;
        if (j17 > 0) {
            long j19 = this.f425807b.f391654d;
            j18 = j19 > 0 ? j19 - j17 : android.os.SystemClock.elapsedRealtime() - g0Var.f391654d;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = this.f425810e;
        if (z17) {
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0 aj0Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.aj0.f207973a;
        boolean booleanValue = ((java.lang.Boolean) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.z70.f209965a, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a, "DSL红点图片下载失败上报开关", e42.c0.clicfg_finder_dsl_reddot_render_load_pic_fail_report_switch, java.lang.Boolean.TRUE, false, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.wd0.f209780d, 8, null)).booleanValue();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("notifyImageLoadResult url=");
        java.lang.String url = this.f425809d;
        sb6.append(url);
        sb6.append(" (");
        sb6.append((java.lang.String) h0Var.f391656d);
        sb6.append(") fail timeCost=");
        sb6.append(j18);
        sb6.append(",reportFail=");
        sb6.append(booleanValue);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(this.f425808c, sb6.toString());
        if (booleanValue) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2 x2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x2.f206962a;
            java.lang.String field_tips_uuid = this.f425811f.f65882x5364c75d;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(field_tips_uuid, "field_tips_uuid");
            java.lang.String str = this.f425812g.f455425i;
            if (str == null) {
                str = "";
            }
            int i17 = (int) j18;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(url, "url");
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6573x4b326096 c6573x4b326096 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6573x4b326096();
            c6573x4b326096.f139229d = c6573x4b326096.b("redDotPath", str, true);
            c6573x4b326096.f139230e = c6573x4b326096.b("redDotTipsUuid", field_tips_uuid, true);
            c6573x4b326096.f139231f = c6573x4b326096.b("loadFailUrl", url, true);
            c6573x4b326096.f139232g = i17;
            c6573x4b326096.k();
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Zk(c6573x4b326096);
        }
    }
}
