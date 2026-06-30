package ns4;

/* loaded from: classes8.dex */
public final class b1 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 f420971d;

    public b1(com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420) {
        this.f420971d = activityC19066x54c41420;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.lang.String str;
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p2357xd09a53f9.p2362xd0cea65f.ui.ActivityC19066x54c41420 activityC19066x54c41420 = this.f420971d;
        ms4.n nVar = activityC19066x54c41420.f260687i;
        if (nVar == null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o("mViewModel");
            throw null;
        }
        r45.ma7 ma7Var = (r45.ma7) nVar.f412614u.mo3195x754a37bb();
        if (ma7Var != null && (str = ma7Var.f461850f) != null) {
            com.p314xaae8f345.mm.p2802xd031a825.ui.r1.W(activityC19066x54c41420, str, false, 1001);
        }
        yj0.a.h(this, "com/tencent/mm/plugin/wallet/wecoin/ui/WeCoinEncashView$initView$2", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
