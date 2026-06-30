package kc2;

/* loaded from: classes15.dex */
public class c0 implements zy2.v7 {

    /* renamed from: a, reason: collision with root package name */
    public final kc2.g1 f387864a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f387865b;

    /* renamed from: c, reason: collision with root package name */
    public final zy2.fa f387866c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f387867d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f387868e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.List f387869f;

    /* renamed from: g, reason: collision with root package name */
    public final jz5.g f387870g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f387871h;

    /* renamed from: i, reason: collision with root package name */
    public final kc2.x1 f387872i;

    /* renamed from: j, reason: collision with root package name */
    public final kc2.x1 f387873j;

    /* renamed from: k, reason: collision with root package name */
    public final kc2.x1 f387874k;

    /* renamed from: l, reason: collision with root package name */
    public final jz5.g f387875l;

    /* renamed from: m, reason: collision with root package name */
    public final jz5.g f387876m;

    /* renamed from: n, reason: collision with root package name */
    public final jz5.g f387877n;

    /* renamed from: o, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2621x8fb0427b.u3 f387878o;

    /* renamed from: p, reason: collision with root package name */
    public int f387879p;

    /* renamed from: q, reason: collision with root package name */
    public int f387880q;

    /* renamed from: r, reason: collision with root package name */
    public int f387881r;

    public c0(kc2.g1 manager, com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 handler, zy2.fa redDotManager, java.lang.String leftEntrancePath, java.lang.String rightEntrancePath, java.util.List findTabPreferenceKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(manager, "manager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(handler, "handler");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(redDotManager, "redDotManager");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(leftEntrancePath, "leftEntrancePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rightEntrancePath, "rightEntrancePath");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(findTabPreferenceKey, "findTabPreferenceKey");
        this.f387864a = manager;
        this.f387865b = handler;
        this.f387866c = redDotManager;
        this.f387867d = leftEntrancePath;
        this.f387868e = rightEntrancePath;
        this.f387869f = findTabPreferenceKey;
        this.f387870g = jz5.h.b(kc2.x.f388051d);
        this.f387871h = "FinderKaraInfoManager.Finder";
        this.f387872i = kc2.x1.f388059n;
        this.f387873j = kc2.x1.f388058m;
        this.f387874k = kc2.x1.f388060o;
        this.f387875l = jz5.h.b(new kc2.v(this));
        this.f387876m = jz5.h.b(new kc2.w(this));
        this.f387877n = jz5.h.b(new kc2.b0(this));
        this.f387878o = com.p314xaae8f345.mm.p2621x8fb0427b.u3.USERINFO_FINDER_KARA_FINDER_LAST_EXIT_STRING_SYNC;
        handler.mo50293x3498a0(new kc2.u(this));
    }

    public kc2.x1 b() {
        return this.f387872i;
    }

    public final kc2.a2 c() {
        return (kc2.a2) ((jz5.n) this.f387875l).mo141623x754a37bb();
    }

    public kc2.x1 d() {
        return this.f387873j;
    }

    public final kc2.a2 e() {
        return (kc2.a2) ((jz5.n) this.f387876m).mo141623x754a37bb();
    }

    public final float f(int i17, int i18) {
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i17);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf == null) {
            return 0.0f;
        }
        valueOf.intValue();
        return i18 - i17;
    }

    public com.p314xaae8f345.mm.p2621x8fb0427b.u3 g() {
        return this.f387878o;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb h() {
        if (this.f387867d.length() == 0) {
            return null;
        }
        return zy2.ia.S0(this.f387866c, this.f387867d, null, false, false, 2, null);
    }

    public kc2.x1 i() {
        return this.f387874k;
    }

    public final kc2.a2 j() {
        return (kc2.a2) ((jz5.n) this.f387877n).mo141623x754a37bb();
    }

    public org.json.JSONObject k() {
        r45.f03 I0;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (n()) {
            int e17 = c01.id.e();
            jSONObject.put("is_open", 1);
            jSONObject.put("location_index", this.f387864a.f().b(this.f387869f));
            int i17 = this.f387879p;
            if (i17 > 0) {
                jSONObject.put("exit_interval", e17 - i17);
            }
            int i18 = this.f387880q;
            if (i18 > 0) {
                jSONObject.put("consume_reddot_interval", e17 - i18);
            }
            int i19 = this.f387881r;
            if (i19 > 0) {
                jSONObject.put("exopse_reddot_interval", e17 - i19);
            }
            java.util.List b17 = c().b(e17);
            int i27 = 0;
            jSONObject.put("click_with_reddot_count", kc2.l1.f(b17, (char) 0, 1, null));
            jSONObject.put("click_without_reddot_count", e().d());
            java.util.List b18 = j().b(e17);
            jSONObject.put("reddot_expose_count", kc2.l1.f(b18, (char) 0, 1, null));
            jSONObject.put("reddot_ctr_value", kc2.l1.f(kc2.l1.a(b17, b18), (char) 0, 1, null));
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb a17 = zy2.v7.a(this, false, false, 3, null);
            r45.f03 I02 = a17 != null ? a17.I0(this.f387868e) : null;
            jSONObject2.put("has", a17 != null ? 1 : 0);
            jSONObject2.put("type", a17 != null ? a17.f65875xb5fc3ab6 : 0);
            jSONObject2.put("showtype", I02 != null ? java.lang.Integer.valueOf(I02.f455420d) : null);
            jSONObject2.put("receive_time", a17 != null ? java.lang.Long.valueOf(a17.f65879x2261f6f2) : null);
            jSONObject2.put("is_ignore", (I02 == null || I02.f455432s != 1) ? 0 : 1);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb h17 = h();
            if (h17 != null && (I0 = h17.I0(this.f387867d)) != null) {
                i27 = I0.f455421e;
            }
            jSONObject2.put("count", i27);
            jSONObject.put("reddot_info", jSONObject2);
        }
        return jSONObject;
    }

    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb l(boolean z17, boolean z18) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb S0 = zy2.ia.S0(this.f387866c, this.f387868e, null, z17, z18, 2, null);
        if (((java.lang.Boolean) ((jz5.n) this.f387870g).mo141623x754a37bb()).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(m(), "getRightRedDot " + this.f387868e + '=' + S0 + ", checkFreqCtrl=" + z17 + ", checkExposeLimit=" + z18);
        }
        return S0;
    }

    public java.lang.String m() {
        return this.f387871h;
    }

    public boolean n() {
        return ((c61.l7) i95.n0.c(c61.l7.class)).Ik();
    }
}
