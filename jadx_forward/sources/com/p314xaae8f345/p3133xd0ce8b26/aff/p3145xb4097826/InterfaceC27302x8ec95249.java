package com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826;

/* renamed from: com.tencent.wechat.aff.finder.AffFinderProviderBase */
/* loaded from: classes16.dex */
public interface InterfaceC27302x8ec95249 {

    /* renamed from: com.tencent.wechat.aff.finder.AffFinderProviderBase$Callback */
    /* loaded from: classes8.dex */
    public interface Callback {
        /* renamed from: onfinderRedDotDataChangedActionComplete */
        void mo112734xc7be743c(long j17);

        /* renamed from: onfinderRedDotHasAddActionComplete */
        void mo112735x5f832d3(long j17);

        /* renamed from: onfinderRedDotHasDisposeActionComplete */
        void mo112736xadd89251(long j17);
    }

    /* renamed from: curContextID */
    java.lang.String mo58971x2e1fb4aa();

    /* renamed from: curTabSessionID */
    java.lang.String mo58972x414bcc7c();

    /* renamed from: finderGetCGIBaseRequest */
    bw5.sc mo58973x6c32229(int i17, int i18);

    /* renamed from: finderGetCurrentUsername */
    java.lang.String mo58974x5186a9ff();

    /* renamed from: finderRedDotDataChangedActionAsync */
    void mo58975x35e7803a(long j17, int i17, int i18, bw5.e0 e0Var, bw5.e0 e0Var2, java.lang.String str);

    /* renamed from: finderRedDotDataChangedWithPathKey */
    void mo58976xd81f2aa8(java.lang.String str);

    /* renamed from: finderRedDotDataReceiveRedDotBindObjectPathKey */
    void mo58977x6ae0e1ab(java.lang.String str);

    /* renamed from: finderRedDotDataReceiveWithPathKey */
    void mo58978xa73b7719(java.lang.String str, boolean z17);

    /* renamed from: finderRedDotDataRevokedWithPathKey */
    void mo58979xccf7947e(java.lang.String str);

    /* renamed from: finderRedDotEnableUseCtrlInfoInNMStrategy */
    boolean mo58980xc0dba96(java.lang.String str, boolean z17, bw5.e0 e0Var);

    /* renamed from: finderRedDotHasAddActionAsync */
    void mo58981x491064a1(long j17, bw5.e0 e0Var);

    /* renamed from: finderRedDotHasDisposeActionAsync */
    void mo58982x14018e63(long j17, java.lang.String str, bw5.e0 e0Var);

    /* renamed from: finderRedDotWillAddAction */
    boolean mo58983x2b6b6867(bw5.e0 e0Var);

    /* renamed from: finderRedDotWillDisposeAction */
    boolean mo58984x2adde765(java.lang.String str);

    /* renamed from: getCacheLocation */
    bw5.tj mo58985xaacbcda1();

    /* renamed from: getContact */
    java.util.ArrayList<bw5.ae> mo58986x76845fea(java.lang.String str);

    /* renamed from: getCurFinderUnreadCountByUsername */
    int mo58987xc0b7531d(java.lang.String str, boolean z17, int i17, int i18);

    /* renamed from: getFeedSessionBuffer */
    java.lang.String mo58988x2dd09cc2(java.lang.String str, bw5.os0 os0Var, java.lang.String str2);

    /* renamed from: getLocalFinderObject */
    java.util.ArrayList<bw5.yr> mo58989x42b4c55a(java.util.ArrayList<java.lang.String> arrayList);

    /* renamed from: getPrivateMsgTotalUnreadCountByUsername */
    int mo58990x2333d23d(java.lang.String str);

    /* renamed from: isRedDotMeetWithCondition */
    boolean mo58991x328b4d4c(java.lang.String str, bw5.e0 e0Var);

    /* renamed from: reddotPersonalExposeClearSwitch */
    boolean mo58992x726db2e5();

    /* renamed from: reddotWillRevokeTipsUuidArray */
    void mo58993xea0c3ab6(java.util.ArrayList<java.lang.String> arrayList);

    /* renamed from: saveFinderObject */
    void mo58994xbc039522(java.util.ArrayList<bw5.yr> arrayList, bw5.os0 os0Var, java.lang.String str);

    /* renamed from: setCallback */
    void mo58995x6c4ebec7(com.p314xaae8f345.p3133xd0ce8b26.aff.p3145xb4097826.InterfaceC27302x8ec95249.Callback callback);
}
