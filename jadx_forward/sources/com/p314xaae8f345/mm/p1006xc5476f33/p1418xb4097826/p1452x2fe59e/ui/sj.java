package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui;

/* loaded from: classes2.dex */
public final class sj extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14083xc91522bd f192072d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14083xc91522bd activityC14083xc91522bd) {
        super(1);
        this.f192072d = activityC14083xc91522bd;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        android.view.ViewPropertyAnimator translationYBy;
        android.view.ViewPropertyAnimator duration;
        android.view.ViewPropertyAnimator animate;
        android.view.ViewPropertyAnimator translationYBy2;
        android.view.ViewPropertyAnimator duration2;
        android.view.ViewPropertyAnimator animate2;
        android.view.ViewPropertyAnimator translationYBy3;
        android.view.ViewPropertyAnimator duration3;
        android.view.ViewPropertyAnimator animate3;
        android.view.ViewPropertyAnimator translationYBy4;
        android.view.ViewPropertyAnimator duration4;
        in5.s0 it = (in5.s0) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(it, "it");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.ActivityC14083xc91522bd activityC14083xc91522bd = this.f192072d;
        if (!activityC14083xc91522bd.B) {
            android.view.View k76 = activityC14083xc91522bd.k7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(k76, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "popupTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(k76, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "popupTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            float b17 = i65.a.b(activityC14083xc91522bd.mo55332x76847179(), 48);
            android.view.View findViewById = it.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.f566019ee3);
            android.view.View findViewById2 = it.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.g1y);
            android.view.View findViewById3 = it.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.dq6);
            if (findViewById != null && (animate3 = findViewById.animate()) != null && (translationYBy4 = animate3.translationYBy(-b17)) != null && (duration4 = translationYBy4.setDuration(0L)) != null) {
                duration4.start();
            }
            if (findViewById2 != null && (animate2 = findViewById2.animate()) != null && (translationYBy3 = animate2.translationYBy(-b17)) != null && (duration3 = translationYBy3.setDuration(0L)) != null) {
                duration3.start();
            }
            if (findViewById3 != null && (animate = findViewById3.animate()) != null && (translationYBy2 = animate.translationYBy(-b17)) != null && (duration2 = translationYBy2.setDuration(0L)) != null) {
                duration2.start();
            }
            android.widget.TextView textView = activityC14083xc91522bd.A;
            if (textView == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("selectTv");
                throw null;
            }
            android.view.ViewPropertyAnimator animate4 = textView.animate();
            if (animate4 != null && (translationYBy = animate4.translationYBy(-b17)) != null && (duration = translationYBy.setDuration(0L)) != null) {
                duration.start();
            }
        }
        return jz5.f0.f384359a;
    }
}
