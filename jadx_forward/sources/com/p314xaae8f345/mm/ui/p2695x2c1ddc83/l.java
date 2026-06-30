package com.p314xaae8f345.mm.ui.p2695x2c1ddc83;

/* loaded from: classes15.dex */
public class l implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f289350d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q f289351e;

    public l(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar, android.content.Context context) {
        this.f289351e = qVar;
        this.f289350d = context;
    }

    @Override // java.lang.Runnable
    public void run() {
        final com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q qVar = this.f289351e;
        android.content.Context context = this.f289350d;
        if (context == null) {
            qVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BannerHelper", "The context is null and stop initializing.");
            return;
        }
        if (qVar.f289522s) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BannerHelper", "TabView has destroyed, return.");
            return;
        }
        final java.util.LinkedList linkedList = new java.util.LinkedList();
        final java.util.LinkedList linkedList2 = new java.util.LinkedList();
        final java.util.LinkedList linkedList3 = new java.util.LinkedList();
        final java.util.LinkedList linkedList4 = new java.util.LinkedList();
        final com.p314xaae8f345.mm.app.a0 a0Var = com.p314xaae8f345.mm.app.a0.f134821d;
        com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680> abstractC20980x9b9ad01d = new com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d<com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680>(a0Var) { // from class: com.tencent.mm.ui.conversation.BannerHelper$2
            {
                this.f39173x3fe91575 = 1216409744;
            }

            @Override // com.p314xaae8f345.mm.sdk.p2600x5c6729a.AbstractC20980x9b9ad01d
            /* renamed from: callback */
            public boolean mo1xf5bc2045(com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea680) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea6802 = c5188x3ecea680;
                s35.b bVar = c5188x3ecea6802.f135531g.f89033c;
                if (bVar == null || bVar.f484376h == null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.BannerHelper", "banner is null, event:%s", c5188x3ecea6802);
                    return false;
                }
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BannerHelper", "now add banner:%s, hc:%d", bVar, java.lang.Integer.valueOf(com.p314xaae8f345.mm.ui.p2695x2c1ddc83.q.this.hashCode()));
                am.o0 o0Var = c5188x3ecea6802.f135531g;
                if (o0Var.f89031a) {
                    linkedList.add(bVar);
                    return false;
                }
                int i17 = o0Var.f89032b;
                if (i17 == 1) {
                    linkedList2.add(bVar);
                    return false;
                }
                if (i17 != 2) {
                    linkedList4.add(bVar);
                    return false;
                }
                linkedList3.add(bVar);
                return false;
            }
        };
        qVar.f289517n = abstractC20980x9b9ad01d;
        abstractC20980x9b9ad01d.mo48813x58998cd();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5187xc53c795f c5187xc53c795f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5187xc53c795f();
        c5187xc53c795f.f135530g.f88917a = (android.app.Activity) context;
        c5187xc53c795f.e();
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea680 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680();
        c5188x3ecea680.f135531g.f89033c = (s35.b) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(context, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.MAIN_FRAME_BANNER, null);
        c5188x3ecea680.e();
        s35.b bVar = (s35.b) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(context, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.NET_WARN_BANNER, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea6802 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680();
        am.o0 o0Var = c5188x3ecea6802.f135531g;
        o0Var.f89033c = bVar;
        o0Var.f89032b = 1;
        c5188x3ecea6802.e();
        if (android.os.Environment.getExternalStorageDirectory().getAbsolutePath().toLowerCase().contains("appclone")) {
            s35.b bVar2 = (s35.b) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(context, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.STORAGE_PERMISSION_BANNER, null);
            com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea6803 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680();
            am.o0 o0Var2 = c5188x3ecea6803.f135531g;
            o0Var2.f89033c = bVar2;
            o0Var2.f89032b = 1;
            c5188x3ecea6803.e();
        }
        s35.b bVar3 = (s35.b) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(context, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.OTHER_ONLINE_BANNER, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea6804 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680();
        am.o0 o0Var3 = c5188x3ecea6804.f135531g;
        o0Var3.f89033c = bVar3;
        o0Var3.f89031a = false;
        o0Var3.f89032b = 1;
        c5188x3ecea6804.e();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.q0 q0Var = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.q0) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(context, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.TRY_NEW_INIT_BANNER, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea6805 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680();
        am.o0 o0Var4 = c5188x3ecea6805.f135531g;
        o0Var4.f89033c = q0Var;
        o0Var4.f89031a = false;
        o0Var4.f89032b = 2;
        c5188x3ecea6805.e();
        com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.e eVar = (com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.e) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(context, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.AD_BANNER, null);
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea6806 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680();
        am.o0 o0Var5 = c5188x3ecea6806.f135531g;
        o0Var5.f89033c = eVar;
        o0Var5.f89031a = false;
        o0Var5.f89032b = 3;
        c5188x3ecea6806.e();
        cb5.e eVar2 = (cb5.e) com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.j.a(context, com.p314xaae8f345.mm.ui.p2695x2c1ddc83.p2697xacc57f2c.i.CHATTING_MONITORED_HINT, new java.lang.Object[]{e01.c.Main});
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680 c5188x3ecea6807 = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5188x3ecea680();
        am.o0 o0Var6 = c5188x3ecea6807.f135531g;
        o0Var6.f89033c = eVar2;
        o0Var6.f89031a = true;
        c5188x3ecea6807.e();
        qVar.f289517n.mo48814x2efc64();
        java.util.LinkedList linkedList5 = new java.util.LinkedList();
        linkedList5.addAll(linkedList);
        linkedList5.addAll(linkedList2);
        linkedList5.addAll(linkedList3);
        linkedList5.addAll(linkedList4);
        java.util.Collections.sort(linkedList5, new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.m(qVar));
        ((ku5.t0) ku5.t0.f394148d).B(new com.p314xaae8f345.mm.ui.p2695x2c1ddc83.n(qVar, linkedList5, linkedList, linkedList2, linkedList3, linkedList4));
    }
}
