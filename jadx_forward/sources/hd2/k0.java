package hd2;

/* loaded from: classes2.dex */
public final class k0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 f362024d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3) {
        this.f362024d = c14135xb71edba3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onCanPostButReviewing$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.ui.p1465x9da2e250.C14135xb71edba3 c14135xb71edba3 = this.f362024d;
        p012xc85e97e9.p087x9da2e250.app.ActivityC1102x9ee2d9f mo7430x19263085 = c14135xb71edba3.mo7430x19263085();
        r45.lk2 lk2Var = c14135xb71edba3.f191585p;
        if (mo7430x19263085 != null && lk2Var != null) {
            i95.m c17 = i95.n0.c(zy2.b6.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            if (zy2.b6.Mh((zy2.b6) c17, mo7430x19263085, null, null, null, 12, null)) {
                hc2.e.b(lk2Var, mo7430x19263085, c14135xb71edba3.f191586q);
            }
        }
        yj0.a.h(this, "com/tencent/mm/plugin/finder/feed/ui/fragment/FinderProfileCardFragment$onCanPostButReviewing$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
