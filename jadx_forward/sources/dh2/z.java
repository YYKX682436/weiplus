package dh2;

/* loaded from: classes10.dex */
public final class z extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f314017d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dh2.b0 f314018e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(dh2.b0 b0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f314018e = b0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new dh2.z(this.f314018e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((dh2.z) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f314017d;
        if (i17 != 0 && i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        do {
            dh2.b0 b0Var = this.f314018e;
            if (!b0Var.b()) {
                return jz5.f0.f384359a;
            }
            long f17 = b0Var.f313964k.f();
            long currentTimeMillis = (java.lang.System.currentTimeMillis() - b0Var.f313960g) + b0Var.f313961h;
            long abs = java.lang.Math.abs(currentTimeMillis - f17);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(b0Var.f313957d, "onPlayProgress progressMs: " + f17 + " curScoreProgress: " + currentTimeMillis + " offsetTime: " + abs);
            if (abs > 200) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(b0Var.f313957d, "checkBgmPlayStamp curScoreProgress: " + currentTimeMillis + " progressMs: " + f17 + " jankOffest: " + abs);
                b0Var.c(f17);
            }
            this.f314017d = 1;
        } while (p3325xe03a0797.p3326xc267989b.k1.b(300L, this) != aVar);
        return aVar;
    }
}
