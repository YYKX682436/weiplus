package na2;

/* loaded from: classes2.dex */
public final class k extends x92.r {

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f417499g;

    /* renamed from: h, reason: collision with root package name */
    public android.widget.TextView f417500h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.View f417501i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f417502m;

    /* renamed from: n, reason: collision with root package name */
    public int f417503n;

    /* renamed from: o, reason: collision with root package name */
    public long f417504o;

    /* renamed from: p, reason: collision with root package name */
    public long f417505p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f417506q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f417507r;

    /* renamed from: s, reason: collision with root package name */
    public java.lang.String f417508s;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f417509t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f417503n = 1;
        this.f417507r = "";
        this.f417508s = "";
        this.f417509t = "";
    }

    @Override // x92.r
    public void R6() {
        super.R6();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", "initViews");
        this.f417504o = m158359x1e885992().getLongExtra("topic_id", 0L);
        this.f417505p = m158359x1e885992().getLongExtra("from_object_id", 0L);
        this.f417506q = m158359x1e885992().getStringExtra("from_object_dup_flag");
        java.lang.String stringExtra = m158359x1e885992().getStringExtra("source_session_buffer");
        if (stringExtra == null) {
            stringExtra = "";
        }
        this.f417507r = stringExtra;
        java.lang.String stringExtra2 = m158359x1e885992().getStringExtra(com.p314xaae8f345.mm.p1006xc5476f33.p1873x468d4ffd.p1875x75a49f33.C16532xe69b9d82.f37660xb6ae3b28);
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        this.f417508s = stringExtra2;
        java.lang.String stringExtra3 = m158359x1e885992().getStringExtra("sub_title");
        this.f417509t = stringExtra3 != null ? stringExtra3 : "";
        android.widget.FrameLayout frameLayout = this.f534253e;
        this.f417499g = frameLayout != null ? (android.widget.TextView) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.urx) : null;
        android.widget.FrameLayout frameLayout2 = this.f534253e;
        this.f417500h = frameLayout2 != null ? (android.widget.TextView) frameLayout2.findViewById(com.p314xaae8f345.mm.R.id.urw) : null;
        android.widget.FrameLayout frameLayout3 = this.f534253e;
        this.f417501i = frameLayout3 != null ? frameLayout3.findViewById(com.p314xaae8f345.mm.R.id.urq) : null;
        android.widget.FrameLayout frameLayout4 = this.f534253e;
        android.view.View findViewById = frameLayout4 != null ? frameLayout4.findViewById(com.p314xaae8f345.mm.R.id.urt) : null;
        this.f417502m = findViewById;
        if (findViewById != null) {
            findViewById.setOnClickListener(new na2.g(this));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", "initViews: initialTitle=" + this.f417508s + ", initialSubTitle=" + this.f417509t + " sourceFeedId=" + this.f417505p);
        android.widget.TextView textView = this.f417499g;
        if (textView != null) {
            textView.setText(this.f417508s);
        }
        android.widget.TextView textView2 = this.f417500h;
        if (textView2 != null) {
            textView2.setText(this.f417509t);
        }
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 context = m158354x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny nyVar = context instanceof com.p314xaae8f345.mm.ui.ActivityC21401x6ce6f73f ? (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny) pf5.z.f435481a.a(context).a(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1679xa3009fa4.p1680xac8f1cfd.ny.class) : null;
        r45.qt2 V6 = nyVar != null ? nyVar.V6() : null;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        jz5.l[] lVarArr = new jz5.l[7];
        lVarArr[0] = new jz5.l("finder_context_id", V6 != null ? V6.m75945x2fec8307(1) : null);
        lVarArr[1] = new jz5.l("finder_tab_context_id", V6 != null ? V6.m75945x2fec8307(2) : null);
        lVarArr[2] = new jz5.l("comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(5)) : null);
        lVarArr[3] = new jz5.l("source_comment_scene", V6 != null ? java.lang.Integer.valueOf(V6.m75939xb282bd08(7)) : null);
        lVarArr[4] = new jz5.l("source_feedid", pm0.v.u(this.f417505p));
        lVarArr[5] = new jz5.l("source_session_buffer", this.f417507r);
        lVarArr[6] = new jz5.l("cluster_id", pm0.v.u(this.f417504o));
        java.util.Map k17 = kz5.c1.k(lVarArr);
        h0Var.f391656d = k17;
        android.view.View view = this.f417502m;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2 d2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1622xc84c5534.d2.f206527a;
        if (view != null) {
            d2Var.n(view, "cluster_post", (r20 & 4) != 0 ? 40 : 40, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : k17, (r20 & 128) != 0 ? null : new na2.h(this));
        }
        android.view.View view2 = this.f417501i;
        if (view2 != null) {
            d2Var.n(view2, "cluster_shoot", (r20 & 4) != 0 ? 40 : 32, (r20 & 8) != 0 ? 25496 : 0, (r20 & 16) != 0 ? false : false, (r20 & 32) != 0 ? false : false, (r20 & 64) != 0 ? null : (java.util.Map) h0Var.f391656d, (r20 & 128) != 0 ? null : new na2.i(this));
            view2.setOnClickListener(new na2.j(this, h0Var));
        }
    }

    @Override // x92.r
    public void U6() {
        z5();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", "updateViews");
    }

    public final void V6(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FinderPostPlayNewHeaderUIC", "updateFavStatus: favStatus=" + i17);
        this.f417503n = i17;
        android.widget.FrameLayout frameLayout = this.f534253e;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = frameLayout != null ? (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) frameLayout.findViewById(com.p314xaae8f345.mm.R.id.urr) : null;
        android.widget.FrameLayout frameLayout2 = this.f534253e;
        android.widget.TextView textView = frameLayout2 != null ? (android.widget.TextView) frameLayout2.findViewById(com.p314xaae8f345.mm.R.id.urs) : null;
        if (i17 == 1) {
            if (textView != null) {
                textView.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4g));
            }
            if (c22699x3dcdb352 != null) {
                c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79538x28c40d8b);
                return;
            }
            return;
        }
        if (i17 != 2) {
            return;
        }
        if (c22699x3dcdb352 != null) {
            c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79703xc84d169a);
        }
        if (textView == null) {
            return;
        }
        textView.setText(m158362x2fec8307(com.p314xaae8f345.mm.R.C30867xcad56011.p4i));
    }
}
