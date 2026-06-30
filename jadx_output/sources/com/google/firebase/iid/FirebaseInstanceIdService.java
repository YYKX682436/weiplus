package com.google.firebase.iid;

/* loaded from: classes13.dex */
public class FirebaseInstanceIdService extends com.google.firebase.iid.zzb {
    @Override // com.google.firebase.iid.zzb
    public final android.content.Intent b(android.content.Intent intent) {
        return (android.content.Intent) ((java.util.ArrayDeque) cb.o.a().f40160c).poll();
    }

    @Override // com.google.firebase.iid.zzb
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
                com.google.firebase.iid.FirebaseInstanceId.b().n();
                return;
            }
            if ("SYNC".equals(stringExtra)) {
                com.google.firebase.iid.FirebaseInstanceId b17 = com.google.firebase.iid.FirebaseInstanceId.b();
                b17.getClass();
                cb.p pVar = com.google.firebase.iid.FirebaseInstanceId.f44647h;
                synchronized (pVar) {
                    java.lang.String concat = "".concat("|T|");
                    android.content.SharedPreferences.Editor edit = pVar.f40163a.edit();
                    for (java.lang.String str : pVar.f40163a.getAll().keySet()) {
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
