package com.p314xaae8f345.mm.ui.p2722x33325c.sdk;

/* loaded from: classes7.dex */
public abstract class z {

    /* renamed from: a, reason: collision with root package name */
    public static final java.lang.String f290771a = "com.facebook.platform.protocol.PROTOCOL_VERSION";

    /* renamed from: b, reason: collision with root package name */
    public static final java.lang.String f290772b = "com.facebook.platform.protocol.CALL_ID";

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String f290773c = "com.facebook.platform.protocol.BRIDGE_ARGS";

    /* renamed from: d, reason: collision with root package name */
    public static final java.lang.String f290774d = "com.facebook.platform.protocol.RESULT_ARGS";

    /* renamed from: e, reason: collision with root package name */
    public static final java.util.List f290775e = java.util.Arrays.asList(20170417, 20160327, 20141218, 20141107, 20141028, 20141001, 20140701, 20140324, 20140204, 20131107, 20130618, 20130502, 20121101);

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0043  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.content.Intent a(android.content.Intent r8, android.os.Bundle r9, java.lang.RuntimeException r10) {
        /*
            java.lang.String r0 = "action_id"
            java.lang.String r1 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.f290773c
            r2 = 0
            java.lang.String r3 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.f290771a
            r4 = 0
            if (r8 != 0) goto Lb
            goto L3f
        Lb:
            int r5 = r8.getIntExtra(r3, r2)
            java.util.List r6 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.f290775e
            java.lang.Integer r7 = java.lang.Integer.valueOf(r5)
            boolean r6 = r6.contains(r7)
            if (r6 == 0) goto L22
            r6 = 20140701(0x133529d, float:3.293638E-38)
            if (r5 < r6) goto L22
            r5 = 1
            goto L23
        L22:
            r5 = r2
        L23:
            if (r5 == 0) goto L32
            android.os.Bundle r5 = r8.getBundleExtra(r1)
            if (r5 == 0) goto L30
            java.lang.String r5 = r5.getString(r0)
            goto L38
        L30:
            r5 = r4
            goto L38
        L32:
            java.lang.String r5 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.f290772b
            java.lang.String r5 = r8.getStringExtra(r5)
        L38:
            if (r5 == 0) goto L3f
            java.util.UUID r5 = java.util.UUID.fromString(r5)     // Catch: java.lang.IllegalArgumentException -> L3f
            goto L40
        L3f:
            r5 = r4
        L40:
            if (r5 != 0) goto L43
            return r4
        L43:
            android.content.Intent r4 = new android.content.Intent
            r4.<init>()
            int r8 = r8.getIntExtra(r3, r2)
            r4.putExtra(r3, r8)
            android.os.Bundle r8 = new android.os.Bundle
            r8.<init>()
            java.lang.String r2 = r5.toString()
            r8.putString(r0, r2)
            if (r10 == 0) goto L77
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r2 = "error_description"
            java.lang.String r10 = r10.toString()
            r0.putString(r2, r10)
            java.lang.String r10 = "error_type"
            java.lang.String r2 = "UserCanceled"
            r0.putString(r10, r2)
            java.lang.String r10 = "error"
            r8.putBundle(r10, r0)
        L77:
            r4.putExtra(r1, r8)
            if (r9 == 0) goto L81
            java.lang.String r8 = com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.f290774d
            r4.putExtra(r8, r9)
        L81:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.ui.p2722x33325c.sdk.z.a(android.content.Intent, android.os.Bundle, java.lang.RuntimeException):android.content.Intent");
    }
}
