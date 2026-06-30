package com.google.android.gms.gcm;

@java.lang.Deprecated
/* loaded from: classes13.dex */
public class GcmListenerService extends com.google.android.gms.iid.zze {
    public static void zzd(android.os.Bundle bundle) {
        java.util.Iterator<java.lang.String> it = bundle.keySet().iterator();
        while (it.hasNext()) {
            java.lang.String next = it.next();
            if (next != null && next.startsWith("google.c.")) {
                it.remove();
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x00ee, code lost:
    
        if (r3.importance == 100) goto L64;
     */
    @Override // com.google.android.gms.iid.zze
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void handleIntent(android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.gcm.GcmListenerService.handleIntent(android.content.Intent):void");
    }

    public void onDeletedMessages() {
    }

    public void onMessageReceived(java.lang.String str, android.os.Bundle bundle) {
    }

    public void onMessageSent(java.lang.String str) {
    }

    public void onSendError(java.lang.String str, java.lang.String str2) {
    }
}
