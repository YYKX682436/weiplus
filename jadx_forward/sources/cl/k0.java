package cl;

/* loaded from: classes7.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public com.p159x477cd522.p160x333422.C1470x40840ff7 f124204a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p159x477cd522.p160x333422.C1455x795052ca f124205b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f124206c;

    /* renamed from: d, reason: collision with root package name */
    public final cl.q0 f124207d;

    public k0(cl.q0 v86, com.p159x477cd522.p160x333422.C1470x40840ff7 v8Buffer, cl.i0 i0Var) {
        java.nio.ByteBuffer m16341x3970ce7c;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v86, "v8");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v8Buffer, "v8Buffer");
        this.f124207d = v86;
        this.f124204a = v8Buffer;
        if (i0Var == cl.i0.f124192e && !v8Buffer.m16341x3970ce7c().isReadOnly()) {
            java.nio.ByteBuffer m16341x3970ce7c2 = v8Buffer.m16341x3970ce7c();
            m16341x3970ce7c = m16341x3970ce7c2 != null ? m16341x3970ce7c2.asReadOnlyBuffer() : null;
        } else {
            m16341x3970ce7c = v8Buffer.m16341x3970ce7c();
        }
        this.f124206c = m16341x3970ce7c;
    }

    public k0(cl.q0 v86, com.p159x477cd522.p160x333422.C1455x795052ca byteBufferHolder, cl.i0 i0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(v86, "v8");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(byteBufferHolder, "byteBufferHolder");
        this.f124207d = v86;
        this.f124205b = byteBufferHolder;
        java.nio.ByteBuffer m15823x4471cd3a = byteBufferHolder.m15823x4471cd3a();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(m15823x4471cd3a);
        if (i0Var == cl.i0.f124192e && !m15823x4471cd3a.isReadOnly()) {
            m15823x4471cd3a = m15823x4471cd3a.asReadOnlyBuffer();
        }
        this.f124206c = m15823x4471cd3a;
    }
}
