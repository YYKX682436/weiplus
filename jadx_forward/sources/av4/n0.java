package av4;

/* loaded from: classes.dex */
public final class n0 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final av4.n0 f95847d = new av4.n0();

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064 A[Catch: Exception -> 0x009f, TryCatch #0 {Exception -> 0x009f, blocks: (B:3:0x0013, B:5:0x0020, B:6:0x0024, B:8:0x002e, B:10:0x0034, B:13:0x0042, B:18:0x0058, B:23:0x0064, B:25:0x006d), top: B:2:0x0013 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x006d A[Catch: Exception -> 0x009f, TRY_LEAVE, TryCatch #0 {Exception -> 0x009f, blocks: (B:3:0x0013, B:5:0x0020, B:6:0x0024, B:8:0x002e, B:10:0x0034, B:13:0x0042, B:18:0x0058, B:23:0x0064, B:25:0x006d), top: B:2:0x0013 }] */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r10, nw4.y2 r11) {
        /*
            r9 = this;
            java.lang.String r0 = "env"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r10, r0)
            nw4.g r10 = r10.f422396d
            java.lang.String r0 = "msg"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r0)
            java.lang.String r0 = "MicroMsg.JsApiSetSourceImgJumpInfo"
            java.lang.String r1 = "set jumpInfo: "
            r2 = 0
            r3 = 0
            java.util.Map r4 = r11.f422323a     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = "sourceImgJumpInfo"
            java.lang.Object r5 = r4.get(r5)     // Catch: java.lang.Exception -> L9f
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> L9f
            if (r6 == 0) goto L23
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L9f
            goto L24
        L23:
            r5 = r3
        L24:
            java.lang.String r6 = "cleanUp"
            java.lang.Object r4 = r4.get(r6)     // Catch: java.lang.Exception -> L9f
            boolean r6 = r4 instanceof java.lang.Boolean     // Catch: java.lang.Exception -> L9f
            if (r6 == 0) goto L31
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Exception -> L9f
            goto L32
        L31:
            r4 = r3
        L32:
            if (r4 == 0) goto L39
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Exception -> L9f
            goto L3a
        L39:
            r4 = r2
        L3a:
            java.lang.String r6 = "setSourceImgJumpInfo:ok"
            java.lang.String r7 = "MicroMsg.WebSearchSourceImgJumpInfoUtil"
            r8 = 1
            if (r4 == 0) goto L56
            java.lang.String r1 = "clean up sourceImgJumpInfo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = "clearJumpInfo: clearing stored jumpInfo"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r1)     // Catch: java.lang.Exception -> L9f
            zv4.m.f558015b = r3     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = r11.f422546c     // Catch: java.lang.Exception -> L9f
            r10.e(r1, r6, r3)     // Catch: java.lang.Exception -> L9f
        L53:
            r2 = r8
            goto Ld2
        L56:
            if (r5 == 0) goto L61
            boolean r4 = r26.n0.N(r5)     // Catch: java.lang.Exception -> L9f
            if (r4 == 0) goto L5f
            goto L61
        L5f:
            r4 = r2
            goto L62
        L61:
            r4 = r8
        L62:
            if (r4 == 0) goto L6d
            java.lang.String r1 = r11.f422546c     // Catch: java.lang.Exception -> L9f
            java.lang.String r4 = "setSourceImgJumpInfo:fail:sourceImgJumpInfo is null"
            r10.e(r1, r4, r3)     // Catch: java.lang.Exception -> L9f
            goto Ld2
        L6d:
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> L9f
            r4.<init>(r5)     // Catch: java.lang.Exception -> L9f
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            r5.<init>(r1)     // Catch: java.lang.Exception -> L9f
            r5.append(r4)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = r5.toString()     // Catch: java.lang.Exception -> L9f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r1)     // Catch: java.lang.Exception -> L9f
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = "setJumpInfo: "
            r1.<init>(r5)     // Catch: java.lang.Exception -> L9f
            java.lang.String r5 = r4.toString()     // Catch: java.lang.Exception -> L9f
            r1.append(r5)     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Exception -> L9f
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r7, r1)     // Catch: java.lang.Exception -> L9f
            zv4.m.f558015b = r4     // Catch: java.lang.Exception -> L9f
            java.lang.String r1 = r11.f422546c     // Catch: java.lang.Exception -> L9f
            r10.e(r1, r6, r3)     // Catch: java.lang.Exception -> L9f
            goto L53
        L9f:
            r1 = move-exception
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "setSourceImgJumpInfo error: "
            r4.<init>(r5)
            java.lang.String r5 = r1.getMessage()
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            java.lang.Object[] r5 = new java.lang.Object[]{r1}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r0, r4, r5)
            java.lang.String r11 = r11.f422546c
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r4 = "setSourceImgJumpInfo:fail:"
            r0.<init>(r4)
            java.lang.String r1 = r1.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r10.e(r11, r0, r3)
        Ld2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: av4.n0.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 10000;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return "setSourceImgJumpInfo";
    }
}
