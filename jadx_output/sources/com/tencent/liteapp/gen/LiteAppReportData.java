package com.tencent.liteapp.gen;

/* loaded from: classes9.dex */
public final class LiteAppReportData {
    public java.lang.String mAppId;
    public long mElapsedTimeSinceFirstLog;
    public java.lang.String mExpandDimension1;
    public java.lang.String mExpandDimension2;
    public java.lang.String mExpandDimension3;
    public java.util.HashMap<java.lang.String, java.lang.String> mExtInfo;
    public long mLocalTimeStamps;
    public long mLogAction;
    public long mLogIntValue;
    public java.lang.String mLogStringValue;
    public com.tencent.liteapp.gen.LogType mLogType;
    public long mLogUIntValue;
    public long mSamplingRate;
    public com.tencent.liteapp.gen.LiteAppOpenScene mScene;
    public long mSequenceId;
    public java.lang.String mSessionId;
    public java.lang.String mUri;
    public java.lang.String mVersion;

    public LiteAppReportData() {
    }

    public LiteAppReportData(com.tencent.liteapp.gen.LogType logType, long j17, java.lang.String str, long j18, java.lang.String str2, java.lang.String str3, com.tencent.liteapp.gen.LiteAppOpenScene liteAppOpenScene, java.lang.String str4, java.lang.String str5, long j19, long j27, java.util.HashMap<java.lang.String, java.lang.String> hashMap, java.lang.String str6, java.lang.String str7, java.lang.String str8, long j28, long j29, long j37) {
        this.mLogType = logType;
        this.mLogAction = j17;
        this.mSessionId = str;
        this.mSequenceId = j18;
        this.mAppId = str2;
        this.mVersion = str3;
        this.mScene = liteAppOpenScene;
        this.mUri = str4;
        this.mLogStringValue = str5;
        this.mLogUIntValue = j19;
        this.mLocalTimeStamps = j27;
        this.mExtInfo = hashMap;
        this.mExpandDimension1 = str6;
        this.mExpandDimension2 = str7;
        this.mExpandDimension3 = str8;
        this.mLogIntValue = j28;
        this.mElapsedTimeSinceFirstLog = j29;
        this.mSamplingRate = j37;
    }

    public java.lang.String getAppId() {
        return this.mAppId;
    }

    public long getElapsedTimeSinceFirstLog() {
        return this.mElapsedTimeSinceFirstLog;
    }

    public java.lang.String getExpandDimension1() {
        return this.mExpandDimension1;
    }

    public java.lang.String getExpandDimension2() {
        return this.mExpandDimension2;
    }

    public java.lang.String getExpandDimension3() {
        return this.mExpandDimension3;
    }

    public java.util.HashMap<java.lang.String, java.lang.String> getExtInfo() {
        return this.mExtInfo;
    }

    public long getLocalTimeStamps() {
        return this.mLocalTimeStamps;
    }

    public long getLogAction() {
        return this.mLogAction;
    }

    public long getLogIntValue() {
        return this.mLogIntValue;
    }

    public java.lang.String getLogStringValue() {
        return this.mLogStringValue;
    }

    public com.tencent.liteapp.gen.LogType getLogType() {
        return this.mLogType;
    }

    public long getLogUIntValue() {
        return this.mLogUIntValue;
    }

    public long getSamplingRate() {
        return this.mSamplingRate;
    }

    public com.tencent.liteapp.gen.LiteAppOpenScene getScene() {
        return this.mScene;
    }

    public long getSequenceId() {
        return this.mSequenceId;
    }

    public java.lang.String getSessionId() {
        return this.mSessionId;
    }

    public java.lang.String getUri() {
        return this.mUri;
    }

    public java.lang.String getVersion() {
        return this.mVersion;
    }

    public java.lang.String toString() {
        return "LiteAppReportData{mLogType=" + this.mLogType + ",mLogAction=" + this.mLogAction + ",mSessionId=" + this.mSessionId + ",mSequenceId=" + this.mSequenceId + ",mAppId=" + this.mAppId + ",mVersion=" + this.mVersion + ",mScene=" + this.mScene + ",mUri=" + this.mUri + ",mLogStringValue=" + this.mLogStringValue + ",mLogUIntValue=" + this.mLogUIntValue + ",mLocalTimeStamps=" + this.mLocalTimeStamps + ",mExtInfo=" + this.mExtInfo + ",mExpandDimension1=" + this.mExpandDimension1 + ",mExpandDimension2=" + this.mExpandDimension2 + ",mExpandDimension3=" + this.mExpandDimension3 + ",mLogIntValue=" + this.mLogIntValue + ",mElapsedTimeSinceFirstLog=" + this.mElapsedTimeSinceFirstLog + ",mSamplingRate=" + this.mSamplingRate + "}";
    }
}
