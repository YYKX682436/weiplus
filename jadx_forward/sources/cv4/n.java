package cv4;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcv4/n;", "Lcom/tencent/mm/plugin/lite/api/p;", "<init>", "()V", "plugin-websearch_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes8.dex */
public final class n extends com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.p {
    /* JADX WARN: Removed duplicated region for block: B:31:0x0079 A[Catch: Exception -> 0x009a, TryCatch #0 {Exception -> 0x009a, blocks: (B:3:0x0002, B:7:0x000e, B:10:0x0025, B:13:0x002d, B:15:0x003b, B:17:0x0042, B:20:0x004c, B:22:0x005d, B:28:0x006b, B:29:0x0073, B:31:0x0079, B:34:0x0087, B:37:0x0091), top: B:2:0x0002 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final u83.a A(java.lang.String r8, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.jb r9, r45.f03 r10, int r11) {
        /*
            r7 = this;
            r0 = 0
            r1 = 0
            u83.a r2 = new u83.a     // Catch: java.lang.Exception -> L9a
            r2.<init>()     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f455425i     // Catch: java.lang.Exception -> L9a
            java.lang.String r4 = ""
            if (r3 != 0) goto Le
            r3 = r4
        Le:
            r2.p(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r9.f65880x11c19d58     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = "field_tipsId"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)     // Catch: java.lang.Exception -> L9a
            r2.s(r3)     // Catch: java.lang.Exception -> L9a
            int r3 = r10.f455420d     // Catch: java.lang.Exception -> L9a
            r2.q(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f455422f     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L25
            r3 = r4
        L25:
            r2.t(r3)     // Catch: java.lang.Exception -> L9a
            java.lang.String r3 = r10.f455423g     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L2d
            r3 = r4
        L2d:
            r2.n(r3)     // Catch: java.lang.Exception -> L9a
            int r10 = r10.f455421e     // Catch: java.lang.Exception -> L9a
            r2.o(r10)     // Catch: java.lang.Exception -> L9a
            r45.ez2 r10 = r9.D0()     // Catch: java.lang.Exception -> L9a
            if (r10 == 0) goto L47
            r3 = 4
            com.tencent.mm.protobuf.g r10 = r10.m75934xbce7f2f(r3)     // Catch: java.lang.Exception -> L9a
            if (r10 == 0) goto L47
            java.lang.String r10 = r10.i()     // Catch: java.lang.Exception -> L9a
            goto L48
        L47:
            r10 = r0
        L48:
            if (r10 != 0) goto L4b
            goto L4c
        L4b:
            r4 = r10
        L4c:
            r2.l(r4)     // Catch: java.lang.Exception -> L9a
            r45.xs2 r10 = r9.N     // Catch: java.lang.Exception -> L9a
            r3 = 9
            int r10 = r10.m75939xb282bd08(r3)     // Catch: java.lang.Exception -> L9a
            r2.r(r10)     // Catch: java.lang.Exception -> L9a
            r10 = 1
            if (r8 == 0) goto L66
            int r3 = r8.length()     // Catch: java.lang.Exception -> L9a
            if (r3 != 0) goto L64
            goto L66
        L64:
            r3 = r1
            goto L67
        L66:
            r3 = r10
        L67:
            if (r3 != 0) goto L99
            if (r11 <= 0) goto L99
            java.util.List r3 = r9.L0()     // Catch: java.lang.Exception -> L9a
            java.util.Iterator r3 = r3.iterator()     // Catch: java.lang.Exception -> L9a
        L73:
            boolean r4 = r3.hasNext()     // Catch: java.lang.Exception -> L9a
            if (r4 == 0) goto L99
            java.lang.Object r4 = r3.next()     // Catch: java.lang.Exception -> L9a
            r45.f03 r4 = (r45.f03) r4     // Catch: java.lang.Exception -> L9a
            java.lang.String r5 = r4.f455426m     // Catch: java.lang.Exception -> L9a
            boolean r5 = r8.equals(r5)     // Catch: java.lang.Exception -> L9a
            if (r5 == 0) goto L73
            java.lang.String r5 = r4.f455425i     // Catch: java.lang.Exception -> L9a
            int r6 = r11 + (-1)
            u83.a r4 = r7.A(r5, r9, r4, r6)     // Catch: java.lang.Exception -> L9a
            if (r4 == 0) goto L73
            java.util.LinkedList r5 = r2.j()     // Catch: java.lang.Exception -> L9a
            r5.add(r4)     // Catch: java.lang.Exception -> L9a
            goto L73
        L99:
            return r2
        L9a:
            r8 = move-exception
            java.lang.String r9 = "createRedDotDetail"
            java.lang.Object[] r10 = new java.lang.Object[r1]
            java.lang.String r11 = "MicroMsg.LiteAppJsApiObserveUniformReddot"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r11, r8, r9, r10)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: cv4.n.A(java.lang.String, com.tencent.mm.plugin.finder.extension.reddot.jb, r45.f03, int):u83.a");
    }

    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        org.json.JSONArray optJSONArray;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("invoke, reqData: ");
        sb6.append(jSONObject != null ? jSONObject.toString() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiObserveUniformReddot", sb6.toString());
        try {
            java.lang.Object c17 = c();
            if (!(c17 instanceof p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.LiteAppJsApiObserveUniformReddot", "invoke, context is not an AppCompatActivity.");
                this.f224976f.a("context is not an AppCompatActivity.");
                return;
            }
            java.util.HashSet<java.lang.String> hashSet = new java.util.HashSet();
            if (jSONObject != null && (optJSONArray = jSONObject.optJSONArray("paths")) != null) {
                org.json.JSONArray jSONArray = optJSONArray.length() > 0 ? optJSONArray : null;
                if (jSONArray != null) {
                    int length = jSONArray.length();
                    for (int i17 = 0; i17 < length; i17++) {
                        java.lang.String optString = jSONArray.optString(i17);
                        if (optString != null) {
                            hashSet.add(optString);
                        }
                    }
                }
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1797x32b0ae.api.o oVar = this.f224976f;
            org.json.JSONObject jSONObject2 = new org.json.JSONObject();
            jSONObject2.putOpt("retCode", 0);
            oVar.c(jSONObject2, false);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiteAppJsApiObserveUniformReddot", "invoke, observeUniformReddot: " + hashSet);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f224975e.f380558b, "wxalite71e155e932f19de48da8333a8f225708")) {
                mf0.g0 g0Var = (mf0.g0) i95.n0.c(mf0.g0.class);
                final long j17 = this.f224975e.f380557a;
                final lf0.h0 h0Var = (lf0.h0) g0Var;
                h0Var.getClass();
                c61.t8 t8Var = (c61.t8) ((zy2.ca) i95.n0.c(zy2.ca.class));
                t8Var.ij((p012xc85e97e9.p093xedfae76a.y) c17, t8Var.bj(new yz5.l() { // from class: lf0.h0$$a
                    @Override // yz5.l
                    /* renamed from: invoke */
                    public final java.lang.Object mo146xb9724478(java.lang.Object obj) {
                        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a aVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1449xdb7d1c3f.p1450xc846b718.a) obj;
                        lf0.h0 h0Var2 = lf0.h0.this;
                        h0Var2.getClass();
                        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStoryUIService", "[TopStoryLiteApp]redDotObserver invoke() called with: result = [" + aVar + "]");
                        if (aVar != null && aVar.f186862c != null) {
                            h0Var2.Ri(j17, "onUniformReddotDataChanged", cn4.a.f125210a.a(aVar.f186864e).mo126745xcc31ba03());
                        }
                        return jz5.f0.f384359a;
                    }
                }));
                return;
            }
            p012xc85e97e9.p093xedfae76a.y yVar = (p012xc85e97e9.p093xedfae76a.y) c17;
            if (hashSet.isEmpty()) {
                return;
            }
            zy2.ca caVar = (zy2.ca) i95.n0.c(zy2.ca.class);
            for (java.lang.String str2 : hashSet) {
                p012xc85e97e9.p093xedfae76a.j0 Di = ((c61.t8) caVar).Di(str2);
                if (Di != null) {
                    Di.mo7806x9d92d11c(yVar, new cv4.m(this, str2));
                }
            }
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.LiteAppJsApiObserveUniformReddot", e17, "invoke", new java.lang.Object[0]);
            this.f224976f.a("Error");
        }
    }
}
