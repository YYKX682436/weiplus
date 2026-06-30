package ov0;

/* loaded from: classes5.dex */
public abstract class i0 extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k {

    /* renamed from: n, reason: collision with root package name */
    public final ov0.u f430668n;

    /* renamed from: o, reason: collision with root package name */
    public final ov0.h0 f430669o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f430668n = new ov0.u(this);
        this.f430669o = new ov0.h0(this);
    }

    public void k7() {
    }

    public abstract sw0.c l7(ov0.e eVar);

    public abstract java.lang.String m7();

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.k
    /* renamed from: n7, reason: merged with bridge method [inline-methods] */
    public void Z6(ov0.t panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        panel.m47108xeca1a16f(this.f430668n);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) mo144222x4ff8c0f0(com.p314xaae8f345.mm.R.id.cgz);
        if (linearLayout != null) {
            linearLayout.setOnClickListener(ov0.a0.f430646d);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList(2);
        int i17 = 0;
        while (i17 < 2) {
            ov0.e.f430657d.getClass();
            arrayList.add(l7(i17 == 0 ? ov0.e.f430658e : ov0.e.f430659f));
            i17++;
        }
        panel.K(arrayList, this.f430669o);
        panel.m157199xdb574fcd().setHint(m7());
        panel.m157197xea0b8dfb().setOnClickListener(new ov0.b0(this, panel));
        panel.m157202xba2a8c67().setOnClickListener(new ov0.c0(this, panel));
        panel.m157198xab635744().setOnClickListener(new ov0.d0(this));
        panel.m157199xdb574fcd().addTextChangedListener(new ov0.v(panel, this));
        panel.m157199xdb574fcd().setOnFocusChangeListener(new ov0.e0(panel));
        panel.m157203x4d68d3e1().addTextChangedListener(new ov0.w(panel, this));
        panel.m157203x4d68d3e1().setOnFocusChangeListener(new ov0.f0(panel));
        panel.m157199xdb574fcd().setOnTouchListener(ov0.g0.f430664d);
        panel.m157203x4d68d3e1().setOnTouchListener(ov0.x.f430691d);
        panel.m157199xdb574fcd().setOnClickListener(new ov0.y(this));
        panel.m157203x4d68d3e1().setOnClickListener(new ov0.z(this));
    }

    public void o7(java.lang.CharSequence charSequence) {
    }

    public abstract void p7(java.lang.CharSequence charSequence);

    public final void q7(java.lang.String text) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157199xdb574fcd;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157199xdb574fcd2;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        ov0.t tVar = (ov0.t) this.f150773i;
        if (tVar != null && (m157199xdb574fcd2 = tVar.m157199xdb574fcd()) != null) {
            m157199xdb574fcd2.setText(text);
        }
        ov0.t tVar2 = (ov0.t) this.f150773i;
        if (tVar2 == null || (m157199xdb574fcd = tVar2.m157199xdb574fcd()) == null) {
            return;
        }
        m157199xdb574fcd.setSelection(text.length());
    }

    public final void r7(java.lang.String text) {
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157203x4d68d3e1;
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p913x4fe3eeaf.C10997xb9369314 m157203x4d68d3e12;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(text, "text");
        ov0.t tVar = (ov0.t) this.f150773i;
        if (tVar != null && (m157203x4d68d3e12 = tVar.m157203x4d68d3e1()) != null) {
            m157203x4d68d3e12.setText(text);
        }
        ov0.t tVar2 = (ov0.t) this.f150773i;
        if (tVar2 == null || (m157203x4d68d3e1 = tVar2.m157203x4d68d3e1()) == null) {
            return;
        }
        m157203x4d68d3e1.setSelection(text.length());
    }
}
