package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44;

/* loaded from: classes2.dex */
public final class d0 {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f206037a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.g f206038b;

    /* renamed from: c, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.u3 f206039c;

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f206040d;

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f206041e;

    /* renamed from: f, reason: collision with root package name */
    public final jz5.g f206042f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f206043g;

    /* renamed from: h, reason: collision with root package name */
    public final jz5.g f206044h;

    public d0(android.view.View header, p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, r45.qt2 contextObj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contextObj, "contextObj");
        this.f206037a = activity;
        this.f206038b = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.c0(header));
        this.f206040d = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.v(this));
        this.f206041e = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.w(this));
        this.f206042f = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.y(this));
        jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.x(this));
        this.f206044h = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.b0(this));
    }

    public static final void a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d0 d0Var, int i17, java.lang.String finderUsername, java.lang.String contactId) {
        d0Var.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209522vd).mo141623x754a37bb()).r()).booleanValue();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = d0Var.f206037a;
        long longExtra = activityC0065xcd7aa112.getIntent().getLongExtra("finder_from_feed_id", 0L);
        int i18 = i17 == 1 ? 1 : 0;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(finderUsername, "finderUsername");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contactId, "contactId");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(activityC0065xcd7aa112).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class)).V6();
        zy2.b6 b6Var = (zy2.b6) i95.n0.c(zy2.b6.class);
        java.lang.String m75945x2fec8307 = V6.m75945x2fec8307(1);
        if (m75945x2fec8307 == null) {
            m75945x2fec8307 = "";
        }
        int intValue = ((java.lang.Number) ((c61.l7) b6Var).Tk(m75945x2fec8307).f384374d).intValue();
        int m75939xb282bd08 = V6.m75939xb282bd08(8);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("finderusername", finderUsername);
        jSONObject.put("kfcontactid", contactId);
        jSONObject.put("add_wecom_fri_location", booleanValue ? 1 : 0);
        jSONObject.put("enter_scene", intValue);
        jSONObject.put("enter_type", m75939xb282bd08);
        jSONObject.put("ref_commentscene", V6.m75939xb282bd08(7));
        if (longExtra != 0) {
            jSONObject.put("ref_feedid", pm0.v.u(longExtra));
        }
        i95.m c17 = i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        java.lang.String jSONObject2 = jSONObject.toString();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(jSONObject2, "toString(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3.ij((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.o3) c17, i18, "finder_add_wecom_fri", r26.i0.t(jSONObject2, ",", ";", false), V6, null, 16, null);
    }

    public final android.widget.FrameLayout b() {
        return (android.widget.FrameLayout) ((jz5.n) this.f206040d).mo141623x754a37bb();
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0084  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void c(java.lang.String r9, ya2.b2 r10) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1611xed8e89a9.p1614xd1075a44.d0.c(java.lang.String, ya2.b2):void");
    }
}
