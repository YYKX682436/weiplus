package com.p314xaae8f345.p592x631407a.p601x2eefaa;

/* renamed from: com.tencent.midas.data.APPluginDataInterface */
/* loaded from: classes13.dex */
public class C4785x31cb038d {

    /* renamed from: LAUNCHPAY_INTERVAL_TIME */
    public static final java.lang.String f20551xfe85bf3d = "launchpayintervaltime";

    /* renamed from: LAUNCHPAY_TIME */
    public static final java.lang.String f20552xad5318d7 = "launchpaytime";

    /* renamed from: LAUNCHPAY_UUID */
    public static final java.lang.String f20553xad53b9c5 = "launchpayuuid";

    /* renamed from: SHARE_PREFERENCE_NAME */
    public static final java.lang.String f20554x1a22ef = "TencentUnipay";

    /* renamed from: gInstance */
    private static volatile com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d f20555xcc79a21c = new com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d();

    /* renamed from: h5Message */
    private java.lang.String f20564x598efa7a = "";

    /* renamed from: offerId */
    private java.lang.String f20573xa3aefc97 = "";

    /* renamed from: openId */
    private java.lang.String f20574xc3c3c505 = "";

    /* renamed from: openKey */
    private java.lang.String f20575xb4b4e3b5 = "";

    /* renamed from: sessionId */
    private java.lang.String f20592x243a3e51 = "";

    /* renamed from: sessionType */
    private java.lang.String f20593xfea94af0 = "";

    /* renamed from: zoneId */
    private java.lang.String f20596xd67ef1e7 = "";

    /* renamed from: pf, reason: collision with root package name */
    private java.lang.String f134675pf = "";

    /* renamed from: pfKey */
    private java.lang.String f20577x659cc89 = "";

    /* renamed from: saveValue */
    private java.lang.String f20588xa7245f4 = "";

    /* renamed from: isCanChange */
    private boolean f20566x2c2fa596 = true;

    /* renamed from: resId */
    private int f20584x67619db = 0;

    /* renamed from: resData */
    private byte[] f20583x4154cc6a = null;

    /* renamed from: acctType */
    private java.lang.String f20556x80d559ed = "";

    /* renamed from: reserv */
    private java.lang.String f20586xc84d8cc9 = "";

    /* renamed from: mallType */
    private int f20572x481df6e = 0;

    /* renamed from: h5Url */
    private java.lang.String f20565x5d2f162 = "";

    /* renamed from: logEnable */
    private boolean f20571x5c1d31e7 = true;

    /* renamed from: isNumVisible */
    private boolean f20567xf62af6d6 = true;

    /* renamed from: propUnit */
    private java.lang.String f20580xc4c68787 = "";

    /* renamed from: unit */
    private java.lang.String f20595x36d984 = "";

    /* renamed from: isShowNum */
    private boolean f20569x58a962bf = true;

    /* renamed from: isShowListOtherNum */
    private boolean f20568x523b89fb = true;

    /* renamed from: payChannel */
    private java.lang.String f20576xb6c1d73b = "";

    /* renamed from: discountType */
    private java.lang.String f20558x20c1f01b = "";

    /* renamed from: discountUrl */
    private java.lang.String f20559xe006446e = "";

    /* renamed from: drmInfo */
    private java.lang.String f20561x729a76ed = "";

    /* renamed from: discoutId */
    private java.lang.String f20560xf8c64494 = "";

    /* renamed from: extras */
    private java.lang.String f20562xb32aee63 = "";

    /* renamed from: goodsTokenUrl */
    private java.lang.String f20563xa5656a2c = "";

    /* renamed from: tokenType */
    private int f20594x86f18d3 = 0;

    /* renamed from: prodcutId */
    private java.lang.String f20579xc058de06 = "";

    /* renamed from: autoPay */
    private boolean f20557xd979c879 = true;

    /* renamed from: remark */
    private java.lang.String f20581xc84ac380 = "";

    /* renamed from: serviceCode */
    private java.lang.String f20589x8d078642 = "";

    /* renamed from: serviceName */
    private java.lang.String f20590x8d0c52e0 = "";

    /* renamed from: serviceType */
    private int f20591x8d0f678f = 0;

    /* renamed from: resUrl */
    private java.lang.String f20585xc84d50af = "";

    /* renamed from: reqType */
    private java.lang.String f20582x41403cf8 = "";

