package x74;

/* loaded from: classes4.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final android.app.Activity f533985a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.ViewGroup f533986b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f533987c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f533988d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.View f533989e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f533990f;

    public b(android.app.Activity activity, android.view.ViewGroup viewGroup) {
        this(activity, viewGroup, false);
    }

    public static final void a(x74.b bVar, int i17, int i18) {
        java.lang.Object m143895xf1229813;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("access$calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        bVar.getClass();
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "calc watermark bound");
        android.view.ViewGroup viewGroup = bVar.f533986b;
        if (viewGroup == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        } else {
            android.view.View view = bVar.f533989e;
            if (view == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PreviewHelper", "the water mark view is null!");
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            } else {
                try {
                    p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                    if (layoutParams == null) {
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PreviewHelper", "the water mark view has not layout params");
                        layoutParams = new android.view.ViewGroup.LayoutParams(i17, i18);
                    }
                    layoutParams.width = i17;
                    if (bVar.f533987c) {
                        layoutParams.height = i18;
                    } else {
                        android.view.View findViewById = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.f564408qh);
                        if (findViewById != null) {
                            if (findViewById.getVisibility() == 0) {
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("relativePositionToRoot", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                                android.graphics.Rect rect = new android.graphics.Rect();
                                findViewById.getDrawingRect(rect);
                                viewGroup.offsetDescendantRectToMyCoords(findViewById, rect);
                                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("relativePositionToRoot", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                                i18 = rect.top;
                            }
                        }
                        layoutParams.height = i18;
                    }
                    view.setLayoutParams(layoutParams);
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(jz5.f0.f384359a);
                } catch (java.lang.Throwable th6) {
                    p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                    m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
                }
                if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
                    ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
                }
                p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("access$calcWaterMarkBound", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
    }

    public final void b(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        android.view.View findViewById;
        android.view.View inflate;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        java.lang.String T = ca4.z0.T(c17933xe8d1b226);
        if (T == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("SnsAd.PreviewHelper", "the sns id is empty!!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("activityRootView", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        android.view.View view = null;
        android.app.Activity activity = this.f533985a;
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("activityRootView", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            findViewById = null;
        } else {
            findViewById = activity.findViewById(android.R.id.content);
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("activityRootView", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        }
        if (findViewById == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PreviewHelper", "the fixed view is null!!!!");
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "the activityRootView is attached to windows " + findViewById.isAttachedToWindow() + ", the sns id is " + this.f533988d + ", new sns id is " + T);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("doInflate", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        if (activity == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInflate", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        } else {
            if (this.f533989e == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "the watermark view is going to inflate!!");
                android.view.ViewGroup viewGroup = this.f533986b;
                android.view.View findViewById2 = viewGroup != null ? viewGroup.findViewById(com.p314xaae8f345.mm.R.id.r8q) : null;
                android.view.ViewStub viewStub = findViewById2 instanceof android.view.ViewStub ? (android.view.ViewStub) findViewById2 : null;
                if (viewStub != null && (inflate = viewStub.inflate()) != null) {
                    java.lang.String string = activity.getString(com.p314xaae8f345.mm.R.C30867xcad56011.f574724ma2);
                    if (string == null) {
                        string = "";
                    }
                    java.lang.String str = string;
                    int color = activity.getColor(com.p314xaae8f345.mm.ui.bk.C() ? com.p314xaae8f345.mm.R.C30859x5a72f63.afc : com.p314xaae8f345.mm.R.C30859x5a72f63.afb);
                    android.widget.ImageView imageView = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.r8s);
                    if (imageView != null) {
                        imageView.setImageDrawable(new b44.b(str, a84.d0.a(10), color, -18.0f, 0.0f, 0, 48, null));
                    }
                    view = inflate;
                }
                this.f533989e = view;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("doInflate", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f533988d, T) && !this.f533987c) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "the sns id is same as the before, the current id is ".concat(T));
            android.view.View view2 = this.f533989e;
            if (view2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "update", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "update", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        } else if (this.f533990f) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "there is already an draw listener in view tree observer!!");
        } else {
            this.f533990f = true;
            android.view.ViewTreeObserver viewTreeObserver = findViewById.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnPreDrawListener(new x74.a(this, findViewById, T));
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("update", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
    }

    public final void c(com.p314xaae8f345.mm.p1006xc5476f33.sns.p2169x8fb0427b.C17933xe8d1b226 c17933xe8d1b226) {
        java.lang.Object m143895xf1229813;
        boolean h07;
        jz5.f0 f0Var;
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
        if (this.f533986b == null) {
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        try {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71153x3a548b48("isPreviewAd", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            if (c17933xe8d1b226 == null) {
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPreviewAd", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
                h07 = false;
            } else {
                h07 = ca4.m0.h0(c17933xe8d1b226);
                com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("isPreviewAd", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            }
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        if (!h07) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SnsAd.PreviewHelper", "the sns feed does not need water mark");
            android.view.View view = this.f533989e;
            if (view != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(8);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view, "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
            com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
            return;
        }
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        if (c17933xe8d1b226 != null) {
            b(c17933xe8d1b226);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("SnsAd.PreviewHelper", "the sns info is null, is it real sns feed ??!!!!");
            android.view.View view2 = this.f533989e;
            if (view2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(8);
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view2, arrayList2.toArray(), "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/sns/ad/timeline/preview/AdPreviewSnsAdHelper", "updateWithSnsInfo", "(Lcom/tencent/mm/plugin/sns/storage/SnsInfo;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            }
        }
        m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var2);
        if (p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813)) {
            ca4.q.c("catching_tag", p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813));
        }
        p3321xbce91901.C29043x91b2b43d.m143902xc481aacd(m143895xf1229813);
        com.p314xaae8f345.mm.p1006xc5476f33.sns.ui.p2214x49b0bd5a.C18371x36a2d70d.m71152xb91771c1("updateWithSnsInfo", "com.tencent.mm.plugin.sns.ad.timeline.preview.AdPreviewSnsAdHelper");
    }

    public b(android.app.Activity activity, android.view.ViewGroup viewGroup, boolean z17) {
        this.f533985a = activity;
        this.f533986b = viewGroup;
        this.f533987c = z17;
        this.f533988d = "";
    }
}
