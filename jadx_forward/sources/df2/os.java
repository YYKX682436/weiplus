package df2;

/* loaded from: classes10.dex */
public final class os implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.lt f312536d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewGroup f312537e;

    public os(df2.lt ltVar, android.view.ViewGroup viewGroup) {
        this.f312536d = ltVar;
        this.f312537e = viewGroup;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        df2.lt ltVar = this.f312536d;
        in5.c cVar = ltVar.A;
        dk2.h hVar = cVar instanceof dk2.h ? (dk2.h) cVar : null;
        if (hVar != null) {
            r45.q12 q12Var = ((mm2.e1) ltVar.m56788xbba4bfc0(mm2.e1.class)).f410522s;
            boolean z17 = false;
            if (q12Var != null && q12Var.m75939xb282bd08(1) == 8) {
                z17 = true;
            }
            if (z17) {
                i95.m c17 = i95.n0.c(ml2.r0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                ml2.r0.dk((ml2.r0) c17, 2, null, 2, null);
            }
            android.content.Context context = this.f312537e.getContext();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            df2.lt.Z6(ltVar, context, hVar);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/live/controller/LivePromoteBannerController$initView$7", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
