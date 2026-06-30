package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p225x2ddda8;

/* renamed from: com.google.android.gms.internal.auth.zzaw */
/* loaded from: classes13.dex */
public final class C2084x394b76 {
    public static android.app.PendingIntent zzd(android.content.Context context, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.C1645x1f51c8.AuthCredentialsOptions authCredentialsOptions, com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1667x7e693de8 c1667x7e693de8) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(context, "context must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18215x7b41bcd2(c1667x7e693de8, "request must not be null");
        com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08 zzg = (authCredentialsOptions == null || authCredentialsOptions.zzg() == null) ? com.p176xb6135e39.p177xcca8366f.gms.p190x2ddda8.api.p193x113922fc.C1670x6e485a08.f5603x394bc3 : authCredentialsOptions.zzg();
        android.content.Intent putExtra = new android.content.Intent("com.google.android.gms.auth.api.credentials.PICKER").putExtra("com.google.android.gms.credentials.hintRequestVersion", 2).putExtra("com.google.android.gms.credentials.RequestType", "Hints").putExtra("com.google.android.gms.credentials.ClaimedCallingPackage", (java.lang.String) null);
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1941x88600a22.m18389x93bc7259(zzg, putExtra, "com.google.android.gms.credentials.PasswordSpecification");
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.p207xf22421d6.C1941x88600a22.m18389x93bc7259(c1667x7e693de8, putExtra, "com.google.android.gms.credentials.HintRequest");
        return android.app.PendingIntent.getActivity(context, 2000, putExtra, 134217728);
    }
}
