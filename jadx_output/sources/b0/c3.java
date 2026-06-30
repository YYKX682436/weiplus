package b0;

/* loaded from: classes14.dex */
public final class c3 implements o1.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ boolean f16246d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.e5 f16247e;

    public c3(boolean z17, n0.e5 e5Var) {
        this.f16246d = z17;
        this.f16247e = e5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // o1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object a(long r3, long r5, kotlin.coroutines.Continuation r7) {
        /*
            r2 = this;
            boolean r3 = r7 instanceof b0.b3
            if (r3 == 0) goto L13
            r3 = r7
            b0.b3 r3 = (b0.b3) r3
            int r4 = r3.f16230g
            r0 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r4 & r0
            if (r1 == 0) goto L13
            int r4 = r4 - r0
            r3.f16230g = r4
            goto L18
        L13:
            b0.b3 r3 = new b0.b3
            r3.<init>(r2, r7)
        L18:
            java.lang.Object r4 = r3.f16228e
            pz5.a r7 = pz5.a.f359186d
            int r0 = r3.f16230g
            r1 = 1
            if (r0 == 0) goto L31
            if (r0 != r1) goto L29
            long r5 = r3.f16227d
            kotlin.ResultKt.throwOnFailure(r4)
            goto L4b
        L29:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L31:
            kotlin.ResultKt.throwOnFailure(r4)
            boolean r4 = r2.f16246d
            if (r4 == 0) goto L54
            n0.e5 r4 = r2.f16247e
            java.lang.Object r4 = r4.getValue()
            b0.m3 r4 = (b0.m3) r4
            r3.f16227d = r5
            r3.f16230g = r1
            java.lang.Object r4 = r4.b(r5, r3)
            if (r4 != r7) goto L4b
            return r7
        L4b:
            p2.w r4 = (p2.w) r4
            long r3 = r4.f351406a
            long r3 = p2.w.d(r5, r3)
            goto L58
        L54:
            int r3 = p2.w.f351405c
            long r3 = p2.w.f351404b
        L58:
            p2.w r5 = new p2.w
            r5.<init>(r3)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b0.c3.a(long, long, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // o1.a
    public long b(long j17, long j18, int i17) {
        if (!this.f16246d) {
            return d1.e.f225623b;
        }
        b0.m3 m3Var = (b0.m3) this.f16247e.getValue();
        b0.f3 f3Var = m3Var.f16435d;
        if (f3Var.a()) {
            return d1.e.f225623b;
        }
        float d17 = m3Var.d(j18);
        boolean z17 = m3Var.f16433b;
        if (z17) {
            d17 *= -1;
        }
        float b17 = f3Var.b(d17);
        if (z17) {
            b17 *= -1;
        }
        return m3Var.e(b17);
    }

    @Override // o1.a
    public java.lang.Object c(long j17, kotlin.coroutines.Continuation continuation) {
        return new p2.w(p2.w.f351404b);
    }

    @Override // o1.a
    public long d(long j17, int i17) {
        return d1.e.f225623b;
    }
}
