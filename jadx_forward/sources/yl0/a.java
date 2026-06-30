package yl0;

/* loaded from: classes13.dex */
public class a implements ol0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f544488a;

    public a(java.lang.String str) {
        this.f544488a = str;
    }

    @Override // ol0.b
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.XgboostEnv", "download fail");
    }

    @Override // ol0.b
    public void b(java.lang.String str) {
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
        java.lang.String str2 = this.f544488a;
        if (!str2.equals(p17)) {
            em0.e.a(13L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.XgboostEnv", "md5 check fail %s %s", str2, p17);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str3 = a17.f294812f;
            if (str3 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
                if (!str3.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.z2 m17 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a17, null);
            if (m17.a()) {
                m17.f294799a.d(m17.f294800b);
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.XgboostEnv", "download succ");
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str4 = a18.f294812f;
        if (str4 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str4, false, false);
            if (!str4.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m18.a() ? m18.f294799a.F(m18.f294800b) : false) {
            java.lang.String str5 = yl0.b.f544490b;
            if (ol0.d.a(str, str5)) {
                em0.e.a(14L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.XgboostEnv", "decompress succ save: %s", str5);
            } else {
                em0.e.a(15L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.XgboostEnv", "decompress fail %s", str5);
            }
        }
    }
}
