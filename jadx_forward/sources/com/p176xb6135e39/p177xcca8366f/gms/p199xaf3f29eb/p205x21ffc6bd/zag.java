package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* loaded from: classes13.dex */
public abstract class zag implements android.content.DialogInterface.OnClickListener {
    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag zab(android.app.Activity activity, android.content.Intent intent, int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zad(intent, activity, i17);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag zac(p012xc85e97e9.p087x9da2e250.app.ComponentCallbacksC1101xa17d4670 componentCallbacksC1101xa17d4670, android.content.Intent intent, int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zae(intent, componentCallbacksC1101xa17d4670, i17);
    }

    public static com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zag zad(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.api.p201x21ffc6bd.InterfaceC1780x4bb63ba interfaceC1780x4bb63ba, android.content.Intent intent, int i17) {
        return new com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.zaf(intent, interfaceC1780x4bb63ba, 2);
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(android.content.DialogInterface dialogInterface, int i17) {
        try {
            try {
                zaa();
            } catch (android.content.ActivityNotFoundException unused) {
                android.os.Build.FINGERPRINT.contains("generic");
            }
        } finally {
            dialogInterface.dismiss();
        }
    }

    public abstract void zaa();
}
