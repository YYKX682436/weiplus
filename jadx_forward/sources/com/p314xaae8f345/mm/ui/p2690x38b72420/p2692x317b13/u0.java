package com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13;

/* loaded from: classes11.dex */
public class u0 extends com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.a {
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.e1 C;
    public android.content.Context D;
    public java.lang.String E;
    public java.lang.Integer F;
    public java.lang.String G;
    public boolean H;
    public boolean I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f288469J;
    public final boolean K;
    public int L;
    public final jz5.g M;
    public final jz5.g N;

    public u0(int i17) {
        super(0, i17);
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        this.f288469J = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.k();
        ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.fd) ((rd0.k1) i95.n0.c(rd0.k1.class))).getClass();
        this.K = com.p314xaae8f345.mm.ui.p2650x55bb7a46.hd.j();
        this.M = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.t0(this));
        this.N = jz5.h.b(new com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.s0(this));
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public void a(android.content.Context context, com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.b bVar) {
        this.D = context;
        if (bVar instanceof com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.o0) {
            this.E = context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iex) : null;
            g(context);
        }
    }

    @Override // com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.d
    public com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.c b() {
        return (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.r0) ((jz5.n) this.M).mo141623x754a37bb();
    }

    public void g(android.content.Context context) {
        boolean z17 = this.I;
        int i17 = 0;
        if (z17) {
            boolean z18 = this.K;
            boolean z19 = this.f288469J;
            if (z19 && z18) {
                i17 = 3;
            } else if (z19) {
                i17 = 1;
            } else if (z18) {
                i17 = 2;
            }
        }
        this.L = i17;
        if (!z17) {
            if (this.f288369e) {
                this.G = context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifk) : null;
                this.F = java.lang.Integer.valueOf(com.p314xaae8f345.mm.R.raw.f79688xb16c076b);
                return;
            } else {
                this.G = context != null ? context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iew) : null;
                this.F = null;
                return;
            }
        }
        this.F = null;
        if (this.f288369e) {
            if (context != null) {
                r3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.ifk);
            }
        } else if (context != null) {
            r3 = context.getString(com.p314xaae8f345.mm.R.C30867xcad56011.iew);
        }
        this.G = r3;
    }

    public void h(int i17) {
        android.content.Context context = this.D;
        if (context != null) {
            com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.o0 o0Var = (com.p314xaae8f345.mm.ui.p2690x38b72420.p2692x317b13.o0) ((jz5.n) this.N).mo141623x754a37bb();
            android.widget.RelativeLayout relativeLayout = o0Var.f288442a;
            if (relativeLayout != null) {
                relativeLayout.setBackground(context.getResources().getDrawable(i17));
            }
            android.widget.LinearLayout linearLayout = o0Var.f288444c;
            if (linearLayout == null) {
                return;
            }
            linearLayout.setBackground(context.getResources().getDrawable(i17));
        }
    }
}
