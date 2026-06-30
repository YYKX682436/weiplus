package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3 f206965a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.x3();

    /* renamed from: b, reason: collision with root package name */
    public static long f206966b;

    /* renamed from: c, reason: collision with root package name */
    public static org.json.JSONObject f206967c;

    public final void a(db5.g4 menu) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (menu.findItem(103) != null && (jSONObject4 = f206967c) != null) {
            jSONObject4.put("button_forward_friendcircle", 1);
        }
        if (menu.findItem(102) != null && (jSONObject3 = f206967c) != null) {
            jSONObject3.put("button_forward_friend", 1);
        }
        if (menu.findItem(113) != null && (jSONObject2 = f206967c) != null) {
            jSONObject2.put("textstatus_in_menu", 1);
        }
        if (menu.findItem(114) == null || (jSONObject = f206967c) == null) {
            return;
        }
        jSONObject.put("button_set_bell", 1);
    }

    public final void b(db5.g4 menu) {
        org.json.JSONObject jSONObject;
        org.json.JSONObject jSONObject2;
        org.json.JSONObject jSONObject3;
        org.json.JSONObject jSONObject4;
        org.json.JSONObject jSONObject5;
        org.json.JSONObject jSONObject6;
        org.json.JSONObject jSONObject7;
        org.json.JSONObject jSONObject8;
        org.json.JSONObject jSONObject9;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(menu, "menu");
        if (menu.findItem(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54460xdba898a8) != null && (jSONObject9 = f206967c) != null) {
            jSONObject9.put("button_minimize", 1);
        }
        if (menu.findItem(116) != null && (jSONObject8 = f206967c) != null) {
            jSONObject8.put("button_speedplay", 1);
        }
        if (menu.findItem(109) != null && (jSONObject7 = f206967c) != null) {
            jSONObject7.put("button_original_sound", 1);
        }
        if (menu.findItem(99) != null && (jSONObject6 = f206967c) != null) {
            jSONObject6.put("button_uninterested", 1);
        }
        if (menu.findItem(101) != null && (jSONObject5 = f206967c) != null) {
            jSONObject5.put("button_complaint", 1);
        }
        if (menu.findItem(202) != null && (jSONObject4 = f206967c) != null) {
            jSONObject4.put("launch_promotion", 1);
        }
        if (menu.findItem(207) != null && (jSONObject3 = f206967c) != null) {
            jSONObject3.put("copy_id", 1);
        }
        if (menu.findItem(com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.C26524xd6f088f0.f54461xcc044630) != null && (jSONObject2 = f206967c) != null) {
            jSONObject2.put("close_auto_slide", 1);
        }
        if (menu.findItem(305) != null && (jSONObject = f206967c) != null) {
            jSONObject.put("open_auto_slide", 1);
        }
        org.json.JSONObject jSONObject10 = f206967c;
        if (jSONObject10 != null) {
            jSONObject10.put("button_cancel", 1);
        }
    }

    public final void c(android.content.Context context, java.lang.String eid, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eid, "eid");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("from_action", i17);
        jSONObject.put("feedid", pm0.v.u(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, eid, 1, jSONObject, false, null, 48, null);
    }

    public final void d(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = f206967c;
        if (jSONObject != null) {
            jSONObject.put("feedid", pm0.v.u(j17));
            jSONObject.put("from_action", i17);
        } else {
            jSONObject = new org.json.JSONObject();
            jSONObject.put("feedid", pm0.v.u(j17));
            jSONObject.put("from_action", i17);
        }
        b6Var.c(V6, "channel_feedcard_moreActionPanel", false, jSONObject);
        f206967c = null;
    }

    public final void e(com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf context, java.lang.String userName, long j17, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userName, "userName");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6 b6Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class);
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put(dm.i4.f66875xa013b0d5, userName);
        jSONObject.put("menu_exp_time", f206966b);
        jSONObject.put("from_action", i17);
        jSONObject.put("feedid", pm0.v.u(j17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(b6Var, V6, "icon_recent_forward", 1, jSONObject, false, null, 48, null);
    }
}
