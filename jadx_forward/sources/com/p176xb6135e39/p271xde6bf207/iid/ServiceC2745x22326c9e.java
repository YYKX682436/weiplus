package com.p176xb6135e39.p271xde6bf207.iid;

/* renamed from: com.google.firebase.iid.FirebaseInstanceIdService */
/* loaded from: classes13.dex */
public class ServiceC2745x22326c9e extends com.p176xb6135e39.p271xde6bf207.iid.zzb {
    @Override // com.p176xb6135e39.p271xde6bf207.iid.zzb
    public final android.content.Intent b(android.content.Intent intent) {
        return (android.content.Intent) ((java.util.ArrayDeque) cb.o.a().f121693c).poll();
    }

    @Override // com.p176xb6135e39.p271xde6bf207.iid.zzb
    public final void d(android.content.Intent intent) {
        if ("com.google.firebase.iid.TOKEN_REFRESH".equals(intent.getAction())) {
            e();
            return;
        }
        java.lang.String stringExtra = intent.getStringExtra("CMD");
        if (stringExtra != null) {
            if (android.util.Log.isLoggable("FirebaseInstanceId", 3)) {
                new java.lang.StringBuilder(stringExtra.length() + 21 + java.lang.String.valueOf(intent.getExtras()).length());
            }
            if ("RST".equals(stringExtra) || "RST_FULL".equals(stringExtra)) {
                com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.b().n();
                return;
            }
            if ("SYNC".equals(stringExtra)) {
                com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17 b17 = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.b();
                b17.getClass();
                cb.p pVar = com.p176xb6135e39.p271xde6bf207.iid.C2743x723fba17.f126180h;
                synchronized (pVar) {
                    java.lang.String concat = "".concat("|T|");
                    android.content.SharedPreferences.Editor edit = pVar.f121696a.edit();
                    for (java.lang.String str : pVar.f121696a.getAll().keySet()) {
                        if (str.startsWith(concat)) {
                            edit.remove(str);
                        }
                    }
                    edit.commit();
                }
                b17.d();
            }
        }
    }

    public void e() {
    }
}
