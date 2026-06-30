package at4;

/* loaded from: classes9.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    public final int f13962a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13963b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f13964c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13965d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.wallet_core.model.n f13966e;

    public t() {
        this.f13962a = 0;
        this.f13963b = 0;
        this.f13964c = "";
        this.f13965d = 0;
        this.f13966e = new com.tencent.mm.wallet_core.model.n();
    }

    public t(android.os.Bundle bundle) {
        this.f13962a = 0;
        this.f13963b = 0;
        this.f13964c = "";
        this.f13965d = 0;
        this.f13966e = new com.tencent.mm.wallet_core.model.n();
        this.f13962a = bundle.getInt("key_is_gen_cert", 0);
        this.f13963b = bundle.getInt("key_is_hint_crt", 0);
        this.f13965d = bundle.getInt("key_is_ignore_cert", 0);
        bundle.getString("key_crt_token", "");
        java.lang.String string = bundle.getString("key_crt_wording", "");
        this.f13964c = string;
        this.f13966e = new com.tencent.mm.wallet_core.model.n(string);
    }
}
