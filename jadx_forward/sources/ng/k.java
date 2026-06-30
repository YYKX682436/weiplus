package ng;

/* loaded from: classes5.dex */
public class k {

    /* renamed from: a, reason: collision with root package name */
    public android.view.GestureDetector f418426a;

    public k(android.content.Context context, ng.j jVar) {
        android.view.ViewConfiguration viewConfiguration = android.view.ViewConfiguration.get(context);
        viewConfiguration.getScaledTouchSlop();
        viewConfiguration.getScaledMinimumScalingSpan();
        if (context.getApplicationInfo().targetSdkVersion <= 18 || this.f418426a != null) {
            return;
        }
        this.f418426a = new android.view.GestureDetector(context, new ng.i(this), null);
    }
}
