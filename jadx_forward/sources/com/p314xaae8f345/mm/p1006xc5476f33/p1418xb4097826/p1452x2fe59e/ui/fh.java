package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class fh implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14060x9edd984c f191550a;

    public fh(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14060x9edd984c activityC14060x9edd984c) {
        this.f191550a = activityC14060x9edd984c;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14060x9edd984c activityC14060x9edd984c = this.f191550a;
        android.content.Intent intent = activityC14060x9edd984c.getIntent();
        java.lang.String valueOf = java.lang.String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
        if (u46.l.e(valueOf)) {
            valueOf = r30.m.f450479a;
        }
        jz5.l[] lVarArr = new jz5.l[9];
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
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
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17);
        lVarArr[3] = new jz5.l("extra_info", valueOf);
        android.content.Intent intent2 = activityC14060x9edd984c.getIntent();
        lVarArr[4] = new jz5.l("enter_source_info", java.lang.String.valueOf(intent2 != null ? intent2.getStringExtra("key_enter_source_info") : null));
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14060x9edd984c.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        lVarArr[5] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216913n));
        lVarArr[6] = new jz5.l("finder_username", g92.b.f351302e.T0());
        lVarArr[7] = new jz5.l("pagein_feedid", pm0.v.u(activityC14060x9edd984c.getIntent().getLongExtra("feed_object_id", 0L)));
        java.lang.String stringExtra = activityC14060x9edd984c.getIntent().getStringExtra("key_firstFeedSessionBuffer");
        lVarArr[8] = new jz5.l("session_buffer", stringExtra != null ? stringExtra : "");
        return kz5.c1.k(lVarArr);
    }
}
