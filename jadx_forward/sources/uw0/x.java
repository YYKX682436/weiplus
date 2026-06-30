package uw0;

/* loaded from: classes5.dex */
public final class x extends ov0.a {
    public final jz5.g A1;
    public final lv0.c B1;
    public uw0.p C1;
    public uw0.q D1;
    public final pw0.b E1;

    /* renamed from: y1, reason: collision with root package name */
    public final float f513155y1;

    /* renamed from: z1, reason: collision with root package name */
    public final int f513156z1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f513155y1 = j65.q.a(context).getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        this.f513156z1 = j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f562094al1);
        this.A1 = jz5.h.b(new uw0.v(context, this));
        this.B1 = new lv0.c(j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv), j65.q.a(context).getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561205c9), 0, 0, 0, null, 56, null);
        this.D1 = uw0.q.f513127e;
        this.E1 = new pw0.b(new uw0.u(this));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getInitTranslationY */
    public final float m170642x410a6c6e() {
        return ((getHeight() - m157196xda5977e().getHeight()) - this.f513156z1) + this.f513155y1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: getRecommendTitleView */
    public final android.view.View m170643xc24d69b7() {
        return (android.view.View) ((jz5.n) this.A1).mo141623x754a37bb();
    }

    @Override // ov0.t
    public void L() {
        m157201xabe4ee33().setVisibility(8);
    }

    @Override // ov0.t
    public void O() {
        super.O();
        if (uw0.q.f513126d == this.D1) {
            U();
        }
    }

    @Override // ov0.t
    public void P() {
        super.P();
        if (uw0.q.f513126d == this.D1) {
            V();
        }
    }

    public final void U() {
        m170643xc24d69b7().animate().translationY(m170642x410a6c6e() - this.f513155y1).alpha(1.0f).setDuration(200L).withStartAction(new uw0.r(this)).start();
    }

    public final void V() {
        m170642x410a6c6e();
        m170643xc24d69b7().animate().translationY(m170642x410a6c6e()).alpha(0.0f).setDuration(200L).withEndAction(new uw0.s(this)).start();
    }

    public final void W(tw0.b result) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        if (getHeight() <= 0) {
            post(new uw0.w(this, result));
            return;
        }
        if (!result.f503950a) {
            this.D1 = uw0.q.f513127e;
            V();
        } else if (this.D1 == uw0.q.f513127e) {
            this.D1 = uw0.q.f513126d;
            U();
        }
        java.util.LinkedList linkedList = result.f503951b;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(linkedList, 10));
        java.util.Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            arrayList.add(new sw0.a((r45.ol5) it.next(), false));
        }
        this.E1.y(arrayList);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y
    /* renamed from: getEditTextMaxLineOnExpand */
    public int mo47102x5193cd64() {
        return 1;
    }

    @Override // ov0.t, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        super.p();
        android.view.View m170643xc24d69b7 = m170643xc24d69b7();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m170643xc24d69b7, "<get-recommendTitleView>(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m170643xc24d69b7, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel", "onAttached", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m170643xc24d69b7.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m170643xc24d69b7, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/text/subpanels/ComposingAddTitlePanel", "onAttached", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(m170643xc24d69b7());
        post(new uw0.t(this));
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) m170643xc24d69b7().findViewById(com.p314xaae8f345.mm.R.id.rwq);
        c1163xf1deaba4.mo7960x6cab2c8d(this.E1);
        c1163xf1deaba4.mo7967x900dcbe1(new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(getContext(), 0, false));
        if (c1163xf1deaba4.m7950x883dc776() <= 0) {
            c1163xf1deaba4.N(this.B1);
        }
    }

    /* renamed from: setRecommendTitleSelector */
    public final void m170644xd7ade5fd(uw0.p selector) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(selector, "selector");
        this.C1 = selector;
    }

    /* renamed from: setTextFilter$plugin_mj_template_release */
    public final void m170645xa01a4a55(android.text.InputFilter filter) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(filter, "filter");
        m157199xdb574fcd().setFilters(new android.text.InputFilter[]{filter});
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.y, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void t() {
        android.view.ViewParent parent = m170643xc24d69b7().getParent();
        android.view.ViewGroup viewGroup = parent instanceof android.view.ViewGroup ? (android.view.ViewGroup) parent : null;
        if (viewGroup != null) {
            viewGroup.removeView(m170643xc24d69b7());
        }
        m170643xc24d69b7().clearAnimation();
        this.D1 = uw0.q.f513127e;
        this.C1 = null;
        super.t();
    }
}