    /* renamed from: saveType */
    private int f20587x8476be57 = 0;

    /* renamed from: launchInterface */
    private java.lang.String f20570x357fe2c6 = com.p314xaae8f345.p592x631407a.p601x2eefaa.C4783xfba32e6c.f20540x4c0395c3;

    /* renamed from: processData */
    private com.p314xaae8f345.p592x631407a.p601x2eefaa.C4784xfc88460f f20578xc0ab2b9 = null;

    private C4785x31cb038d() {
    }

    /* renamed from: init */
    public static void m41838x316510() {
        f20555xcc79a21c = new com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d();
    }

    /* renamed from: singleton */
    public static com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d m41839xa6eb780b() {
        if (f20555xcc79a21c == null) {
            synchronized (com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d.class) {
                if (f20555xcc79a21c == null) {
                    f20555xcc79a21c = new com.p314xaae8f345.p592x631407a.p601x2eefaa.C4785x31cb038d();
                }
            }
        }
        return f20555xcc79a21c;
    }

    /* renamed from: getAcctType */
    public java.lang.String m41840xfcaf9763() {
        return this.f20556x80d559ed;
    }

    /* renamed from: getDiscountType */
    public java.lang.String m41841x81b48291() {
        return this.f20558x20c1f01b;
    }

    /* renamed from: getDiscountUrl */
    public java.lang.String m41842xb9dc8b38() {
        return this.f20559xe006446e;
    }

    /* renamed from: getDiscoutId */
    public java.lang.String m41843xf833b5de() {
        return this.f20560xf8c64494;
    }

    /* renamed from: getDrmInfo */
    public java.lang.String m41844xb067b2b7() {
        return this.f20561x729a76ed;
    }

    /* renamed from: getExtras */
    public java.lang.String m41845x18421159() {
        return this.f20562xb32aee63;
    }

    /* renamed from: getGoodsTokenUrl */
    public java.lang.String m41846x62c52676() {
        return this.f20563xa5656a2c;
    }

    /* renamed from: getH5Message */
    public java.lang.String m41847x58fc6bc4() {
        return this.f20564x598efa7a;
    }

    /* renamed from: getH5Url */
    public java.lang.String m41848x747097ac() {
        return this.f20565x5d2f162;
    }

    /* renamed from: getLaunchInterface */
    public java.lang.String m41849x19e1b490() {
        return this.f20570x357fe2c6;
    }

    /* renamed from: getMallType */
    public int m41850x805c1ce4() {
        return this.f20572x481df6e;
    }

    /* renamed from: getOfferId */
    public java.lang.String m41851xe17c3861() {
        return this.f20573xa3aefc97;
    }

    /* renamed from: getOpenId */
    public java.lang.String m41852x28dae7fb() {
        return this.f20574xc3c3c505;
    }

    /* renamed from: getOpenKey */
    public java.lang.String m41853xf2821f7f() {
        return this.f20575xb4b4e3b5;
    }

    /* renamed from: getPayChannel */
    public java.lang.String m41854xa5028f31() {
        return this.f20576xb6c1d73b;
    }

    /* renamed from: getPf */
    public java.lang.String m41855x5db1bec() {
        return this.f134675pf;
    }

    /* renamed from: getPfKey */
    public java.lang.String m41856x74f772d3() {
        return this.f20577x659cc89;
    }

    /* renamed from: getProcessData */
    public com.p314xaae8f345.p592x631407a.p601x2eefaa.C4784xfc88460f m41857xe5e0f983() {
        return this.f20578xc0ab2b9;
    }

    /* renamed from: getProdcutId */
    public java.lang.String m41858xbfc64f50() {
        return this.f20579xc058de06;
    }

    /* renamed from: getPropUnit */
    public java.lang.String m41859x40a0c4fd() {
        return this.f20580xc4c68787;
    }

    /* renamed from: getRemark */
    public java.lang.String m41860x2d61e676() {
        return this.f20581xc84ac380;
    }

    /* renamed from: getReqType */
    public java.lang.String m41861x7f0d78c2() {
        return this.f20582x41403cf8;
    }

    /* renamed from: getResData */
    public byte[] m41862x7f220834() {
        return this.f20583x4154cc6a;
    }

    /* renamed from: getResId */
    public int m41863x7513c025() {
        return this.f20584x67619db;
    }

