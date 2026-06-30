package p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873;

/* loaded from: classes14.dex */
public final class w2 {

    /* renamed from: a, reason: collision with root package name */
    public android.os.Parcel f92317a;

    public w2() {
        android.os.Parcel obtain = android.os.Parcel.obtain();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obtain, "obtain()");
        this.f92317a = obtain;
    }

    public final void a(byte b17) {
        this.f92317a.writeByte(b17);
    }

    public final void b(float f17) {
        this.f92317a.writeFloat(f17);
    }

    public final void c(long j17) {
        long b17 = p2.t.b(j17);
        byte b18 = 0;
        if (!p2.v.a(b17, 0L)) {
            if (p2.v.a(b17, 4294967296L)) {
                b18 = 1;
            } else if (p2.v.a(b17, 8589934592L)) {
                b18 = 2;
            }
        }
        a(b18);
        if (p2.v.a(p2.t.b(j17), 0L)) {
            return;
        }
        b(p2.t.c(j17));
    }
}
