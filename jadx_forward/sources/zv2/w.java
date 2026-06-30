package zv2;

/* loaded from: classes10.dex */
public final class w extends zv2.b {

    /* renamed from: h, reason: collision with root package name */
    public final int f557958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 jumpView, int i17) {
        super(activity, jumpView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpView, "jumpView");
        this.f557958h = i17;
    }

    @Override // zv2.b, zv2.r0
    public void a() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        boolean z17;
        if (this.f557958h == 57) {
            str = "1.0.65";
            str3 = r26.i0.t("{\"nickname\":\"#\"}", "#", hc2.t.b(this.f557928d, 1), false);
            z17 = true;
            str2 = "pages/music-selector/entry";
        } else {
            str = null;
            str2 = "pages/audio-profile/entry";
            str3 = "{\"mode\":\"selector\"}";
            z17 = false;
        }
        i95.m c17 = i95.n0.c(zy2.b6.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        zy2.ta.f(ya2.e1.f542005a, this.f557928d, "wxalitef1d58076d58fb4e8cc6bed37a19a4534", str2, str3, false, false, z17, str, new zv2.t(this), 48, null);
    }

    @Override // zv2.b
    public void d(com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 jumpInfo) {
        java.lang.String string;
        java.lang.String m76523x98b23862;
        java.lang.String m76523x98b238622;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpInfo, "jumpInfo");
        super.d(jumpInfo);
        int i17 = this.f557958h;
        java.lang.String str = "";
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f557928d;
        if (i17 == 57) {
            android.content.res.Resources resources = activityC0065xcd7aa112.getResources();
            java.lang.Object[] objArr = new java.lang.Object[1];
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
            if (c19786x6a1e2862 != null && (m76523x98b238622 = c19786x6a1e2862.m76523x98b23862()) != null) {
                str = m76523x98b238622;
            }
            objArr[0] = str;
            string = resources.getString(com.p314xaae8f345.mm.R.C30867xcad56011.loz, objArr);
        } else {
            android.content.res.Resources resources2 = activityC0065xcd7aa112.getResources();
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e28622 = this.f557930f;
            if (c19786x6a1e28622 != null && (m76523x98b23862 = c19786x6a1e28622.m76523x98b23862()) != null) {
                str = m76523x98b23862;
            }
            objArr2[0] = str;
            string = resources2.getString(com.p314xaae8f345.mm.R.C30867xcad56011.loy, objArr2);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(string);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786.c(this.f557929e, string, false, 2, null);
    }

    @Override // zv2.b
    public void f() {
        super.f();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f557928d;
        int dimensionPixelSize = activity.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561260dj);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.C15305x8b2e5786 c15305x8b2e5786 = this.f557929e;
        c15305x8b2e5786.setMinimumHeight(dimensionPixelSize);
        int i17 = this.f557958h;
        if (i17 == 57) {
            c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f79824x96410423);
            c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f79824x96410423);
        } else {
            c15305x8b2e5786.m62139x783f7bd3(com.p314xaae8f345.mm.R.raw.f80013x682fbcda);
            c15305x8b2e5786.m62142x7daa20f8(com.p314xaae8f345.mm.R.raw.f80013x682fbcda);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        r45.qt2 V6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) ((zy2.ra) pf5.z.f435481a.a(activity).c(zy2.ra.class))).V6();
        hc2.v0.b(this.f557929e, null, "post_selected_music_audio", 0, kz5.c1.k(new jz5.l("comment_scene", java.lang.Integer.valueOf(V6.m75939xb282bd08(5))), new jz5.l("behaviour_session_id", V6.m75945x2fec8307(0)), new jz5.l("finder_context_id", V6.m75945x2fec8307(1)), new jz5.l("finder_tab_context_id", V6.m75945x2fec8307(2)), new jz5.l("jump_business_type", java.lang.Integer.valueOf(i17))), null, 21, null);
    }

    @Override // zv2.b
    public void g() {
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
        if (c19786x6a1e2862 != null) {
            r45.k74 m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7();
            if (m76504xa819f0c7 != null) {
                m76504xa819f0c7.set(2, xc2.r0.a(m76504xa819f0c7.m75945x2fec8307(2), kz5.c1.k(new jz5.l("client_commentscene", "preview"), new jz5.l("from_scene", 4))));
            }
            xc2.y2 y2Var = xc2.y2.f534876a;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112 = this.f557928d;
            xc2.p0 p0Var = new xc2.p0(c19786x6a1e2862);
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s sVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.s();
            sVar.f225700d = new yc2.i(this.f557928d);
            p0Var.R = sVar;
            xc2.y2.i(y2Var, activityC0065xcd7aa112, p0Var, 0, null, 12, null);
        }
    }

    @Override // zv2.b
    public void l() {
        ry2.j.f482931a.a(this.f557928d, kz5.c0.i(new ry2.f(1, 0, 0, new zv2.u(this), null, 22, null), new ry2.f(2, com.p314xaae8f345.mm.R.C30859x5a72f63.f77881xa3c58d23, 0, new zv2.v(this), null, 20, null)), null);
    }

    @Override // zv2.b, ya2.q1
    public void n0(ya2.b2 contact) {
        r45.k74 m76504xa819f0c7;
        java.lang.Object m143895xf1229813;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contact, "contact");
        com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19786x6a1e2862 c19786x6a1e2862 = this.f557930f;
        if (c19786x6a1e2862 == null || (m76504xa819f0c7 = c19786x6a1e2862.m76504xa819f0c7()) == null) {
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            java.lang.String m75945x2fec8307 = m76504xa819f0c7.m75945x2fec8307(2);
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(m75945x2fec8307 != null ? new org.json.JSONObject(m75945x2fec8307) : new org.json.JSONObject());
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            m143895xf1229813 = jSONObject;
        }
        org.json.JSONObject jSONObject2 = (org.json.JSONObject) m143895xf1229813;
        jSONObject2.put("nickname", contact.w0());
        m76504xa819f0c7.set(2, jSONObject2.toString());
    }
}
