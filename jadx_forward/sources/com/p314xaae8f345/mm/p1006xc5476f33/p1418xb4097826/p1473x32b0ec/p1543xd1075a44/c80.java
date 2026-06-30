package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class c80 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 H;
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public r45.vw4 f199508J;
    public r45.h32 K;
    public int L;
    public yz5.l M;
    public final jz5.g N;
    public boolean P;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c80(android.content.Context context) {
        super(context, false, null, 0.4f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.I = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x70(context));
        this.f199508J = r45.vw4.Auto;
        this.L = 1;
        this.N = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.b80(context, this));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.do6;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573249mm3);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d25 = (com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25) rootView.findViewById(com.p314xaae8f345.mm.R.id.r6q);
        this.H = c22849x81a93d25;
        if (c22849x81a93d25 != null) {
            c22849x81a93d25.mo7960x6cab2c8d((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a80) ((jz5.n) this.N).mo141623x754a37bb());
        }
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 c22849x81a93d252 = this.H;
        android.content.Context context = this.f199716e;
        if (c22849x81a93d252 != null) {
            c22849x81a93d252.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(context));
        }
        a0(context.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        d0();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        r45.h32 h32Var = this.K;
        if (h32Var != null) {
            if (this.L == 2 || this.P) {
                int m75939xb282bd08 = h32Var.m75939xb282bd08(18);
                int i17 = this.f199508J.f470157d;
                if (m75939xb282bd08 != i17) {
                    h32Var.set(18, java.lang.Integer.valueOf(i17));
                }
            }
            yz5.l lVar = this.M;
            if (lVar != null) {
                lVar.mo146xb9724478(h32Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        this.P = true;
        super.U();
    }

    public final void e0(r45.h32 noticeInfo, int i17, yz5.l onChooseTypeListener) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noticeInfo, "noticeInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(onChooseTypeListener, "onChooseTypeListener");
        this.P = false;
        this.K = noticeInfo;
        r45.vw4 a17 = r45.vw4.a(noticeInfo.m75939xb282bd08(18));
        if (a17 == null) {
            a17 = r45.vw4.Auto;
        }
        this.f199508J = a17;
        this.M = onChooseTypeListener;
        this.L = i17;
        ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.a80) ((jz5.n) this.N).mo141623x754a37bb()).m8146xced61ae5();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.W(this, null, false, 0, 7, null);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        int i17 = this.L;
        android.content.Context context = this.f199716e;
        if (i17 == 1) {
            android.widget.TextView textView = new android.widget.TextView(context);
            textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573261m93));
            textView.setTextSize(15.0f);
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
            return textView;
        }
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(context);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77654xad7ef30));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 24), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f80051x8e8c33a0);
        return c22699x3dcdb352;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        if (this.L != 1) {
            return null;
        }
        android.widget.TextView textView = new android.widget.TextView(this.f199716e);
        textView.setText(textView.getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573262m94));
        textView.setTextSize(15.0f);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
        textView.setBackgroundDrawable(textView.getContext().getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo));
        textView.setMinWidth((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df));
        textView.setMinHeight((int) textView.getContext().getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7));
        textView.setGravity(17);
        return textView;
    }
}
