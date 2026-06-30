package com.tencent.map.sdk.comps.offlinemap;

/* loaded from: classes13.dex */
public class OfflineItem {
    private java.lang.String name;
    private int percentage;
    private java.lang.String pinyin;
    private long size;
    private boolean upgrade = true;

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.tencent.map.sdk.comps.offlinemap.OfflineItem)) {
            return false;
        }
        com.tencent.map.sdk.comps.offlinemap.OfflineItem offlineItem = (com.tencent.map.sdk.comps.offlinemap.OfflineItem) obj;
        java.lang.String str = this.name;
        if (str == null ? offlineItem.name != null : !str.equals(offlineItem.name)) {
            return false;
        }
        java.lang.String str2 = this.pinyin;
        java.lang.String str3 = offlineItem.pinyin;
        return str2 != null ? str2.equals(str3) : str3 == null;
    }

    public java.lang.String getName() {
        return this.name;
    }

    public int getPercentage() {
        return this.percentage;
    }

    public java.lang.String getPinyin() {
        return this.pinyin;
    }

    public long getSize() {
        return this.size;
    }

    public int hashCode() {
        java.lang.String str = this.name;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        java.lang.String str2 = this.pinyin;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public boolean isUpgrade() {
        return this.upgrade;
    }

    public void setName(java.lang.String str) {
        this.name = str;
    }

    public void setPercentage(int i17) {
        this.percentage = i17;
    }

    public void setPinyin(java.lang.String str) {
        this.pinyin = str;
    }

    public void setSize(long j17) {
        this.size = j17;
    }

    public void setUpgrade(boolean z17) {
        this.upgrade = z17;
    }

    public java.lang.String toString() {
        java.lang.StringBuffer stringBuffer = new java.lang.StringBuffer("OfflineItem{name='");
        stringBuffer.append(this.name);
        stringBuffer.append("', pinyin='");
        stringBuffer.append(this.pinyin);
        stringBuffer.append("', size=");
        stringBuffer.append(this.size);
        stringBuffer.append(", upgrade=");
        stringBuffer.append(this.upgrade);
        stringBuffer.append(", percentage=");
        stringBuffer.append(this.percentage);
        stringBuffer.append('}');
        return stringBuffer.toString();
    }
}
