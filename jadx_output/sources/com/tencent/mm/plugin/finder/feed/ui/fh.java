package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class fh implements ly1.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI f110017a;

    public fh(com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI finderNewStyleTimelineUI) {
        this.f110017a = finderNewStyleTimelineUI;
    }

    @Override // ly1.a
    public final java.util.Map b(java.lang.String str) {
        com.tencent.mm.plugin.finder.feed.ui.FinderNewStyleTimelineUI finderNewStyleTimelineUI = this.f110017a;
        android.content.Intent intent = finderNewStyleTimelineUI.getIntent();
        java.lang.String valueOf = java.lang.String.valueOf(intent != null ? intent.getStringExtra("key_extra_info") : null);
        if (u46.l.e(valueOf)) {
            valueOf = r30.m.f368946a;
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
        android.content.Intent intent2 = finderNewStyleTimelineUI.getIntent();
        lVarArr[4] = new jz5.l("enter_source_info", java.lang.String.valueOf(intent2 != null ? intent2.getStringExtra("key_enter_source_info") : null));
        androidx.appcompat.app.AppCompatActivity context = finderNewStyleTimelineUI.getContext();
        kotlin.jvm.internal.o.f(context, "getContext(...)");
        lVarArr[5] = new jz5.l("comment_scene", java.lang.Integer.valueOf(((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135380n));
        lVarArr[6] = new jz5.l("finder_username", g92.b.f269769e.T0());
        lVarArr[7] = new jz5.l("pagein_feedid", pm0.v.u(finderNewStyleTimelineUI.getIntent().getLongExtra("feed_object_id", 0L)));
        java.lang.String stringExtra = finderNewStyleTimelineUI.getIntent().getStringExtra("key_firstFeedSessionBuffer");
        lVarArr[8] = new jz5.l("session_buffer", stringExtra != null ? stringExtra : "");
        return kz5.c1.k(lVarArr);
    }
}
