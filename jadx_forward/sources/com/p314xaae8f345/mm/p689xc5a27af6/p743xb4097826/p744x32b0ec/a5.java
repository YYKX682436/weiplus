package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes3.dex */
public final class a5 implements sh1.e {
    /* JADX WARN: Removed duplicated region for block: B:10:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:5:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0071  */
    @Override // sh1.e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public sh1.g a(int r11, java.lang.String r12, android.view.Surface r13, sh1.f r14) {
        /*
            r10 = this;
            java.lang.String r0 = "params"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r12, r0)
            java.lang.String r0 = "invoker"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r14, r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "create viewId:"
            r0.<init>(r1)
            r0.append(r11)
            java.lang.String r1 = " params:"
            r0.append(r1)
            r0.append(r12)
            java.lang.String r1 = " surface:"
            r0.append(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            java.lang.String r1 = "FinderLiveForSkylineService"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>(r12)
            java.lang.String r12 = "b64encodedExportBuffer"
            java.lang.String r12 = r0.optString(r12)
            r1 = 0
            byte[] r12 = android.util.Base64.decode(r12, r1)
            r45.sp1 r2 = new r45.sp1
            r2.<init>()
            r3 = 0
            if (r12 != 0) goto L47
        L45:
            r2 = r3
            goto L58
        L47:
            r2.mo11468x92b714fd(r12)     // Catch: java.lang.Exception -> L4b
            goto L58
        L4b:
            r12 = move-exception
            java.lang.String r2 = ""
            java.lang.Object[] r12 = new java.lang.Object[]{r12}
            java.lang.String r4 = "safeParser"
            com.p314xaae8f345.mm.sdk.p2603x2137b148.Log.a(r4, r2, r12)
            goto L45
        L58:
            if (r2 == 0) goto L68
            java.lang.Class<s40.w0> r12 = s40.w0.class
            i95.m r12 = i95.n0.c(r12)
            s40.w0 r12 = (s40.w0) r12
            com.tencent.mm.feature.finder.live.v4 r12 = (com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.v4) r12
            com.tencent.mm.protocal.protobuf.FinderObject r3 = r12.Mk(r2)
        L68:
            r6 = r3
            java.lang.String r12 = "position"
            org.json.JSONObject r12 = r0.optJSONObject(r12)
            if (r12 == 0) goto L7a
            java.lang.String r0 = "width"
            int r0 = r12.optInt(r0)
            r8 = r0
            goto L7b
        L7a:
            r8 = r1
        L7b:
            if (r12 == 0) goto L83
            java.lang.String r0 = "height"
            int r1 = r12.optInt(r0)
        L83:
            r9 = r1
            ud2.d r12 = new ud2.d
            android.content.Context r5 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            java.lang.String r0 = "getContext(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r5, r0)
            r4 = r12
            r7 = r13
            r4.<init>(r5, r6, r7, r8, r9)
            com.tencent.mm.feature.finder.live.z4 r13 = new com.tencent.mm.feature.finder.live.z4
            r13.<init>(r14, r11)
            ud2.c r11 = new ud2.c
            r11.<init>(r12, r13)
            pm0.v.X(r11)
            com.tencent.mm.feature.finder.live.y4 r11 = new com.tencent.mm.feature.finder.live.y4
            r11.<init>(r12, r14)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec.a5.a(int, java.lang.String, android.view.Surface, sh1.f):sh1.g");
    }
}
