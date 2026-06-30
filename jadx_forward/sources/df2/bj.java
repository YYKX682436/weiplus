package df2;

/* loaded from: classes3.dex */
public final class bj implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.oj f311347d;

    public bj(df2.oj ojVar) {
        this.f311347d = ojVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$bubbleRoot$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        ((mm2.c1) this.f311347d.m56788xbba4bfc0(mm2.c1.class)).J2.mo7808x76db6cb1(java.lang.Boolean.FALSE);
        yj0.a.i(true, this, "com/tencent/mm/plugin/finder/live/controller/LiveGameTeamUpController$bubbleRoot$1$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
