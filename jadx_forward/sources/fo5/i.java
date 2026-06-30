package fo5;

/* loaded from: classes14.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346532d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(fo5.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346532d = r0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.i(this.f346532d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.i iVar = (fo5.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        iVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        fo5.r0 r0Var = this.f346532d;
        lo5.h hVar = r0Var.f346628n;
        if (hVar.f401749c.f382766b) {
            lo5.h.b(hVar, false, 1, null);
        }
        if (r0Var.r()) {
            i95.m c17 = i95.n0.c(jp5.o.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
            jp5.o.R3((jp5.o) c17, context, false, 2, null);
            com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.v0.f258820b.d(false, true, fo5.h.f346525a);
        }
        qo5.b bVar = qo5.b.f447196a;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPVoIPNotificationHelper", "cancelNotifyWithoutKillForegroundListener: ");
        ((com.p314xaae8f345.mm.p642xad8b531f.p643x237a88eb.x) mo3.f.f411939a).f(41);
        return jz5.f0.f384359a;
    }
}
