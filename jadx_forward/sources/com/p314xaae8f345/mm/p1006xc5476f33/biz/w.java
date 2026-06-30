package com.p314xaae8f345.mm.p1006xc5476f33.biz;

/* loaded from: classes.dex */
public final class w implements j45.k {
    /* JADX WARN: Removed duplicated region for block: B:11:0x006c A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0055  */
    @Override // j45.i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b(android.content.Context r4, java.lang.String r5, android.content.Intent r6, int r7, com.p314xaae8f345.mm.ui.x7 r8) {
        /*
            r3 = this;
            java.lang.String r7 = "context"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r4, r7)
            java.lang.String r7 = "activity"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.g(r5, r7)
            r7 = 0
            if (r6 != 0) goto Le
            return r7
        Le:
            java.lang.String r8 = "webview"
            boolean r0 = r26.i0.y(r5, r8, r7)
            r1 = 1
            if (r0 != 0) goto L22
            java.lang.String r0 = "brandservice"
            boolean r0 = r26.i0.y(r5, r0, r7)
            if (r0 != 0) goto L22
        L20:
            r8 = r7
            goto L6a
        L22:
            boolean r8 = r26.n0.B(r5, r8, r1)
            if (r8 == 0) goto L57
            java.lang.String r8 = "rawUrl"
            java.lang.String r8 = r6.getStringExtra(r8)
            boolean r0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            if (r0 == 0) goto L35
            goto L50
        L35:
            android.net.Uri r8 = android.net.Uri.parse(r8)
            java.lang.String r0 = r8.getHost()
            if (r0 == 0) goto L4d
            java.lang.String r8 = r8.getHost()
            java.lang.String r0 = "mp.weixin.qq.com"
            boolean r8 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r8, r0)
            if (r8 == 0) goto L4d
            r8 = r1
            goto L4e
        L4d:
            r8 = r7
        L4e:
            if (r8 != 0) goto L52
        L50:
            r8 = r7
            goto L53
        L52:
            r8 = r1
        L53:
            if (r8 == 0) goto L57
            r8 = r1
            goto L58
        L57:
            r8 = r7
        L58:
            if (r8 != 0) goto L5b
            goto L20
        L5b:
            java.lang.String r8 = "float_ball_key"
            java.lang.String r8 = r6.getStringExtra(r8)
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(r8)
            r8 = r8 ^ r1
            if (r8 == 0) goto L69
            goto L20
        L69:
            r8 = r1
        L6a:
            if (r8 != 0) goto L6d
            return r7
        L6d:
            boolean r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.n()
            if (r8 == 0) goto L9d
            boolean r8 = gm0.j1.a()
            if (r8 != 0) goto L7a
            return r7
        L7a:
            java.lang.Class<zq1.a0> r8 = zq1.a0.class
            lm0.a r0 = gm0.j1.s(r8)
            zq1.a0 r0 = (zq1.a0) r0
            yq1.z r0 = (yq1.z) r0
            boolean r0 = r0.q()
            if (r0 != 0) goto Lbf
            lm0.a r7 = gm0.j1.s(r8)
            zq1.a0 r7 = (zq1.a0) r7
            android.content.Context r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a
            com.tencent.mm.plugin.biz.u r0 = new com.tencent.mm.plugin.biz.u
            r0.<init>(r4, r3, r5, r6)
            yq1.z r7 = (yq1.z) r7
            r7.B(r8, r0)
            return r1
        L9d:
            java.lang.String r8 = com.p314xaae8f345.mm.sdk.p2603x2137b148.w9.f274586a
            com.tencent.mm.ipcinvoker.type.IPCVoid r0 = com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10757xa20383b0.f149940d
            java.lang.Class<com.tencent.mm.plugin.biz.t> r2 = com.p314xaae8f345.mm.p1006xc5476f33.biz.t.class
            java.lang.Object r2 = com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.b(r8, r0, r2)
            com.tencent.mm.ipcinvoker.type.IPCBoolean r2 = (com.p314xaae8f345.mm.p794xb0fa9b5e.p797x368f3a.C10750x9556b48c) r2
            if (r2 == 0) goto Lb1
            boolean r2 = r2.f149933d
            if (r2 != 0) goto Lb1
            r2 = r1
            goto Lb2
        Lb1:
            r2 = r7
        Lb2:
            if (r2 == 0) goto Lbf
            com.tencent.mm.plugin.biz.v r7 = new com.tencent.mm.plugin.biz.v
            r7.<init>(r3, r4, r5, r6)
            java.lang.Class<com.tencent.mm.plugin.biz.s> r4 = com.p314xaae8f345.mm.p1006xc5476f33.biz.s.class
            com.p314xaae8f345.mm.p794xb0fa9b5e.p795xdb7d1c3f.l.a(r8, r0, r4, r7)
            return r1
        Lbf:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.biz.w.b(android.content.Context, java.lang.String, android.content.Intent, int, com.tencent.mm.ui.x7):boolean");
    }

    public final void c(android.content.Context context, java.lang.String activity, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        try {
            int L = r26.n0.L(activity, ".", 0, false, 6, null);
            java.lang.String substring = activity.substring(0, L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring, "substring(...)");
            java.lang.String substring2 = activity.substring(L);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(substring2, "substring(...)");
            j45.l.j(context, substring, substring2, intent, null);
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PluginBizHelper", "reload webView fail! %s", e17.getMessage());
            j45.l.j(context, "webview", ".ui.tools.WebViewUI", intent, null);
        }
    }
}
