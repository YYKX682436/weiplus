package ft4;

/* loaded from: classes14.dex */
public final class u1 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.z2 {
    public final android.view.View L;
    public final android.view.View M;
    public final android.view.View N;
    public final android.view.View P;
    public int Q;
    public ft4.t1 R;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u1(android.content.Context context) {
        super(context, 0, 3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        android.view.View inflate = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.ddw, null);
        android.widget.TextView textView = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.obc);
        com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        textView.setText(context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.lhj));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) inflate.findViewById(com.p314xaae8f345.mm.R.id.aa_)).setOnClickListener(new ft4.o1(this));
        s(inflate);
        android.view.View inflate2 = android.view.View.inflate(context, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571152de0, null);
        android.view.View findViewById = inflate2.findViewById(com.p314xaae8f345.mm.R.id.f567061py4);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.L = findViewById;
        android.view.View findViewById2 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.f567059py2);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.M = findViewById2;
        android.view.View findViewById3 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.f567060py3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.N = findViewById3;
        android.view.View findViewById4 = inflate2.findViewById(com.p314xaae8f345.mm.R.id.f567058py1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.P = findViewById4;
        j(inflate2);
        findViewById.setOnClickListener(new ft4.p1(this));
        findViewById4.setOnClickListener(new ft4.q1(this));
        findViewById2.setOnClickListener(new ft4.r1(this));
        findViewById3.setOnClickListener(new ft4.s1(this));
    }

    public final void D(int i17) {
        this.Q = i17;
        android.view.View view = this.L;
        view.setSelected(false);
        android.view.View view2 = this.P;
        view2.setSelected(false);
        android.view.View view3 = this.M;
        view3.setSelected(false);
        android.view.View view4 = this.N;
        view4.setSelected(false);
        int i18 = this.Q;
        if (i18 == 101) {
            view2.setSelected(true);
            return;
        }
        if (i18 == 201) {
            view3.setSelected(true);
        } else if (i18 != 301) {
            view.setSelected(true);
        } else {
            view4.setSelected(true);
        }
    }
}
