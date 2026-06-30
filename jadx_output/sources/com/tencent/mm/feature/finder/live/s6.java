package com.tencent.mm.feature.finder.live;

/* loaded from: classes5.dex */
public final class s6 implements com.tencent.mm.ui.xc {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.t6 f66920d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v65.n f66921e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f66922f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f66923g;

    public s6(int i17, com.tencent.mm.feature.finder.live.t6 t6Var, v65.n nVar, android.app.Activity activity, kotlin.jvm.internal.h0 h0Var) {
        this.f66920d = t6Var;
        this.f66921e = nVar;
        this.f66922f = activity;
        this.f66923g = h0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c5  */
    @Override // com.tencent.mm.ui.xc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mmOnActivityResult(int r6, int r7, android.content.Intent r8) {
        /*
            r5 = this;
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            if (r6 != 0) goto Lc
            goto Lc8
        Lc:
            int r6 = r6.intValue()
            r0 = 40005(0x9c45, float:5.6059E-41)
            if (r0 == r6) goto L17
            goto Lc8
        L17:
            r6 = 0
            if (r8 == 0) goto L21
            java.lang.String r0 = "result_data"
            android.os.Bundle r8 = r8.getBundleExtra(r0)
            goto L22
        L21:
            r8 = r6
        L22:
            r0 = 0
            r1 = 1
            if (r7 != 0) goto L28
            goto L99
        L28:
            int r7 = r7.intValue()
            r2 = -1
            if (r7 != r2) goto L99
            if (r8 == 0) goto L99
            java.lang.String r7 = "next_params"
            java.io.Serializable r7 = r8.getSerializable(r7)
            boolean r8 = r7 instanceof java.util.Map
            if (r8 == 0) goto L3e
            java.util.Map r7 = (java.util.Map) r7
            goto L3f
        L3e:
            r7 = r6
        L3f:
            if (r7 == 0) goto L99
            java.lang.String r8 = "next_step"
            java.lang.Object r8 = r7.get(r8)
            boolean r2 = r8 instanceof java.lang.String
            if (r2 == 0) goto L4e
            java.lang.String r8 = (java.lang.String) r8
            goto L4f
        L4e:
            r8 = r6
        L4f:
            java.lang.String r2 = "result"
            java.lang.Object r7 = r7.get(r2)
            boolean r2 = r7 instanceof java.lang.String
            if (r2 == 0) goto L5c
            java.lang.String r7 = (java.lang.String) r7
            goto L5d
        L5c:
            r7 = r6
        L5d:
            java.lang.String r2 = "realname_verify"
            boolean r8 = r26.i0.p(r2, r8, r1)
            if (r8 == 0) goto L99
            if (r7 == 0) goto L74
            int r8 = r7.length()
            if (r8 <= 0) goto L6f
            r8 = r1
            goto L70
        L6f:
            r8 = r0
        L70:
            if (r8 != r1) goto L74
            r8 = r1
            goto L75
        L74:
            r8 = r0
        L75:
            if (r8 == 0) goto L99
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L83
            r8.<init>(r7)     // Catch: java.lang.Exception -> L83
            java.lang.String r7 = "code"
            java.lang.String r7 = r8.getString(r7)     // Catch: java.lang.Exception -> L83
            goto L9a
        L83:
            r7 = move-exception
            com.tencent.mm.feature.finder.live.t6 r8 = r5.f66920d
            java.lang.String r8 = r8.f66944d
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "decode json failed "
            r2.<init>(r3)
            r2.append(r7)
            java.lang.String r7 = r2.toString()
            com.tencent.mars.xlog.Log.i(r8, r7)
        L99:
            r7 = r6
        L9a:
            android.os.Handler r8 = new android.os.Handler
            android.os.Looper r2 = android.os.Looper.getMainLooper()
            r8.<init>(r2)
            com.tencent.mm.feature.finder.live.r6 r2 = new com.tencent.mm.feature.finder.live.r6
            android.app.Activity r3 = r5.f66922f
            kotlin.jvm.internal.h0 r4 = r5.f66923g
            r2.<init>(r3, r4)
            r8.post(r2)
            if (r7 == 0) goto Lbd
            int r8 = r7.length()
            if (r8 <= 0) goto Lb9
            r8 = r1
            goto Lba
        Lb9:
            r8 = r0
        Lba:
            if (r8 != r1) goto Lbd
            r0 = r1
        Lbd:
            v65.n r8 = r5.f66921e
            if (r0 == 0) goto Lc5
            r8.a(r7)
            goto Lc8
        Lc5:
            r8.a(r6)
        Lc8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.finder.live.s6.mmOnActivityResult(int, int, android.content.Intent):void");
    }
}
