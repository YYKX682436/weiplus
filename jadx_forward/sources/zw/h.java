package zw;

/* loaded from: classes.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f558047d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(android.content.Context context, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f558047d = context;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new zw.h(this.f558047d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        zw.h hVar = (zw.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        hVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x002a, code lost:
    
        if (r3 == 0) goto L8;
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
            zw.o r6 = zw.o.f558069a
            java.lang.String r6 = "checkMediaPermission selfPermission:"
            int r0 = android.os.Build.VERSION.SDK_INT
            java.lang.String r1 = "android.permission.ACCESS_MEDIA_LOCATION"
            java.lang.String r2 = "MicroMsg.BizFlutterSelectPhotoHandler"
            r3 = 29
            if (r0 >= r3) goto L14
            goto L2c
        L14:
            r0 = 0
            android.content.Context r3 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a     // Catch: java.lang.Exception -> L2e
            int r3 = b3.l.m9698x3fed0563(r3, r1)     // Catch: java.lang.Exception -> L2e
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L2e
            r4.<init>(r6)     // Catch: java.lang.Exception -> L2e
            r4.append(r3)     // Catch: java.lang.Exception -> L2e
            java.lang.String r6 = r4.toString()     // Catch: java.lang.Exception -> L2e
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)     // Catch: java.lang.Exception -> L2e
            if (r3 != 0) goto L36
        L2c:
            r0 = 1
            goto L36
        L2e:
            r6 = move-exception
            java.lang.String r3 = ""
            java.lang.Object[] r4 = new java.lang.Object[r0]
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r2, r6, r3, r4)
        L36:
            if (r0 != 0) goto L54
            java.lang.String r6 = "requestPermissions ACCESS_MEDIA_LOCATION"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r6)
            java.lang.Class<tb0.j> r6 = tb0.j.class
            i95.m r6 = i95.n0.c(r6)
            tb0.j r6 = (tb0.j) r6
            android.content.Context r0 = r5.f558047d
            android.app.Activity r0 = (android.app.Activity) r0
            sb0.f r6 = (sb0.f) r6
            r6.getClass()
            r6 = 1001(0x3e9, float:1.403E-42)
            j35.u.i(r0, r1, r6)
        L54:
            jz5.f0 r6 = jz5.f0.f384359a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: zw.h.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
