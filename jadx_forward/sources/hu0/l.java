package hu0;

/* loaded from: classes5.dex */
public final class l extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public final jz5.g f366570d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.LinearLayout f366571e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.Button f366572f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f366573g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.a f366574h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f366570d = jz5.h.b(hu0.b.f366550d);
    }

    public static final void O6(hu0.l lVar, java.lang.String str) {
        lVar.getClass();
        i95.m c17 = i95.n0.c(dy1.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        ((cy1.a) ((dy1.r) c17)).Bj(str, "view_clk", lVar.Q6(), 1, false);
    }

    public final void P6(android.view.View view, java.lang.String str) {
        i95.m c17 = i95.n0.c(dy1.r.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        cy1.a aVar = (cy1.a) ((dy1.r) c17);
        aVar.pk(view, str);
        aVar.Tj(view, 32, 1, false);
        aVar.Ai(view, new hu0.a(this));
    }

    public final java.util.Map Q6() {
        java.lang.String str;
        java.lang.String str2;
        java.lang.String str3;
        gu0.k2 k2Var = (gu0.k2) ((jz5.n) this.f366570d).mo141623x754a37bb();
        eu0.b bVar = k2Var != null ? k2Var.f357258a : null;
        eu0.o oVar = bVar != null ? bVar.f338241n : null;
        jz5.l[] lVarArr = new jz5.l[4];
        java.lang.String str4 = "";
        if (oVar == null || (str = oVar.f338260a) == null) {
            str = "";
        }
        lVarArr[0] = new jz5.l("finder_tab_context_id", str);
        if (oVar == null || (str2 = oVar.f338261b) == null) {
            str2 = "";
        }
        lVarArr[1] = new jz5.l("finder_context_id", str2);
        lVarArr[2] = new jz5.l("comment_scene", 101);
        if (bVar != null && (str3 = bVar.f338240m) != null) {
            str4 = str3;
        }
        lVarArr[3] = new jz5.l("templateid", str4);
        return kz5.c1.k(lVarArr);
    }

    public final void R6(boolean z17) {
        float f17 = z17 ? 1.0f : 0.5f;
        android.widget.Button button = this.f366572f;
        if (button != null) {
            button.setEnabled(z17);
            button.setAlpha(f17);
        }
        android.widget.TextView textView = this.f366573g;
        if (textView != null) {
            textView.setEnabled(z17);
            textView.setAlpha(f17);
        }
        android.widget.LinearLayout linearLayout = this.f366571e;
        if (linearLayout != null) {
            linearLayout.setAlpha(f17);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9, pf5.g
    /* renamed from: onDestroy */
    public void mo451xac79a11b() {
        this.f366571e = null;
        this.f366572f = null;
        this.f366573g = null;
        this.f366574h = null;
    }

    @Override // com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9
    /* renamed from: onViewCreated */
    public void mo47092x594b1124(android.view.View contentView) {
        eu0.b bVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        super.mo47092x594b1124(contentView);
        gu0.k2 k2Var = (gu0.k2) ((jz5.n) this.f366570d).mo141623x754a37bb();
        android.widget.TextView textView = null;
        boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b((k2Var == null || (bVar = k2Var.f357258a) == null) ? null : bVar.f338228a, "reedit");
        this.f366571e = (android.widget.LinearLayout) contentView.findViewById(com.p314xaae8f345.mm.R.id.sxb);
        android.widget.TextView textView2 = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.sxf);
        if (textView2 != null) {
            textView2.setText(b17 ? "" : textView2.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.o_r));
        }
        android.widget.Button button = (android.widget.Button) contentView.findViewById(com.p314xaae8f345.mm.R.id.sxe);
        if (button != null) {
            button.setText(button.getContext().getString(b17 ? com.p314xaae8f345.mm.R.C30867xcad56011.o_p : com.p314xaae8f345.mm.R.C30867xcad56011.o_l));
            if (b17) {
                P6(button, "effect_modify_complete_continue_post");
            }
            button.setOnClickListener(new hu0.i(b17, this));
        } else {
            button = null;
        }
        this.f366572f = button;
        android.widget.TextView textView3 = (android.widget.TextView) contentView.findViewById(com.p314xaae8f345.mm.R.id.sxc);
        if (textView3 != null) {
            if (b17) {
                P6(textView3, "effect_modify_complete_reedit");
            }
            textView3.setOnClickListener(new hu0.j(b17, this));
            textView = textView3;
        }
        this.f366573g = textView;
        android.widget.FrameLayout frameLayout = (android.widget.FrameLayout) contentView.findViewById(com.p314xaae8f345.mm.R.id.sxg);
        if (frameLayout != null) {
            frameLayout.setClipToOutline(true);
            frameLayout.setOutlineProvider(new hu0.k());
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MJCC.ControlUIC", "onViewCreated: isReedit=" + b17);
    }
}
