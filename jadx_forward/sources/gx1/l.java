package gx1;

/* loaded from: classes12.dex */
public abstract class l extends gx1.a {

    /* renamed from: x, reason: collision with root package name */
    public static final int f358834x;

    /* renamed from: y, reason: collision with root package name */
    public static final int f358835y;

    /* renamed from: e, reason: collision with root package name */
    public ix1.a f358836e;

    /* renamed from: f, reason: collision with root package name */
    public final android.widget.ImageView f358837f;

    /* renamed from: g, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a f358838g;

    /* renamed from: h, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a f358839h;

    /* renamed from: i, reason: collision with root package name */
    public final android.widget.LinearLayout f358840i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f358841m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.TextView f358842n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.ImageView f358843o;

    /* renamed from: p, reason: collision with root package name */
    public final android.view.View f358844p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.LinearLayout f358845q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.LinearLayout f358846r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.LinearLayout f358847s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.LinearLayout f358848t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.LinearLayout f358849u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.LinearLayout f358850v;

    /* renamed from: w, reason: collision with root package name */
    public final android.view.View.OnClickListener f358851w;

    static {
        float f17 = android.content.res.Resources.getSystem().getDisplayMetrics().density;
        f358834x = android.content.res.Resources.getSystem().getDisplayMetrics().widthPixels;
        f358835y = (int) ((f17 * 40.0f) + 0.5f);
    }

    public l(android.view.View view, nx1.z zVar) {
        super(view, zVar);
        this.f358851w = new gx1.k(this);
        this.f358837f = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.d67);
        this.f358844p = view.findViewById(com.p314xaae8f345.mm.R.id.f569077oy4);
        this.f358840i = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kea);
        this.f358845q = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567698kf3);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.keb);
        this.f358841m = textView;
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.ke9);
        this.f358842n = textView2;
        this.f358843o = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.ke_);
        textView.setTextSize(16.0f);
        textView2.setTextSize(12.0f);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567696kf1);
        this.f358846r = linearLayout;
        linearLayout.setVisibility(8);
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.keu)).setVisibility(8);
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.ke8)).setVisibility(8);
        android.widget.LinearLayout linearLayout2 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kmx);
        this.f358848t = linearLayout2;
        linearLayout2.setBackgroundColor(1347529272);
        linearLayout2.setVisibility(8);
        linearLayout2.setOnClickListener(new gx1.h(this));
        android.widget.LinearLayout linearLayout3 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.kn7);
        this.f358849u = linearLayout3;
        linearLayout3.setBackgroundColor(1347529272);
        linearLayout3.setVisibility(4);
        android.widget.LinearLayout linearLayout4 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f567749kn1);
        this.f358850v = linearLayout4;
        linearLayout4.setBackgroundColor(1347529272);
        linearLayout4.setVisibility(4);
        android.widget.LinearLayout linearLayout5 = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.d77);
        this.f358847s = linearLayout5;
        android.widget.RelativeLayout.LayoutParams layoutParams = (android.widget.RelativeLayout.LayoutParams) linearLayout5.getLayoutParams();
        layoutParams.width = f358834x - f358835y;
        layoutParams.height = -2;
        linearLayout5.setLayoutParams(layoutParams);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azq);
        this.f358839h = c13158x154ec45a;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = (com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a) view.findViewById(com.p314xaae8f345.mm.R.id.azt);
        this.f358838g = c13158x154ec45a2;
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.azr)).setOnClickListener(new gx1.i(this));
        ((android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.azu)).setOnClickListener(new gx1.j(this));
        c13158x154ec45a.m54596xf2d19fb3(2);
        c13158x154ec45a2.m54596xf2d19fb3(1);
        c13158x154ec45a2.E = this;
        c13158x154ec45a.E = this;
        this.f358824d.f(c13158x154ec45a2);
        this.f358824d.f(c13158x154ec45a);
    }

    @Override // gx1.a
    public void j(ix1.a aVar, int i17, int i18) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.EditorOtherItemHolder", "ImageItemHolder position is %d, editable:%b", java.lang.Integer.valueOf(m8186xceeefb69()), java.lang.Boolean.valueOf(this.f358824d.f422867d));
        this.f358836e = aVar;
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a = this.f358838g;
        c13158x154ec45a.m54598xaf1e83df(i17);
        com.p314xaae8f345.mm.p1006xc5476f33.p1336xac8f1cfd.p1337xb20c216d.p1339x633fb29.p1340xb9121c89.p1341x31c90fad.C13158x154ec45a c13158x154ec45a2 = this.f358839h;
        c13158x154ec45a2.m54598xaf1e83df(i17);
        if (ox1.s.K) {
            ox1.s.h().D(this.f358848t, this.f358849u, this.f358850v, i17);
        }
        aVar.f376847d = c13158x154ec45a;
        aVar.f376848e = c13158x154ec45a2;
        aVar.f376849f = null;
        if (!aVar.f376845b) {
            if (c13158x154ec45a.hasFocus()) {
                c13158x154ec45a.clearFocus();
            }
            if (c13158x154ec45a2.hasFocus()) {
                c13158x154ec45a2.clearFocus();
            }
        } else if (aVar.f376850g) {
            c13158x154ec45a.requestFocus();
        } else {
            c13158x154ec45a2.requestFocus();
        }
        android.widget.LinearLayout linearLayout = this.f358840i;
        if (linearLayout.getVisibility() == 0) {
            if (aVar.f376851h) {
                linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562912rq);
            } else {
                linearLayout.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562911rp);
            }
        }
    }
}
