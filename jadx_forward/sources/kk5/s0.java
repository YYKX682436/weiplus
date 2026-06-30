package kk5;

/* loaded from: classes.dex */
public final class s0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kk5.v0 f390215d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wi5.n0 f390216e;

    public s0(kk5.v0 v0Var, wi5.n0 n0Var) {
        this.f390215d = v0Var;
        this.f390216e = n0Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        rd0.g1 g1Var = (rd0.g1) i95.n0.c(rd0.g1.class);
        kk5.v0 v0Var = this.f390215d;
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x19263085 = v0Var.m158354x19263085();
        p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 m158354x192630852 = v0Var.m158354x19263085();
        wi5.n0 n0Var = this.f390216e;
        java.lang.String string = m158354x192630852.getString(com.p314xaae8f345.mm.R.C30867xcad56011.m67, java.lang.Integer.valueOf(n0Var.f527852o.size()));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(string, "getString(...)");
        android.content.Intent Ai = ((qd0.u0) g1Var).Ai(m158354x19263085, string, n0Var.f527852o);
        pf5.j0.a(Ai, kk5.v0.class);
        bh5.c cVar = new bh5.c();
        cVar.f102455a.f102457a = v0Var.m158354x19263085();
        cVar.d(Ai);
        cVar.a("com.tencent.mm.ui.mvvm.MvvmContactListUI");
        cVar.h(7);
        yj0.a.h(this, "com/tencent/mm/ui/uic/SelectMassSendContactUIC$onCreate$2$1$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
