package wv1;

/* loaded from: classes12.dex */
public class r extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ int f531505t = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.widget.LinearLayout f531506d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f531507e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.TextView f531508f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f531509g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.CheckBox f531510h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f531511i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f531512m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f531513n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f531514o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.TextView f531515p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ProgressBar f531516q;

    /* renamed from: r, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda f531517r;

    /* renamed from: s, reason: collision with root package name */
    public final android.view.View f531518s;

    public r(android.view.View view) {
        super(view);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.cgc);
        this.f531506d = linearLayout;
        this.f531507e = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.a_4);
        this.f531508f = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.k3s);
        this.f531509g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.o7z);
        this.f531510h = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.mie);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.f568346mj2);
        this.f531511i = findViewById;
        this.f531512m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.dhh);
        this.f531513n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.h6y);
        this.f531514o = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.odf);
        this.f531515p = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.cwk);
        this.f531517r = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) view.findViewById(com.p314xaae8f345.mm.R.id.d4_);
        this.f531516q = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.imb);
        this.f531518s = view.findViewById(com.p314xaae8f345.mm.R.id.d0v);
        linearLayout.setOnClickListener(new wv1.p(this));
        findViewById.setOnClickListener(new wv1.q(this));
    }
}
