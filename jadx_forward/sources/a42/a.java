package a42;

/* loaded from: classes13.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public java.nio.ByteBuffer f82727a;

    /* renamed from: b, reason: collision with root package name */
    public java.nio.ByteBuffer f82728b;

    public a(int i17) {
        iz5.a.g(null, i17 >= 0);
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(i17);
        this.f82728b = allocate;
        this.f82727a = allocate.asReadOnlyBuffer();
        iz5.a.g(null, this.f82728b != null);
        iz5.a.g(null, this.f82727a != null);
    }

    public void a(byte[] bArr, int i17, int i18) {
        iz5.a.g(null, i17 >= 0);
        iz5.a.g(null, i18 >= 0);
        iz5.a.g(null, bArr.length >= i17);
        iz5.a.g(null, bArr.length >= i17 + i18);
        iz5.a.g(null, this.f82727a.remaining() >= i18);
        this.f82727a.get(bArr, i17, i18);
    }

    public void b(byte[] bArr, int i17, int i18) {
        iz5.a.g(null, i17 >= 0);
        iz5.a.g(null, i18 >= 0);
        iz5.a.g(null, bArr != null);
        if (i18 <= this.f82728b.remaining()) {
            this.f82728b.put(bArr, i17, i18);
            return;
        }
        this.f82728b.capacity();
        java.nio.ByteBuffer allocate = java.nio.ByteBuffer.allocate(this.f82728b.capacity() + i18 + 1024);
        int position = this.f82727a.position();
        allocate.put(this.f82728b.array());
        allocate.put(bArr, i17, i18);
        this.f82728b = allocate;
        java.nio.ByteBuffer asReadOnlyBuffer = allocate.asReadOnlyBuffer();
        this.f82727a = asReadOnlyBuffer;
        asReadOnlyBuffer.position(position);
    }
}
