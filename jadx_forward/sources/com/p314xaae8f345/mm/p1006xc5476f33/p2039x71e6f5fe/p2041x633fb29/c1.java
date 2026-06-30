package com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29;

/* loaded from: classes4.dex */
public final class c1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f240369d;

    public c1(java.lang.String str) {
        this.f240369d = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        java.lang.String str = this.f240369d;
        if (str.length() > 0) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1 d1Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240376a;
            java.lang.Integer a17 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.a(d1Var, str, "(.*close=[0-9]+)", "close");
            com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
            if (o4Var != null) {
                o4Var.putBoolean("scan_config_disable_scan_product", a17 != null && a17.intValue() > 0);
            }
            java.lang.Integer a18 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.a(d1Var, str, "(time_interval=[0-9]+)", "time_interval");
            if (a18 == null || a18.intValue() < 1000) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var2 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var2 != null) {
                    o4Var2.remove("scan_config_request_time_interval");
                }
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var3 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var3 != null) {
                    o4Var3.putInt("scan_config_request_time_interval", a18.intValue());
                }
            }
            java.lang.Integer a19 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.a(d1Var, str, "(upload_timeout=[0-9]+)", "upload_timeout");
            if (a19 == null || a19.intValue() < 5000) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var4 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var4 != null) {
                    o4Var4.remove("scan_config_upload_timeout");
                }
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var5 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var5 != null) {
                    o4Var5.putInt("scan_config_upload_timeout", a19.intValue());
                }
            }
            java.lang.Integer a27 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.a(d1Var, str, "(retrieval_timeout=[0-9]+)", "retrieval_timeout");
            if (a27 == null || a27.intValue() < 5000) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var6 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var6 != null) {
                    o4Var6.remove("scan_config_retrieval_timeout");
                }
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var7 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var7 != null) {
                    o4Var7.putInt("scan_config_retrieval_timeout", a27.intValue());
                }
            }
            java.lang.Integer a28 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.a(d1Var, str, "(wait_max_frame=[0-9]+)", "wait_max_frame");
            if (a28 != null) {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var8 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var8 != null) {
                    o4Var8.putInt("scan_config_server_detect_frame_count", a28.intValue());
                }
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var9 = com.p314xaae8f345.mm.p1006xc5476f33.p2039x71e6f5fe.p2041x633fb29.d1.f240384i;
                if (o4Var9 != null) {
                    o4Var9.remove("scan_config_server_detect_frame_count");
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ScanFastFocusEngineManager", "updateScanProductServerConfig closeScanProduct: %s, requestInterval: %s, uploadTimeout: %s, retrievalTimeout: %s, serverDetectFrame: %s", a17, a18, a19, a27, a28);
        }
    }
}
