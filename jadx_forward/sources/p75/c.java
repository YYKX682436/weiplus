package p75;

/* loaded from: classes12.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab f434155a;

    /* renamed from: b, reason: collision with root package name */
    public final android.os.CancellationSignal f434156b;

    public c(com.p314xaae8f345.p3121x37984a.p3130x91727fcf.C26987xeef691ab cancellationSignal, l75.k0 sqlLiteDB) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cancellationSignal, "cancellationSignal");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sqlLiteDB, "sqlLiteDB");
        this.f434155a = cancellationSignal;
        android.os.CancellationSignal cancellationSignal2 = new android.os.CancellationSignal();
        this.f434156b = cancellationSignal2;
        if (sqlLiteDB.a()) {
            cancellationSignal2.setOnCancelListener(new p75.a(this));
            cancellationSignal.m108010x20974f48(new p75.b(this));
        }
    }
}
