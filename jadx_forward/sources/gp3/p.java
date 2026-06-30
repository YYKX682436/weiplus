package gp3;

/* loaded from: classes9.dex */
public class p extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.view.View.OnClickListener M;
    public java.lang.String N;
    public java.lang.String P;

    public p(android.content.Context context) {
        super(context);
        this.L = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bwc;
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
        java.lang.String str;
        super.t(view);
        android.widget.ImageView imageView = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j_4);
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j_5);
        imageView.setImageBitmap(null);
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(this.P)) {
            o11.f fVar = new o11.f();
            bp3.f.wi().getClass();
            if (gm0.j1.a()) {
                str = g83.a.a() + "order";
            } else {
                str = "";
            }
            fVar.f423616g = str;
            fVar.f423611b = true;
            fVar.f423628s = true;
            fVar.f423629t = true;
            n11.a.b().h(this.P, imageView, fVar.a());
        }
        textView.setText(this.N);
        view.findViewById(com.p314xaae8f345.mm.R.id.j_3).setOnClickListener(this.M);
    }
}
