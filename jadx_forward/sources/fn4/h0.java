package fn4;

/* loaded from: classes15.dex */
public class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f346071a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f346072b;

    /* renamed from: d, reason: collision with root package name */
    public android.view.GestureDetector f346074d;

    /* renamed from: e, reason: collision with root package name */
    public final fn4.c f346075e;

    /* renamed from: f, reason: collision with root package name */
    public float f346076f;

    /* renamed from: c, reason: collision with root package name */
    public fn4.g0 f346073c = fn4.g0.None;

    /* renamed from: g, reason: collision with root package name */
    public int f346077g = 0;

    /* renamed from: h, reason: collision with root package name */
    public float f346078h = 0.0f;

    /* renamed from: i, reason: collision with root package name */
    public int f346079i = -1;

    /* renamed from: j, reason: collision with root package name */
    public int f346080j = 0;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.Runnable f346081k = new fn4.e0(this);

    public h0(android.content.Context context, android.view.View view, fn4.c cVar) {
        this.f346076f = 0.0f;
        this.f346071a = context;
        this.f346075e = cVar;
        this.f346072b = view;
        this.f346074d = new android.view.GestureDetector(context, new fn4.f0(this));
        this.f346076f = vv4.e1.b(context);
    }

    public void a(android.view.MotionEvent motionEvent) {
        fn4.c cVar = this.f346075e;
        boolean g17 = cVar.g();
        fn4.g0 g0Var = fn4.g0.None;
        if (!g17) {
            this.f346073c = g0Var;
            return;
        }
        int actionMasked = motionEvent.getActionMasked();
        android.content.Context context = this.f346071a;
        if (actionMasked == 0) {
            this.f346078h = motionEvent.getRawX();
            this.f346077g = ((android.media.AudioManager) context.getSystemService("audio")).getStreamVolume(3);
            this.f346076f = vv4.e1.b(context);
        }
        android.view.GestureDetector gestureDetector = this.f346074d;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(motionEvent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(gestureDetector, arrayList.toArray(), "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        yj0.a.g(gestureDetector, gestureDetector.onTouchEvent((android.view.MotionEvent) arrayList.get(0)), "com/tencent/mm/plugin/topstory/ui/video/TopStoryGestureController", "handleTouchEvent", "(Landroid/view/MotionEvent;)V", "android/view/GestureDetector_EXEC_", "onTouchEvent", "(Landroid/view/MotionEvent;)Z");
        if (actionMasked == 1 || actionMasked == 3) {
            fn4.g0 g0Var2 = this.f346073c;
            if (g0Var2 == fn4.g0.FastBackwardOrForward) {
                cVar.f(this.f346080j, motionEvent.getRawX() - this.f346078h);
                this.f346079i = -1;
                this.f346080j = 0;
                this.f346078h = 0.0f;
            } else if (g0Var2 == fn4.g0.Volume) {
                cVar.b(this.f346077g / ((android.media.AudioManager) context.getSystemService("audio")).getStreamMaxVolume(3));
            } else if (g0Var2 == fn4.g0.Brightness) {
                cVar.e(this.f346076f);
            }
            this.f346073c = g0Var;
        }
    }
}
