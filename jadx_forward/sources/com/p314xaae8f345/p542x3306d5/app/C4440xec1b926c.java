package com.p314xaae8f345.p542x3306d5.app;

/* renamed from: com.tencent.mars.app.AppManager */
/* loaded from: classes12.dex */
public class C4440xec1b926c extends com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c {

    /* renamed from: nativeHandle */
    protected long f17596x7b5cfd1f = 0;

    /* renamed from: callbackHandle */
    protected long f17595x429972cd = 0;

    /* renamed from: com.tencent.mars.app.AppManager$CallBack */
    /* loaded from: classes12.dex */
    public interface CallBack {
        /* renamed from: getAccountInfo */
        com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.AccountInfo mo652xd71cb45();

        /* renamed from: getAppFilePath */
        java.lang.String mo653xda9123cc();

        /* renamed from: getClientConfig */
        java.lang.String mo654xeff8b163(java.lang.String str, java.lang.String str2);

        /* renamed from: getClientConfigID */
        long mo655xd491edbe(java.lang.String str);

        /* renamed from: getClientVersion */
        int mo656xeb61b2d7();

        /* renamed from: getDeviceType */
        com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.DeviceInfo mo657x1cd0bea6();
    }

    /* renamed from: com.tencent.mars.app.AppManager$DeviceInfo */
    /* loaded from: classes12.dex */
    public static class DeviceInfo {

        /* renamed from: devicename */
        public java.lang.String f17598x2e9b7de1;

        /* renamed from: devicetype */
        public java.lang.String f17599x2e9e9290;

        public DeviceInfo(java.lang.String str, java.lang.String str2) {
            this.f17598x2e9b7de1 = str;
            this.f17599x2e9e9290 = str2;
        }
    }

    public C4440xec1b926c(long j17) {
        m37595x63556ac0(j17);
    }

    /* renamed from: OnJniCreateAppManagerFromContext */
    public native void m37594x16c3cc17(java.lang.Object obj);

    /* renamed from: OnJniCreateAppManagerFromHandle */
    public native void m37595x63556ac0(long j17);

    /* renamed from: OnJniDestroyAppManager */
    public native void m37596xdb210d60();

    /* renamed from: OnJniSetCallback */
    public native void m37597xf6496dc1(java.lang.Object obj);

    /* renamed from: OnJniSetConfigBooleanValue */
    public native void m37598x7b113507(java.lang.String str, boolean z17);

    /* renamed from: OnJniSetConfigIntValue */
    public native void m37599xe5d46ca0(java.lang.String str, int i17);

    /* renamed from: OnJniSetConfigStringValue */
    public native void m37600x4855a942(java.lang.String str, java.lang.String str2);

    /* renamed from: SetConfigBooleanValue */
    public void m37601x35a2c66d(java.lang.String str, boolean z17) {
        m37598x7b113507(str, z17);
    }

    /* renamed from: SetConfigIntValue */
    public void m37602x502a106(java.lang.String str, int i17) {
        m37599xe5d46ca0(str, i17);
    }

    /* renamed from: SetConfigStringValue */
    public void m37603xca39531c(java.lang.String str, java.lang.String str2) {
        m37600x4855a942(str, str2);
    }

    @Override // com.p314xaae8f345.p542x3306d5.app.AbstractC4441x1e602b7c
    /* renamed from: getNativeHandle */
    public long mo37556xdc4f8f95() {
        return this.f17596x7b5cfd1f;
    }

    /* renamed from: onDestroy */
    public void m37604xac79a11b() {
        m37596xdb210d60();
        this.f17596x7b5cfd1f = 0L;
        this.f17595x429972cd = 0L;
    }

    /* renamed from: setCallback */
    public void m37605x6c4ebec7(com.p314xaae8f345.p542x3306d5.app.C4440xec1b926c.CallBack callBack) {
        m37597xf6496dc1(callBack);
    }

    /* renamed from: com.tencent.mars.app.AppManager$AccountInfo */
    /* loaded from: classes12.dex */
    public static class AccountInfo {
        public long uin;

        /* renamed from: userName */
        public java.lang.String f17597xf01afcf6;

        public AccountInfo() {
            this.uin = 0L;
            this.f17597xf01afcf6 = "";
        }

        public AccountInfo(long j17, java.lang.String str) {
            this.uin = j17;
            this.f17597xf01afcf6 = str;
        }
    }

    public C4440xec1b926c(com.p314xaae8f345.p542x3306d5.app.C4443x9befcd8f c4443x9befcd8f) {
        m37594x16c3cc17(c4443x9befcd8f);
    }
}
