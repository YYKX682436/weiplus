package com.p314xaae8f345.p542x3306d5.p548x6331389;

/* renamed from: com.tencent.mars.mmdns.MMDnsManager */
/* loaded from: classes12.dex */
public class C4576xf14b1004 extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {
    protected static final java.lang.String TAG = "mars.MMDnsManager";

    /* renamed from: nativeHandle */
    protected long f19513x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f19512x429972cd = 0;

    /* renamed from: com.tencent.mars.mmdns.MMDnsManager$IPStackSelection */
    /* loaded from: classes6.dex */
    public interface IPStackSelection {

        /* renamed from: kSelectAll */
        public static final int f19514x2bdc42da = 3;

        /* renamed from: kSelectAuto */
        public static final int f19515x4fac3b96 = 0;

        /* renamed from: kSelectIPv4 */
        public static final int f19516x4faf53ac = 1;

        /* renamed from: kSelectIPv6 */
        public static final int f19517x4faf53ae = 2;
    }

    /* renamed from: com.tencent.mars.mmdns.MMDnsManager$MMDnsRespItem */
    /* loaded from: classes6.dex */
    public static class MMDnsRespItem {

        /* renamed from: host */
        public java.lang.String f19518x30f5a8;

        /* renamed from: ipList */
        public java.util.List<java.lang.String> f19519xb97b4665;

        /* renamed from: retCode */
        public int f19520x4162a22e;
    }

    public C4576xf14b1004(long j17) {
        m40291x797a1d8(j17);
    }

    /* renamed from: OnJniCreateMMDnsManagerFromContext */
    public native void m40290xfac877ff(java.lang.Object obj);

    /* renamed from: OnJniCreateMMDnsManagerFromHandle */
    public native void m40291x797a1d8(long j17);

    /* renamed from: OnJniDestroyMMDnsManager */
    public native void m40292x34dd9df8();

    /* renamed from: OnJniGetHost */
    public native java.util.ArrayList<java.lang.String> m40293xa6cd9a18(java.lang.String str);

    /* renamed from: OnJniGetHostWithParam */
    public native java.util.ArrayList<java.lang.String> m40294x71bf642f(java.lang.String str, int i17, boolean z17, int i18);

    /* renamed from: OnJniGetSimpleDnsIP */
    public native java.util.ArrayList<com.p314xaae8f345.p542x3306d5.p548x6331389.C4576xf14b1004.MMDnsRespItem> m40295x4f15830e(java.util.ArrayList<java.lang.String> arrayList, int i17, int i18);

    /* renamed from: OnJniSetDebugIp */
    public native void m40296x9df969de(java.lang.String str, int i17);

    /* renamed from: OnJniSetForceUserIPv6 */
    public native void m40297x1fc00c41(boolean z17);

    /* renamed from: OnJniSyncGetMMDns */
    public native boolean m40298x50e299d4(java.lang.String str);

    /* renamed from: getHost */
    public java.util.ArrayList<java.lang.String> m40299xfb805e1e(java.lang.String str) {
        return m40293xa6cd9a18(str);
    }

    /* renamed from: getHostWithParam */
    public java.util.ArrayList<java.lang.String> m40300x39a1c6e9(java.lang.String str, int i17, boolean z17, int i18) {
        return m40294x71bf642f(str, i17, z17, i18);
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f19513x7b5cfd1f;
    }

    /* renamed from: getSimpleDnsIP */
    public java.util.ArrayList<com.p314xaae8f345.p542x3306d5.p548x6331389.C4576xf14b1004.MMDnsRespItem> m40301x83c54c48(java.util.ArrayList<java.lang.String> arrayList, int i17, int i18) {
        return m40295x4f15830e(arrayList, i17, i18);
    }

    /* renamed from: onDestroy */
    public void m40302xac79a11b() {
        m40292x34dd9df8();
        this.f19513x7b5cfd1f = 0L;
        this.f19512x429972cd = 0L;
    }

    /* renamed from: setDebugIp */
    public void m40303xd22e018(java.lang.String str, int i17) {
        m40296x9df969de(str, i17);
    }

    /* renamed from: setForceUserIPv6 */
    public void m40304xe7a26efb(boolean z17) {
        m40297x1fc00c41(z17);
    }

    /* renamed from: syncGetMMDns */
    public boolean m40305x9b87698e(java.lang.String str) {
        return m40298x50e299d4(str);
    }

    public C4576xf14b1004(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m40290xfac877ff(c4443x9befcd8f);
    }
}
