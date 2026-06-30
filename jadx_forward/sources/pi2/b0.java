package pi2;

/* loaded from: classes10.dex */
public final class b0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final zh2.c H;
    public final yz5.p I;

    /* renamed from: J, reason: collision with root package name */
    public pi2.c0 f436298J;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(android.content.Context context, zh2.c pluginAbility, yz5.p notifyViewClick) {
        super(context, false, null, 0.6666667f, 6, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyViewClick, "notifyViewClick");
        this.H = pluginAbility;
        this.I = notifyViewClick;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.dry;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String string = this.f199716e.getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.f573199ml5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        this.f436298J = new pi2.c0(rootView, this.H, new pi2.a0(this));
        a0(this.f199716e.getDrawable(com.p314xaae8f345.mm.R.C30861xcebc809e.clh));
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        pi2.c0 c0Var = this.f436298J;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micModeWidget");
            throw null;
        }
        c0Var.h();
        super.S();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void U() {
        pi2.c0 c0Var = this.f436298J;
        if (c0Var == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micModeWidget");
            throw null;
        }
        if (c0Var.i()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0.t(this, false, 1, null);
            pi2.c0 c0Var2 = this.f436298J;
            if (c0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micModeWidget");
                throw null;
            }
            java.lang.Boolean valueOf = java.lang.Boolean.valueOf(c0Var2.f418849r.f292896x);
            pi2.c0 c0Var3 = this.f436298J;
            if (c0Var3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("micModeWidget");
                throw null;
            }
            this.I.mo149xb9724478(valueOf, c0Var3.f418852u);
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View v() {
        return x();
    }
}
