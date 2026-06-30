package com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui;

/* renamed from: com.tencent.mm.plugin.product.ui.MallProductSelectAmountView */
/* loaded from: classes15.dex */
public class C16815x2af38f74 extends android.widget.LinearLayout {

    /* renamed from: d, reason: collision with root package name */
    public android.widget.TextView f234740d;

    /* renamed from: e, reason: collision with root package name */
    public android.widget.ImageView f234741e;

    /* renamed from: f, reason: collision with root package name */
    public android.widget.ImageView f234742f;

    /* renamed from: g, reason: collision with root package name */
    public int f234743g;

    /* renamed from: h, reason: collision with root package name */
    public int f234744h;

    /* renamed from: i, reason: collision with root package name */
    public int f234745i;

    /* renamed from: m, reason: collision with root package name */
    public int f234746m;

    /* renamed from: n, reason: collision with root package name */
    public com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 f234747n;

    public C16815x2af38f74(android.content.Context context, android.util.AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f234740d = null;
        this.f234741e = null;
        this.f234742f = null;
        this.f234743g = Integer.MAX_VALUE;
        this.f234744h = 1;
        this.f234745i = 1;
        this.f234746m = 1;
        this.f234747n = null;
        android.view.View inflate = ((android.view.LayoutInflater) context.getSystemService("layout_inflater")).inflate(com.p314xaae8f345.mm.R.C30864xbddafb2a.cag, (android.view.ViewGroup) this, true);
        this.f234740d = (android.widget.TextView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j_v);
        this.f234741e = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.j_u);
        this.f234742f = (android.widget.ImageView) inflate.findViewById(com.p314xaae8f345.mm.R.id.f567374ja0);
        this.f234740d.setText("" + this.f234746m);
        this.f234741e.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.i0(this));
        this.f234742f.setOnClickListener(new com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.j0(this));
    }

    public final boolean a() {
        int i17 = this.f234746m;
        int i18 = this.f234743g;
        if (i17 > i18) {
            this.f234746m = i18;
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var = this.f234747n;
            if (k0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var).a(i18);
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var2 = this.f234747n;
            if (k0Var2 != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var2).b(this.f234746m, this.f234744h);
            }
            this.f234740d.setText("" + this.f234746m);
            return false;
        }
        int i19 = this.f234745i;
        if (i17 > i19) {
            this.f234742f.setEnabled(true);
        } else {
            if (i17 != i19) {
                this.f234742f.setEnabled(false);
                int i27 = this.f234745i;
                this.f234746m = i27;
                com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var3 = this.f234747n;
                if (k0Var3 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var3).a(i27);
                }
                com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var4 = this.f234747n;
                if (k0Var4 != null) {
                    ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var4).b(this.f234746m, 2);
                }
                this.f234740d.setText("" + this.f234746m);
                return false;
            }
            this.f234742f.setEnabled(false);
        }
        return true;
    }

    /* renamed from: setAddEnable */
    public void m67604x438dff42(boolean z17) {
        this.f234741e.setEnabled(z17);
    }

    /* renamed from: setAmount */
    public void m67605x406a75a(int i17) {
        this.f234746m = i17;
        if (a()) {
            this.f234740d.setText("" + this.f234746m);
            com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var = this.f234747n;
            if (k0Var != null) {
                ((com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.n0) k0Var).a(this.f234746m);
            }
        }
    }

    /* renamed from: setMinAmount */
    public void m67606x484c8f08(int i17) {
        this.f234745i = i17;
        a();
    }

    /* renamed from: setOnAmountChangeListener */
    public void m67607x7be5de7d(com.p314xaae8f345.mm.p1006xc5476f33.p1953xed8dccef.ui.k0 k0Var) {
        this.f234747n = k0Var;
    }

    /* renamed from: setRemoveEnable */
    public void m67608x4c1d24a9(boolean z17) {
        this.f234742f.setEnabled(z17);
    }
}
