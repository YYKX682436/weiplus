package h41;

/* loaded from: classes11.dex */
public final class l0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ h41.o0 f360358d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f360359e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l0(h41.o0 o0Var, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f360358d = o0Var;
        this.f360359e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new h41.l0(this.f360358d, this.f360359e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        h41.l0 l0Var = (h41.l0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        l0Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        h41.o0 o0Var = this.f360358d;
        o0Var.f360378k = true;
        p3325xe03a0797.p3326xc267989b.r2 r2Var = o0Var.f360377j;
        if (r2Var != null) {
            p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
        }
        o0Var.f360377j = null;
        com.p314xaae8f345.mm.p980x69aca1b.p981x2e7b10.C11205xa3c55569 c11205xa3c55569 = o0Var.f360371b;
        if (c11205xa3c55569 == null) {
            c11205xa3c55569 = o0Var.f360376i;
        }
        if (c11205xa3c55569 == null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.OVCMsgUI", "dismissAsync: not attached yet, keep ui for late attach id=" + o0Var.f360374e);
        } else {
            c11205xa3c55569.m48373x63a3b28a();
            int i17 = o0Var.f360374e;
            if (i17 > 0) {
                h41.o0.f360369l.a(i17);
                o0Var.f360374e = 0;
            }
        }
        o0Var.f360371b = null;
        o0Var.f360376i = null;
        o0Var.f360372c = 0L;
        o0Var.f360373d = "";
        com.p314xaae8f345.p3133xd0ce8b26.aff.ovc.h hVar = o0Var.f360370a;
        if (hVar != null) {
            hVar.b(this.f360359e);
        }
        o0Var.f360370a = null;
        return jz5.f0.f384359a;
    }
}
