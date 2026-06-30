package j36;

/* loaded from: classes13.dex */
public class d extends j36.m0 {

    /* renamed from: f, reason: collision with root package name */
    public int f379061f = 0;

    public d() {
        this.f379073e = 260;
    }

    public byte[] i(byte[] bArr) {
        int length = bArr.length;
        this.f379061f = length;
        byte[] bArr2 = new byte[length];
        java.lang.System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
        b(this.f379073e);
        a(bArr2, this.f379061f);
        g();
        return c();
    }
}
