package bp2;

/* loaded from: classes3.dex */
public final class a implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bp2.i f23045d;

    public a(bp2.i iVar) {
        this.f23045d = iVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.tencent.mars.xlog.Log.i("FinderLiveCardPreViewAnimationHelper", "attachFloatView onTouch");
        bp2.i iVar = this.f23045d;
        bp2.i.a(iVar);
        android.widget.RelativeLayout relativeLayout = iVar.f23058h;
        if (relativeLayout != null) {
            relativeLayout.setOnTouchListener(null);
        }
        yj0.a.i(false, this, "com/tencent/mm/plugin/finder/nearby/guide/FinderLiveCardPreViewAnimationHelper$attachFloatView$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return false;
    }
}
