package com.p3263xee53b379;

/* loaded from: classes13.dex */
public final class p implements com.p3263xee53b379.f {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p3263xee53b379.ActivityC28074x3a8f05c8 f302255a;

    public p(com.p3263xee53b379.ActivityC28074x3a8f05c8 activityC28074x3a8f05c8) {
        this.f302255a = activityC28074x3a8f05c8;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x00a0 A[Catch: Exception -> 0x00af, TRY_LEAVE, TryCatch #1 {Exception -> 0x00af, blocks: (B:3:0x0007, B:10:0x0032, B:12:0x00a0, B:20:0x0024), top: B:2:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:? A[RETURN, SYNTHETIC] */
    @Override // com.p3263xee53b379.f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(java.lang.String r13, com.p3263xee53b379.g r14) {
        /*
            r12 = this;
            com.unionpay.UPPayWapActivity r0 = r12.f302255a
            java.lang.String r1 = "1"
            java.lang.String r2 = ""
            r3 = 0
            org.json.JSONObject r4 = new org.json.JSONObject     // Catch: java.lang.Exception -> Laf
            r4.<init>(r13)     // Catch: java.lang.Exception -> Laf
            java.lang.String r13 = "url"
            java.lang.Object r13 = r4.get(r13)     // Catch: java.lang.Exception -> L20
            java.lang.String r13 = (java.lang.String) r13     // Catch: java.lang.Exception -> L20
            java.lang.String r5 = "title"
            java.lang.Object r4 = r4.get(r5)     // Catch: java.lang.Exception -> L1e
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Exception -> L1e
            r2 = r4
            goto L32
        L1e:
            r4 = move-exception
            goto L22
        L20:
            r4 = move-exception
            r13 = r2
        L22:
            if (r14 == 0) goto L32
            java.lang.String r4 = r4.getMessage()     // Catch: java.lang.Exception -> Laf
            java.lang.String r4 = com.p3263xee53b379.ActivityC28074x3a8f05c8.L6(r1, r4, r3)     // Catch: java.lang.Exception -> Laf
            r5 = r14
            com.unionpay.d r5 = (com.p3263xee53b379.d) r5     // Catch: java.lang.Exception -> Laf
            r5.a(r4)     // Catch: java.lang.Exception -> Laf
        L32:
            android.os.Bundle r4 = new android.os.Bundle     // Catch: java.lang.Exception -> Laf
            r4.<init>()     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = "waptype"
            java.lang.String r6 = "new_page"
            r4.putString(r5, r6)     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = "magic_data"
            java.lang.String r6 = "949A1CC"
            r4.putString(r5, r6)     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = "wapurl"
            r4.putString(r5, r13)     // Catch: java.lang.Exception -> Laf
            java.lang.String r13 = "waptitle"
            r4.putString(r13, r2)     // Catch: java.lang.Exception -> Laf
            java.lang.String r13 = "actionType"
            java.lang.String r2 = r0.f302204i     // Catch: java.lang.Exception -> Laf
            r4.putString(r13, r2)     // Catch: java.lang.Exception -> Laf
            android.content.Intent r13 = new android.content.Intent     // Catch: java.lang.Exception -> Laf
            r13.<init>()     // Catch: java.lang.Exception -> Laf
            r13.putExtras(r4)     // Catch: java.lang.Exception -> Laf
            java.lang.Class<com.unionpay.UPPayWapActivity> r2 = com.p3263xee53b379.ActivityC28074x3a8f05c8.class
            r13.setClass(r0, r2)     // Catch: java.lang.Exception -> Laf
            com.unionpay.UPPayWapActivity r0 = r12.f302255a     // Catch: java.lang.Exception -> Laf
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch: java.lang.Exception -> Laf
            r2.<init>()     // Catch: java.lang.Exception -> Laf
            r2.add(r13)     // Catch: java.lang.Exception -> Laf
            java.util.Collections.reverse(r2)     // Catch: java.lang.Exception -> Laf
            java.lang.Object[] r5 = r2.toArray()     // Catch: java.lang.Exception -> Laf
            java.lang.String r6 = "com/unionpay/l"
            java.lang.String r7 = "a"
            java.lang.String r8 = "(Ljava/lang/String;Lcom/unionpay/ae;)V"
            java.lang.String r9 = "Undefined"
            java.lang.String r10 = "startActivity"
            java.lang.String r11 = "(Landroid/content/Intent;)V"
            r4 = r0
            yj0.a.d(r4, r5, r6, r7, r8, r9, r10, r11)     // Catch: java.lang.Exception -> Laf
            r13 = 0
            java.lang.Object r13 = r2.get(r13)     // Catch: java.lang.Exception -> Laf
            android.content.Intent r13 = (android.content.Intent) r13     // Catch: java.lang.Exception -> Laf
            r0.startActivity(r13)     // Catch: java.lang.Exception -> Laf
            java.lang.String r5 = "com/unionpay/l"
            java.lang.String r6 = "a"
            java.lang.String r7 = "(Ljava/lang/String;Lcom/unionpay/ae;)V"
            java.lang.String r8 = "Undefined"
            java.lang.String r9 = "startActivity"
            java.lang.String r10 = "(Landroid/content/Intent;)V"
            r4 = r0
            yj0.a.f(r4, r5, r6, r7, r8, r9, r10)     // Catch: java.lang.Exception -> Laf
            if (r14 == 0) goto Lae
            java.lang.String r13 = "0"
            java.lang.String r0 = "success"
            java.lang.String r13 = com.p3263xee53b379.ActivityC28074x3a8f05c8.L6(r13, r0, r3)     // Catch: java.lang.Exception -> Laf
            r0 = r14
            com.unionpay.d r0 = (com.p3263xee53b379.d) r0     // Catch: java.lang.Exception -> Laf
            r0.a(r13)     // Catch: java.lang.Exception -> Laf
        Lae:
            return
        Laf:
            r13 = move-exception
            if (r14 == 0) goto Lbf
            java.lang.String r13 = r13.getMessage()
            java.lang.String r13 = com.p3263xee53b379.ActivityC28074x3a8f05c8.L6(r1, r13, r3)
            com.unionpay.d r14 = (com.p3263xee53b379.d) r14
            r14.a(r13)
        Lbf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p3263xee53b379.p.a(java.lang.String, com.unionpay.g):void");
    }
}
