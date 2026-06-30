package z35;

/* loaded from: classes4.dex */
public final class r0 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 f551573d;

    public r0(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110 c19719xa864b110) {
        this.f551573d = c19719xa864b110;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        int i17 = com.p314xaae8f345.mm.p2470x93e71c27.ui.p2486x75877a9b.C19719xa864b110.U;
        boolean l17 = this.f551573d.l(motionEvent);
        yj0.a.i(l17, this, "com/tencent/mm/pluginsdk/ui/seekbar/SuspendableHeroSeekBarView$2", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return l17;
    }
}
