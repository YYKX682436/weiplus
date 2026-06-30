package com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5;

/* loaded from: classes9.dex */
public class c0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c f227375d;

    public c0(com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c) {
        this.f227375d = c16344xea85a40c;
    }

    @Override // java.lang.Runnable
    public void run() {
        android.view.View view;
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c c16344xea85a40c = this.f227375d;
        c16344xea85a40c.B1.B(-(c16344xea85a40c.m19973xa8f0dc02() - c16344xea85a40c.f227329z1));
        c16344xea85a40c.f227325y.setAlpha(1.0f);
        if (c16344xea85a40c.i()) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16371xf216ae6d activityC16371xf216ae6d = c16344xea85a40c.U;
            android.view.View view2 = activityC16371xf216ae6d.mToplinkArea;
            if (view2 != null && activityC16371xf216ae6d.f227773z2 != null) {
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view2.setAlpha(((java.lang.Float) arrayList.get(0)).floatValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c16344xea85a40c.U.f227773z2.setVisibility(0);
            }
        } else {
            com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.ui.ActivityC16363x8a0a619d activityC16363x8a0a619d = c16344xea85a40c.V;
            if (activityC16363x8a0a619d != null && (view = activityC16363x8a0a619d.f227644y2) != null && activityC16363x8a0a619d.f227647z2 != null) {
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal2 = zj0.c.f554818a;
                arrayList2.add(java.lang.Float.valueOf(1.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view, "com/tencent/mm/plugin/luckymoney/story/EnvelopeAppBarLayout$8", "run", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                c16344xea85a40c.V.f227647z2.setVisibility(0);
            }
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1820xef4016d8.p1829x68af8f5.C16344xea85a40c.e(c16344xea85a40c);
    }
}
