package com.tencent.kinda.gen;

/* loaded from: classes15.dex */
public final class BankCardType {
    public java.lang.String mBankName;
    public java.lang.String mBankType;
    public java.lang.String mBankaccType;
    public java.lang.String mBankaccTypeName;
    public java.lang.String mForbidWord;
    public boolean mIsMaintainance;

    public BankCardType() {
    }

    public BankCardType(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, boolean z17, java.lang.String str5) {
        this.mBankType = str;
        this.mBankName = str2;
        this.mBankaccType = str3;
        this.mBankaccTypeName = str4;
        this.mIsMaintainance = z17;
        this.mForbidWord = str5;
    }

    public java.lang.String getBankName() {
        return this.mBankName;
    }

    public java.lang.String getBankType() {
        return this.mBankType;
    }

    public java.lang.String getBankaccType() {
        return this.mBankaccType;
    }

    public java.lang.String getBankaccTypeName() {
        return this.mBankaccTypeName;
    }

    public java.lang.String getForbidWord() {
        return this.mForbidWord;
    }

    public boolean getIsMaintainance() {
        return this.mIsMaintainance;
    }

    public java.lang.String toString() {
        return "BankCardType{mBankType=" + this.mBankType + ",mBankName=" + this.mBankName + ",mBankaccType=" + this.mBankaccType + ",mBankaccTypeName=" + this.mBankaccTypeName + ",mIsMaintainance=" + this.mIsMaintainance + ",mForbidWord=" + this.mForbidWord + "}";
    }
}
