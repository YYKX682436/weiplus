package wo2;

/* loaded from: classes2.dex */
public final class j0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f529617d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wo2.m0 f529618e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.view.View f529619f;

    public j0(java.lang.String str, wo2.m0 m0Var, android.view.View view) {
        this.f529617d = str;
        this.f529618e = m0Var;
        this.f529619f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        wo2.q qVar;
        oa.i k17;
        java.lang.String str = this.f529617d;
        if (android.text.TextUtils.isEmpty(str)) {
            return;
        }
        wo2.m0 m0Var = this.f529618e;
        com.p176xb6135e39.p177xcca8366f.p244x11d36527.p261x36337e.C2718xca2902ff R6 = m0Var.R6();
        if (R6 == null || (k17 = R6.k(0)) == null) {
            qVar = null;
        } else {
            java.lang.Object obj = k17.f425311a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.finder.nearby.NearbyActionBarUIC.NearbyTab");
            qVar = (wo2.q) obj;
        }
        android.widget.TextView textView = qVar != null ? qVar.f529650c : null;
        if (textView != null) {
            textView.setText(str);
        }
        if (str.length() != 2) {
            int length = (str.length() - 2) * mo0.h.a(m0Var.m158354x19263085(), 15.0f);
            android.view.View view = this.f529619f;
            if (view.getLayoutParams() != null) {
                android.view.ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.e(layoutParams, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
                p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams layoutParams2 = (p012xc85e97e9.p071xe6df7747.p072xd1075a44.C1073x7e08a787.LayoutParams) layoutParams;
                ((android.view.ViewGroup.MarginLayoutParams) layoutParams2).leftMargin -= length;
                view.setLayoutParams(layoutParams2);
            }
        }
    }
}
