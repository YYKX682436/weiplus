package gp3;

/* loaded from: classes3.dex */
public class o extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.widget.ImageView M;
    public android.widget.TextView N;
    public android.view.View.OnClickListener P;
    public java.lang.String Q;
    public android.graphics.Bitmap R;

    public o(android.content.Context context) {
        super(context);
        this.L = null;
        this.Q = "";
        this.R = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bwb;
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
        this.N = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j_2);
        this.M = (android.widget.ImageView) view.findViewById(com.p314xaae8f345.mm.R.id.j_1);
        this.N.setText(this.Q);
        this.M.setImageBitmap(this.R);
        this.M.setOnClickListener(this.P);
        java.lang.String str = this.Q;
        if (str == null || str.length() <= 48) {
            return;
        }
        this.N.setTextSize(0, i65.a.h(this.f279303d, com.p314xaae8f345.mm.R.C30860x5b28f31.f561386h2));
    }
}
