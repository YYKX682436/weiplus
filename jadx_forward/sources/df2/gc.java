package df2;

/* loaded from: classes3.dex */
public final class gc extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ df2.jc f311743d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gc(df2.jc jcVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311743d = jcVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.gc(this.f311743d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        df2.gc gcVar = (df2.gc) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        gcVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        zl2.r4 r4Var = zl2.r4.f555483a;
        df2.jc jcVar = this.f311743d;
        boolean I1 = r4Var.I1(jcVar.getStore().getLiveRoomData());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveAnchorDataPanelController", "onLiveMsg: isStartPolling=" + jcVar.f311999m + ", isDataPanelEnable=" + I1);
        if (!jcVar.f311999m) {
            df2.jc.Z6(jcVar, "onLiveMsg");
        } else if (!I1) {
            jcVar.d7("onLiveMsgDisable");
        }
        return jz5.f0.f384359a;
    }
}
