package com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd;

/* renamed from: com.google.android.gms.wearable.internal.zzhh */
/* loaded from: classes13.dex */
final class CallableC2668x394c40 implements java.util.concurrent.Callable<java.lang.Boolean> {

    /* renamed from: zzee */
    private final /* synthetic */ byte[] f7777x394be0;

    /* renamed from: zzfg */
    private final /* synthetic */ android.os.ParcelFileDescriptor f7778x394c01;

    public CallableC2668x394c40(com.p176xb6135e39.p177xcca8366f.gms.p242xd47b5d59.p243x21ffc6bd.C2667x394c3f c2667x394c3f, android.os.ParcelFileDescriptor parcelFileDescriptor, byte[] bArr) {
        this.f7778x394c01 = parcelFileDescriptor;
        this.f7777x394be0 = bArr;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.concurrent.Callable
    /* renamed from: zzd, reason: merged with bridge method [inline-methods] */
    public final java.lang.Boolean call() {
        if (android.util.Log.isLoggable("WearableClient", 3)) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.f7778x394c01).length() + 36);
        }
        android.os.ParcelFileDescriptor.AutoCloseOutputStream autoCloseOutputStream = new android.os.ParcelFileDescriptor.AutoCloseOutputStream(this.f7778x394c01);
        try {
            try {
                autoCloseOutputStream.write(this.f7777x394be0);
                autoCloseOutputStream.flush();
                if (android.util.Log.isLoggable("WearableClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(this.f7778x394c01).length() + 27);
                }
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                try {
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(this.f7778x394c01).length() + 24);
                    }
                    autoCloseOutputStream.close();
                } catch (java.io.IOException unused) {
                }
                return bool;
            } catch (java.io.IOException unused2) {
                new java.lang.StringBuilder(java.lang.String.valueOf(this.f7778x394c01).length() + 36);
                try {
                    if (android.util.Log.isLoggable("WearableClient", 3)) {
                        new java.lang.StringBuilder(java.lang.String.valueOf(this.f7778x394c01).length() + 24);
                    }
                    autoCloseOutputStream.close();
                } catch (java.io.IOException unused3) {
                }
                return java.lang.Boolean.FALSE;
            }
        } catch (java.lang.Throwable th6) {
            try {
                if (android.util.Log.isLoggable("WearableClient", 3)) {
                    new java.lang.StringBuilder(java.lang.String.valueOf(this.f7778x394c01).length() + 24);
                }
                autoCloseOutputStream.close();
            } catch (java.io.IOException unused4) {
            }
            throw th6;
        }
    }
}
