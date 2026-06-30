package x51;

/* loaded from: classes12.dex */
public class t0 implements com.p314xaae8f345.mm.sdk.p2603x2137b148.g6 {

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Bitmap f533617d = null;

    /* renamed from: e, reason: collision with root package name */
    public final x51.o0 f533618e;

    public t0(x51.o0 o0Var) {
        if (!x51.w0.b(o0Var)) {
            throw new java.lang.IllegalArgumentException("from sdcard, picture strategy here must be validity");
        }
        this.f533618e = o0Var;
    }

    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    public boolean a() {
        x51.o0 o0Var = this.f533618e;
        android.graphics.Bitmap b17 = x51.v0.b(o0Var.k());
        this.f533617d = b17;
        if (b17 != null) {
            this.f533617d = x51.v0.INSTANCE.g(o0Var, b17);
        }
        o0Var.g();
        o0Var.k();
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001f, code lost:
    
        if ((r3 == null || r3.size() == 0) != false) goto L14;
     */
    @Override // com.p314xaae8f345.mm.sdk.p2603x2137b148.g6
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean b() {
        /*
            r7 = this;
            android.graphics.Bitmap r0 = r7.f533617d
            r1 = 0
            x51.o0 r2 = r7.f533618e
            if (r0 != 0) goto L37
            r2.g()
            x51.v0 r0 = x51.v0.INSTANCE
            com.tencent.mm.sdk.platformtools.i6 r3 = r0.f533634f
            r4 = 1
            if (r3 == 0) goto L21
            java.util.Vector r3 = r3.f274278g
            if (r3 == 0) goto L1e
            int r3 = r3.size()
            if (r3 != 0) goto L1c
            goto L1e
        L1c:
            r3 = r1
            goto L1f
        L1e:
            r3 = r4
        L1f:
            if (r3 == 0) goto L2c
        L21:
            com.tencent.mm.sdk.platformtools.i6 r3 = new com.tencent.mm.sdk.platformtools.i6
            java.lang.String r5 = "readerapp-pic-logic-download"
            r6 = 3
            r3.<init>(r4, r5, r6)
            r0.f533634f = r3
        L2c:
            com.tencent.mm.sdk.platformtools.i6 r0 = r0.f533634f
            x51.s0 r3 = new x51.s0
            r3.<init>(r2)
            r0.a(r3)
            goto L49
        L37:
            x51.v0 r0 = x51.v0.INSTANCE
            java.lang.String r3 = r2.g()
            java.lang.String r2 = r2.c()
            android.graphics.Bitmap r4 = r7.f533617d
            x51.v0.a(r0, r3, r2, r4)
            r0 = 0
            r7.f533617d = r0
        L49:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: x51.t0.b():boolean");
    }
}
