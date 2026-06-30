package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class ju implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f103777a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms2.c f103778b;

    public ju(in5.s0 s0Var, ms2.c cVar) {
        this.f103777a = s0Var;
        this.f103778b = cVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        java.lang.String str3;
        in5.s0 s0Var = this.f103777a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        java.lang.String str4 = "";
        if (p2Var == null || (str2 = p2Var.getUsername()) == null) {
            str2 = "";
        }
        jz5.l[] lVarArr = new jz5.l[9];
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String c17 = b52.b.c();
        if (c17 == null) {
            c17 = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", c17);
        ((m30.m) ((n30.r) i95.n0.c(n30.r.class))).getClass();
        java.lang.String b17 = b52.b.b();
        if (b17 == null) {
            b17 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", b17);
        java.lang.String Ri = ((w52.g) ((e42.f0) i95.n0.c(e42.f0.class))).Ri();
        if (Ri == null) {
            Ri = "";
        }
        lVarArr[2] = new jz5.l("behaviour_session_id", Ri);
        android.content.Context context2 = s0Var.itemView.getContext();
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = context2 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) context2 : null;
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(finderProfileUI != null ? finderProfileUI.getD() : 32));
        lVarArr[4] = new jz5.l("finder_username", str2);
        lVarArr[5] = new jz5.l("profile_tab_name", s0Var.f293121e.getResources().getString(com.tencent.mm.R.string.f0d));
        ms2.c cVar = this.f103778b;
        lVarArr[6] = new jz5.l("listenid", cVar.f330969d.f377017d);
        lVarArr[7] = new jz5.l("profile_tab_type", 3);
        r45.gg4 gg4Var = cVar.f330969d.B;
        if (gg4Var != null && (str3 = gg4Var.f375221d) != null) {
            str4 = str3;
        }
        lVarArr[8] = new jz5.l("feedid", str4);
        return kz5.c1.k(lVarArr);
    }
}
