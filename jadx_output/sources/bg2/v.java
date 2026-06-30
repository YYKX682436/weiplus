package bg2;

/* loaded from: classes3.dex */
public final class v extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f20560d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f20561e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ bg2.d0 f20562f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(bg2.d0 d0Var, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f20562f = d0Var;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        bg2.v vVar = new bg2.v(this.f20562f, continuation);
        vVar.f20561e = obj;
        return vVar;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((bg2.v) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0061 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0067 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:32:0x005f -> B:6:0x0062). Please report as a decompilation issue!!! */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r12) {
        /*
            r11 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r11.f20560d
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L25
            if (r1 == r3) goto L1d
            if (r1 != r2) goto L15
            java.lang.Object r1 = r11.f20561e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r12)
            r12 = r11
            goto L62
        L15:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L1d:
            java.lang.Object r1 = r11.f20561e
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            kotlin.ResultKt.throwOnFailure(r12)
            goto L40
        L25:
            kotlin.ResultKt.throwOnFailure(r12)
            java.lang.Object r12 = r11.f20561e
            r1 = r12
            kotlinx.coroutines.y0 r1 = (kotlinx.coroutines.y0) r1
            bg2.d0 r12 = r11.f20562f
            int r12 = r12.f20005o
            long r4 = (long) r12
            r6 = 1000(0x3e8, double:4.94E-321)
            long r4 = r4 * r6
            r11.f20561e = r1
            r11.f20560d = r3
            java.lang.Object r12 = kotlinx.coroutines.k1.b(r4, r11)
            if (r12 != r0) goto L40
            return r0
        L40:
            r12 = r11
        L41:
            boolean r4 = kotlinx.coroutines.z0.h(r1)
            if (r4 == 0) goto La5
            bg2.d0 r4 = r12.f20562f
            r45.b94 r4 = r4.f20001h
            r5 = 10
            int r4 = r4.getInteger(r5)
            if (r4 > 0) goto L56
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        L56:
            long r4 = (long) r4
            r12.f20561e = r1
            r12.f20560d = r2
            java.lang.Object r4 = kotlinx.coroutines.k1.b(r4, r12)
            if (r4 != r0) goto L62
            return r0
        L62:
            bg2.d0 r4 = r12.f20562f
            java.util.concurrent.ConcurrentLinkedQueue r5 = r4.f20002i
            monitor-enter(r5)
            r45.b94 r6 = r4.f20001h     // Catch: java.lang.Throwable -> L9c
            r7 = 11
            int r6 = r6.getInteger(r7)     // Catch: java.lang.Throwable -> L9c
            java.util.LinkedList r7 = new java.util.LinkedList     // Catch: java.lang.Throwable -> L9c
            r7.<init>()     // Catch: java.lang.Throwable -> L9c
            java.util.concurrent.ConcurrentLinkedQueue r8 = r4.f20002i     // Catch: java.lang.Throwable -> L9c
            int r9 = r8.size()     // Catch: java.lang.Throwable -> L9c
            if (r6 <= r9) goto L7d
            r6 = r9
        L7d:
            if (r3 > r6) goto L90
            r9 = r3
        L80:
            java.lang.Object r10 = r8.poll()     // Catch: java.lang.Throwable -> L9c
            dk2.zf r10 = (dk2.zf) r10     // Catch: java.lang.Throwable -> L9c
            if (r10 == 0) goto L8b
            r7.add(r10)     // Catch: java.lang.Throwable -> L9c
        L8b:
            if (r9 == r6) goto L90
            int r9 = r9 + 1
            goto L80
        L90:
            java.lang.String r6 = com.tencent.mm.sdk.platformtools.z.f193105a     // Catch: java.lang.Throwable -> L9c
            boolean r6 = z65.c.a()     // Catch: java.lang.Throwable -> L9c
            if (r6 == 0) goto L9e
            r7.size()     // Catch: java.lang.Throwable -> L9c
            goto L9e
        L9c:
            r12 = move-exception
            goto La3
        L9e:
            r4.Y6(r7)     // Catch: java.lang.Throwable -> L9c
            monitor-exit(r5)
            goto L41
        La3:
            monitor-exit(r5)
            throw r12
        La5:
            jz5.f0 r12 = jz5.f0.f302826a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.v.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
