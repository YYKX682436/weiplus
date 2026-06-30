package by0;

/* loaded from: classes5.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.vfs.r6 f36331a = new com.tencent.mm.vfs.r6(com.tencent.mm.vfs.q7.c("MaasCache") + "/MovieComposing/Emoticon");

    /* JADX WARN: Removed duplicated region for block: B:12:0x0091 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0099 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x009a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object a(com.tencent.mm.api.IEmojiInfo r7, kotlin.coroutines.Continuation r8) {
        /*
            boolean r0 = r8 instanceof by0.e
            if (r0 == 0) goto L13
            r0 = r8
            by0.e r0 = (by0.e) r0
            int r1 = r0.f36328f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f36328f = r1
            goto L18
        L13:
            by0.e r0 = new by0.e
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f36327e
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f36328f
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L34
            if (r2 != r3) goto L2c
            java.lang.Object r7 = r0.f36326d
            com.tencent.mm.vfs.r6 r7 = (com.tencent.mm.vfs.r6) r7
            kotlin.ResultKt.throwOnFailure(r8)
            goto L89
        L2c:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L34:
            kotlin.ResultKt.throwOnFailure(r8)
            java.lang.String r8 = "<this>"
            kotlin.jvm.internal.o.g(r7, r8)
            com.tencent.mm.vfs.r6 r8 = by0.g.f36331a
            boolean r2 = r8.m()
            if (r2 != 0) goto L47
            r8.J()
        L47:
            com.tencent.mm.vfs.r6 r2 = new com.tencent.mm.vfs.r6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = r7.getMd5()
            r5.append(r6)
            java.lang.String r6 = ".wxam"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            r2.<init>(r8, r5)
            boolean r8 = r2.m()
            if (r8 == 0) goto L6d
            boolean r8 = r2.A()
            if (r8 != 0) goto L93
        L6d:
            boolean r8 = r2.m()
            if (r8 == 0) goto L76
            r2.l()
        L76:
            kotlinx.coroutines.p0 r8 = kotlinx.coroutines.q1.f310570c
            by0.f r5 = new by0.f
            r5.<init>(r7, r2, r4)
            r0.f36326d = r2
            r0.f36328f = r3
            java.lang.Object r8 = kotlinx.coroutines.l.g(r8, r5, r0)
            if (r8 != r1) goto L88
            return r1
        L88:
            r7 = r2
        L89:
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            if (r8 == 0) goto L92
            return r4
        L92:
            r2 = r7
        L93:
            boolean r7 = r2.m()
            if (r7 != 0) goto L9a
            return r4
        L9a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: by0.g.a(com.tencent.mm.api.IEmojiInfo, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
