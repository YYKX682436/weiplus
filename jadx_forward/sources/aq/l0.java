package aq;

/* loaded from: classes4.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94431d;

    public l0(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq.l0(interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return new aq.l0((p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94431d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(java.lang.Thread.currentThread().getName());
            sb6.append(", if need do last cluster, ");
            java.util.ArrayList arrayList = aq.r0.f94481i;
            sb6.append(arrayList.size());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", sb6.toString());
            if (arrayList.size() <= 0 || aq.r0.f94480h) {
                aq.c cVar = aq.c.f94378g;
                aq.r0.f94486n = cVar;
                aq.n nVar = aq.o.f94455c;
                if (nVar != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageDataManager", "postFinishType");
                    nVar.f94445g.mo7808x76db6cb1(cVar);
                }
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", "all image identify is finish >> timeStamp: " + currentTimeMillis);
                f65.p.f341467a.a(4, aq.r0.f94487o, currentTimeMillis);
                f65.m.f341429a.a(4);
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", "need to do last cluster");
                aq.r0.f94480h = true;
                aq.r0.f94486n = aq.c.f94377f;
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(arrayList);
                arrayList.clear();
                long currentTimeMillis2 = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setClusterPerStartTimeStamp >> timeStamp: " + currentTimeMillis2);
                f65.m.f341437i = currentTimeMillis2;
                aq.r0 r0Var = aq.r0.f94473a;
                this.f94431d = 1;
                java.lang.Object g17 = p3325xe03a0797.p3326xc267989b.l.g(lu5.a.f402990f, new aq.r(arrayList2, null), this);
                if (g17 != aVar) {
                    g17 = f0Var;
                }
                if (g17 == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return f0Var;
    }
}
