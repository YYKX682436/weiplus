package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzwx */
/* loaded from: classes15.dex */
public final class C2369x394e21 extends com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c<java.lang.Integer> {
    public C2369x394e21(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2374x394e2b c2374x394e2b, java.lang.String str, java.lang.Integer num) {
        super(c2374x394e2b, str, num, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Override // com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.AbstractC2364x394e1c
    /* renamed from: zzfa, reason: merged with bridge method [inline-methods] */
    public final java.lang.Integer mo19355x394bf4(java.lang.String str) {
        try {
            return java.lang.Integer.valueOf(java.lang.Integer.parseInt(str));
        } catch (java.lang.NumberFormatException unused) {
            new java.lang.StringBuilder(java.lang.String.valueOf(this.f7180x6f0265c).length() + 28 + java.lang.String.valueOf(str).length());
            return null;
        }
    }
}
