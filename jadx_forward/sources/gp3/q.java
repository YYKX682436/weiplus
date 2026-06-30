package gp3;

/* loaded from: classes9.dex */
public class q extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public android.view.View.OnClickListener M;
    public java.lang.String N;

    public q(android.content.Context context) {
        super(context);
        this.L = null;
        this.M = null;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bwd;
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
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j_6);
        textView.setText(this.N);
        textView.setOnClickListener(this.M);
    }
}
