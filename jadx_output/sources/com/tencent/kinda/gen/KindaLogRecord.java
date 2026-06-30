package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class KindaLogRecord {
    public int mAction;
    public java.util.HashMap<java.lang.String, java.lang.String> mExtInfo;
    public long mSequenceId;
    public java.lang.String mSessionId;
    public int mType;
    public java.lang.String mUrl;

    public KindaLogRecord() {
    }

    public KindaLogRecord(int i17, java.lang.String str, long j17, java.lang.String str2, int i18, java.util.HashMap<java.lang.String, java.lang.String> hashMap) {
        this.mType = i17;
        this.mSessionId = str;
        this.mSequenceId = j17;
        this.mUrl = str2;
        this.mAction = i18;
        this.mExtInfo = hashMap;
    }

    public int getAction() {
        return this.mAction;
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getExtInfo() {
        return this.mExtInfo;
    }

    public long getSequenceId() {
        return this.mSequenceId;
    }

    public java.lang.String getSessionId() {
        return this.mSessionId;
    }

    public int getType() {
        return this.mType;
    }

    public java.lang.String getUrl() {
        return this.mUrl;
    }

    public java.lang.String toString() {
        return "KindaLogRecord{mType=" + this.mType + ",mSessionId=" + this.mSessionId + ",mSequenceId=" + this.mSequenceId + ",mUrl=" + this.mUrl + ",mAction=" + this.mAction + ",mExtInfo=" + this.mExtInfo + "}";
    }
}
