package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public class Response<T extends com.google.android.gms.common.api.Result> {
    private com.google.android.gms.common.api.Result zza;

    public Response() {
    }

    public T getResult() {
        return (T) this.zza;
    }

    public void setResult(T t17) {
        this.zza = t17;
    }

    public Response(T t17) {
        this.zza = t17;
    }
}
