package a24;

/* loaded from: classes.dex */
public abstract class i extends wm3.a implements java.lang.Cloneable {

    /* renamed from: d, reason: collision with root package name */
    public a24.h f82418d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f82419e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f82420f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f82419e = "";
        this.f82420f = "";
    }

    public yz5.l T6() {
        return null;
    }

    public android.view.View.OnClickListener U6() {
        return null;
    }

    public int V6() {
        return 0;
    }

    public java.lang.String W6() {
        return null;
    }

    public boolean X6() {
        return true;
    }

    public java.lang.Integer Y6() {
        return null;
    }

    public abstract int Z6();

    public abstract java.lang.String a7();

    public abstract a24.u b7();

    public java.lang.String c7() {
        java.lang.String string = m80379x76847179().getString(d7());
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    /* renamed from: clone */
    public java.lang.Object mo446x5a5dd5d() {
        return super.clone();
    }

    public abstract int d7();

    public abstract java.lang.Class e7();

    public java.lang.String f7() {
        java.lang.String n76 = n7();
        return n76 == null ? "" : n76;
    }

    public final java.util.Map g7(android.content.Intent intent) {
        jz5.l[] lVarArr = new jz5.l[12];
        lVarArr[0] = new jz5.l("page_name_kv", intent != null ? intent.getStringExtra("page_name_kv") : null);
        lVarArr[1] = new jz5.l("view_name_kv", a7());
        lVarArr[2] = new jz5.l("setting_level", java.lang.Integer.valueOf(m7()));
        lVarArr[3] = new jz5.l("ui_version", 2);
        lVarArr[4] = new jz5.l("cell_source_type", intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("cell_source_type", 2)) : null);
        lVarArr[5] = new jz5.l("search_word", intent != null ? intent.getStringExtra("search_word") : null);
        lVarArr[6] = new jz5.l("setting_sessionid", u24.n.b());
        lVarArr[7] = new jz5.l("setting_from_source", intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("setting_from_source", 2)) : null);
        lVarArr[8] = new jz5.l("search_index", intent != null ? java.lang.Integer.valueOf(intent.getIntExtra("search_index", 0)) : null);
        lVarArr[9] = new jz5.l("switch_button_type", java.lang.Integer.valueOf(h7()));
        lVarArr[10] = new jz5.l("switch_status_current", f7());
        lVarArr[11] = new jz5.l("search_query_id", intent != null ? intent.getStringExtra("search_query_id") : null);
        return kz5.c1.l(lVarArr);
    }

    public int h7() {
        return 0;
    }

    public android.graphics.drawable.Drawable i7() {
        return null;
    }

    public int k7() {
        return 8;
    }

    public boolean l7() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.C17522x58fbb943);
    }

    public abstract int m7();

    public java.lang.String n7() {
        java.lang.Integer p76 = p7();
        if (p76 != null) {
            return m80379x76847179().getString(p76.intValue());
        }
        return null;
    }

    public java.lang.Integer o7() {
        return null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onCreate */
    public void mo450x3e5a77bb(android.os.Bundle bundle) {
        this.f82418d = v7();
        this.f82419e = f7();
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        java.lang.String f76 = f7();
        this.f82420f = f76;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(f76, this.f82419e)) {
            return;
        }
        java.util.Map g76 = g7(m158359x1e885992());
        g76.put("switch_status_after", this.f82420f);
        g76.put("switch_status_before", this.f82419e);
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.Integer REPORT_RULE = b24.a.f98927a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(REPORT_RULE, "REPORT_RULE");
        ((cy1.a) rVar).Ej("setting_switch_succeed", g76, REPORT_RULE.intValue());
    }

    public java.lang.Integer p7() {
        return null;
    }

    public boolean q7() {
        return !(this instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2051x765f0e50.ui.p2060xf8bc3f31.p2062x5582bc23.p2063x2cefd8ff.C17533x9d9be7e4);
    }

    public abstract void r7(android.content.Context context, android.view.View view, int i17);

    public final void s7() {
        j75.f m67437x4bd5310;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(m80379x76847179());
        if (a17 == null || (m67437x4bd5310 = a17.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new r24.b());
    }

    public final void t7(android.content.Intent intent) {
        u7(intent, a7());
    }

    public final void u7(android.content.Intent intent, java.lang.String key) {
        java.lang.String stringExtra;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Map g76 = g7(intent);
        g76.put("view_id", key);
        long c17 = c01.id.c();
        java.lang.Long j17 = (intent == null || (stringExtra = intent.getStringExtra("setting_page_time")) == null) ? null : r26.h0.j(stringExtra);
        java.lang.String b17 = u24.n.b();
        java.lang.String substring = b17.substring(r26.n0.O(b17, '_', 0, false, 6, null) + 1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
        java.lang.Long j18 = r26.h0.j(substring);
        if (j17 != null) {
            g76.put("before_clk_page_duration", java.lang.Long.valueOf(c17 - j17.longValue()));
        }
        if (j18 != null) {
            g76.put("before_clk_session_duration", java.lang.Long.valueOf(c17 - j18.longValue()));
        }
        dy1.r rVar = (dy1.r) i95.n0.c(dy1.r.class);
        java.lang.Integer REPORT_RULE = b24.a.f98927a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(REPORT_RULE, "REPORT_RULE");
        ((cy1.a) rVar).Ej("view_clk", g76, REPORT_RULE.intValue());
    }

    public final a24.h v7() {
        return new a24.h(q7(), Y6(), n7(), this instanceof s24.g ? ((s24.g) this).getF243490i() : true);
    }

    public final void w7() {
        j75.f m67437x4bd5310;
        this.f82418d = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 a17 = tm3.a.a(m80379x76847179());
        if (a17 == null || (m67437x4bd5310 = a17.m67437x4bd5310()) == null) {
            return;
        }
        m67437x4bd5310.B3(new r24.a(getClass()));
    }
}
