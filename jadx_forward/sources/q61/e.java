package q61;

/* loaded from: classes11.dex */
public final class e extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f441774d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f441775e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ q61.k f441776f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activityC0065xcd7aa112, q61.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f441775e = activityC0065xcd7aa112;
        this.f441776f = kVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new q61.e(this.f441775e, this.f441776f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((q61.e) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0070  */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r7) {
        /*
            r6 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r6.f441774d
            r2 = 0
            androidx.appcompat.app.AppCompatActivity r3 = r6.f441775e
            java.lang.String r4 = "PushLoginURLTAG3MainDeviceCGI"
            r5 = 1
            if (r1 == 0) goto L1a
            if (r1 != r5) goto L12
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            goto L3d
        L12:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r0)
            throw r7
        L1a:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r7)
            java.lang.Class r7 = r3.getClass()
            java.lang.String r7 = r7.getName()
            java.lang.String r1 = "checkLoginURLMainDevice1 "
            java.lang.String r7 = r1.concat(r7)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r7)
            kotlinx.coroutines.z r7 = q61.j.f441798e
            if (r7 == 0) goto L44
            r6.f441774d = r5
            kotlinx.coroutines.a0 r7 = (p3325xe03a0797.p3326xc267989b.a0) r7
            java.lang.Object r7 = r7.k(r6)
            if (r7 != r0) goto L3d
            return r0
        L3d:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            goto L45
        L44:
            r7 = r2
        L45:
            q61.j r0 = q61.j.f441794a
            boolean r1 = q61.j.f441795b
            if (r1 == 0) goto L52
            boolean r0 = r0.a()
            if (r0 == 0) goto L52
            r2 = r5
        L52:
            jz5.f0 r0 = jz5.f0.f384359a
            if (r2 == 0) goto L75
            if (r7 != 0) goto L59
            goto L75
        L59:
            q61.k r1 = r6.f441776f
            if (r1 != 0) goto L6e
            java.lang.Class r2 = r3.getClass()
            java.lang.String r2 = r2.getName()
            java.lang.String r3 = "callback == null "
            java.lang.String r2 = r3.concat(r2)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r4, r2)
        L6e:
            if (r1 == 0) goto L75
            r45.nf5 r2 = q61.j.f441796c
            r1.a(r7, r2)
        L75:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: q61.e.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
