package cj5;

/* loaded from: classes.dex */
public final class v1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ cj5.l2 f42256d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v1(cj5.l2 l2Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f42256d = l2Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new cj5.v1(this.f42256d, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        cj5.v1 v1Var = (cj5.v1) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        v1Var.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.util.ArrayList arrayList;
        qi5.w wVar;
        boolean z17;
        ri5.j a17;
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "handleMsgFoldClick() lifecycleScope launch default");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        cj5.l2 l2Var = this.f42256d;
        zm3.a T6 = l2Var.T6();
        com.tencent.mm.ui.mvvm.uic.conversation.recent.k kVar = T6 instanceof com.tencent.mm.ui.mvvm.uic.conversation.recent.k ? (com.tencent.mm.ui.mvvm.uic.conversation.recent.k) T6 : null;
        if (kVar == null || (wVar = (qi5.w) ((jz5.n) kVar.f209340d).getValue()) == null) {
            arrayList = null;
        } else {
            p75.n0 n0Var = dm.i2.K;
            p75.d dVar = dm.i2.L;
            p75.i0 g17 = n0Var.g(kz5.b0.c(dVar));
            p75.d dVar2 = dm.i2.W;
            g17.f352657d = dVar2.j("message_fold");
            g17.f352659f = kz5.b0.c(new g95.v());
            p75.l0 a18 = g17.a();
            p75.i0 g18 = n0Var.g(kz5.c0.i(dVar, dm.i2.T));
            g18.f352657d = dVar2.m().c(dm.i2.M.o(0));
            g18.f352659f = kz5.b0.c(new g95.v());
            java.util.List k17 = g18.a().k(wVar.e().Q4(), com.tencent.mm.storage.l4.class);
            java.util.ArrayList arrayList2 = new java.util.ArrayList();
            java.util.Iterator it = ((java.util.ArrayList) k17).iterator();
            while (it.hasNext()) {
                java.lang.Object next = it.next();
                if (((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().J((com.tencent.mm.storage.l4) next)) {
                    arrayList2.add(next);
                }
            }
            java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList2, 10));
            java.util.Iterator it6 = arrayList2.iterator();
            while (it6.hasNext()) {
                arrayList3.add(((com.tencent.mm.storage.l4) it6.next()).h1());
            }
            java.util.List l17 = a18.l(wVar.e().Q4());
            ((java.util.ArrayList) l17).addAll(arrayList3);
            java.util.ArrayList arrayList4 = new java.util.ArrayList();
            arrayList4.addAll(wVar.d(new java.util.ArrayList(l17)));
            java.util.List d17 = g95.x.f269827a.d(kz5.c0.i(dm.i2.L, dm.i2.Q, dm.i2.T), arrayList4);
            java.util.Map d18 = d75.b.d(g95.e.f269801a.f(l17), qi5.u.f363845d);
            arrayList = new java.util.ArrayList();
            java.util.Iterator it7 = ((java.util.ArrayList) d17).iterator();
            int i17 = 0;
            while (it7.hasNext()) {
                java.lang.Object next2 = it7.next();
                int i18 = i17 + 1;
                if (i17 < 0) {
                    kz5.c0.p();
                    throw null;
                }
                com.tencent.mm.storage.l4 l4Var = (com.tencent.mm.storage.l4) next2;
                com.tencent.mm.storage.z3 z3Var = (com.tencent.mm.storage.z3) ((java.util.LinkedHashMap) d18).get(l4Var.h1());
                if (z3Var == null) {
                    z3Var = new com.tencent.mm.storage.z3(l4Var.h1());
                }
                com.tencent.mm.storage.z3 z3Var2 = z3Var;
                vi5.f fVar = new vi5.f(l4Var.w0(), l4Var.G0(), null, null, 0, 0, ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di().J(l4Var), 60, null);
                ri5.h hVar = ri5.j.I;
                int i19 = ri5.j.Z;
                java.lang.String d19 = z3Var2.d1();
                java.util.Iterator it8 = it7;
                kotlin.jvm.internal.o.f(d19, "getUsername(...)");
                java.lang.String id6 = hVar.a(d19, i19, 0);
                java.util.Set set = c01.e2.f37117a;
                boolean z18 = set != null && ((java.util.HashSet) set).contains(l4Var.h1());
                vi5.e eVar = vi5.f.f437620h;
                if (z18) {
                    androidx.appcompat.app.AppCompatActivity activity = wVar.f363847d;
                    kotlin.jvm.internal.o.g(activity, "activity");
                    kotlin.jvm.internal.o.g(id6, "id");
                    a17 = eVar.a(activity, id6, z3Var2, i19, fVar, i19);
                    z17 = true;
                    a17.f396129z = true;
                    a17.A = true;
                } else {
                    z17 = true;
                    a17 = eVar.a(wVar.f363847d, id6, z3Var2, i19, fVar, (r14 & 32) != 0 ? i19 : 0);
                }
                arrayList.add(a17);
                i17 = i18;
                it7 = it8;
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SelectContactMainRecycleViewUIC", "handleMsgFoldClick() real time getPlaceTopConversations cost:" + (java.lang.System.currentTimeMillis() - currentTimeMillis) + " items:" + arrayList);
        l2Var.b7(arrayList);
        cj5.l2 l2Var2 = this.f42256d;
        pf5.e.launchUI$default(l2Var2, null, null, new cj5.u1(arrayList, l2Var2, null), 3, null);
        return jz5.f0.f302826a;
    }
}
