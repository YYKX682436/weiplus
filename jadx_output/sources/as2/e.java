package as2;

/* loaded from: classes2.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xg2.h f13440d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.qt2 f13441e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ as2.g f13442f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xg2.h hVar, kotlin.coroutines.Continuation continuation, r45.qt2 qt2Var, as2.g gVar) {
        super(2, continuation);
        this.f13440d = hVar;
        this.f13441e = qt2Var;
        this.f13442f = gVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new as2.e(this.f13440d, continuation, this.f13441e, this.f13442f);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        as2.e eVar = (as2.e) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2);
        jz5.f0 f0Var = jz5.f0.f302826a;
        eVar.invokeSuspend(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f359186d;
        kotlin.ResultKt.throwOnFailure(obj);
        r45.aa1 aa1Var = (r45.aa1) ((xg2.i) this.f13440d).f454393b;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("requestBackupList success list:");
        java.util.LinkedList list = aa1Var.getList(1);
        kotlin.jvm.internal.o.f(list, "getObject(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(hc2.o0.m((com.tencent.mm.protocal.protobuf.FinderObject) it.next()));
        }
        sb6.append(arrayList);
        com.tencent.mars.xlog.Log.i("FinderSharePageBackupUIC", sb6.toString());
        cu2.t tVar = cu2.u.f222441a;
        java.util.LinkedList list2 = aa1Var.getList(1);
        kotlin.jvm.internal.o.f(list2, "getObject(...)");
        r45.qt2 qt2Var = this.f13441e;
        java.util.List j17 = tVar.j(list2, 1, qt2Var);
        java.util.Iterator it6 = j17.iterator();
        while (it6.hasNext()) {
            ((com.tencent.mm.plugin.finder.report.o3) i95.n0.c(com.tencent.mm.plugin.finder.report.o3.class)).cl(((com.tencent.mm.plugin.finder.storage.FinderItem) it6.next()).getFeedObject(), qt2Var);
        }
        java.util.LinkedList list3 = aa1Var.getList(18);
        as2.g gVar = this.f13442f;
        gVar.f13464e = list3;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(j17, 10));
        java.util.Iterator it7 = j17.iterator();
        while (it7.hasNext()) {
            com.tencent.mm.plugin.finder.model.BaseFinderFeed p17 = cu2.u.f222441a.p((com.tencent.mm.plugin.finder.storage.FinderItem) it7.next());
            p17.b2(true);
            p17.X0(true);
            arrayList2.add(p17);
        }
        java.util.LinkedList linkedList = new java.util.LinkedList(arrayList2);
        gVar.f13463d.clear();
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList = gVar.f13463d;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.Object obj2 : linkedList) {
            if (obj2 instanceof com.tencent.mm.plugin.finder.model.BaseFinderFeed) {
                arrayList3.add(obj2);
            }
        }
        copyOnWriteArrayList.addAll(arrayList3);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("requestBackupList backupList:");
        java.util.concurrent.CopyOnWriteArrayList copyOnWriteArrayList2 = gVar.f13463d;
        java.util.ArrayList arrayList4 = new java.util.ArrayList(kz5.d0.q(copyOnWriteArrayList2, 10));
        java.util.Iterator it8 = copyOnWriteArrayList2.iterator();
        while (it8.hasNext()) {
            arrayList4.add(hc2.b0.f((com.tencent.mm.plugin.finder.model.BaseFinderFeed) it8.next(), true));
        }
        sb7.append(arrayList4);
        com.tencent.mars.xlog.Log.i("FinderSharePageBackupUIC", sb7.toString());
        new com.tencent.mm.autogen.events.FinderShareBackupListReadyEvent().e();
        return jz5.f0.f302826a;
    }
}
