package g22;

/* loaded from: classes11.dex */
public final class q0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.widget.TextView f349389d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f349390e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 f349391f;

    public q0(android.widget.TextView textView, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad0482) {
        this.f349389d = textView;
        this.f349390e = str;
        this.f349391f = c13367x36ad0482;
    }

    @Override // java.lang.Runnable
    public final void run() {
        android.widget.TextView textView = this.f349389d;
        java.lang.String str = this.f349390e;
        textView.setText(str);
        com.p314xaae8f345.mm.p1006xc5476f33.p1365x5c28046.ui.v3.C13367x36ad0482 c13367x36ad0482 = this.f349391f;
        textView.setBackgroundResource(com.p314xaae8f345.mm.ui.p2740x696c9db.pd.b(c13367x36ad0482.getContext(), java.lang.Integer.parseInt(str)));
        c13367x36ad0482.m54851x330196a5();
        la5.b.f399133a.d(c13367x36ad0482, c13367x36ad0482.m54849xfb85ada3(), c13367x36ad0482.m54851x330196a5(), 0);
    }
}
