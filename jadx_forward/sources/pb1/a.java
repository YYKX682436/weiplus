package pb1;

/* loaded from: classes7.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c f434660a;

    public a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c theResult) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(theResult, "theResult");
        this.f434660a = theResult;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x004f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0050 A[RETURN] */
    /* renamed from: equals */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m158041xb2c87fbf(java.lang.Object r6) {
        /*
            r5 = this;
            r0 = 1
            if (r5 != r6) goto L4
            return r0
        L4:
            java.lang.Class<pb1.a> r1 = pb1.a.class
            if (r6 == 0) goto Ld
            java.lang.Class r2 = r6.getClass()
            goto Le
        Ld:
            r2 = 0
        Le:
            boolean r1 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(r1, r2)
            r2 = 0
            if (r1 != 0) goto L16
            return r2
        L16:
            java.lang.String r1 = "null cannot be cast to non-null type com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.BleScanPrinter.Companion.ScanResult"
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(r6, r1)
            pb1.a r6 = (pb1.a) r6
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat r1 = r5.f434660a
            android.bluetooth.BluetoothDevice r3 = r1.a()
            com.tencent.mm.plugin.appbrand.jsapi.bluetooth.sdk.scan.ScanResultCompat r6 = r6.f434660a
            android.bluetooth.BluetoothDevice r4 = r6.a()
            boolean r3 = pb1.w.b(r3, r4)
            if (r3 == 0) goto L4c
            pb1.z r1 = r1.f161640e
            pb1.z r6 = r6.f161640e
            if (r1 != 0) goto L37
            if (r6 == 0) goto L45
        L37:
            if (r1 == 0) goto L47
            if (r6 == 0) goto L47
            byte[] r1 = r1.f434703g
            byte[] r6 = r6.f434703g
            boolean r6 = java.util.Arrays.equals(r1, r6)
            if (r6 == 0) goto L47
        L45:
            r6 = r0
            goto L48
        L47:
            r6 = r2
        L48:
            if (r6 == 0) goto L4c
            r6 = r0
            goto L4d
        L4c:
            r6 = r2
        L4d:
            if (r6 != 0) goto L50
            return r2
        L50:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: pb1.a.m158041xb2c87fbf(java.lang.Object):boolean");
    }

    /* renamed from: hashCode */
    public int m158042x8cdac1b() {
        java.lang.Object[] objArr = new java.lang.Object[2];
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c c12040xecd7293c = this.f434660a;
        objArr[0] = c12040xecd7293c.a();
        pb1.z zVar = c12040xecd7293c.f161640e;
        objArr[1] = java.lang.Integer.valueOf(java.util.Arrays.hashCode(zVar != null ? zVar.f434703g : null));
        return java.util.Arrays.hashCode(objArr);
    }

    /* renamed from: toString */
    public java.lang.String m158043x9616526c() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("{rssi: ");
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c c12040xecd7293c = this.f434660a;
        sb6.append(c12040xecd7293c.f161641f);
        sb6.append(", timestampNanos: ");
        sb6.append(c12040xecd7293c.f161642g);
        sb6.append('}');
        return sb6.toString();
    }
}
