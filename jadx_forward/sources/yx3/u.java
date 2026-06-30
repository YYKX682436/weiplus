package yx3;

/* loaded from: classes10.dex */
public final class u extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public long f549468d;

    /* renamed from: e, reason: collision with root package name */
    public int f549469e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f549470f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ yx3.v f549471g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f549472h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ boolean f549473i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(yx3.v vVar, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f549471g = vVar;
        this.f549472h = str;
        this.f549473i = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        yx3.u uVar = new yx3.u(this.f549471g, this.f549472h, this.f549473i, interfaceC29045xdcb5ca57);
        uVar.f549470f = obj;
        return uVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yx3.u) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3325xe03a0797.p3326xc267989b.y0 y0Var;
        long j17;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f549469e;
        java.lang.String str = this.f549472h;
        yx3.v vVar = this.f549471g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var2 = (p3325xe03a0797.p3326xc267989b.y0) this.f549470f;
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            long a17 = yx3.v.a(vVar);
            yx3.t tVar = new yx3.t(str, vVar, this.f549473i, null);
            this.f549470f = y0Var2;
            this.f549468d = elapsedRealtime;
            this.f549469e = 1;
            java.lang.Object c17 = p3325xe03a0797.p3326xc267989b.a4.c(a17, tVar, this);
            if (c17 == aVar) {
                return aVar;
            }
            y0Var = y0Var2;
            obj = c17;
            j17 = elapsedRealtime;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            j17 = this.f549468d;
            y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f549470f;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        vx3.i iVar = (vx3.i) obj;
        if (iVar == null) {
            iVar = vx3.l.E.b();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.RingtoneServiceHelper", "getRingBackMediaInfo timeout with " + yx3.v.a(vVar) + ", use default ringtone");
        }
        boolean z18 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
        vVar.f549497x = android.os.SystemClock.elapsedRealtime() - j17;
        vVar.f549477d = iVar.f522817a;
        vVar.f549475b = iVar;
        if (p3325xe03a0797.p3326xc267989b.z0.h(y0Var)) {
            vVar.d(vx3.b.f522798e);
        }
        vx3.c cVar = vVar.f549478e;
        if ((cVar != null ? cVar.f522803a : null) == vx3.d.f522806d) {
            if (str != null) {
                vVar.D = str;
            }
            vVar.f549492s = java.lang.System.currentTimeMillis();
            vVar.f549498y = iVar.f522829m;
            java.lang.String r07 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.r0(iVar.f522831o);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r07, "getUnsignedLongString(...)");
            vVar.f549499z = r07;
            vVar.B = iVar.f522833q;
            vVar.E = mx3.i0.f414110a.b(iVar);
            vVar.f549493t = iVar.f522823g;
            java.lang.String toUser = vVar.D;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(toUser, "toUser");
            mx3.i0.f414115f.putString(toUser, iVar.n());
        }
        return jz5.f0.f384359a;
    }
}
