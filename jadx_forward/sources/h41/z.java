package h41;

/* loaded from: classes15.dex */
public final class z implements ey.t {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ h41.i0 f360435a;

    public z(h41.i0 i0Var) {
        this.f360435a = i0Var;
    }

    @Override // ey.t
    public java.lang.String a() {
        return com.p314xaae8f345.p3223x6dd56e0.p3225x63d9d922.p3226xaf3f29eb.C27885x67d3cca9.Name.f61550x63b68be7;
    }

    @Override // ey.t
    public java.lang.String b() {
        return "message::ask_confirm_send_msg";
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x004d  */
    @Override // ey.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(com.p314xaae8f345.p3133xd0ce8b26.aff.p3149x7a606665.o r7) {
        /*
            r6 = this;
            java.lang.String r0 = "getString(...)"
            java.lang.String r1 = "MicroMsg.OVCFunctionCallEventStubImpl"
            java.lang.String r2 = "notification"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r7, r2)
            java.lang.String r2 = ""
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Exception -> L31
            boolean[] r4 = r7.f298443h     // Catch: java.lang.Exception -> L31
            r5 = 4
            boolean r4 = r4[r5]     // Catch: java.lang.Exception -> L31
            if (r4 == 0) goto L17
            java.lang.String r7 = r7.f298442g     // Catch: java.lang.Exception -> L31
            goto L18
        L17:
            r7 = r2
        L18:
            r3.<init>(r7)     // Catch: java.lang.Exception -> L31
            java.lang.String r7 = "chat_id"
            java.lang.String r7 = r3.getString(r7)     // Catch: java.lang.Exception -> L31
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r7, r0)     // Catch: java.lang.Exception -> L31
            java.lang.String r4 = "content"
            java.lang.String r3 = r3.getString(r4)     // Catch: java.lang.Exception -> L2f
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r3, r0)     // Catch: java.lang.Exception -> L2f
            r2 = r3
            goto L45
        L2f:
            r0 = move-exception
            goto L34
        L31:
            r7 = move-exception
            r0 = r7
            r7 = r2
        L34:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "ask confirm send msg parametersJson error "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r0)
        L45:
            int r0 = r7.length()
            if (r0 != 0) goto L4d
            r0 = 1
            goto L4e
        L4d:
            r0 = 0
        L4e:
            if (r0 == 0) goto L56
            java.lang.String r7 = "ask confirm send msg chat_id empty"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(r1, r7)
            return
        L56:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "ask confirm send msg "
            r0.<init>(r3)
            r0.append(r7)
            r3 = 32
            r0.append(r3)
            r0.append(r2)
            java.lang.String r0 = r0.toString()
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(r1, r0)
            h41.i0 r0 = r6.f360435a
            com.tencent.wechat.aff.ovc.d r0 = r0.f360327a
            if (r0 == 0) goto L78
            r0.z1(r7, r2)
        L78:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: h41.z.c(com.tencent.wechat.aff.function_call.o):void");
    }
}
