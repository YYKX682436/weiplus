package o85;

/* loaded from: classes14.dex */
public final class c implements v5.g {

    /* renamed from: c, reason: collision with root package name */
    public static final java.lang.String[] f425207c = {"image/jpeg", "image/webp", "image/heic", "image/heif"};

    /* renamed from: a, reason: collision with root package name */
    public final android.content.Context f425208a;

    /* renamed from: b, reason: collision with root package name */
    public final android.graphics.Paint f425209b;

    public c(android.content.Context context) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f425208a = context;
        this.f425209b = new android.graphics.Paint(3);
    }

    /* JADX WARN: Code restructure failed: missing block: B:157:0x00a6, code lost:
    
        if ((android.os.Build.VERSION.SDK_INT >= 26 && r12 == android.graphics.Bitmap.Config.HARDWARE) != false) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x022b, code lost:
    
        if ((r3.top == 0.0f ? true : r7) == false) goto L124;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final v5.e c(o85.c r26, s5.a r27, x36.h0 r28, p135x2eae8f.p138x35e001.AbstractC1421x275421 r29, v5.k r30) {
        /*
            Method dump skipped, instructions count: 688
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: o85.c.c(o85.c, s5.a, x36.h0, coil.size.Size, v5.k):v5.e");
    }

    @Override // v5.g
    public boolean a(x36.m source, java.lang.String str) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(source, "source");
        return true;
    }

    @Override // v5.g
    public java.lang.Object b(s5.a aVar, x36.m mVar, p135x2eae8f.p138x35e001.AbstractC1421x275421 abstractC1421x275421, v5.k kVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(interfaceC29045xdcb5ca57), 1);
        rVar.k();
        try {
            v5.j jVar = new v5.j(rVar, mVar);
            try {
                rVar.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(c(this, aVar, jVar, abstractC1421x275421, kVar)));
                java.lang.Object j17 = rVar.j();
                pz5.a aVar2 = pz5.a.f440719d;
                return j17;
            } finally {
                jVar.a();
            }
        } catch (java.lang.Exception e17) {
            if (!(e17 instanceof java.lang.InterruptedException) && !(e17 instanceof java.io.InterruptedIOException)) {
                throw e17;
            }
            java.lang.Throwable initCause = new java.util.concurrent.CancellationException("Blocking call was interrupted due to parent cancellation.").initCause(e17);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(initCause, "CancellationException(\"B…n.\").initCause(exception)");
            throw initCause;
        }
    }
}
