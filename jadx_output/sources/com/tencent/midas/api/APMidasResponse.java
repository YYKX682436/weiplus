package com.tencent.midas.api;

/* loaded from: classes13.dex */
public class APMidasResponse {
    public static final int PAYCHANEL_ACCT_QBQD = 11;
    public static final int PAYCHANEL_ACCT_QDQB = 0;
    public static final int PAYCHANEL_FRIEND_PAY = 14;
    public static final int PAYCHANEL_GOLDCOUPONS = 10;
    public static final int PAYCHANEL_HF = 9;
    public static final int PAYCHANEL_MCARD = 5;
    public static final int PAYCHANEL_QQCARD = 4;
    public static final int PAYCHANEL_TENPAY_BANK = 2;
    public static final int PAYCHANEL_TENPAY_CFT = 1;
    public static final int PAYCHANEL_TENPAY_KJ = 3;
    public static final int PAYCHANEL_UNKOWN = -1;
    public static final int PAYCHANEL_WECHAT = 8;
    public static final int PAYCHANEL_YB = 7;
    public static final int PAYPROVIDESTATE_SUCC = 0;
    public static final int PAYPROVIDESTATE_UNKOWN = -1;
    public static final int PAYRESULT_ALREADY_OWNED = 1159;
    public static final int PAYRESULT_CANCEL = 2;
    public static final int PAYRESULT_ERROR = -1;
    public static final int PAYRESULT_PARAMERROR = 3;
    public static final int PAYRESULT_PENDING = 101;
    public static final int PAYRESULT_SUCC = 0;
    public static final int PAYRESULT_UNKOWN = 100;
    public static final int PAYSTATE_PAYCANCEL = 1;
    public static final int PAYSTATE_PAYERROR = 2;
    public static final int PAYSTATE_PAYSUCC = 0;
    public static final int PAYSTATE_PAYUNKOWN = -1;
    public int realSaveNum = 0;
    public int resultCode = -1;
    public int resultInerCode = 0;
    public int payChannel = -1;
    public int payState = -1;
    public int provideState = -1;
    public java.lang.String resultMsg = "";
    public java.lang.String extendInfo = "";
    public java.lang.String payReserve1 = "";
    public java.lang.String payReserve2 = "";
    public java.lang.String payReserve3 = "";
    public com.tencent.midas.api.request.APPurchase mAPPurchase = null;

    public java.lang.String getExtendInfo() {
        return this.extendInfo;
    }

    public int getPayChannel() {
        return this.payChannel;
    }

    public java.lang.String getPayReserve1() {
        return this.payReserve1;
    }

    public java.lang.String getPayReserve2() {
        return this.payReserve2;
    }

    public java.lang.String getPayReserve3() {
        return this.payReserve3;
    }

    public int getPayState() {
        return this.payState;
    }

    public int getProvideState() {
        return this.provideState;
    }

    public int getRealSaveNum() {
        return this.realSaveNum;
    }

    public com.tencent.midas.api.request.APPurchase getReceipt() {
        return this.mAPPurchase;
    }

    public int getResultCode() {
        return this.resultCode;
    }

    public int getResultInerCode() {
        return this.resultInerCode;
    }

    public java.lang.String getResultMsg() {
        return this.resultMsg;
    }

    public void reset() {
        this.realSaveNum = 0;
        this.resultCode = -1;
        this.resultInerCode = 0;
        this.payChannel = -1;
        this.payState = -1;
        this.provideState = -1;
        this.resultMsg = "";
        this.extendInfo = "";
        this.payReserve1 = "";
        this.payReserve2 = "";
        this.payReserve3 = "";
        this.mAPPurchase = null;
    }

    public void setExtendInfo(java.lang.String str) {
        this.extendInfo = str;
    }

    public void setPayChannel(int i17) {
        this.payChannel = i17;
    }

    public void setPayReserve1(java.lang.String str) {
        this.payReserve1 = str;
    }

    public void setPayReserve2(java.lang.String str) {
        this.payReserve2 = str;
    }

    public void setPayReserve3(java.lang.String str) {
        this.payReserve3 = str;
    }

    public void setPayState(int i17) {
        this.payState = i17;
    }

    public void setProvideState(int i17) {
        this.provideState = i17;
    }

    public void setRealSaveNum(int i17) {
        this.realSaveNum = i17;
    }

    public void setReceipt(com.tencent.midas.api.request.APPurchase aPPurchase) {
        this.mAPPurchase = aPPurchase;
    }

    public void setResultCode(int i17) {
        this.resultCode = i17;
    }

    public void setResultInerCode(int i17) {
        this.resultInerCode = i17;
    }

    public void setResultMsg(java.lang.String str) {
        this.resultMsg = str;
    }
}
