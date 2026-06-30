package p10;

/* loaded from: classes8.dex */
public final class k implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 f432497d;

    public k(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3) {
        this.f432497d = c10541x905158a3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createSwipeButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.C10541x905158a3 c10541x905158a3 = this.f432497d;
        if (c10541x905158a3.f147360t == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicDebugPanelView", "simulateSwipe failed: parentView is null");
        } else {
            android.util.DisplayMetrics displayMetrics = c10541x905158a3.getContext().getResources().getDisplayMetrics();
            float f17 = displayMetrics.widthPixels / 2.0f;
            float f18 = displayMetrics.heightPixels / 2.0f;
            long j17 = (f18 / c10541x905158a3.f147361u) * 1000;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicDebugPanelView", "simulateSwipe: startX=" + f17 + ", startY=" + f18 + ", endX=" + f17 + ", endY=0.0, distance=" + f18 + "px, duration=" + j17 + "ms, speed=" + c10541x905158a3.f147361u + " px/s");
            if (c10541x905158a3.f147360t == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicDebugPanelView", "postSwipeEvents failed: parentView is null");
            } else {
                c10541x905158a3.c(0, f17, f18);
                android.animation.ValueAnimator ofFloat = android.animation.ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.setDuration(j17);
                ofFloat.addUpdateListener(new p10.q(f17, f17, f18, 0.0f, c10541x905158a3));
                ofFloat.addListener(new p10.r(c10541x905158a3, f17, 0.0f));
                ofFloat.start();
            }
        }
        yj0.a.h(this, "com/tencent/mm/feature/ecs/nirvana/ui/MagicDebugPanelView$createSwipeButton$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
