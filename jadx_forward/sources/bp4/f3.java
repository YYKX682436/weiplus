package bp4;

/* loaded from: classes8.dex */
public final class f3 extends yt3.a {

    /* renamed from: f, reason: collision with root package name */
    public final android.view.View f104702f;

    /* renamed from: g, reason: collision with root package name */
    public final bp4.e3 f104703g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f3(android.view.ViewGroup parent, ju3.d0 status) {
        super(status, null);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parent, "parent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(status, "status");
        this.f104702f = parent.findViewById(com.p314xaae8f345.mm.R.id.o19);
        android.view.View findViewById = parent.findViewById(com.p314xaae8f345.mm.R.id.f568790o15);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(findViewById, "findViewById(...)");
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 c1163xf1deaba4 = (p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4) findViewById;
        bp4.e3 e3Var = new bp4.e3();
        this.f104703g = e3Var;
        p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de c1162x665295de = new p012xc85e97e9.p103xe821e364.p104xd1075a44.C1162x665295de(parent.getContext());
        c1162x665295de.Q(0);
        c1162x665295de.m8091xc21abdf5(true);
        c1163xf1deaba4.mo7967x900dcbe1(c1162x665295de);
        c1163xf1deaba4.m7964x8d4ad49c(new p012xc85e97e9.p103xe821e364.p104xd1075a44.z());
        c1163xf1deaba4.m7963x830bc99d(true);
        java.util.LinkedList list = so4.g.f492312d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.util.ArrayList arrayList = e3Var.f104688d;
        arrayList.clear();
        arrayList.addAll(list);
        e3Var.m8146xced61ae5();
        c1163xf1deaba4.mo7960x6cab2c8d(e3Var);
        e3Var.f104690f = new bp4.c3(status);
        e3Var.f104689e = 0;
        e3Var.m8146xced61ae5();
    }

    @Override // yt3.r2
    /* renamed from: setVisibility */
    public void mo9067x901b6914(int i17) {
        android.view.View view = this.f104702f;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
        arrayList.add(java.lang.Integer.valueOf(i17));
        java.util.Collections.reverse(arrayList);
        yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
        view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
        yj0.a.f(view, "com/tencent/mm/plugin/vlog/ui/plugin/TemplateModeContainer", "setVisibility", "(I)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
    }

    public final so4.b z() {
        bp4.e3 e3Var = this.f104703g;
        java.lang.Object obj = e3Var.f104688d.get(e3Var.f104689e);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (so4.b) obj;
    }
}
