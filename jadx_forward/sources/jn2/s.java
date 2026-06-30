package jn2;

/* loaded from: classes5.dex */
public final class s extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f382224d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jn2.w f382225e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382226f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(jn2.w wVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382225e = wVar;
        this.f382226f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jn2.s(this.f382225e, this.f382226f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jn2.s) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x004d A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0012, B:7:0x003d, B:9:0x0042, B:12:0x0049, B:14:0x004d, B:18:0x0068, B:19:0x006d, B:24:0x0032), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0012, B:7:0x003d, B:9:0x0042, B:12:0x0049, B:14:0x004d, B:18:0x0068, B:19:0x006d, B:24:0x0032), top: B:2:0x000c }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0042 A[Catch: Exception -> 0x0016, TryCatch #0 {Exception -> 0x0016, blocks: (B:6:0x0012, B:7:0x003d, B:9:0x0042, B:12:0x0049, B:14:0x004d, B:18:0x0068, B:19:0x006d, B:24:0x0032), top: B:2:0x000c }] */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r9.f382224d
            java.lang.String r2 = r9.f382226f
            kz5.p0 r3 = kz5.p0.f395529d
            r4 = 2
            r5 = 1
            jn2.w r6 = r9.f382225e
            if (r1 == 0) goto L24
            if (r1 == r5) goto L20
            if (r1 != r4) goto L18
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)     // Catch: java.lang.Exception -> L16
            goto L3d
        L16:
            r10 = move-exception
            goto L6e
        L18:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L20:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            goto L32
        L24:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r9.f382224d = r5
            r7 = 600(0x258, double:2.964E-321)
            java.lang.Object r10 = p3325xe03a0797.p3326xc267989b.k1.b(r7, r9)
            if (r10 != r0) goto L32
            return r0
        L32:
            sf2.x r10 = r6.f382255f     // Catch: java.lang.Exception -> L16
            r9.f382224d = r4     // Catch: java.lang.Exception -> L16
            java.lang.Object r10 = r10.o7(r2, r9)     // Catch: java.lang.Exception -> L16
            if (r10 != r0) goto L3d
            return r0
        L3d:
            r45.wx1 r10 = (r45.wx1) r10     // Catch: java.lang.Exception -> L16
            r0 = 0
            if (r10 == 0) goto L45
            java.util.LinkedList r10 = r10.f471085d     // Catch: java.lang.Exception -> L16
            goto L46
        L45:
            r10 = r0
        L46:
            if (r10 != 0) goto L49
            r10 = r3
        L49:
            jn2.z r1 = r6.f382269w     // Catch: java.lang.Exception -> L16
            if (r1 == 0) goto L68
            java.lang.String r0 = "searchKey"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r0)     // Catch: java.lang.Exception -> L16
            r1.f382295f = r2     // Catch: java.lang.Exception -> L16
            java.util.List r0 = r1.f382294e     // Catch: java.lang.Exception -> L16
            r2 = r0
            java.util.ArrayList r2 = (java.util.ArrayList) r2     // Catch: java.lang.Exception -> L16
            r2.clear()     // Catch: java.lang.Exception -> L16
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Exception -> L16
            r0.addAll(r10)     // Catch: java.lang.Exception -> L16
            r1.m8146xced61ae5()     // Catch: java.lang.Exception -> L16
            jn2.w.b(r6, r10)     // Catch: java.lang.Exception -> L16
            goto L88
        L68:
            java.lang.String r10 = "smartBoxAdapter"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.o(r10)     // Catch: java.lang.Exception -> L16
            throw r0     // Catch: java.lang.Exception -> L16
        L6e:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Search smart box failed: "
            r0.<init>(r1)
            java.lang.String r10 = r10.getMessage()
            r0.append(r10)
            java.lang.String r10 = r0.toString()
            java.lang.String r0 = "FinderLiveAnchorSingSongAddPanelSearchWidget"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r10)
            jn2.w.b(r6, r3)
        L88:
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: jn2.s.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
