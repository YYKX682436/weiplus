package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class wq extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public android.widget.TextView H;
    public android.widget.TextView I;

    /* renamed from: J, reason: collision with root package name */
    public android.widget.TextView f201760J;
    public android.widget.TextView K;
    public android.view.View L;
    public android.widget.TextView M;
    public android.view.View N;
    public android.view.View P;
    public android.widget.TextView Q;
    public android.view.View R;
    public final jz5.g S;
    public r45.h32 T;
    public final java.lang.String U;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wq(android.content.Context context) {
        super(context, false, null, 0.5f, 4, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.S = jz5.h.b(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.sq(context));
        this.U = "FinderLivePostNoticeInfoPanel";
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.f570478do5;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m8x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.R = rootView.findViewById(com.p314xaae8f345.mm.R.id.umk);
        android.widget.TextView textView = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f566275fe0);
        this.H = textView;
        if (textView != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView);
        }
        this.I = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.feo);
        this.f201760J = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.fdt);
        this.K = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.r6r);
        this.L = rootView.findViewById(com.p314xaae8f345.mm.R.id.r6m);
        android.widget.TextView textView2 = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.r6k);
        this.M = textView2;
        if (textView2 != null) {
            com.p314xaae8f345.mm.ui.fk.a(textView2);
        }
        d0();
        a0(this.f199716e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
        this.N = rootView.findViewById(com.p314xaae8f345.mm.R.id.r6l);
        this.P = rootView.findViewById(com.p314xaae8f345.mm.R.id.ulf);
        this.Q = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.ulb);
    }

    public final void e0() {
        android.widget.TextView textView = this.K;
        if (textView == null) {
            return;
        }
        zl2.r4 r4Var = zl2.r4.f555483a;
        r45.h32 h32Var = this.T;
        if (h32Var != null) {
            textView.setText(r4Var.e1(r45.vw4.a(h32Var.m75939xb282bd08(18))));
        } else {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("noticeInfo");
            throw null;
        }
    }
}
