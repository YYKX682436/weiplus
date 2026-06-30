package zw1;

/* loaded from: classes4.dex */
public class k2 extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.widget.TextView M;
    public android.widget.ImageView N;
    public java.lang.String P;
    public java.lang.String Q;
    public final android.content.Context R;

    public k2(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.R = context;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.f570181zi;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public android.view.View p(android.view.View view, android.view.ViewGroup viewGroup) {
        if (this.L == null) {
            this.L = u(viewGroup);
        }
        t(this.L);
        return this.L;
    }

    @Override // com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb
    public void t(android.view.View view) {
        super.t(view);
        this.M = (android.widget.TextView) view.findViewById(android.R.id.title);
        this.N = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.c4q);
        android.widget.TextView textView = this.M;
        le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str = this.Q;
        float textSize = this.M.getTextSize();
        ((ke0.e) xVar).getClass();
        textView.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(this.R, str, textSize));
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
            this.N.setVisibility(8);
            return;
        }
        this.N.setVisibility(0);
        gm0.j1.i();
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 f07 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1863xaa66bb13.p1864x83f804b3.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().f0(this.P);
        if (f07 != null && ((int) f07.E2) > 0) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p696xac32c159.w) ((kv.z) i95.n0.c(kv.z.class))).Ai(this.N, this.P, null);
        } else {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            ((c01.k7) c01.n8.a()).b(this.P, 4, new zw1.j2(this, currentTimeMillis));
        }
    }

    public k2(android.content.Context context, int i17) {
        super(context);
        this.L = null;
        this.M = null;
        this.N = null;
        this.P = null;
        this.Q = null;
        this.R = null;
        this.R = context;
        this.G = i17;
    }
}
