package hu3;

/* loaded from: classes5.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f366635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f366636e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ int f366637f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(hu3.n0 n0Var, int i17, int i18, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f366635d = n0Var;
        this.f366636e = i17;
        this.f366637f = i18;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hu3.d(this.f366635d, this.f366636e, this.f366637f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        hu3.d dVar = (hu3.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        dVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0029, code lost:
    
        if (r4 == false) goto L17;
     */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r6) {
        /*
            r5 = this;
            pz5.a r0 = pz5.a.f440719d
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            hu3.n0 r6 = r5.f366635d
            android.media.ImageReader r0 = r6.f366702p
            int r1 = r5.f366637f
            int r2 = r5.f366636e
            r3 = 1
            if (r0 == 0) goto L2b
            r4 = 0
            if (r0 == 0) goto L1b
            int r0 = r0.getWidth()
            if (r0 != r2) goto L1b
            r0 = r3
            goto L1c
        L1b:
            r0 = r4
        L1c:
            if (r0 == 0) goto L2b
            android.media.ImageReader r0 = r6.f366702p
            if (r0 == 0) goto L29
            int r0 = r0.getHeight()
            if (r0 != r1) goto L29
            r4 = r3
        L29:
            if (r4 != 0) goto L6a
        L2b:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "create imageReader:["
            r0.<init>(r4)
            r0.append(r2)
            java.lang.String r4 = ", "
            r0.append(r4)
            r0.append(r1)
            r4 = 93
            r0.append(r4)
            java.lang.String r0 = r0.toString()
            java.lang.String r4 = "MicroMsg.ProfessionalTemplateCorePlugin"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r0)
            android.media.ImageReader r0 = r6.f366702p
            if (r0 == 0) goto L52
            r0.close()
        L52:
            android.media.ImageReader r0 = android.media.ImageReader.newInstance(r2, r1, r3, r3)
            r6.f366702p = r0
            android.media.ImageReader r0 = r6.f366702p
            if (r0 == 0) goto L6a
            android.os.Handler r1 = new android.os.Handler
            android.os.HandlerThread r2 = r6.f366703q
            android.os.Looper r2 = r2.getLooper()
            r1.<init>(r2)
            r0.setOnImageAvailableListener(r6, r1)
        L6a:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: hu3.d.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
