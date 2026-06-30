package so5;

/* loaded from: classes14.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ so5.k0 f492359d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ uo5.u f492360e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(so5.k0 k0Var, uo5.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492359d = k0Var;
        this.f492360e = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so5.f0(this.f492359d, this.f492360e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((so5.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0073  */
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
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r12)
            so5.k0 r12 = r11.f492359d
            int r0 = r12.f492401r
            jz5.f0 r1 = jz5.f0.f384359a
            r2 = 1
            if (r0 <= r2) goto Lf
            return r1
        Lf:
            zq4.b r0 = r12.f492392f
            if (r0 == 0) goto Lb5
            android.util.Size r0 = r0.f556579f
            if (r0 == 0) goto Lb5
            int r3 = r0.getWidth()
            int r4 = r0.getHeight()
            if (r3 >= r4) goto L22
            r3 = r4
        L22:
            uo5.u r4 = r11.f492360e
            int r5 = r4.f511277a
            int r4 = r4.f511278b
            if (r5 >= r4) goto L2b
            r5 = r4
        L2b:
            if (r3 == r5) goto Lb5
            r4 = 640(0x280, float:8.97E-43)
            r6 = 1920(0x780, float:2.69E-42)
            r7 = 1280(0x500, float:1.794E-42)
            if (r5 == r4) goto L3e
            if (r5 == r7) goto L3c
            if (r5 == r6) goto L3a
            goto L3c
        L3a:
            r8 = r6
            goto L48
        L3c:
            r8 = r7
            goto L48
        L3e:
            boolean r8 = vq4.b0.p()
            if (r8 == 0) goto L3c
            r12.getClass()
            goto L3c
        L48:
            r12.getClass()
            int r9 = r0.getHeight()
            float r9 = (float) r9
            int r0 = r0.getWidth()
            float r0 = (float) r0
            float r9 = r9 / r0
            android.util.Size r0 = new android.util.Size
            float r10 = (float) r8
            float r10 = r10 * r9
            int r9 = (int) r10
            r0.<init>(r8, r9)
            zq4.b r9 = r12.f492392f
            if (r9 == 0) goto L73
            int r10 = r0.getWidth()
            int r0 = r0.getHeight()
            boolean r0 = r9.g(r10, r0)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            goto L74
        L73:
            r0 = 0
        L74:
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            boolean r0 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r0, r9)
            if (r0 == 0) goto La2
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "current switch preview "
            r0.<init>(r4)
            r0.append(r3)
            java.lang.String r3 = " and "
            r0.append(r3)
            r0.append(r5)
            java.lang.String r3 = " failed"
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "MicroMsg.ILinkVoIPCameraHelper"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r3, r0)
            int r0 = r12.f492401r
            int r0 = r0 + r2
            r12.f492401r = r0
            goto Lb5
        La2:
            if (r8 == r4) goto Laf
            if (r8 == r7) goto Lac
            if (r8 == r6) goto La9
            goto Lac
        La9:
            r0 = 1080(0x438, float:1.513E-42)
            goto Lb1
        Lac:
            r0 = 720(0x2d0, float:1.009E-42)
            goto Lb1
        Laf:
            r0 = 480(0x1e0, float:6.73E-43)
        Lb1:
            r12.f492393g = r0
            r12.f492399p = r2
        Lb5:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: so5.f0.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
