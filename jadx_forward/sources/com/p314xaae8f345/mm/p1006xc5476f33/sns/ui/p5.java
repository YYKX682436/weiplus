package com.p314xaae8f345.mm.p1006xc5476f33.sns.ui;

/* loaded from: classes4.dex */
public class p5 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public static com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 f251691d;

    /* renamed from: e, reason: collision with root package name */
    public static al5.w f251692e;

    /* renamed from: f, reason: collision with root package name */
    public static android.widget.TextView f251693f;

    /* renamed from: g, reason: collision with root package name */
    public static xe0.h0 f251694g;

    public static void a() {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("removeActionDown", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var = f251691d;
        if (d1Var != null) {
            d1Var.mo2167x263a2556(false);
            f251693f.invalidate();
            f251693f = null;
            f251691d = null;
        }
        al5.w wVar = f251692e;
        if (wVar != null) {
            wVar.getClass();
            f251693f.invalidate();
            f251693f = null;
            f251692e = null;
        }
        b(f251693f);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("removeActionDown", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
    }

    public static void b(android.widget.TextView textView) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("resetTextStatusPressedIfAny", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        xe0.h0 h0Var = f251694g;
        if (h0Var == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTextStatusPressedIfAny", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
            return;
        }
        c(h0Var, false);
        f251694g = null;
        if (textView != null) {
            textView.invalidate();
        }
        f251694g = null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("resetTextStatusPressedIfAny", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
    }

    public static void c(xe0.h0 h0Var, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setSpanPressedIfPossible", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        if (h0Var instanceof gb5.a) {
            ((gb5.a) h0Var).mo2167x263a2556(z17);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setSpanPressedIfPossible", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int totalPaddingLeft;
        int totalPaddingTop;
        xe0.h0 h0Var;
        boolean z17;
        boolean z18;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouch", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/sns/ui/MMOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        android.widget.TextView textView = (android.widget.TextView) view;
        motionEvent.getAction();
        if (motionEvent.getAction() == 3) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMOnTouchListener", "onTouch CANCEL pre-reset tv=%s", textView);
            b(textView);
        }
        textView.getTag();
        java.lang.CharSequence text = textView.getText();
        android.text.Layout layout = textView.getLayout();
        boolean z19 = text instanceof android.text.Spannable;
        boolean z27 = text instanceof android.text.Spanned;
        motionEvent.getX();
        motionEvent.getY();
        if (layout == null && (textView instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f)) {
            layout = ((com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f) textView).m46353x7741c9c2();
        }
        boolean z28 = false;
        if (!z19 || layout == null) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/sns/ui/MMOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
            return false;
        }
        android.text.Spannable spannable = (android.text.Spannable) text;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        int action = motionEvent.getAction();
        android.text.Layout layout2 = textView.getLayout();
        if (layout2 == null && (textView instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f)) {
            layout2 = ((com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f) textView).m46353x7741c9c2();
        }
        textView.invalidate();
        if (spannable == null || !com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.s.a(textView, spannable)) {
            if (action == 1 || action == 0 || action == 2) {
                int x17 = (int) motionEvent.getX();
                int y17 = (int) motionEvent.getY();
                boolean z29 = textView instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3;
                if (z29) {
                    com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3 c10806xf15263c3 = (com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3) textView;
                    if (x17 < c10806xf15263c3.mo46320x4e1ac2b1() || x17 > layout2.getWidth() + c10806xf15263c3.mo46320x4e1ac2b1()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    } else if (y17 < c10806xf15263c3.mo46338xb15dc503() || y17 > layout2.getHeight() + c10806xf15263c3.mo46338xb15dc503()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    }
                } else {
                    if (x17 < textView.getTotalPaddingLeft() || x17 > layout2.getWidth() + textView.getTotalPaddingLeft()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    } else if (y17 < textView.getTotalPaddingTop() || y17 > layout2.getHeight() + textView.getTotalPaddingTop()) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    }
                    z28 = false;
                }
                if (z29) {
                    com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3 c10806xf15263c32 = (com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10806xf15263c3) textView;
                    totalPaddingLeft = x17 - c10806xf15263c32.mo46320x4e1ac2b1();
                    totalPaddingTop = c10806xf15263c32.mo46338xb15dc503();
                } else {
                    totalPaddingLeft = x17 - textView.getTotalPaddingLeft();
                    totalPaddingTop = textView.getTotalPaddingTop();
                }
                int scrollX = totalPaddingLeft + textView.getScrollX();
                int scrollY = (y17 - totalPaddingTop) + textView.getScrollY();
                int offsetForHorizontal = layout2.getOffsetForHorizontal(layout2.getLineForVertical(scrollY), scrollX);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                if (spannable == null) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                } else {
                    int action2 = motionEvent.getAction();
                    xe0.h0[] h0VarArr = (xe0.h0[]) spannable.getSpans(0, spannable.length(), xe0.h0.class);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] action=%d count=%d", java.lang.Integer.valueOf(action2), java.lang.Integer.valueOf(h0VarArr == null ? 0 : h0VarArr.length));
                    if ((h0VarArr == null || h0VarArr.length == 0) && f251694g == null) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    } else {
                        if (h0VarArr != null) {
                            int length = h0VarArr.length;
                            for (int i17 = 0; i17 < length; i17++) {
                                h0Var = h0VarArr[i17];
                                if (h0Var.a(scrollX, scrollY)) {
                                    break;
                                }
                            }
                        }
                        h0Var = null;
                        if (action2 != 0) {
                            if (action2 == 1) {
                                xe0.h0 h0Var2 = f251694g;
                                if (h0Var2 == null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                } else {
                                    c(h0Var2, false);
                                    f251694g = null;
                                    if (h0Var == h0Var2) {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] UP click");
                                        try {
                                            h0Var2.b(textView);
                                        } catch (java.lang.Throwable th6) {
                                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.MMOnTouchListener", th6, "performSpanClick err", new java.lang.Object[0]);
                                        }
                                    } else {
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] UP release");
                                    }
                                    textView.invalidate();
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                    z28 = true;
                                }
                            } else if (action2 == 2) {
                                xe0.h0 h0Var3 = f251694g;
                                if (h0Var3 == null) {
                                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                } else {
                                    if (h0Var != h0Var3) {
                                        c(h0Var3, false);
                                        f251694g = null;
                                        textView.invalidate();
                                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] MOVE out");
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                    } else {
                                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                    }
                                    z28 = true;
                                }
                            } else if (action2 != 3) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            } else if (f251694g != null) {
                                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] CANCEL");
                                c(f251694g, false);
                                f251694g = null;
                                textView.invalidate();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                                z28 = true;
                            } else {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            }
                        } else if (h0Var != null) {
                            f251694g = h0Var;
                            c(h0Var, true);
                            textView.invalidate();
                            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MMOnTouchListener", "[TSSpan] DOWN hit");
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            z28 = true;
                        } else {
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processTextStatusItemSpanClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        }
                    }
                    z28 = false;
                }
                if (z28) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    z28 = true;
                } else {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                    int action3 = motionEvent.getAction();
                    com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1[] d1VarArr = (com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1.class);
                    al5.w[] wVarArr = (al5.w[]) spannable.getSpans(offsetForHorizontal, offsetForHorizontal, al5.w.class);
                    int length2 = d1VarArr.length;
                    int length3 = wVarArr.length;
                    if (textView.getLayout() == null && (textView instanceof com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f)) {
                        ((com.p314xaae8f345.mm.p811x323c3e.p812xd1075a44.p813xc43d2152.C10809x1fa3433f) textView).m46353x7741c9c2();
                    }
                    if (d1VarArr.length != 0) {
                        int length4 = d1VarArr.length - 1;
                        if (action3 == 1) {
                            d1VarArr[length4].onClick(textView);
                            new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.n5(this), 300L);
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            z17 = true;
                        } else if (action3 == 0 || action3 == 2 || action3 == 3) {
                            a();
                            com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.d1 d1Var = d1VarArr[length4];
                            f251691d = d1Var;
                            f251693f = textView;
                            z17 = true;
                            d1Var.mo2167x263a2556(true);
                            textView.invalidate();
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        } else {
                            z17 = true;
                            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            z18 = false;
                        }
                        z18 = z17;
                    } else {
                        z17 = true;
                        if (wVarArr.length != 0) {
                            int length5 = wVarArr.length - 1;
                            if (action3 == 1) {
                                wVarArr[length5].mo2318xaf6b9ae9(textView);
                                new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3().mo50297x7c4d7ca2(new com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.o5(this), 300L);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            } else if (action3 == 0 || action3 == 2 || action3 == 3) {
                                a();
                                al5.w wVar = wVarArr[length5];
                                f251692e = wVar;
                                f251693f = textView;
                                wVar.getClass();
                                textView.invalidate();
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                            }
                            z18 = z17;
                        } else {
                            a();
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("processSnsClick", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        z18 = false;
                    }
                    if (z18) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
                        z28 = z17;
                    }
                }
            }
            a();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
            z28 = false;
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouchEvent", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        }
        yj0.a.i(z28, this, "com/tencent/mm/plugin/sns/ui/MMOnTouchListener", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("onTouch", "com.tencent.mm.plugin.sns.ui.MMOnTouchListener");
        return z28;
    }
}
