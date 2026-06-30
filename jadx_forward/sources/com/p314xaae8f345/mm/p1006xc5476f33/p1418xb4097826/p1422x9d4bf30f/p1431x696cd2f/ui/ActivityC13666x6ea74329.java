package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1431x696cd2f.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/tencent/mm/plugin/finder/activity/topic/ui/FinderNewTopicUI;", "Lcom/tencent/mm/plugin/finder/activity/base/ui/BaseProfileUI;", "Lr45/r03;", "<init>", "()V", "plugin-finder_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.activity.topic.ui.FinderNewTopicUI */
/* loaded from: classes2.dex */
public class ActivityC13666x6ea74329 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c<r45.r03> {

    /* renamed from: u, reason: collision with root package name */
    public final ta2.a f183345u = new ta2.a();

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c, t92.b
    public int N2() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.b4k;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa
    /* renamed from: W6 */
    public int getD() {
        return 22;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.p2688xb5e90917.ActivityC22284xa3359eae, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8
    /* renamed from: importUIComponents */
    public java.util.Set mo43419xa59964ef() {
        return kz5.z.D0(new java.lang.Class[]{va2.n.class, va2.a.class, va2.f.class, va2.b.class, va2.o.class, va2.h.class});
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c, t92.a
    /* renamed from: o6 */
    public x92.f getF183288u() {
        return this.f183345u;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1422x9d4bf30f.p1423x2e06d1.ui.ActivityC13642xe752320c, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.AbstractActivityC15087xee12defa, com.p314xaae8f345.mm.ui.vas.AbstractActivityC22579xbed01a37, com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf, com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f, com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractActivityC22276x946b56f8, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112, p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f, p012xc85e97e9.p013x9d4bf30f.ActivityC0053x3d3f670c, p012xc85e97e9.p075x2eaf9f.app.ActivityC1082x3d3f670c, com.p314xaae8f345.mm.p789x6b725fbe.p790x7a1b3bed.ActivityC10736x2531ed8c, android.app.Activity
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        int intExtra = getIntent().getIntExtra("key_topic_type", 1);
        long longExtra = getIntent().getLongExtra("key_ref_object_id", 0L);
        long longExtra2 = getIntent().getLongExtra("KEY_TOPIC_ID", 0L);
        java.lang.String stringExtra = getIntent().getStringExtra("key_topic_title");
        if (stringExtra == null) {
            stringExtra = "";
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderNewTopicUI", "type:" + intExtra + ", topicName:" + stringExtra + " topicId:" + longExtra2 + " refObjectId:" + longExtra);
        int intExtra2 = getIntent().getIntExtra("key_report_scene", 0);
        if (intExtra2 != 0) {
            java.lang.String stringExtra2 = getIntent().getStringExtra("key_from_user");
            java.lang.String str = stringExtra2 != null ? stringExtra2 : "";
            ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class)).Wj(intExtra2, str, stringExtra, intExtra);
            if (getIntent().getIntExtra("key_topic_type", 1) == 4) {
                i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3 o3Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17;
                long longExtra3 = getIntent().getLongExtra("key_ref_object_id", 0L);
                p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = mo55332x76847179();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
                o3Var.Qj(longExtra3, intExtra2, 4L, str, 0, (r33 & 32) != 0 ? 0 : 2, (r33 & 64) != 0 ? null : null, (r33 & 128) != 0 ? null : ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(mo55332x76847179).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).f216915p, (r33 & 256) != 0 ? 0 : 0, (r33 & 512) != 0 ? 0L : 0L, (r33 & 1024) != 0 ? null : null);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut utVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut) pf5.z.f435481a.a(this).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ut.class);
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
