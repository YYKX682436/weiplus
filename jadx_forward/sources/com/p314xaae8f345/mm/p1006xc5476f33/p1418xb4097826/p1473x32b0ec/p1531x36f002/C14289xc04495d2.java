package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0011B\u0019\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rB!\b\u0016\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\f\u0010\u0010R\u0016\u0010\u0005\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00028BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/tencent/mm/plugin/finder/live/util/FinderLivePushReplaceLayout;", "Landroid/widget/RelativeLayout;", "Landroid/view/View;", "getFirstChild", "()Landroid/view/View;", "firstChild", "getSecondChild", "secondChild", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "defStyle", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "com/tencent/mm/plugin/finder/live/util/e0", "plugin-finder-live_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.plugin.finder.live.util.FinderLivePushReplaceLayout */
/* loaded from: classes3.dex */
public final class C14289xc04495d2 extends android.widget.RelativeLayout {

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f196964d = 0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14289xc04495d2(android.content.Context context, android.util.AttributeSet attrs) {
        super(context, attrs);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }

    /* renamed from: getFirstChild */
    private final android.view.View m57147xe31b1842() {
        if (getChildCount() != 0) {
            return getChildAt(0);
        }
        return null;
    }

    /* renamed from: getSecondChild */
    private final android.view.View m57148xe818afd2() {
        if (getChildCount() > 1) {
            return getChildAt(1);
        }
        return null;
    }

    public final boolean a(android.view.View view, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.e0 pushDirection, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pushDirection, "pushDirection");
        if (m57148xe818afd2() != null || view == null) {
            return false;
        }
        addView(view);
        int ordinal = pushDirection.ordinal();
        if (ordinal == 1) {
            view.setTranslationY(getHeight());
        } else if (ordinal == 2) {
            view.setTranslationY(-getHeight());
        } else if (ordinal == 3) {
            view.setTranslationX(getWidth());
        } else if (ordinal == 4) {
            view.setTranslationX(-getWidth());
        }
        if (pushDirection == com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.e0.f197016d) {
            post(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.f0(this));
        } else {
            android.view.View m57147xe31b1842 = m57147xe31b1842();
            if (m57147xe31b1842 != null) {
                android.view.ViewPropertyAnimator animate = m57147xe31b1842.animate();
                int ordinal2 = pushDirection.ordinal();
                if (ordinal2 == 1) {
                    animate.translationY(-getHeight());
                } else if (ordinal2 == 2) {
                    animate.translationY(getHeight());
                } else if (ordinal2 == 3) {
                    animate.translationX(-getWidth());
                } else if (ordinal2 == 4) {
                    animate.translationX(getWidth());
                }
                animate.setListener(null);
                animate.setDuration(j17);
                animate.start();
            }
            android.view.View m57148xe818afd2 = m57148xe818afd2();
            if (m57148xe818afd2 != null) {
                android.view.ViewPropertyAnimator animate2 = m57148xe818afd2.animate();
                animate2.translationX(0.0f);
                animate2.translationY(0.0f);
                animate2.setListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.g0(this));
                animate2.setDuration(j17);
                animate2.start();
            }
        }
        return true;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14289xc04495d2(android.content.Context context, android.util.AttributeSet attrs, int i17) {
        super(context, attrs, i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attrs, "attrs");
    }
}
