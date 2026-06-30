package ul1;

/* loaded from: classes7.dex */
public final class d extends android.widget.FrameLayout implements ul1.n, android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.TextView f510098d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.Runnable f510099e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 f510100f;

    /* renamed from: g, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f510101g;

    /* renamed from: h, reason: collision with root package name */
    public android.view.ViewPropertyAnimator f510102h;

    public d(android.content.Context context) {
        super(context);
        this.f510099e = new ul1.a(this);
        this.f510100f = new com.p314xaae8f345.mm.sdk.p2603x2137b148.n3(android.os.Looper.getMainLooper());
        android.view.LayoutInflater.from(context).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569624h1, (android.view.ViewGroup) this, true);
        this.f510098d = (android.widget.TextView) findViewById(com.p314xaae8f345.mm.R.id.obc);
        setOnClickListener(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandNewBanAlert", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        yj0.a.h(this, "com/tencent/mm/plugin/appbrand/widget/prompt/AppBrandNewBanAlert", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
