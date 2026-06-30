package df;

/* loaded from: classes15.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f310982d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f310983e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df.p0 f310984f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 f310985g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f310986h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df f310987i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(boolean z17, df.p0 p0Var, io.p3284xd2ae381c.p3285xac0c4757.p3286xcca8366f.EnumC28568xbdfb1079 enumC28568xbdfb1079, long j17, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3299xe28140c3.C28641x1f60b8df c28641x1f60b8df, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f310983e = z17;
        this.f310984f = p0Var;
        this.f310985g = enumC28568xbdfb1079;
        this.f310986h = j17;
        this.f310987i = c28641x1f60b8df;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df.f0(this.f310983e, this.f310984f, this.f310985g, this.f310986h, this.f310987i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x007c, code lost:
    
        if (r15 == r0) goto L18;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r15) {
        /*
            r14 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r14.f310982d
            r2 = 0
            long r3 = r14.f310986h
            java.lang.String r5 = " tick:"
            io.flutter.embedding.android.RenderMode r6 = r14.f310985g
            java.lang.String r7 = " to mode:"
            java.lang.String r8 = "switchFlutterRenderSurface-"
            java.lang.String r9 = "SkylineFlutterViewWrapperSwapRenderSurfaceImpl"
            jz5.f0 r10 = jz5.f0.f384359a
            df.p0 r11 = r14.f310984f
            r12 = 1
            if (r1 == 0) goto L26
            if (r1 != r12) goto L1e
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            goto L83
        L1e:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L26:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r15)
            boolean r15 = r14.f310983e
            if (r15 == 0) goto L56
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r8)
            df.z r0 = r11.f311065a
            int r0 = r0.m124148xee406eaa()
            r15.append(r0)
            r15.append(r7)
            r15.append(r6)
            r15.append(r5)
            r15.append(r3)
            java.lang.String r0 = " do swap surface path -- ignore displaying end"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b(r9, r15, r0)
            goto Lab
        L56:
            r14.f310982d = r12
            r11.getClass()
            io.flutter.embedding.engine.renderer.FlutterRenderer r15 = r14.f310987i
            boolean r1 = r15.m138028x6250be46()
            if (r1 == 0) goto L64
            goto L7f
        L64:
            kotlinx.coroutines.r r1 = new kotlinx.coroutines.r
            kotlin.coroutines.Continuation r13 = pz5.f.b(r14)
            r1.<init>(r13, r12)
            r1.k()
            df.m0 r12 = new df.m0
            r12.<init>(r1, r15)
            r15.m138017x9a2d27f9(r12)
            java.lang.Object r15 = r1.j()
            if (r15 != r0) goto L7f
            goto L80
        L7f:
            r15 = r10
        L80:
            if (r15 != r0) goto L83
            return r0
        L83:
            java.lang.StringBuilder r15 = new java.lang.StringBuilder
            r15.<init>(r8)
            df.z r0 = r11.f311065a
            int r0 = r0.m124148xee406eaa()
            r15.append(r0)
            r15.append(r7)
            r15.append(r6)
            r15.append(r5)
            r15.append(r3)
            java.lang.String r0 = " do swap surface path -- wait for displaying end"
            r15.append(r0)
            java.lang.String r15 = r15.toString()
            java.lang.Object[] r0 = new java.lang.Object[r2]
            com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.s3.b(r9, r15, r0)
        Lab:
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: df.f0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
