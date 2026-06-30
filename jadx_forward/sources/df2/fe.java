package df2;

/* loaded from: classes3.dex */
public final class fe extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f311668d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.vm1 f311669e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.qe f311670f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe(r45.vm1 vm1Var, df2.qe qeVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f311669e = vm1Var;
        this.f311670f = qeVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.fe(this.f311669e, this.f311670f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.fe) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f311668d;
        r45.vm1 vm1Var = this.f311669e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            java.lang.String str2 = "beginDownload url: " + vm1Var.m75945x2fec8307(2);
            int i18 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveButtonChangeController", str2, null);
            if (ae2.in.f85221a.a(ym5.f6.f544852p1)) {
                rj.j b17 = nn2.d.f420204a.b();
                java.lang.String m75945x2fec8307 = vm1Var.m75945x2fec8307(2);
                str = m75945x2fec8307 != null ? m75945x2fec8307 : "";
                this.f311668d = 1;
                obj = ((b51.m) b17).j(str, "LiveButtonChangeController", this);
                if (obj == aVar) {
                    return aVar;
                }
            } else {
                rj.j b18 = nn2.d.f420204a.b();
                java.lang.String m75945x2fec83072 = vm1Var.m75945x2fec8307(2);
                str = m75945x2fec83072 != null ? m75945x2fec83072 : "";
                this.f311668d = 2;
                obj = ((b51.m) b18).h(str, "LiveButtonChangeController", this);
                if (obj == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1 && i17 != 2) {
                if (i17 != 3) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                java.lang.String str3 = "download url: " + vm1Var.m75945x2fec8307(2) + ", delay: " + vm1Var.m75939xb282bd08(3) + ", canPlayTime: " + (vm1Var.m75939xb282bd08(3) + c01.id.c());
                int i19 = rl.b.f478676a;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveButtonChangeController", str3, null);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        if (obj != null) {
            p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            df2.ee eeVar = new df2.ee(this.f311670f, vm1Var, obj, null);
            this.f311668d = 3;
            if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, eeVar, this) == aVar) {
                return aVar;
            }
            java.lang.String str32 = "download url: " + vm1Var.m75945x2fec8307(2) + ", delay: " + vm1Var.m75939xb282bd08(3) + ", canPlayTime: " + (vm1Var.m75939xb282bd08(3) + c01.id.c());
            int i192 = rl.b.f478676a;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveButtonChangeController", str32, null);
        }
        return jz5.f0.f384359a;
    }
}
