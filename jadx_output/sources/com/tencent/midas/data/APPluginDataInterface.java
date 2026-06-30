package com.tencent.midas.data;

/* loaded from: classes13.dex */
public class APPluginDataInterface {
    public static final java.lang.String LAUNCHPAY_INTERVAL_TIME = "launchpayintervaltime";
    public static final java.lang.String LAUNCHPAY_TIME = "launchpaytime";
    public static final java.lang.String LAUNCHPAY_UUID = "launchpayuuid";
    public static final java.lang.String SHARE_PREFERENCE_NAME = "TencentUnipay";
    private static volatile com.tencent.midas.data.APPluginDataInterface gInstance = new com.tencent.midas.data.APPluginDataInterface();
    private java.lang.String h5Message = "";
    private java.lang.String offerId = "";
    private java.lang.String openId = "";
    private java.lang.String openKey = "";
    private java.lang.String sessionId = "";
    private java.lang.String sessionType = "";
    private java.lang.String zoneId = "";

    /* renamed from: pf, reason: collision with root package name */
    private java.lang.String f53142pf = "";
    private java.lang.String pfKey = "";
    private java.lang.String saveValue = "";
    private boolean isCanChange = true;
    private int resId = 0;
    private byte[] resData = null;
    private java.lang.String acctType = "";
    private java.lang.String reserv = "";
    private int mallType = 0;
    private java.lang.String h5Url = "";
    private boolean logEnable = true;
    private boolean isNumVisible = true;
    private java.lang.String propUnit = "";
    private java.lang.String unit = "";
    private boolean isShowNum = true;
    private boolean isShowListOtherNum = true;
    private java.lang.String payChannel = "";
    private java.lang.String discountType = "";
    private java.lang.String discountUrl = "";
    private java.lang.String drmInfo = "";
    private java.lang.String discoutId = "";
    private java.lang.String extras = "";
    private java.lang.String goodsTokenUrl = "";
    private int tokenType = 0;
    private java.lang.String prodcutId = "";
    private boolean autoPay = true;
    private java.lang.String remark = "";
    private java.lang.String serviceCode = "";
    private java.lang.String serviceName = "";
    private int serviceType = 0;
    private java.lang.String resUrl = "";
    private java.lang.String reqType = "";
    private int saveType = 0;
    private java.lang.String launchInterface = com.tencent.midas.data.APMidasPluginInfo.LAUNCH_INTERFACE_LAUNCHPAY;
    private com.tencent.midas.data.APMultiProcessData processData = null;

    private APPluginDataInterface() {
    }

    public static void init() {
        gInstance = new com.tencent.midas.data.APPluginDataInterface();
    }

    public static com.tencent.midas.data.APPluginDataInterface singleton() {
        if (gInstance == null) {
            synchronized (com.tencent.midas.data.APPluginDataInterface.class) {
                if (gInstance == null) {
                    gInstance = new com.tencent.midas.data.APPluginDataInterface();
                }
            }
        }
        return gInstance;
    }

    public java.lang.String getAcctType() {
        return this.acctType;
    }

    public java.lang.String getDiscountType() {
        return this.discountType;
    }

    public java.lang.String getDiscountUrl() {
        return this.discountUrl;
    }

    public java.lang.String getDiscoutId() {
        return this.discoutId;
    }

    public java.lang.String getDrmInfo() {
        return this.drmInfo;
    }

    public java.lang.String getExtras() {
        return this.extras;
    }

    public java.lang.String getGoodsTokenUrl() {
        return this.goodsTokenUrl;
    }

    public java.lang.String getH5Message() {
        return this.h5Message;
    }

    public java.lang.String getH5Url() {
        return this.h5Url;
    }

    public java.lang.String getLaunchInterface() {
        return this.launchInterface;
    }

    public int getMallType() {
        return this.mallType;
    }

    public java.lang.String getOfferId() {
        return this.offerId;
    }

    public java.lang.String getOpenId() {
        return this.openId;
    }

    public java.lang.String getOpenKey() {
        return this.openKey;
    }

    public java.lang.String getPayChannel() {
        return this.payChannel;
    }

    public java.lang.String getPf() {
        return this.f53142pf;
    }

    public java.lang.String getPfKey() {
        return this.pfKey;
    }

    public com.tencent.midas.data.APMultiProcessData getProcessData() {
        return this.processData;
    }

    public java.lang.String getProdcutId() {
        return this.prodcutId;
    }

    public java.lang.String getPropUnit() {
        return this.propUnit;
    }

    public java.lang.String getRemark() {
        return this.remark;
    }

    public java.lang.String getReqType() {
        return this.reqType;
    }

    public byte[] getResData() {
        return this.resData;
    }

    public int getResId() {
        return this.resId;
    }

    public java.lang.String getResUrl() {
        return this.resUrl;
    }

