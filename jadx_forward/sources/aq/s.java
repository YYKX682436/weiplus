package aq;

/* loaded from: classes4.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f94490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.api.C4988x89c61bdd f94491e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.StringBuilder f94492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd, java.lang.StringBuilder sb6, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f94491e = c4988x89c61bdd;
        this.f94492f = sb6;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new aq.s(this.f94491e, this.f94492f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f94490d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.util.ArrayList arrayList = aq.r0.f94481i;
            com.p314xaae8f345.mm.api.C4988x89c61bdd c4988x89c61bdd = this.f94491e;
            arrayList.add(c4988x89c61bdd);
            java.util.HashMap hashMap = aq.r0.f94478f;
            java.lang.String str = c4988x89c61bdd.f134739g;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getScanImagePath(...)");
            c4988x89c61bdd.f134740h = this.f94492f.toString();
            c4988x89c61bdd.f134741i = "#";
            hashMap.put(str, c4988x89c61bdd);
            if (arrayList.size() >= 2 && !aq.r0.f94480h) {
                aq.r0.f94480h = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQuerySDKCore", java.lang.Thread.currentThread().getName() + ", cluster start");
                java.util.ArrayList arrayList2 = new java.util.ArrayList();
                arrayList2.addAll(arrayList);
                arrayList.clear();
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImageQueryConsumeTimeReporter", "setClusterPerStartTimeStamp >> timeStamp: " + currentTimeMillis);
                f65.m.f341437i = currentTimeMillis;
                aq.r0 r0Var = aq.r0.f94473a;
                this.f94490d = 1;
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
