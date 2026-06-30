package com.p176xb6135e39.p271xde6bf207.p278xaa2b3704;

/* renamed from: com.google.firebase.messaging.FirebaseMessagingService */
/* loaded from: classes13.dex */
public class ServiceC2749x37996758 extends com.p176xb6135e39.p271xde6bf207.iid.zzb {

    /* renamed from: i, reason: collision with root package name */
    public static final java.util.Queue f126196i = new java.util.ArrayDeque(10);

    public static boolean h(android.os.Bundle bundle) {
        if (bundle == null) {
            return false;
        }
        return "1".equals(bundle.getString("google.c.a.e"));
    }

    @Override // com.p176xb6135e39.p271xde6bf207.iid.zzb
    public final android.content.Intent b(android.content.Intent intent) {
        return (android.content.Intent) ((java.util.ArrayDeque) cb.o.a().f121694d).poll();
    }

    @Override // com.p176xb6135e39.p271xde6bf207.iid.zzb
    public final boolean c(android.content.Intent intent) {
        if (!"com.google.firebase.messaging.NOTIFICATION_OPEN".equals(intent.getAction())) {
            return false;
        }
        android.app.PendingIntent pendingIntent = (android.app.PendingIntent) intent.getParcelableExtra("pending_intent");
        if (pendingIntent != null) {
            try {
                pendingIntent.send();
            } catch (android.app.PendingIntent.CanceledException unused) {
            }
        }
        if (!h(intent.getExtras())) {
            return true;
        }
        if ("1".equals(intent.getStringExtra("google.c.a.tc"))) {
            za.a aVar = (za.a) xa.b.a().get(za.a.class);
            android.util.Log.isLoggable("FirebaseMessaging", 3);
            if (aVar != null) {
                java.lang.String stringExtra = intent.getStringExtra("google.c.a.c_id");
                za.b bVar = (za.b) aVar;
                bVar.m178603x2e43c042(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7336x59d1b15, com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.UserProperty.f7363xee82abbc, stringExtra);
                android.os.Bundle bundle = new android.os.Bundle();
                bundle.putString(ya.b.f77502x92235c1b, "Firebase");
                bundle.putString(ya.b.f77490x87518375, "notification");
                bundle.putString(ya.b.f77465x264ef110, stringExtra);
                bVar.m178602x769949b6(com.p176xb6135e39.p177xcca8366f.gms.p233x93f2dbbc.C2413x7b7e6fb.f7336x59d1b15, "_cmp", bundle);
            }
        } else {
            android.util.Log.isLoggable("FirebaseMessaging", 3);
        }
        eb.d.a(this, "_no", intent);
        return true;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:45:0x00ef. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0360  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0528  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0542  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0547  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x054c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0551  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x05fe  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x05ad  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x05c9  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x05d1  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x05d6  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x05da  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x041b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:264:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x028b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x062f  */
    @Override // com.p176xb6135e39.p271xde6bf207.iid.zzb
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void d(android.content.Intent r22) {
        /*
            Method dump skipped, instructions count: 1694
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.ServiceC2749x37996758.d(android.content.Intent):void");
    }

    public void e() {
    }

    public void f(com.p176xb6135e39.p271xde6bf207.p278xaa2b3704.C2750x874314c1 c2750x874314c1) {
    }

    public void g(java.lang.String str, java.lang.Exception exc) {
    }
}
