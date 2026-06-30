package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/e;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class e extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    public final u83.c A(java.lang.String str) {
        r45.f03 I0;
        u83.c cVar = new u83.c();
        cVar.j(str);
        cVar.l(false);
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(str)) {
            return cVar;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb L0 = ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).nk().L0(str);
        u83.a B = (L0 == null || (I0 = L0.I0(str)) == null) ? null : B(str, L0, I0, L0.K.size());
        if (B == null) {
            return cVar;
        }
        cVar.l(true);
        cVar.k(B);
        return cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0080 A[Catch: Exception -> 0x00a1, TryCatch #0 {Exception -> 0x00a1, blocks: (B:3:0x0002, B:7:0x000e, B:10:0x0025, B:13:0x002d, B:15:0x003b, B:17:0x0042, B:20:0x004c, B:22:0x0064, B:28:0x0072, B:29:0x007a, B:31:0x0080, B:34:0x008e, B:37:0x0098), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u83.a B(java.lang.String r8, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r9, r45.f03 r10, int r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            u83.a r2 = new u83.a     // Catch: java.lang.Exception -> La1
            r2.<init>()     // Catch: java.lang.Exception -> La1
            java.lang.String r3 = r10.f455425i     // Catch: java.lang.Exception -> La1
            java.lang.String r4 = ""
            if (r3 != 0) goto Le
            r3 = r4
        Le:
            r2.p(r3)     // Catch: java.lang.Exception -> La1
            java.lang.String r3 = r9.f65880x11c19d58     // Catch: java.lang.Exception -> La1
            java.lang.String r5 = "field_tipsId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)     // Catch: java.lang.Exception -> La1
            r2.s(r3)     // Catch: java.lang.Exception -> La1
            int r3 = r10.f455420d     // Catch: java.lang.Exception -> La1
            r2.q(r3)     // Catch: java.lang.Exception -> La1
            java.lang.String r3 = r10.f455422f     // Catch: java.lang.Exception -> La1
            if (r3 != 0) goto L25
            r3 = r4
        L25:
            r2.t(r3)     // Catch: java.lang.Exception -> La1
            java.lang.String r3 = r10.f455423g     // Catch: java.lang.Exception -> La1
            if (r3 != 0) goto L2d
            r3 = r4
        L2d:
            r2.n(r3)     // Catch: java.lang.Exception -> La1
            int r10 = r10.f455421e     // Catch: java.lang.Exception -> La1
            r2.o(r10)     // Catch: java.lang.Exception -> La1
            r45.ez2 r10 = r9.D0()     // Catch: java.lang.Exception -> La1
            if (r10 == 0) goto L47
            r3 = 4
            com.tencent.mm.protobuf.g r10 = r10.m75934xbce7f2f(r3)     // Catch: java.lang.Exception -> La1
            if (r10 == 0) goto L47
            java.lang.String r10 = r10.i()     // Catch: java.lang.Exception -> La1
            goto L48
        L47:
            r10 = r0
        L48:
            if (r10 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r10
        L4c:
            r2.l(r4)     // Catch: java.lang.Exception -> La1
            r45.xs2 r10 = r9.N     // Catch: java.lang.Exception -> La1
            r3 = 9
            int r10 = r10.m75939xb282bd08(r3)     // Catch: java.lang.Exception -> La1
            r2.r(r10)     // Catch: java.lang.Exception -> La1
            int r10 = r9.Q0(r1)     // Catch: java.lang.Exception -> La1
            r2.k(r10)     // Catch: java.lang.Exception -> La1
            r10 = 1
            if (r8 == 0) goto L6d
            int r3 = r8.length()     // Catch: java.lang.Exception -> La1
            if (r3 != 0) goto L6b
            goto L6d
        L6b:
            r3 = r1
            goto L6e
        L6d:
            r3 = r10
        L6e:
            if (r3 != 0) goto La0
            if (r11 <= 0) goto La0
            java.util.List r3 = r9.L0()     // Catch: java.lang.Exception -> La1
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> La1
        L7a:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> La1
            if (r4 == 0) goto La0
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> La1
            r45.f03 r4 = (r45.f03) r4     // Catch: java.lang.Exception -> La1
            java.lang.String r5 = r4.f455426m     // Catch: java.lang.Exception -> La1
            boolean r5 = r8.equals(r5)     // Catch: java.lang.Exception -> La1
            if (r5 == 0) goto L7a
            java.lang.String r5 = r4.f455425i     // Catch: java.lang.Exception -> La1
            int r6 = r11 + (-1)
            u83.a r4 = r7.B(r5, r9, r4, r6)     // Catch: java.lang.Exception -> La1
            if (r4 == 0) goto L7a
            java.util.LinkedList r5 = r2.j()     // Catch: java.lang.Exception -> La1
            r5.add(r4)     // Catch: java.lang.Exception -> La1
            goto L7a
        La0:
            return r2
        La1:
            r8 = move-exception
            java.lang.String r9 = "createRedDotDetail"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "MicroMsg.LiteAppJsApiFetchUniformReddotList"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r11, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cv4.e.B(java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, int):u83.a");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke, reqData: ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFetchUniformReddotList", sb6.toString());
        try {
            u83.b bVar = new u83.b();
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("pathList")) != null) {
                org.json.JSONArray jSONArray = optJSONArray.length() > 0 ? optJSONArray : null;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString = jSONArray.optString(i17);
                        if (optString != null) {
                            bVar.j().add(A(optString));
                        }
                    }
                }
            }
            org.json.JSONObject mo126745xcc31ba03 = bVar.mo126745xcc31ba03();
            mo126745xcc31ba03.putOpt("retCode", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiFetchUniformReddotList", "invoke, fetchUniformReddotListResult: " + mo126745xcc31ba03);
            this.f224976f.c(mo126745xcc31ba03, false);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiFetchUniformReddotList", e17, "invoke", new java.lang.Object[0]);
            this.f224976f.a("Error");
        }
    }
}
