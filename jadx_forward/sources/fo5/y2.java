package fo5;

/* loaded from: classes14.dex */
public final class y2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f346688d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ long f346689e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y2(int i17, long j17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346688d = i17;
        this.f346689e = j17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.y2(this.f346688d, this.f346689e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        fo5.y2 y2Var = (fo5.y2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        y2Var.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        er4.w h17;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        fo5.a aVar2 = fo5.f3.f346519c;
        er4.w wVar = null;
        if (aVar2 != null) {
            fo5.r0 r0Var = (fo5.r0) aVar2;
            if (r0Var.f346633s) {
                ro5.b bVar = r0Var.f346630p;
                if (bVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                    throw null;
                }
                int i17 = this.f346688d;
                h17 = bVar.h(i17);
                if (h17 != null) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "getRenderTexture for " + i17 + " ret " + h17.f337720d);
                }
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "no engine !!!");
                h17 = new er4.w();
                h17.d(1.0d);
                h17.e(0L);
                h17.f(0L);
                h17.g(0.0d);
                h17.b(0.0d);
                h17.c(false);
            }
            wVar = h17;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2354xcfa97743.p2355x6fbd6873.w wVar2 = fo5.f3.f346518b;
        if (wVar2 != null) {
            wVar2.b0(this.f346689e, wVar);
        }
        return jz5.f0.f384359a;
    }
}
