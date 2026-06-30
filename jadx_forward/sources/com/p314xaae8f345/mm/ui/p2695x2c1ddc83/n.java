package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes11.dex */
public class n implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.List f289408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f289409e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f289410f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.util.List f289411g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.List f289412h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q f289413i;

    public n(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar, java.util.List list, java.util.List list2, java.util.List list3, java.util.List list4, java.util.List list5) {
        this.f289413i = qVar;
        this.f289408d = list;
        this.f289409e = list2;
        this.f289410f = list3;
        this.f289411g = list4;
        this.f289412h = list5;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar = this.f289413i;
        if (qVar.f289522s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "Banner has destroyed.");
            this.f289413i.e(this.f289408d);
            this.f289413i.a(this.f289408d);
            this.f289408d.clear();
            this.f289409e.clear();
            this.f289410f.clear();
            this.f289411g.clear();
            this.f289412h.clear();
            return;
        }
        ((java.util.LinkedList) qVar.f289510d).addAll(this.f289409e);
        ((java.util.LinkedList) this.f289413i.f289511e).addAll(this.f289410f);
        ((java.util.LinkedList) this.f289413i.f289512f).addAll(this.f289411g);
        ((java.util.LinkedList) this.f289413i.f289513g).addAll(this.f289412h);
        ((java.util.LinkedList) this.f289413i.f289514h).addAll(this.f289408d);
        final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar2 = this.f289413i;
        qVar2.f289521r = true;
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5700x3d30ed6d> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5700x3d30ed6d>(a0Var) { // from class: com.tencent.mm.ui.conversation.BannerHelper$5
            {
                this.f39173x3fe91575 = -599117475;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5700x3d30ed6d c5700x3d30ed6d) {
                com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar3 = com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q.this;
                if (qVar3.f289519p.getVisibility() != 0) {
                    qVar3.f289519p.setVisibility(0);
                    android.view.View view = qVar3.f289520q;
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
                    arrayList.add(8);
                    java.util.Collections.reverse(arrayList);
                    yj0.a.d(view, arrayList.toArray(), "com/tencent/mm/ui/conversation/BannerHelper$5", "callback", "(Lcom/tencent/mm/autogen/events/MainUIShowListviewEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                    view.setVisibility(((java.lang.Integer) arrayList.get(0)).intValue());
                    yj0.a.f(view, "com/tencent/mm/ui/conversation/BannerHelper$5", "callback", "(Lcom/tencent/mm/autogen/events/MainUIShowListviewEvent;)Z", "android/view/View_EXEC_", "setVisibility", "(I)V");
                }
                return false;
            }
        };
        qVar2.f289516m = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        c01.d9.b().a(qVar2);
        java.util.Iterator it = qVar2.f289514h.iterator();
        while (it.hasNext()) {
            qVar2.f289519p.addHeaderView(((s35.b) it.next()).f484376h);
        }
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p pVar = new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p(qVar2);
        qVar2.f289515i = pVar;
        gm0.j1.i();
        gm0.j1.n().a(pVar);
        s72.r0 a17 = s72.r0.a();
        synchronized (a17.f485677a) {
            ((java.util.LinkedList) a17.f485677a).add(qVar2);
        }
        qVar2.h();
    }
}
