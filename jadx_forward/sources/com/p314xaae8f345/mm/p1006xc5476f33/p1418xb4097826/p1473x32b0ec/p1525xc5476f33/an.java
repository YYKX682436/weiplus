package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33;

/* loaded from: classes3.dex */
public final class an extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn f193440d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public an(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar) {
        super(0);
        this.f193440d = bnVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1525xc5476f33.bn bnVar = this.f193440d;
        if (bnVar.f193585p.getVisibility() == 0 && bnVar.f193585p.f()) {
            android.view.View view = bnVar.f193586q;
            if (view.getVisibility() != 0) {
                android.view.View view2 = bnVar.f193586q;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                arrayList.add(0);
                java.util.Collections.reverse(arrayList);
                yj0.a.d(view2, arrayList.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                view2.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                yj0.a.f(view2, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
                android.view.View view3 = bnVar.f193586q;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.add(java.lang.Float.valueOf(0.0f));
                java.util.Collections.reverse(arrayList2);
                yj0.a.d(view3, arrayList2.toArray(), "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                view3.setAlpha(((java.lang.Float) arrayList2.get(0)).floatValue());
                yj0.a.f(view3, "com/tencent/mm/plugin/finder/live/plugin/FinderLiveGiftPlayPlugin$tryShowHideTip$1", "invoke", "()V", "android/view/View_EXEC_", "setAlpha", "(F)V");
                android.view.ViewPropertyAnimator duration = view.animate().alpha(1.0f).setDuration(200L);
                bnVar.f193587r = duration;
                if (duration != null) {
                    duration.start();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