    /* renamed from: getResUrl */
    public java.lang.String m41864x2d6473a5() {
        return this.f20585xc84d50af;
    }

    /* renamed from: getReserv */
    public java.lang.String m41865x2d64afbf() {
        return this.f20586xc84d8cc9;
    }

    /* renamed from: getSaveType */
    public int m41866x50fbcd() {
        return this.f20587x8476be57;
    }

    /* renamed from: getSaveValue */
    public java.lang.String m41867x9dfb73e() {
        return this.f20588xa7245f4;
    }

    /* renamed from: getServiceCode */
    public java.lang.String m41868x66ddcd0c() {
        return this.f20589x8d078642;
    }

    /* renamed from: getServiceName */
    public java.lang.String m41869x66e299aa() {
        return this.f20590x8d0c52e0;
    }

    /* renamed from: getServiceType */
    public int m41870x66e5ae59() {
        return this.f20591x8d0f678f;
    }

    /* renamed from: getSessionId */
    public java.lang.String m41871x23a7af9b() {
        return this.f20592x243a3e51;
    }

    /* renamed from: getSessionType */
    public java.lang.String m41872xd87f91ba() {
        return this.f20593xfea94af0;
    }

    /* renamed from: getTokenType */
    public int m41873x7dc8a1d() {
        return this.f20594x86f18d3;
    }

    /* renamed from: getUnit */
    public java.lang.String m41874xfb8641fa() {
        return this.f20595x36d984;
    }

    /* renamed from: getZoneId */
    public java.lang.String m41875x3b9614dd() {
        return this.f20596xd67ef1e7;
    }

    /* renamed from: isAutoPay */
    public boolean m41876xb6eb0fef() {
        return this.f20557xd979c879;
    }

    /* renamed from: isCanChange */
    public boolean m41877x2c2fa596() {
        return this.f20566x2c2fa596;
    }

    /* renamed from: isLogEnable */
    public boolean m41878xa25a73dd() {
        return this.f20571x5c1d31e7;
    }

    /* renamed from: isNumVisible */
    public boolean m41879xf62af6d6() {
        return this.f20567xf62af6d6;
    }

    /* renamed from: isShowListOtherNum */
    public boolean m41880x523b89fb() {
        return this.f20568x523b89fb;
    }

    /* renamed from: isShowNum */
    public boolean m41881x58a962bf() {
        return this.f20569x58a962bf;
    }

    /* renamed from: setAcctType */
    public void m41882xf767f86f(java.lang.String str) {
        this.f20556x80d559ed = str;
    }

    /* renamed from: setAutoPay */
    public void m41883x8ab851b7(boolean z17) {
        this.f20557xd979c879 = z17;
    }

    /* renamed from: setCanChange */
    public void m41884x41b3955e(boolean z17) {
        this.f20566x2c2fa596 = z17;
    }

    /* renamed from: setDiscountType */
    public void m41885xb7fd7d9d(java.lang.String str) {
        this.f20558x20c1f01b = str;
    }

    /* renamed from: setDiscountUrl */
    public void m41886x5041feac(java.lang.String str) {
        this.f20559xe006446e = str;
    }

    /* renamed from: setDiscoutId */
    public void m41887x54877652(java.lang.String str) {
        this.f20560xf8c64494 = str;
    }

    /* renamed from: setDrmInfo */
    public void m41888x23d9002b(java.lang.String str) {
        this.f20561x729a76ed = str;
    }

    /* renamed from: setExtras */
    public void m41889xb774565(java.lang.String str) {
        this.f20562xb32aee63 = str;
    }

    /* renamed from: setGoodsTokenUrl */
    public void m41890xf59b8cea(java.lang.String str) {
        this.f20563xa5656a2c = str;
    }

    /* renamed from: setH5Message */
    public void m41891xb5502c38(java.lang.String str) {
        f20555xcc79a21c.f20564x598efa7a = str;
    }

    /* renamed from: setH5Url */
    public void m41892x52feb220(java.lang.String str) {
        this.f20565x5d2f162 = str;
    }

    /* renamed from: setLaunchInterface */
    public void m41893x50b84e04(java.lang.String str) {
        this.f20570x357fe2c6 = str;
    }

    /* renamed from: setLogEnable */
    public void m41894xb7de63a5(boolean z17) {
        this.f20571x5c1d31e7 = z17;
    }

