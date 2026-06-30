package xv0;

/* loaded from: classes5.dex */
public final class g extends com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l {

    /* renamed from: J, reason: collision with root package name */
    public yz5.p f538916J;
    public yz5.a K;
    public yz5.a L;
    public android.view.ViewGroup M;
    public com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc N;
    public android.widget.TextView P;
    public android.view.ViewGroup Q;
    public android.view.View R;
    public android.view.View S;
    public xv0.a T;
    public java.util.List U;
    public final pp0.l0 V;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(android.content.Context context, ex0.r focusedSegmentVM) {
        super(context, focusedSegmentVM);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(focusedSegmentVM, "focusedSegmentVM");
        this.V = (pp0.l0) i95.n0.c(pp0.l0.class);
    }

    public final void K() {
        boolean z17;
        android.view.View view = this.S;
        if (view == null) {
            return;
        }
        java.util.List list = this.U;
        if (list == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("colorAdjItems");
            throw null;
        }
        if (!list.isEmpty()) {
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                z17 = true;
                if (java.lang.Float.compare(((xv0.a) it.next()).f538906d, (float) 0) != 0) {
                    break;
                }
            }
        }
        z17 = false;
        int i17 = z17 ? 0 : 8;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel", "updateResetButtonState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/clip/subpanels/color/ColorAdjPanel", "updateResetButtonState", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final void L(float f17) {
        if (java.lang.Float.compare(f17, 0.0f) == 0) {
            android.widget.TextView textView = this.P;
            if (textView != null) {
                textView.setText("0");
                return;
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intensityTv");
                throw null;
            }
        }
        android.widget.TextView textView2 = this.P;
        if (textView2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("intensityTv");
            throw null;
        }
        java.lang.String format = java.lang.String.format("%+d", java.util.Arrays.copyOf(new java.lang.Object[]{java.lang.Integer.valueOf((int) (f17 * 100))}, 1));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(format, "format(...)");
        textView2.setText(format);
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q
    public void c(android.content.Context context, android.widget.FrameLayout bodyContainerLayout) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bodyContainerLayout, "bodyContainerLayout");
        com.p314xaae8f345.mm.ui.id.b(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.dfw, bodyContainerLayout);
    }

    /* renamed from: getOnApplyToAllButtonClicked */
    public final yz5.a m176030x2c77c188() {
        return this.K;
    }

    /* renamed from: getOnResetButtonClicked */
    public final yz5.a m176031x1454bc3b() {
        return this.L;
    }

    /* renamed from: getOnValueChangedCallback */
    public final yz5.p m176032xd0fbfcdd() {
        return this.f538916J;
    }

    @Override // qv0.f
    /* renamed from: getToolbarTitle */
    public java.lang.String mo11426x7c1b2e13() {
        java.lang.String r17 = i65.a.r(getContext(), com.p314xaae8f345.mm.R.C30867xcad56011.f574021ll1);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r17, "getString(...)");
        return r17;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.l, com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void p() {
        super.p();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.z.b(this, this.R, null);
        yy0.m7 m7Var = (yy0.m7) this.V;
        p3325xe03a0797.p3326xc267989b.l.d(m7Var.Di(), null, null, new yy0.e3(m7Var, null), 3, null);
    }

    /* renamed from: setOnApplyToAllButtonClicked */
    public final void m176033x764419fc(yz5.a aVar) {
        this.K = aVar;
    }

    /* renamed from: setOnResetButtonClicked */
    public final void m176034x8ea7eb47(yz5.a aVar) {
        this.L = aVar;
    }

    /* renamed from: setOnValueChangedCallback */
    public final void m176035x33f98e9(yz5.p pVar) {
        this.f538916J = pVar;
    }

    @Override // com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6
    public void u(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q panel) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(panel, "panel");
        android.view.View findViewById = findViewById(com.p314xaae8f345.mm.R.id.q7k);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.M = (android.view.ViewGroup) findViewById;
        android.view.View findViewById2 = findViewById(com.p314xaae8f345.mm.R.id.q7j);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById2, "findViewById(...)");
        this.N = (com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p902x4fe3eeaf.C10956x6271c3cc) findViewById2;
        android.view.View findViewById3 = findViewById(com.p314xaae8f345.mm.R.id.q7l);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById3, "findViewById(...)");
        this.P = (android.widget.TextView) findViewById3;
        android.view.View findViewById4 = findViewById(com.p314xaae8f345.mm.R.id.q3x);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById4, "findViewById(...)");
        this.Q = (android.view.ViewGroup) findViewById4;
        this.R = findViewById(com.p314xaae8f345.mm.R.id.q3i);
        this.S = findViewById(com.p314xaae8f345.mm.R.id.q3o);
        android.view.ViewGroup viewGroup = this.M;
        if (viewGroup == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbarContainer");
            throw null;
        }
        viewGroup.setVisibility(4);
        android.view.ViewGroup viewGroup2 = this.M;
        if (viewGroup2 == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("seekbarContainer");
            throw null;
        }
        viewGroup2.setEnabled(false);
        xv0.b[] m176029xcee59d22 = xv0.b.m176029xcee59d22();
        java.util.ArrayList arrayList = new java.util.ArrayList(m176029xcee59d22.length);
        for (xv0.b bVar : m176029xcee59d22) {
            int h17 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561256df);
            int h18 = i65.a.h(getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561204c8);
            android.widget.LinearLayout linearLayout = new android.widget.LinearLayout(getContext());
            linearLayout.setTag(bVar);
            android.widget.LinearLayout.LayoutParams layoutParams = new android.widget.LinearLayout.LayoutParams(h17, -2);
            linearLayout.setOrientation(1);
            layoutParams.setMarginStart(h18);
            layoutParams.setMarginEnd(h18);
            linearLayout.setLayoutParams(layoutParams);
            linearLayout.setGravity(1);
            android.widget.ImageView imageView = new android.widget.ImageView(linearLayout.getContext());
            imageView.setLayoutParams(new android.widget.LinearLayout.LayoutParams(h17, h17));
            imageView.setImageResource(bVar.f538909e);
            imageView.setScaleType(android.widget.ImageView.ScaleType.CENTER);
            imageView.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.b4o);
            linearLayout.addView(imageView);
            android.widget.TextView textView = new android.widget.TextView(linearLayout.getContext());
            android.widget.LinearLayout.LayoutParams layoutParams2 = new android.widget.LinearLayout.LayoutParams(-2, -2);
            layoutParams2.topMargin = i65.a.h(textView.getContext(), com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
            textView.setLayoutParams(layoutParams2);
            textView.setText(bVar.f538908d);
            textView.setTextColor(i65.a.d(textView.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.ac_));
            textView.setTextSize(1, 12.0f);
            linearLayout.addView(textView);
            android.widget.TextView textView2 = new android.widget.TextView(getContext());
            textView2.setTextColor(i65.a.d(textView2.getContext(), com.p314xaae8f345.mm.R.C30859x5a72f63.ac9));
            textView2.setTextSize(1, 10.0f);
            textView2.setLayoutParams(new android.widget.LinearLayout.LayoutParams(-2, -2));
            linearLayout.addView(textView2);
            arrayList.add(new xv0.a(bVar, 0.0f, linearLayout, textView2));
        }
        this.U = arrayList;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            xv0.a aVar = (xv0.a) it.next();
            android.view.ViewGroup viewGroup3 = this.Q;
            if (viewGroup3 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("itemContainer");
                throw null;
            }
            viewGroup3.addView(aVar.f538904b);
            aVar.f538904b.setOnClickListener(new xv0.d(this, aVar));
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4190xd8dd3713 c4190xd8dd3713 = m47093x8ee49ae9().f338700a;
            com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = c4190xd8dd3713 instanceof com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 ? (com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3) c4190xd8dd3713 : null;
            if (c4181x2248e1a3 != null) {
                int ordinal = aVar.f538903a.ordinal();
                if (ordinal == 0) {
                    aVar.a(c4181x2248e1a3.p1());
                } else if (ordinal == 1) {
                    aVar.a(c4181x2248e1a3.r1());
                } else if (ordinal == 2) {
                    aVar.a(c4181x2248e1a3.t1());
                } else if (ordinal == 3) {
                    aVar.a(c4181x2248e1a3.w1());
                } else if (ordinal == 4) {
                    aVar.a(c4181x2248e1a3.y1());
                } else if (ordinal == 5) {
                    aVar.a(c4181x2248e1a3.u1());
                }
            }
        }
        android.view.View view = this.R;
        if (view != null) {
            view.setOnClickListener(new xv0.e(this));
        }
        android.view.View view2 = this.S;
        if (view2 != null) {
            view2.setOnClickListener(new xv0.f(this));
        }
        K();
    }
}
