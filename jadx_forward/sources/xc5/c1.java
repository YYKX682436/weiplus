package xc5;

/* loaded from: classes9.dex */
public final class c1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f534938d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c1(xc5.k1 k1Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f534938d = k1Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xc5.c1(this.f534938d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        xc5.c1 c1Var = (xc5.c1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        c1Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.util.HashSet h76 = this.f534938d.h7();
        xc5.k1 k1Var = this.f534938d;
        synchronized (h76) {
            for (java.lang.String str : k1Var.h7()) {
                ((ot.q) ((pt.k0) i95.n0.c(pt.k0.class))).Zi(str);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MediaGallery.MsgHistoryGalleryLiveStateManager", "cancel all download task, id=" + str);
            }
        }
        return jz5.f0.f384359a;
    }
}
