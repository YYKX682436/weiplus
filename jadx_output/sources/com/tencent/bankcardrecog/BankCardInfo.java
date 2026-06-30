package com.tencent.bankcardrecog;

/* loaded from: classes9.dex */
public class BankCardInfo {
    public byte[] bitmapData;
    private int cardNumLen = 0;
    private java.lang.String cardNum = "";
    private int[] rectY = new int[20];
    private int[] rectX = new int[20];
    public int width = 0;
    public int height = 0;
    public int bitmapLen = 0;

    public BankCardInfo(int i17, int i18) {
        double d17 = i17;
        this.bitmapData = new byte[(((int) (0.8d * d17)) * ((int) (d17 * 0.52d)) * 3) + 54];
    }

    public java.lang.String getCardNum() {
        com.tenpay.ndk.Encrypt encrypt = new com.tenpay.ndk.Encrypt();
        return encrypt.desedeEncode(this.cardNum, encrypt.getRandomKey());
    }

    public int getCardNumLen() {
        return this.cardNumLen;
    }

    public int[] getRectX() {
        return this.rectX;
    }

    public int[] getRectY() {
        return this.rectY;
    }

    public void setCardNum(java.lang.String str) {
        this.cardNum = str;
    }

    public void setCardNumLen(int i17) {
        this.cardNumLen = i17;
    }

    public void setRectX(int[] iArr) {
        this.rectX = iArr;
    }

    public void setRectY(int[] iArr) {
        this.rectY = iArr;
    }
}
