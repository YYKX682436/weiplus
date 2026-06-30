package com.google.android.gms.signin;

/* loaded from: classes13.dex */
public final class SignInOptions implements com.google.android.gms.common.api.Api.ApiOptions.Optional {
    public static final com.google.android.gms.signin.SignInOptions zaa = new com.google.android.gms.signin.SignInOptions(false, false, null, false, null, null, false, null, null, null);
    private final boolean zab = false;
    private final boolean zac = false;
    private final java.lang.String zad = null;
    private final boolean zae = false;
    private final boolean zah = false;
    private final java.lang.String zaf = null;
    private final java.lang.String zag = null;
    private final java.lang.Long zai = null;
    private final java.lang.Long zaj = null;

    public /* synthetic */ SignInOptions(boolean z17, boolean z18, java.lang.String str, boolean z19, java.lang.String str2, java.lang.String str3, boolean z27, java.lang.Long l17, java.lang.Long l18, com.google.android.gms.signin.zaf zafVar) {
    }

    public final boolean equals(java.lang.Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof com.google.android.gms.signin.SignInOptions)) {
            return false;
        }
        boolean z17 = ((com.google.android.gms.signin.SignInOptions) obj).zab;
        return com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null) && com.google.android.gms.common.internal.Objects.equal(null, null);
    }

    public final int hashCode() {
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        return com.google.android.gms.common.internal.Objects.hashCode(bool, bool, null, bool, bool, null, null, null, null);
    }
}
