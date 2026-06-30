package vr0;

/* loaded from: classes14.dex */
public final class p extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f521026d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 f521027e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ vr0.z f521028f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nr0.x f521029g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nr0.y f521030h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(p012xc85e97e9.p023xae79c325.p034x2eaf9f.C0569x83ae3d42 c0569x83ae3d42, vr0.z zVar, nr0.x xVar, nr0.y yVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f521027e = c0569x83ae3d42;
        this.f521028f = zVar;
        this.f521029g = xVar;
        this.f521030h = yVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vr0.p(this.f521027e, this.f521028f, this.f521029g, this.f521030h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vr0.p) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x00a0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x00a7  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r11.f521026d
            r2 = 0
            nr0.x r3 = r11.f521029g
            java.lang.String r4 = "MicroMsg.Camera.CameraXImpl"
            r5 = 3
            r6 = 2
            r7 = 1
            vr0.z r8 = r11.f521028f
            androidx.camera.core.SurfaceRequest r9 = r11.f521027e
            if (r1 == 0) goto L2d
            if (r1 == r7) goto L29
            if (r1 == r6) goto L25
            if (r1 != r5) goto L1d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto La1
        L1d:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L25:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L8b
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            goto L7f
        L2d:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r1 = "onSurfaceRequested:"
            r12.<init>(r1)
            android.util.Size r1 = r9.m4793x8ee230a2()
            r12.append(r1)
            java.lang.String r1 = " rotate:"
            r12.append(r1)
            androidx.camera.core.Preview r1 = r8.f521075z
            if (r1 == 0) goto L51
            int r1 = r1.m4719x8d4b9125()
            java.lang.Integer r10 = new java.lang.Integer
            r10.<init>(r1)
            goto L52
        L51:
            r10 = r2
        L52:
            r12.append(r10)
            java.lang.String r12 = r12.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r12)
            android.util.Size r12 = r9.m4793x8ee230a2()
            int r12 = r12.getWidth()
            android.util.Size r1 = r9.m4793x8ee230a2()
            int r1 = r1.getHeight()
            r11.f521026d = r7
            r3.getClass()
            nr0.v r7 = new nr0.v
            r7.<init>(r3, r12, r1, r2)
            java.lang.String r12 = "updateInputSize"
            java.lang.Object r12 = r3.m(r12, r7, r11)
            if (r12 != r0) goto L7f
            return r0
        L7f:
            r11.f521026d = r6
            r8.getClass()
            java.lang.Object r12 = sr0.f.G(r8, r11)
            if (r12 != r0) goto L8b
            return r0
        L8b:
            r8.getClass()
            r11.f521026d = r5
            r3.getClass()
            nr0.j r12 = new nr0.j
            r12.<init>(r3, r2)
            java.lang.String r1 = "getGlInputSurface"
            java.lang.Object r12 = r3.m(r1, r12, r11)
            if (r12 != r0) goto La1
            return r0
        La1:
            android.view.Surface r12 = (android.view.Surface) r12
            jz5.f0 r0 = jz5.f0.f384359a
            if (r12 != 0) goto Lad
            java.lang.String r12 = "getGLInputSurface error"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r4, r12)
            return r0
        Lad:
            vr0.o r1 = new vr0.o
            nr0.y r2 = r11.f521030h
            r1.<init>(r2, r8)
            r9.m4797xc462ecc(r12, r2, r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: vr0.p.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
