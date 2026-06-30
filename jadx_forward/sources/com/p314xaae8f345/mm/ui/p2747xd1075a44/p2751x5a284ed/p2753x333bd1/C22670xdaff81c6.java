package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.ArrowKeyMovementMethod */
/* loaded from: classes15.dex */
public class C22670xdaff81c6 extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1 {

    /* renamed from: LAST_TAP_DOWN */
    private static final java.lang.Object f39744x48db7b67 = new java.lang.Object();
    private static final java.lang.String TAG = "cmEdit.ArrowKeyMovementMethod";

    /* renamed from: sInstance */
    private static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22670xdaff81c6 f39745xbfaed628;

    /* renamed from: getCurrentLineTop */
    private static int m81816x9a5f61fe(android.text.Spannable spannable, android.text.Layout layout) {
        return layout.getLineTop(layout.getLineForOffset(android.text.Selection.getSelectionEnd(spannable)));
    }

    /* renamed from: getInstance */
    public static il5.a m81817x9cf0d20b() {
        if (f39745xbfaed628 == null) {
            f39745xbfaed628 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22670xdaff81c6();
        }
        return f39745xbfaed628;
    }

    /* renamed from: getPageHeight */
    private static int m81818x275c308c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        android.graphics.Rect rect = new android.graphics.Rect();
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.getGlobalVisibleRect(rect)) {
            return rect.height();
        }
        return 0;
    }

    /* renamed from: isSelecting */
    private static boolean m81819xdff5b35c(android.text.Spannable spannable) {
        return android.text.method.MetaKeyKeyListener.getMetaState(spannable, 1) == 1 || android.text.method.MetaKeyKeyListener.getMetaState(spannable, 2048) != 0;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: bottom */
    public boolean mo81820xad8d9a2b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        if (m81819xdff5b35c(spannable)) {
            android.text.Selection.extendSelection(spannable, spannable.length());
            return true;
        }
        android.text.Selection.setSelection(spannable, spannable.length());
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: canSelectArbitrarily */
    public boolean mo81821x906aba63() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: down */
    public boolean mo81822x2f24a2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        return m81819xdff5b35c(spannable) ? android.text.Selection.extendDown(spannable, m81661x22f21e20) : android.text.Selection.moveDown(spannable, m81661x22f21e20);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    public boolean end(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return mo81828xa8aec47(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: handleMovementKey */
    public boolean mo81823xfd3703e8(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17, int i18, android.view.KeyEvent keyEvent) {
        return (i17 == 23 && android.view.KeyEvent.metaStateHasNoModifiers(i18) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && android.text.method.MetaKeyKeyListener.getMetaState(spannable, 2048, keyEvent) != 0) ? viewTreeObserverOnPreDrawListenerC22668xe0605023.showContextMenu() : super.mo81823xfd3703e8(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, i17, i18, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: home */
    public boolean mo81824x30f4df(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return mo81829x9448fcce(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: initialize */
    public void mo81825x33ebcb90(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Selection.setSelection(spannable, 0);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: left */
    public boolean mo81826x32a007(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        return m81819xdff5b35c(spannable) ? android.text.Selection.extendLeft(spannable, m81661x22f21e20) : android.text.Selection.moveLeft(spannable, m81661x22f21e20);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: leftWord */
    public boolean mo81827x666e7fb1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: lineEnd */
    public boolean mo81828xa8aec47(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        return m81819xdff5b35c(spannable) ? android.text.Selection.extendToRightEdge(spannable, m81661x22f21e20) : android.text.Selection.moveToRightEdge(spannable, m81661x22f21e20);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: lineStart */
    public boolean mo81829x9448fcce(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        return m81819xdff5b35c(spannable) ? android.text.Selection.extendToLeftEdge(spannable, m81661x22f21e20) : android.text.Selection.moveToLeftEdge(spannable, m81661x22f21e20);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: onTakeFocus */
    public void mo81830x56212972(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
        if ((i17 & 130) == 0) {
            android.text.Selection.setSelection(spannable, spannable.length());
        } else if (viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20() == null) {
            android.text.Selection.setSelection(spannable, spannable.length());
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: onTouchEvent */
    public boolean mo81831x667eb1da(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        int i17;
        int m81687x6f2c472c;
        int action = motionEvent.getAction();
        boolean z17 = false;
        int i18 = -1;
        if (action == 1) {
            il5.b[] bVarArr = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            i17 = bVarArr.length > 0 ? bVarArr[0].f373682f : -1;
            il5.b[] bVarArr2 = (il5.b[]) spannable.getSpans(0, spannable.length(), il5.b.class);
            if (bVarArr2.length > 0) {
                i18 = bVarArr2[0].f373683g;
            }
        } else {
            i17 = -1;
        }
        boolean m81819xdff5b35c = m81819xdff5b35c(spannable);
        boolean a17 = il5.c.a(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, motionEvent);
        gl5.e0 e0Var = viewTreeObserverOnPreDrawListenerC22668xe0605023.f293122g2;
        if (e0Var != null && e0Var.f354489n) {
            z17 = true;
        }
        if (z17) {
            return a17;
        }
        if (action == 0) {
            if (!m81819xdff5b35c(spannable) || (!viewTreeObserverOnPreDrawListenerC22668xe0605023.isFocused() && !viewTreeObserverOnPreDrawListenerC22668xe0605023.requestFocus())) {
                return a17;
            }
            int K = viewTreeObserverOnPreDrawListenerC22668xe0605023.K(motionEvent.getX(), motionEvent.getY());
            spannable.setSpan(f39744x48db7b67, K, K, 34);
            viewTreeObserverOnPreDrawListenerC22668xe0605023.getParent().requestDisallowInterceptTouchEvent(true);
        } else if (viewTreeObserverOnPreDrawListenerC22668xe0605023.isFocused()) {
            if (action == 2) {
                if (m81819xdff5b35c(spannable) && a17) {
                    int spanStart = spannable.getSpanStart(f39744x48db7b67);
                    viewTreeObserverOnPreDrawListenerC22668xe0605023.cancelLongPress();
                    int K2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.K(motionEvent.getX(), motionEvent.getY());
                    android.text.Selection.setSelection(spannable, java.lang.Math.min(spanStart, K2), java.lang.Math.max(spanStart, K2));
                    return true;
                }
            } else if (action == 1) {
                if ((i18 < 0 || i18 == viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY()) && (i17 < 0 || i17 == viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX())) {
                    if (m81819xdff5b35c) {
                        java.lang.Object obj = f39744x48db7b67;
                        int spanStart2 = spannable.getSpanStart(obj);
                        int K3 = viewTreeObserverOnPreDrawListenerC22668xe0605023.K(motionEvent.getX(), motionEvent.getY());
                        android.text.Selection.setSelection(spannable, java.lang.Math.min(spanStart2, K3), java.lang.Math.max(spanStart2, K3));
                        spannable.removeSpan(obj);
                    }
                    android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
                    jl5.c.a(spannable);
                    return true;
                }
                if ((viewTreeObserverOnPreDrawListenerC22668xe0605023.A instanceof android.text.Spannable) && (m81687x6f2c472c = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81687x6f2c472c()) == viewTreeObserverOnPreDrawListenerC22668xe0605023.m81686xffd93625()) {
                    int lineForOffset = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineForOffset(m81687x6f2c472c);
                    int lineTop = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineTop(lineForOffset);
                    int lineTop2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineTop(lineForOffset + 1);
                    int bottom = ((viewTreeObserverOnPreDrawListenerC22668xe0605023.getBottom() - viewTreeObserverOnPreDrawListenerC22668xe0605023.getTop()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81640x14c7f93()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81639x67e4b2d();
                    int i19 = lineTop2 - lineTop;
                    int i27 = i19 / 2;
                    int i28 = bottom / 4;
                    if (i27 > i28) {
                        i27 = i28;
                    }
                    int scrollY = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY();
                    int i29 = scrollY + i27;
                    if (lineTop < i29) {
                        lineForOffset = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineForVertical(i29 + i19);
                    } else {
                        int i37 = (bottom + scrollY) - i27;
                        if (lineTop2 > i37) {
                            lineForOffset = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getLineForVertical(i37 - i19);
                        }
                    }
                    int right = ((viewTreeObserverOnPreDrawListenerC22668xe0605023.getRight() - viewTreeObserverOnPreDrawListenerC22668xe0605023.getLeft()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81628xdc9a71d7()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81629xb70a2a4c();
                    int offsetForHorizontal = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getOffsetForHorizontal(lineForOffset, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX());
                    int offsetForHorizontal2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.M.getOffsetForHorizontal(lineForOffset, right + r1);
                    int i38 = offsetForHorizontal < offsetForHorizontal2 ? offsetForHorizontal : offsetForHorizontal2;
                    if (offsetForHorizontal <= offsetForHorizontal2) {
                        offsetForHorizontal = offsetForHorizontal2;
                    }
                    if (m81687x6f2c472c >= i38) {
                        i38 = m81687x6f2c472c > offsetForHorizontal ? offsetForHorizontal : m81687x6f2c472c;
                    }
                    if (i38 != m81687x6f2c472c) {
                        android.text.Selection.setSelection(viewTreeObserverOnPreDrawListenerC22668xe0605023.B, i38);
                    }
                }
                return true;
            }
        }
        return a17;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: pageDown */
    public boolean mo81832x33331bd1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        boolean m81819xdff5b35c = m81819xdff5b35c(spannable);
        int m81816x9a5f61fe = m81816x9a5f61fe(spannable, m81661x22f21e20) + m81818x275c308c(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        boolean z17 = false;
        while (true) {
            int selectionEnd = android.text.Selection.getSelectionEnd(spannable);
            if (m81819xdff5b35c) {
                android.text.Selection.extendDown(spannable, m81661x22f21e20);
            } else {
                android.text.Selection.moveDown(spannable, m81661x22f21e20);
            }
            if (android.text.Selection.getSelectionEnd(spannable) == selectionEnd) {
                return z17;
            }
            if (m81816x9a5f61fe(spannable, m81661x22f21e20) >= m81816x9a5f61fe) {
                return true;
            }
            z17 = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: pageUp */
    public boolean mo81833xc4a6058a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        boolean m81819xdff5b35c = m81819xdff5b35c(spannable);
        int m81816x9a5f61fe = m81816x9a5f61fe(spannable, m81661x22f21e20) - m81818x275c308c(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        boolean z17 = false;
        while (true) {
            int selectionEnd = android.text.Selection.getSelectionEnd(spannable);
            if (m81819xdff5b35c) {
                android.text.Selection.extendUp(spannable, m81661x22f21e20);
            } else {
                android.text.Selection.moveUp(spannable, m81661x22f21e20);
            }
            if (android.text.Selection.getSelectionEnd(spannable) == selectionEnd) {
                return z17;
            }
            if (m81816x9a5f61fe(spannable, m81661x22f21e20) <= m81816x9a5f61fe) {
                return true;
            }
            z17 = true;
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: right */
    public boolean mo81834x677c21c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        return m81819xdff5b35c(spannable) ? android.text.Selection.extendRight(spannable, m81661x22f21e20) : android.text.Selection.moveRight(spannable, m81661x22f21e20);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: rightWord */
    public boolean mo81835xa27a8f46(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    public boolean top(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        if (m81819xdff5b35c(spannable)) {
            android.text.Selection.extendSelection(spannable, 0);
            return true;
        }
        android.text.Selection.setSelection(spannable, 0);
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    public boolean up(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        return m81819xdff5b35c(spannable) ? android.text.Selection.extendUp(spannable, m81661x22f21e20) : android.text.Selection.moveUp(spannable, m81661x22f21e20);
    }
}
