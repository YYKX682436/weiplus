package ir1;

/* loaded from: classes5.dex */
public final class p0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ir1.i1 f375564d;

    public p0(ir1.i1 i1Var) {
        this.f375564d = i1Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        ir1.i1 i1Var = this.f375564d;
        i1Var.f375517d.B();
        android.content.Intent intent = new android.content.Intent();
        hr1.a aVar = i1Var.P;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(aVar);
        intent.putExtra("finder_username", aVar.f66209x4f67f8e);
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        ya2.e1 e1Var = ya2.e1.f542005a;
        android.content.Context context = i1Var.getContext();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        e1Var.w(context, intent);
        yj0.a.h(this, "com/tencent/mm/plugin/brandservice/conversation/ui/BizFansHalfScreenProfileView$bindUI$3", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
