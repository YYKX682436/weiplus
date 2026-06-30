package com.tencent.kinda.gen;

/* loaded from: classes9.dex */
public final class ViewReportStruct {
    public int mBgColor;
    public boolean mCheckBtnNoResponse;
    public boolean mCheckColor;
    public boolean mCheckViewExposure;
    public java.lang.String mCustomKey;
    public com.tencent.kinda.gen.ReportEvent mEvent;
    public java.lang.String mViewId;

    public ViewReportStruct() {
    }

    public ViewReportStruct(java.lang.String str, boolean z17, boolean z18, boolean z19, int i17, com.tencent.kinda.gen.ReportEvent reportEvent, java.lang.String str2) {
        this.mViewId = str;
        this.mCheckViewExposure = z17;
        this.mCheckBtnNoResponse = z18;
        this.mCheckColor = z19;
        this.mBgColor = i17;
        this.mEvent = reportEvent;
        this.mCustomKey = str2;
    }

    public int getBgColor() {
        return this.mBgColor;
    }

    public boolean getCheckBtnNoResponse() {
        return this.mCheckBtnNoResponse;
    }

    public boolean getCheckColor() {
        return this.mCheckColor;
    }

    public boolean getCheckViewExposure() {
        return this.mCheckViewExposure;
    }

    public java.lang.String getCustomKey() {
        return this.mCustomKey;
    }

    public com.tencent.kinda.gen.ReportEvent getEvent() {
        return this.mEvent;
    }

    public java.lang.String getViewId() {
        return this.mViewId;
    }

    public java.lang.String toString() {
        return "ViewReportStruct{mViewId=" + this.mViewId + ",mCheckViewExposure=" + this.mCheckViewExposure + ",mCheckBtnNoResponse=" + this.mCheckBtnNoResponse + ",mCheckColor=" + this.mCheckColor + ",mBgColor=" + this.mBgColor + ",mEvent=" + this.mEvent + ",mCustomKey=" + this.mCustomKey + "}";
    }
}
