package b04;

/* loaded from: classes5.dex */
public final class e0 implements com.tencent.mm.plugin.lite.r {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b04.j0 f16888a;

    public e0(b04.j0 j0Var) {
        this.f16888a = j0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0058  */
    @Override // com.tencent.mm.plugin.lite.r
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean onDispatch(long r3, java.lang.String r5, java.lang.Object r6, int r7) {
        /*
            r2 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "callback: "
            r0.<init>(r1)
            r0.append(r3)
            java.lang.String r3 = ", "
            r0.append(r3)
            r0.append(r5)
            r0.append(r3)
            r0.append(r6)
            r0.append(r3)
            r0.append(r7)
            java.lang.String r3 = r0.toString()
            java.lang.String r4 = "MicroMsg.RedPacketUIC"
            com.tencent.mars.xlog.Log.i(r4, r3)
            java.lang.String r3 = "notifyQrCodeStatus"
            boolean r3 = kotlin.jvm.internal.o.b(r5, r3)
            r5 = 0
            if (r3 == 0) goto L74
            boolean r3 = r6 instanceof org.json.JSONObject
            if (r3 == 0) goto L6f
            org.json.JSONObject r6 = (org.json.JSONObject) r6
            java.lang.String r3 = "hasQrCode"
            r7 = 1
            boolean r0 = r6.has(r3)     // Catch: java.lang.Exception -> L49
            if (r0 != r7) goto L41
            r0 = r7
            goto L42
        L41:
            r0 = r5
        L42:
            if (r0 == 0) goto L55
            boolean r3 = r6.getBoolean(r3)     // Catch: java.lang.Exception -> L49
            goto L56
        L49:
            r3 = move-exception
            java.lang.String r6 = ""
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            java.lang.String r0 = "safeGetBoolean"
            com.tencent.mm.sdk.platformtools.Log.a(r0, r6, r3)
        L55:
            r3 = r5
        L56:
            if (r3 == 0) goto L74
            b04.j0 r3 = r2.f16888a
            boolean r6 = r3.f16917f
            if (r6 != 0) goto L74
            java.lang.String r6 = "report qrcode expose"
            com.tencent.mars.xlog.Log.i(r4, r6)
            r3.f16917f = r7
            kd0.g3 r4 = kd0.g3.f306645g
            int r3 = r3.T6()
            com.tencent.mm.plugin.scanner.model.h2.F(r4, r3)
            goto L74
        L6f:
            java.lang.String r3 = "notifyQrCodeStatus wrong data"
            com.tencent.mars.xlog.Log.e(r4, r3)
        L74:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: b04.e0.onDispatch(long, java.lang.String, java.lang.Object, int):boolean");
    }
}
