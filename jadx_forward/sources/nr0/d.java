package nr0;

/* loaded from: classes14.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f420603d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420604e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(nr0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420604e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr0.d(this.f420604e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r9) {
        /*
            r8 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r8.f420603d
            r2 = 0
            r3 = 2
            r4 = 1
            jz5.f0 r5 = jz5.f0.f384359a
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L14
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L8d
        L14:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r0)
            throw r9
        L1c:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            goto L4a
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r9)
            nr0.x r9 = r8.f420604e
            android.graphics.SurfaceTexture r9 = r9.f420652h
            if (r9 == 0) goto L2c
            r9.updateTexImage()
        L2c:
            nr0.x r9 = r8.f420604e
            boolean r1 = r9.f420660s
            if (r1 != 0) goto L8d
            boolean r1 = r9.f420662u
            if (r1 == 0) goto L8d
            boolean r1 = r9.f420661t
            if (r1 == 0) goto L3d
            r9.f420661t = r2
            return r5
        L3d:
            zr0.p r1 = r9.f420655n
            is0.c r9 = r9.f420651g
            r8.f420603d = r4
            java.lang.Object r9 = r1.k(r9, r8)
            if (r9 != r0) goto L4a
            return r0
        L4a:
            nr0.x r9 = r8.f420604e
            boolean r9 = r9.f420664w
            if (r9 == 0) goto L8d
            java.lang.String r9 = "MicroMsg.Camera.GLEnvBuilder"
            java.lang.String r1 = "isFirstFrame"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r9, r1)
            nr0.x r9 = r8.f420604e
            r9.f420664w = r2
            kotlinx.coroutines.flow.j2 r9 = r9.f420665x
            if (r9 == 0) goto L8d
            bs0.g r1 = bs0.g.f105326m
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
            nr0.x r4 = r8.f420604e
            xr0.k r6 = r4.f420654m
            xr0.j r6 = r6.f537710c
            int r6 = r6.f537706a
            java.lang.String r7 = "camera_int_1"
            r2.putInt(r7, r6)
            xr0.k r4 = r4.f420654m
            xr0.j r4 = r4.f537710c
            int r4 = r4.f537707b
            java.lang.String r6 = "camera_int_2"
            r2.putInt(r6, r4)
            jz5.l r4 = new jz5.l
            r4.<init>(r1, r2)
            r8.f420603d = r3
            kotlinx.coroutines.flow.h3 r9 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.h3) r9
            r9.mo771x2f8fd3(r4, r8)
            if (r5 != r0) goto L8d
            return r0
        L8d:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: nr0.d.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
