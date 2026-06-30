package com.google.android.gms.internal.p000authapiphone;

/* loaded from: classes13.dex */
public final class zzj extends com.google.android.gms.auth.api.phone.SmsRetrieverClient {
    public zzj(android.app.Activity activity) {
        super(activity);
    }

    @Override // com.google.android.gms.auth.api.phone.SmsRetrieverClient, com.google.android.gms.auth.api.phone.SmsRetrieverApi
    public final com.google.android.gms.tasks.Task<java.lang.Void> startSmsRetriever() {
        return doWrite(new com.google.android.gms.internal.p000authapiphone.zzk(this));
    }

    public zzj(android.content.Context context) {
        super(context);
    }
}
