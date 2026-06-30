package com.google.android.gms.auth.api.signin;

/* loaded from: classes13.dex */
public class GoogleSignInResult implements com.google.android.gms.common.api.Result {
    private com.google.android.gms.common.api.Status mStatus;
    private com.google.android.gms.auth.api.signin.GoogleSignInAccount zzen;

    public GoogleSignInResult(com.google.android.gms.auth.api.signin.GoogleSignInAccount googleSignInAccount, com.google.android.gms.common.api.Status status) {
        this.zzen = googleSignInAccount;
        this.mStatus = status;
    }

    public com.google.android.gms.auth.api.signin.GoogleSignInAccount getSignInAccount() {
        return this.zzen;
    }

    @Override // com.google.android.gms.common.api.Result
    public com.google.android.gms.common.api.Status getStatus() {
        return this.mStatus;
    }

    public boolean isSuccess() {
        return this.mStatus.isSuccess();
    }
}
