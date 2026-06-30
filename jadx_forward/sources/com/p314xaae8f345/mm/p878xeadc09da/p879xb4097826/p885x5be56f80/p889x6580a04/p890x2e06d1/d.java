package com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1;

/* loaded from: classes5.dex */
public final class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 f150762d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Rect f150763e;

    public d(com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6, android.graphics.Rect rect) {
        this.f150762d = abstractC10936x89d53ec6;
        this.f150763e = rect;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        boolean z17;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel$initOutside$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        float x17 = motionEvent.getX();
        float y17 = motionEvent.getY();
        com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.AbstractC10936x89d53ec6 abstractC10936x89d53ec6 = this.f150762d;
        android.widget.LinearLayout linearLayout = abstractC10936x89d53ec6.f150745o;
        android.graphics.Rect rect = this.f150763e;
        linearLayout.getHitRect(rect);
        if (rect.contains((int) x17, (int) y17)) {
            z17 = abstractC10936x89d53ec6.isShown();
        } else if (abstractC10936x89d53ec6.n(motionEvent)) {
            z17 = false;
        } else {
            if (abstractC10936x89d53ec6.m() && motionEvent.getAction() == 1) {
                com.p314xaae8f345.mm.p878xeadc09da.p879xb4097826.p885x5be56f80.p889x6580a04.p890x2e06d1.q.a(abstractC10936x89d53ec6, false, false, 3, null);
            }
            z17 = true;
        }
        yj0.a.i(z17, this, "com/tencent/mm/mj_publisher/finder/movie_composing/panel/base/BaseComposingPanel$initOutside$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
