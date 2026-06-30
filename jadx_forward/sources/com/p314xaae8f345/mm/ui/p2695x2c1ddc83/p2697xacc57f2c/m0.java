package com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c;

/* loaded from: classes5.dex */
public class m0 implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Intent f289087d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l0 f289088e;

    public m0(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l0 l0Var, android.content.Intent intent) {
        this.f289088e = l0Var;
        this.f289087d = intent;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/conversation/banner/OtherOnlineBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        boolean wi6 = iy4.z.wi();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.l0 l0Var = this.f289088e;
        if (wi6) {
            iy4.z zVar = (iy4.z) i95.n0.c(iy4.z.class);
            android.content.Context context = (android.content.Context) l0Var.f484375g.get();
            zVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
            try {
                java.util.ArrayList K = ug3.i.K();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(K, "getOnlineInfoList(...)");
                java.util.List S0 = kz5.n0.S0(K);
                java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(S0, 10));
                java.util.Iterator it = S0.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((ug3.k) it.next()).mo14344x5f01b1f6());
                }
                p3325xe03a0797.p3326xc267989b.l.d(p3325xe03a0797.p3326xc267989b.z0.b(), null, null, new iy4.t(arrayList2, context, null), 3, null);
            } catch (java.lang.Exception e17) {
                ot5.g.a("MicroMsg.ExtDeviceService", "enter logged device page failed, error: " + e17.getMessage());
            }
        } else {
            j45.l.j((android.content.Context) l0Var.f484375g.get(), "webwx", ".ui.WebWXLogoutUI", this.f289087d, null);
        }
        yj0.a.h(this, "com/tencent/mm/ui/conversation/banner/OtherOnlineBanner$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
