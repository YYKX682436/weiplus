package com.google.android.gms.common.api;

/* loaded from: classes13.dex */
public class BooleanResult implements com.google.android.gms.common.api.Result {
    private final com.google.android.gms.common.api.Status zaa;
    private final boolean zab;

    public BooleanResult(com.google.android.gms.common.api.Status status, boolean z17) {
        this.zaa = (com.google.android.gms.common.api.Status) com.google.android.gms.common.internal.Preconditions.checkNotNull(status, "Status must not be null");
        this.zab = z17;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.common.api.BooleanResult)) {
            return false;
        }
        com.google.android.gms.common.api.BooleanResult booleanResult = (com.google.android.gms.common.api.BooleanResult) obj;
        return this.zaa.equals(booleanResult.zaa) && this.zab == booleanResult.zab;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.zaa;
    }

    public boolean getValue() {
        return this.zab;
    }

    public final int hashCode() {
        return ((this.zaa.hashCode() + com.tencent.mm.plugin.appbrand.jsapi.v5.CTRL_INDEX) * 31) + (this.zab ? 1 : 0);
    }
}
