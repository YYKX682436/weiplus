package androidx.compose.ui.platform;

/* loaded from: classes14.dex */
public final class n2 {

    /* renamed from: a, reason: collision with root package name */
    public final android.os.Parcel f10665a;

    public n2(java.lang.String string) {
        kotlin.jvm.internal.o.g(string, "string");
        android.os.Parcel obtain = android.os.Parcel.obtain();
        kotlin.jvm.internal.o.f(obtain, "obtain()");
        this.f10665a = obtain;
        byte[] decode = android.util.Base64.decode(string, 0);
        obtain.unmarshall(decode, 0, decode.length);
        obtain.setDataPosition(0);
    }

    public final int a() {
        return this.f10665a.dataAvail();
    }

    public final float b() {
        return this.f10665a.readFloat();
    }

    public final long c() {
        byte readByte = this.f10665a.readByte();
        long j17 = readByte == 1 ? 4294967296L : readByte == 2 ? 8589934592L : 0L;
        return p2.v.a(j17, 0L) ? p2.t.f351401c : p2.u.d(j17, b());
    }
}
