package io3;

/* loaded from: classes13.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    public final android.hardware.Sensor f375043a;

    /* renamed from: b, reason: collision with root package name */
    public final io3.g f375044b = new io3.g();

    /* renamed from: c, reason: collision with root package name */
    public boolean f375045c = false;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f375046d = new java.util.ArrayList();

    /* renamed from: e, reason: collision with root package name */
    public long f375047e = 0;

    public f(android.hardware.Sensor sensor) {
        this.f375043a = sensor;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0021 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(android.hardware.SensorEvent r18) {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = 0
            r3 = 0
            r5 = 1
            if (r1 == 0) goto L1e
            float[] r6 = r1.values
            if (r6 == 0) goto L1e
            long r6 = r1.timestamp
            int r6 = (r6 > r3 ? 1 : (r6 == r3 ? 0 : -1))
            if (r6 > 0) goto L15
            goto L1e
        L15:
            boolean r6 = r0.f375045c
            if (r6 != 0) goto L1c
            r0.f375045c = r5
            goto L1e
        L1c:
            r6 = r2
            goto L1f
        L1e:
            r6 = r5
        L1f:
            if (r6 == 0) goto L22
            return
        L22:
            long r6 = r1.timestamp
            r8 = 1000000(0xf4240, double:4.940656E-318)
            long r6 = r6 / r8
            long r8 = r0.f375047e
            long r10 = r6 - r8
            r12 = 15
            int r12 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r12 >= 0) goto L34
            r12 = r5
            goto L35
        L34:
            r12 = r2
        L35:
            if (r12 == 0) goto L38
            return
        L38:
            r12 = 20
            int r14 = (r10 > r12 ? 1 : (r10 == r12 ? 0 : -1))
            if (r14 != 0) goto L47
            io3.g r2 = new io3.g
            r2.<init>(r1)
            r0.b(r2)
            return
        L47:
            io3.g r14 = r0.f375044b
            r15 = r6
            long r5 = r14.f375049b
            int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r3 == 0) goto L52
            r3 = 1
            goto L53
        L52:
            r3 = r2
        L53:
            if (r3 == 0) goto L72
            long r8 = r8 + r12
            long r2 = r8 - r5
            long r2 = java.lang.Math.abs(r2)
            long r8 = r8 - r15
            long r4 = java.lang.Math.abs(r8)
            int r2 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r2 >= 0) goto L69
            r0.b(r14)
            goto L71
        L69:
            io3.g r2 = new io3.g
            r2.<init>(r1)
            r0.b(r2)
        L71:
            return
        L72:
            r3 = 25
            int r3 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r3 <= 0) goto L79
            r2 = 1
        L79:
            if (r2 == 0) goto L84
            io3.g r2 = new io3.g
            r2.<init>(r1)
            r0.b(r2)
            goto L87
        L84:
            r14.a(r1)
        L87:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: io3.f.a(android.hardware.SensorEvent):void");
    }

    public final void b(io3.g gVar) {
        com.p314xaae8f345.mm.p975xc206bf10.h hVar = new com.p314xaae8f345.mm.p975xc206bf10.h();
        hVar.a(gVar.f375048a[0]);
        float[] fArr = gVar.f375048a;
        hVar.b(fArr[1]);
        hVar.c(fArr[2]);
        hVar.d(gVar.f375049b);
        ((java.util.ArrayList) this.f375046d).add(hVar);
        this.f375047e = gVar.f375049b;
        io3.g gVar2 = this.f375044b;
        java.util.Arrays.fill(gVar2.f375048a, Float.NaN);
        gVar2.f375049b = 0L;
    }
}
