package il5;

/* loaded from: classes15.dex */
public abstract class c {
    public static boolean a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        float x17;
        float f17;
        float y17;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            for (java.lang.Object obj : (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class)) {
                spannable.removeSpan(obj);
            }
            spannable.setSpan(new il5.b(motionEvent.getX(), motionEvent.getY(), viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY()), 0, 0, 17);
            return true;
        }
        if (actionMasked == 1) {
            il5.b[] bVarArr = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            for (il5.b bVar : bVarArr) {
                spannable.removeSpan(bVar);
            }
            return bVarArr.length > 0 && bVarArr[0].f373685i;
        }
        if (actionMasked == 2) {
            il5.b[] bVarArr2 = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            if (bVarArr2.length > 0) {
                if (!bVarArr2[0].f373684h) {
                    float scaledTouchSlop = android.view.ViewConfiguration.get(viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext()).getScaledTouchSlop();
                    if (java.lang.Math.abs(motionEvent.getX() - bVarArr2[0].f373680d) >= scaledTouchSlop || java.lang.Math.abs(motionEvent.getY() - bVarArr2[0].f373681e) >= scaledTouchSlop) {
                        bVarArr2[0].f373684h = true;
                    }
                }
                il5.b bVar2 = bVarArr2[0];
                if (bVar2.f373684h) {
                    bVar2.f373685i = true;
                    if (((motionEvent.getMetaState() & 1) == 0 && android.text.method.MetaKeyKeyListener.getMetaState(spannable, 1) != 1 && android.text.method.MetaKeyKeyListener.getMetaState(spannable, 2048) == 0) ? false : true) {
                        x17 = motionEvent.getX() - bVarArr2[0].f373680d;
                        f17 = motionEvent.getY();
                        y17 = bVarArr2[0].f373681e;
                    } else {
                        x17 = bVarArr2[0].f373680d - motionEvent.getX();
                        f17 = bVarArr2[0].f373681e;
                        y17 = motionEvent.getY();
                    }
                    bVarArr2[0].f373680d = motionEvent.getX();
                    bVarArr2[0].f373681e = motionEvent.getY();
                    int scrollX = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX() + ((int) x17);
                    int scrollY = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY() + ((int) (f17 - y17));
                    int m81716xd5538bb2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81716xd5538bb2() + viewTreeObserverOnPreDrawListenerC22668xe0605023.m81711xe699d6ae();
                    android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
                    int max = java.lang.Math.max(java.lang.Math.min(scrollY, m81661x22f21e20.getHeight() - (viewTreeObserverOnPreDrawListenerC22668xe0605023.getHeight() - m81716xd5538bb2)), 0);
                    int scrollX2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX();
                    int scrollY2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY();
                    b(viewTreeObserverOnPreDrawListenerC22668xe0605023, m81661x22f21e20, scrollX, max);
                    if (scrollX2 != viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX() || scrollY2 != viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY()) {
                        viewTreeObserverOnPreDrawListenerC22668xe0605023.cancelLongPress();
                    }
                    return true;
                }
            }
        }
        return false;
    }

    public static void b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Layout layout, int i17, int i18) {
        int i19;
        int i27;
        int width = viewTreeObserverOnPreDrawListenerC22668xe0605023.getWidth() - (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81713xd51a214a() + viewTreeObserverOnPreDrawListenerC22668xe0605023.m81714xce806939());
        int lineForVertical = layout.getLineForVertical(i18);
        android.text.Layout.Alignment paragraphAlignment = layout.getParagraphAlignment(lineForVertical);
        int i28 = 0;
        boolean z17 = layout.getParagraphDirection(lineForVertical) > 0;
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81650x78cd2a8e()) {
            int lineForVertical2 = layout.getLineForVertical((viewTreeObserverOnPreDrawListenerC22668xe0605023.getHeight() + i18) - (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81716xd5538bb2() + viewTreeObserverOnPreDrawListenerC22668xe0605023.m81711xe699d6ae()));
            i19 = 0;
            i28 = Integer.MAX_VALUE;
            while (lineForVertical <= lineForVertical2) {
                i28 = (int) java.lang.Math.min(i28, layout.getLineLeft(lineForVertical));
                i19 = (int) java.lang.Math.max(i19, layout.getLineRight(lineForVertical));
                lineForVertical++;
            }
        } else {
            i19 = width;
        }
        int i29 = i19 - i28;
        if (i29 < width) {
            if (paragraphAlignment == android.text.Layout.Alignment.ALIGN_CENTER) {
                i27 = (width - i29) / 2;
            } else if ((z17 && paragraphAlignment == android.text.Layout.Alignment.ALIGN_OPPOSITE) || (!z17 && paragraphAlignment == android.text.Layout.Alignment.ALIGN_NORMAL)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Touch", "scrollto may err");
                i27 = width - i29;
            }
            i28 -= i27;
        } else {
            i28 = java.lang.Math.max(java.lang.Math.min(i17, i19 - width), i28);
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.scrollTo(i28, i18);
    }
}
