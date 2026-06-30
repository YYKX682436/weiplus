package com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366;

/* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative */
/* loaded from: classes7.dex */
public class C22926xf62a1aa2 {

    /* renamed from: INIT_ERROR */
    public static int f39933x769b8df9 = -1002;

    /* renamed from: NEW_WCWSS_ERROR */
    public static int f39934x91fe5f15 = -1000;

    /* renamed from: REPEAT_INIT_ERROR */
    public static int f39935x651b431d = -1001;
    public static java.lang.String TAG = "WcwssNative";

    /* renamed from: mNativeInst */
    private volatile long f39937x95333f4a = 0;

    /* renamed from: mStrNativeInst */
    private volatile java.lang.String f39938x7a13a0a1 = "0";

    /* renamed from: initCallBackFlag */
    private volatile boolean f39936x64b1eea1 = false;

    /* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative$IWcWssReportListener */
    /* loaded from: classes7.dex */
    public interface IWcWssReportListener {
        /* renamed from: getNetworkType */
        int mo83418x662add52();

        /* renamed from: onIdKeyStat */
        void mo83419x94ceb499(int[] iArr, int[] iArr2, int[] iArr3);

        /* renamed from: onKvStat */
        void mo83420x4c31b11e(int i17, java.lang.String str);
    }

    /* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative$IWcWssWebSocketListener */
    /* loaded from: classes7.dex */
    public interface IWcWssWebSocketListener {

        /* renamed from: com.tencent.mm.websocket.libwcwss.WcwssNative$IWcWssWebSocketListener$BindAndDnsReturn */
        /* loaded from: classes7.dex */
        public static class BindAndDnsReturn {

            /* renamed from: hostIpStr */
            public java.lang.String f39939xd40736c2;

            /* renamed from: resultCode */
            public int f39940xdde293aa;
        }

        /* renamed from: bindSocketToCellularAndDnsByCellular */
        com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener.BindAndDnsReturn mo83421x9a3b21a8(int i17, java.lang.String str);

        /* renamed from: doCertificateVerify */
        int mo83422x2f1063a5(java.lang.String str, long j17, java.lang.String str2, byte[][] bArr);

        /* renamed from: onStateChange */
        void mo83423x4799dc42(java.lang.String str, long j17, int i17);
    }

    /* renamed from: destoryBindingWcwss */
    private native void m83402x9841527a(long j17);

    /* renamed from: doOnRunningStateWcwss */
    private native void m83403x53b6b52f(java.lang.String str, long j17);

    /* renamed from: initBindingWcwss */
    private native long m83404xd35b0876(long j17, long j18, long j19);

    /* renamed from: initCallBack */
    private native int m83405x7ccb4d95(long j17, com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener iWcWssWebSocketListener, com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener iWcWssReportListener);

    /* renamed from: initConfigWcwss */
    private native void m83406x9c847979(java.lang.String str, long j17, java.util.HashMap<java.lang.String, java.lang.String> hashMap);

    /* renamed from: initConfigWhiteBlackList */
    private native void m83407xa1ba7426(java.lang.String str, long j17, java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2);

    /* renamed from: testBindingWcwss */
    private native void m83408x2e92b4f8(long j17);

    /* renamed from: updateNativeInterface */
    private native void m83409x3efb1ad9(java.lang.String str, long j17, long j18, int i17);

    /* renamed from: destoryWcwss */
    public void m83410x183b4217() {
        if (this.f39937x95333f4a != -1 && this.f39936x64b1eea1) {
            this.f39936x64b1eea1 = false;
            m83402x9841527a(this.f39937x95333f4a);
            this.f39937x95333f4a = -1L;
        }
    }

    /* renamed from: doOnRunningState */
    public void m83411x7e1292fc() {
        m83403x53b6b52f(this.f39938x7a13a0a1, this.f39937x95333f4a);
    }

    /* renamed from: initConfig */
    public void m83412xf3d9c872(java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        m83406x9c847979(this.f39938x7a13a0a1, this.f39937x95333f4a, hashMap);
    }

    /* renamed from: initConfigWhiteBlack */
    public void m83413x36b64368(java.util.ArrayList<java.lang.String> arrayList, java.util.ArrayList<java.lang.String> arrayList2) {
        m83407xa1ba7426(this.f39938x7a13a0a1, this.f39937x95333f4a, arrayList, arrayList2);
    }

    /* renamed from: initWcwss */
    public java.lang.String m83414xf02c0f9b(long j17, long j18, long j19) {
        this.f39937x95333f4a = m83404xd35b0876(j17, j18, j19);
        this.f39938x7a13a0a1 = java.lang.String.valueOf(this.f39937x95333f4a);
        return this.f39938x7a13a0a1;
    }

    /* renamed from: setCallback */
    public int m83415x6c4ebec7(com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssWebSocketListener iWcWssWebSocketListener, com.p314xaae8f345.mm.p2810xf2511bc7.p2811x3363e366.C22926xf62a1aa2.IWcWssReportListener iWcWssReportListener) {
        if (this.f39937x95333f4a == -1) {
            return f39934x91fe5f15;
        }
        if (this.f39936x64b1eea1) {
            return f39935x651b431d;
        }
        int m83405x7ccb4d95 = m83405x7ccb4d95(this.f39937x95333f4a, iWcWssWebSocketListener, iWcWssReportListener);
        if (m83405x7ccb4d95 != 0) {
            return f39933x769b8df9;
        }
        this.f39936x64b1eea1 = true;
        return m83405x7ccb4d95;
    }

    /* renamed from: testBindWcwss */
    public void m83416xf003a41c(java.lang.String str) {
        m83408x2e92b4f8(java.lang.Long.parseLong(str));
    }

    /* renamed from: updateInterface */
    public void m83417x65d02670(long j17, int i17) {
        m83409x3efb1ad9(this.f39938x7a13a0a1, this.f39937x95333f4a, j17, i17);
    }
}
