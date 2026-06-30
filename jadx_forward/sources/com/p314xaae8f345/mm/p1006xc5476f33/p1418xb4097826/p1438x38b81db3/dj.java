package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class dj implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj f184691d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.n1 f184692e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ in5.s0 f184693f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 f184694g;

    public dj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar, so2.n1 n1Var, in5.s0 s0Var, com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725) {
        this.f184691d = ojVar;
        this.f184692e = n1Var;
        this.f184693f = s0Var;
        this.f184694g = c19792x256d2725;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        boolean z17;
        java.lang.String str;
        p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsRecommendClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        if (currentTimeMillis - qd2.h.f443300a >= 500) {
            z17 = false;
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderFastClickHandler", "[isFastClick] true, currentClickTime:" + currentTimeMillis + ", lastClickTime:" + qd2.h.f443300a);
            z17 = true;
        }
        qd2.h.f443300a = currentTimeMillis;
        if (z17) {
            yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsRecommendClick$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.oj ojVar = this.f184691d;
        cw2.da daVar = ojVar.C;
        if (daVar != null) {
            daVar.mo58788x65825f6();
        }
        i95.m c17 = i95.n0.c(cq.k.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70 t70Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a;
        boolean booleanValue = ((java.lang.Boolean) ((lb2.j) ((jz5.n) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.Ne).mo141623x754a37bb()).r()).booleanValue();
        so2.n1 n1Var = this.f184692e;
        in5.s0 s0Var = this.f184693f;
        if (booleanValue || n1Var.f2()) {
            str = "(Landroid/view/View;)V";
            android.content.Context context = s0Var.f374654e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            ojVar.z(context, this.f184694g, n1Var.f2());
        } else {
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19792x256d2725 c19792x256d2725 = this.f184694g;
            ojVar.getClass();
            android.view.View inflate = com.p314xaae8f345.mm.ui.id.b(s0Var.f374654e).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f570622ee5, (android.view.ViewGroup) null);
            android.content.Context context2 = s0Var.f374654e;
            float dimension = context2.getResources().getDimension(com.p314xaae8f345.mm.R.C30860x5b28f31.f562028ap3);
            android.view.Window window = ojVar.f185717f.getF204176d().getWindow();
            android.view.View decorView = window != null ? window.getDecorView() : null;
            android.view.ViewGroup viewGroup = decorView instanceof android.view.ViewGroup ? (android.view.ViewGroup) decorView : null;
            if (viewGroup == null) {
                str = "(Landroid/view/View;)V";
            } else {
                p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
                gx2.a aVar = new gx2.a();
                aVar.f358870c = dimension;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(inflate);
                aVar.f358872e = new hx2.c(inflate);
                aVar.f358871d = new hx2.g(context2, 0, 0, 0, false, false, 62, null);
                aVar.f358873f = new hx2.b(context2, true);
                gx2.q b17 = aVar.b(viewGroup);
                android.view.View findViewById = inflate.findViewById(com.p314xaae8f345.mm.R.id.c_x);
                if (findViewById != null) {
                    str = "(Landroid/view/View;)V";
                    c0Var = c0Var2;
                    findViewById.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.fj(ojVar, s0Var, c19792x256d2725, c0Var2, b17));
                    hc2.v0.e(findViewById, "set_entrance_open", 8, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.gj(ojVar), 60, null);
                } else {
                    str = "(Landroid/view/View;)V";
                    c0Var = c0Var2;
                }
                android.view.View findViewById2 = inflate.findViewById(com.p314xaae8f345.mm.R.id.b5w);
                if (findViewById2 != null) {
                    findViewById2.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.hj(b17));
                    hc2.v0.e(findViewById2, "set_entrance_unopen", 8, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.ij(ojVar), 60, null);
                }
                hc2.v0.e(inflate, "set_entrance_popup", 32, 0, false, false, null, new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.jj(ojVar), 60, null);
                b17.m132480x7ba98ee6(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kj(c0Var, ojVar));
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.p1664xb118f8f1.AbstractGestureDetectorOnGestureListenerC15396x3fa945f1.m(b17, false, 1, null);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/convert/FinderFeedPlaceHolderConvert$setupRelJumpTipsRecommendClick$1", "android/view/View$OnClickListener", "onClick", str);
    }
}
