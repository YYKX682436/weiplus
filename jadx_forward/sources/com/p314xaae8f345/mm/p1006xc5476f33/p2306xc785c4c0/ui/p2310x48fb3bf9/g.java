package com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9;

/* loaded from: classes8.dex */
public class g implements wu5.h {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.s97 f256725d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f256726e;

    public g(com.p314xaae8f345.mm.p1006xc5476f33.p2306xc785c4c0.ui.p2310x48fb3bf9.j jVar, r45.s97 s97Var, java.lang.String str) {
        this.f256725d = s97Var;
        this.f256726e = str;
    }

    @Override // wu5.h, wu5.g
    /* renamed from: getKey */
    public java.lang.String mo1867xb5884f29() {
        return "TopStory.CacheHomeData";
    }

    @Override // java.lang.Runnable
    public void run() {
        r45.jn6 jn6Var = new r45.jn6();
        r45.s97 s97Var = this.f256725d;
        jn6Var.f459512h = s97Var.f467122h.f452357f;
        jn6Var.f459509e = c01.id.c();
        r45.bk5 bk5Var = s97Var.f467122h;
        jn6Var.f459510f = bk5Var.f452355d;
        jn6Var.f459511g = bk5Var.f452356e;
        jn6Var.f459508d = this.f256726e;
        jn6Var.f459513i = bk5Var.f452358g;
        ((wm4.p) i95.n0.c(wm4.p.class)).wi().f256579f.put(java.lang.Integer.valueOf(jn6Var.f459512h), jn6Var);
        try {
            byte[] mo14344x5f01b1f6 = jn6Var.mo14344x5f01b1f6();
            com.p314xaae8f345.mm.vfs.z7 a17 = com.p314xaae8f345.mm.vfs.z7.a(pm4.w.g());
            java.lang.String str = a17.f294812f;
            if (str != null) {
                java.lang.String l17 = com.p314xaae8f345.mm.vfs.e8.l(str, false, false);
                if (!str.equals(l17)) {
                    a17 = new com.p314xaae8f345.mm.vfs.z7(a17.f294810d, a17.f294811e, l17, a17.f294813g, a17.f294814h);
                }
            }
            com.p314xaae8f345.mm.vfs.b3 b3Var = com.p314xaae8f345.mm.vfs.a3.f294314a;
            com.p314xaae8f345.mm.vfs.z2 m17 = b3Var.m(a17, null);
            if (!(!m17.a() ? false : m17.f294799a.F(m17.f294800b))) {
                com.p314xaae8f345.mm.vfs.z2 m18 = b3Var.m(a17, m17);
                if (m18.a()) {
                    m18.f294799a.r(m18.f294800b);
                }
            }
            com.p314xaae8f345.mm.vfs.w6.R(pm4.w.g() + jn6Var.f459512h, mo14344x5f01b1f6);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TopStory.TopStoryWebViewMgr", "putHomeDataCache write data key: %d length: %d", java.lang.Integer.valueOf(jn6Var.f459512h), java.lang.Integer.valueOf(mo14344x5f01b1f6.length));
        } catch (java.io.IOException e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.TopStory.TopStoryWebViewMgr", e17, "putHomeDataCache ", new java.lang.Object[0]);
        }
        ((wm4.p) i95.n0.c(wm4.p.class)).wi().d(jn6Var.f459512h, "");
    }
}
