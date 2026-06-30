package com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.gms.internal.measurement.zzig */
/* loaded from: classes16.dex */
public final class RunnableC2294x394c5e implements java.lang.Runnable {

    /* renamed from: zzaos */
    private final /* synthetic */ boolean f6889x6f022c5;

    /* renamed from: zzaot */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c f6890x6f022c6;

    /* renamed from: zzaou */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c f6891x6f022c7;

    /* renamed from: zzaov */
    private final /* synthetic */ com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d f6892x6f022c8;

    public RunnableC2294x394c5e(com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d c2293x394c5d, boolean z17, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c, com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2292x394c5c c2292x394c5c2) {
        this.f6892x6f022c8 = c2293x394c5d;
        this.f6889x6f022c5 = z17;
        this.f6890x6f022c6 = c2292x394c5c;
        this.f6891x6f022c7 = c2292x394c5c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003a  */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void run() {
        /*
            r7 = this;
            boolean r0 = r7.f6889x6f022c5
            if (r0 == 0) goto Ld
            com.google.android.gms.internal.measurement.zzif r0 = r7.f6892x6f022c8
            com.google.android.gms.internal.measurement.zzie r1 = r0.f6882x6f022be
            if (r1 == 0) goto Ld
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d.zza(r0, r1)
        Ld:
            com.google.android.gms.internal.measurement.zzie r0 = r7.f6890x6f022c6
            r1 = 1
            if (r0 == 0) goto L37
            long r2 = r0.f6879x6f022bc
            com.google.android.gms.internal.measurement.zzie r4 = r7.f6891x6f022c7
            long r5 = r4.f6879x6f022bc
            int r2 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r2 != 0) goto L37
            java.lang.String r0 = r0.f6878x6f022bb
            java.lang.String r2 = r4.f6878x6f022bb
            boolean r0 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(r0, r2)
            if (r0 == 0) goto L37
            com.google.android.gms.internal.measurement.zzie r0 = r7.f6890x6f022c6
            java.lang.String r0 = r0.f6881x394dd7
            com.google.android.gms.internal.measurement.zzie r2 = r7.f6891x6f022c7
            java.lang.String r2 = r2.f6881x394dd7
            boolean r0 = com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2340x394c96.zzs(r0, r2)
            if (r0 != 0) goto L35
            goto L37
        L35:
            r0 = 0
            goto L38
        L37:
            r0 = r1
        L38:
            if (r0 == 0) goto L70
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            com.google.android.gms.internal.measurement.zzie r2 = r7.f6891x6f022c7
            com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.C2293x394c5d.zza(r2, r0, r1)
            com.google.android.gms.internal.measurement.zzie r1 = r7.f6890x6f022c6
            if (r1 == 0) goto L63
            java.lang.String r1 = r1.f6881x394dd7
            if (r1 == 0) goto L51
            java.lang.String r2 = "_pn"
            r0.putString(r2, r1)
        L51:
            com.google.android.gms.internal.measurement.zzie r1 = r7.f6890x6f022c6
            java.lang.String r1 = r1.f6878x6f022bb
            java.lang.String r2 = "_pc"
            r0.putString(r2, r1)
            com.google.android.gms.internal.measurement.zzie r1 = r7.f6890x6f022c6
            long r1 = r1.f6879x6f022bc
            java.lang.String r3 = "_pi"
            r0.putLong(r3, r1)
        L63:
            com.google.android.gms.internal.measurement.zzif r1 = r7.f6892x6f022c8
            com.google.android.gms.internal.measurement.zzhk r1 = r1.mo18966x394c0f()
            java.lang.String r2 = "auto"
            java.lang.String r3 = "_vs"
            r1.zza(r2, r3, r0)
        L70:
            com.google.android.gms.internal.measurement.zzif r0 = r7.f6892x6f022c8
            com.google.android.gms.internal.measurement.zzie r1 = r7.f6891x6f022c7
            r0.f6882x6f022be = r1
            com.google.android.gms.internal.measurement.zzii r0 = r0.mo18969x394c12()
            com.google.android.gms.internal.measurement.zzie r1 = r7.f6891x6f022c7
            r0.zzb(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p176xb6135e39.p177xcca8366f.gms.p223x21ffc6bd.p230x93f2dbbc.RunnableC2294x394c5e.run():void");
    }
}
