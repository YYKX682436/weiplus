package tv0;

/* loaded from: classes5.dex */
public final class d extends qv0.f {
    public final jz5.g I;

    /* renamed from: J, reason: collision with root package name */
    public final jz5.g f503717J;
    public final jz5.g K;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.I = jz5.h.b(new tv0.b(this));
        this.f503717J = jz5.h.b(new tv0.c(this));
        this.K = jz5.h.b(new tv0.a(this));
    }

    /* renamed from: getMcEditCropPlayerTime */
    private final android.widget.TextView m167075x51bc1954() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.I).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.widget.TextView) mo141623x754a37bb;
    }

    @Override // qv0.f
    public boolean D() {
        return false;
    }

    public final void K(com.p314xaae8f345.p457x3304c6.p477x633fb29.p478x3652cd.C4128x879fba0a currentTime) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(currentTime, "currentTime");
        m167075x51bc1954().setText(ou0.f.d((long) currentTime.m33987xd22e7c2d()));
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public ou0.z b() {
        return new ou0.w(true);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dvc, bodyContainerLayout);
    }

    /* renamed from: getBtnReset$plugin_mj_template_release */
    public final android.view.View m167076x672c0853() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.K).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (android.view.View) mo141623x754a37bb;
    }

    /* renamed from: getTimelineView$plugin_mj_template_release */
    public final com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d m167077xc6fe9940() {
        java.lang.Object mo141623x754a37bb = ((jz5.n) this.f503717J).mo141623x754a37bb();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo141623x754a37bb, "getValue(...)");
        return (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p892x2ea350.p893x2eba90.C10942x373bdc1d) mo141623x754a37bb;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String string = getContext().getString(com.p314xaae8f345.mm.R.C30867xcad56011.mtq);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        return string;
    }
}
