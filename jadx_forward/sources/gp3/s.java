package gp3;

/* loaded from: classes9.dex */
public class s extends com.p314xaae8f345.mm.ui.p2642x2e06d1.p2643xa8fcbcdb.C21560x1fce98fb {
    public android.view.View L;
    public java.lang.String M;
    public int N;
    public boolean P;
    public int Q;
    public int R;
    public android.view.View.OnClickListener S;

    public s(android.content.Context context) {
        super(context);
        this.L = null;
        this.N = Integer.MAX_VALUE;
        this.Q = -1;
        this.R = -1;
        this.G = com.p314xaae8f345.mm.R.C30864xbddafb2a.bwe;
    }

    public void M(java.lang.String str) {
        this.M = str;
        this.P = false;
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
        android.widget.TextView textView = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j_8);
        android.widget.TextView textView2 = (android.widget.TextView) view.findViewById(com.p314xaae8f345.mm.R.id.j_7);
        textView.setText(this.f279307h);
        int i17 = this.N;
        if (i17 != Integer.MAX_VALUE) {
            textView2.setTextColor(i17);
        }
        boolean z17 = this.P;
        android.content.Context context = this.f279303d;
        if (!z17) {
            textView2.setOnClickListener(null);
            le0.x xVar = (le0.x) i95.n0.c(le0.x.class);
            java.lang.String str = this.M;
            float textSize = textView2.getTextSize();
            ((ke0.e) xVar).getClass();
            textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str, textSize));
            return;
        }
        if (this.Q >= 0 && this.R > 0) {
            hp3.b bVar = new hp3.b(context);
            android.text.SpannableString spannableString = new android.text.SpannableString(this.M);
            bVar.f364470d = new gp3.r(this);
            textView2.setMovementMethod(android.text.method.LinkMovementMethod.getInstance());
            spannableString.setSpan(bVar, this.Q, this.R, 33);
            textView2.setText(spannableString);
            return;
        }
        textView2.setTextColor(context.getResources().getColor(com.p314xaae8f345.mm.R.C30859x5a72f63.f560909xs));
        textView2.setOnClickListener(this.S);
        le0.x xVar2 = (le0.x) i95.n0.c(le0.x.class);
        java.lang.String str2 = this.M;
        float textSize2 = textView2.getTextSize();
        ((ke0.e) xVar2).getClass();
        textView2.setText(com.p314xaae8f345.mm.p2470x93e71c27.ui.p2487x35f74a.c0.j(context, str2, textSize2));
    }
}
