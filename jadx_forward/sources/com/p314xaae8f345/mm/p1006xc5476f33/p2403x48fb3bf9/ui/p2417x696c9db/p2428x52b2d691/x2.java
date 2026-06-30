package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691;

/* loaded from: classes.dex */
public final class x2 extends qw4.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x2 f268183d = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x2();

    /* JADX WARN: Can't wrap try/catch for region: R(15:25|(4:155|156|(1:158)(1:164)|(1:162))(1:29)|(4:30|31|(1:152)(1:35)|36)|(3:37|38|(1:148)(30:42|43|44|45|46|47|48|49|50|51|52|53|54|55|56|57|58|59|(1:61)|(3:63|(1:69)(1:67)|68)|70|(1:72)|73|(1:75)|76|(1:78)|79|(1:81)|82|(1:84)))|(3:86|87|(1:89)(1:129))|(9:91|92|93|94|(1:96)(1:124)|97|98|(1:100)(2:116|(1:118)(2:(1:120)(1:122)|121))|(2:102|103)(2:104|(2:106|(2:108|(2:110|111)(2:112|113))(1:114))(1:115)))|128|92|93|94|(0)(0)|97|98|(0)(0)|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0301, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x0302, code lost:
    
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiRequestScanPOSPay", r0, "getRawUrl", new java.lang.Object[0]);
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x03ae  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0363  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x02d3 A[Catch: all -> 0x02e6, TryCatch #5 {all -> 0x02e6, blocks: (B:87:0x02cd, B:89:0x02d3, B:91:0x02df), top: B:86:0x02cd }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02df A[Catch: all -> 0x02e6, TRY_LEAVE, TryCatch #5 {all -> 0x02e6, blocks: (B:87:0x02cd, B:89:0x02d3, B:91:0x02df), top: B:86:0x02cd }] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02f8 A[Catch: all -> 0x0301, TryCatch #1 {all -> 0x0301, blocks: (B:94:0x02f2, B:96:0x02f8, B:97:0x02fe), top: B:93:0x02f2 }] */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    @Override // nw4.q2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean a(nw4.k r23, nw4.y2 r24) {
        /*
            Method dump skipped, instructions count: 1100
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.ui.p2417x696c9db.p2428x52b2d691.x2.a(nw4.k, nw4.y2):boolean");
    }

    @Override // nw4.q2
    public int b() {
        return 485;
    }

    @Override // nw4.q2
    public java.lang.String c() {
        return com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.d2.f34611x24728b;
    }

    public final void e(nw4.k env, nw4.y2 msg, int i17, int i18, android.content.Intent intent) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(env, "env");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(msg, "msg");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestScanPOSPay", "mmActivityResult requestCode: %d, resultCode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        if (!com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.D0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.pay.d2.f34611x24728b, msg.f422552i)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestScanPOSPay", "request pay, wrong function");
            return;
        }
        nw4.g gVar = env.f422396d;
        if (i18 == -1) {
            java.util.HashMap hashMap = new java.util.HashMap();
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.z3 z3Var = com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2412x633fb29.h4.f264447i;
            if (intent == null) {
                z3Var.a(hy4.a0.f367610m);
                gVar.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
                return;
            }
            int intExtra = intent.getIntExtra("key_is_clear_failure", -1);
            if (intExtra == 0) {
                hashMap.put("pay_status", "pending");
            } else if (intExtra == 1) {
                hashMap.put("pay_status", "fail");
            }
            z3Var.a(hy4.a0.f367610m);
            gVar.e(msg.f422546c, msg.f422552i + ":ok", hashMap);
            int intExtra2 = intent.getIntExtra("key_jsapi_close_page_after_pay", 0);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.JsApiRequestScanPOSPay", "closePage: %s", java.lang.Integer.valueOf(intExtra2));
            if (intExtra2 == 1) {
                try {
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b17 = env.b();
                    if (b17 != null) {
                        b17.ec();
                    }
                    com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0 b18 = env.b();
                    if (b18 != null) {
                        b18.b(null);
                        return;
                    }
                    return;
                } catch (java.lang.Exception e17) {
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.JsApiRequestScanPOSPay", e17, "", new java.lang.Object[0]);
                    return;
                }
            }
            return;
        }
        if (i18 != 5) {
            java.util.HashMap hashMap2 = new java.util.HashMap();
            if (intent != null) {
                int intExtra3 = intent.getIntExtra("key_is_clear_failure", -1);
                if (intExtra3 == 0) {
                    hashMap2.put("pay_status", "pending");
                } else if (intExtra3 == 1) {
                    hashMap2.put("pay_status", "fail");
                }
                java.lang.String stringExtra = intent.getStringExtra("key_pay_fail_reason");
                if (stringExtra != null) {
                    java.lang.String str = stringExtra.length() > 0 ? stringExtra : null;
                    if (str != null) {
                        hashMap2.put("fail_reason", str);
                    }
                }
            }
            gVar.e(msg.f422546c, msg.f422552i + ":cancel", hashMap2);
            return;
        }
        java.util.HashMap hashMap3 = new java.util.HashMap();
        if (intent != null) {
            int intExtra4 = intent.getIntExtra("key_jsapi_pay_err_code", 0);
            java.lang.String stringExtra2 = intent.getStringExtra("key_jsapi_pay_err_msg");
            java.lang.String str2 = stringExtra2 != null ? stringExtra2 : "";
            hashMap3.put("err_code", java.lang.Integer.valueOf(intExtra4));
            hashMap3.put("err_desc", str2);
            java.lang.String stringExtra3 = intent.getStringExtra("key_pay_fail_reason");
            if (stringExtra3 != null) {
                java.lang.String str3 = stringExtra3.length() > 0 ? stringExtra3 : null;
                if (str3 != null) {
                    hashMap3.put("fail_reason", str3);
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.JsApiRequestScanPOSPay", "hy: pay jsapi failed. errCode: %d, errMsg: %s", java.lang.Integer.valueOf(intExtra4), str2);
        }
        gVar.e(msg.f422546c, msg.f422552i + ":fail", hashMap3);
    }
}
