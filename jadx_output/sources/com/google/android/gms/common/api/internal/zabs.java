package com.google.android.gms.common.api.internal;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes13.dex */
public final class zabs {
    private final com.google.android.gms.common.api.internal.ApiKey zaa;
    private final com.google.android.gms.common.Feature zab;

    public /* synthetic */ zabs(com.google.android.gms.common.api.internal.ApiKey apiKey, com.google.android.gms.common.Feature feature, com.google.android.gms.common.api.internal.zabr zabrVar) {
        this.zaa = apiKey;
        this.zab = feature;
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj != null && (obj instanceof com.google.android.gms.common.api.internal.zabs)) {
            com.google.android.gms.common.api.internal.zabs zabsVar = (com.google.android.gms.common.api.internal.zabs) obj;
            if (com.google.android.gms.common.internal.Objects.equal(this.zaa, zabsVar.zaa) && com.google.android.gms.common.internal.Objects.equal(this.zab, zabsVar.zab)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return com.google.android.gms.common.internal.Objects.hashCode(this.zaa, this.zab);
    }

    public final java.lang.String toString() {
        return com.google.android.gms.common.internal.Objects.toStringHelper(this).add("key", this.zaa).add("feature", this.zab).toString();
    }
}
