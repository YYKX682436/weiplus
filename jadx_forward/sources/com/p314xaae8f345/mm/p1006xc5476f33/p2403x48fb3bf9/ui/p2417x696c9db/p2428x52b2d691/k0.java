package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0002\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/tencent/mm/plugin/webview/ui/tools/newjsapi/k0;", "Lcom/tencent/mm/ipcinvoker/j;", "Landroid/os/Bundle;", "", "<init>", "()V", "plugin-webview_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes.dex */
final class k0 implements com.p314xaae8f345.mm.p794xb0fa9b5e.j {
    /* JADX WARN: Removed duplicated region for block: B:32:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0075 A[Catch: Exception -> 0x000f, TryCatch #0 {Exception -> 0x000f, blocks: (B:55:0x0008, B:4:0x0013, B:6:0x0017, B:8:0x001d, B:9:0x0025, B:11:0x0029, B:13:0x002f, B:14:0x0038, B:16:0x003c, B:18:0x0043, B:19:0x004b, B:21:0x004f, B:22:0x0053, B:24:0x005a, B:27:0x0068, B:33:0x0075, B:36:0x0085, B:40:0x0089, B:44:0x009c), top: B:54:0x0008 }] */
    @Override // com.p314xaae8f345.mm.p794xb0fa9b5e.j
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo8834xb9724478(java.lang.Object r13, com.p314xaae8f345.mm.p794xb0fa9b5e.r r14) {
        /*
            r12 = this;
            android.os.Bundle r13 = (android.os.Bundle) r13
            java.lang.Class<q80.g0> r0 = q80.g0.class
            r1 = 0
            r2 = 0
            if (r13 == 0) goto L12
            java.lang.String r3 = "actionName"
            java.lang.Object r3 = r13.get(r3)     // Catch: java.lang.Exception -> Lf
            goto L13
        Lf:
            r13 = move-exception
            goto La0
        L12:
            r3 = r2
        L13:
            boolean r4 = r3 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r4 == 0) goto L1a
            java.lang.String r3 = (java.lang.String) r3     // Catch: java.lang.Exception -> Lf
            goto L1b
        L1a:
            r3 = r2
        L1b:
            if (r13 == 0) goto L24
            java.lang.String r4 = "option"
            java.lang.Object r4 = r13.get(r4)     // Catch: java.lang.Exception -> Lf
            goto L25
        L24:
            r4 = r2
        L25:
            boolean r5 = r4 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r5 == 0) goto L2c
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> Lf
            goto L2d
        L2c:
            r4 = r2
        L2d:
            if (r13 == 0) goto L37
            java.lang.String r5 = "sourceAppId"
            java.lang.Object r5 = r13.get(r5)     // Catch: java.lang.Exception -> Lf
            goto L38
        L37:
            r5 = r2
        L38:
            boolean r6 = r5 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r6 == 0) goto L40
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> Lf
            r10 = r5
            goto L41
        L40:
            r10 = r2
        L41:
            if (r13 == 0) goto L4a
            java.lang.String r5 = "data"
            java.lang.Object r13 = r13.get(r5)     // Catch: java.lang.Exception -> Lf
            goto L4b
        L4a:
            r13 = r2
        L4b:
            boolean r5 = r13 instanceof java.lang.String     // Catch: java.lang.Exception -> Lf
            if (r5 == 0) goto L52
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Exception -> Lf
            goto L53
        L52:
            r13 = r2
        L53:
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch: java.lang.Exception -> Lf
            r11.<init>(r13)     // Catch: java.lang.Exception -> Lf
            if (r4 == 0) goto L9a
            java.lang.String r5 = "\"source\""
            r6 = 0
            r7 = 0
            r8 = 6
            r9 = 0
            int r13 = r26.n0.L(r4, r5, r6, r7, r8, r9)     // Catch: java.lang.Exception -> Lf
            if (r13 < 0) goto L9a
            if (r3 == 0) goto L71
            int r13 = r3.length()     // Catch: java.lang.Exception -> Lf
            if (r13 != 0) goto L6f
            goto L71
        L6f:
            r13 = r1
            goto L72
        L71:
            r13 = 1
        L72:
            if (r13 == 0) goto L75
            goto L9a
        L75:
            i95.m r13 = i95.n0.c(r0)     // Catch: java.lang.Exception -> Lf
            q80.g0 r13 = (q80.g0) r13     // Catch: java.lang.Exception -> Lf
            com.tencent.mm.feature.lite.i r13 = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) r13     // Catch: java.lang.Exception -> Lf
            int r13 = r13.rj(r10, r3, r11)     // Catch: java.lang.Exception -> Lf
            if (r13 >= 0) goto L89
            if (r14 == 0) goto Lae
            r14.a(r2)     // Catch: java.lang.Exception -> Lf
            goto Lae
        L89:
            i95.m r0 = i95.n0.c(r0)     // Catch: java.lang.Exception -> Lf
            q80.g0 r0 = (q80.g0) r0     // Catch: java.lang.Exception -> Lf
            com.tencent.mm.plugin.webview.ui.tools.newjsapi.j0 r3 = new com.tencent.mm.plugin.webview.ui.tools.newjsapi.j0     // Catch: java.lang.Exception -> Lf
            r3.<init>(r13, r14)     // Catch: java.lang.Exception -> Lf
            com.tencent.mm.feature.lite.i r0 = (com.p314xaae8f345.mm.p689xc5a27af6.p753x32b0ae.i) r0     // Catch: java.lang.Exception -> Lf
            r0.Di(r3)     // Catch: java.lang.Exception -> Lf
            goto Lae
        L9a:
            if (r14 == 0) goto Lae
            r14.a(r2)     // Catch: java.lang.Exception -> Lf
            goto Lae
        La0:
            if (r14 == 0) goto La5
            r14.a(r2)
        La5:
            java.lang.Object[] r14 = new java.lang.Object[r1]
            java.lang.String r0 = "MicroMsg.JsApiDispatchLiteAppAction"
            java.lang.String r1 = "JsApiDispatchLiteAppAction exception"
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35(r0, r13, r1, r14)
        Lae:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.k0.mo8834xb9724478(java.lang.Object, com.tencent.mm.ipcinvoker.r):void");
    }
}
