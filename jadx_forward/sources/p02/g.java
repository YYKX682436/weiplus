package p02;

/* loaded from: classes8.dex */
public class g extends p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 {

    /* renamed from: d, reason: collision with root package name */
    public final android.view.View f431911d;

    /* renamed from: e, reason: collision with root package name */
    public final android.view.View f431912e;

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f431913f;

    /* renamed from: g, reason: collision with root package name */
    public final android.widget.TextView f431914g;

    /* renamed from: h, reason: collision with root package name */
    public final android.widget.ImageView f431915h;

    /* renamed from: i, reason: collision with root package name */
    public final android.view.View f431916i;

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.ImageView f431917m;

    /* renamed from: n, reason: collision with root package name */
    public final android.widget.Button f431918n;

    /* renamed from: o, reason: collision with root package name */
    public final android.widget.TextView f431919o;

    /* renamed from: p, reason: collision with root package name */
    public final android.widget.LinearLayout f431920p;

    /* renamed from: q, reason: collision with root package name */
    public final android.widget.TextView f431921q;

    /* renamed from: r, reason: collision with root package name */
    public final android.widget.TextView f431922r;

    /* renamed from: s, reason: collision with root package name */
    public final android.widget.TextView f431923s;

    /* renamed from: t, reason: collision with root package name */
    public final android.widget.TextView f431924t;

    /* renamed from: u, reason: collision with root package name */
    public final android.widget.TextView f431925u;

    /* renamed from: v, reason: collision with root package name */
    public final android.widget.TextView f431926v;

    /* renamed from: w, reason: collision with root package name */
    public final android.widget.TextView f431927w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ p02.h f431928x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p02.h hVar, android.view.View view) {
        super(view);
        this.f431928x = hVar;
        this.f431911d = view;
        this.f431912e = view.findViewById(com.p314xaae8f345.mm.R.id.f568299me4);
        ((android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.h0i)).setOnClickListener(new p02.a(this, hVar));
        this.f431913f = view.findViewById(com.p314xaae8f345.mm.R.id.me8);
        this.f431914g = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.men);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.mdv);
        this.f431915h = imageView;
        imageView.setOnClickListener(new p02.b(this, hVar));
        this.f431916i = view.findViewById(com.p314xaae8f345.mm.R.id.mfe);
        this.f431917m = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.f564761a15);
        android.widget.Button button = (android.widget.Button) view.findViewById(com.p314xaae8f345.mm.R.id.hh9);
        this.f431918n = button;
        button.setOnClickListener(new p02.c(this, hVar));
        this.f431919o = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a1p);
        this.f431920p = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.f564764a21);
        this.f431921q = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.a1x);
        this.f431922r = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gkx);
        this.f431923s = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.f566664go0);
        this.f431924t = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.gpg);
        this.f431925u = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l5k);
        this.f431926v = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.l5w);
        this.f431927w = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.qeu);
    }

    public final void i(int i17) {
        p02.h hVar = this.f431928x;
        android.widget.Button button = this.f431918n;
        if (i17 == com.p314xaae8f345.mm.R.C30867xcad56011.g1c) {
            button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562593jo);
            button.setTextColor(b3.l.m9702x7444d5ad(hVar.f431929d, com.p314xaae8f345.mm.R.C30859x5a72f63.aaw));
        } else {
            button.setBackgroundResource(com.p314xaae8f345.mm.R.C30861xcebc809e.f562601jy);
            button.setTextColor(b3.l.m9702x7444d5ad(hVar.f431929d, com.p314xaae8f345.mm.R.C30859x5a72f63.f77742x25702ef));
        }
        button.setText(i17);
    }
}
