package com.tencent.mm.plugin.finder.feed.ui;

/* loaded from: classes2.dex */
public final class sj extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI f110539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sj(com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI finderRingtoneTimelineUI) {
        super(1);
        this.f110539d = finderRingtoneTimelineUI;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
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
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.feed.ui.FinderRingtoneTimelineUI finderRingtoneTimelineUI = this.f110539d;
        if (!finderRingtoneTimelineUI.B) {
            android.view.View k76 = finderRingtoneTimelineUI.k7();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f473285a;
            arrayList.add(0);
            java.util.Collections.reverse(arrayList);
            yj0.a.d(k76, arrayList.toArray(), "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "popupTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            k76.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
            yj0.a.f(k76, "com/tencent/mm/plugin/finder/feed/ui/FinderRingtoneTimelineUI", "popupTips", "(Lcom/tencent/mm/view/recyclerview/SimpleViewHolder;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            float b17 = i65.a.b(finderRingtoneTimelineUI.getContext(), 48);
            android.view.View findViewById = it.itemView.findViewById(com.tencent.mm.R.id.f484486ee3);
            android.view.View findViewById2 = it.itemView.findViewById(com.tencent.mm.R.id.g1y);
            android.view.View findViewById3 = it.itemView.findViewById(com.tencent.mm.R.id.dq6);
            if (findViewById != null && (animate3 = findViewById.animate()) != null && (translationYBy4 = animate3.translationYBy(-b17)) != null && (duration4 = translationYBy4.setDuration(0L)) != null) {
                duration4.start();
            }
            if (findViewById2 != null && (animate2 = findViewById2.animate()) != null && (translationYBy3 = animate2.translationYBy(-b17)) != null && (duration3 = translationYBy3.setDuration(0L)) != null) {
                duration3.start();
            }
            if (findViewById3 != null && (animate = findViewById3.animate()) != null && (translationYBy2 = animate.translationYBy(-b17)) != null && (duration2 = translationYBy2.setDuration(0L)) != null) {
                duration2.start();
            }
            android.widget.TextView textView = finderRingtoneTimelineUI.A;
            if (textView == null) {
                kotlin.jvm.internal.o.o("selectTv");
                throw null;
            }
            android.view.ViewPropertyAnimator animate4 = textView.animate();
            if (animate4 != null && (translationYBy = animate4.translationYBy(-b17)) != null && (duration = translationYBy.setDuration(0L)) != null) {
                duration.start();
            }
        }
        return jz5.f0.f302826a;
    }
}
