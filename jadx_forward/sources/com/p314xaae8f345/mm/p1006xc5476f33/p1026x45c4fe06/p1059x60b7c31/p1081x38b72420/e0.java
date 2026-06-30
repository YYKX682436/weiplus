package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420;

/* loaded from: classes7.dex */
public final class e0 extends com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f {

    /* renamed from: CTRL_INDEX */
    public static final int f34049x366c91de = 1230;

    /* renamed from: NAME */
    public static final java.lang.String f34050x24728b = "getWeAppProfileInfo";

    /* JADX WARN: Removed duplicated region for block: B:17:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void A(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l r7, org.json.JSONObject r8, int r9) {
        /*
            r6 = this;
            com.tencent.mm.plugin.appbrand.e9 r7 = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.e9) r7
            if (r7 != 0) goto L6
            goto L86
        L6:
            if (r8 != 0) goto La
            goto L86
        La:
            java.lang.String r0 = "username"
            java.lang.String r8 = r8.optString(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "appbrand_profile_info_mmkv_name"
            r0.<init>(r1)
            r0.append(r8)
            java.lang.String r8 = r0.toString()
            com.tencent.mm.sdk.platformtools.o4 r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.M(r8)
            java.lang.String r0 = "getMMKV(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r8, r0)
            java.lang.String r0 = "appbrand_profile_info_key"
            boolean r1 = r8.f(r0)
            r2 = 0
            r3 = 0
            r4 = 1
            if (r1 == 0) goto L5b
            byte[] r8 = r8.j(r0)
            if (r8 == 0) goto L5b
            int r0 = r8.length
            if (r0 != 0) goto L3e
            r0 = r4
            goto L3f
        L3e:
            r0 = r2
        L3f:
            r0 = r0 ^ r4
            if (r0 == 0) goto L5b
            java.lang.Class<com.tencent.mm.protocal.protobuf.GetProfileInfoResponse> r0 = com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19797xdd6e8042.class
            java.lang.Object r0 = r0.newInstance()     // Catch: java.lang.Exception -> L51
            r1 = r0
            com.tencent.mm.protobuf.f r1 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r1     // Catch: java.lang.Exception -> L51
            r1.mo11468x92b714fd(r8)     // Catch: java.lang.Exception -> L51
            com.tencent.mm.protobuf.f r0 = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) r0     // Catch: java.lang.Exception -> L51
            goto L5c
        L51:
            r8 = move-exception
            java.lang.Object[] r0 = new java.lang.Object[r2]
            java.lang.String r1 = "MultiProcessMMKV.decodeProtoBuffer"
            java.lang.String r5 = "decode ProtoBuffer"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r1, r8, r5, r0)
        L5b:
            r0 = r3
        L5c:
            r8 = r0
            com.tencent.mm.protocal.protobuf.GetProfileInfoResponse r8 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19797xdd6e8042) r8
            if (r8 == 0) goto L62
            r2 = r4
        L62:
            if (r2 == 0) goto L65
            goto L66
        L65:
            r0 = r3
        L66:
            com.tencent.mm.protocal.protobuf.GetProfileInfoResponse r0 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19797xdd6e8042) r0
            if (r0 == 0) goto L7f
            java.util.Map r8 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1212x6a710b1.x3.a(r4, r0)
            nf.f.c(r8)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r8)
            java.lang.String r8 = r0.toString()
            r7.a(r9, r8)
            jz5.f0 r3 = jz5.f0.f384359a
        L7f:
            if (r3 != 0) goto L86
            java.lang.String r8 = ""
            r7.a(r9, r8)
        L86:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1081x38b72420.e0.A(com.tencent.mm.plugin.appbrand.jsapi.l, org.json.JSONObject, int):void");
    }
}
