package oi;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f427088a;

    /* renamed from: b, reason: collision with root package name */
    public final int f427089b;

    /* renamed from: c, reason: collision with root package name */
    public pi.e f427090c;

    /* renamed from: d, reason: collision with root package name */
    public final long f427091d;

    /* renamed from: e, reason: collision with root package name */
    public final oi.d f427092e;

    /* renamed from: f, reason: collision with root package name */
    public oi.b f427093f;

    /* renamed from: g, reason: collision with root package name */
    public final long f427094g;

    /* renamed from: h, reason: collision with root package name */
    public final long f427095h;

    /* renamed from: i, reason: collision with root package name */
    public final long f427096i;

    /* renamed from: j, reason: collision with root package name */
    public final long f427097j;

    /* renamed from: k, reason: collision with root package name */
    public final pi.a f427098k;

    /* renamed from: l, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicInteger f427099l;

    public e(oi.d dVar, int i17, java.lang.String str, long j17, long j18) {
        this.f427088a = "";
        this.f427091d = 0L;
        this.f427088a = str;
        this.f427089b = i17;
        this.f427094g = j17;
        this.f427095h = j18;
        this.f427092e = dVar;
        this.f427096i = 0L;
        this.f427097j = 0L;
    }

    public java.lang.String a() {
        pi.e eVar = this.f427090c;
        return eVar == null ? "" : eVar.f436031a;
    }

    public java.lang.String b() {
        oi.h hVar = oi.h.f427100e;
        synchronized (hVar.f427102b) {
            int indexOf = ((java.util.LinkedList) hVar.f427102b).indexOf(this);
            if (-1 == indexOf) {
                return "res already released, can not get native stack";
            }
            oi.e eVar = (oi.e) ((java.util.LinkedList) hVar.f427102b).get(indexOf);
            if (eVar == null) {
                return "";
            }
            long j17 = eVar.f427091d;
            return j17 != 0 ? com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41158xab5661d(j17) : "";
        }
    }

    public boolean c() {
        boolean z17;
        oi.h hVar = oi.h.f427100e;
        synchronized (hVar.f427104d) {
            z17 = !((java.util.ArrayList) hVar.f427104d).contains(java.lang.Long.valueOf(this.f427094g));
        }
        return z17;
    }

    public boolean d() {
        boolean z17;
        oi.h hVar = oi.h.f427100e;
        synchronized (hVar.f427103c) {
            long j17 = this.f427096i;
            long j18 = this.f427097j;
            z17 = true;
            if (j18 != 0 && j17 != 0) {
                java.util.Iterator it = hVar.f427103c.iterator();
                boolean z18 = false;
                boolean z19 = false;
                while (it.hasNext()) {
                    long longValue = ((java.lang.Long) it.next()).longValue();
                    if (longValue == j18) {
                        z18 = true;
                    }
                    if (longValue == j17) {
                        z19 = true;
                    }
                }
                if (!z18 || !z19) {
                    if (!z18) {
                        z18 = !com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41180xa6b2ec0(j18);
                    }
                    if (!z19) {
                        z19 = !com.p314xaae8f345.p552xbf8d97c1.p576x36747892.p578x30f523.C4700x74d81a92.m41180xa6b2ec0(j17);
                    }
                    if (z18) {
                        ((java.util.LinkedList) hVar.f427103c).add(java.lang.Long.valueOf(j18));
                    }
                    if (z19) {
                        ((java.util.LinkedList) hVar.f427103c).add(java.lang.Long.valueOf(j17));
                    }
                    if (!z18 || !z19) {
                        z17 = false;
                    }
                }
            }
        }
        return z17;
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0025, code lost:
    
        if (r6 == r9.f427095h) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0032, code lost:
    
        if (r3 != r9.f427092e) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x002e, code lost:
    
        if (r8.f427094g == r9.f427094g) goto L20;
     */
    /* renamed from: equals */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean m151423xb2c87fbf(java.lang.Object r9) {
        /*
            r8 = this;
            r0 = 1
            if (r8 != r9) goto L4
            return r0
        L4:
            boolean r1 = r9 instanceof oi.e
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            oi.e r9 = (oi.e) r9
            int r1 = r9.f427089b
            int r3 = r8.f427089b
            if (r3 != r1) goto L35
            oi.d r1 = oi.d.EGL_CONTEXT
            oi.d r3 = r8.f427092e
            if (r3 == r1) goto L28
            r4 = 0
            long r6 = r8.f427095h
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L21
            goto L28
        L21:
            long r4 = r9.f427095h
            int r1 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r1 != 0) goto L35
            goto L30
        L28:
            long r4 = r8.f427094g
            long r6 = r9.f427094g
            int r1 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r1 != 0) goto L35
        L30:
            oi.d r9 = r9.f427092e
            if (r3 != r9) goto L35
            goto L36
        L35:
            r0 = r2
        L36:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.e.m151423xb2c87fbf(java.lang.Object):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r5 == 0) goto L6;
     */
    /* renamed from: hashCode */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int m151424x8cdac1b() {
        /*
            r7 = this;
            r0 = 3
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r1 = r7.f427089b
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r2 = 0
            r0[r2] = r1
            oi.d r1 = oi.d.EGL_CONTEXT
            oi.d r2 = r7.f427092e
            if (r2 == r1) goto L1a
            r3 = 0
            long r5 = r7.f427095h
            int r1 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r1 != 0) goto L1c
        L1a:
            long r5 = r7.f427094g
        L1c:
            java.lang.Long r1 = java.lang.Long.valueOf(r5)
            r3 = 1
            r0[r3] = r1
            r1 = 2
            r0[r1] = r2
            int r0 = java.util.Objects.hash(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: oi.e.m151424x8cdac1b():int");
    }

    /* renamed from: toString */
    public java.lang.String m151425x9616526c() {
        return "OpenGLInfo{id=" + this.f427089b + ", activityName=" + this.f427098k + ", type='" + this.f427092e.toString() + "', threadId='" + this.f427088a + "', eglContextNativeHandle='" + this.f427094g + "', eglContextGroup='" + this.f427095h + "', eglContextReleased='" + c() + "', eglSurfaceReleased='" + d() + "', javaStack='" + a() + "', nativeStack='" + b() + "', nativeStackPtr=" + this.f427091d + ", memoryInfo=" + this.f427093f + '}';
    }

    public e(oi.d dVar, int i17, java.lang.String str, long j17, long j18, long j19, long j27, pi.e eVar, long j28, pi.a aVar, java.util.concurrent.atomic.AtomicInteger atomicInteger) {
        this.f427088a = "";
        this.f427091d = 0L;
        this.f427088a = str;
        this.f427090c = eVar;
        this.f427091d = j28;
        this.f427092e = dVar;
        this.f427098k = aVar;
        this.f427099l = atomicInteger;
        this.f427089b = i17;
        this.f427094g = j17;
        this.f427095h = j18;
        this.f427096i = j19;
        this.f427097j = j27;
    }
}
