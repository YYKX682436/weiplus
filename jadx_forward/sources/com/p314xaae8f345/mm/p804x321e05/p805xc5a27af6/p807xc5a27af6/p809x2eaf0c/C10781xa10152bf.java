package com.p314xaae8f345.mm.p804x321e05.p805xc5a27af6.p807xc5a27af6.p809x2eaf0c;

/* renamed from: com.tencent.mm.kara.feature.feature.comm.DeviceFeatureGroup */
/* loaded from: classes13.dex */
public class C10781xa10152bf extends pl0.e {

    /* renamed from: audioPort */
    @fl0.a
    public int[] f29297xb35cd77;

    /* renamed from: batteryLevel */
    @fl0.a
    public float f29298x9a28bd77;

    /* renamed from: batteryState */
    @fl0.a
    public int[] f29299x9a91e684;

    /* renamed from: capacityOfDeviceStorageInMB */
    @fl0.a
    public float f29300xc8d6a2e;

    /* renamed from: dayOfTheWeek */
    @fl0.a
    public int[] f29301x1a54b9f2;

    /* renamed from: downloadSpeedInMBPerSeconds */
    @fl0.a
    public float f29302xf0407a3b;

    /* renamed from: freeSpaceOfDeviceStorageInMB */
    @fl0.a
    public float f29303x8e5c68ee;

    /* renamed from: hourOfTheDay */
    @fl0.a
    public int[] f29304x12d6dc26;

    /* renamed from: lowPowerMode */
    @fl0.a
    public int f29305x60e2754;

    /* renamed from: network */
    @fl0.a
    public int[] f29306x6de15a2e;

    /* renamed from: outputVolumn */
    @fl0.a
    public float f29307xfd106784;

    /* renamed from: proportionOfChatHistories */
    @fl0.a
    public float f29308xa75cf329;

    /* renamed from: proportionOfFreeSpace */
    @fl0.a
    public float f29309xfb9c60e9;

    /* renamed from: proportionOfWeChatData */
    @fl0.a
    public float f29310x14305b01;

    /* renamed from: screenBrightness */
    @fl0.a
    public float f29311x63a531dd;

    /* renamed from: sizeOfChatHistoriesInMB */
    @fl0.a
    public float f29312x94d9917c;

    /* renamed from: sizeOfWeChatDataInMB */
    @fl0.a
    public float f29313xdc55f582;

    /* renamed from: thermalState */
    @fl0.a
    public int[] f29314x640a633a;

    @Override // pl0.e, fl0.b
    /* renamed from: build */
    public void mo46315x59bc66e() {
        super.mo46315x59bc66e();
        int i17 = sl0.f.f490640e;
        this.f29298x9a28bd77 = ph.t.k().c().b();
        int[] iArr = new int[3];
        ph.c c17 = ph.t.k().c();
        if (c17.b() == 100) {
            iArr[0] = 1;
        } else if (c17.d()) {
            iArr[1] = 1;
        } else {
            iArr[2] = 1;
        }
        this.f29299x9a91e684 = iArr;
        int m40117xee32071e = com.p314xaae8f345.p542x3306d5.p546x2eaf0c.C4556x13096e3f.C2Java.m40117xee32071e();
        int[] iArr2 = new int[6];
        if (m40117xee32071e == -1) {
            iArr2[0] = 1;
        } else if (m40117xee32071e == 1) {
            iArr2[1] = 1;
        } else if (m40117xee32071e == 7) {
            iArr2[5] = 1;
        } else if (m40117xee32071e == 3) {
            iArr2[2] = 1;
        } else if (m40117xee32071e == 4) {
            iArr2[3] = 1;
        } else if (m40117xee32071e == 5) {
            iArr2[4] = 1;
        }
        this.f29306x6de15a2e = iArr2;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar = java.util.Calendar.getInstance();
        calendar.setTime(new java.util.Date(currentTimeMillis));
        int[] iArr3 = new int[7];
        iArr3[calendar.get(7) - 1] = 1;
        this.f29301x1a54b9f2 = iArr3;
        long currentTimeMillis2 = java.lang.System.currentTimeMillis();
        java.util.Calendar calendar2 = java.util.Calendar.getInstance();
        calendar2.setTime(new java.util.Date(currentTimeMillis2));
        int[] iArr4 = new int[24];
        iArr4[calendar2.get(11)] = 1;
        this.f29304x12d6dc26 = iArr4;
        ph.t.k().c().f();
        this.f29305x60e2754 = 0;
        android.media.AudioManager audioManager = (android.media.AudioManager) com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSystemService("audio");
        this.f29307xfd106784 = audioManager.getStreamVolume(1) / audioManager.getStreamMaxVolume(1);
        this.f29311x63a531dd = android.provider.Settings.System.getInt(com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getContentResolver(), "screen_brightness", 0);
    }

    @Override // fl0.b
    /* renamed from: getName */
    public java.lang.String mo46314xfb82e301() {
        return com.p314xaae8f345.p3006xb8ff1437.p3069xbd917455.p3070xe3a677a0.p3071xc84c5534.C26529xf7ae38e4.Common.f54472x96df1280;
    }
}
