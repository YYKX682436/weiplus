package com.google.firebase.iid;

/* loaded from: classes13.dex */
public final class FirebaseInstanceIdReceiver extends androidx.legacy.content.WakefulBroadcastReceiver {

    /* renamed from: d, reason: collision with root package name */
    public static cb.y f44655d;

    /* renamed from: e, reason: collision with root package name */
    public static cb.y f44656e;

    /* JADX WARN: Can't wrap try/catch for region: R(16:50|(2:52|(4:54|(1:56)|57|58)(1:59))(1:118)|60|fd|(10:66|(2:70|(1:90)(5:74|(2:76|(1:78)(1:79))|80|151|85))|91|92|(3:94|(1:96)|97)|98|(1:100)(1:104)|(1:102)|103|58)|108|(2:110|(1:112))|113|91|92|(0)|98|(0)(0)|(0)|103|58) */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x01c4, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:106:0x01c5, code lost:
    
        new java.lang.StringBuilder(java.lang.String.valueOf(r9).length() + 45);
        r1 = 402;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x01d7, code lost:
    
        r1 = 401;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01b6 A[Catch: IllegalStateException -> 0x01c4, SecurityException -> 0x01d7, TryCatch #6 {IllegalStateException -> 0x01c4, SecurityException -> 0x01d7, blocks: (B:92:0x019b, B:94:0x019f, B:97:0x01a8, B:98:0x01ae, B:100:0x01b6, B:104:0x01bb), top: B:91:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01bb A[Catch: IllegalStateException -> 0x01c4, SecurityException -> 0x01d7, TRY_LEAVE, TryCatch #6 {IllegalStateException -> 0x01c4, SecurityException -> 0x01d7, blocks: (B:92:0x019b, B:94:0x019f, B:97:0x01a8, B:98:0x01ae, B:100:0x01b6, B:104:0x01bb), top: B:91:0x019b }] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x019f A[Catch: IllegalStateException -> 0x01c4, SecurityException -> 0x01d7, TryCatch #6 {IllegalStateException -> 0x01c4, SecurityException -> 0x01d7, blocks: (B:92:0x019b, B:94:0x019f, B:97:0x01a8, B:98:0x01ae, B:100:0x01b6, B:104:0x01bb), top: B:91:0x019b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(android.content.Context r9, android.content.Intent r10, java.lang.String r11) {
        /*
            Method dump skipped, instructions count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.iid.FirebaseInstanceIdReceiver.a(android.content.Context, android.content.Intent, java.lang.String):void");
    }

    @Override // android.content.BroadcastReceiver
    public final void onReceive(android.content.Context context, android.content.Intent intent) {
        if (intent == null) {
            return;
        }
        android.os.Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
        if (parcelableExtra instanceof android.content.Intent) {
            a(context, (android.content.Intent) parcelableExtra, intent.getAction());
        } else {
            a(context, intent, intent.getAction());
        }
    }
}
