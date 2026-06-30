package bp2;

/* loaded from: classes2.dex */
public final class m {

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f23074c;

    /* renamed from: d, reason: collision with root package name */
    public android.view.View f23075d;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment f23077f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f23078g;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.Runnable f23081j;

    /* renamed from: a, reason: collision with root package name */
    public final int f23072a = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.B).getValue()).r()).intValue();

    /* renamed from: b, reason: collision with root package name */
    public final int f23073b = ((java.lang.Number) ((lb2.j) ((jz5.n) ae2.b2.C).getValue()).r()).intValue();

    /* renamed from: e, reason: collision with root package name */
    public final int[] f23076e = new int[2];

    /* renamed from: h, reason: collision with root package name */
    public final android.view.GestureDetector f23079h = new android.view.GestureDetector(new bp2.k(this));

    /* renamed from: i, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f23080i = new com.tencent.mm.sdk.platformtools.n3(android.os.Looper.getMainLooper());

    public static final boolean a(bp2.m mVar, android.view.MotionEvent motionEvent) {
        mVar.getClass();
        float rawX = motionEvent != null ? motionEvent.getRawX() : 0.0f;
        if (motionEvent != null) {
            motionEvent.getRawY();
        }
        android.view.View view = mVar.f23075d;
        int width = view != null ? view.getWidth() : 0;
        android.view.View view2 = mVar.f23075d;
        kotlin.jvm.internal.o.d(view2);
        return rawX < ((float) width) - view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn) && rawX > 0.0f;
    }

    public static final boolean b(bp2.m mVar, android.view.MotionEvent motionEvent) {
        mVar.getClass();
        float rawX = motionEvent != null ? motionEvent.getRawX() : 0.0f;
        if (motionEvent != null) {
            motionEvent.getRawY();
        }
        android.view.View view = mVar.f23075d;
        int width = view != null ? view.getWidth() : 0;
        android.view.View view2 = mVar.f23075d;
        kotlin.jvm.internal.o.d(view2);
        float f17 = width;
        return rawX > f17 - view2.getContext().getResources().getDimension(com.tencent.mm.R.dimen.f479731dn) && rawX < f17;
    }

    public static final boolean c(bp2.m mVar, android.view.MotionEvent motionEvent) {
        mVar.getClass();
        if (motionEvent != null) {
            motionEvent.getRawX();
        }
        return (motionEvent != null ? motionEvent.getRawY() : 0.0f) < ((float) mVar.f23076e[1]);
    }

    public static final void d(bp2.m mVar) {
        r45.dd2 dd2Var;
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment nearbyLiveSquareTabFragment = mVar.f23077f;
        if (nearbyLiveSquareTabFragment == null) {
            return;
        }
        androidx.fragment.app.Fragment parentFragment = nearbyLiveSquareTabFragment.getParentFragment();
        kotlin.jvm.internal.o.d(parentFragment);
        com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC nearbyLiveSquareUIC = (com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC) pf5.z.f353948a.b(parentFragment).a(com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.class);
        com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment P6 = nearbyLiveSquareUIC.P6();
        java.util.Iterator it = nearbyLiveSquareUIC.f121501o.iterator();
        int i17 = 0;
        while (true) {
            if (!it.hasNext()) {
                i17 = -1;
                break;
            } else {
                if ((P6 == null || (dd2Var = P6.f121519s) == null || dd2Var.getInteger(0) != ((com.tencent.mm.plugin.finder.nearby.live.square.page.NearbyLiveSquareTabFragment) it.next()).f121519s.getInteger(0)) ? false : true) {
                    break;
                } else {
                    i17++;
                }
            }
        }
        com.tencent.mm.plugin.finder.nearby.live.square.NearbyLiveSquareUIC.T6(nearbyLiveSquareUIC, i17 + 1, false, null, 6, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void e() {
        /*
            Method dump skipped, instructions count: 301
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bp2.m.e():void");
    }

    public final void f(int i17, int i18, int i19) {
        try {
            java.lang.Class cls = java.lang.Integer.TYPE;
            java.lang.reflect.Method declaredMethod = androidx.viewpager.widget.ViewPager.class.getDeclaredMethod("smoothScrollTo", cls, cls, cls);
            declaredMethod.setAccessible(true);
            android.view.View view = this.f23075d;
            kotlin.jvm.internal.o.e(view, "null cannot be cast to non-null type androidx.viewpager.widget.ViewPager");
            declaredMethod.invoke((androidx.viewpager.widget.ViewPager) view, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("FinderLivePageScrollGuideHelper", "smoothScrollTo " + e17.getMessage());
        }
    }
}
