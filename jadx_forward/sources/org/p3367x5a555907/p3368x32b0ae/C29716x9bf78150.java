package org.p3367x5a555907.p3368x32b0ae;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: org.tensorflow.lite.NativeInterpreterWrapper */
/* loaded from: classes13.dex */
public final class C29716x9bf78150 implements java.lang.AutoCloseable {

    /* renamed from: d, reason: collision with root package name */
    public long f429388d;

    /* renamed from: e, reason: collision with root package name */
    public long f429389e;

    /* renamed from: f, reason: collision with root package name */
    public long f429390f;

    /* renamed from: g, reason: collision with root package name */
    public java.nio.ByteBuffer f429391g;

    /* renamed from: h, reason: collision with root package name */
    public org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[] f429392h;

    /* renamed from: i, reason: collision with root package name */
    public org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[] f429393i;

    /* renamed from: m, reason: collision with root package name */
    public boolean f429394m;

    /* renamed from: n, reason: collision with root package name */
    public final java.util.List f429395n = new java.util.ArrayList();

    /* renamed from: o, reason: collision with root package name */
    public final java.util.List f429396o = new java.util.ArrayList();

    public C29716x9bf78150(java.nio.ByteBuffer byteBuffer, org.p3367x5a555907.p3368x32b0ae.c cVar) {
        org.p3367x5a555907.p3368x32b0ae.b bVar;
        java.util.Iterator it;
        boolean z17 = false;
        this.f429394m = false;
        org.p3367x5a555907.p3368x32b0ae.C29718xd6a8d295.a();
        if (byteBuffer == null || !((byteBuffer instanceof java.nio.MappedByteBuffer) || (byteBuffer.isDirect() && byteBuffer.order() == java.nio.ByteOrder.nativeOrder()))) {
            throw new java.lang.IllegalArgumentException("Model ByteBuffer should be either a MappedByteBuffer of the model file, or a direct ByteBuffer using ByteOrder.nativeOrder() which contains bytes of model content.");
        }
        this.f429391g = byteBuffer;
        long m155056x120c9b6d = m155056x120c9b6d(512);
        long m155059x6fe3c13 = m155059x6fe3c13(this.f429391g, m155056x120c9b6d);
        cVar = cVar == null ? new org.p3367x5a555907.p3368x32b0ae.c() : cVar;
        this.f429388d = m155056x120c9b6d;
        this.f429390f = m155059x6fe3c13;
        long m155057xb56f07de = m155057xb56f07de(m155059x6fe3c13, m155056x120c9b6d, -1);
        this.f429389e = m155057xb56f07de;
        this.f429392h = new org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[m155063x3f5b0f5b(m155057xb56f07de)];
        this.f429393i = new org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[m155066xa7260758(this.f429389e)];
        boolean m155070x2d12f65 = m155070x2d12f65(this.f429389e);
        java.util.List list = cVar.f429410a;
        if (m155070x2d12f65) {
            try {
                it = ((java.util.ArrayList) list).iterator();
            } catch (java.lang.Exception unused) {
            }
            while (it.hasNext()) {
                if (org.p3367x5a555907.p3368x32b0ae.p3369x2ffff9.C29719xcc8cbe.class.isInstance((org.p3367x5a555907.p3368x32b0ae.b) it.next())) {
                    bVar = null;
                    break;
                }
            }
            bVar = (org.p3367x5a555907.p3368x32b0ae.b) org.p3367x5a555907.p3368x32b0ae.p3369x2ffff9.C29719xcc8cbe.class.getConstructor(new java.lang.Class[0]).newInstance(new java.lang.Object[0]);
            if (bVar != null) {
                ((java.util.ArrayList) this.f429396o).add((java.lang.AutoCloseable) bVar);
                m155054x39707713(this.f429389e, this.f429388d, bVar.a());
            }
        }
        try {
            java.util.Iterator it6 = ((java.util.ArrayList) list).iterator();
            while (it6.hasNext()) {
                org.p3367x5a555907.p3368x32b0ae.b bVar2 = (org.p3367x5a555907.p3368x32b0ae.b) it6.next();
                m155054x39707713(this.f429389e, this.f429388d, bVar2.a());
                ((java.util.ArrayList) this.f429395n).add(bVar2);
            }
        } catch (java.lang.IllegalArgumentException e17) {
            if (m155070x2d12f65 && !m155070x2d12f65(this.f429389e)) {
                z17 = true;
            }
            if (!z17) {
                throw e17;
            }
            java.lang.System.err.println("Ignoring failed delegate application: " + e17);
        }
        m155051xa848b93d(this.f429389e, m155056x120c9b6d);
        this.f429394m = true;
    }

