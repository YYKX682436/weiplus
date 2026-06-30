package j53;

/* loaded from: classes10.dex */
public class e implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.ActivityC15916xd0c73bc8 f379342d;

    public e(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.ActivityC15916xd0c73bc8 activityC15916xd0c73bc8) {
        this.f379342d = activityC15916xd0c73bc8;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/game/media/background/GameFakeVideoUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1750x62f6fe4.p1751xb098552e.ActivityC15916xd0c73bc8 activityC15916xd0c73bc8 = this.f379342d;
        activityC15916xd0c73bc8.f221640m.d(activityC15916xd0c73bc8.f221634d, activityC15916xd0c73bc8.f221636f, false, new j53.h(activityC15916xd0c73bc8), null);
        yj0.a.i(true, this, "com/tencent/mm/plugin/game/media/background/GameFakeVideoUI$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
