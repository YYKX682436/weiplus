package com.tencent.midas.data;

/* loaded from: classes13.dex */
public class APMultiProcessData {
    private java.lang.String guid = "";
    private long payInterfaceTime = 0;
    private int intervalTime = 0;

    public java.lang.String getGuid() {
        return this.guid;
    }

    public int getIntervalTime() {
        return this.intervalTime;
    }

    public long getPayInterfaceTime() {
        return this.payInterfaceTime;
    }

    public void setGuid(java.lang.String str) {
        this.guid = str;
    }

    public void setIntervalTime(int i17) {
        this.intervalTime = i17;
    }

    public void setPayInterfaceTime(long j17) {
        this.payInterfaceTime = j17;
    }
}
