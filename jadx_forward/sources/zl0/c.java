package zl0;

/* loaded from: classes13.dex */
public class c implements ol0.b {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ zl0.a f555093a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f555094b;

    public c(zl0.a aVar, java.lang.String str) {
        this.f555093a = aVar;
        this.f555094b = str;
    }

    @Override // ol0.b
    public void a() {
        em0.e.a(11L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.ModelManager", "download file %s", this.f555093a.mo179080x9616526c());
    }

    @Override // ol0.b
    public void b(java.lang.String str) {
        em0.e.a(10L);
        java.lang.String p17 = com.p314xaae8f345.mm.vfs.w6.p(str);
        zl0.a aVar = this.f555093a;
        if (!aVar.f555090b.equals(p17)) {
            em0.e.a(13L);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.ModelManager", "md5 check fail %s %s", aVar.mo179080x9616526c(), p17);
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(str);
            java.lang.String str2 = a17.f294812f;
            if (str2 != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str2, false, false);
                if (!str2.equals(l17)) {
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
        em0.e.a(12L);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.ModelManager", "download succ %s", aVar.mo179080x9616526c());
        com.p314xaae8f345.mm.vfs.z7 a18 = com.p314xaae8f345.mm.vfs.z7.a(str);
        java.lang.String str3 = a18.f294812f;
        if (str3 != null) {
            java.lang.String l18 = com.p314xaae8f345.mm.vfs.e8.l(str3, false, false);
            if (!str3.equals(l18)) {
                a18 = new com.p314xaae8f345.mm.vfs.z7(a18.f294810d, a18.f294811e, l18, a18.f294813g, a18.f294814h);
            }
        }
        com.p314xaae8f345.mm.vfs.z2 m18 = com.p314xaae8f345.mm.vfs.a3.f294314a.m(a18, null);
        if (m18.a() ? m18.f294799a.F(m18.f294800b) : false) {
            java.lang.String str4 = this.f555094b;
            if (ol0.d.a(str, str4)) {
                em0.e.a(14L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Kara.ModelManager", "decompress succ save: %s", str4);
            } else {
                em0.e.a(15L);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("Kara.ModelManager", "decompress fail %s", str4);
            }
        }
    }
}
