package op4;

/* loaded from: classes2.dex */
public class g extends op4.k {

    /* renamed from: e, reason: collision with root package name */
    public final jz5.g f428807e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f428808f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f428809g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f428810h;

    /* renamed from: i, reason: collision with root package name */
    public int f428811i;

    /* renamed from: m, reason: collision with root package name */
    public long f428812m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f428813n;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p1983x4fc5b2ca.p1990xc5476f33.p1996xc4ab08aa.AbstractC17010x26b2d1ce pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f428807e = jz5.h.b(op4.f.f428806d);
        this.f428808f = "";
        this.f428809g = "";
        this.f428810h = "";
        this.f428811i = -1;
        new org.json.JSONObject();
        this.f428813n = "";
    }

    @Override // op4.k
    public void a(android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        java.lang.String stringExtra = intent.getStringExtra("key_finder_context_id");
        if (stringExtra == null && (stringExtra = intent.getStringExtra("key_context_id")) == null) {
            stringExtra = "";
        }
        this.f428808f = stringExtra;
        java.lang.String stringExtra2 = intent.getStringExtra("key_jump_id");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f428809g = stringExtra2;
        java.lang.String stringExtra3 = intent.getStringExtra("key_click_tab_context_id");
        this.f428810h = stringExtra3 != null ? stringExtra3 : "";
        this.f428811i = intent.getIntExtra("key_from_comment_scene", 0);
    }

    @Override // op4.k
    public void b() {
        if (this.f428812m <= 0) {
            return;
        }
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e c6549xf3595d4e = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6549xf3595d4e();
        c6549xf3595d4e.w((java.lang.String) ((jz5.n) this.f428807e).mo141623x754a37bb());
        c6549xf3595d4e.s(this.f428808f);
        c6549xf3595d4e.p(this.f428810h);
        c6549xf3595d4e.t(((k40.f) ((l40.e) i95.n0.c(l40.e.class))).aj());
        c6549xf3595d4e.q("101");
        c6549xf3595d4e.v(java.lang.String.valueOf(this.f428811i));
        c6549xf3595d4e.f138998g = 1;
        c6549xf3595d4e.r(java.lang.String.valueOf(c01.id.c()));
        c6549xf3595d4e.f139004m = c01.id.c() - this.f428812m;
        c6549xf3595d4e.x(this.f428813n);
        c6549xf3595d4e.u(r26.i0.v(this.f428809g, ",", ";", false, 4, null));
        c6549xf3595d4e.k();
    }

    @Override // op4.k
    public void c() {
        this.f428812m = c01.id.c();
        new org.json.JSONObject();
    }

    @Override // op4.k
    public java.lang.String g() {
        return "21874";
    }

    @Override // ju3.d0
    public void w(ju3.c0 status, android.os.Bundle bundle) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
    }
}
