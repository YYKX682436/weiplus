package com.tencent.map.tools.net.http;

/* loaded from: classes.dex */
public interface HttpResponseListener<T> {
    void onFailure(int i17, java.lang.String str, java.lang.Throwable th6);

    void onSuccess(int i17, T t17);
}
