package yd2;

/* loaded from: classes5.dex */
public final class c extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f542568d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.util.List f542569e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.List f542570f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yd2.j f542571g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yz5.l f542572h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ java.util.concurrent.ConcurrentHashMap f542573i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(java.util.List list, java.util.List list2, yd2.j jVar, yz5.l lVar, java.util.concurrent.ConcurrentHashMap concurrentHashMap, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f542569e = list;
        this.f542570f = list2;
        this.f542571g = jVar;
        this.f542572h = lVar;
        this.f542573i = concurrentHashMap;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yd2.c(this.f542569e, this.f542570f, this.f542571g, this.f542572h, this.f542573i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yd2.c) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f542568d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f542568d = 1;
            if (p3325xe03a0797.p3326xc267989b.h.c(this.f542569e, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = this.f542570f.iterator();
        while (it.hasNext()) {
            r45.mf1 mf1Var = (r45.mf1) this.f542573i.get(((yd2.n) it.next()).f542611a);
            if (mf1Var != null) {
                arrayList.add(mf1Var);
            }
        }
        yd2.j jVar = this.f542571g;
        yd2.j.a(jVar);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.Live.AiAssistant.ToolManager", "handleToolCalls: all " + arrayList.size() + " completed");
        this.f542572h.mo146xb9724478(arrayList);
        yz5.l lVar = jVar.f542607b;
        if (lVar != null) {
            lVar.mo146xb9724478(arrayList);
        }
        return jz5.f0.f384359a;
    }
}
