package c01;

/* loaded from: classes4.dex */
public final class k1 {

    /* renamed from: a, reason: collision with root package name */
    public static final c01.k1 f37279a = new c01.k1();

    /* JADX WARN: Removed duplicated region for block: B:12:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(java.lang.String r7, java.lang.String r8, kotlin.coroutines.Continuation r9) {
        /*
            r6 = this;
            boolean r0 = r9 instanceof c01.h1
            if (r0 == 0) goto L13
            r0 = r9
            c01.h1 r0 = (c01.h1) r0
            int r1 = r0.f37223f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f37223f = r1
            goto L18
        L13:
            c01.h1 r0 = new c01.h1
            r0.<init>(r6, r9)
        L18:
            java.lang.Object r9 = r0.f37221d
            pz5.a r1 = pz5.a.f359186d
            int r2 = r0.f37223f
            java.lang.String r3 = "MicroMsg.CgiCheckLoginAsPad"
            r4 = 1
            if (r2 == 0) goto L32
            if (r2 != r4) goto L2a
            kotlin.ResultKt.throwOnFailure(r9)
            goto Lbd
        L2a:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L32:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r2 = "doCgi deviceBrand:"
            r9.<init>(r2)
            r9.append(r7)
            java.lang.String r2 = ", deviceModel:"
            r9.append(r2)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.tencent.mars.xlog.Log.i(r3, r9)
            byte[] r9 = com.tencent.mm.sdk.platformtools.t8.s0()
            r45.c10 r2 = new r45.c10
            r2.<init>()
            r2.f371203d = r7
            r2.f371204e = r8
            r45.cu5 r7 = new r45.cu5
            r7.<init>()
            r7.d(r9)
            r2.f371205f = r7
            com.tencent.mm.modelbase.l r7 = new com.tencent.mm.modelbase.l
            r7.<init>()
            r8 = 9931(0x26cb, float:1.3916E-41)
            r7.f70667d = r8
            java.lang.String r8 = "/cgi-bin/micromsg-bin/checkloginaspad"
            r7.f70666c = r8
            r7.f70664a = r2
            r45.d10 r8 = new r45.d10
            r8.<init>()
            r7.f70665b = r8
            com.tencent.mm.modelbase.o r7 = r7.a()
            com.tencent.mm.modelbase.i r8 = new com.tencent.mm.modelbase.i
            r8.<init>()
            r8.p(r7)
            com.tencent.mm.modelbase.o r7 = r8.f70646f
            com.tencent.mm.modelbase.m r2 = r7.f70710a
            com.tencent.mm.protobuf.f r2 = r2.f70684a
            boolean r5 = r2 instanceof r45.c10
            if (r5 == 0) goto L94
            r45.c10 r2 = (r45.c10) r2
            goto L95
        L94:
            r2 = 0
        L95:
            if (r2 != 0) goto L98
            goto La2
        L98:
            o45.zg r7 = r7.getReqObj()
            r45.he r7 = o45.bh.a(r7)
            r2.BaseRequest = r7
        La2:
            com.tencent.mm.modelbase.o r7 = r8.f70646f
            r7.f70714e = r4
            o45.pi r2 = o45.pi.d()
            r7.setRsaInfo(r2)
            com.tencent.mm.modelbase.o r7 = r8.f70646f
            com.tencent.mm.modelbase.m r7 = r7.f70710a
            r7.setPassKey(r9)
            r0.f37223f = r4
            java.lang.Object r9 = rm0.h.b(r8, r0)
            if (r9 != r1) goto Lbd
            return r1
        Lbd:
            com.tencent.mm.modelbase.f r9 = (com.tencent.mm.modelbase.f) r9
            boolean r7 = r9.b()
            if (r7 == 0) goto Ldd
            com.tencent.mm.protobuf.f r7 = r9.f70618d
            r45.d10 r7 = (r45.d10) r7
            boolean r7 = r7.f371987d
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "doCgi callback loginAsPad:"
            r8.<init>(r9)
            r8.append(r7)
            java.lang.String r8 = r8.toString()
            com.tencent.mars.xlog.Log.i(r3, r8)
            goto Lde
        Ldd:
            r7 = 0
        Lde:
            java.lang.Boolean r7 = java.lang.Boolean.valueOf(r7)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: c01.k1.a(java.lang.String, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
