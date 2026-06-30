package com.tencent.mm.feature.avatar;

/* loaded from: classes5.dex */
public final class o extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f65173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f65174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f65175f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String str, yz5.l lVar, kotlin.coroutines.Continuation continuation) {
        super(2, continuation);
        this.f65174e = str;
        this.f65175f = lVar;
    }

    @Override // qz5.a
    public final kotlin.coroutines.Continuation create(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        return new com.tencent.mm.feature.avatar.o(this.f65174e, this.f65175f, continuation);
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.tencent.mm.feature.avatar.o) create((kotlinx.coroutines.y0) obj, (kotlin.coroutines.Continuation) obj2)).invokeSuspend(jz5.f0.f302826a);
    }

    /* JADX WARN: Removed duplicated region for block: B:8:0x006e  */
    @Override // qz5.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            pz5.a r0 = pz5.a.f359186d
            int r1 = r10.f65173d
            java.lang.Class<kv.b0> r2 = kv.b0.class
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L1e
            if (r1 == r4) goto L1a
            if (r1 != r3) goto L12
            kotlin.ResultKt.throwOnFailure(r11)
            goto L6a
        L12:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L1a:
            kotlin.ResultKt.throwOnFailure(r11)
            goto L34
        L1e:
            kotlin.ResultKt.throwOnFailure(r11)
            i95.m r11 = i95.n0.c(r2)
            kv.b0 r11 = (kv.b0) r11
            r10.f65173d = r4
            hn1.s r11 = (hn1.s) r11
            java.lang.String r1 = r10.f65174e
            java.lang.Object r11 = r11.hj(r1, r10)
            if (r11 != r0) goto L34
            return r0
        L34:
            java.lang.String r11 = (java.lang.String) r11
            r1 = 0
            if (r11 == 0) goto L41
            int r5 = r11.length()
            if (r5 != 0) goto L40
            goto L41
        L40:
            r4 = r1
        L41:
            if (r4 != 0) goto L4c
            java.lang.String r4 = "hd_avatar_no_url"
            r5 = 0
            boolean r1 = r26.i0.o(r11, r4, r1, r3, r5)
            if (r1 == 0) goto L6c
        L4c:
            i95.m r11 = i95.n0.c(r2)
            java.lang.String r1 = "getService(...)"
            kotlin.jvm.internal.o.f(r11, r1)
            kv.b0 r11 = (kv.b0) r11
            java.lang.String r5 = r10.f65174e
            r6 = 0
            r10.f65173d = r3
            r7 = 1065353216(0x3f800000, float:1.0)
            r8 = 0
            r4 = r11
            hn1.s r4 = (hn1.s) r4
            r9 = r10
            java.lang.Object r11 = r4.nj(r5, r6, r7, r8, r9)
            if (r11 != r0) goto L6a
            return r0
        L6a:
            java.lang.String r11 = (java.lang.String) r11
        L6c:
            if (r11 != 0) goto L70
            java.lang.String r11 = ""
        L70:
            yz5.l r0 = r10.f65175f
            r0.invoke(r11)
            jz5.f0 r11 = jz5.f0.f302826a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.avatar.o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
