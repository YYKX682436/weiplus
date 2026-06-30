package aq2;

/* loaded from: classes2.dex */
public final class o extends by1.f {

    /* renamed from: e, reason: collision with root package name */
    public long f94690e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94691f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(java.lang.String key) {
        super(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // by1.f, by1.d
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object b(p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof aq2.n
            if (r0 == 0) goto L13
            r0 = r6
            aq2.n r0 = (aq2.n) r0
            int r1 = r0.f94689g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94689g = r1
            goto L18
        L13:
            aq2.n r0 = new aq2.n
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f94687e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f94689g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f94686d
            aq2.o r0 = (aq2.o) r0
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            goto L52
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L34:
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(r6)
            kotlinx.coroutines.f1 r6 = r5.f117896d
            if (r6 == 0) goto L43
            boolean r6 = r6.a()
            if (r6 != r4) goto L43
            r6 = r4
            goto L44
        L43:
            r6 = r3
        L44:
            r5.f94691f = r6
            r0.f94686d = r5
            r0.f94689g = r4
            java.lang.Object r6 = by1.f.f(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            com.tencent.mm.modelbase.f r6 = (com.p314xaae8f345.mm.p944x882e457a.f) r6
            r0.f94691f = r3
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "requestCache: key="
            r1.<init>(r2)
            java.lang.Object r0 = r0.f117889a
            java.lang.String r0 = (java.lang.String) r0
            r1.append(r0)
            java.lang.String r0 = ", errType="
            r1.append(r0)
            r0 = 0
            if (r6 == 0) goto L74
            int r2 = r6.f152148a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            goto L75
        L74:
            r3 = r0
        L75:
            r1.append(r3)
            java.lang.String r2 = ", errCode="
            r1.append(r2)
            if (r6 == 0) goto L87
            int r0 = r6.f152149b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r0)
            r0 = r2
        L87:
            r1.append(r0)
            java.lang.String r0 = ", cache="
            r1.append(r0)
            r1.append(r6)
            java.lang.String r0 = r1.toString()
            java.lang.String r1 = "NearLiveVerticalStreamCache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aq2.o.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // by1.f, by1.d
    public void c(java.lang.Object obj, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.f result = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f117894b = result;
        this.f117895c = j17;
        if (((r45.dk2) result.f152151d) != null) {
            this.f94690e = java.lang.System.currentTimeMillis();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearLiveVerticalStreamCache", "saveCache: prefetchInterval = 0");
        }
    }

    @Override // by1.f
    public boolean d() {
        r45.dk2 dk2Var;
        if (this.f117894b == null) {
            return false;
        }
        long currentTimeMillis = java.lang.System.currentTimeMillis() - this.f94690e;
        boolean z17 = this.f94691f || currentTimeMillis <= ((long) ((java.lang.Number) com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.t70.f209123a.P1().r()).intValue());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("checkCacheAvailable: result=");
        sb6.append(z17);
        sb6.append(", doNotCheckTime=");
        sb6.append(this.f94691f);
        sb6.append("prefech_min_interval=");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) this.f117894b;
        sb6.append((fVar == null || (dk2Var = (r45.dk2) fVar.f152151d) == null) ? null : java.lang.Integer.valueOf(dk2Var.m75939xb282bd08(3)));
        sb6.append(", lastRespSetTime=");
        sb6.append(this.f94690e);
        sb6.append(", cacheTime: ");
        sb6.append(currentTimeMillis);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("NearLiveVerticalStreamCache", sb6.toString());
        return z17;
    }
}
