package et4;

/* loaded from: classes9.dex */
public class i extends com.p314xaae8f345.mm.ui.p2747xd1075a44.p2757xb099fd48.k2 {

    /* renamed from: d, reason: collision with root package name */
    public android.view.ViewGroup f338149d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f338150e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.ViewGroup f338151f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.TextView f338152g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f338153h;

    /* renamed from: i, reason: collision with root package name */
    public final android.content.Context f338154i;

    /* renamed from: m, reason: collision with root package name */
    public com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56 f338155m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05 f338156n;

    /* renamed from: o, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19098xdf4bc178 f338157o;

    /* renamed from: p, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19091x9511676c f338158p;

    /* renamed from: q, reason: collision with root package name */
    public int f338159q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f338160r;

    /* renamed from: s, reason: collision with root package name */
    public int f338161s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f338162t;

    /* renamed from: u, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m f338163u;

    /* renamed from: v, reason: collision with root package name */
    public et4.h f338164v;

    /* renamed from: w, reason: collision with root package name */
    public final et4.h0 f338165w;

    public i(android.content.Context context) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f576324wd);
        this.f338153h = new java.util.ArrayList();
        this.f338155m = new com.p314xaae8f345.mm.p2470x93e71c27.p2492xd09a53f9.C19760x34448d56();
        this.f338156n = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2369x633fb29.C19099x8d444f05();
        this.f338162t = true;
        this.f338165w = new et4.a(this);
        this.f338154i = context;
        android.view.ViewGroup viewGroup = (android.view.ViewGroup) android.view.View.inflate(getContext(), com.p314xaae8f345.mm.R.C30864xbddafb2a.d8y, null);
        this.f338149d = viewGroup;
        this.f338150e = (android.widget.ImageView) viewGroup.findViewById(com.p314xaae8f345.mm.R.id.pop);
        this.f338151f = (android.view.ViewGroup) this.f338149d.findViewById(com.p314xaae8f345.mm.R.id.pom);
        this.f338152g = (android.widget.TextView) this.f338149d.findViewById(com.p314xaae8f345.mm.R.id.por);
        android.widget.ImageView imageView = this.f338150e;
        int i17 = com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.ui.p2371x21146ac3.DialogC19129x966bbd2f.f261731y0;
        com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q(imageView, i17, i17, i17, i17);
        this.f338150e.setOnClickListener(new et4.d(this));
        setContentView(this.f338149d);
        setCanceledOnTouchOutside(false);
        setOnCancelListener(new et4.b(this));
        setOnDismissListener(new et4.c(this));
        this.f338163u = new com.p314xaae8f345.mm.p1006xc5476f33.p2365xd031a825.p2374x6a710b1.m();
    }

    @Override // android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        if (this.f338155m == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WcPayCashierBankcardDialog", "pay info is null!!");
            dismiss();
        }
        com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n1.d(7, 0);
    }
}
