package rk1;

/* loaded from: classes7.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g f477933a;

    /* renamed from: b, reason: collision with root package name */
    public final long f477934b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f477935c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7 f477936d;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1130x6aeeee6f.g jsEngine, long j17, java.nio.ByteBuffer byteBuffer, com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7 c7115x3f2395b7) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(jsEngine, "jsEngine");
        this.f477933a = jsEngine;
        this.f477934b = j17;
        this.f477935c = byteBuffer;
        this.f477936d = c7115x3f2395b7;
    }

    /* renamed from: equals */
    public boolean m162539xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk1.d)) {
            return false;
        }
        rk1.d dVar = (rk1.d) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477933a, dVar.f477933a) && this.f477934b == dVar.f477934b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477935c, dVar.f477935c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f477936d, dVar.f477936d);
    }

    /* renamed from: hashCode */
    public int m162540x8cdac1b() {
        int hashCode = ((this.f477933a.hashCode() * 31) + java.lang.Long.hashCode(this.f477934b)) * 31;
        java.nio.ByteBuffer byteBuffer = this.f477935c;
        int hashCode2 = (hashCode + (byteBuffer == null ? 0 : byteBuffer.hashCode())) * 31;
        com.p314xaae8f345.mm.p632xd97a1f41.p635xc02f2d4a.rpt.C7115x3f2395b7 c7115x3f2395b7 = this.f477936d;
        return hashCode2 + (c7115x3f2395b7 != null ? c7115x3f2395b7.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m162541x9616526c() {
        return "TaskData(jsEngine=" + this.f477933a + ", task=" + this.f477934b + ", funcList=" + this.f477935c + ", reportStruct=" + this.f477936d + ')';
    }
}