    /* renamed from: setMallType */
    public void m41895x7b147df0(int i17) {
        this.f20572x481df6e = i17;
    }

    /* renamed from: setNumVisible */
    public void m41896x9125000e(boolean z17) {
        this.f20567xf62af6d6 = z17;
    }

    /* renamed from: setOfferId */
    public void m41897x54ed85d5(java.lang.String str) {
        this.f20573xa3aefc97 = str;
    }

    /* renamed from: setOpenId */
    public void m41898x1c101c07(java.lang.String str) {
        this.f20574xc3c3c505 = str;
    }

    /* renamed from: setOpenKey */
    public void m41899x65f36cf3(java.lang.String str) {
        this.f20575xb4b4e3b5 = str;
    }

    /* renamed from: setPayChannel */
    public void m41900xd326dd3d(java.lang.String str) {
        this.f20576xb6c1d73b = str;
    }

    /* renamed from: setPf */
    public void m41901x68435f8(java.lang.String str) {
        this.f134675pf = str;
    }

    /* renamed from: setPfKey */
    public void m41902x53858d47(java.lang.String str) {
        this.f20577x659cc89 = str;
    }

    /* renamed from: setProcessData */
    public void m41903x7c466cf7(com.p314xaae8f345.p592x631407a.p601x2eefaa.C4784xfc88460f c4784xfc88460f) {
        this.f20578xc0ab2b9 = c4784xfc88460f;
    }

    /* renamed from: setProdcutId */
    public void m41904x1c1a0fc4(java.lang.String str) {
        this.f20579xc058de06 = str;
    }

    /* renamed from: setPropUnit */
    public void m41905x3b592609(java.lang.String str) {
        this.f20580xc4c68787 = str;
    }

    /* renamed from: setRemark */
    public void m41906x20971a82(java.lang.String str) {
        this.f20581xc84ac380 = str;
    }

    /* renamed from: setReqType */
    public void m41907xf27ec636(java.lang.String str) {
        this.f20582x41403cf8 = str;
    }

    /* renamed from: setResData */
    public void m41908xf29355a8(byte[] bArr) {
        this.f20583x4154cc6a = bArr;
    }

    /* renamed from: setResId */
    public void m41909x53a1da99(int i17) {
        this.f20584x67619db = i17;
    }

    /* renamed from: setResUrl */
    public void m41910x2099a7b1(java.lang.String str) {
        this.f20585xc84d50af = str;
    }

    /* renamed from: setReserv */
    public void m41911x2099e3cb(java.lang.String str) {
        this.f20586xc84d8cc9 = str;
    }

    /* renamed from: setSaveType */
    public void m41912xfb095cd9(int i17) {
        this.f20587x8476be57 = i17;
    }

    /* renamed from: setSaveValue */
    public void m41913x663377b2(java.lang.String str) {
        this.f20588xa7245f4 = str;
    }

    /* renamed from: setServiceCode */
    public void m41914xfd434080(java.lang.String str) {
        this.f20589x8d078642 = str;
    }

    /* renamed from: setServiceName */
    public void m41915xfd480d1e(java.lang.String str) {
        this.f20590x8d0c52e0 = str;
    }

    /* renamed from: setServiceType */
    public void m41916xfd4b21cd(int i17) {
        this.f20591x8d0f678f = i17;
    }

    /* renamed from: setSessionId */
    public void m41917x7ffb700f(java.lang.String str) {
        this.f20592x243a3e51 = str;
    }

    /* renamed from: setSessionType */
    public void m41918x6ee5052e(java.lang.String str) {
        this.f20593xfea94af0 = str;
    }

    /* renamed from: setShowListOtherNum */
    public void m41919xf427c933(boolean z17) {
        this.f20568x523b89fb = z17;
    }

    /* renamed from: setShowNum */
    public void m41920x2c76a487(boolean z17) {
        this.f20569x58a962bf = z17;
    }

    /* renamed from: setTokenType */
    public void m41921x64304a91(int i17) {
        this.f20594x86f18d3 = i17;
    }

    /* renamed from: setUnit */
    public void m41922x76510906(java.lang.String str) {
        this.f20595x36d984 = str;
    }

    /* renamed from: setZoneId */
    public void m41923x2ecb48e9(java.lang.String str) {
        this.f20596xd67ef1e7 = str;
    }
}
