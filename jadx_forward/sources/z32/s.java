package z32;

/* loaded from: classes12.dex */
public final class s extends com.p314xaae8f345.mm.ui.p2687xac8f1cfd.AbstractC22275x3ce1d8c9 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f551468d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f551469e;

    /* renamed from: f, reason: collision with root package name */
    public r45.rq3 f551470f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f551471g;

    /* renamed from: h, reason: collision with root package name */
    public r45.ed6 f551472h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f551471g = new java.util.LinkedList();
    }

    public final void O6(android.widget.TextView textView, float f17) {
        android.app.Activity context = m80379x76847179();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        java.lang.Object systemService = context.getSystemService("window");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        android.util.DisplayMetrics displayMetrics = new android.util.DisplayMetrics();
        android.view.Display defaultDisplay = ((android.view.WindowManager) systemService).getDefaultDisplay();
        if (defaultDisplay != null) {
            defaultDisplay.getMetrics(displayMetrics);
        }
        textView.setTextSize(1, (f17 * displayMetrics.density) / context.getResources().getDisplayMetrics().density);
    }
}
