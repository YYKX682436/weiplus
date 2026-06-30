package h41;

/* loaded from: classes11.dex */
public final class r0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.t0 f360384d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360385e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(h41.t0 t0Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360384d = t0Var;
        this.f360385e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.r0(this.f360384d, this.f360385e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h41.r0 r0Var = (h41.r0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        r0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.t0 t0Var = this.f360384d;
        t0Var.f360401j = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = t0Var.f360400i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        t0Var.f360400i = null;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11201x6771ccd0 c11201x6771ccd0 = t0Var.f360395b;
        if (c11201x6771ccd0 == null) {
            c11201x6771ccd0 = t0Var.f360399h;
        }
        if (c11201x6771ccd0 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCPermissionRequestUI", "dismiss: not attached yet, keep ui for late attach id=" + t0Var.f360397d);
        } else {
            c11201x6771ccd0.m48373x63a3b28a();
            int i17 = t0Var.f360397d;
            if (i17 > 0) {
                h41.t0.f360393k.a(i17);
                t0Var.f360397d = 0;
            }
        }
        t0Var.f360395b = null;
        t0Var.f360399h = null;
        t0Var.f360396c = 0L;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.j jVar = t0Var.f360394a;
        if (jVar != null) {
            jVar.b(this.f360385e);
        }
        t0Var.f360394a = null;
        return jz5.f0.f384359a;
    }
}
