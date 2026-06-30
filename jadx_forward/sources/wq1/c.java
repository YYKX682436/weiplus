package wq1;

/* loaded from: classes8.dex */
public class c extends p012xc85e97e9.p016x746ad0e3.app.i0 implements wq1.d {

    /* renamed from: f, reason: collision with root package name */
    public final r45.sn f530035f;

    /* renamed from: g, reason: collision with root package name */
    public android.widget.FrameLayout f530036g;

    /* renamed from: h, reason: collision with root package name */
    public xq1.f f530037h;

    /* renamed from: i, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee f530038i;

    /* renamed from: m, reason: collision with root package name */
    public xq1.b f530039m;

    public c(android.content.Context context, r45.sn snVar) {
        super(context, com.p314xaae8f345.mm.R.C30868x68b1db1.f575609dr);
        this.f530035f = snVar;
    }

    @Override // wq1.d
    public com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c() {
        return this.f530038i;
    }

    @Override // wq1.d
    public void h() {
    }

    @Override // wq1.d
    public xq1.g o() {
        return this.f530039m;
    }

    @Override // p012xc85e97e9.p016x746ad0e3.app.i0, android.app.Dialog
    public void onCreate(android.os.Bundle bundle) {
        super.onCreate(bundle);
        getWindow().setLayout(-1, -1);
        getWindow().addFlags(67108864);
        getWindow().setDimAmount(0.5f);
        android.view.View inflate = android.view.LayoutInflater.from(getContext()).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.f569772nz, (android.view.ViewGroup) null, false);
        inflate.setOnTouchListener(new wq1.a(this));
        setContentView(inflate, new android.view.ViewGroup.LayoutParams(-1, -1));
        this.f530036g = (android.widget.FrameLayout) inflate.findViewById(com.p314xaae8f345.mm.R.id.f569232pi0);
        this.f530039m = new xq1.b(this);
        com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee c12962xa24d9bee = new com.p314xaae8f345.mm.p1006xc5476f33.box.p1288x48fb3bf9.C12962xa24d9bee(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a);
        this.f530038i = c12962xa24d9bee;
        this.f530037h = new xq1.f(this);
        xq1.a aVar = new xq1.a();
        xq1.b bVar = this.f530039m;
        r45.sn snVar = this.f530035f;
        c12962xa24d9bee.J0(aVar, new xq1.c(snVar, bVar));
        this.f530038i.mo120128x74041feb(this.f530037h, "boxJSApi");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Box.BoxHomeUI", "start to load url %s", snVar.f467385f);
        this.f530038i.mo32265x141096a9(snVar.f467385f);
        this.f530036g.addView(this.f530038i);
        setCancelable(true);
        setOnDismissListener(new wq1.b(this));
        getWindow().setWindowAnimations(com.p314xaae8f345.mm.R.C30868x68b1db1.f575608dq);
        sq1.a.a(1);
    }

    @Override // wq1.d
    public xq1.f u() {
        return this.f530037h;
    }
}
