package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.LinkMovementMethod */
/* loaded from: classes15.dex */
public class C22672x3783f92a extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5 {

    /* renamed from: CLICK */
    private static final int f39746x3d3cd68 = 1;

    /* renamed from: DOWN */
    private static final int f39747x201ca2 = 3;

    /* renamed from: FROM_BELOW */
    private static java.lang.Object f39748xe79c1f3c = new android.text.NoCopySpan.Concrete();

    /* renamed from: HIDE_FLOATING_TOOLBAR_DELAY_MS */
    private static final int f39749x110ab4c2 = 200;
    private static final int UP = 2;

    /* renamed from: sInstance */
    private static com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22672x3783f92a f39750xbfaed628;
    private java.lang.String TAG = "cmEdit.LinkMovementMethod";

    /* renamed from: action */
    private boolean m81860xab2f7e36(int i17, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int m81716xd5538bb2 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81716xd5538bb2() + viewTreeObserverOnPreDrawListenerC22668xe0605023.m81711xe699d6ae();
        int scrollY = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY();
        int height = (viewTreeObserverOnPreDrawListenerC22668xe0605023.getHeight() + scrollY) - m81716xd5538bb2;
        int lineForVertical = m81661x22f21e20.getLineForVertical(scrollY);
        int lineForVertical2 = m81661x22f21e20.getLineForVertical(height);
        int lineStart = m81661x22f21e20.getLineStart(lineForVertical);
        int lineEnd = m81661x22f21e20.getLineEnd(lineForVertical2);
        android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(lineStart, lineEnd, android.text.style.ClickableSpan.class);
        int selectionStart = android.text.Selection.getSelectionStart(spannable);
        int selectionEnd = android.text.Selection.getSelectionEnd(spannable);
        int min = java.lang.Math.min(selectionStart, selectionEnd);
        int max = java.lang.Math.max(selectionStart, selectionEnd);
        if (min < 0 && spannable.getSpanStart(f39748xe79c1f3c) >= 0) {
            min = spannable.length();
            max = min;
        }
        if (min > lineEnd) {
            max = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;
        }
        int i18 = -1;
        if (max < lineStart) {
            max = -1;
            min = -1;
        }
        if (i17 == 1) {
            if (min == max) {
                return false;
            }
            android.text.style.ClickableSpan[] clickableSpanArr2 = (android.text.style.ClickableSpan[]) spannable.getSpans(min, max, android.text.style.ClickableSpan.class);
            if (clickableSpanArr2.length != 1) {
                return false;
            }
            android.text.style.ClickableSpan clickableSpan = clickableSpanArr2[0];
            if (android.os.Build.VERSION.SDK_INT >= 28) {
                if (clickableSpan instanceof android.view.textclassifier.TextLinks.TextLinkSpan) {
                    clickableSpan.onClick(viewTreeObserverOnPreDrawListenerC22668xe0605023);
                } else {
                    clickableSpan.onClick(viewTreeObserverOnPreDrawListenerC22668xe0605023);
                }
            }
        } else if (i17 == 2) {
            int i19 = -1;
            for (int i27 = 0; i27 < clickableSpanArr.length; i27++) {
                int spanEnd = spannable.getSpanEnd(clickableSpanArr[i27]);
                if ((spanEnd < max || min == max) && spanEnd > i19) {
                    i18 = spannable.getSpanStart(clickableSpanArr[i27]);
                    i19 = spanEnd;
                }
            }
            if (i18 >= 0) {
                android.text.Selection.setSelection(spannable, i19, i18);
                return true;
            }
        } else if (i17 == 3) {
            int i28 = Integer.MAX_VALUE;
            int i29 = Integer.MAX_VALUE;
            for (int i37 = 0; i37 < clickableSpanArr.length; i37++) {
                int spanStart = spannable.getSpanStart(clickableSpanArr[i37]);
                if ((spanStart > min || min == max) && spanStart < i29) {
                    i28 = spannable.getSpanEnd(clickableSpanArr[i37]);
                    i29 = spanStart;
                }
            }
            if (i28 < Integer.MAX_VALUE) {
                android.text.Selection.setSelection(spannable, i29, i28);
                return true;
            }
        }
        return false;
    }

