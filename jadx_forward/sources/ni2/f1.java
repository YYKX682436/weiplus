package ni2;

/* loaded from: classes10.dex */
public final class f1 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b1 {

    /* renamed from: i, reason: collision with root package name */
    public final gk2.e f418824i;

    /* renamed from: m, reason: collision with root package name */
    public final lj2.x0 f418825m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 f418826n;

    /* renamed from: o, reason: collision with root package name */
    public android.widget.Button f418827o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f418828p;

    /* renamed from: q, reason: collision with root package name */
    public xh2.a f418829q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(android.content.Context context, gk2.e buContext, lj2.x0 server) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(buContext, "buContext");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(server, "server");
        this.f418824i = buContext;
        this.f418825m = server;
        this.f418828p = "";
        ni2.z0 z0Var = new ni2.z0();
        ni2.e1 e1Var = new ni2.e1();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f418826n;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        c22621x7603e017.mo81583x7e4f2d39(new android.text.InputFilter[]{z0Var, e1Var});
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e0172 = this.f418826n;
        if (c22621x7603e0172 != null) {
            c22621x7603e0172.addTextChangedListener(new ni2.y0(this));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    public final void A(java.lang.String str) {
        if (str.length() <= 0 || p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f418828p, str)) {
            android.widget.Button button = this.f418827o;
            if (button != null) {
                button.setEnabled(false);
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
                throw null;
            }
        }
        android.widget.Button button2 = this.f418827o;
        if (button2 != null) {
            button2.setEnabled(true);
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmBtn");
            throw null;
        }
    }

    public final void B(xh2.a aVar, java.lang.String tagText) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tagText, "tagText");
        w();
        this.f418829q = aVar;
        this.f418828p = tagText;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f418826n;
        if (c22621x7603e017 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
        c22621x7603e017.setText(tagText);
        A(tagText);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public android.view.View b() {
        return h();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public int j() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dkq;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public java.lang.String o() {
        java.lang.String string = this.f199914d.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jz6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void p(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        android.view.View findViewById = rootView.findViewById(com.p314xaae8f345.mm.R.id.d6q);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f418826n = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017) findViewById;
        android.view.View findViewById2 = rootView.findViewById(com.p314xaae8f345.mm.R.id.c9z);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        android.widget.Button button = (android.widget.Button) findViewById2;
        this.f418827o = button;
        button.setOnClickListener(new ni2.d1(this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b1, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.g
    public void t() {
        super.t();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f418826n;
        if (c22621x7603e017 != null) {
            c22621x7603e017.setText("");
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b1
    public android.widget.EditText y() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f418826n;
        if (c22621x7603e017 != null) {
            return c22621x7603e017;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
        throw null;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b1
    public void z() {
        super.z();
        com.p314xaae8f345.mm.ui.p2747xd1075a44.C22621x7603e017 c22621x7603e017 = this.f418826n;
        if (c22621x7603e017 != null) {
            c22621x7603e017.mo81549xf579a34a(this.f418828p.length());
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("editText");
            throw null;
        }
    }
}
