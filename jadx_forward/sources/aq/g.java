package aq;

/* loaded from: classes4.dex */
public final class g extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f94400d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f94401e;

    /* renamed from: f, reason: collision with root package name */
    public int f94402f;

    /* renamed from: g, reason: collision with root package name */
    public int f94403g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f94404h;

    public g(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        aq.g gVar = new aq.g(interfaceC29045xdcb5ca57);
        gVar.f94404h = obj;
        return gVar;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.g) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.p3328x30012e.k) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0087  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x007b -> B:5:0x007e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:9:0x0063 -> B:6:0x0081). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object r13) {
        /*
            r12 = this;
            pz5.a r0 = pz5.a.f440719d
            int r1 = r12.f94403g
            java.lang.String r2 = "MicroMsg.ImageDataManager"
            com.tencent.mm.storage.s8 r3 = com.p314xaae8f345.mm.p2621x8fb0427b.s8.f276847a
            r4 = 4
            r5 = 1
            if (r1 == 0) goto L29
            if (r1 != r5) goto L21
            int r1 = r12.f94402f
            java.lang.Object r6 = r12.f94401e
            java.util.ArrayList r6 = (java.util.ArrayList) r6
            java.lang.Object r7 = r12.f94400d
            java.util.ArrayList r7 = (java.util.ArrayList) r7
            java.lang.Object r8 = r12.f94404h
            kotlinx.coroutines.flow.k r8 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r8
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            r13 = r12
            goto L7e
        L21:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L29:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r13)
            java.lang.Object r13 = r12.f94404h
            kotlinx.coroutines.flow.k r13 = (p3325xe03a0797.p3326xc267989b.p3328x30012e.k) r13
            java.lang.String r1 = aq.o.f94454b
            java.util.ArrayList r1 = r3.h(r1)
            r6 = 0
            r8 = r13
            r7 = r1
            r13 = r12
        L3a:
            java.lang.String r1 = aq.o.f94454b
            java.util.ArrayList r1 = r3.g(r1, r4, r6)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "getAllOldDataByPersonReq >> emit list size: "
            r9.<init>(r10)
            int r10 = r1.size()
            r9.append(r10)
            java.lang.String r10 = ", offset: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r9 = r9.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            int r6 = r6 + r4
            boolean r9 = r1.isEmpty()
            r9 = r9 ^ r5
            if (r9 == 0) goto L81
            android.util.Pair r9 = new android.util.Pair
            r9.<init>(r7, r1)
            r13.f94404h = r8
            r13.f94400d = r7
            r13.f94401e = r1
            r13.f94402f = r6
            r13.f94403g = r5
            java.lang.Object r9 = r8.mo771x2f8fd3(r9, r13)
            if (r9 != r0) goto L7b
            return r0
        L7b:
            r11 = r6
            r6 = r1
            r1 = r11
        L7e:
            r11 = r6
            r6 = r1
            r1 = r11
        L81:
            int r1 = r1.size()
            if (r1 >= r4) goto L3a
            java.lang.String r13 = "getAllOldDataByPersonReq >> emit all data"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r13)
            long r0 = (long) r5
            f65.p.f341480n = r0
            jz5.f0 r13 = jz5.f0.f384359a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.g.mo150x989b7ca4(java.lang.Object):java.lang.Object");
    }
}
