package h41;

/* loaded from: classes11.dex */
public final class v0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.y0 f360408d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360409e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(h41.y0 y0Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360408d = y0Var;
        this.f360409e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.v0(this.f360408d, this.f360409e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h41.v0 v0Var = (h41.v0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        v0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.y0 y0Var = this.f360408d;
        y0Var.f360434j = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = y0Var.f360433i;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        y0Var.f360433i = null;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11202x49ad0094 c11202x49ad0094 = y0Var.f360428b;
        if (c11202x49ad0094 == null) {
            c11202x49ad0094 = y0Var.f360432h;
        }
        if (c11202x49ad0094 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCSelectContactUI", "dismiss: not attached yet, keep ui for late attach id=" + y0Var.f360430d);
        } else {
            c11202x49ad0094.m48373x63a3b28a();
            int i17 = y0Var.f360430d;
            if (i17 > 0) {
                h41.y0.f360426k.a(i17);
                y0Var.f360430d = 0;
            }
        }
        y0Var.f360428b = null;
        y0Var.f360432h = null;
        y0Var.f360429c = 0L;
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.l lVar = y0Var.f360427a;
        if (lVar != null) {
            lVar.b(this.f360409e);
        }
        y0Var.f360427a = null;
        return jz5.f0.f384359a;
    }
}
