package wl5;

/* loaded from: classes15.dex */
public abstract class y {
    /* JADX WARN: Multi-variable type inference failed */
    public static int a(android.view.View view, int i17, int i18, int i19) {
        android.text.Layout layout;
        int lineForVertical;
        android.text.Layout layout2;
        int offsetForHorizontal;
        boolean z17 = view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc;
        boolean z18 = false;
        if (z17) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                lineForVertical = mo84153x22f21e20.h(i18);
            }
            lineForVertical = 0;
        } else if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                lineForVertical = mo46328xcfa12296.getLineForVertical(i18);
            }
            lineForVertical = 0;
        } else {
            if ((view instanceof android.widget.TextView) && (layout = ((android.widget.TextView) view).getLayout()) != null) {
                lineForVertical = layout.getLineForVertical(i18);
            }
            lineForVertical = 0;
        }
        if (i19 > 0 && d(view, i19) == d(view, i19 + (-1)) + 1) {
            int i27 = i19 - 1;
            int m17 = (int) m(view, i27);
            int g17 = (int) g(view, lineForVertical);
            if (i17 > g17 - ((g17 - m17) / 2)) {
                i19 = i27;
            }
        }
        int d17 = d(view, i19);
        int i28 = i(view, d17);
        int c17 = c(view, d17);
        int i29 = (c17 - i28) / 2;
        if ((lineForVertical == d17 + 1 && i18 - c17 < i29) || (lineForVertical == d17 - 1 && i28 - i18 < i29)) {
            lineForVertical = d17;
        }
        float f17 = i17;
        if (z17) {
            ks5.a mo84153x22f21e202 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e202 != null) {
                offsetForHorizontal = mo84153x22f21e202.g(lineForVertical, f17);
            }
            offsetForHorizontal = 0;
        } else if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa122962 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa122962 != null) {
                offsetForHorizontal = mo46328xcfa122962.getOffsetForHorizontal(lineForVertical, f17);
            }
            offsetForHorizontal = 0;
        } else {
            if ((view instanceof android.widget.TextView) && (layout2 = ((android.widget.TextView) view).getLayout()) != null) {
                offsetForHorizontal = layout2.getOffsetForHorizontal(lineForVertical, f17);
            }
            offsetForHorizontal = 0;
        }
        if (offsetForHorizontal >= o(view).length() - 1) {
            return offsetForHorizontal;
        }
        int i37 = offsetForHorizontal + 1;
        if (i37 > 0 && d(view, i37) == d(view, i37 - 1) + 1) {
            z18 = true;
        }
        if (!z18) {
            return offsetForHorizontal;
        }
        int m18 = (int) m(view, offsetForHorizontal);
        int g18 = (int) g(view, lineForVertical);
        return i17 > g18 - ((g18 - m18) / 2) ? i37 : offsetForHorizontal;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int b(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.c(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getLineBaseline(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineBaseline(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int c(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.e(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getLineBottom(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineBottom(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int d(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.n(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getLineForOffset(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineForOffset(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int e(android.view.View view) {
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            return ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).m84155xcf821e31();
        }
        if (view instanceof wl5.a) {
            return ((wl5.a) view).mo46329xcb8df7a7();
        }
        if (view instanceof android.widget.TextView) {
            return ((android.widget.TextView) view).getLineHeight();
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float f(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.f(mo84153x22f21e20.b(i17));
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getLineLeft(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getLineLeft(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float g(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.i(i17);
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getLineRight(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getLineRight(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int h(android.view.View view, int i17) {
        android.text.Layout layout;
        int lineStart;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                lineStart = mo84153x22f21e20.b(i17);
            }
            lineStart = 0;
        } else if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                lineStart = mo46328xcfa12296.getLineStart(i17);
            }
            lineStart = 0;
        } else {
            if ((view instanceof android.widget.TextView) && (layout = ((android.widget.TextView) view).getLayout()) != null) {
                lineStart = layout.getLineStart(i17);
            }
            lineStart = 0;
        }
        if (lineStart >= 0) {
            return lineStart;
        }
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int i(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.a(i17);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getLineTop(i17);
            }
            return 0;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0;
        }
        return layout.getLineTop(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float j(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.o(i17);
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getLineWidth(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getLineWidth(i17);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static int k(android.view.View view, int i17, int i18) {
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.k(i17, i18);
            }
            return 0;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 == null) {
                return -1;
            }
            int offsetForHorizontal = mo46328xcfa12296.getOffsetForHorizontal(mo46328xcfa12296.getLineForVertical(i18), i17);
            return ((int) mo46328xcfa12296.getPrimaryHorizontal(offsetForHorizontal)) > i17 ? mo46328xcfa12296.getOffsetToLeftOf(offsetForHorizontal) : offsetForHorizontal;
        }
        if (!(view instanceof android.widget.TextView)) {
            return 0;
        }
        android.text.Layout layout = ((android.widget.TextView) view).getLayout();
        if (layout == null) {
            return -1;
        }
        int offsetForHorizontal2 = layout.getOffsetForHorizontal(layout.getLineForVertical(i18), i17);
        return ((int) layout.getPrimaryHorizontal(offsetForHorizontal2)) > i17 ? layout.getOffsetToLeftOf(offsetForHorizontal2) : offsetForHorizontal2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static android.text.TextPaint l(android.view.View view) {
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            return ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).m84162x74f59ea8();
        }
        if (!(view instanceof wl5.a)) {
            if (view instanceof android.widget.TextView) {
                return ((android.widget.TextView) view).getPaint();
            }
            return null;
        }
        android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
        if (mo46328xcfa12296 != null) {
            return mo46328xcfa12296.getPaint();
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float m(android.view.View view, int i17) {
        android.text.Layout layout;
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ks5.a mo84153x22f21e20 = ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).mo84153x22f21e20();
            if (mo84153x22f21e20 != null) {
                return mo84153x22f21e20.f(i17);
            }
            return 0.0f;
        }
        if (view instanceof wl5.a) {
            android.text.Layout mo46328xcfa12296 = ((wl5.a) view).mo46328xcfa12296();
            if (mo46328xcfa12296 != null) {
                return mo46328xcfa12296.getPrimaryHorizontal(i17);
            }
            return 0.0f;
        }
        if (!(view instanceof android.widget.TextView) || (layout = ((android.widget.TextView) view).getLayout()) == null) {
            return 0.0f;
        }
        return layout.getPrimaryHorizontal(i17);
    }

    public static int n(android.content.Context context) {
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static java.lang.CharSequence o(android.view.View view) {
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            return ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).a();
        }
        if (!(view instanceof wl5.a)) {
            return view instanceof android.widget.TextView ? ((android.widget.TextView) view).getText() : "";
        }
        java.lang.CharSequence mo46330x7df75799 = ((wl5.a) view).mo46330x7df75799();
        return mo46330x7df75799 == null ? "" : mo46330x7df75799;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static float p(android.view.View view) {
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            return ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).m84164x40077844();
        }
        if (view instanceof wl5.a) {
            return ((wl5.a) view).mo46331x7d07373a();
        }
        if (view instanceof android.widget.TextView) {
            return ((android.widget.TextView) view).getTextSize();
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void q(android.view.View view, java.lang.CharSequence charSequence, android.widget.TextView.BufferType bufferType) {
        if (view instanceof com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) {
            ((com.p314xaae8f345.p2837x8fa2df7c.p2838xc43d2152.p2840x373aa5.C23001x9d3a0bdc) view).c(charSequence, bufferType, null);
        } else if (view instanceof wl5.a) {
            ((wl5.a) view).mo46345x45edbfa5(charSequence);
        } else if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setText(charSequence, bufferType);
        }
    }
}
