package com.tencent.mm.feature.ecs.nirvana.ui;

@kotlin.Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u000b²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\b\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\t\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/tencent/mm/feature/ecs/nirvana/ui/MagicFlutterWebDemoUI;", "Lcom/tencent/mm/ui/MMComposeActivity;", "<init>", "()V", "", "visible", "", "inputBizName", "inputRouteName", "inputPreloadType", "inputExtraData", "plugin-nirvana_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class MagicFlutterWebDemoUI extends com.tencent.mm.ui.MMComposeActivity {
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
    
        if ((java.lang.String.valueOf(r3.get("realAppId")).length() == 0) != false) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.String T6(com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI r8, java.lang.String r9) {
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
            kotlin.jvm.internal.o.f(r4, r5)     // Catch: java.lang.Exception -> L71
        L25:
            boolean r5 = r4.hasNext()     // Catch: java.lang.Exception -> L71
            if (r5 == 0) goto L46
            java.lang.Object r5 = r4.next()     // Catch: java.lang.Exception -> L71
            java.lang.String r5 = (java.lang.String) r5     // Catch: java.lang.Exception -> L71
            kotlin.jvm.internal.o.d(r5)     // Catch: java.lang.Exception -> L71
            java.lang.Object r6 = r2.get(r5)     // Catch: java.lang.Exception -> L71
            java.lang.String r7 = "get(...)"
            kotlin.jvm.internal.o.f(r6, r7)     // Catch: java.lang.Exception -> L71
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
            kotlin.jvm.internal.o.d(r8)     // Catch: java.lang.Exception -> L71
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
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI.T6(com.tencent.mm.feature.ecs.nirvana.ui.MagicFlutterWebDemoUI, java.lang.String):java.lang.String");
    }

    @Override // com.tencent.mm.ui.MMActivity
    public int getLayoutId() {
        return 1;
    }

    @Override // com.tencent.mm.ui.MMActivity
    public android.view.View getLayoutView() {
        com.tencent.mm.mm_compose.MMComposeView mMComposeView = new com.tencent.mm.mm_compose.MMComposeView(this, null, 2, null);
        mMComposeView.setContent(u0.j.c(279466926, true, new p10.v0(this, mMComposeView)));
        return mMComposeView;
    }
}
