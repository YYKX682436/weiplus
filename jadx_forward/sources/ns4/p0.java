package ns4;

/* loaded from: classes8.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f421141a;

    /* renamed from: b, reason: collision with root package name */
    public final ns4.r0 f421142b;

    /* renamed from: c, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 f421143c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.Button f421144d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab f421145e;

    /* renamed from: f, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 f421146f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f421147g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f421148h;

    public p0(android.content.Context context, ns4.r0 parameter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parameter, "parameter");
        this.f421141a = context;
        this.f421142b = parameter;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 z2Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2(context, 0, 0, true, parameter.f421164b);
        this.f421143c = z2Var;
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571147d62, null);
        android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.pkl);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f421144d = (android.widget.Button) findViewById;
        android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.f565314c13);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.f421145e = (com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) findViewById2;
        android.view.View findViewById3 = inflate.findViewById(com.p314xaae8f345.mm.R.id.hdd);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.f421146f = (com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2) findViewById3;
        android.view.View findViewById4 = inflate.findViewById(com.p314xaae8f345.mm.R.id.hdu);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.f421147g = (android.widget.TextView) findViewById4;
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f421146f;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputArea");
            throw null;
        }
        viewOnFocusChangeListenerC22907xe18534c2.m83217x59dfe8de(true);
        android.widget.Button button = this.f421144d;
        if (button == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
            throw null;
        }
        button.setEnabled(false);
        if (parameter.f421164b) {
            int color = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77681x8113c230);
            int color2 = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77673x8113c22b);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.aa8)).m82040x7541828(color);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc)).setTextColor(color);
            ((android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.dim)).setTextColor(color2);
            ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.pk_)).m82040x7541828(color2);
            ((com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569215pf5)).setTextColor(color);
            ((android.widget.LinearLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567504jq3)).setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.baj);
            com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c22 = this.f421146f;
            if (viewOnFocusChangeListenerC22907xe18534c22 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputArea");
                throw null;
            }
            viewOnFocusChangeListenerC22907xe18534c22.m83193x8abc0e3f(color);
            com.p314xaae8f345.mm.p2802xd031a825.ui.C22904x897710ab c22904x897710ab = this.f421145e;
            if (c22904x897710ab == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("coinAmount");
                throw null;
            }
            c22904x897710ab.setTextColor(color2);
            android.widget.Button button2 = this.f421144d;
            if (button2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            button2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560370in));
            android.widget.Button button3 = this.f421144d;
            if (button3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
                throw null;
            }
            button3.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562592jm);
        }
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.aa8)).setOnClickListener(new ns4.l0(this));
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c23 = this.f421146f;
        if (viewOnFocusChangeListenerC22907xe18534c23 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputArea");
            throw null;
        }
        viewOnFocusChangeListenerC22907xe18534c23.b(new ns4.m0(this));
        android.widget.Button button4 = this.f421144d;
        if (button4 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("confirmButton");
            throw null;
        }
        button4.setOnClickListener(new ns4.n0(this));
        z2Var.k(inflate, 0, 0);
        z2Var.A(48);
        com.p314xaae8f345.mm.ui.p2740x696c9db.f5 f5Var = new com.p314xaae8f345.mm.ui.p2740x696c9db.f5((android.app.Activity) context);
        f5Var.f291933e = new ns4.g0(this);
        this.f421148h = f5Var;
    }

    public final void a() {
        com.p314xaae8f345.mm.p2802xd031a825.ui.p2807x1c4b4569.ViewOnFocusChangeListenerC22907xe18534c2 viewOnFocusChangeListenerC22907xe18534c2 = this.f421146f;
        if (viewOnFocusChangeListenerC22907xe18534c2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("inputArea");
            throw null;
        }
        com.p3249xcbb51f6b.p3250xcca8366f.p3251xd0ce8b26.C28001xdd2bb359 c28001xdd2bb359 = viewOnFocusChangeListenerC22907xe18534c2.f295694h;
        if (c28001xdd2bb359 != null) {
            c28001xdd2bb359.clearFocus();
            ((android.view.inputmethod.InputMethodManager) viewOnFocusChangeListenerC22907xe18534c2.getContext().getSystemService("input_method")).hideSoftInputFromWindow(viewOnFocusChangeListenerC22907xe18534c2.f295694h.getWindowToken(), 0);
        }
        this.f421148h.d();
        this.f421143c.B();
    }
}
