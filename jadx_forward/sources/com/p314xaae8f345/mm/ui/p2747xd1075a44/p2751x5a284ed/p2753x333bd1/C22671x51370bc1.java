package com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1;

/* renamed from: com.tencent.mm.ui.widget.cedit.move.BaseMovementMethod */
/* loaded from: classes15.dex */
public class C22671x51370bc1 implements il5.a {
    /* renamed from: getBottomLine */
    private int m81836x89f368b5(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        return viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20().getLineForVertical(viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY() + m81838xa39479e7(viewTreeObserverOnPreDrawListenerC22668xe0605023));
    }

    /* renamed from: getCharacterWidth */
    private int m81837x36ae113(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        return (int) java.lang.Math.ceil(viewTreeObserverOnPreDrawListenerC22668xe0605023.m81679x74f59ea8().getFontSpacing());
    }

    /* renamed from: getInnerHeight */
    private int m81838xa39479e7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        return (viewTreeObserverOnPreDrawListenerC22668xe0605023.getHeight() - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81716xd5538bb2()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81711xe699d6ae();
    }

    /* renamed from: getInnerWidth */
    private int m81839x1ee22d06(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        return (viewTreeObserverOnPreDrawListenerC22668xe0605023.getWidth() - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81713xd51a214a()) - viewTreeObserverOnPreDrawListenerC22668xe0605023.m81714xce806939();
    }