    /* renamed from: getInstance */
    public static il5.a m81861x9cf0d20b() {
        if (f39750xbfaed628 == null) {
            f39750xbfaed628 = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22672x3783f92a();
        }
        return f39750xbfaed628;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: canSelectArbitrarily */
    public boolean mo81821x906aba63() {
        return true;
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: down */
    public boolean mo81822x2f24a2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        if (m81860xab2f7e36(3, viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable)) {
            return true;
        }
        return super.mo81822x2f24a2(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: handleMovementKey */
    public boolean mo81823xfd3703e8(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17, int i18, android.view.KeyEvent keyEvent) {
        if ((i17 == 23 || i17 == 66) && android.view.KeyEvent.metaStateHasNoModifiers(i18) && keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0 && m81860xab2f7e36(1, viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable)) {
            return true;
        }
        return super.mo81823xfd3703e8(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, i17, i18, keyEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: initialize */
    public void mo81825x33ebcb90(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Selection.removeSelection(spannable);
        spannable.removeSpan(f39748xe79c1f3c);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: left */
    public boolean mo81826x32a007(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        if (m81860xab2f7e36(2, viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable)) {
            return true;
        }
        return super.mo81826x32a007(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: onTakeFocus */
    public void mo81830x56212972(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
        android.text.Selection.removeSelection(spannable);
        if ((i17 & 1) != 0) {
            spannable.setSpan(f39748xe79c1f3c, 0, 0, 34);
        } else {
            spannable.removeSpan(f39748xe79c1f3c);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1, il5.a
    /* renamed from: onTouchEvent */
    public boolean mo81831x667eb1da(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        gl5.e0 e0Var;
        int action = motionEvent.getAction();
        if (action == 1 || action == 0) {
            int x17 = (int) motionEvent.getX();
            int y17 = (int) motionEvent.getY();
            int m81713xd51a214a = x17 - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81713xd51a214a();
            int m81716xd5538bb2 = y17 - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81716xd5538bb2();
            int scrollX = m81713xd51a214a + viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX();
            int scrollY = m81716xd5538bb2 + viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY();
            android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
            int offsetForHorizontal = m81661x22f21e20.getOffsetForHorizontal(m81661x22f21e20.getLineForVertical(scrollY), scrollX);
            android.text.style.ClickableSpan[] clickableSpanArr = (android.text.style.ClickableSpan[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, android.text.style.ClickableSpan.class);
            if (clickableSpanArr.length != 0) {
                android.text.style.ClickableSpan clickableSpan = clickableSpanArr[0];
                if (action == 1) {
                    if (android.os.Build.VERSION.SDK_INT >= 28) {
                        clickableSpan.onClick(viewTreeObserverOnPreDrawListenerC22668xe0605023);
                    }
                } else if (action == 0) {
                    if (viewTreeObserverOnPreDrawListenerC22668xe0605023.getContext().getApplicationInfo().targetSdkVersion >= 28 && (e0Var = viewTreeObserverOnPreDrawListenerC22668xe0605023.f293122g2) != null) {
                        e0Var.U.removeCallbacks(e0Var.V);
                        hl5.g gVar = e0Var.Z;
                        if (gVar != null) {
                            try {
                                gVar.f363667i.m81637x17234463().n().b(gVar.f363673o);
                                gVar.f363659a.dismiss();
                            } catch (java.lang.Throwable unused) {
                            }
                        }
                        android.view.ActionMode actionMode = e0Var.f354478c;
                        if (actionMode != null) {
                            actionMode.hide(200);
                        }
                    }
                    android.text.Selection.setSelection(spannable, spannable.getSpanStart(clickableSpan), spannable.getSpanEnd(clickableSpan));
                }
                return true;
            }
            android.text.Selection.removeSelection(spannable);
        }
        return super.mo81831x667eb1da(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, motionEvent);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    /* renamed from: right */
    public boolean mo81834x677c21c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        if (m81860xab2f7e36(3, viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable)) {
            return true;
        }
        return super.mo81834x677c21c(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }

    @Override // com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22673x4548f3a5, com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1
    public boolean up(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        if (m81860xab2f7e36(2, viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable)) {
            return true;
        }
        return super.up(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
    }
}
