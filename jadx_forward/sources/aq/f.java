package aq;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94391d;

    /* renamed from: e, reason: collision with root package name */
    public int f94392e;

    /* renamed from: f, reason: collision with root package name */
    public int f94393f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94394g;

    public f(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        aq.f fVar = new aq.f(interfaceC29045xdcb5ca57);
        fVar.f94394g = obj;
        return fVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0066 -> B:5:0x0069). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:8:0x0058 -> B:5:0x0069). Please report as a decompilation issue!!! */
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
            int r1 = r9.f94393f
            java.lang.String r2 = "MicroMsg.ImageDataManager"
            r3 = 4
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 != r4) goto L1b
            int r1 = r9.f94392e
            java.lang.Object r5 = r9.f94391d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r9.f94394g
            kotlinx.coroutines.flow.k r6 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r6
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            r10 = r9
            goto L69
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r10)
            java.lang.Object r10 = r9.f94394g
            kotlinx.coroutines.flow.k r10 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r10
            r1 = 0
            r6 = r10
            r10 = r9
        L2d:
            com.tencent.mm.storage.s8 r5 = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a
            java.lang.String r7 = aq.o.f94454b
            java.util.ArrayList r5 = r5.g(r7, r3, r1)
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "getAllOldDataByNormalReq >> emit list size: "
            r7.<init>(r8)
            int r8 = r5.size()
            r7.append(r8)
            java.lang.String r8 = ", offset: "
            r7.append(r8)
            r7.append(r1)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r7)
            int r1 = r1 + r3
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto L69
            r10.f94394g = r6
            r10.f94391d = r5
            r10.f94392e = r1
            r10.f94393f = r4
            java.lang.Object r7 = r6.mo771x2f8fd3(r5, r10)
            if (r7 != r0) goto L69
            return r0
        L69:
            int r5 = r5.size()
            if (r5 >= r3) goto L2d
            java.lang.String r10 = "getAllOldDataByNormalReq >> emit all data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r10)
            long r0 = (long) r4
            f65.p.f341480n = r0
            jz5.f0 r10 = jz5.f0.f384359a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.f.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
