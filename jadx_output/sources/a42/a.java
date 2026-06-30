package a42;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f1194a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f1195b;

    public a(int i17) {
        iz5.a.g(null, i17 >= 0);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i17);
        this.f1195b = allocate;
        this.f1194a = allocate.asReadOnlyBuffer();
        iz5.a.g(null, this.f1195b != null);
        iz5.a.g(null, this.f1194a != null);
    }

    public void a(byte[] bArr, int i17, int i18) {
        iz5.a.g(null, i17 >= 0);
        iz5.a.g(null, i18 >= 0);
        iz5.a.g(null, bArr.length >= i17);
        iz5.a.g(null, bArr.length >= i17 + i18);
        iz5.a.g(null, this.f1194a.remaining() >= i18);
        this.f1194a.get(bArr, i17, i18);
    }

    public void b(byte[] bArr, int i17, int i18) {
        iz5.a.g(null, i17 >= 0);
        iz5.a.g(null, i18 >= 0);
        iz5.a.g(null, bArr != null);
        if (i18 <= this.f1195b.remaining()) {
            this.f1195b.put(bArr, i17, i18);
            return;
        }
        this.f1195b.capacity();
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(this.f1195b.capacity() + i18 + 1024);
        int position = this.f1194a.position();
        allocate.put(this.f1195b.array());
        allocate.put(bArr, i17, i18);
        this.f1195b = allocate;
        java.nio.ByteBuffer asReadOnlyBuffer = allocate.asReadOnlyBuffer();
        this.f1194a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(position);
    }
}
