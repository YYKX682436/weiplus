package dx0;

/* loaded from: classes5.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f325981d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.n f325982e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 f325983f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ boolean f325984g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 f325985h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(dx0.n nVar, com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 c3971x241f78, boolean z17, com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f325982e = nVar;
        this.f325983f = c3971x241f78;
        this.f325984g = z17;
        this.f325985h = c4181x2248e1a3;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dx0.l(this.f325982e, this.f325983f, this.f325984g, this.f325985h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dx0.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f325981d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            ex0.a0 a0Var = this.f325982e.f325993d;
            if (a0Var == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineVM");
                throw null;
            }
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID = this.f325983f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID, "segmentID");
            a0Var.D.remove(segmentID);
            if (this.f325984g) {
                java.util.Set keySet = this.f325982e.f325998i.keySet();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(keySet, "<get-keys>(...)");
                com.p314xaae8f345.p457x3304c6.p479x4179489f.p481x3eef47a0.C4181x2248e1a3 c4181x2248e1a3 = this.f325985h;
                java.util.ArrayList arrayList = new java.util.ArrayList();
                for (java.lang.Object obj2 : keySet) {
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((dx0.r) obj2).f326006a, c4181x2248e1a3.f130065a)) {
                        arrayList.add(obj2);
                    }
                }
                dx0.n nVar = this.f325982e;
                java.util.Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    dx0.r rVar = (dx0.r) it.next();
                    java.util.concurrent.ConcurrentHashMap concurrentHashMap = nVar.f325998i;
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.d(rVar);
                    synchronized (concurrentHashMap) {
                        concurrentHashMap.remove(rVar);
                    }
                }
            }
            com.p314xaae8f345.p457x3304c6.p479x4179489f.o0 c17 = com.p314xaae8f345.p457x3304c6.p479x4179489f.o0.c(this.f325985h, this.f325982e.b(), this.f325985h.C() != ug.m.ImageClip);
            ex0.a0 a0Var2 = this.f325982e.f325993d;
            if (a0Var2 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("timelineVM");
                throw null;
            }
            com.p314xaae8f345.p457x3304c6.p459x2e06d1.C3971x241f78 segmentID2 = this.f325983f;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(segmentID2, "segmentID");
            a0Var2.D.put(segmentID2, c17);
            dx0.n nVar2 = this.f325982e;
            p3325xe03a0797.p3326xc267989b.p0 p0Var = nVar2.f325991b;
            dx0.k kVar = new dx0.k(nVar2, this.f325983f, null);
            this.f325981d = 1;
            if (p3325xe03a0797.p3326xc267989b.l.g(p0Var, kVar, this) == aVar) {
                return aVar;
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
