package ym5;

/* loaded from: classes10.dex */
public final class n6 extends ym5.h {

    /* renamed from: x, reason: collision with root package name */
    public float f544982x;

    @Override // ym5.h
    public bn5.f a() {
        android.content.Context context = getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        l45.q m177317xc879b3f2 = m177317xc879b3f2();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m177317xc879b3f2, "getPresenter(...)");
        return new bn5.o(context, m177317xc879b3f2);
    }

    @Override // ym5.h
    public dn5.c b() {
        return new dn5.h(getContext(), m177317xc879b3f2());
    }

    @Override // ym5.h
    public void d() {
        ((l45.n) m177317xc879b3f2()).m(m177314x1456a638());
        removeAllViews();
        mo177319xb073c692();
        this.f544982x = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274608e.getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561247d7);
        android.view.ViewGroup.LayoutParams layoutParams = mo177318xd03217ea().getLayoutParams();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
        android.widget.FrameLayout.LayoutParams layoutParams2 = (android.widget.FrameLayout.LayoutParams) layoutParams;
        layoutParams2.gravity = 81;
        layoutParams2.bottomMargin = (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561271dv);
        android.view.View mo177318xd03217ea = mo177318xd03217ea();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(8);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(mo177318xd03217ea, arrayList.toArray(), "com/tencent/mm/view/VideoCoverDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177318xd03217ea.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(mo177318xd03217ea, "com/tencent/mm/view/VideoCoverDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        addView(mo177318xd03217ea(), layoutParams2);
        addView(m177310x5143ab24(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.widget.FrameLayout.LayoutParams layoutParams3 = new android.widget.FrameLayout.LayoutParams(-1, (int) getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f561944x6));
        layoutParams3.gravity = 80;
        addView(m177316x936200b6(), layoutParams3);
        addView(m177311xc3ab3d87(), layoutParams3);
        addView(mo177319xb073c692(), new android.widget.FrameLayout.LayoutParams(-1, -1));
        android.view.View mo177319xb073c692 = mo177319xb073c692();
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        arrayList2.add(8);
        java.util.Collections.reverse(arrayList2);
        yj0.a.d(mo177319xb073c692, arrayList2.toArray(), "com/tencent/mm/view/VideoCoverDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        mo177319xb073c692.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
        yj0.a.f(mo177319xb073c692, "com/tencent/mm/view/VideoCoverDrawingView", com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20537xdb4c7a82, "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        android.widget.FrameLayout.LayoutParams layoutParams4 = new android.widget.FrameLayout.LayoutParams(-1, qk.w9.a(getContext()));
        layoutParams4.gravity = 80;
        layoutParams4.bottomMargin += com.p314xaae8f345.mm.ui.bl.c(getContext());
        m177311xc3ab3d87().setVisibility(8);
        l45.q m177317xc879b3f2 = m177317xc879b3f2();
        if (m177317xc879b3f2 != null) {
            dl.y yVar = (dl.y) ((l45.n) m177317xc879b3f2).d(qk.g6.TEXT);
            if (yVar != null) {
                yVar.C = true;
                yVar.G = true;
            }
        }
    }

    @Override // ym5.h
    /* renamed from: getFeatures */
    public qk.g6[] mo177315x6a8721b3() {
        if (this.f544880g == null) {
            this.f544880g = new qk.g6[]{qk.g6.TEXT};
        }
        qk.g6[] mFeaturesTypes = this.f544880g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mFeaturesTypes, "mFeaturesTypes");
        return mFeaturesTypes;
    }

    @Override // ym5.h
    /* renamed from: getRubbishView */
    public android.view.View mo177318xd03217ea() {
        if (this.f544884n == null) {
            this.f544885o = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3a, (android.view.ViewGroup) this, false);
        }
        android.view.View mRubbishView = this.f544885o;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mRubbishView, "mRubbishView");
        return mRubbishView;
    }

    @Override // ym5.h
    /* renamed from: getTextEditView */
    public android.view.View mo177319xb073c692() {
        if (this.f544884n == null) {
            android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.d3_, (android.view.ViewGroup) null);
            this.f544884n = inflate;
            android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.o4a);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById, "null cannot be cast to non-null type com.tencent.mm.view.PhotoEditText");
            this.f544890t = (com.p314xaae8f345.mm.p2776x373aa5.C22795x96919289) findViewById;
            android.view.View findViewById2 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.d6w);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById2, "null cannot be cast to non-null type android.widget.Button");
            this.f544888r = (android.widget.Button) findViewById2;
            android.view.View findViewById3 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.d6s);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById3, "null cannot be cast to non-null type android.widget.Button");
            this.f544889s = (android.widget.Button) findViewById3;
            android.view.View findViewById4 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.mii);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById4, "null cannot be cast to non-null type com.tencent.mm.view.footer.SelectColorBar");
            com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec c22825xd78e1eec = (com.p314xaae8f345.mm.p2776x373aa5.p2779xb45eb59b.C22825xd78e1eec) findViewById4;
            this.f544890t.setTextColor(-1);
            android.view.View findViewById5 = this.f544884n.findViewById(com.p314xaae8f345.mm.R.id.agw);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(findViewById5, "null cannot be cast to non-null type com.tencent.mm.view.TextModeSelectView");
            com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671 viewOnClickListenerC22813xf4f26671 = (com.p314xaae8f345.mm.p2776x373aa5.ViewOnClickListenerC22813xf4f26671) findViewById5;
            this.f544891u = viewOnClickListenerC22813xf4f26671;
            viewOnClickListenerC22813xf4f26671.setTag(-707825);
            this.f544891u.m82780x764d6925(kz5.c0.i(1, 2, 3));
            this.f544891u.m82783x2e12cc09(kz5.c1.k(new jz5.l(1, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79923x9ef675da)), new jz5.l(2, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79924x9ef675db)), new jz5.l(3, java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79925x9ef675dc))));
            this.f544891u.setColorFilter(-1);
            this.f544891u.m82781xea565d09(new ym5.h6(c22825xd78e1eec, this));
            c22825xd78e1eec.m82874x7b868205(-1);
            c22825xd78e1eec.m82875x8f51d5d9(new ym5.i6(this));
            this.f544888r.setOnClickListener(new ym5.j6(this));
            this.f544889s.setOnClickListener(new ym5.k6(this));
            this.f544884n.setOnClickListener(ym5.l6.f544967d);
        }
        android.view.View mTextEditView = this.f544884n;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mTextEditView, "mTextEditView");
        return mTextEditView;
    }
}
