package zd1;

/* loaded from: classes7.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f553116d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.graphics.Bitmap f553117e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zd1.a0 f553118f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(int i17, android.graphics.Bitmap bitmap, zd1.a0 a0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f553116d = i17;
        this.f553117e = bitmap;
        this.f553118f = a0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zd1.y(this.f553116d, this.f553117e, this.f553118f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zd1.y yVar = (zd1.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        yVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        try {
            float min = this.f553116d / java.lang.Math.min(this.f553117e.getWidth(), this.f553117e.getHeight());
            zd1.f fVar = zd1.g.f553064i;
            if (min >= 1.0f) {
                android.graphics.Bitmap bitmap = this.f553117e;
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C0 = this.f553118f.f553054a.C0();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C0, "getService(...)");
                fVar.a(bitmap, C0, false);
            } else {
                android.graphics.Bitmap F0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x.F0(this.f553117e, min, min, true);
                if (F0 != null && !F0.isRecycled()) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 C02 = this.f553118f.f553054a.C0();
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.f(C02, "getService(...)");
                    fVar.a(F0, C02, true);
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.SecuritySnapshotContext", "scale and dispatch bitmap for " + this.f553118f.f553054a.f156336n + ", get exception:" + e17);
        }
        return jz5.f0.f384359a;
    }
}