    /* renamed from: allocateTensors */
    private static native long m155051xa848b93d(long j17, long j18);

    /* renamed from: allowBufferHandleOutput */
    private static native void m155052x78f23cd2(long j17, boolean z17);

    /* renamed from: allowFp16PrecisionForFp32 */
    private static native void m155053x15e75e2c(long j17, boolean z17);

    /* renamed from: applyDelegate */
    private static native void m155054x39707713(long j17, long j18, long j19);

    /* renamed from: createCancellationFlag */
    private static native long m155055xd530302b(long j17);

    /* renamed from: createErrorReporter */
    private static native long m155056x120c9b6d(int i17);

    /* renamed from: createInterpreter */
    private static native long m155057xb56f07de(long j17, long j18, int i17);

    /* renamed from: createModel */
    private static native long m155058xe194a78d(java.lang.String str, long j17);

    /* renamed from: createModelWithBuffer */
    private static native long m155059x6fe3c13(java.nio.ByteBuffer byteBuffer, long j17);

    /* renamed from: delete */
    private static native void m155060xb06685ab(long j17, long j18, long j19);

    /* renamed from: deleteCancellationFlag */
    private static native long m155061x4407d6da(long j17);

    /* renamed from: getExecutionPlanLength */
    private static native int m155062xbf8cb571(long j17);

    /* renamed from: getInputCount */
    private static native int m155063x3f5b0f5b(long j17);

    /* renamed from: getInputNames */
    private static native java.lang.String[] m155064x3fef9594(long j17);

    /* renamed from: getInputTensorIndex */
    private static native int m155065x6a84b145(long j17, int i17);

    /* renamed from: getOutputCount */
    private static native int m155066xa7260758(long j17);

    /* renamed from: getOutputDataType */
    private static native int m155067xc341c71b(long j17, int i17);

    /* renamed from: getOutputNames */
    private static native java.lang.String[] m155068xa7ba8d91(long j17);

    /* renamed from: getOutputTensorIndex */
    private static native int m155069xbd82f782(long j17, int i17);

    /* renamed from: hasUnresolvedFlexOp */
    private static native boolean m155070x2d12f65(long j17);

    /* renamed from: numThreads */
    private static native void m155071x92ebd43(long j17, int i17);

    /* renamed from: resetVariableTensors */
    private static native void m155072x498813cf(long j17, long j18);

    /* renamed from: resizeInput */
    private static native boolean m155073xcb349b76(long j17, long j18, int i17, int[] iArr, boolean z17);

    private static native void run(long j17, long j18);

    /* renamed from: setCancelled */
    private static native void m155074x78295b0f(long j17, long j18, boolean z17);

    /* renamed from: useXNNPACK */
    private static native void m155075xf4d426ca(long j17, long j18, boolean z17, int i17);

