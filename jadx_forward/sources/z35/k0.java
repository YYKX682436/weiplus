package z35;

/* loaded from: classes4.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 f551549d;

    public k0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46) {
        this.f551549d = c19718xcf23ab46;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19718xcf23ab46 c19718xcf23ab46 = this.f551549d;
        android.view.View m75666xfee3d4b = c19718xcf23ab46.m75666xfee3d4b();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(4);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(m75666xfee3d4b, arrayList.toArray(), "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$onUserOperate$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        m75666xfee3d4b.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(m75666xfee3d4b, "com/tencent/mm/pluginsdk/ui/seekbar/HeroSeekBarView$onUserOperate$1", "run", "()V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        c19718xcf23ab46.m75652xa19403eb().setVisibility(4);
        c19718xcf23ab46.j(c19718xcf23ab46.getCom.google.android.gms.common.internal.ImagesContract.LOCAL java.lang.String(), false);
        c19718xcf23ab46.m75682xb0dabe1c(true);
        z35.g0 visibleChangeListener = c19718xcf23ab46.getVisibleChangeListener();
        if (visibleChangeListener != null) {
            visibleChangeListener.a(false);
        }
    }
}
