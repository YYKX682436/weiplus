package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class bn implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b f191262a;

    public bn(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b) {
        this.f191262a = activityC14103x2367d69b;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14103x2367d69b activityC14103x2367d69b = this.f191262a;
        android.content.Intent intent = activityC14103x2367d69b.getIntent();
        java.lang.String valueOf = java.lang.String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
        if (u46.l.e(valueOf)) {
            valueOf = r30.m.f450479a;
        }
        jz5.l[] lVarArr = new jz5.l[5];
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
        lVarArr[2] = new jz5.l("finder_tab_context_id", c17 != null ? c17 : "");
        lVarArr[3] = new jz5.l("extra_info", valueOf);
        android.content.Intent intent2 = activityC14103x2367d69b.getIntent();
        lVarArr[4] = new jz5.l("enter_source_info", java.lang.String.valueOf(intent2 != null ? intent2.getStringExtra("key_enter_source_info") : null));
        return kz5.c1.k(lVarArr);
    }
}
