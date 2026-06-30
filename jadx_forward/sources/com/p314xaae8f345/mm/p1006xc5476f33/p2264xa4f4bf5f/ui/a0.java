package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class a0 extends android.view.GestureDetector.SimpleOnGestureListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e f255239d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f255240e;

    public a0(com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e, android.content.Context context) {
        this.f255239d = c18612x3f06d82e;
        this.f255240e = context;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public boolean onContextClick(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onContextClick = super.onContextClick(motionEvent);
        yj0.a.i(onContextClick, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onContextClick", "(Landroid/view/MotionEvent;)Z");
        return onContextClick;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onDoubleTap(android.view.MotionEvent e17) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(e17);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongTextView", "onDoubleTap: ");
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255239d.c(), java.lang.Boolean.TRUE)) {
            qj4.s.m(qj4.s.f445491a, this.f255240e, 86L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
        }
        boolean onDoubleTap = super.onDoubleTap(e17);
        yj0.a.i(onDoubleTap, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onDoubleTap", "(Landroid/view/MotionEvent;)Z");
        return onDoubleTap;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onDown(android.view.MotionEvent e17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public void onLongPress(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V", this, array);
        super.onLongPress(motionEvent);
        yj0.a.h(this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", if1.m.f69928x24728b, "(Landroid/view/MotionEvent;)V");
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public boolean onSingleTapConfirmed(android.view.MotionEvent e17) {
        java.lang.Boolean valueOf;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(e17, "e");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LongTextView", "onSingleTapUp: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.C18612x3f06d82e c18612x3f06d82e = this.f255239d;
        bk4.c2 textviewSuffixWrapper = c18612x3f06d82e.getTextviewSuffixWrapper();
        if (textviewSuffixWrapper != null && textviewSuffixWrapper.f102962t) {
            bk4.c2 textviewSuffixWrapper2 = c18612x3f06d82e.getTextviewSuffixWrapper();
            if (textviewSuffixWrapper2 != null) {
                textviewSuffixWrapper2.f102962t = false;
            }
        } else {
            bk4.c2 c2Var = c18612x3f06d82e.textviewSuffixWrapper;
            if (c2Var == null) {
                valueOf = null;
            } else {
                valueOf = java.lang.Boolean.valueOf(c2Var.f102956n);
            }
            boolean b17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(valueOf, java.lang.Boolean.TRUE);
            qj4.s sVar = qj4.s.f445491a;
            if (b17) {
                bk4.c2 c2Var2 = c18612x3f06d82e.textviewSuffixWrapper;
                if (c2Var2 != null) {
                    if (c2Var2.f102946d <= c18612x3f06d82e.maxLineCount) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("LongTextView", "textViewOnClick: can't click textview , fullTextLineCount:" + c2Var2.f102946d + "  maxLineCount:" + c18612x3f06d82e.maxLineCount);
                    } else if (c18612x3f06d82e.b(true)) {
                        android.content.Context context = c18612x3f06d82e.getContext();
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
                        qj4.s.m(sVar, context, 82L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
                    }
                }
            } else {
                android.content.Context context2 = c18612x3f06d82e.getContext();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context2, "getContext(...)");
                qj4.s.m(sVar, context2, 84L, null, null, 0L, 0L, 0L, 0L, null, null, 0L, 2044, null);
                c18612x3f06d82e.a(true);
            }
        }
        return super.onSingleTapUp(e17);
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public boolean onSingleTapUp(android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z", this, array);
        boolean onSingleTapUp = super.onSingleTapUp(motionEvent);
        yj0.a.i(onSingleTapUp, this, "com/tencent/mm/plugin/textstatus/ui/LongTextView$mGestureDetector$1", "android/view/GestureDetector$SimpleOnGestureListener", "onSingleTapUp", "(Landroid/view/MotionEvent;)Z");
        return onSingleTapUp;
    }
}
