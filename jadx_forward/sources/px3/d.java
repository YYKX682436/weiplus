package px3;

/* loaded from: classes10.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f440470d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f440471e;

    /* renamed from: f, reason: collision with root package name */
    public int f440472f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ px3.j f440473g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.util.ArrayList f440474h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(px3.j jVar, java.util.ArrayList arrayList, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f440473g = jVar;
        this.f440474h = arrayList;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new px3.d(this.f440473g, this.f440474h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((px3.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.util.Iterator it;
        px3.j jVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f440472f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            px3.j jVar2 = this.f440473g;
            int i18 = jVar2.f440485g;
            jVar2.getClass();
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.ArrayList arrayList2 = this.f440474h;
            int size = arrayList2.size();
            int i19 = size / i18;
            if (i19 >= 0) {
                int i27 = 0;
                while (true) {
                    int i28 = i27 * i18;
                    int i29 = i27 + 1;
                    int i37 = i29 * i18;
                    if (i37 >= size) {
                        i37 = size;
                    }
                    arrayList.add(arrayList2.subList(i28, i37));
                    if (i27 == i19) {
                        break;
                    }
                    i27 = i29;
                }
            }
            it = arrayList.iterator();
            jVar = jVar2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (java.util.Iterator) this.f440471e;
            jVar = (px3.j) this.f440470d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        while (it.hasNext()) {
            java.util.List ringtone = (java.util.List) it.next();
            rx3.h hVar = jVar.f440482d;
            hVar.getClass();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(ringtone, "ringtone");
            p3325xe03a0797.p3326xc267989b.p3328x30012e.m2 m2Var = new p3325xe03a0797.p3326xc267989b.p3328x30012e.m2(new rx3.g(ringtone, hVar, null));
            px3.c cVar = new px3.c(jVar);
            this.f440470d = jVar;
            this.f440471e = it;
            this.f440472f = 1;
            if (m2Var.a(cVar, this) == aVar) {
                return aVar;
            }
        }
        return jz5.f0.f384359a;
    }
}
