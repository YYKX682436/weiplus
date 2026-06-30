package gl;

/* loaded from: classes14.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f354311d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354312e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ gl.y f354313f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.media.AudioDeviceInfo f354314g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(gl.y yVar, android.media.AudioDeviceInfo audioDeviceInfo, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f354313f = yVar;
        this.f354314g = audioDeviceInfo;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        gl.v vVar = new gl.v(this.f354313f, this.f354314g, interfaceC29045xdcb5ca57);
        vVar.f354312e = obj;
        return vVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((gl.v) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        p3325xe03a0797.p3326xc267989b.y0 y0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f354311d;
        gl.y yVar = this.f354313f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var3 = (p3325xe03a0797.p3326xc267989b.y0) this.f354312e;
            p3325xe03a0797.p3326xc267989b.r2 r2Var = yVar.f354325g;
            if (r2Var == null) {
                y0Var = y0Var3;
                yVar.f354325g = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new gl.u(yVar, this.f354314g, null), 3, null);
                return jz5.f0.f384359a;
            }
            this.f354312e = y0Var3;
            this.f354311d = 1;
            if (p3325xe03a0797.p3326xc267989b.v2.d(r2Var, this) == aVar) {
                return aVar;
            }
            y0Var2 = y0Var3;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f354312e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        y0Var = y0Var2;
        yVar.f354325g = p3325xe03a0797.p3326xc267989b.l.b(y0Var, null, null, new gl.u(yVar, this.f354314g, null), 3, null);
        return jz5.f0.f384359a;
    }
}
