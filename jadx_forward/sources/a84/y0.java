package a84;

/* loaded from: classes4.dex */
public abstract class y0 {

    /* renamed from: a, reason: collision with root package name */
    public static android.graphics.Typeface f83911a;

    public static float a(android.widget.TextView textView, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (android.text.TextUtils.isEmpty(str) || textView == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return 0.0f;
        }
        try {
            android.text.TextPaint paint = textView.getPaint();
            if (paint == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                return 0.0f;
            }
            float measureText = paint.measureText(str);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return measureText;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ViewUtils", "acquireTextWidth error.");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("acquireTextWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return 0.0f;
        }
    }

    public static boolean b(android.view.ViewGroup viewGroup, android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        boolean z17 = false;
        try {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            if (viewGroup != null && view != null) {
                if (i17 > viewGroup.getChildCount()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                } else {
                    android.view.ViewParent parent = view.getParent();
                    if (parent == viewGroup) {
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                    } else {
                        if (parent == null) {
                            viewGroup.addView(view, i17);
                        } else {
                            ((android.view.ViewGroup) parent).removeView(view);
                            viewGroup.addView(view);
                        }
                        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                    }
                    z17 = true;
                }
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                return z17;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSafelyInner", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return z17;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewUtils", "ViewUtils:: Add view to view group failed!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("addViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return false;
        }
    }

    public static void c(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("clearChildren", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("clearChildren", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static java.lang.Object d(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view == null || i17 == 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
        try {
            java.lang.Object tag = view.getTag(i17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return tag;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ViewUtils", "the is something wrong in view tag!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("getViewTagSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
    }

    public static boolean e(android.view.ViewGroup viewGroup) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasChild", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasChild", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return false;
        }
        boolean z17 = viewGroup.getChildCount() > 0;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasChild", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        return z17;
    }

    public static boolean f(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("hasParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return false;
        }
        boolean z17 = view.getParent() != null;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("hasParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        return z17;
    }

    public static android.view.View g(android.content.Context context, int i17, android.view.ViewGroup viewGroup, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (context == null && viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
        if (context == null) {
            try {
                context = viewGroup.getContext();
            } catch (java.lang.Throwable unused) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
                return null;
            }
        }
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(i17, viewGroup, z17);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateViewSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        return inflate;
    }

    public static android.view.View h(android.view.ViewStub viewStub) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewStub == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
        try {
            android.view.View inflate = viewStub.inflate();
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return inflate;
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewUtils", "view stub inflate failed!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("inflateViewStubSafely", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return null;
        }
    }

    public static void i(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("leaveFromParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("leaveFromParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return;
        }
        try {
            android.view.ViewParent parent = view.getParent();
            if (parent instanceof android.view.ViewGroup) {
                ((android.view.ViewGroup) parent).removeView(view);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("leaveFromParent", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static void j(android.view.View view, java.lang.String str) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48(nd1.s0.f72974x24728b, "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        try {
            int parseColor = android.graphics.Color.parseColor(str);
            if (view != null) {
                view.setBackgroundColor(parseColor);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1(nd1.s0.f72974x24728b, "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static void k(android.view.View view, int i17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setMaxWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view instanceof android.widget.TextView) {
            ((android.widget.TextView) view).setMaxWidth(i17);
        } else if (view instanceof android.widget.ImageView) {
            ((android.widget.ImageView) view).setMaxWidth(i17);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ViewUtils", "the view is not support set max width.");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setMaxWidth", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static void l(android.widget.TextView textView, java.lang.CharSequence charSequence) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setText", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (textView != null) {
            try {
                if (android.text.TextUtils.isEmpty(charSequence)) {
                    textView.setText("");
                } else {
                    textView.setText(charSequence);
                }
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setText", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static void m(android.view.ViewGroup viewGroup, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewGroupClip", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (viewGroup == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("ViewUtils", "setViewGroupClip, vp is null and clip is " + z17);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewGroupClip", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
            return;
        }
        try {
            viewGroup.setClipChildren(z17);
            viewGroup.setClipToPadding(z17);
        } catch (java.lang.Throwable unused) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("ViewUtils", "setViewGroupClip error!!");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewGroupClip", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static void n(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewInvisible", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(4);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewInvisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewInvisible", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewInvisible", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static void o(android.view.View view, int i17, int i18) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewLayoutParam", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view != null) {
            try {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    if (i17 != -1003) {
                        layoutParams.width = i17;
                    }
                    if (i18 != -1003) {
                        layoutParams.height = i18;
                    }
                } else {
                    if (i17 == -1003) {
                        i17 = 0;
                    }
                    if (i18 == -1003) {
                        i18 = 0;
                    }
                    layoutParams = new android.view.ViewGroup.LayoutParams(i17, i18);
                }
                view.setLayoutParams(layoutParams);
            } catch (java.lang.Throwable unused) {
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewLayoutParam", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }

    public static void p(android.view.View view, boolean z17) {
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("setViewVisibility", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
        if (view != null) {
            int i17 = z17 ? 0 : 8;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(java.lang.Integer.valueOf(i17));
            java.util.Collections.reverse(arrayList);
            yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/utils/ViewUtils", "setViewVisibility", "(Landroid/view/View;Z)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("setViewVisibility", "com.tencent.mm.plugin.sns.ad.utils.ViewUtils");
    }
}
