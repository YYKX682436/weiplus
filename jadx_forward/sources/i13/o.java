package i13;

/* loaded from: classes10.dex */
public final class o extends i13.c implements i50.p {

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f368834h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f368835i;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f368836m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f368837n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f368838o;

    /* renamed from: p, reason: collision with root package name */
    public final java.lang.String f368839p;

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.String f368840q;

    /* renamed from: r, reason: collision with root package name */
    public final java.lang.String f368841r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f368842s;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f368843t;

    /* renamed from: u, reason: collision with root package name */
    public final int f368844u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f368845v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String forcePushId, java.lang.String avatarUrl, java.lang.String nickname, java.lang.String wording, java.lang.String feedId, java.lang.String liveId, java.lang.String nonceId, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, int i17, java.lang.String str7) {
        super(forcePushId, 0L, 2, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(avatarUrl, "avatarUrl");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nickname, "nickname");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wording, "wording");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedId, "feedId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(liveId, "liveId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nonceId, "nonceId");
        this.f368834h = nickname;
        this.f368835i = feedId;
        this.f368836m = liveId;
        this.f368837n = nonceId;
        this.f368838o = str;
        this.f368839p = str2;
        this.f368840q = str3;
        this.f368841r = str4;
        this.f368842s = str5;
        this.f368843t = str6;
        this.f368844u = i17;
        this.f368845v = str7;
    }

    @Override // i13.c
    public java.lang.String c() {
        java.lang.String string = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.fep);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // i13.c
    public boolean e() {
        return true;
    }

    @Override // i13.c
    public boolean f() {
        return true;
    }

    @Override // i13.c
    public void g() {
        int i17;
        super.g();
        java.lang.String str = this.f368835i;
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        java.lang.String str2 = this.f368843t;
        if (str2 != null) {
            jSONObject.put("push_type", str2);
        }
        java.lang.String str3 = this.f368842s;
        if (str3 != null) {
            jSONObject.put("notice_id", str3);
        }
        i50.q qVar = (i50.q) i95.n0.c(i50.q.class);
        i95.m c17 = i95.n0.c(h13.l0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        if (h13.l0.Ui((h13.l0) c17, null, 1, null)) {
            i95.m c18 = i95.n0.c(h13.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c18, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c18, null, 1, null) ? 1 : 4;
        } else {
            i95.m c19 = i95.n0.c(h13.l0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c19, "getService(...)");
            i17 = h13.l0.Vi((h13.l0) c19, null, 1, null) ? 3 : 2;
        }
        ((h13.c0) qVar).Di(str, i17, 2, this.f368808d, false, jSONObject.toString());
    }

    @Override // in5.c
    /* renamed from: getItemId */
    public long mo2128x1ed62e84() {
        return 0L;
    }

    @Override // in5.c
    public int h() {
        return 1;
    }

    @Override // i13.c
    public void i() {
        int size = k13.l1.I.a().f384772q.size();
        ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(3, 2, this.f368835i, size, this.f368808d);
    }

    @Override // i13.c
    public void j() {
        super.j();
        java.lang.String str = this.f368835i;
        if (str == null || str.length() == 0) {
            return;
        }
        r45.jn0 jn0Var = new r45.jn0();
        jn0Var.set(0, java.lang.Long.valueOf(pm0.v.Z(str)));
        jn0Var.set(1, this.f368841r);
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        jSONObject.put("feedActionType", 38);
        jSONObject.put("strValue", this.f368842s);
        jn0Var.set(3, jSONObject.toString());
        jn0Var.set(2, this.f368845v);
        java.lang.String str2 = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        if (z65.c.a()) {
            db5.t7.m(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a, "开始直播liveinfo预加载");
        }
        i95.m c17 = i95.n0.c(s40.w0.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        s40.w0 w0Var = (s40.w0) c17;
        long Z = pm0.v.Z(this.f368836m);
        qs5.d dVar = qs5.d.f447959e;
        r45.m71 m71Var = new r45.m71();
        m71Var.set(0, java.lang.Integer.valueOf(this.f368844u));
        m71Var.set(1, 1);
        s40.w0.u9(w0Var, Z, true, null, null, 5, null, null, m71Var, 96, null);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).al(null, 18054, jn0Var);
    }

    @Override // i13.c
    public void k(android.view.View view) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        m13.d dVar = m13.d.f404398a;
        android.content.Context context = view.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        dVar.a(context, this, i13.n.f368830c.a().f368832a.size());
    }

    @Override // i13.c
    public void l(boolean z17) {
        super.l(z17);
        if (z17) {
            int size = k13.l1.I.a().f384772q.size();
            ((h13.c0) ((i50.q) i95.n0.c(i50.q.class))).Ni(2, 2, this.f368835i, size, this.f368808d);
        }
    }

    @Override // i13.c
    public void n(in5.s0 holder, android.view.View view, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(view, "view");
        int size = k13.l1.I.a().f384772q.size();
        m13.d dVar = m13.d.f404398a;
        android.content.Context context = holder.f374654e;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        dVar.a(context, this, size);
    }

    @Override // i13.c
    public void o() {
        super.o();
        i13.n a17 = i13.n.f368830c.a();
        a17.getClass();
        java.lang.String forcePushId = this.f368808d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(forcePushId, "forcePushId");
        a17.f368833b.remove(forcePushId);
        j13.a.f378710d.d(forcePushId);
    }
}