    /* renamed from: getScrollBoundsLeft */
    private int m81840xf5c9767f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int m81842xf9d86eb3 = m81842xf9d86eb3(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        int m81836x89f368b5 = m81836x89f368b5(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        if (m81842xf9d86eb3 > m81836x89f368b5) {
            return 0;
        }
        int i17 = Integer.MAX_VALUE;
        while (m81842xf9d86eb3 <= m81836x89f368b5) {
            int floor = (int) java.lang.Math.floor(m81661x22f21e20.getLineLeft(m81842xf9d86eb3));
            if (floor < i17) {
                i17 = floor;
            }
            m81842xf9d86eb3++;
        }
        return i17;
    }

    /* renamed from: getScrollBoundsRight */
    private int m81841xc3bbbaa4(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int m81842xf9d86eb3 = m81842xf9d86eb3(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        int m81836x89f368b5 = m81836x89f368b5(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        if (m81842xf9d86eb3 > m81836x89f368b5) {
            return 0;
        }
        int i17 = Integer.MIN_VALUE;
        while (m81842xf9d86eb3 <= m81836x89f368b5) {
            int ceil = (int) java.lang.Math.ceil(m81661x22f21e20.getLineRight(m81842xf9d86eb3));
            if (ceil > i17) {
                i17 = ceil;
            }
            m81842xf9d86eb3++;
        }
        return i17;
    }

    /* renamed from: getTopLine */
    private int m81842xf9d86eb3(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023) {
        return viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20().getLineForVertical(viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY());
    }

    /* renamed from: bottom */
    public boolean mo81820xad8d9a2b(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    @Override // il5.a
    /* renamed from: canSelectArbitrarily */
    public boolean mo81821x906aba63() {
        return false;
    }

    /* renamed from: down */
    public boolean mo81822x2f24a2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    public boolean end(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: getMovementMetaState */
    public int m81843x7ae3b4e7(android.text.Spannable spannable, android.view.KeyEvent keyEvent) {
        return android.view.KeyEvent.normalizeMetaState(android.text.method.MetaKeyKeyListener.getMetaState(spannable, keyEvent) & (-1537)) & (-194);
    }

    /* renamed from: handleMovementKey */
    public boolean mo81823xfd3703e8(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17, int i18, android.view.KeyEvent keyEvent) {
        if (i17 == 92) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return mo81833xc4a6058a(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                return top(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            return false;
        }
        if (i17 == 93) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return mo81832x33331bd1(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                return mo81820xad8d9a2b(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            return false;
        }
        if (i17 == 122) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return mo81824x30f4df(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                return top(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            return false;
        }
        if (i17 == 123) {
            if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                return end(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                return mo81820xad8d9a2b(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
            }
            return false;
        }
        switch (i17) {
            case 19:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return up(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return top(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                return false;
            case 20:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return mo81822x2f24a2(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return mo81820xad8d9a2b(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                return false;
            case 21:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return mo81826x32a007(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                    return mo81827x666e7fb1(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return mo81829x9448fcce(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                return false;
            case 22:
                if (android.view.KeyEvent.metaStateHasNoModifiers(i18)) {
                    return mo81834x677c21c(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 4096)) {
                    return mo81835xa27a8f46(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                if (android.view.KeyEvent.metaStateHasModifiers(i18, 2)) {
                    return mo81828xa8aec47(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable);
                }
                return false;
            default:
                return false;
        }
    }

    /* renamed from: home */
    public boolean mo81824x30f4df(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    @Override // il5.a
    /* renamed from: initialize */
    public void mo81825x33ebcb90(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
    }

    /* renamed from: left */
    public boolean mo81826x32a007(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: leftWord */
    public boolean mo81827x666e7fb1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: lineEnd */
    public boolean mo81828xa8aec47(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: lineStart */
    public boolean mo81829x9448fcce(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005f  */
    @Override // il5.a
    /* renamed from: onGenericMotionEvent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean mo81844x16dab66c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 r7, android.text.Spannable r8, android.view.MotionEvent r9) {
        /*
            r6 = this;
            int r0 = r9.getSource()
            r0 = r0 & 2
            r1 = 0
            if (r0 == 0) goto L6e
            int r0 = r9.getAction()
            r2 = 8
            if (r0 == r2) goto L12
            goto L6e
        L12:
            int r0 = r9.getMetaState()
            r0 = r0 & 1
            r2 = 9
            r3 = 0
            if (r0 == 0) goto L23
            float r9 = r9.getAxisValue(r2)
            r0 = r3
            goto L2e
        L23:
            float r0 = r9.getAxisValue(r2)
            float r0 = -r0
            r2 = 10
            float r9 = r9.getAxisValue(r2)
        L2e:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 >= 0) goto L3f
            float r9 = -r9
            double r4 = (double) r9
            double r4 = java.lang.Math.ceil(r4)
            int r9 = (int) r4
            boolean r9 = r6.m81851x3efcc74(r7, r8, r9)
        L3d:
            r1 = r1 | r9
            goto L4e
        L3f:
            int r2 = (r9 > r3 ? 1 : (r9 == r3 ? 0 : -1))
            if (r2 <= 0) goto L4e
            double r4 = (double) r9
            double r4 = java.lang.Math.ceil(r4)
            int r9 = (int) r4
            boolean r9 = r6.m81856x7a60234f(r7, r8, r9)
            goto L3d
        L4e:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 >= 0) goto L5f
            float r9 = -r0
            double r2 = (double) r9
            double r2 = java.lang.Math.ceil(r2)
            int r9 = (int) r2
            boolean r7 = r6.m81858xe8077248(r7, r8, r9)
        L5d:
            r1 = r1 | r7
            goto L6e
        L5f:
            int r9 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r9 <= 0) goto L6e
            double r2 = (double) r0
            double r2 = java.lang.Math.ceil(r2)
            int r9 = (int) r2
            boolean r7 = r6.m81850x3ec510f(r7, r8, r9)
            goto L5d
        L6e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2753x333bd1.C22671x51370bc1.mo81844x16dab66c(com.tencent.mm.ui.widget.cedit.edit.CustomTextView, android.text.Spannable, android.view.MotionEvent):boolean");
    }

    @Override // il5.a
    /* renamed from: onKeyDown */
    public boolean mo81845x1f03f0c2(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17, android.view.KeyEvent keyEvent) {
        boolean mo81823xfd3703e8 = mo81823xfd3703e8(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, i17, m81843x7ae3b4e7(spannable, keyEvent), keyEvent);
        if (mo81823xfd3703e8) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
            jl5.c.a(spannable);
        }
        return mo81823xfd3703e8;
    }

    @Override // il5.a
    /* renamed from: onKeyOther */
    public boolean mo81846xc21736f0(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, android.view.KeyEvent keyEvent) {
        int m81843x7ae3b4e7 = m81843x7ae3b4e7(spannable, keyEvent);
        int keyCode = keyEvent.getKeyCode();
        if (keyCode == 0 || keyEvent.getAction() != 2) {
            return false;
        }
        int repeatCount = keyEvent.getRepeatCount();
        int i17 = 0;
        boolean z17 = false;
        while (i17 < repeatCount && mo81823xfd3703e8(viewTreeObserverOnPreDrawListenerC22668xe0605023, spannable, keyCode, m81843x7ae3b4e7, keyEvent)) {
            i17++;
            z17 = true;
        }
        if (z17) {
            android.text.method.MetaKeyKeyListener.adjustMetaAfterKeypress(spannable);
            jl5.c.a(spannable);
        }
        return z17;
    }

    @Override // il5.a
    /* renamed from: onKeyUp */
    public boolean mo81847xafd962bb(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17, android.view.KeyEvent keyEvent) {
        return false;
    }

    @Override // il5.a
    /* renamed from: onTakeFocus */
    public void mo81830x56212972(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
    }

    @Override // il5.a
    /* renamed from: onTouchEvent */
    public boolean mo81831x667eb1da(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        return false;
    }

    @Override // il5.a
    /* renamed from: onTrackballEvent */
    public boolean mo81848x830d5eaf(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, android.view.MotionEvent motionEvent) {
        return false;
    }

    /* renamed from: pageDown */
    public boolean mo81832x33331bd1(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: pageUp */
    public boolean mo81833xc4a6058a(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: right */
    public boolean mo81834x677c21c(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: rightWord */
    public boolean mo81835xa27a8f46(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    /* renamed from: scrollBottom */
    public boolean m81849xb6b15f58(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int lineCount = m81661x22f21e20.getLineCount();
        if (m81836x89f368b5(viewTreeObserverOnPreDrawListenerC22668xe0605023) > lineCount - 1) {
            return false;
        }
        il5.c.b(viewTreeObserverOnPreDrawListenerC22668xe0605023, m81661x22f21e20, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop(lineCount) - m81838xa39479e7(viewTreeObserverOnPreDrawListenerC22668xe0605023));
        return true;
    }

    /* renamed from: scrollDown */
    public boolean m81850x3ec510f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int m81838xa39479e7 = m81838xa39479e7(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        int scrollY = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY() + m81838xa39479e7;
        int lineForVertical = m81661x22f21e20.getLineForVertical(scrollY);
        int i18 = lineForVertical + 1;
        if (m81661x22f21e20.getLineTop(i18) < scrollY + 1) {
            lineForVertical = i18;
        }
        int lineCount = m81661x22f21e20.getLineCount() - 1;
        if (lineForVertical > lineCount) {
            return false;
        }
        il5.c.b(viewTreeObserverOnPreDrawListenerC22668xe0605023, m81661x22f21e20, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop(java.lang.Math.min((lineForVertical + i17) - 1, lineCount) + 1) - m81838xa39479e7);
        return true;
    }

    /* renamed from: scrollLeft */
    public boolean m81851x3efcc74(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
        int m81840xf5c9767f = m81840xf5c9767f(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        int scrollX = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX();
        if (scrollX <= m81840xf5c9767f) {
            return false;
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.scrollTo(java.lang.Math.max(scrollX - (m81837x36ae113(viewTreeObserverOnPreDrawListenerC22668xe0605023) * i17), m81840xf5c9767f), viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY());
        return true;
    }

    /* renamed from: scrollLineEnd */
    public boolean m81852x25dfccba(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        int m81841xc3bbbaa4 = m81841xc3bbbaa4(viewTreeObserverOnPreDrawListenerC22668xe0605023) - m81839x1ee22d06(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX() >= m81841xc3bbbaa4) {
            return false;
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.scrollTo(m81841xc3bbbaa4, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY());
        return true;
    }

    /* renamed from: scrollLineStart */
    public boolean m81853x2de78c81(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        int m81840xf5c9767f = m81840xf5c9767f(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        if (viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX() <= m81840xf5c9767f) {
            return false;
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.scrollTo(m81840xf5c9767f, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY());
        return true;
    }

    /* renamed from: scrollPageDown */
    public boolean m81854x827a49be(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int m81838xa39479e7 = m81838xa39479e7(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        int lineForVertical = m81661x22f21e20.getLineForVertical(viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY() + m81838xa39479e7 + m81838xa39479e7);
        if (lineForVertical > m81661x22f21e20.getLineCount() - 1) {
            return false;
        }
        il5.c.b(viewTreeObserverOnPreDrawListenerC22668xe0605023, m81661x22f21e20, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop(lineForVertical + 1) - m81838xa39479e7);
        return true;
    }

    /* renamed from: scrollPageUp */
    public boolean m81855xcdc9cab7(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int lineForVertical = m81661x22f21e20.getLineForVertical(viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY() - m81838xa39479e7(viewTreeObserverOnPreDrawListenerC22668xe0605023));
        if (lineForVertical < 0) {
            return false;
        }
        il5.c.b(viewTreeObserverOnPreDrawListenerC22668xe0605023, m81661x22f21e20, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop(lineForVertical));
        return true;
    }

    /* renamed from: scrollRight */
    public boolean m81856x7a60234f(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
        int m81841xc3bbbaa4 = m81841xc3bbbaa4(viewTreeObserverOnPreDrawListenerC22668xe0605023) - m81839x1ee22d06(viewTreeObserverOnPreDrawListenerC22668xe0605023);
        int scrollX = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX();
        if (scrollX >= m81841xc3bbbaa4) {
            return false;
        }
        viewTreeObserverOnPreDrawListenerC22668xe0605023.scrollTo(java.lang.Math.min(scrollX + (m81837x36ae113(viewTreeObserverOnPreDrawListenerC22668xe0605023) * i17), m81841xc3bbbaa4), viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY());
        return true;
    }

    /* renamed from: scrollTop */
    public boolean m81857x18e6d348(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        if (m81842xf9d86eb3(viewTreeObserverOnPreDrawListenerC22668xe0605023) < 0) {
            return false;
        }
        il5.c.b(viewTreeObserverOnPreDrawListenerC22668xe0605023, m81661x22f21e20, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop(0));
        return true;
    }

    /* renamed from: scrollUp */
    public boolean m81858xe8077248(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable, int i17) {
        android.text.Layout m81661x22f21e20 = viewTreeObserverOnPreDrawListenerC22668xe0605023.m81661x22f21e20();
        int scrollY = viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollY();
        int lineForVertical = m81661x22f21e20.getLineForVertical(scrollY);
        if (m81661x22f21e20.getLineTop(lineForVertical) == scrollY) {
            lineForVertical--;
        }
        if (lineForVertical < 0) {
            return false;
        }
        il5.c.b(viewTreeObserverOnPreDrawListenerC22668xe0605023, m81661x22f21e20, viewTreeObserverOnPreDrawListenerC22668xe0605023.getScrollX(), m81661x22f21e20.getLineTop(java.lang.Math.max((lineForVertical - i17) + 1, 0)));
        return true;
    }

    public boolean top(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }

    public boolean up(com.p314xaae8f345.mm.ui.p2747xd1075a44.p2751x5a284ed.p2752x2f6e0a.ViewTreeObserverOnPreDrawListenerC22668xe0605023 viewTreeObserverOnPreDrawListenerC22668xe0605023, android.text.Spannable spannable) {
        return false;
    }
}
