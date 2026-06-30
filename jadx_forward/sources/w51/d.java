package w51;

/* loaded from: classes8.dex */
public abstract class d {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f524496d;

    /* renamed from: e, reason: collision with root package name */
    public android.view.ViewGroup f524497e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f524498f;

    /* renamed from: g, reason: collision with root package name */
    public u51.a f524499g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f524500h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.animation.Animation f524501i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.animation.Animation f524502m;

    /* renamed from: n, reason: collision with root package name */
    public final android.view.View.OnKeyListener f524503n = new w51.b(this);

    /* renamed from: o, reason: collision with root package name */
    public final android.view.View.OnTouchListener f524504o = new w51.c(this);

    public d(android.content.Context context) {
        this.f524496d = context;
    }

    public void a() {
        if (c() || this.f524500h) {
            return;
        }
        this.f524501i.setAnimationListener(new w51.a(this));
        this.f524497e.startAnimation(this.f524501i);
        this.f524500h = true;
    }

    public void b() {
        android.widget.FrameLayout.LayoutParams layoutParams = new android.widget.FrameLayout.LayoutParams(-1, -2, 80);
        android.view.LayoutInflater from = android.view.LayoutInflater.from(this.f524496d);
        this.f524499g.getClass();
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) from.inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.bnt, (android.view.ViewGroup) null, false);
        this.f524498f = viewGroup;
        viewGroup.setLayoutParams(new android.widget.FrameLayout.LayoutParams(-1, -1));
        this.f524499g.getClass();
        android.view.ViewGroup viewGroup2 = (android.view.ViewGroup) this.f524498f.findViewById(com.p314xaae8f345.mm.R.id.cgz);
        this.f524497e = viewGroup2;
        viewGroup2.setLayoutParams(layoutParams);
        android.view.ViewGroup viewGroup3 = c() ? null : this.f524498f;
        viewGroup3.setFocusable(true);
        viewGroup3.setFocusableInTouchMode(true);
        viewGroup3.setOnKeyListener(this.f524503n);
    }

    public abstract boolean c();
}
