package al5;

/* loaded from: classes4.dex */
public final class u3 {
    public u3(p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
    }

    public static void c(al5.u3 u3Var, android.content.Context context, android.view.View contentView, android.view.View touchView, al5.a4 longPressListener, al5.v3 v3Var, al5.x3 x3Var, al5.w3 w3Var, int i17, java.lang.Object obj) {
        al5.v3 v3Var2 = (i17 & 16) != 0 ? null : v3Var;
        al5.x3 x3Var2 = (i17 & 32) != 0 ? null : x3Var;
        al5.w3 w3Var2 = (i17 & 64) == 0 ? w3Var : null;
        u3Var.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchView, "touchView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longPressListener, "longPressListener");
        com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d scaleGestureDetectorOnScaleGestureListenerC22653x4730490d = new com.p314xaae8f345.mm.ui.p2747xd1075a44.ScaleGestureDetectorOnScaleGestureListenerC22653x4730490d(context);
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.c(contentView, true);
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81476x4cd678a4(new al5.s3(scaleGestureDetectorOnScaleGestureListenerC22653x4730490d, touchView, v3Var2, x3Var2));
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81483xbb7f6adc(new al5.t3(w3Var2, scaleGestureDetectorOnScaleGestureListenerC22653x4730490d, touchView, v3Var2, x3Var2));
        scaleGestureDetectorOnScaleGestureListenerC22653x4730490d.m81479xe15240b9(longPressListener);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final db5.e7 a(android.view.View rootView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(rootView, "rootView");
        if (!(rootView instanceof android.view.ViewGroup)) {
            if (rootView instanceof db5.e7) {
                return (db5.e7) rootView;
            }
            return null;
        }
        java.util.LinkedList linkedList = new java.util.LinkedList();
        linkedList.add(rootView);
        while (!linkedList.isEmpty()) {
            java.lang.Object pollFirst = linkedList.pollFirst();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(pollFirst, "pollFirst(...)");
            android.view.View view = (android.view.View) pollFirst;
            if (view instanceof android.view.ViewGroup) {
                android.view.ViewGroup viewGroup = (android.view.ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i17 = 0; i17 < childCount; i17++) {
                    android.view.KeyEvent.Callback childAt = viewGroup.getChildAt(i17);
                    if (childAt instanceof android.view.ViewGroup) {
                        linkedList.addLast(childAt);
                    } else if (childAt instanceof db5.e7) {
                        return (db5.e7) childAt;
                    }
                }
            }
        }
        return null;
    }

    public final void b(android.content.Context context, android.view.View contentView, android.view.View touchView, al5.a4 longPressListener, al5.v3 v3Var, al5.x3 x3Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(contentView, "contentView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(touchView, "touchView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(longPressListener, "longPressListener");
        c(this, context, contentView, touchView, longPressListener, v3Var, x3Var, null, 64, null);
    }
}
