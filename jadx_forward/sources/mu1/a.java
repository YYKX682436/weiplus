package mu1;

/* loaded from: classes15.dex */
public abstract class a implements mu1.j {

    /* renamed from: a, reason: collision with root package name */
    public tt1.j f412867a;

    /* renamed from: b, reason: collision with root package name */
    public android.content.Context f412868b;

    /* renamed from: c, reason: collision with root package name */
    public android.view.View f412869c;

    /* renamed from: d, reason: collision with root package name */
    public android.widget.ImageView f412870d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.TextView f412871e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View.OnClickListener f412872f;

    public a(android.content.Context context) {
        this.f412868b = context;
    }

    @Override // mu1.j
    public void a(android.graphics.drawable.ShapeDrawable shapeDrawable) {
    }

    @Override // mu1.j
    public void b(boolean z17) {
    }

    @Override // mu1.j
    public void c(boolean z17) {
    }

    @Override // mu1.j
    public void d(boolean z17, boolean z18) {
    }

    @Override // mu1.j
    public void e(int i17) {
    }

    public android.view.View f() {
        int i17;
        tt1.j jVar = this.f412867a;
        if (jVar == null || jVar.s0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
            return null;
        }
        android.view.LayoutInflater layoutInflater = (android.view.LayoutInflater) this.f412868b.getSystemService("layout_inflater");
        if (!this.f412867a.d()) {
            if (this.f412867a.X()) {
                i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569902rg;
            } else if (this.f412867a.o()) {
                i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569874qn;
            } else if (this.f412867a.Q()) {
                i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569829pe;
            } else if (this.f412867a.m0()) {
                i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569863qc;
            }
            android.view.View inflate = layoutInflater.inflate(i17, (android.view.ViewGroup) null);
            this.f412869c = inflate;
            this.f412870d = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1e);
            this.f412871e = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.a1o);
            g();
            i();
            return this.f412869c;
        }
        i17 = com.p314xaae8f345.mm.R.C30864xbddafb2a.f569823p8;
        android.view.View inflate2 = layoutInflater.inflate(i17, (android.view.ViewGroup) null);
        this.f412869c = inflate2;
        this.f412870d = (android.widget.ImageView) inflate2.findViewById(com.p314xaae8f345.mm.R.id.a1e);
        this.f412871e = (android.widget.TextView) this.f412869c.findViewById(com.p314xaae8f345.mm.R.id.a1o);
        g();
        i();
        return this.f412869c;
    }

    public abstract void g();

    public abstract void h();

    public final void i() {
        tt1.j jVar = this.f412867a;
        if (jVar == null || jVar.s0() == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.CardWidgetCouponBase", "mCardInfo == null or mCardInfo.getCardTpInfo() == null");
            return;
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f412867a.s0().f470079e)) {
            int dimensionPixelSize = this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561707qf);
            if (this.f412867a.B() && this.f412867a.d()) {
                dimensionPixelSize = this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561726qz);
            } else if (this.f412867a.B() && this.f412867a.o()) {
                dimensionPixelSize = this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561726qz);
            } else if (this.f412867a.B() && this.f412867a.X()) {
                dimensionPixelSize = this.f412868b.getResources().getDimensionPixelSize(com.p314xaae8f345.mm.R.C30860x5b28f31.f561736r9);
            } else if (this.f412867a.m0()) {
                dimensionPixelSize = 0;
            }
            if (dimensionPixelSize > 0) {
                lu1.g0.b(this.f412870d, this.f412867a.s0().f470079e, dimensionPixelSize, com.p314xaae8f345.mm.R.C30861xcebc809e.cbt, true);
            }
        } else if (this.f412867a.d()) {
            this.f412870d.setVisibility(8);
        }
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.f412867a.s0().f470085m)) {
            this.f412871e.setText(this.f412867a.s0().f470085m);
        }
        h();
    }

    @Override // mu1.j
    /* renamed from: setOnClickListener */
    public void mo148379xa0ca35fb(android.view.View.OnClickListener onClickListener) {
        this.f412872f = onClickListener;
    }
}
