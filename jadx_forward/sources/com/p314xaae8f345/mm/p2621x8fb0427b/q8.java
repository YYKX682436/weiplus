package com.p314xaae8f345.mm.p2621x8fb0427b;

/* loaded from: classes14.dex */
public final class q8 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f276780d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f276781e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q8(java.util.ArrayList arrayList, java.util.ArrayList arrayList2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f276780d = arrayList;
        this.f276781e = arrayList2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p2621x8fb0427b.q8(this.f276780d, this.f276781e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p2621x8fb0427b.q8) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        this.f276780d.addAll(this.f276781e);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryStorage", "init after to start identify all data size: " + this.f276780d.size());
        aq.n nVar = aq.o.f94455c;
        if (nVar == null) {
            return null;
        }
        java.util.ArrayList list = this.f276780d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        if (nVar.f94443e) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "startIdentify >> isDoingWork");
        } else {
            nVar.f94443e = true;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "initToStartIdentify >> data size: " + list.size());
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            f65.p.f341468b = currentTimeMillis;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setStartTimeStamp >> " + currentTimeMillis);
            f65.m.f341430b = currentTimeMillis;
            f65.p.f341474h = (long) list.size();
            f65.p.f341483q = 1;
            if (true ^ list.isEmpty()) {
                nVar.f94439a = aq.b.f94370f;
                aq.r0.f94473a.j(list);
                nVar.f94445g.mo7808x76db6cb1(aq.c.f94376e);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "initToStartIdentify image list is empty");
                nVar.f94439a = aq.b.f94369e;
                nVar.f94445g.mo7808x76db6cb1(aq.c.f94378g);
                f65.p.f341467a.a(6, 0, 0L);
            }
        }
        return jz5.f0.f384359a;
    }
}
