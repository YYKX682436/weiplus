package sx3;

/* loaded from: classes2.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f495107d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f495108e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ sx3.q f495109f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(long j17, sx3.q qVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f495108e = j17;
        this.f495109f = qVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new sx3.p(this.f495108e, this.f495109f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((sx3.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f495107d;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                ux3.g gVar = new ux3.g(this.f495108e);
                this.f495107d = 1;
                obj = rm0.h.a(gVar, 0L, null, this, 3, null);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            }
            t45.u uVar = (t45.u) obj;
            p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity = this.f495109f.m158354x19263085();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
            sx3.b bVar = (sx3.b) pf5.z.f435481a.a(activity).a(sx3.b.class);
            java.util.LinkedList Infos = uVar.f497179e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(Infos, "Infos");
            boolean z17 = uVar.f497178d;
            bVar.getClass();
            bVar.f495080e = z17;
            p3325xe03a0797.p3326xc267989b.l.d(bVar.m158345xefc66565(), null, null, new sx3.a(z17, Infos, bVar, null), 3, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.RingtoneHistoryManager", "getHistoryRingBack failed: " + e17.getMessage());
        }
        return jz5.f0.f384359a;
    }
}
