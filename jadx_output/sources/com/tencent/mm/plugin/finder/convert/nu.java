package com.tencent.mm.plugin.finder.convert;

/* loaded from: classes2.dex */
public final class nu implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f104125a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ms2.e f104126b;

    public nu(in5.s0 s0Var, ms2.e eVar) {
        this.f104125a = s0Var;
        this.f104126b = eVar;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        java.lang.String str2;
        in5.s0 s0Var = this.f104125a;
        android.content.Context context = s0Var.f293121e;
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        pf5.z zVar = pf5.z.f353948a;
        if (!(context instanceof androidx.appcompat.app.AppCompatActivity)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        com.tencent.mm.plugin.finder.profile.uic.p2 p2Var = (com.tencent.mm.plugin.finder.profile.uic.p2) zVar.a((androidx.appcompat.app.AppCompatActivity) context).e(com.tencent.mm.plugin.finder.profile.uic.p2.class);
        if (p2Var == null || (str2 = p2Var.getUsername()) == null) {
            str2 = "";
        }
        jz5.l[] lVarArr = new jz5.l[7];
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
        lVarArr[2] = new jz5.l("behaviour_session_id", Ri != null ? Ri : "");
        android.content.Context context2 = s0Var.itemView.getContext();
        com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI finderProfileUI = context2 instanceof com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI ? (com.tencent.mm.plugin.finder.feed.ui.FinderProfileUI) context2 : null;
        lVarArr[3] = new jz5.l("comment_scene", java.lang.Integer.valueOf(finderProfileUI != null ? finderProfileUI.getD() : 32));
        lVarArr[4] = new jz5.l("finder_username", str2);
        lVarArr[5] = new jz5.l("categoryid", this.f104126b.f330973d.f372417d);
        lVarArr[6] = new jz5.l("profile_tab_name", java.lang.String.valueOf(s0Var.f293121e.getResources().getString(com.tencent.mm.R.string.f0h)));
        return kz5.c1.k(lVarArr);
    }
}
