package ix3;

/* loaded from: classes.dex */
public final class y3 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ix3.c4 f377149d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y3(ix3.c4 c4Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377149d = c4Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new ix3.y3(this.f377149d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        ix3.y3 y3Var = (ix3.y3) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y3Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        j75.f m67437x4bd5310;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        r45.dp5 dp5Var = new r45.dp5();
        ix3.c4 c4Var = this.f377149d;
        byte[] byteArrayExtra = c4Var.m158359x1e885992().getByteArrayExtra("key_config_item_list");
        if (byteArrayExtra != null) {
            dp5Var.mo11468x92b714fd(byteArrayExtra);
        }
        c4Var.T6(dp5Var);
        com.p314xaae8f345.mm.p1006xc5476f33.p1924x6c894cf1.AbstractActivityC16711x120e7ae0 P6 = c4Var.P6();
        if (P6 != null && (m67437x4bd5310 = P6.m67437x4bd5310()) != null) {
            m67437x4bd5310.B3(new hx3.d(c4Var.f376913e));
        }
        return jz5.f0.f384359a;
    }
}
