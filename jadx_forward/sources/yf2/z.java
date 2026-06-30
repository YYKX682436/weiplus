package yf2;

/* loaded from: classes3.dex */
public final class z extends if2.b {

    /* renamed from: m, reason: collision with root package name */
    public android.view.View f543353m;

    /* renamed from: n, reason: collision with root package name */
    public android.widget.TextView f543354n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 f543355o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f543356p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.C14197x319b1b9e store) {
        super(store);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(store, "store");
    }

    public final void Z6(boolean z17) {
        android.widget.TextView textView;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352;
        if (this.f543356p == z17) {
            return;
        }
        this.f543356p = z17;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostButtonController", "applyInviteeWaitingStyle: invitee=" + z17);
        android.view.View view = this.f543353m;
        if (view == null || (textView = this.f543354n) == null || (c22699x3dcdb352 = this.f543355o) == null) {
            return;
        }
        if (!z17) {
            view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.a0f);
            view.setEnabled(true);
            view.setClickable(true);
            textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.f6o);
            textView.setAlpha(1.0f);
            c22699x3dcdb352.setVisibility(0);
            c22699x3dcdb352.setAlpha(1.0f);
            return;
        }
        view.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.d27);
        view.setEnabled(false);
        view.setClickable(false);
        textView.setText(com.p314xaae8f345.mm.R.C30867xcad56011.onq);
        textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77675x8113c22d));
        textView.setAlpha(1.0f);
        c22699x3dcdb352.setVisibility(8);
        c22699x3dcdb352.setAlpha(1.0f);
    }

    public final void a7(boolean z17) {
        if (this.f543356p && z17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostButtonController", "setButtonEnabled(" + z17 + ") ignored due to invitee waiting state");
            return;
        }
        android.view.View view = this.f543353m;
        if (view == null) {
            return;
        }
        view.setEnabled(z17);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewMount */
    public void mo8998x9f682d55(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f543353m = pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.fg_);
        this.f543354n = (android.widget.TextView) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.f566294fg1);
        this.f543355o = (com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352) pluginLayout.findViewById(com.p314xaae8f345.mm.R.id.f566295fg2);
        android.view.View view = this.f543353m;
        if (view != null) {
            view.postDelayed(new yf2.x(this), 1000L);
        }
        android.view.View view2 = this.f543353m;
        if (view2 != null) {
            view2.setOnTouchListener(new yf2.y(this));
        }
        android.widget.TextView textView = this.f543354n;
        if (textView != null) {
            textView.setTextColor(textView.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560086an));
            com.p314xaae8f345.mm.ui.bk.r0(textView.getPaint(), 0.8f);
        }
        mm2.n0 n0Var = (mm2.n0) m56788xbba4bfc0(mm2.n0.class);
        java.lang.String e17 = xy2.c.e(O6());
        Z6(n0Var.Q6(e17));
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.y.o(this, null, null, new yf2.v(n0Var, e17, this, null), 3, null);
    }

    @Override // if2.b, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1484x25fe639c.p1487x2e06d1.AbstractC14196xf9d9d703
    /* renamed from: onViewUnmount */
    public void mo8999xb1ef75c(android.view.ViewGroup pluginLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginLayout, "pluginLayout");
        this.f372636i = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderStartLivePostButtonController", "onViewUnmount: Cleaning up post button");
        this.f543353m = null;
        this.f543354n = null;
        this.f543355o = null;
    }
}
