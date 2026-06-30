package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.AccountAccessor */
/* loaded from: classes13.dex */
public class BinderC1896x732e2374 extends com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b.Stub {
    /* renamed from: getAccountBinderSafe */
    public static android.accounts.Account m18075x604f3dae(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b interfaceC1914xc5c6680b) {
        android.accounts.Account account = null;
        if (interfaceC1914xc5c6680b != null) {
            long clearCallingIdentity = android.os.Binder.clearCallingIdentity();
            try {
                account = interfaceC1914xc5c6680b.zzb();
            } catch (android.os.RemoteException unused) {
            } catch (java.lang.Throwable th6) {
                android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
                throw th6;
            }
            android.os.Binder.restoreCallingIdentity(clearCallingIdentity);
        }
        return account;
    }

    /* renamed from: equals */
    public final boolean m18076xb2c87fbf(java.lang.Object obj) {
        throw null;
    }

    @Override // com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.InterfaceC1914xc5c6680b
    public final android.accounts.Account zzb() {
        throw null;
    }
}
