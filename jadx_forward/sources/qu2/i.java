package qu2;

/* loaded from: classes12.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f448316d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448317e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ qu2.k f448318f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(qu2.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f448318f = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        qu2.i iVar = new qu2.i(this.f448318f, interfaceC29045xdcb5ca57);
        iVar.f448317e = obj;
        return iVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((qu2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f448316d;
        qu2.k kVar = this.f448318f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f448317e;
            ts5.n nVar = (ts5.n) i95.n0.c(ts5.n.class);
            ts5.a collectWhat = kVar.f448321a;
            qu2.h hVar = qu2.h.f448315d;
            nu2.i iVar = (nu2.i) nVar;
            iVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(collectWhat, "collectWhat");
            nu2.f fVar = new nu2.f(hVar);
            ou2.d dVar = iVar.f421714d;
            dVar.getClass();
            kVar.f448323c = new ou2.c(collectWhat, dVar, fVar);
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f448317e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            ((com.p314xaae8f345.mm.p689xc5a27af6.p758xa7c31030.c2) ((ob0.h3) i95.n0.c(ob0.h3.class))).getClass();
            int i18 = com.p314xaae8f345.mm.p1006xc5476f33.p1944xa7c31030.p1947xef4ce806.b0.B.g().f425501y;
            ts5.b bVar = kVar.f448323c;
            if (bVar != null) {
                qu2.g gVar = new qu2.g(i18 / 1024.0f);
                ou2.c cVar = (ou2.c) bVar;
                ou2.d dVar2 = cVar.f430462b;
                dVar2.getClass();
                ts5.p uniqueTag = cVar.f430461a;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(uniqueTag, "uniqueTag");
                ts5.m calculator = cVar.f430463c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(calculator, "calculator");
                if (uniqueTag.f503274a.f503264d || ou2.a.a(ou2.d.f430464d)) {
                    ou2.e eVar = dVar2.f430465a;
                    eVar.getClass();
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("TraceWorker", "#collect uniqueTag=" + uniqueTag + " currentData=" + gVar);
                    java.util.Map map = eVar.f430469b;
                    java.util.List list = (java.util.List) ((java.util.LinkedHashMap) map).get(uniqueTag);
                    if (list == null) {
                        list = new java.util.ArrayList();
                        map.put(uniqueTag, list);
                    }
                    list.add(gVar);
                    if (list.size() >= 1800) {
                        nu2.e.a(dVar2, calculator, uniqueTag, false, 4, null);
                    }
                }
            }
            this.f448317e = y0Var;
            this.f448316d = 1;
            if (p3325xe03a0797.p3326xc267989b.k1.b(60000L, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
