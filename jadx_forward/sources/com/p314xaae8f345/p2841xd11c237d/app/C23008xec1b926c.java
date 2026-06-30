package com.p314xaae8f345.p2841xd11c237d.app;

/* renamed from: com.tencent.paymars.app.AppManager */
/* loaded from: classes12.dex */
public class C23008xec1b926c extends com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f40077x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f40076x429972cd = 0;

    /* renamed from: com.tencent.paymars.app.AppManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: getAccountInfo */
        com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.AccountInfo mo84258xd71cb45();

        /* renamed from: getAppFilePath */
        java.lang.String mo84259xda9123cc();

        /* renamed from: getClientConfig */
        java.lang.String mo84260xeff8b163(java.lang.String str, java.lang.String str2);

        /* renamed from: getClientVersion */
        int mo84261xeb61b2d7();

        /* renamed from: getDeviceType */
        com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.DeviceInfo mo84262x1cd0bea6();
    }

    /* renamed from: com.tencent.paymars.app.AppManager$DeviceInfo */
    /* loaded from: classes12.dex */
    public static class DeviceInfo {

        /* renamed from: devicename */
        public java.lang.String f40079x2e9b7de1;

        /* renamed from: devicetype */
        public java.lang.String f40080x2e9e9290;

        public DeviceInfo(java.lang.String str, java.lang.String str2) {
            this.f40079x2e9b7de1 = str;
            this.f40080x2e9e9290 = str2;
        }
    }

    public C23008xec1b926c(long j17) {
        m84247x63556ac0(j17);
    }

    /* renamed from: OnJniCreateAppManagerFromContext */
    public native void m84246x16c3cc17(java.lang.Object obj);

    /* renamed from: OnJniCreateAppManagerFromHandle */
    public native void m84247x63556ac0(long j17);

    /* renamed from: OnJniDestroyAppManager */
    public native void m84248xdb210d60();

    /* renamed from: OnJniSetCallback */
    public native void m84249xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetConfigBooleanValue */
    public native void m84250x7b113507(java.lang.String str, boolean z17);

    /* renamed from: OnJniSetConfigIntValue */
    public native void m84251xe5d46ca0(java.lang.String str, int i17);

    /* renamed from: OnJniSetConfigStringValue */
    public native void m84252x4855a942(java.lang.String str, java.lang.String str2);

    /* renamed from: SetConfigBooleanValue */
    public void m84253x35a2c66d(java.lang.String str, boolean z17) {
        m84250x7b113507(str, z17);
    }

    /* renamed from: SetConfigIntValue */
    public void m84254x502a106(java.lang.String str, int i17) {
        m84251xe5d46ca0(str, i17);
    }

    /* renamed from: SetConfigStringValue */
    public void m84255xca39531c(java.lang.String str, java.lang.String str2) {
        m84252x4855a942(str, str2);
    }

    @Override // com.p314xaae8f345.p2841xd11c237d.app.AbstractC23009x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo84241xdc4f8f95() {
        return this.f40077x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m84256xac79a11b() {
        m84248xdb210d60();
        this.f40077x7b5cfd1f = 0L;
        this.f40076x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m84257x6c4ebec7(com.p314xaae8f345.p2841xd11c237d.app.C23008xec1b926c.CallBack callBack) {
        m84249xf6496dc1(callBack);
    }

    /* renamed from: com.tencent.paymars.app.AppManager$AccountInfo */
    /* loaded from: classes12.dex */
    public static class AccountInfo {
        public long uin;

        /* renamed from: userName */
        public java.lang.String f40078xf01afcf6;

        public AccountInfo() {
            this.uin = 0L;
            this.f40078xf01afcf6 = "";
        }

        public AccountInfo(long j17, java.lang.String str) {
            this.uin = j17;
            this.f40078xf01afcf6 = str;
        }
    }

    public C23008xec1b926c(com.p314xaae8f345.p2841xd11c237d.app.C23011x9befcd8f c23011x9befcd8f) {
        m84246x16c3cc17(c23011x9befcd8f);
    }
}
