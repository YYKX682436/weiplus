package nc5;

/* loaded from: classes10.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f417729d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f417730e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nc5.o f417731f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(nc5.o oVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f417731f = oVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        nc5.e eVar = new nc5.e(this.f417731f, interfaceC29045xdcb5ca57);
        eVar.f417730e = obj;
        return eVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nc5.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        aq.n nVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f417729d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f417730e;
            android.util.Pair g17 = nc5.a.f417721a.g(this.f417731f.f417747b, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MediaHistoryQueryHeaderUI", "get result >> " + ((java.util.ArrayList) g17.first).size() + ", " + ((java.util.ArrayList) g17.second).size());
            if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var) && (nVar = aq.o.f94455c) != null) {
                java.lang.Object first = g17.first;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(first, "first");
                java.lang.Object second = g17.second;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(second, "second");
                this.f417729d = 1;
                if (nVar.c((java.util.ArrayList) first, (java.util.ArrayList) second, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
