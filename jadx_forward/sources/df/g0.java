package df;

/* loaded from: classes15.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310995d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310996e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.p0 f310997f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f310998g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f310999h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3325xe03a0797.p3326xc267989b.r2 f311000i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ boolean f311001m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(df.p0 p0Var, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, long j17, p3325xe03a0797.p3326xc267989b.r2 r2Var, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f310997f = p0Var;
        this.f310998g = enumC28568xbdfb1079;
        this.f310999h = j17;
        this.f311000i = r2Var;
        this.f311001m = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        df.g0 g0Var = new df.g0(this.f310997f, this.f310998g, this.f310999h, this.f311000i, this.f311001m, interfaceC29045xdcb5ca57);
        g0Var.f310996e = obj;
        return g0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        jz5.f0 f0Var;
        java.lang.String str;
        long j17;
        java.lang.String str2;
        java.lang.String str3;
        java.lang.String str4;
        io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df;
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f310995d;
        jz5.f0 f0Var2 = jz5.f0.f384359a;
        long j18 = this.f310999h;
        io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079 = this.f310998g;
        df.p0 p0Var = this.f310997f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            p3325xe03a0797.p3326xc267989b.y0 y0Var = (p3325xe03a0797.p3326xc267989b.y0) this.f310996e;
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchFlutterRenderSurface-" + p0Var.f311065a.m124148xee406eaa() + " to mode:" + enumC28568xbdfb1079 + " tick:" + j18 + " do swap surface path -- coroutine scope start", new java.lang.Object[0]);
            p3325xe03a0797.p3326xc267989b.r2 r2Var = this.f311000i;
            if (r2Var != null) {
                p3325xe03a0797.p3326xc267989b.p2.a(r2Var, null, 1, null);
            }
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("switchFlutterRenderSurface-");
            df.z zVar = p0Var.f311065a;
            sb6.append(zVar.m124148xee406eaa());
            sb6.append(" to mode:");
            sb6.append(enumC28568xbdfb1079);
            sb6.append(" tick:");
            sb6.append(j18);
            sb6.append(" do swap surface path -- lastInFlightJob cancel end");
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", sb6.toString(), new java.lang.Object[0]);
            io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df m137264x385aa5fd = zVar.m137264x385aa5fd();
            if (m137264x385aa5fd == null) {
                return f0Var2;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b("SkylineFlutterViewWrapperSwapRenderSurfaceImpl", "switchFlutterRenderSurface-" + zVar.m124148xee406eaa() + " to mode:" + enumC28568xbdfb1079 + " tick:" + j18 + " do swap surface path -- acquire renderer end", new java.lang.Object[0]);
            p3325xe03a0797.p3326xc267989b.p0 p0Var2 = p3325xe03a0797.p3326xc267989b.q1.f392101a;
            p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
            p3325xe03a0797.p3326xc267989b.a1 a1Var = p3325xe03a0797.p3326xc267989b.a1.UNDISPATCHED;
            f0Var = f0Var2;
            str = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl";
            j17 = j18;
            str2 = " tick:";
            str3 = " to mode:";
            str4 = "switchFlutterRenderSurface-";
            p3325xe03a0797.p3326xc267989b.f1[] f1VarArr = {p3325xe03a0797.p3326xc267989b.l.a(y0Var, g3Var, a1Var, new df.e0(this.f310997f, this.f310998g, this.f310999h, null)), p3325xe03a0797.p3326xc267989b.l.a(y0Var, g3Var, a1Var, new df.f0(this.f311001m, this.f310997f, this.f310998g, this.f310999h, m137264x385aa5fd, null))};
            this.f310996e = m137264x385aa5fd;
            this.f310995d = 1;
            if (p3325xe03a0797.p3326xc267989b.h.b(f1VarArr, this) == aVar) {
                return aVar;
            }
            c28641x1f60b8df = m137264x385aa5fd;
            obj2 = null;
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                f0Var = f0Var2;
                j17 = j18;
                str2 = " tick:";
                str4 = "switchFlutterRenderSurface-";
                str = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl";
                str3 = " to mode:";
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b(str, str4 + p0Var.f311065a.m124148xee406eaa() + str3 + enumC28568xbdfb1079 + str2 + j17 + " do swap surface path -- waitForLastFrameRedrawn end", new java.lang.Object[0]);
                p0Var.f311065a.e(enumC28568xbdfb1079, false);
                return f0Var;
            }
            c28641x1f60b8df = (io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df) this.f310996e;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            f0Var = f0Var2;
            j17 = j18;
            str2 = " tick:";
            str4 = "switchFlutterRenderSurface-";
            str = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl";
            obj2 = null;
            str3 = " to mode:";
        }
        this.f310996e = obj2;
        this.f310995d = 2;
        if (df.p0.n(p0Var, c28641x1f60b8df, this) == aVar) {
            return aVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b(str, str4 + p0Var.f311065a.m124148xee406eaa() + str3 + enumC28568xbdfb1079 + str2 + j17 + " do swap surface path -- waitForLastFrameRedrawn end", new java.lang.Object[0]);
        p0Var.f311065a.e(enumC28568xbdfb1079, false);
        return f0Var;
    }
}
