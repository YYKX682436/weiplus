package com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b;

/* loaded from: classes5.dex */
public class oc implements android.view.View.OnClickListener {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yb5.d f286708d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg f286709e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc f286710f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc f286711g;

    public oc(com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc ncVar, yb5.d dVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg kgVar, com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.vc vcVar) {
        this.f286711g = ncVar;
        this.f286708d = dVar;
        this.f286709e = kgVar;
        this.f286710f = vcVar;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(android.view.View view) {
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(view);
        java.lang.Object[] array = arrayList.toArray();
        arrayList.clear();
        yj0.a.b("com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V", this, array);
        if (view.getTag() != null && (view.getTag() instanceof com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) && ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).c() != null) {
            yb5.d dVar = this.f286708d;
            com.p314xaae8f345.mm.p2621x8fb0427b.f9 Li = pt0.f0.Li(dVar.x(), ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).c().m124847x74d37ac6());
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.kg kgVar = this.f286709e;
            if (kgVar != null) {
                long m124847x74d37ac6 = Li.m124847x74d37ac6();
                ((java.util.HashSet) ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2653xac8f1cfd.h6) kgVar).f280679e).add(java.lang.Long.valueOf(m124847x74d37ac6));
            }
            rd5.d dVar2 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).f285438a;
            we5.a aVar = new we5.a(((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).f285438a.f475787d.f526832a, Li);
            dVar2.getClass();
            dVar2.f475787d = aVar;
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.lang.ThreadLocal threadLocal = zj0.c.f554818a;
            arrayList2.add(8);
            java.util.Collections.reverse(arrayList2);
            yj0.a.d(view, arrayList2.toArray(), "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            view.setVisibility(((java.lang.Integer) arrayList2.get(0)).intValue());
            yj0.a.f(view, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "onClick", "(Landroid/view/View;)V", "android/view/View_EXEC_", "setVisibility", "(I)V");
            mp3.j jVar = (mp3.j) i95.n0.c(mp3.j.class);
            java.lang.String j17 = Li.j();
            ((lp3.l) jVar).getClass();
            r45.k55 e17 = bm5.d1.e(j17);
            com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.nc ncVar = this.f286711g;
            yb5.d dVar3 = this.f286708d;
            rd5.d dVar4 = ((com.p314xaae8f345.mm.ui.p2650x55bb7a46.p2679xa2ca8c3b.er) view.getTag()).f285438a;
            java.util.LinkedList linkedList = e17.f459919e;
            ncVar.d0(dVar3, dVar4, e17, linkedList.size(), this.f286710f);
            com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6811xca714b07 c6811xca714b07 = new com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C6811xca714b07();
            c6811xca714b07.f141375f = c6811xca714b07.b("ChatUsername", dVar.x(), true);
            c6811xca714b07.f141374e = c6811xca714b07.b("Username", dVar.f542249k, true);
            c6811xca714b07.f141376g = linkedList.size();
            if (com.p314xaae8f345.mm.p2621x8fb0427b.z3.N4(dVar.x())) {
                c6811xca714b07.f141373d = 2;
            } else {
                c6811xca714b07.f141373d = 1;
            }
            c6811xca714b07.k();
        }
        yj0.a.h(this, "com/tencent/mm/ui/chatting/viewitems/ChattingItemAppMsgPat$1", "android/view/View$OnClickListener", "onClick", "(Landroid/view/View;)V");
    }
}
