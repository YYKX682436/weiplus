package gp3;

/* loaded from: classes9.dex */
public class u extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public static int S;
    public android.view.View L;
    public com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.r M;
    public java.lang.String N;
    public java.lang.String[] P;
    public android.text.TextUtils.TruncateAt Q;
    public boolean R;

    public u(android.content.Context context) {
        super(context);
        this.L = null;
        this.R = false;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bwf;
        S = context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560916xz);
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
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j_b);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j_a);
        android.widget.LinearLayout linearLayout = (android.widget.LinearLayout) view.findViewById(com.p314xaae8f345.mm.R.id.j__);
        textView.setText(this.f279307h);
        java.lang.String[] strArr = this.P;
        if (strArr == null || strArr.length <= 1) {
            textView2.setTextColor(S);
        } else {
            textView2.setOnClickListener(new gp3.t(this, textView2, linearLayout));
        }
        textView2.setText(this.N);
    }
}
