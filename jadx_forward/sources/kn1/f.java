package kn1;

/* loaded from: classes12.dex */
public abstract class f extends kn1.a {

    /* renamed from: g, reason: collision with root package name */
    public static int f391134g;

    /* renamed from: h, reason: collision with root package name */
    public static byte[] f391135h = "key".getBytes();

    /* renamed from: i, reason: collision with root package name */
    public static android.content.SharedPreferences f391136i;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f391137b = dm.i4.f66865x76d1ec5a;

    /* renamed from: c, reason: collision with root package name */
    public java.lang.String f391138c = "hello";

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f391139d = "ok";

    /* renamed from: e, reason: collision with root package name */
    public kn1.g f391140e;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f391141f;

    public static android.content.SharedPreferences d() {
        if (f391136i == null) {
            f391136i = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.getSharedPreferences("BACKUP_CONFIG", 4);
        }
        return f391136i;
    }

    public abstract void c(java.lang.Object... objArr);

    public synchronized kn1.g e() {
        if (this.f391140e == null) {
            this.f391140e = new kn1.g();
        }
        return this.f391140e;
    }

    public abstract void f();

    public abstract void g();
}
