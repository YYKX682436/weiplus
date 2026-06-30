package h41;

/* loaded from: classes15.dex */
public final class y implements ey.k {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360423a;

    public y(h41.i0 i0Var) {
        this.f360423a = i0Var;
    }

    @Override // ey.k
    public java.lang.String a() {
        return "voip";
    }

    @Override // ey.k
    public java.lang.String b() {
        return "voip::ask_confirm_call";
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:1|(2:2|3)|(2:5|6)|7|8|9|(2:15|16)(1:17)) */
    @Override // ey.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.e r7) {
        /*
            r6 = this;
            java.lang.String r0 = "MicroMsg.OVCFunctionCallEventStubImpl"
            java.lang.String r1 = "notification"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r1)
            java.lang.String r1 = ""
            r2 = 0
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = r7.b()     // Catch: java.lang.Exception -> L27
            r3.<init>(r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r4 = "contact_id"
            java.lang.String r4 = r3.getString(r4)     // Catch: java.lang.Exception -> L27
            java.lang.String r5 = "getString(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)     // Catch: java.lang.Exception -> L27
            java.lang.String r1 = "scene"
            int r1 = r3.getInt(r1)     // Catch: java.lang.Exception -> L25
            goto L3c
        L25:
            r1 = move-exception
            goto L2a
        L27:
            r3 = move-exception
            r4 = r1
            r1 = r3
        L2a:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r5 = "ask confirm call parametersJson error "
            r3.<init>(r5)
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r0, r1)
            r1 = r2
        L3c:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L4b
            java.lang.String r7 = r7.c()     // Catch: java.lang.Exception -> L4b
            r3.<init>(r7)     // Catch: java.lang.Exception -> L4b
            java.lang.String r7 = "success"
            boolean r2 = r3.getBoolean(r7)     // Catch: java.lang.Exception -> L4b
        L4b:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r3 = "ask confirm call "
            r7.<init>(r3)
            r7.append(r4)
            r3 = 32
            r7.append(r3)
            r7.append(r2)
            java.lang.String r7 = r7.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r0, r7)
            if (r2 != 0) goto L67
            return
        L67:
            h41.i0 r7 = r6.f360423a
            com.tencent.wechat.aff.ovc.d r7 = r7.f360327a
            if (r7 == 0) goto L70
            r7.m1(r4, r1)
        L70:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h41.y.c(com.tencent.wechat.aff.function_call.e):void");
    }
}
