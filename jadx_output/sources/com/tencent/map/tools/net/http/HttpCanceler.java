package com.tencent.map.tools.net.http;

/* loaded from: classes13.dex */
public class HttpCanceler {
    private com.tencent.map.tools.Callback<java.lang.Boolean> mCancelCallback;
    private boolean mCanceled;
    private com.tencent.map.tools.net.NetAdapter mConnection;

    public void cancel() {
        com.tencent.map.tools.net.NetAdapter netAdapter = this.mConnection;
        if (netAdapter != null && netAdapter.cancel()) {
            this.mCanceled = true;
        }
        com.tencent.map.tools.Callback<java.lang.Boolean> callback = this.mCancelCallback;
        if (callback != null) {
            callback.callback(java.lang.Boolean.valueOf(this.mCanceled));
        }
    }

    public boolean isCanceled() {
        return this.mCanceled;
    }

    public void setHttpAccessRequest(com.tencent.map.tools.net.NetAdapter netAdapter, com.tencent.map.tools.Callback<java.lang.Boolean> callback) {
        this.mConnection = netAdapter;
        this.mCancelCallback = callback;
    }
}
