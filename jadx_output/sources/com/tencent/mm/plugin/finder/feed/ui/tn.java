package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class tn implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI f110584a;

    public tn(com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI) {
        this.f110584a = finderTopicTimelineUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        jz5.l[] lVarArr = new jz5.l[7];
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
        com.tencent.mm.plugin.finder.feed.ui.FinderTopicTimelineUI finderTopicTimelineUI = this.f110584a;
        lVarArr[3] = new jz5.l("ref_commentscene", java.lang.Integer.valueOf(finderTopicTimelineUI.getIntent().getIntExtra("key_from_comment_scene", 0)));
        androidx.appcompat.app.AppCompatActivity context = finderTopicTimelineUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        lVarArr[4] = new jz5.l("finder_username", xy2.c.e(context));
        lVarArr[5] = new jz5.l("slide_type", 0);
        lVarArr[6] = new jz5.l("collection_id", pm0.v.u(finderTopicTimelineUI.I));
        return kz5.c1.k(lVarArr);
    }
}
