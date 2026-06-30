package cj4;

/* loaded from: classes5.dex */
public final class w implements android.view.View.OnTouchListener {

    /* renamed from: d, reason: collision with root package name */
    public boolean f123576d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ cj4.a0 f123577e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f123578f;

    public w(cj4.a0 a0Var, int i17) {
        this.f123577e = a0Var;
        this.f123578f = i17;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(android.view.View view, android.view.MotionEvent motionEvent) {
        android.widget.ImageView imageView;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        arrayList.add(motionEvent);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z", this, array);
        cj4.a0 a0Var = this.f123577e;
        java.lang.String str = a0Var.D1;
        java.util.Objects.toString(view);
        if (motionEvent != null) {
            motionEvent.getAction();
        }
        java.lang.Integer valueOf = motionEvent != null ? java.lang.Integer.valueOf(motionEvent.getAction()) : null;
        int i17 = this.f123578f;
        boolean z17 = false;
        if (valueOf != null && valueOf.intValue() == 0) {
            float x17 = motionEvent.getX();
            if (x17 >= 0.0f && x17 < i17) {
                z17 = true;
            }
            this.f123576d = z17;
            yj0.a.i(z17, this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return z17;
        }
        if (valueOf == null || valueOf.intValue() != 1) {
            yj0.a.i(false, this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
            return false;
        }
        float x18 = motionEvent.getX();
        if (x18 >= 0.0f && x18 < i17 && this.f123576d) {
            z17 = true;
        }
        if (z17 && (imageView = a0Var.C) != null) {
            imageView.performClick();
        }
        yj0.a.i(z17, this, "com/tencent/mm/plugin/textstatus/logic/BaseProfileLoadLogic$init$3", "android/view/View$OnTouchListener", "onTouch", "(Landroid/view/View;Landroid/view/MotionEvent;)Z");
        return z17;
    }
}
