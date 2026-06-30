package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* renamed from: com.google.android.gms.internal.measurement.zzgb */
/* loaded from: classes16.dex */
public final class C2237x394c1b {

    /* renamed from: zzala */
    private final com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2240x394c1e f6693x6f02256;

    public C2237x394c1b(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.InterfaceC2240x394c1e interfaceC2240x394c1e) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(interfaceC2240x394c1e);
        this.f6693x6f02256 = interfaceC2240x394c1e;
    }

    public static boolean zza(android.content.Context context) {
        android.content.pm.ActivityInfo receiverInfo;
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        try {
            android.content.pm.PackageManager packageManager = context.getPackageManager();
            if (packageManager != null && (receiverInfo = packageManager.getReceiverInfo(new android.content.ComponentName(context, "com.google.android.gms.measurement.AppMeasurementReceiver"), 0)) != null) {
                if (receiverInfo.enabled) {
                    return true;
                }
            }
        } catch (android.content.pm.PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    /* renamed from: onReceive */
    public final void m19144x90287404(android.content.Context context, android.content.Intent intent) {
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25 zzg = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2247x394c25.zzg(context);
        com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2216x394c01 mo18976x394c1e = zzg.mo18976x394c1e();
        if (intent == null) {
            mo18976x394c1e.m19111x394c67().log("Receiver called with null intent");
            return;
        }
        java.lang.String action = intent.getAction();
        mo18976x394c1e.m19115x394c6b().zzg("Local receiver got", action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            android.content.Intent className = new android.content.Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementService");
            className.setAction("com.google.android.gms.measurement.UPLOAD");
            mo18976x394c1e.m19115x394c6b().log("Starting wakeful intent.");
            this.f6693x6f02256.mo19146x1d7e301e(context, className);
            return;
        }
        if ("com.android.vending.INSTALL_REFERRER".equals(action)) {
            try {
                zzg.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2238x394c1c(this, zzg, mo18976x394c1e));
            } catch (java.lang.Exception e17) {
                mo18976x394c1e.m19111x394c67().zzg("Install Referrer Reporter encountered a problem", e17);
            }
            android.content.BroadcastReceiver.PendingResult mo19145x626c3f69 = this.f6693x6f02256.mo19145x626c3f69();
            java.lang.String stringExtra = intent.getStringExtra("referrer");
            if (stringExtra == null) {
                mo18976x394c1e.m19115x394c6b().log("Install referrer extras are null");
                if (mo19145x626c3f69 != null) {
                    mo19145x626c3f69.finish();
                    return;
                }
                return;
            }
            mo18976x394c1e.m19113x394c69().zzg("Install referrer extras are", stringExtra);
            if (!stringExtra.contains("?")) {
                stringExtra = stringExtra.length() != 0 ? "?".concat(stringExtra) : new java.lang.String("?");
            }
            android.os.Bundle zza = zzg.mo19173x394c1b().zza(android.net.Uri.parse(stringExtra));
            if (zza == null) {
                mo18976x394c1e.m19115x394c6b().log("No campaign defined in install referrer broadcast");
                if (mo19145x626c3f69 != null) {
                    mo19145x626c3f69.finish();
                    return;
                }
                return;
            }
            long longExtra = 1000 * intent.getLongExtra("referrer_timestamp_seconds", 0L);
            if (longExtra == 0) {
                mo18976x394c1e.m19111x394c67().log("Install referrer is missing timestamp");
            }
            zzg.mo18975x394c1d().zzc(new com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2239x394c1d(this, zzg, longExtra, zza, context, mo18976x394c1e, mo19145x626c3f69));
        }
    }
}
