package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzho */
/* loaded from: classes16.dex */
public final class CallableC2276x394c47 implements java.util.concurrent.Callable<java.lang.String> {

    /* renamed from: zzanw */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 f6834x6f022aa;

    public CallableC2276x394c47(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2272x394c43 c2272x394c43) {
        this.f6834x6f022aa = c2272x394c43;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0072  */
    @Override // java.util.concurrent.Callable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final /* synthetic */ java.lang.String call() {
        /*
            r8 = this;
            com.google.android.gms.internal.measurement.zzhk r0 = r8.f6834x6f022aa
            com.google.android.gms.internal.measurement.zzfr r0 = r0.mo18977x394c1f()
            java.lang.String r0 = r0.m19130x394c77()
            if (r0 == 0) goto Ld
            return r0
        Ld:
            com.google.android.gms.internal.measurement.zzhk r0 = r8.f6834x6f022aa
            com.google.android.gms.internal.measurement.zzhk r0 = r0.mo18966x394c0f()
            com.google.android.gms.internal.measurement.zzgg r1 = r0.mo18975x394c1d()
            boolean r1 = r1.m19157x394c81()
            r2 = 0
            if (r1 == 0) goto L2c
            com.google.android.gms.internal.measurement.zzfg r0 = r0.mo18976x394c1e()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.m19108x394c64()
            java.lang.String r1 = "Cannot retrieve app instance id from analytics worker thread"
        L28:
            r0.log(r1)
            goto L66
        L2c:
            r0.mo18975x394c1d()
            boolean r1 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2242x394c20.m19155x9e2d0ded()
            if (r1 == 0) goto L40
            com.google.android.gms.internal.measurement.zzfg r0 = r0.mo18976x394c1e()
            com.google.android.gms.internal.measurement.zzfi r0 = r0.m19108x394c64()
            java.lang.String r1 = "Cannot retrieve app instance id from main thread"
            goto L28
        L40:
            com.google.android.gms.common.util.Clock r1 = r0.mo18962x394b92()
            long r1 = r1.mo18537x79952707()
            r3 = 120000(0x1d4c0, double:5.9288E-319)
            java.lang.String r5 = r0.m19206x394b64(r3)
            com.google.android.gms.common.util.Clock r6 = r0.mo18962x394b92()
            long r6 = r6.mo18537x79952707()
            long r6 = r6 - r1
            if (r5 != 0) goto L65
            int r1 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r1 >= 0) goto L65
            long r3 = r3 - r6
            java.lang.String r0 = r0.m19206x394b64(r3)
            r2 = r0
            goto L66
        L65:
            r2 = r5
        L66:
            if (r2 == 0) goto L72
            com.google.android.gms.internal.measurement.zzhk r0 = r8.f6834x6f022aa
            com.google.android.gms.internal.measurement.zzfr r0 = r0.mo18977x394c1f()
            r0.m19128x394b90(r2)
            return r2
        L72:
            java.util.concurrent.TimeoutException r0 = new java.util.concurrent.TimeoutException
            r0.<init>()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.CallableC2276x394c47.call():java.lang.Object");
    }
}
