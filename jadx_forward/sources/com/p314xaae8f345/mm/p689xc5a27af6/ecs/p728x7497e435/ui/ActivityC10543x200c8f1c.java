package com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui;

@p3321xbce91901.InterfaceC29042xe907df4f(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/tencent/mm/feature/ecs/nirvana/ui/MagicFlutterWebDemoUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "", "visible", "", "inputBizName", "inputRouteName", "inputPreloadType", "inputExtraData", "plugin-nirvana_release"}, k = 1, mv = {1, 9, 0})
/* renamed from: com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI */
/* loaded from: classes5.dex */
public final class ActivityC10543x200c8f1c extends com.p314xaae8f345.mm.ui.AbstractActivityC21399xe75e5101 {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if ((java.lang.String.valueOf(r3.get("realAppId")).length() == 0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String T6(com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10543x200c8f1c r8, java.lang.String r9) {
        /*
            r8.getClass()
            java.lang.String r8 = "realAppId"
            r0 = 1
            r1 = 0
            int r2 = r9.length()     // Catch: java.lang.Exception -> L71
            if (r2 <= 0) goto Lf
            r2 = r0
            goto L10
        Lf:
            r2 = r1
        L10:
            if (r2 == 0) goto L41
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch: java.lang.Exception -> L71
            r2.<init>(r9)     // Catch: java.lang.Exception -> L71
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L71
            r3.<init>()     // Catch: java.lang.Exception -> L71
            java.util.Iterator r4 = r2.keys()     // Catch: java.lang.Exception -> L71
            java.lang.String r5 = "keys(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r4, r5)     // Catch: java.lang.Exception -> L71
        L25:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L71
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L71
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r5)     // Catch: java.lang.Exception -> L71
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Exception -> L71
            java.lang.String r7 = "get(...)"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(r6, r7)     // Catch: java.lang.Exception -> L71
            r3.put(r5, r6)     // Catch: java.lang.Exception -> L71
            goto L25
        L41:
            java.util.LinkedHashMap r3 = new java.util.LinkedHashMap     // Catch: java.lang.Exception -> L71
            r3.<init>()     // Catch: java.lang.Exception -> L71
        L46:
            boolean r2 = r3.containsKey(r8)     // Catch: java.lang.Exception -> L71
            if (r2 == 0) goto L5f
            java.lang.Object r2 = r3.get(r8)     // Catch: java.lang.Exception -> L71
            java.lang.String r2 = java.lang.String.valueOf(r2)     // Catch: java.lang.Exception -> L71
            int r2 = r2.length()     // Catch: java.lang.Exception -> L71
            if (r2 != 0) goto L5c
            r2 = r0
            goto L5d
        L5c:
            r2 = r1
        L5d:
            if (r2 == 0) goto L64
        L5f:
            java.lang.String r2 = "wx2b255582a7b4bfd0"
            r3.put(r8, r2)     // Catch: java.lang.Exception -> L71
        L64:
            org.json.JSONObject r8 = new org.json.JSONObject     // Catch: java.lang.Exception -> L71
            r8.<init>(r3)     // Catch: java.lang.Exception -> L71
            java.lang.String r8 = r8.toString()     // Catch: java.lang.Exception -> L71
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(r8)     // Catch: java.lang.Exception -> L71
            goto L7e
        L71:
            int r8 = r9.length()
            if (r8 != 0) goto L78
            goto L79
        L78:
            r0 = r1
        L79:
            if (r0 == 0) goto L7d
            java.lang.String r9 = "{\"realAppId\":\"wx2b255582a7b4bfd0\"}"
        L7d:
            r8 = r9
        L7e:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p689xc5a27af6.ecs.p728x7497e435.ui.ActivityC10543x200c8f1c.T6(com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI, java.lang.String):java.lang.String");
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutId */
    public int mo43051x2ee31f5b() {
        return 1;
    }

    @Override // com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf
    /* renamed from: getLayoutView */
    public android.view.View mo44092x29ebce5() {
        com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197 c11098x3efa6197 = new com.p314xaae8f345.mm.p935xe99f85f3.C11098x3efa6197(this, null, 2, null);
        c11098x3efa6197.m47820xe9f5bdb7(u0.j.c(279466926, true, new p10.v0(this, c11098x3efa6197)));
        return c11098x3efa6197;
    }
}
