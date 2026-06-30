package org.p3343x72743996.net;

@org.p3343x72743996.p3344x2e06d1.p3345xc6ad7b24.InterfaceC29387x20efb56(m152783x6ac9171 = "net::android")
/* renamed from: org.chromium.net.HttpNegotiateAuthenticator */
/* loaded from: classes13.dex */
public class C29515x7545965d {

    /* renamed from: $assertionsDisabled */
    static final /* synthetic */ boolean f73838x7118e671 = false;
    private static final java.lang.String TAG = "net_auth";

    /* renamed from: mAccountType */
    private final java.lang.String f73839xddadc05a;

    /* renamed from: mSpnegoContext */
    private android.os.Bundle f73840x86fba9e6;

    /* renamed from: org.chromium.net.HttpNegotiateAuthenticator$GetAccountsCallback */
    /* loaded from: classes13.dex */
    public class GetAccountsCallback implements android.accounts.AccountManagerCallback<android.accounts.Account[]> {

        /* renamed from: mRequestData */
        private final org.p3343x72743996.net.C29515x7545965d.RequestData f73841xee92882c;

        public GetAccountsCallback(org.p3343x72743996.net.C29515x7545965d.RequestData requestData) {
            this.f73841xee92882c = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(android.accounts.AccountManagerFuture<android.accounts.Account[]> accountManagerFuture) {
            try {
                android.accounts.Account[] result = accountManagerFuture.getResult();
                if (result.length == 0) {
                    org.p3343x72743996.p3344x2e06d1.Log.w(org.p3343x72743996.net.C29515x7545965d.TAG, "ERR_MISSING_AUTH_CREDENTIALS: No account provided for the kerberos authentication. Please verify the configuration policies and that the CONTACTS runtime permission is granted. ");
                    org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(this.f73841xee92882c.f73850x5b2d4773, org.p3343x72743996.net.C29515x7545965d.this, org.p3343x72743996.net.InterfaceC29524x4f65168b.f74020x75f30658, null);
                    return;
                }
                if (result.length > 1) {
                    org.p3343x72743996.p3344x2e06d1.Log.w(org.p3343x72743996.net.C29515x7545965d.TAG, "ERR_MISSING_AUTH_CREDENTIALS: Found %d accounts eligible for the kerberos authentication. Please fix the configuration by providing a single account.", java.lang.Integer.valueOf(result.length));
                    org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(this.f73841xee92882c.f73850x5b2d4773, org.p3343x72743996.net.C29515x7545965d.this, org.p3343x72743996.net.InterfaceC29524x4f65168b.f74020x75f30658, null);
                } else if (org.p3343x72743996.net.C29515x7545965d.this.m153289x2c39c9e5(org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035(), "android.permission.USE_CREDENTIALS", true)) {
                    org.p3343x72743996.p3344x2e06d1.Log.e(org.p3343x72743996.net.C29515x7545965d.TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: USE_CREDENTIALS permission not granted. Aborting authentication.");
                    org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(this.f73841xee92882c.f73850x5b2d4773, org.p3343x72743996.net.C29515x7545965d.this, org.p3343x72743996.net.InterfaceC29524x4f65168b.f74019xba0c360, null);
                } else {
                    org.p3343x72743996.net.C29515x7545965d.RequestData requestData = this.f73841xee92882c;
                    android.accounts.Account account = result[0];
                    requestData.f73847xb9d38a2d = account;
                    requestData.f73848x5c93c0c0.getAuthToken(account, requestData.f73849x192e380b, requestData.f73851xb586869e, true, (android.accounts.AccountManagerCallback<android.os.Bundle>) new org.p3343x72743996.net.C29515x7545965d.GetTokenCallback(requestData), new android.os.Handler(org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152655xd5db76a5()));
                }
            } catch (android.accounts.AuthenticatorException | android.accounts.OperationCanceledException | java.io.IOException e17) {
                org.p3343x72743996.p3344x2e06d1.Log.w(org.p3343x72743996.net.C29515x7545965d.TAG, "ERR_UNEXPECTED: Error while attempting to retrieve accounts.", e17);
                org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(this.f73841xee92882c.f73850x5b2d4773, org.p3343x72743996.net.C29515x7545965d.this, -9, null);
            }
        }
    }

    /* renamed from: org.chromium.net.HttpNegotiateAuthenticator$GetTokenCallback */
    /* loaded from: classes13.dex */
    public class GetTokenCallback implements android.accounts.AccountManagerCallback<android.os.Bundle> {

        /* renamed from: mRequestData */
        private final org.p3343x72743996.net.C29515x7545965d.RequestData f73843xee92882c;

        public GetTokenCallback(org.p3343x72743996.net.C29515x7545965d.RequestData requestData) {
            this.f73843xee92882c = requestData;
        }

        @Override // android.accounts.AccountManagerCallback
        public void run(android.accounts.AccountManagerFuture<android.os.Bundle> accountManagerFuture) {
            try {
                android.os.Bundle result = accountManagerFuture.getResult();
                if (!result.containsKey("intent")) {
                    org.p3343x72743996.net.C29515x7545965d.this.m153285x4c45036c(result, this.f73843xee92882c);
                } else {
                    final android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
                    org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152361xd9ec0c5(m152349x6e669035, new android.content.BroadcastReceiver() { // from class: org.chromium.net.HttpNegotiateAuthenticator.GetTokenCallback.1
                        @Override // android.content.BroadcastReceiver
                        public void onReceive(android.content.Context context, android.content.Intent intent) {
                            m152349x6e669035.unregisterReceiver(this);
                            android.accounts.AccountManager accountManager = org.p3343x72743996.net.C29515x7545965d.GetTokenCallback.this.f73843xee92882c.f73848x5c93c0c0;
                            android.accounts.Account account = org.p3343x72743996.net.C29515x7545965d.GetTokenCallback.this.f73843xee92882c.f73847xb9d38a2d;
                            java.lang.String str = org.p3343x72743996.net.C29515x7545965d.GetTokenCallback.this.f73843xee92882c.f73849x192e380b;
                            android.os.Bundle bundle = org.p3343x72743996.net.C29515x7545965d.GetTokenCallback.this.f73843xee92882c.f73851xb586869e;
                            org.p3343x72743996.net.C29515x7545965d.GetTokenCallback getTokenCallback = org.p3343x72743996.net.C29515x7545965d.GetTokenCallback.this;
                            accountManager.getAuthToken(account, str, bundle, true, (android.accounts.AccountManagerCallback<android.os.Bundle>) new org.p3343x72743996.net.C29515x7545965d.GetTokenCallback(getTokenCallback.f73843xee92882c), (android.os.Handler) null);
                        }
                    }, new android.content.IntentFilter("android.accounts.LOGIN_ACCOUNTS_CHANGED"));
                }
            } catch (android.accounts.AuthenticatorException | android.accounts.OperationCanceledException | java.io.IOException e17) {
                org.p3343x72743996.p3344x2e06d1.Log.w(org.p3343x72743996.net.C29515x7545965d.TAG, "ERR_UNEXPECTED: Error while attempting to obtain a token.", e17);
                org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(this.f73843xee92882c.f73850x5b2d4773, org.p3343x72743996.net.C29515x7545965d.this, -9, null);
            }
        }
    }

    /* renamed from: org.chromium.net.HttpNegotiateAuthenticator$Natives */
    /* loaded from: classes13.dex */
    public interface Natives {
        /* renamed from: setResult */
        void mo153290x209a1f1f(long j17, org.p3343x72743996.net.C29515x7545965d c29515x7545965d, int i17, java.lang.String str);
    }

    /* renamed from: org.chromium.net.HttpNegotiateAuthenticator$RequestData */
    /* loaded from: classes13.dex */
    public static class RequestData {

        /* renamed from: account */
        public android.accounts.Account f73847xb9d38a2d;

        /* renamed from: accountManager */
        public android.accounts.AccountManager f73848x5c93c0c0;

        /* renamed from: authTokenType */
        public java.lang.String f73849x192e380b;

        /* renamed from: nativeResultObject */
        public long f73850x5b2d4773;

        /* renamed from: options */
        public android.os.Bundle f73851xb586869e;
    }

    public C29515x7545965d(java.lang.String str) {
        this.f73839xddadc05a = str;
    }

    /* renamed from: create */
    public static org.p3343x72743996.net.C29515x7545965d m153284xaf65a0fc(java.lang.String str) {
        return new org.p3343x72743996.net.C29515x7545965d(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: processResult */
    public void m153285x4c45036c(android.os.Bundle bundle, org.p3343x72743996.net.C29515x7545965d.RequestData requestData) {
        this.f73840x86fba9e6 = bundle.getBundle(org.p3343x72743996.net.C29517x37847739.f73865xc7d6a70c);
        int i17 = -9;
        switch (bundle.getInt(org.p3343x72743996.net.C29517x37847739.f73866xccebb300, 1)) {
            case 0:
                i17 = 0;
                break;
            case 2:
                i17 = -3;
                break;
            case 3:
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74105x7a90241;
                break;
            case 4:
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74010x19674163;
                break;
            case 5:
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74004xe90a9e7;
                break;
            case 6:
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74110xe9a893f8;
                break;
            case 7:
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74020x75f30658;
                break;
            case 8:
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74102xd4b0ebc3;
                break;
            case 9:
                i17 = org.p3343x72743996.net.InterfaceC29524x4f65168b.f74016x8e5c061c;
                break;
        }
        org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(requestData.f73850x5b2d4773, this, i17, bundle.getString("authtoken"));
    }

    /* renamed from: requestTokenWithActivity */
    private void m153286x24969fbf(android.content.Context context, android.app.Activity activity, org.p3343x72743996.net.C29515x7545965d.RequestData requestData, java.lang.String[] strArr) {
        if (!m153289x2c39c9e5(context, "android.permission.GET_ACCOUNTS", false)) {
            requestData.f73848x5c93c0c0.getAuthTokenByFeatures(this.f73839xddadc05a, requestData.f73849x192e380b, strArr, activity, null, requestData.f73851xb586869e, new org.p3343x72743996.net.C29515x7545965d.GetTokenCallback(requestData), new android.os.Handler(org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152655xd5db76a5()));
        } else {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: %s permission not granted. Aborting authentication", "android.permission.GET_ACCOUNTS");
            org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(requestData.f73850x5b2d4773, this, org.p3343x72743996.net.InterfaceC29524x4f65168b.f74019xba0c360, null);
        }
    }

    /* renamed from: requestTokenWithoutActivity */
    private void m153287xac6f05ed(android.content.Context context, org.p3343x72743996.net.C29515x7545965d.RequestData requestData, java.lang.String[] strArr) {
        if (!m153289x2c39c9e5(context, "android.permission.GET_ACCOUNTS", true)) {
            requestData.f73848x5c93c0c0.getAccountsByTypeAndFeatures(this.f73839xddadc05a, strArr, new org.p3343x72743996.net.C29515x7545965d.GetAccountsCallback(requestData), new android.os.Handler(org.p3343x72743996.p3344x2e06d1.C29367xd5f5f0a7.m152655xd5db76a5()));
        } else {
            org.p3343x72743996.p3344x2e06d1.Log.e(TAG, "ERR_MISCONFIGURED_AUTH_ENVIRONMENT: GET_ACCOUNTS permission not granted. Aborting authentication.");
            org.p3343x72743996.net.C29516xcf61408.get().mo153290x209a1f1f(requestData.f73850x5b2d4773, this, org.p3343x72743996.net.InterfaceC29524x4f65168b.f74019xba0c360, null);
        }
    }

    /* renamed from: getNextAuthToken */
    public void m153288x8d2627c8(long j17, java.lang.String str, java.lang.String str2, boolean z17) {
        android.content.Context m152349x6e669035 = org.p3343x72743996.p3344x2e06d1.C29296x4bd17462.m152349x6e669035();
        org.p3343x72743996.net.C29515x7545965d.RequestData requestData = new org.p3343x72743996.net.C29515x7545965d.RequestData();
        requestData.f73849x192e380b = org.p3343x72743996.net.C29517x37847739.f73868x9bd2184d + str;
        requestData.f73848x5c93c0c0 = android.accounts.AccountManager.get(m152349x6e669035);
        requestData.f73850x5b2d4773 = j17;
        java.lang.String[] strArr = {org.p3343x72743996.net.C29517x37847739.f73867x3c194653};
        android.os.Bundle bundle = new android.os.Bundle();
        requestData.f73851xb586869e = bundle;
        if (str2 != null) {
            bundle.putString(org.p3343x72743996.net.C29517x37847739.f73864xf480303b, str2);
        }
        android.os.Bundle bundle2 = this.f73840x86fba9e6;
        if (bundle2 != null) {
            requestData.f73851xb586869e.putBundle(org.p3343x72743996.net.C29517x37847739.f73865xc7d6a70c, bundle2);
        }
        requestData.f73851xb586869e.putBoolean(org.p3343x72743996.net.C29517x37847739.f73863xfb6b4734, z17);
        android.app.Activity m152191x48217948 = org.p3343x72743996.p3344x2e06d1.C29282xd7b5c542.m152191x48217948();
        if (m152191x48217948 == null) {
            m153287xac6f05ed(m152349x6e669035, requestData, strArr);
        } else {
            m153286x24969fbf(m152349x6e669035, m152191x48217948, requestData, strArr);
        }
    }

    /* renamed from: lacksPermission */
    public boolean m153289x2c39c9e5(android.content.Context context, java.lang.String str, boolean z17) {
        return (z17 || context.checkPermission(str, android.os.Process.myPid(), android.os.Process.myUid()) == 0) ? false : true;
    }
}
