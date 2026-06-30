package mq0;

@j95.b
/* loaded from: classes7.dex */
public final class s0 extends i95.w implements mq0.d0 {

    /* renamed from: f, reason: collision with root package name */
    public static final mq0.m0 f412146f = new mq0.m0(null);

    /* renamed from: g, reason: collision with root package name */
    public static final java.util.Map f412147g = kz5.c1.k(new jz5.l(mq0.a.f412046e, 1000), new jz5.l(mq0.a.f412057s, 1000), new jz5.l(mq0.a.f412058t, 1000), new jz5.l(mq0.a.f412059u, 1000), new jz5.l(mq0.a.f412060v, 1000), new jz5.l(mq0.a.f412061w, 1000), new jz5.l(mq0.a.f412062x, 1000), new jz5.l(mq0.a.f412063y, 1000));

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f412148d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f412149e = kz5.b0.c("MagicAdMiniProgram");

    public void Ai(java.lang.String bizScene, java.lang.String bizSubScene, java.lang.String cardId, mq0.a action, boolean z17, java.lang.String traceId, java.util.Map extMap) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizScene, "bizScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bizSubScene, "bizSubScene");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cardId, "cardId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(action, "action");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(traceId, "traceId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(extMap, "extMap");
        if (this.f412149e.contains(bizScene)) {
            if (mq0.m0.a(f412146f, action)) {
                ym5.a1.f(new mq0.q0(action, this, cardId, bizScene, bizSubScene, z17, traceId, extMap));
                return;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MagicCardIndexSystemReporter", "report action " + action.name() + " skipped due to sampling");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063 A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:16:0x0053, B:18:0x0057, B:23:0x0063, B:24:0x0075, B:26:0x0070), top: B:15:0x0053 }] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0070 A[Catch: Exception -> 0x0094, TryCatch #0 {Exception -> 0x0094, blocks: (B:16:0x0053, B:18:0x0057, B:23:0x0063, B:24:0x0075, B:26:0x0070), top: B:15:0x0053 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Bi(mq0.a r9, java.util.Map r10, mq0.f0 r11) {
        /*
            r8 = this;
            java.lang.String r0 = ";"
            java.lang.String r1 = "action"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r9, r1)
            java.lang.String r1 = "implType"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r11, r1)
            mq0.m0 r1 = mq0.s0.f412146f
            boolean r1 = mq0.m0.a(r1, r9)
            java.lang.String r2 = "MagicCardIndexSystemReporter"
            if (r1 != 0) goto L31
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "reportSimply action "
            r10.<init>(r11)
            java.lang.String r9 = r9.name()
            r10.append(r9)
            java.lang.String r9 = " skipped due to sampling"
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            return
        L31:
            com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct r1 = new com.tencent.mm.autogen.mmdata.rpt.MagicCardIndexSystemReporterStruct
            r1.<init>()
            java.lang.String r9 = r9.name()
            r1.p(r9)
            int r9 = r11.f412089d
            r1.f140603f = r9
            r9 = 1
            r11 = 0
            if (r10 == 0) goto L4e
            boolean r3 = r10.isEmpty()
            r3 = r3 ^ r9
            if (r3 != r9) goto L4e
            r3 = r9
            goto L4f
        L4e:
            r3 = r11
        L4f:
            java.lang.String r4 = ","
            if (r3 == 0) goto Lc0
            java.lang.String r3 = r1.f140605h     // Catch: java.lang.Exception -> L94
            if (r3 == 0) goto L60
            int r5 = r3.length()     // Catch: java.lang.Exception -> L94
            if (r5 != 0) goto L5e
            goto L60
        L5e:
            r5 = r11
            goto L61
        L60:
            r5 = r9
        L61:
            if (r5 != 0) goto L70
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L94
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r3)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = r26.i0.t(r3, r0, r4, r11)     // Catch: java.lang.Exception -> L94
            r5.<init>(r3)     // Catch: java.lang.Exception -> L94
            goto L75
        L70:
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch: java.lang.Exception -> L94
            r5.<init>()     // Catch: java.lang.Exception -> L94
        L75:
            pm0.b0.f(r10, r5)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = "timestamp"
            long r6 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Exception -> L94
            r5.put(r3, r6)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = r5.toString()     // Catch: java.lang.Exception -> L94
            java.lang.String r5 = "toString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r5)     // Catch: java.lang.Exception -> L94
            java.lang.String r3 = r26.i0.t(r3, r4, r0, r11)     // Catch: java.lang.Exception -> L94
            r1.q(r3)     // Catch: java.lang.Exception -> L94
            goto Lc0
        L94:
            r3 = move-exception
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "[rewardAD] "
            r5.<init>(r6)
            java.lang.String r6 = r1.f140604g
            r5.append(r6)
            java.lang.String r6 = ": JSON processing failed"
            r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.Object[] r3 = new java.lang.Object[]{r3}
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e(r2, r5, r3)
            org.json.JSONObject r10 = ri.l0.a(r10)
            java.lang.String r10 = java.lang.String.valueOf(r10)
            java.lang.String r10 = r26.i0.t(r10, r4, r0, r11)
            r1.q(r10)
        Lc0:
            java.lang.String r10 = "ReportSource"
            java.lang.String r0 = "native"
            java.lang.String r9 = r1.b(r10, r0, r9)
            r1.f140607j = r9
            r1.l()
            java.lang.String r9 = r1.n()
            java.lang.String r10 = "toShowString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r9, r10)
            java.lang.String r10 = "\r\n"
            java.lang.String r9 = r26.i0.t(r9, r10, r4, r11)
            java.lang.String r10 = "[MBAd] innerReport, struct: "
            java.lang.String r9 = r10.concat(r9)
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r2, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: mq0.s0.Bi(mq0.a, java.util.Map, mq0.f0):void");
    }

    public void Di(java.lang.String event, java.lang.String str, java.lang.String str2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        if (str == null || str.length() == 0) {
            return;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = new p3321xbce91901.jvm.p3324x21ffc6bd.h0();
        org.json.JSONObject jSONObject = new org.json.JSONObject(str);
        java.lang.String optString = jSONObject.optString("bizName");
        h0Var.f391656d = optString;
        if (this.f412149e.contains(optString)) {
            h0Var2.f391656d = jSONObject.optString("frameSetName");
            ym5.a1.f(new mq0.r0(event, h0Var, h0Var2, str2));
        }
    }

    public void wi(mq0.g0 jumpTo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jumpTo, "jumpTo");
        ym5.a1.f(new mq0.o0(this, jumpTo));
    }
}
