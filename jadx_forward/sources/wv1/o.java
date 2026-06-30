package wv1;

/* loaded from: classes12.dex */
public class o extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: s, reason: collision with root package name */
    public static final /* synthetic */ int f531491s = 0;

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f531492d;

    /* renamed from: e, reason: collision with root package name */
    public final android.widget.ImageView f531493e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda f531494f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f531495g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.TextView f531496h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f531497i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f531498m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.ImageView f531499n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.CheckBox f531500o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f531501p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.ProgressBar f531502q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.ImageView f531503r;

    public o(android.view.View view) {
        super(view);
        this.f531492d = view.findViewById(com.p314xaae8f345.mm.R.id.cgc);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.cl7);
        this.f531493e = imageView;
        this.f531494f = (com.p314xaae8f345.mm.ui.p2747xd1075a44.C22626x3e1b8dda) view.findViewById(com.p314xaae8f345.mm.R.id.d4_);
        this.f531502q = (android.widget.ProgressBar) view.findViewById(com.p314xaae8f345.mm.R.id.imb);
        this.f531497i = view.findViewById(com.p314xaae8f345.mm.R.id.f569095p05);
        this.f531498m = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.p0p);
        this.f531495g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.e2k);
        this.f531496h = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.e2m);
        this.f531499n = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.jc6);
        this.f531500o = (android.widget.CheckBox) view.findViewById(com.p314xaae8f345.mm.R.id.mie);
        android.view.View findViewById = view.findViewById(com.p314xaae8f345.mm.R.id.mke);
        this.f531501p = findViewById;
        this.f531503r = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.dhh);
        imageView.setOnClickListener(new wv1.m(this));
        findViewById.setOnClickListener(new wv1.n(this));
    }
}
