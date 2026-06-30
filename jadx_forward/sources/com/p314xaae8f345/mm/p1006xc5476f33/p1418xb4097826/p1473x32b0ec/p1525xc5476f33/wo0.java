package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes2.dex */
public final class wo0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f196517d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 f196518e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f196519f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f196520g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.a f196521h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wo0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var, android.view.View view, android.graphics.Rect rect, yz5.a aVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f196518e = ep0Var;
        this.f196519f = view;
        this.f196520g = rect;
        this.f196521h = aVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wo0(this.f196518e, this.f196519f, this.f196520g, this.f196521h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.wo0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f196517d;
        android.graphics.Rect rect = this.f196520g;
        android.view.View view = this.f196519f;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ep0 ep0Var = this.f196518e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f196517d = 1;
            ep0Var.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            v65.n nVar = new v65.n(rVar);
            android.graphics.Path path = new android.graphics.Path();
            path.moveTo(0.0f, 0.0f);
            path.cubicTo(0.25f, 0.1f, 0.25f, 0.1f, 1.0f, 1.0f);
            android.view.animation.PathInterpolator pathInterpolator = new android.view.animation.PathInterpolator(path);
            android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.hhb);
            android.view.View findViewById2 = view.findViewById(com.p314xaae8f345.mm.R.id.u49);
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(findViewById2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            int intValue = ((java.lang.Integer) arrayList.get(0)).intValue();
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            arrayList2.add(java.lang.Integer.valueOf(intValue));
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(findViewById2, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            findViewById2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            yj0.a.f(findViewById2, "com/tencent/mm/plugin/finder/live/plugin/IFinderLivePromoteItem", "hideBubbleAnim", "(Landroid/view/View;Landroid/graphics/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "android/view/View_EXEC_", "setVisibility", "(I)V");
            android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(1.0f, 0.3f);
            ofFloat.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.qo0(view, rect));
            android.animation.ObjectAnimator ofFloat2 = android.animation.ObjectAnimator.ofFloat(findViewById, "alpha", 1.0f, 0.0f);
            android.animation.AnimatorSet animatorSet = new android.animation.AnimatorSet();
            animatorSet.playTogether(ofFloat, ofFloat2);
            animatorSet.setInterpolator(pathInterpolator);
            animatorSet.setDuration(333L);
            animatorSet.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.ro0(nVar));
            animatorSet.start();
            java.lang.Object j17 = rVar.j();
            if (j17 != aVar) {
                j17 = f0Var;
            }
            if (j17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                this.f196521h.mo152xb9724478();
                return f0Var;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        this.f196517d = 2;
        ep0Var.getClass();
        p3325xe03a0797.p3326xc267989b.r rVar2 = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
        rVar2.k();
        v65.n nVar2 = new v65.n(rVar2);
        android.graphics.Path path2 = new android.graphics.Path();
        path2.moveTo(0.0f, 0.0f);
        path2.cubicTo(0.25f, 0.1f, 0.25f, 0.1f, 1.0f, 1.0f);
        android.view.animation.PathInterpolator pathInterpolator2 = new android.view.animation.PathInterpolator(path2);
        android.view.View findViewById3 = view.findViewById(com.p314xaae8f345.mm.R.id.hal);
        android.animation.ObjectAnimator ofFloat3 = android.animation.ObjectAnimator.ofFloat(view.findViewById(com.p314xaae8f345.mm.R.id.u49), "alpha", 1.0f, 0.0f);
        android.animation.ValueAnimator ofFloat4 = android.animation.ValueAnimator.ofFloat(0.3f, 0.0f);
        ofFloat4.addUpdateListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.so0(view, rect, findViewById3));
        android.animation.AnimatorSet animatorSet2 = new android.animation.AnimatorSet();
        animatorSet2.playTogether(ofFloat3, ofFloat4);
        animatorSet2.setInterpolator(pathInterpolator2);
        animatorSet2.setDuration(666L);
        animatorSet2.addListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.to0(nVar2));
        animatorSet2.start();
        java.lang.Object j18 = rVar2.j();
        if (j18 != aVar) {
            j18 = f0Var;
        }
        if (j18 == aVar) {
            return aVar;
        }
        this.f196521h.mo152xb9724478();
        return f0Var;
    }
}
