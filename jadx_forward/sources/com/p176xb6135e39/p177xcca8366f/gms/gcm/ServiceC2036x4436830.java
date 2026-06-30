package com.p176xb6135e39.p177xcca8366f.gms.gcm;

@java.lang.Deprecated
/* renamed from: com.google.android.gms.gcm.GcmListenerService */
/* loaded from: classes13.dex */
public class ServiceC2036x4436830 extends com.p176xb6135e39.p177xcca8366f.gms.iid.zze {
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
    @Override // com.p176xb6135e39.p177xcca8366f.gms.iid.zze
    /* renamed from: handleIntent */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void mo18695xa1c752e4(android.content.Intent r9) {
        /*
            Method dump skipped, instructions count: 396
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.gcm.ServiceC2036x4436830.mo18695xa1c752e4(android.content.Intent):void");
    }

    /* renamed from: onDeletedMessages */
    public void m18696x351fbca6() {
    }

    /* renamed from: onMessageReceived */
    public void m18697xaa57a729(java.lang.String str, android.os.Bundle bundle) {
    }

    /* renamed from: onMessageSent */
    public void m18698xe88370e0(java.lang.String str) {
    }

    /* renamed from: onSendError */
    public void m18699xfe52c441(java.lang.String str, java.lang.String str2) {
    }
}
