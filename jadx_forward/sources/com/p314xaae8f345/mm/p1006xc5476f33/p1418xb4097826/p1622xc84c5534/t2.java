package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534;

/* loaded from: classes2.dex */
public final class t2 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t2 f206896a = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.t2();

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(android.content.Context context, java.lang.String finderUsername, boolean z17, java.lang.String str, java.lang.String str2, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        boolean z18 = true;
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) == false) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(m75945x2fec83072).f384374d).intValue();
            int m75939xb282bd08 = V6.m75939xb282bd08(8);
            jSONObject.put("enter_scene", intValue);
            jSONObject.put("enter_type", m75939xb282bd08);
        }
        jSONObject.put("ref_commentscene", V6.m75939xb282bd08(7));
        if ((finderUsername.length() > 0) != false) {
            jSONObject.put("finderusername", finderUsername);
        }
        if (j17 != 0) {
            jSONObject.put("ref_feedid", pm0.v.u(j17));
        }
        if ((str == null || str.length() == 0) == false) {
            jSONObject.put("biz_type", str);
        }
        if (str2 != null && str2.length() != 0) {
            z18 = false;
        }
        if (!z18) {
            jSONObject.put("biz_name", str2);
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, z17 ? 1 : 0, "finder_binding_brand", r26.i0.t(jSONObject2, ",", ";", false), V6, null, 16, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void b(android.content.Context context, java.lang.String finderUsername, boolean z17, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if ((m75945x2fec8307 == null || m75945x2fec8307.length() == 0) == false) {
            zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
            java.lang.String m75945x2fec83072 = V6.m75945x2fec8307(1);
            if (m75945x2fec83072 == null) {
                m75945x2fec83072 = "";
            }
            int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(m75945x2fec83072).f384374d).intValue();
            int m75939xb282bd08 = V6.m75939xb282bd08(8);
            jSONObject.put("enter_scene", intValue);
            jSONObject.put("enter_type", m75939xb282bd08);
        }
        jSONObject.put("ref_commentscene", V6.m75939xb282bd08(7));
        if (finderUsername.length() > 0) {
            jSONObject.put("finderusername", finderUsername);
        }
        if (j17 != 0) {
            jSONObject.put("ref_feedid", pm0.v.u(j17));
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, z17 ? 1 : 0, "finder_custom_service", r26.i0.t(jSONObject2, ",", ";", false), V6, null, 16, null);
    }

    public final void c(android.content.Context context, java.lang.String finderUsername, boolean z17, java.lang.String linkWord, boolean z18, long j17, boolean z19) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(linkWord, "linkWord");
        pf5.z zVar = pf5.z.f435481a;
        if (!(context instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
            throw new java.lang.IllegalStateException("Check failed.".toString());
        }
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) zVar.a((p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112) context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(m75945x2fec8307).f384374d).intValue();
        int m75939xb282bd08 = V6.m75939xb282bd08(8);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("link_word", linkWord);
        jSONObject.put("finderusername", finderUsername);
        jSONObject.put("is_brand_label", z18 ? 1 : 0);
        jSONObject.put("feedid", pm0.v.u(j17));
        jSONObject.put("ref_feedid", pm0.v.u(j17));
        jSONObject.put("if_has_gift_tag", z19 ? 1 : 0);
        jSONObject.put("ref_commentscene", V6.m75939xb282bd08(7));
        jSONObject.put("enter_scene", intValue);
        jSONObject.put("enter_type", m75939xb282bd08);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.b6.f206502a, V6, "profile_shopwindow_link", z17 ? 1 : 0, jSONObject, false, null, 48, null);
    }
}
