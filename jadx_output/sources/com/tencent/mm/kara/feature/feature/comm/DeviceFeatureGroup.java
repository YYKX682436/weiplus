package com.tencent.mm.kara.feature.feature.comm;

/* loaded from: classes13.dex */
public class DeviceFeatureGroup extends pl0.e {

    @fl0.a
    public int[] audioPort;

    @fl0.a
    public float batteryLevel;

    @fl0.a
    public int[] batteryState;

    @fl0.a
    public float capacityOfDeviceStorageInMB;

    @fl0.a
    public int[] dayOfTheWeek;

    @fl0.a
    public float downloadSpeedInMBPerSeconds;

    @fl0.a
    public float freeSpaceOfDeviceStorageInMB;

    @fl0.a
    public int[] hourOfTheDay;

    @fl0.a
    public int lowPowerMode;

    @fl0.a
    public int[] network;

    @fl0.a
    public float outputVolumn;

    @fl0.a
    public float proportionOfChatHistories;

    @fl0.a
    public float proportionOfFreeSpace;

    @fl0.a
    public float proportionOfWeChatData;

    @fl0.a
    public float screenBrightness;

    @fl0.a
    public float sizeOfChatHistoriesInMB;

    @fl0.a
    public float sizeOfWeChatDataInMB;

    @fl0.a
    public int[] thermalState;

    @Override // pl0.e, fl0.b
    public void build() {
        super.build();
        int i17 = sl0.f.f409107e;
        this.batteryLevel = ph.t.k().c().b();
        int[] iArr = new int[3];
        ph.c c17 = ph.t.k().c();
        if (c17.b() == 100) {
            iArr[0] = 1;
        } else if (c17.d()) {
            iArr[1] = 1;
        } else {
            iArr[2] = 1;
        }
        this.batteryState = iArr;
        int statisticsNetType = com.tencent.mars.comm.PlatformComm.C2Java.getStatisticsNetType();
        int[] iArr2 = new int[6];
        if (statisticsNetType == -1) {
            iArr2[0] = 1;
        } else if (statisticsNetType == 1) {
            iArr2[1] = 1;
        } else if (statisticsNetType == 7) {
            iArr2[5] = 1;
        } else if (statisticsNetType == 3) {
            iArr2[2] = 1;
        } else if (statisticsNetType == 4) {
            iArr2[3] = 1;
        } else if (statisticsNetType == 5) {
            iArr2[4] = 1;
        }
        this.network = iArr2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int[] iArr3 = new int[7];
        iArr3[calendar.get(7) - 1] = 1;
        this.dayOfTheWeek = iArr3;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(new java.util.Date(currentTimeMillis2));
        int[] iArr4 = new int[24];
        iArr4[calendar2.get(11)] = 1;
        this.hourOfTheDay = iArr4;
        ph.t.k().c().f();
        this.lowPowerMode = 0;
        android.media.AudioManager audioManager = (android.media.AudioManager) com.tencent.mm.sdk.platformtools.x2.f193071a.getSystemService("audio");
        this.outputVolumn = audioManager.getStreamVolume(1) / audioManager.getStreamMaxVolume(1);
        this.screenBrightness = android.provider.Settings.System.getInt(com.tencent.mm.sdk.platformtools.x2.f193071a.getContentResolver(), "screen_brightness", 0);
    }

    @Override // fl0.b
    public java.lang.String getName() {
        return com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_DEVICE_NAME;
    }
}
