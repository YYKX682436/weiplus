package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Parcel f92198a;

    public n2(java.lang.String string) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(string, "string");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain()");
        this.f92198a = obtain;
        byte[] decode = android.util.Base64.decode(string, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final int a() {
        return this.f92198a.dataAvail();
    }

    public final float b() {
        return this.f92198a.readFloat();
    }

    public final long c() {
        byte readByte = this.f92198a.readByte();
        long j17 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return p2.v.a(j17, 0L) ? p2.t.f432934c : p2.u.d(j17, b());
    }
}
