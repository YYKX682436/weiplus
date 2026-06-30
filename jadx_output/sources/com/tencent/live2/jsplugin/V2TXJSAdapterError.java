package com.tencent.live2.jsplugin;

/* loaded from: classes15.dex */
public class V2TXJSAdapterError {
    public int errorCode;
    public java.lang.String errorInfo;
    public java.util.Map<java.lang.String, java.lang.Object> resultMap;

    public V2TXJSAdapterError() {
        this.errorCode = 0;
        this.errorInfo = "Success";
        this.resultMap = null;
    }

    public V2TXJSAdapterError(int i17, java.lang.String str) {
        this.resultMap = null;
        this.errorCode = i17;
        this.errorInfo = str;
    }

    public V2TXJSAdapterError(int i17, java.util.Map<java.lang.String, java.lang.Object> map) {
        this.errorInfo = "Success";
        this.errorCode = i17;
        this.resultMap = map;
    }
}
