package c43;

/* loaded from: classes8.dex */
public class c extends c43.x {
    public android.widget.ImageView Z;

    /* renamed from: l1, reason: collision with root package name */
    public android.widget.TextView f119933l1;

    /* renamed from: p0, reason: collision with root package name */
    public android.widget.Button f119934p0;

    /* renamed from: x0, reason: collision with root package name */
    public android.widget.TextView f119935x0;

    /* renamed from: y0, reason: collision with root package name */
    public android.widget.TextView f119936y0;

    public c(android.view.View view, int i17) {
        super(view, i17);
    }

    @Override // c43.x
    public void k(com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15725x912acd13 c15725x912acd13;
        java.lang.String str;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || (c15725x912acd13 = c15791x7c5dbdd8.f36762x2b220015) == null) {
            return;
        }
        this.f119935x0.setText(c15725x912acd13.f36520x6942258);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15725x912acd13.des)) {
            this.f119936y0.setVisibility(8);
        } else {
            this.f119936y0.setVisibility(0);
            this.f119936y0.setText(c15725x912acd13.des);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c15725x912acd13.f36519x19489dc7)) {
            this.f119933l1.setVisibility(8);
        } else {
            this.f119933l1.setVisibility(0);
            this.f119933l1.setText(c15725x912acd13.f36519x19489dc7);
        }
        android.graphics.drawable.GradientDrawable gradientDrawable = (android.graphics.drawable.GradientDrawable) this.f119934p0.getBackground();
        if (gradientDrawable != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15748x3e43f43 c15748x3e43f43 = c15725x912acd13.f36516x70ef9956;
            if (c15748x3e43f43 == null || (str = c15748x3e43f43.f36646xa0e2915a) == null) {
                str = null;
            }
            gradientDrawable.setColor(s33.y.k(str, com.p314xaae8f345.mm.R.C30859x5a72f63.f560077ae));
        }
        this.f119934p0.setText(c15725x912acd13.f36517x1563f185);
        java.lang.Object tag = this.Z.getTag();
        if ((tag instanceof java.lang.String) && ((java.lang.String) tag).equals(c15725x912acd13.f36515x95bc6f40)) {
            return;
        }
        r53.y.a().e(null, c15725x912acd13.f36515x95bc6f40, null, new c43.b(this, c15725x912acd13));
    }

    @Override // c43.x
    public android.view.View p(android.view.ViewGroup viewGroup) {
        android.view.View inflate = android.view.LayoutInflater.from(this.f120025g).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.ben, (android.view.ViewGroup) null);
        this.Z = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1h);
        android.widget.Button button = (android.widget.Button) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1g);
        this.f119934p0 = button;
        button.setClickable(false);
        this.f119935x0 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1n);
        this.f119936y0 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1j);
        this.f119933l1 = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.a1m);
        return inflate;
    }

    @Override // c43.x
    public void w(android.view.View view) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15791x7c5dbdd8 c15791x7c5dbdd8;
        long j17;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d67 = this.f120028m;
        if (c15731x94356d67 == null || (c15791x7c5dbdd8 = c15731x94356d67.f36571x8f2d71bb) == null || c15791x7c5dbdd8.f36762x2b220015 == null || s()) {
            return;
        }
        int h17 = s33.y.h(this.f120025g, this.f120028m.f36571x8f2d71bb.f36762x2b220015.f36518x28d1961f);
        if (h17 == 1) {
            j17 = 6;
        } else if (h17 == 2) {
            j17 = 7;
        } else if (h17 != 3) {
            return;
        } else {
            j17 = 28;
        }
        long j18 = j17;
        com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.f fVar = com.p314xaae8f345.mm.p782x304bf2.p784xc84c5534.g.f149728a;
        long j19 = this.f120027i;
        long j27 = this.f120026h;
        com.p314xaae8f345.mm.p1006xc5476f33.p1731x304bf2.p1732xd97a1f41.p1733x55baa833.C15731x94356d67 c15731x94356d672 = this.f120028m;
        fVar.g(1L, j18, j19, j27, c15731x94356d672.seq, c15731x94356d672.f36570xfd4da1cb, 0L, this.X);
    }
}
