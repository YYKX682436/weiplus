package d7;

/* loaded from: classes13.dex */
public class r0 implements t6.j {

    /* renamed from: a, reason: collision with root package name */
    public final java.nio.ByteBuffer f308367a = java.nio.ByteBuffer.allocate(4);

    @Override // t6.j
    public void a(byte[] bArr, java.lang.Object obj, java.security.MessageDigest messageDigest) {
        java.lang.Integer num = (java.lang.Integer) obj;
        if (num == null) {
            return;
        }
        messageDigest.update(bArr);
        synchronized (this.f308367a) {
            this.f308367a.position(0);
            messageDigest.update(this.f308367a.putInt(num.intValue()).array());
        }
    }
}
