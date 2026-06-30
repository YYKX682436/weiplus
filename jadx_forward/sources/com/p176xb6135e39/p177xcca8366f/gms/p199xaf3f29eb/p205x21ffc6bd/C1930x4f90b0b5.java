package com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd;

/* renamed from: com.google.android.gms.common.internal.StringResourceValueReader */
/* loaded from: classes13.dex */
public class C1930x4f90b0b5 {
    private final android.content.res.Resources zza;
    private final java.lang.String zzb;

    public C1930x4f90b0b5(android.content.Context context) {
        com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.p205x21ffc6bd.C1923x7ccc697b.m18214x7b41bcd2(context);
        android.content.res.Resources resources = context.getResources();
        this.zza = resources;
        this.zzb = resources.getResourcePackageName(com.p176xb6135e39.p177xcca8366f.gms.p199xaf3f29eb.R.C1721xcad56011.f5845xcb01d1bc);
    }

    /* renamed from: getString */
    public java.lang.String m18233x2fec8307(java.lang.String str) {
        int identifier = this.zza.getIdentifier(str, "string", this.zzb);
        if (identifier == 0) {
            return null;
        }
        return this.zza.getString(identifier);
    }
}
