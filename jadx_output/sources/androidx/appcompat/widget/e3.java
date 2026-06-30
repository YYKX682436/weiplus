package androidx.appcompat.widget;

/* loaded from: classes14.dex */
public class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f9568a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f9569b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f9570c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f9571d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f9572e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f9573f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f9574g;

    public e3(android.content.Context context) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        this.f9571d = layoutParams;
        this.f9572e = new android.graphics.Rect();
        this.f9573f = new int[2];
        this.f9574g = new int[2];
        this.f9568a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.tencent.mm.R.layout.f487904b5, (android.view.ViewGroup) null);
        this.f9569b = inflate;
        this.f9570c = (android.widget.TextView) inflate.findViewById(com.tencent.mm.R.id.ji9);
        layoutParams.setTitle(androidx.appcompat.widget.e3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = com.tencent.mm.R.style.f493918k;
        layoutParams.flags = 24;
    }
}
