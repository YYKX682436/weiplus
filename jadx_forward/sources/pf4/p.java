package pf4;

/* loaded from: classes4.dex */
public final class p extends pf4.l {

    /* renamed from: m, reason: collision with root package name */
    public final android.widget.TextView f435415m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ pf4.q f435416n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(pf4.q qVar, android.view.View itemView) {
        super(qVar, itemView);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(itemView, "itemView");
        this.f435416n = qVar;
        android.view.View findViewById = itemView.findViewById(com.p314xaae8f345.mm.R.id.f568660nl5);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        this.f435415m = (android.widget.TextView) findViewById;
    }

    @Override // pf4.l
    public android.view.View i() {
        android.view.View findViewById = this.f3639x46306858.findViewById(com.p314xaae8f345.mm.R.id.nkm);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        return findViewById;
    }

    @Override // pf4.l
    public void j(int i17, gf4.a comment) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(comment, "comment");
        super.j(i17, comment);
        boolean z17 = comment.f352869g;
        if (z17) {
            pm0.v.c(this.f435408e);
        }
        pf4.q qVar = this.f435416n;
        android.widget.TextView textView = this.f435415m;
        if (z17) {
            textView.setVisibility(8);
        } else {
            boolean D0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(ef4.w.f334001t.e(), comment.f352863a);
            textView.setVisibility(0);
            if (D0) {
                textView.setOnClickListener(new pf4.o(qVar, comment));
                textView.setText(this.f3639x46306858.getContext().getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.jlp));
                textView.setTextColor(-1);
                pm0.v.c(textView);
            } else {
                textView.setVisibility(8);
            }
        }
        this.f3639x46306858.setOnClickListener(new pf4.n(qVar, comment));
    }
}
