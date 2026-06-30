package com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc;

/* loaded from: classes4.dex */
public class i0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 f263072d;

    public i0(com.p314xaae8f345.mm.p1006xc5476f33.p2393xf1c361fc.q0 q0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720) {
        this.f263072d = c19807x593d1720;
    }

    @Override // java.lang.Runnable
    public void run() {
        java.lang.String str;
        java.lang.String str2;
        fe0.o4 o4Var = (fe0.o4) i95.n0.c(fe0.o4.class);
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        ((ee0.v4) o4Var).getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("exportVideoPlay", "com.tencent.mm.feature.sns.SnsUtilService");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        fe0.o4 o4Var2 = (fe0.o4) i95.n0.c(fe0.o4.class);
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19807x593d1720 c19807x593d1720 = this.f263072d;
        java.lang.String Ai = ((ee0.v4) o4Var2).Ai(c19807x593d1720.Id);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 k17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Fj().k1(Ai);
        if (k17 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "onsight click but info is null localid %s", Ai);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
        } else {
            java.util.LinkedList linkedList = c19807x593d1720.f39014x86965dde.f451373h;
            if (linkedList == null || linkedList.size() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.TimelineClickListener", "the obj.ContentObj.MediaObjList is null");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            } else {
                r45.jj4 jj4Var = (r45.jj4) c19807x593d1720.f39014x86965dde.f451373h.get(0);
                m21.w.c(717);
                ca4.z0.T(k17);
                k17.m70377x3172ed();
                k17.m70375x338a8cc7();
                java.lang.String str3 = jj4Var.f459388d;
                m21.w c17 = m21.w.c(745);
                ca4.z0.T(k17);
                k17.m70377x3172ed();
                java.lang.String d17 = com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.f6.d(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2166x633fb29.l4.Di(), jj4Var.f459388d);
                java.lang.String R = ca4.z0.R(jj4Var);
                if (com.p314xaae8f345.mm.vfs.w6.j(d17 + R)) {
                    str = d17 + R;
                    str2 = d17 + ca4.z0.U(jj4Var);
                } else {
                    str = "";
                    str2 = "";
                }
                if (com.p314xaae8f345.mm.vfs.w6.j(d17 + ca4.z0.Y(jj4Var))) {
                    str = d17 + ca4.z0.Y(jj4Var);
                    str2 = d17 + ca4.z0.a0(jj4Var);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p2029xc84c5534.p2031x7643c6b5.g0.INSTANCE.d(11444, 3);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TimelineClickListener", "it not ad video, use online video activity to play.");
                android.content.Intent intent = new android.content.Intent();
                intent.addFlags(268435456);
                intent.putExtra("intent_videopath", str);
                intent.putExtra("intent_thumbpath", str2);
                intent.putExtra("intent_localid", Ai);
                intent.putExtra("intent_isad", false);
                intent.putExtra("intent_from_scene", 1);
                intent.putExtra("sns_video_scene", 5);
                gc4.n nVar = gc4.n.f351998a;
                r45.m1 m1Var = c19807x593d1720.f39019x6e5c4c04.f465089m;
                intent.putExtra("intent_third_sdk_msg", nVar.b(m1Var.f461587d, m1Var.f461589f));
                intent.putExtra("intent_publish_id", ca4.z0.s0(k17.f68891x29d1292e));
                intent.putExtra("intent_bottom_height", com.p314xaae8f345.mm.ui.bl.c(context));
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2221x6b0147b.C18390xafce807 b17 = xd4.o0.d().b(c19807x593d1720.Id);
                if (b17 != null && b17.w()) {
                    intent.putExtra("intent_fromplayingvideo", true);
                    intent.putExtra("intent_fromplayingvideo_tlobjid", c19807x593d1720.Id);
                    intent.putExtra("intent_session_id", b17.m70630x23a7af9b());
                    intent.putExtra("intent_session_timestamp", b17.m70632x34bdb696());
                }
                c17.g(intent);
                if (!pc4.d.f434943a.d(c19807x593d1720) || k17.m70377x3172ed()) {
                    intent.setClass(context, com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.AccessibilityManagerTouchExplorationStateChangeListenerC18083x5546c9f.class);
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    arrayList.add(intent);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "exportVideoPlay", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                    context.startActivity((android.content.Intent) arrayList.get(0));
                    yj0.a.f(context, "com/tencent/mm/plugin/sns/ui/listener/TimelineClickListener", "exportVideoPlay", "(Landroid/content/Context;Lcom/tencent/mm/protocal/protobuf/TimeLineObject;I)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2184x67fe93cb.ActivityC18194xa82f7027.f249883d.a(context, intent);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2210x503cc4b4.i.Q(context, k17.m70371x485d7());
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exportVideoPlay", "com.tencent.mm.plugin.sns.ui.listener.TimelineClickListener");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("exportVideoPlay", "com.tencent.mm.feature.sns.SnsUtilService");
    }
}
