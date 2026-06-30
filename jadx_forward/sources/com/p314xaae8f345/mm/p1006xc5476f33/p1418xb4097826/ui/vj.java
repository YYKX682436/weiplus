package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui;

/* loaded from: classes2.dex */
public final class vj implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 f211495a;

    public vj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6) {
        this.f211495a = activityC15076x7a6c76b6;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String m75945x2fec8307;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15076x7a6c76b6 activityC15076x7a6c76b6 = this.f211495a;
        android.content.Intent intent = activityC15076x7a6c76b6.getIntent();
        java.lang.String valueOf = java.lang.String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
        if (u46.l.e(valueOf)) {
            valueOf = r30.m.f450479a;
        }
        long longExtra = activityC15076x7a6c76b6.getIntent().getLongExtra("feed_object_id", 0L);
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.qm qmVar = activityC15076x7a6c76b6.D;
        if (qmVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        long j17 = qmVar.C;
        if (qmVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("presenter");
            throw null;
        }
        java.lang.String str2 = qmVar.D;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC15076x7a6c76b6.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = mo55332x76847179 instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e6 hk6 = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.hk(o3Var, j17, str2, nyVar != null ? nyVar.f216913n : 0, null, 8, null);
        r45.fl2 fl2Var = hk6 != null ? hk6.f206545a : null;
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        java.lang.String str3 = "";
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[0] = new jz5.l("behaviour_session_id", Ri);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c18 = b52.b.c();
        if (c18 == null) {
            c18 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", c18);
        lVarArr[3] = new jz5.l("extra_info", valueOf);
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x768471792 = activityC15076x7a6c76b6.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x768471792, "getContext(...)");
        lVarArr[4] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x768471792).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n));
        android.content.Intent intent2 = activityC15076x7a6c76b6.getIntent();
        lVarArr[5] = new jz5.l("enter_source_info", java.lang.String.valueOf(intent2 != null ? intent2.getStringExtra("key_enter_source_info") : null));
        lVarArr[6] = new jz5.l("pagein_feedid", pm0.v.u(longExtra));
        java.lang.String stringExtra = activityC15076x7a6c76b6.getIntent().getStringExtra("key_firstFeedSessionBuffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        lVarArr[7] = new jz5.l("session_buffer", stringExtra);
        if (fl2Var != null && (m75945x2fec8307 = fl2Var.m75945x2fec8307(5)) != null) {
            str3 = r26.i0.t(m75945x2fec8307, ",", ";", false);
        }
        lVarArr[8] = new jz5.l("client_udf_kv", str3);
        return kz5.c1.k(lVarArr);
    }
}
