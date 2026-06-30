package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes3.dex */
public final class ck implements in5.x {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14085x1922346d f191292d;

    public ck(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14085x1922346d activityC14085x1922346d) {
        this.f191292d = activityC14085x1922346d;
    }

    @Override // in5.x
    public void s2(p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 adapter, android.view.View view, int i17, p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var) {
        r45.e21 e21Var;
        java.lang.String str;
        byte[] mo14344x5f01b1f6;
        java.lang.String m76175x6d346f39;
        in5.s0 holder = (in5.s0) k3Var;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(adapter, "adapter");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14085x1922346d activityC14085x1922346d = this.f191292d;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1625xc9fa65a8.p1627x3c22fcc2.C14957x1a4885f0 c14957x1a4885f0 = activityC14085x1922346d.E;
        if (c14957x1a4885f0 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedloader");
            throw null;
        }
        java.lang.Object obj = c14957x1a4885f0.m56387xe6796cde().get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        so2.j5 j5Var = (so2.j5) obj;
        if ((j5Var instanceof so2.x) && (e21Var = ((so2.x) j5Var).f492227d) != null) {
            android.content.Intent intent = new android.content.Intent();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(activityC14085x1922346d.C, "onSelectActivity: eventTopicId:" + e21Var + ".eventTopicId  eventName:" + e21Var + ".eventName description:" + e21Var + ".description cover:" + e21Var + ".coverImgUrl");
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            java.lang.String str2 = "";
            if (c19782x23db1cfa == null || (str = c19782x23db1cfa.m76197x6c03c64c()) == null) {
                str = "";
            }
            intent.putExtra("key_user_name", str);
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa2 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            intent.putExtra("key_nick_name", c19782x23db1cfa2 != null ? c19782x23db1cfa2.m76184x8010e5e4() : null);
            intent.putExtra("key_cover_url", e21Var.m75945x2fec8307(5));
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa c19782x23db1cfa3 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19782x23db1cfa) e21Var.m75936x14adae67(1);
            if (c19782x23db1cfa3 != null && (m76175x6d346f39 = c19782x23db1cfa3.m76175x6d346f39()) != null) {
                str2 = m76175x6d346f39;
            }
            intent.putExtra("key_avatar_url", str2);
            intent.putExtra("key_topic_id", e21Var.m75942xfb822ef2(0));
            intent.putExtra("key_activity_name", e21Var.m75945x2fec8307(2));
            intent.putExtra("key_activity_desc", e21Var.m75945x2fec8307(3));
            intent.putExtra("key_activity_end_time", e21Var.m75942xfb822ef2(13));
            intent.putExtra("key_activity_type", 102);
            intent.putExtra("key_activity_already_participate", true);
            intent.putExtra("key_activity_display_mask", e21Var.m75942xfb822ef2(17));
            intent.putExtra("vst_id", activityC14085x1922346d.F);
            r45.h21 h21Var = (r45.h21) e21Var.m75936x14adae67(18);
            if (h21Var != null && (mo14344x5f01b1f6 = h21Var.mo14344x5f01b1f6()) != null) {
                intent.putExtra("key_wording_info", mo14344x5f01b1f6);
            }
            intent.setClass(activityC14085x1922346d, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.ui.ActivityC15007xc74afeba.class);
            activityC14085x1922346d.startActivityForResult(intent, 0);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3 e3Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.e3.f206542a;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 mo55332x76847179 = activityC14085x1922346d.mo55332x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo55332x76847179, "getContext(...)");
        e3Var.a("4", xy2.c.e(mo55332x76847179), new org.json.JSONObject().put("vst_id", activityC14085x1922346d.F));
    }
}