    public java.lang.String getReserv() {
        return this.reserv;
    }

    public int getSaveType() {
        return this.saveType;
    }

    public java.lang.String getSaveValue() {
        return this.saveValue;
    }

    public java.lang.String getServiceCode() {
        return this.serviceCode;
    }

    public java.lang.String getServiceName() {
        return this.serviceName;
    }

    public int getServiceType() {
        return this.serviceType;
    }

    public java.lang.String getSessionId() {
        return this.sessionId;
    }

    public java.lang.String getSessionType() {
        return this.sessionType;
    }

    public int getTokenType() {
        return this.tokenType;
    }

    public java.lang.String getUnit() {
        return this.unit;
    }

    public java.lang.String getZoneId() {
        return this.zoneId;
    }

    public boolean isAutoPay() {
        return this.autoPay;
    }

    public boolean isCanChange() {
        return this.isCanChange;
    }

    public boolean isLogEnable() {
        return this.logEnable;
    }

    public boolean isNumVisible() {
        return this.isNumVisible;
    }

    public boolean isShowListOtherNum() {
        return this.isShowListOtherNum;
    }

    public boolean isShowNum() {
        return this.isShowNum;
    }

    public void setAcctType(java.lang.String str) {
        this.acctType = str;
    }

    public void setAutoPay(boolean z17) {
        this.autoPay = z17;
    }

    public void setCanChange(boolean z17) {
        this.isCanChange = z17;
    }

    public void setDiscountType(java.lang.String str) {
        this.discountType = str;
    }

    public void setDiscountUrl(java.lang.String str) {
        this.discountUrl = str;
    }

    public void setDiscoutId(java.lang.String str) {
        this.discoutId = str;
    }

    public void setDrmInfo(java.lang.String str) {
        this.drmInfo = str;
    }

    public void setExtras(java.lang.String str) {
        this.extras = str;
    }

    public void setGoodsTokenUrl(java.lang.String str) {
        this.goodsTokenUrl = str;
    }

    public void setH5Message(java.lang.String str) {
        gInstance.h5Message = str;
    }

    public void setH5Url(java.lang.String str) {
        this.h5Url = str;
    }

    public void setLaunchInterface(java.lang.String str) {
        this.launchInterface = str;
    }

    public void setLogEnable(boolean z17) {
        this.logEnable = z17;
    }

    public void setMallType(int i17) {
        this.mallType = i17;
    }

    public void setNumVisible(boolean z17) {
        this.isNumVisible = z17;
    }

    public void setOfferId(java.lang.String str) {
        this.offerId = str;
    }

    public void setOpenId(java.lang.String str) {
        this.openId = str;
    }

    public void setOpenKey(java.lang.String str) {
        this.openKey = str;
    }

    public void setPayChannel(java.lang.String str) {
        this.payChannel = str;
    }

    public void setPf(java.lang.String str) {
        this.f53142pf = str;
    }

    public void setPfKey(java.lang.String str) {
        this.pfKey = str;
    }

    public void setProcessData(com.tencent.midas.data.APMultiProcessData aPMultiProcessData) {
        this.processData = aPMultiProcessData;
    }

    public void setProdcutId(java.lang.String str) {
        this.prodcutId = str;
    }

    public void setPropUnit(java.lang.String str) {
        this.propUnit = str;
    }

    public void setRemark(java.lang.String str) {
        this.remark = str;
    }

    public void setReqType(java.lang.String str) {
        this.reqType = str;
    }

    public void setResData(byte[] bArr) {
        this.resData = bArr;
    }

    public void setResId(int i17) {
        this.resId = i17;
    }

    public void setResUrl(java.lang.String str) {
        this.resUrl = str;
    }

    public void setReserv(java.lang.String str) {
        this.reserv = str;
    }

    public void setSaveType(int i17) {
        this.saveType = i17;
    }

    public void setSaveValue(java.lang.String str) {
        this.saveValue = str;
    }

    public void setServiceCode(java.lang.String str) {
        this.serviceCode = str;
    }

    public void setServiceName(java.lang.String str) {
        this.serviceName = str;
    }

    public void setServiceType(int i17) {
        this.serviceType = i17;
    }

    public void setSessionId(java.lang.String str) {
        this.sessionId = str;
    }

    public void setSessionType(java.lang.String str) {
        this.sessionType = str;
    }

    public void setShowListOtherNum(boolean z17) {
        this.isShowListOtherNum = z17;
    }

    public void setShowNum(boolean z17) {
        this.isShowNum = z17;
    }

    public void setTokenType(int i17) {
        this.tokenType = i17;
    }

    public void setUnit(java.lang.String str) {
        this.unit = str;
    }

    public void setZoneId(java.lang.String str) {
        this.zoneId = str;
    }
}
