package at4;

/* loaded from: classes9.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f95495a;

    /* renamed from: b, reason: collision with root package name */
    public final int f95496b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f95497c;

    /* renamed from: d, reason: collision with root package name */
    public final int f95498d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n f95499e;

    public t() {
        this.f95495a = 0;
        this.f95496b = 0;
        this.f95497c = "";
        this.f95498d = 0;
        this.f95499e = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n();
    }

    public t(android.os.Bundle bundle) {
        this.f95495a = 0;
        this.f95496b = 0;
        this.f95497c = "";
        this.f95498d = 0;
        this.f95499e = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n();
        this.f95495a = bundle.getInt("key_is_gen_cert", 0);
        this.f95496b = bundle.getInt("key_is_hint_crt", 0);
        this.f95498d = bundle.getInt("key_is_ignore_cert", 0);
        bundle.getString("key_crt_token", "");
        java.lang.String string = bundle.getString("key_crt_wording", "");
        this.f95497c = string;
        this.f95499e = new com.p314xaae8f345.mm.p2802xd031a825.p2804x633fb29.n(string);
    }
}
