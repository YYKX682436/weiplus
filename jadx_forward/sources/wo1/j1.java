package wo1;

/* loaded from: classes3.dex */
public final class j1 implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public int f529495d;

    /* renamed from: e, reason: collision with root package name */
    public int f529496e;

    /* renamed from: f, reason: collision with root package name */
    public float f529497f;

    /* renamed from: g, reason: collision with root package name */
    public float f529498g;

    /* renamed from: h, reason: collision with root package name */
    public int f529499h;

    /* renamed from: i, reason: collision with root package name */
    public int f529500i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f529501m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f529502n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ android.view.View f529503o;

    public j1(android.view.WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, android.view.View view) {
        this.f529501m = layoutParams;
        this.f529502n = windowManager;
        this.f529503o = view;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View v17, android.view.MotionEvent event) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(v17);
        arrayList.add(event);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v17, "v");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        int action = event.getAction();
        android.view.WindowManager.LayoutParams layoutParams = this.f529501m;
        if (action == 0) {
            this.f529495d = layoutParams.x;
            this.f529496e = layoutParams.y;
            this.f529497f = event.getRawX();
            this.f529498g = event.getRawY();
            int[] t17 = pm0.v.t(v17);
            this.f529499h = t17[0];
            this.f529500i = t17[1];
            yj0.a.i(true, this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return true;
        }
        if (action != 2) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        int rawX = (int) (event.getRawX() - this.f529497f);
        int rawY = (int) (event.getRawY() - this.f529498g);
        int i17 = this.f529495d;
        int i18 = i17 - rawX;
        if (i18 <= 0) {
            i18 = 0;
        }
        layoutParams.x = i18;
        int i19 = this.f529499h;
        if (i19 < (-rawX)) {
            layoutParams.x = i17 + i19;
        }
        int i27 = this.f529496e;
        int i28 = i27 - rawY;
        layoutParams.y = i28 > 0 ? i28 : 0;
        int i29 = this.f529500i;
        if (i29 < (-rawY)) {
            layoutParams.y = i27 + i29;
        }
        this.f529502n.updateViewLayout(this.f529503o, layoutParams);
        yj0.a.i(true, this, "com/tencent/mm/plugin/backup/roambackup/ui/component/RoamFloatWindowHelper$showImpl$1", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return true;
    }
}
