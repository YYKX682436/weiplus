package com.google.android.gms.common.internal;

/* loaded from: classes13.dex */
public class AccountAccessor extends com.google.android.gms.common.internal.IAccountAccessor.Stub {
    public static android.accounts.Account getAccountBinderSafe(com.google.android.gms.common.internal.IAccountAccessor iAccountAccessor) {
        android.accounts.Account account = null;
        if (iAccountAccessor != null) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                account = iAccountAccessor.zzb();
            } catch (android.os.RemoteException unused) {
            } catch (java.lang.Throwable th6) {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th6;
            }
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    public final boolean equals(java.lang.Object obj) {
        throw null;
    }

    @Override // com.google.android.gms.common.internal.IAccountAccessor
    public final android.accounts.Account zzb() {
        throw null;
    }
}
