package vg2;

/* loaded from: classes3.dex */
public final class m extends com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0 {
    public final vg2.d H;
    public ce2.i I;

    /* renamed from: J, reason: collision with root package name */
    public java.lang.String f518073J;
    public android.view.View K;
    public android.widget.ImageView L;
    public android.view.View M;
    public android.widget.TextView N;
    public android.widget.ImageView P;
    public android.view.View Q;
    public com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b R;
    public vg2.e S;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(android.content.Context context, ce2.i giftInfo, vg2.d listener) {
        super(context, false, zl2.u4.f555522e, 0.0f, 10, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(giftInfo, "giftInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        this.H = listener;
        this.I = giftInfo;
        this.S = vg2.e.f518025d;
    }

    public static final void e0(vg2.m mVar) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nl nlVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nl) mVar.H;
        nlVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = nlVar.f195179a;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0 k0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k0(hmVar.f446856d.getContext(), 1, false);
        k0Var.f293405n = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ll(1, hmVar, 2);
        k0Var.f293414s = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ml(1, hmVar, 2);
        k0Var.v();
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public int A() {
        return com.p314xaae8f345.mm.R.C30864xbddafb2a.e7y;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View E(zl2.u4 uiMode) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uiMode, "uiMode");
        if (uiMode == zl2.u4.f555521d) {
            return null;
        }
        android.content.Context context = this.f199716e;
        android.app.Activity activity = context instanceof android.app.Activity ? (android.app.Activity) context : null;
        if (activity == null) {
            return null;
        }
        zl2.w4 w4Var = zl2.w4.f555550a;
        android.view.LayoutInflater layoutInflater = activity.getLayoutInflater();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(layoutInflater, "getLayoutInflater(...)");
        return w4Var.b(com.p314xaae8f345.mm.R.C30864xbddafb2a.e7y, null, false, uiMode, activity, layoutInflater);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public java.lang.String L() {
        java.lang.String str = this.I.f67809x225f1eb0;
        return str == null ? "" : str;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void N(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        d0();
        this.K = rootView.findViewById(com.p314xaae8f345.mm.R.id.u0h);
        this.L = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.f567941l45);
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) rootView.findViewById(com.p314xaae8f345.mm.R.id.vkk)).setOnClickListener(new vg2.f(this));
        ((android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.vd9)).setOnClickListener(new vg2.g(this));
        this.M = rootView.findViewById(com.p314xaae8f345.mm.R.id.u0i);
        this.N = (android.widget.TextView) rootView.findViewById(com.p314xaae8f345.mm.R.id.vfv);
        android.widget.ImageView imageView = (android.widget.ImageView) rootView.findViewById(com.p314xaae8f345.mm.R.id.utf);
        imageView.setClipToOutline(true);
        this.P = imageView;
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) rootView.findViewById(com.p314xaae8f345.mm.R.id.f565074so1)).setOnClickListener(new vg2.h(this));
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) rootView.findViewById(com.p314xaae8f345.mm.R.id.f565295st3)).setOnClickListener(new vg2.i(this));
        this.Q = rootView.findViewById(com.p314xaae8f345.mm.R.id.u0g);
        com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b c22789xd23e9a9b = (com.p314xaae8f345.mm.p2776x373aa5.C22789xd23e9a9b) rootView.findViewById(com.p314xaae8f345.mm.R.id.f567938ut4);
        c22789xd23e9a9b.m82583xcde73672(-1);
        c22789xd23e9a9b.m82584xebcf33cb(0);
        this.R = c22789xd23e9a9b;
        ((com.p314xaae8f345.mm.ui.p2747xd1075a44.p2750xade22732.C22661xa3a2b3c0) rootView.findViewById(com.p314xaae8f345.mm.R.id.f568195uz5)).setOnClickListener(new vg2.j(this));
        g0(this.I);
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public void S() {
        super.S();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nl nlVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.nl) this.H;
        nlVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm hmVar = nlVar.f195179a;
        hmVar.N1 = null;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.hm.T1(hmVar, null, null, null, 7, null);
    }

    public final void f0(vg2.e eVar) {
        if (this.S == eVar) {
            return;
        }
        this.S = eVar;
        android.view.View view = this.K;
        if (view != null) {
            int i17 = eVar == vg2.e.f518026e ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view2 = this.M;
        if (view2 != null) {
            int i18 = eVar == vg2.e.f518027f ? 0 : 8;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
            arrayList2.add(java.lang.Integer.valueOf(i18));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        android.view.View view3 = this.Q;
        if (view3 == null) {
            return;
        }
        int i19 = eVar == vg2.e.f518028g ? 0 : 8;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal3 = zj0.c.f554818a;
        arrayList3.add(java.lang.Integer.valueOf(i19));
        java.util.Collections.reverse(arrayList3);
        yj0.a.d(view3, arrayList3.toArray(), "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view3.setVisibility(((java.lang.Integer) arrayList3.get(0)).intValue());
        yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel", "setState", "(Lcom/tencent/mm/plugin/finder/live/gift/widget/FinderLiveAiGeneratedGiftPanel$State;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00f8  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g0(ce2.i r13) {
        /*
            Method dump skipped, instructions count: 285
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: vg2.m.g0(ce2.i):void");
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.e0
    public android.view.View u() {
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352 c22699x3dcdb352 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2760xcbb7be80.C22699x3dcdb352(this.f199716e);
        c22699x3dcdb352.setImageResource(com.p314xaae8f345.mm.R.raw.f79634x412ce3f1);
        c22699x3dcdb352.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f563311a82);
        c22699x3dcdb352.setRotation(90.0f);
        c22699x3dcdb352.m82040x7541828(c22699x3dcdb352.getContext().getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f77715xd67f4bc5));
        c22699x3dcdb352.setLayoutParams(new android.view.ViewGroup.LayoutParams(i65.a.b(c22699x3dcdb352.getContext(), 24), i65.a.b(c22699x3dcdb352.getContext(), 24)));
        return c22699x3dcdb352;
    }
}
