package th;

/* loaded from: classes14.dex */
public class d implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public float f500769d = 0.0f;

    /* renamed from: e, reason: collision with root package name */
    public float f500770e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    public int f500771f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f500772g = 0;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager.LayoutParams f500773h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ android.view.WindowManager f500774i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ int f500775m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ th.o f500776n;

    public d(th.o oVar, android.view.WindowManager.LayoutParams layoutParams, android.view.WindowManager windowManager, int i17) {
        this.f500776n = oVar;
        this.f500773h = layoutParams;
        this.f500774i = windowManager;
        this.f500775m = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        android.view.WindowManager.LayoutParams layoutParams = this.f500773h;
        if (action == 0) {
            this.f500769d = motionEvent.getX();
            this.f500770e = motionEvent.getY();
            this.f500771f = layoutParams.x;
            this.f500772g = layoutParams.y;
            return false;
        }
        if (action != 1) {
            if (action != 2) {
                return false;
            }
            float x17 = motionEvent.getX();
            float y17 = motionEvent.getY();
            layoutParams.x = (int) (layoutParams.x + ((x17 - this.f500769d) / 3.0f));
            layoutParams.y = (int) (layoutParams.y + ((y17 - this.f500770e) / 3.0f));
            if (view == null) {
                return false;
            }
            this.f500774i.updateViewLayout(view, layoutParams);
            return false;
        }
        int[] iArr = new int[2];
        int i17 = layoutParams.x;
        iArr[0] = i17;
        th.o oVar = this.f500776n;
        iArr[1] = i17 > (oVar.f500796a.widthPixels - oVar.f500800e.getWidth()) / 2 ? oVar.f500796a.widthPixels - oVar.f500800e.getWidth() : 0;
        android.animation.ValueAnimator ofPropertyValuesHolder = android.animation.ValueAnimator.ofPropertyValuesHolder(android.animation.PropertyValuesHolder.ofInt("trans", iArr));
        ofPropertyValuesHolder.addUpdateListener(new th.c(this, view));
        ofPropertyValuesHolder.setInterpolator(new android.view.animation.AccelerateInterpolator());
        ofPropertyValuesHolder.setDuration(180L).start();
        return java.lang.Math.abs(layoutParams.x - this.f500771f) > 20 || java.lang.Math.abs(layoutParams.y - this.f500772g) > 20;
    }
}