    public org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 a(int i17) {
        if (i17 >= 0) {
            org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[] c29717x951a1879Arr = this.f429392h;
            if (i17 < c29717x951a1879Arr.length) {
                org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 c29717x951a1879 = c29717x951a1879Arr[i17];
                if (c29717x951a1879 != null) {
                    return c29717x951a1879;
                }
                long j17 = this.f429389e;
                org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 g17 = org.p3367x5a555907.p3368x32b0ae.C29717x951a1879.g(j17, m155065x6a84b145(j17, i17));
                c29717x951a1879Arr[i17] = g17;
                return g17;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid input Tensor index: " + i17);
    }

    public org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 b(int i17) {
        if (i17 >= 0) {
            org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[] c29717x951a1879Arr = this.f429393i;
            if (i17 < c29717x951a1879Arr.length) {
                org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 c29717x951a1879 = c29717x951a1879Arr[i17];
                if (c29717x951a1879 != null) {
                    return c29717x951a1879;
                }
                long j17 = this.f429389e;
                org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 g17 = org.p3367x5a555907.p3368x32b0ae.C29717x951a1879.g(j17, m155069xbd82f782(j17, i17));
                c29717x951a1879Arr[i17] = g17;
                return g17;
            }
        }
        throw new java.lang.IllegalArgumentException("Invalid output Tensor index: " + i17);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void c(java.lang.Object[] r10, java.util.Map r11) {
        /*
            r9 = this;
            if (r10 == 0) goto Lbf
            int r0 = r10.length
            if (r0 == 0) goto Lbf
            if (r11 == 0) goto Lb7
            boolean r0 = r11.isEmpty()
            if (r0 != 0) goto Lb7
            r0 = 0
            r8 = r0
        Lf:
            int r1 = r10.length
            if (r8 >= r1) goto L4f
            org.tensorflow.lite.Tensor r1 = r9.a(r8)
            r2 = r10[r8]
            r3 = 0
            if (r2 != 0) goto L1d
        L1b:
            r6 = r3
            goto L33
        L1d:
            boolean r4 = r2 instanceof java.nio.Buffer
            if (r4 == 0) goto L22
            goto L1b
        L22:
            r1.l(r2)
            int[] r2 = r1.d(r2)
            int[] r1 = r1.f429399c
            boolean r1 = java.util.Arrays.equals(r1, r2)
            if (r1 == 0) goto L32
            goto L1b
        L32:
            r6 = r2
        L33:
            if (r6 == 0) goto L4c
            r7 = 0
            long r1 = r9.f429389e
            long r3 = r9.f429388d
            r5 = r8
            boolean r1 = m155073xcb349b76(r1, r3, r5, r6, r7)
            if (r1 == 0) goto L4c
            r9.f429394m = r0
            org.tensorflow.lite.Tensor[] r1 = r9.f429392h
            r1 = r1[r8]
            if (r1 == 0) goto L4c
            r1.j()
        L4c:
            int r8 = r8 + 1
            goto Lf
        L4f:
            boolean r1 = r9.f429394m
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == 0) goto L5e
            long r3 = r9.f429389e
            long r5 = r9.f429388d
            m155051xa848b93d(r3, r5)
            r9.f429394m = r2
        L5e:
            r2 = r0
        L5f:
            int r3 = r10.length
            if (r2 >= r3) goto L6e
            org.tensorflow.lite.Tensor r3 = r9.a(r2)
            r4 = r10[r2]
            r3.k(r4)
            int r2 = r2 + 1
            goto L5f
        L6e:
            java.lang.System.nanoTime()
            long r2 = r9.f429389e
            long r4 = r9.f429388d
            run(r2, r4)
            java.lang.System.nanoTime()
            if (r1 == 0) goto L8c
        L7d:
            org.tensorflow.lite.Tensor[] r10 = r9.f429393i
            int r1 = r10.length
            if (r0 >= r1) goto L8c
            r10 = r10[r0]
            if (r10 == 0) goto L89
            r10.j()
        L89:
            int r0 = r0 + 1
            goto L7d
        L8c:
            java.util.Set r10 = r11.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L94:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto Lb6
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r0 = r11.getKey()
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            org.tensorflow.lite.Tensor r0 = r9.b(r0)
            java.lang.Object r11 = r11.getValue()
            r0.e(r11)
            goto L94
        Lb6:
            return
        Lb7:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Input error: Outputs should not be null or empty."
            r10.<init>(r11)
            throw r10
        Lbf:
            java.lang.IllegalArgumentException r10 = new java.lang.IllegalArgumentException
            java.lang.String r11 = "Input error: Inputs should not be null or empty."
            r10.<init>(r11)
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: org.p3367x5a555907.p3368x32b0ae.C29716x9bf78150.c(java.lang.Object[], java.util.Map):void");
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        int i17 = 0;
        while (true) {
            org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[] c29717x951a1879Arr = this.f429392h;
            if (i17 >= c29717x951a1879Arr.length) {
                break;
            }
            org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 c29717x951a1879 = c29717x951a1879Arr[i17];
            if (c29717x951a1879 != null) {
                c29717x951a1879.b();
                this.f429392h[i17] = null;
            }
            i17++;
        }
        int i18 = 0;
        while (true) {
            org.p3367x5a555907.p3368x32b0ae.C29717x951a1879[] c29717x951a1879Arr2 = this.f429393i;
            if (i18 >= c29717x951a1879Arr2.length) {
                break;
            }
            org.p3367x5a555907.p3368x32b0ae.C29717x951a1879 c29717x951a18792 = c29717x951a1879Arr2[i18];
            if (c29717x951a18792 != null) {
                c29717x951a18792.b();
                this.f429393i[i18] = null;
            }
            i18++;
        }
        m155060xb06685ab(this.f429388d, this.f429390f, this.f429389e);
        m155061x4407d6da(0L);
        this.f429388d = 0L;
        this.f429390f = 0L;
        this.f429389e = 0L;
        this.f429391g = null;
        this.f429394m = false;
        ((java.util.ArrayList) this.f429395n).clear();
        java.util.ArrayList arrayList = (java.util.ArrayList) this.f429396o;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            try {
                ((java.lang.AutoCloseable) it.next()).close();
            } catch (java.lang.Exception e17) {
                java.lang.System.err.println("Failed to close flex delegate: " + e17);
            }
        }
        arrayList.clear();
    }
}
