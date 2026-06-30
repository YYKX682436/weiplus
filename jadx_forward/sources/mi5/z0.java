package mi5;

/* loaded from: classes9.dex */
public final class z0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ bw5.o50 f408484d;

    public z0(bw5.o50 o50Var) {
        this.f408484d = o50Var;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/msgviewfactory/view/ForwardTingChatRoomView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (this.f408484d != null) {
            qk.f9 aj6 = ((rk4.z8) ((qk.g9) i95.n0.c(qk.g9.class))).aj();
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            qk.f9.a(aj6, context, this.f408484d, bw5.ar0.TingScene_Chat, false, null, 24, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/msgviewfactory/view/ForwardTingChatRoomView$onUpdateViewModel$1$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
