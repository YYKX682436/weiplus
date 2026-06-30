package com.p314xaae8f345.p2841xd11c237d.p2843x6331389;

/* renamed from: com.tencent.paymars.mmdns.MMDnsManager */
/* loaded from: classes12.dex */
public class C23025xf14b1004 extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {
    protected static final java.lang.String TAG = "mars.MMDnsManager";

    /* renamed from: nativeHandle */
    protected long f40217x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40216x429972cd = 0;

    /* renamed from: com.tencent.paymars.mmdns.MMDnsManager$IPStackSelection */
    /* loaded from: classes6.dex */
    public interface IPStackSelection {

        /* renamed from: kSelectAll */
        public static final int f40218x2bdc42da = 3;

        /* renamed from: kSelectAuto */
        public static final int f40219x4fac3b96 = 0;

        /* renamed from: kSelectIPv4 */
        public static final int f40220x4faf53ac = 1;

        /* renamed from: kSelectIPv6 */
        public static final int f40221x4faf53ae = 2;
    }

    /* renamed from: com.tencent.paymars.mmdns.MMDnsManager$MMDnsRespItem */
    /* loaded from: classes6.dex */
    public static class MMDnsRespItem {

        /* renamed from: host */
        public java.lang.String f40222x30f5a8;

        /* renamed from: ipList */
        public java.util.List<java.lang.String> f40223xb97b4665;

        /* renamed from: retCode */
        public int f40224x4162a22e;
    }

    public C23025xf14b1004(long j17) {
        m84431x797a1d8(j17);
    }

    /* renamed from: OnJniCreateMMDnsManagerFromContext */
    public native void m84430xfac877ff(java.lang.Object obj);

    /* renamed from: OnJniCreateMMDnsManagerFromHandle */
    public native void m84431x797a1d8(long j17);

    /* renamed from: OnJniDestroyMMDnsManager */
    public native void m84432x34dd9df8();

    /* renamed from: OnJniGetHost */
    public native java.util.ArrayList<java.lang.String> m84433xa6cd9a18(java.lang.String str);

    /* renamed from: OnJniGetHostWithParam */
    public native java.util.ArrayList<java.lang.String> m84434x71bf642f(java.lang.String str, int i17, boolean z17, int i18);

    /* renamed from: OnJniGetSimpleDnsIP */
    public native java.util.ArrayList<com.p314xaae8f345.p2841xd11c237d.p2843x6331389.C23025xf14b1004.MMDnsRespItem> m84435x4f15830e(java.util.ArrayList<java.lang.String> arrayList, int i17, int i18);

    /* renamed from: OnJniSetDebugIp */
    public native void m84436x9df969de(java.lang.String str, int i17);

    /* renamed from: OnJniSetForceUserIPv6 */
    public native void m84437x1fc00c41(boolean z17);

    /* renamed from: OnJniSyncGetMMDns */
    public native boolean m84438x50e299d4(java.lang.String str);

    /* renamed from: getHost */
    public java.util.ArrayList<java.lang.String> m84439xfb805e1e(java.lang.String str) {
        return m84433xa6cd9a18(str);
    }

    /* renamed from: getHostWithParam */
    public java.util.ArrayList<java.lang.String> m84440x39a1c6e9(java.lang.String str, int i17, boolean z17, int i18) {
        return m84434x71bf642f(str, i17, z17, i18);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40217x7b5cfd1f;
    }

    /* renamed from: getSimpleDnsIP */
    public java.util.ArrayList<com.p314xaae8f345.p2841xd11c237d.p2843x6331389.C23025xf14b1004.MMDnsRespItem> m84441x83c54c48(java.util.ArrayList<java.lang.String> arrayList, int i17, int i18) {
        return m84435x4f15830e(arrayList, i17, i18);
    }

    /* renamed from: onDestroy */
    public void m84442xac79a11b() {
        m84432x34dd9df8();
        this.f40217x7b5cfd1f = 0L;
        this.f40216x429972cd = 0L;
    }

    /* renamed from: setDebugIp */
    public void m84443xd22e018(java.lang.String str, int i17) {
        m84436x9df969de(str, i17);
    }

    /* renamed from: setForceUserIPv6 */
    public void m84444xe7a26efb(boolean z17) {
        m84437x1fc00c41(z17);
    }

    /* renamed from: syncGetMMDns */
    public boolean m84445x9b87698e(java.lang.String str) {
        return m84438x50e299d4(str);
    }

    public C23025xf14b1004(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84430xfac877ff(c23011x9befcd8f);
    }
}
