package p012xc85e97e9.p016x746ad0e3.p019xd1075a44;

/* loaded from: classes14.dex */
public class e3 {

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f91101a;

    /* renamed from: b, reason: collision with root package name */
    public final android.view.View f91102b;

    /* renamed from: c, reason: collision with root package name */
    public final android.widget.TextView f91103c;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.WindowManager.LayoutParams f91104d;

    /* renamed from: e, reason: collision with root package name */
    public final android.graphics.Rect f91105e;

    /* renamed from: f, reason: collision with root package name */
    public final int[] f91106f;

    /* renamed from: g, reason: collision with root package name */
    public final int[] f91107g;

    public e3(android.content.Context context) {
        android.view.WindowManager.LayoutParams layoutParams = new android.view.WindowManager.LayoutParams();
        this.f91104d = layoutParams;
        this.f91105e = new android.graphics.Rect();
        this.f91106f = new int[2];
        this.f91107g = new int[2];
        this.f91101a = context;
        android.view.View inflate = android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569437b5, (android.view.ViewGroup) null);
        this.f91102b = inflate;
        this.f91103c = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.ji9);
        layoutParams.setTitle(p012xc85e97e9.p016x746ad0e3.p019xd1075a44.e3.class.getSimpleName());
        layoutParams.packageName = context.getPackageName();
        layoutParams.type = 1002;
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.windowAnimations = com.p314xaae8f345.mm.R.C30868x68b1db1.f575451k;
        layoutParams.flags = 24;
    }
}
