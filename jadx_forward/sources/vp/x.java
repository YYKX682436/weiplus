package vp;

/* loaded from: classes10.dex */
public class x implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final vp.w0 f520385d;

    public x(android.view.View view, xp.d dVar, boolean z17) {
        if (z17) {
            this.f520385d = new vp.k(view, dVar);
        } else {
            this.f520385d = new vp.d(view, dVar);
        }
    }

    public void f(boolean z17) {
        this.f520385d.f(z17);
    }

    public wp.a f5(int i17, java.lang.Object obj) {
        return this.f520385d.f5(i17, obj);
    }

    /* renamed from: isPlaying */
    public boolean m172424xc00617a4() {
        return this.f520385d.mo172409xc00617a4();
    }

    public void j5() {
        this.f520385d.j5();
    }

    public void n(long j17) {
        this.f520385d.n(j17);
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/danmaku/core/DanmakuManager", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        boolean onTouch = this.f520385d.onTouch(view, motionEvent);
        yj0.a.i(onTouch, this, "com/tencent/mm/danmaku/core/DanmakuManager", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return onTouch;
    }

    public boolean y5(android.graphics.Point point, int i17) {
        return this.f520385d.y5(point, i17);
    }
}
