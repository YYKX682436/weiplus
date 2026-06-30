package vp5;

/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f520639a;

    /* renamed from: b, reason: collision with root package name */
    public final java.nio.ByteBuffer f520640b;

    /* renamed from: c, reason: collision with root package name */
    public final java.nio.ByteBuffer f520641c;

    public f(java.nio.ByteBuffer foregroundPermission, java.nio.ByteBuffer backgroundPermission, java.nio.ByteBuffer suspendPermission) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(foregroundPermission, "foregroundPermission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(backgroundPermission, "backgroundPermission");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(suspendPermission, "suspendPermission");
        this.f520639a = foregroundPermission;
        this.f520640b = backgroundPermission;
        this.f520641c = suspendPermission;
    }

    public final void a(f56.k packer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packer, "packer");
        packer.f(3);
        java.nio.ByteBuffer duplicate = this.f520639a.duplicate();
        duplicate.rewind();
        int remaining = duplicate.remaining();
        byte[] bArr = new byte[remaining];
        duplicate.get(bArr);
        packer.i(remaining);
        packer.C(bArr);
        java.nio.ByteBuffer duplicate2 = this.f520640b.duplicate();
        duplicate2.rewind();
        int remaining2 = duplicate2.remaining();
        byte[] bArr2 = new byte[remaining2];
        duplicate2.get(bArr2);
        packer.i(remaining2);
        packer.C(bArr2);
        java.nio.ByteBuffer duplicate3 = this.f520641c.duplicate();
        duplicate3.rewind();
        int remaining3 = duplicate3.remaining();
        byte[] bArr3 = new byte[remaining3];
        duplicate3.get(bArr3);
        packer.i(remaining3);
        packer.C(bArr3);
    }

    /* renamed from: equals */
    public boolean m172458xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vp5.f)) {
            return false;
        }
        vp5.f fVar = (vp5.f) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520639a, fVar.f520639a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520640b, fVar.f520640b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f520641c, fVar.f520641c);
    }

    /* renamed from: hashCode */
    public int m172459x8cdac1b() {
        return (((this.f520639a.hashCode() * 31) + this.f520640b.hashCode()) * 31) + this.f520641c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m172460x9616526c() {
        return "JsApiPermission(foregroundPermission=" + this.f520639a + ", backgroundPermission=" + this.f520640b + ", suspendPermission=" + this.f520641c + ")";
    }
}
