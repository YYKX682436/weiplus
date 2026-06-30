package com.tencent.midas.api.request;

/* loaded from: classes5.dex */
public class APIabResult {
    java.lang.String mMessage;
    int mResponse;

    public APIabResult(int i17, java.lang.String str) {
        this.mResponse = i17;
        if (str == null || str.trim().length() == 0) {
            this.mMessage = getResponseDesc(i17);
            return;
        }
        this.mMessage = str + " (response: " + getResponseDesc(i17) + ")";
    }

    public static java.lang.String getResponseDesc(int i17) {
        return "";
    }

    public java.lang.String getMessage() {
        return this.mMessage;
    }

    public int getResponse() {
        return this.mResponse;
    }

    public boolean isFailure() {
        return !isSuccess();
    }

    public boolean isPendig() {
        return this.mResponse == 101;
    }

    public boolean isSuccess() {
        return this.mResponse == 0;
    }

    public java.lang.String toString() {
        return "IabResult: " + getMessage();
    }
}
