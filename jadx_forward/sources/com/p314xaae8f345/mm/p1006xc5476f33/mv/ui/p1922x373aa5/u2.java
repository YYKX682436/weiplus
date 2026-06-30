package com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5;

/* loaded from: classes10.dex */
public class u2 extends p012xc85e97e9.p103xe821e364.p104xd1075a44.o1 {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 f233493n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6, android.content.Context context) {
        super(context);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f233493n = c16693xf5eb90b6;
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1, p012xc85e97e9.p103xe821e364.p104xd1075a44.g3
    public void e(android.view.View targetView, p012xc85e97e9.p103xe821e364.p104xd1075a44.h3 state, p012xc85e97e9.p103xe821e364.p104xd1075a44.e3 action) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(targetView, "targetView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(state, "state");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6 c16693xf5eb90b6 = this.f233493n;
        boolean z17 = c16693xf5eb90b6.f233229v;
        android.view.animation.DecelerateInterpolator decelerateInterpolator = this.f93709i;
        if (z17) {
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv = c16693xf5eb90b6.getLyricRv();
            int height = lyricRv != null ? lyricRv.getHeight() : 0;
            int top = targetView.getTop();
            int bottom = targetView.getBottom();
            int b17 = i65.a.b(c16693xf5eb90b6.getContext(), 75);
            if (top < b17) {
                int i17 = b17 - top;
                action.b(0, -i17, k(i17), decelerateInterpolator);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "11");
                return;
            } else {
                if (height - bottom < b17) {
                    int i18 = (height - b17) - bottom;
                    action.b(0, -i18, k(i18), decelerateInterpolator);
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "12");
                    if (c16693xf5eb90b6.f233232y) {
                        return;
                    }
                    c16693xf5eb90b6.postDelayed(new com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.t2(c16693xf5eb90b6), 200L);
                    return;
                }
                return;
            }
        }
        if (!c16693xf5eb90b6.f233231x) {
            int[] iArr = new int[2];
            com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv2 = c16693xf5eb90b6.getLyricRv();
            if (lyricRv2 != null) {
                lyricRv2.getLocationInWindow(iArr);
            }
            int height2 = (((int) (c16693xf5eb90b6.getHeight() * 0.73f)) - iArr[1]) - targetView.getTop();
            int i19 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
            int i27 = height2 + com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
            action.b(0, -i27, k(i27), decelerateInterpolator);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "13");
            return;
        }
        int[] iArr2 = new int[2];
        com.p314xaae8f345.mm.p2776x373aa5.p2786xe821e364.C22849x81a93d25 lyricRv3 = c16693xf5eb90b6.getLyricRv();
        if (lyricRv3 != null) {
            lyricRv3.getLocationInWindow(iArr2);
        }
        int height3 = (((int) (c16693xf5eb90b6.getHeight() * com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.L)) - iArr2[1]) - targetView.getTop();
        int i28 = com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
        int i29 = height3 + com.p314xaae8f345.mm.p1006xc5476f33.mv.ui.p1922x373aa5.C16693xf5eb90b6.I;
        action.b(0, -i29, k(i29), decelerateInterpolator);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MusicMvCommentView", "14");
        if (c16693xf5eb90b6.f233232y) {
            return;
        }
        c16693xf5eb90b6.g();
    }

    @Override // p012xc85e97e9.p103xe821e364.p104xd1075a44.o1
    public float j(android.util.DisplayMetrics displayMetrics) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayMetrics, "displayMetrics");
        return 300.0f / displayMetrics.densityDpi;
    }
}
