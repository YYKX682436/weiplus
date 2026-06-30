package oj5;

/* loaded from: classes14.dex */
public final class e implements android.view.View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.view.View f427373d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ oj5.r f427374e;

    public e(android.view.View view, oj5.r rVar) {
        this.f427373d = view;
        this.f427374e = rVar;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(android.view.View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(android.view.View view) {
        this.f427373d.removeOnAttachStateChangeListener(this);
        oj5.r rVar = this.f427374e;
        java.util.Iterator it = oj5.x.b(rVar.f427411a).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            p012xc85e97e9.p103xe821e364.p104xd1075a44.k3 k3Var = (p012xc85e97e9.p103xe821e364.p104xd1075a44.k3) it.next();
            android.view.View itemView = k3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView, "itemView");
            oj5.r.a(rVar, itemView);
            android.view.View itemView2 = k3Var.f3639x46306858;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(itemView2, "itemView");
            rVar.c(itemView2, true);
        }
        rVar.f427415e.clear();
        int[] b17 = rVar.b();
        int i17 = b17[0];
        int b18 = a06.d.b((i17 * 100.0f) / (1 < i17 + b17[1] ? r3 : 1));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(rVar.f427412b, "[doOnDetach] " + kz5.z.x0(b17) + " hitRate=" + b18 + '%');
        java.util.HashMap hashMap = oj5.r.f427410h;
        java.util.HashMap hashMap2 = oj5.r.f427410h;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.f2 mo7946xf939df19 = rVar.f427411a.mo7946xf939df19();
        hashMap2.remove(java.lang.Integer.valueOf(mo7946xf939df19 != null ? mo7946xf939df19.hashCode() : 0));
    }
}
