package xz2;

/* loaded from: classes8.dex */
public class e implements xz2.a {
    @Override // xz2.a
    public void a(int i17, long j17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, int i18, float f17, int i19, boolean z17, int i27, com.p314xaae8f345.mm.p944x882e457a.u0 u0Var) {
        android.os.Bundle bundle = new android.os.Bundle();
        bundle.putString("err_msg", "ok");
        bundle.putString("key_pic_cdn_id", str);
        bundle.putString("key_cdn_aes_key", str2);
        bundle.putString("k_bio_id", j17 + "");
        bundle.putInt("check_alive_type", i18);
        bundle.putBoolean("selfHandle", true);
        xz2.d dVar = new xz2.d();
        dVar.f539741d = bundle;
        u0Var.mo815x76e0bfae(0, 0, "ok", dVar);
    }

    @Override // xz2.a
    public java.lang.String b() {
        return "faceverify_ticket";
    }

    @Override // xz2.a
    /* renamed from: getType */
    public int mo176188xfb85f7b0() {
        return 0;
    }
}
