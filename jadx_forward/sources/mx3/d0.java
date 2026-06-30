package mx3;

/* loaded from: classes10.dex */
public final class d0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f414074d;

    /* renamed from: e, reason: collision with root package name */
    public int f414075e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vx3.c f414076f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f414077g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ boolean f414078h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(vx3.c cVar, java.lang.String str, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f414076f = cVar;
        this.f414077g = str;
        this.f414078h = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mx3.d0(this.f414076f, this.f414077g, this.f414078h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mx3.d0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        vx3.c cVar;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f414075e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            vx3.c cVar2 = this.f414076f;
            if (cVar2 != null) {
                int ordinal = cVar2.f522803a.ordinal();
                if (ordinal != 0) {
                    if (ordinal == 1) {
                        mx3.f0 f0Var = mx3.f0.f414081a;
                        java.lang.String str = mx3.f0.f414086f;
                        f0Var.d(str);
                        dk4.a aVar2 = new dk4.a("voip_ending_sound", f0Var.d(str), "", 0, 0);
                        aVar2.f316001e = true;
                        return new vx3.i(aVar2, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                    }
                    if (ordinal == 2) {
                        mx3.f0 f0Var2 = mx3.f0.f414081a;
                        f0Var2.d(mx3.f0.f414086f);
                        dk4.a aVar3 = new dk4.a("voip_bad_net_sound", f0Var2.d(mx3.f0.f414088h), "", 0, 0);
                        aVar3.f316001e = true;
                        return new vx3.i(aVar3, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                    }
                    if (ordinal != 3) {
                        throw new jz5.j();
                    }
                    mx3.f0 f0Var3 = mx3.f0.f414081a;
                    f0Var3.d(mx3.f0.f414086f);
                    dk4.a aVar4 = new dk4.a("voip_close_sound", f0Var3.d(mx3.f0.f414087g), "", 0, 0);
                    aVar4.f316001e = true;
                    aVar4.f316008l = false;
                    return new vx3.i(aVar4, 0L, com.p314xaae8f345.p3121x37984a.p3125x2eaf9f.C26918x6e83759b.f58001x610e5697);
                }
                java.lang.String str2 = this.f414077g;
                if (str2 != null) {
                    boolean z17 = this.f414078h;
                    if (!z17) {
                        if (!(str2.length() == 0)) {
                            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str2, c01.z1.r())) {
                                str2 = "";
                            }
                            return mx3.i0.j(str2);
                        }
                    }
                    this.f414074d = cVar2;
                    this.f414075e = 1;
                    java.lang.Object b17 = mx3.f0.b(str2, z17, this);
                    if (b17 == aVar) {
                        return aVar;
                    }
                    cVar = cVar2;
                    obj = b17;
                }
            }
            return vx3.l.E.b();
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        cVar = (vx3.c) this.f414074d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        vx3.i iVar = (vx3.i) obj;
        dk4.a aVar5 = iVar.f522817a;
        if (aVar5 != null) {
            aVar5.f316008l = cVar.f522805c;
        }
        mx3.f0.f414084d.mo7808x76db6cb1(iVar);
        return obj;
    }
}
