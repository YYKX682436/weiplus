package com.tencent.mm.plugin.finder.activity.postplay.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/postplay/ui/FinderPostPlayUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/l91;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public final class FinderPostPlayUI extends com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI<r45.l91> {

    /* renamed from: u, reason: collision with root package name */
    public final java.util.ArrayList f101800u = kz5.c0.d(0L, 0L);

    /* renamed from: v, reason: collision with root package name */
    public int f101801v;

    /* renamed from: w, reason: collision with root package name */
    public long f101802w;

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.b
    public int N2() {
        return com.tencent.mm.R.layout.eda;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return getIntent().getIntExtra("double_comment_scene", 0);
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{na2.n.class, na2.c.class, na2.k.class, na2.o.class, na2.f.class});
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.a
    /* renamed from: o6 */
    public x92.f getF101740t() {
        return null;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        long longExtra = getIntent().getLongExtra("topic_id", 0L);
        long longExtra2 = getIntent().getLongExtra("from_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("by_pass");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("source_session_buffer");
        java.lang.String str = stringExtra2 == null ? "" : stringExtra2;
        java.lang.String stringExtra3 = getIntent().getStringExtra(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_TITLE);
        java.lang.String str2 = stringExtra3 == null ? "" : stringExtra3;
        java.lang.String stringExtra4 = getIntent().getStringExtra("sub_title");
        java.lang.String str3 = stringExtra4 == null ? "" : stringExtra4;
        com.tencent.mars.xlog.Log.i("FinderPostPlayNewUI", "onCreate topicId:" + longExtra + ", fromObjectId:" + longExtra2 + ", byPass:" + stringExtra);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, iy1.c.FinderPostPlayPage);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Rj(this, iy1.a.Finder);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, "cluster_feature_page");
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Tj(this, 12, 1, false);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new ma2.a(this, longExtra, str2, str3, longExtra2, str));
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.f101802w = java.lang.System.currentTimeMillis();
        this.f101800u.replaceAll(ma2.b.f325209a);
        this.f101801v = 0;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onStop() {
        r45.qt2 V6 = ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).V6();
        long longExtra = getIntent().getLongExtra("from_object_id", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("source_session_buffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        java.lang.String stringExtra2 = getIntent().getStringExtra("by_pass");
        java.util.Map k17 = kz5.c1.k(new jz5.l("finder_tab_context_id", V6.getString(2)), new jz5.l("finder_context_id", V6.getString(1)), new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.getInteger(5))), new jz5.l("source_comment_scene", java.lang.Integer.valueOf(V6.getInteger(7))), new jz5.l("source_feedid", pm0.v.u(longExtra)), new jz5.l("source_session_buffer", stringExtra), new jz5.l("start_expose_time_ms", java.lang.Long.valueOf(this.f101802w)), new jz5.l("end_expose_time_ms", java.lang.Long.valueOf(java.lang.System.currentTimeMillis())), new jz5.l("jump_info_by_pass_info", stringExtra2 != null ? stringExtra2 : ""), new jz5.l("jump_dstream_unexp_reason", java.lang.Integer.valueOf(this.f101801v)));
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.MainUI;
        ((cy1.a) rVar).Aj(50401, "page_out", k17, 1, false);
        com.tencent.mars.xlog.Log.i("FinderPostPlayNewUI", "reportHalfScreenExit: exitReason=" + this.f101801v);
        super.onStop();
        com.tencent.mars.xlog.Log.i("FinderPostPlayNewUI", "onStop");
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, al5.f3
    public void onSwipeBack() {
        this.f101801v = 1;
        super.onSwipeBack();
    }
}
