package aq2;

/* loaded from: classes2.dex */
public final class e extends by1.f {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f94662e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f94663f;

    /* renamed from: g, reason: collision with root package name */
    public final xq2.b f94664g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String themeId, java.lang.String key) {
        super(key);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f94662e = themeId;
        p012xc85e97e9.p093xedfae76a.c1 a17 = pf5.u.f435469a.e(c61.l7.class).a(xq2.b.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        this.f94664g = (xq2.b) a17;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0068  */
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
            boolean r0 = r6 instanceof aq2.d
            if (r0 == 0) goto L13
            r0 = r6
            aq2.d r0 = (aq2.d) r0
            int r1 = r0.f94661g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f94661g = r1
            goto L18
        L13:
            aq2.d r0 = new aq2.d
            r0.<init>(r5, r6)
        L18:
            java.lang.Object r6 = r0.f94659e
            pz5.a r1 = pz5.a.f440719d
            int r2 = r0.f94661g
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L34
            if (r2 != r4) goto L2c
            java.lang.Object r0 = r0.f94658d
            aq2.e r0 = (aq2.e) r0
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
            r5.f94663f = r6
            r0.f94658d = r5
            r0.f94661g = r4
            java.lang.Object r6 = by1.f.f(r5, r0)
            if (r6 != r1) goto L51
            return r1
        L51:
            r0 = r5
        L52:
            com.tencent.mm.modelbase.f r6 = (com.p314xaae8f345.mm.p944x882e457a.f) r6
            r0.f94663f = r3
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "requestCache: errType = "
            r0.<init>(r1)
            r1 = 0
            if (r6 == 0) goto L68
            int r2 = r6.f152148a
            java.lang.Integer r3 = new java.lang.Integer
            r3.<init>(r2)
            goto L69
        L68:
            r3 = r1
        L69:
            r0.append(r3)
            java.lang.String r2 = ", errCode="
            r0.append(r2)
            if (r6 == 0) goto L7b
            int r1 = r6.f152149b
            java.lang.Integer r2 = new java.lang.Integer
            r2.<init>(r1)
            r1 = r2
        L7b:
            r0.append(r1)
            java.lang.String r1 = ", cache="
            r0.append(r1)
            r0.append(r6)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "LiveThemeStreamCache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: aq2.e.b(kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Override // by1.f, by1.d
    public void c(java.lang.Object obj, long j17) {
        com.p314xaae8f345.mm.p944x882e457a.f result = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(result, "result");
        this.f117894b = result;
        this.f117895c = j17;
        if (((r45.yz2) result.f152151d) != null) {
            xq2.b bVar = this.f94664g;
            bVar.R6(r3.f473066w * 1000);
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("saveCache: prefetchInterval = ");
            java.lang.String themeId = this.f94662e;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(themeId, "themeId");
            sb6.append(bVar.f537573h);
            sb6.append(" themeId: ");
            sb6.append(themeId);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveThemeStreamCache", sb6.toString());
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        if (((r7 == null ? 0 : r7.longValue()) + r3) > java.lang.System.currentTimeMillis()) goto L20;
     */
    @Override // by1.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean d() {
        /*
            r11 = this;
            java.lang.Object r0 = r11.f117894b
            r1 = 0
            if (r0 != 0) goto L6
            return r1
        L6:
            xq2.b r0 = r11.f94664g
            r0.getClass()
            java.lang.String r2 = r11.f94662e
            java.lang.String r3 = "themeId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r2, r3)
            java.util.HashMap r3 = r0.f537574i
            java.lang.Object r3 = r3.get(r2)
            r45.wz2 r3 = (r45.wz2) r3
            if (r3 == 0) goto L1f
            int r3 = r3.f471126e
            goto L20
        L1f:
            r3 = r1
        L20:
            long r3 = (long) r3
            r5 = 1000(0x3e8, double:4.94E-321)
            long r3 = r3 * r5
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 != 0) goto L2d
            int r3 = r0.f537571f
            long r3 = (long) r3
        L2d:
            boolean r7 = r11.f94663f
            if (r7 != 0) goto L4d
            r0.getClass()
            java.util.HashMap r7 = r0.f537572g
            java.lang.Object r7 = r7.get(r2)
            java.lang.Long r7 = (java.lang.Long) r7
            if (r7 != 0) goto L40
            r7 = r5
            goto L44
        L40:
            long r7 = r7.longValue()
        L44:
            long r7 = r7 + r3
            long r9 = java.lang.System.currentTimeMillis()
            int r7 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r7 <= 0) goto L4e
        L4d:
            r1 = 1
        L4e:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "checkCacheAvailable: result="
            r7.<init>(r8)
            r7.append(r1)
            java.lang.String r8 = ", doNotCheckTime="
            r7.append(r8)
            boolean r8 = r11.f94663f
            r7.append(r8)
            java.lang.String r8 = ", preloadEffectiveTime="
            r7.append(r8)
            r7.append(r3)
            java.lang.String r3 = ", lastRespSetTime="
            r7.append(r3)
            r0.getClass()
            java.util.HashMap r0 = r0.f537572g
            java.lang.Object r0 = r0.get(r2)
            java.lang.Long r0 = (java.lang.Long) r0
            if (r0 != 0) goto L7d
            goto L81
        L7d:
            long r5 = r0.longValue()
        L81:
            r7.append(r5)
            java.lang.String r0 = r7.toString()
            java.lang.String r2 = "LiveThemeStreamCache"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r0)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: aq2.e.d():boolean");
    }
}
