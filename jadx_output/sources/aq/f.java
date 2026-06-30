package aq;

/* loaded from: classes4.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f12858d;

    /* renamed from: e, reason: collision with root package name */
    public int f12859e;

    /* renamed from: f, reason: collision with root package name */
    public int f12860f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f12861g;

    public f(kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        aq.f fVar = new aq.f(continuation);
        fVar.f12861g = obj;
        return fVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((aq.f) create((kotlinx.coroutines.flow.k) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r10) {
        /*
            r9 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r9.f12860f
            java.lang.String r2 = "MicroMsg.ImageDataManager"
            r3 = 4
            r4 = 1
            if (r1 == 0) goto L23
            if (r1 != r4) goto L1b
            int r1 = r9.f12859e
            java.lang.Object r5 = r9.f12858d
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r9.f12861g
            kotlinx.coroutines.flow.k r6 = (kotlinx.coroutines.flow.k) r6
            kotlin.ResultKt.throwOnFailure(r10)
            r10 = r9
            goto L69
        L1b:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L23:
            kotlin.ResultKt.throwOnFailure(r10)
            java.lang.Object r10 = r9.f12861g
            kotlinx.coroutines.flow.k r10 = (kotlinx.coroutines.flow.k) r10
            r1 = 0
            r6 = r10
            r10 = r9
        L2d:
            com.tencent.mm.storage.s8 r5 = com.tencent.mm.storage.s8.f195314a
            java.lang.String r7 = aq.o.f12921b
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
            com.tencent.mars.xlog.Log.i(r2, r7)
            int r1 = r1 + r3
            boolean r7 = r5.isEmpty()
            r7 = r7 ^ r4
            if (r7 == 0) goto L69
            r10.f12861g = r6
            r10.f12858d = r5
            r10.f12859e = r1
            r10.f12860f = r4
            java.lang.Object r7 = r6.emit(r5, r10)
            if (r7 != r0) goto L69
            return r0
        L69:
            int r5 = r5.size()
            if (r5 >= r3) goto L2d
            java.lang.String r10 = "getAllOldDataByNormalReq >> emit all data"
            com.tencent.mars.xlog.Log.i(r2, r10)
            long r0 = (long) r4
            f65.p.f259947n = r0
            jz5.f0 r10 = jz5.f0.f302826a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: aq.f.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
