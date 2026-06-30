package com.tencent.mm.plugin.finder.activity.topic.ui;

@kotlin.Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/ui/FinderNewTopicUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/r03;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes2.dex */
public class FinderNewTopicUI extends com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI<r45.r03> {

    /* renamed from: u, reason: collision with root package name */
    public final ta2.a f101812u = new ta2.a();

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.b
    public int N2() {
        return com.tencent.mm.R.layout.b4k;
    }

    @Override // com.tencent.mm.plugin.finder.ui.MMFinderUI
    /* renamed from: W6 */
    public int getD() {
        return 22;
    }

    @Override // com.tencent.mm.ui.component.glocom.GloUIComponentActivity, com.tencent.mm.ui.component.UIComponentActivity
    public java.util.Set importUIComponents() {
        return kz5.z.D0(new java.lang.Class[]{va2.n.class, va2.a.class, va2.f.class, va2.b.class, va2.o.class, va2.h.class});
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, t92.a
    /* renamed from: o6 */
    public x92.f getF101755u() {
        return this.f101812u;
    }

    @Override // com.tencent.mm.plugin.finder.activity.base.ui.BaseProfileUI, com.tencent.mm.plugin.finder.ui.MMFinderUI, com.tencent.mm.ui.vas.VASActivity, com.tencent.mm.ui.MMActivity, com.tencent.mm.ui.MMFragmentActivity, com.tencent.mm.ui.component.UIComponentActivity, androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, com.tencent.mm.hellhoundlib.activities.HellActivity, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        long longExtra = getIntent().getLongExtra("key_ref_object_id", 0L);
        long longExtra2 = getIntent().getLongExtra("KEY_TOPIC_ID", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.tencent.mars.xlog.Log.i("FinderNewTopicUI", "type:" + intExtra + ", topicName:" + stringExtra + " topicId:" + longExtra2 + " refObjectId:" + longExtra);
        int intExtra2 = getIntent().getIntExtra("key_report_scene", 0);
        if (intExtra2 != 0) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_from_user");
            java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).Wj(intExtra2, str, stringExtra, intExtra);
            if (getIntent().getIntExtra("key_topic_type", 1) == 4) {
                i95.m c17 = i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class);
                kotlin.jvm.internal.o.f(c17, "getService(...)");
                com.tencent.mm.plugin.finder.report.o3 o3Var = (com.tencent.mm.plugin.finder.report.o3) c17;
                long longExtra3 = getIntent().getLongExtra("key_ref_object_id", 0L);
                androidx.appcompat.app.AppCompatActivity context = getContext();
                kotlin.jvm.internal.o.f(context, "getContext(...)");
                o3Var.Qj(longExtra3, intExtra2, 4L, str, 0, (r33 & 32) != 0 ? 0 : 2, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : ((com.tencent.mm.plugin.finder.viewmodel.component.ny) pf5.z.f353948a.a(context).a(com.tencent.mm.plugin.finder.viewmodel.component.ny.class)).f135382p, (r33 & 256) != 0 ? 0 : 0, (r33 & 512) != 0 ? 0L : 0L, (r33 & 1024) != 0 ? null : null);
            }
        }
        com.tencent.mm.plugin.finder.viewmodel.component.ut utVar = (com.tencent.mm.plugin.finder.viewmodel.component.ut) pf5.z.f353948a.a(this).a(com.tencent.mm.plugin.finder.viewmodel.component.ut.class);
        utVar.P6("feedid", pm0.v.u(longExtra));
        utVar.P6("topicid", pm0.v.u(longExtra2));
        utVar.P6("topicname", stringExtra);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        iy1.c cVar = iy1.c.FinderTopicFeedUI;
        ((cy1.a) rVar).ak(this, cVar);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).dk(this, getClass().getSimpleName());
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ik(this, 40, 24184);
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ai(this, new ua2.a(this));
        cy1.a aVar = (cy1.a) ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).ak(this, cVar);
        aVar.Rj(this, iy1.a.Finder);
        aVar.Tj(this, 12, 3, false);
        aVar.gk(this, kz5.c1.k(new jz5.l("topic_enter_source", java.lang.Integer.valueOf(getIntent().getIntExtra("KEY_TOPIC_ENTER_SOURCE", 3))), new jz5.l("page_topic", getIntent().getStringExtra("key_topic_title")), new jz5.l("page_topicid", pm0.v.u(getIntent().getLongExtra("KEY_TOPIC_ID", 0L)))));
    }
}
