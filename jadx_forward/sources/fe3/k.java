package fe3;

/* loaded from: classes7.dex */
public class k implements oq1.p {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f343090a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd f343091b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ boolean f343092c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ jc3.m0 f343093d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fe3.j f343094e;

    public k(fe3.j jVar, java.lang.String str, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd, boolean z17, jc3.m0 m0Var) {
        this.f343094e = jVar;
        this.f343090a = str;
        this.f343091b = c16421xe4d4fcd;
        this.f343092c = z17;
        this.f343093d = m0Var;
    }

    @Override // oq1.p
    public void b(oq1.q qVar) {
        fe3.j jVar = this.f343094e;
        java.lang.String str = this.f343090a;
        jVar.getClass();
        jc3.t wi6 = ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.b7) ((com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.o4.class))).wi("MagicPkgSyncSTORAGE", null);
        if (wi6 != null) {
            long currentTimeMillis = java.lang.System.currentTimeMillis();
            lc3.z g17 = ((ue3.f) wi6).g("MagicPkgIntervalTime" + str, java.lang.String.valueOf(currentTimeMillis), "String");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "pkg:%s,set interval time:%d,errNo:%d,errMsg:%s", str, java.lang.Long.valueOf(currentTimeMillis), java.lang.Integer.valueOf(g17.f399477a), g17.f399478b);
        } else {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.MagicPkgLogic", "pkg:%s,set interval time fail mmkv is nil", str);
        }
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f428882d)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkgWithBoots, url is null, lowerPkgId:" + this.f343090a);
            jc3.m0 m0Var = this.f343093d;
            if (m0Var != null) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd = this.f343091b;
                if (c16421xe4d4fcd != null) {
                    m0Var.K(c16421xe4d4fcd);
                } else {
                    m0Var.J("url is nil");
                }
            }
            this.f343094e.j(this.f343090a, this.f343091b, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37586x3e0f4e8, 2, 10000, this.f343092c);
            return;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.api.C16421xe4d4fcd c16421xe4d4fcd2 = this.f343091b;
        if (c16421xe4d4fcd2 != null && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(c16421xe4d4fcd2.f229399o) && !com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(qVar.f428890l) && com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(this.f343091b.f229399o, 0) >= com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.P(qVar.f428890l, 0)) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "checkMagicPkgWithBoots, pkgId:%s,patchId:%s,cur version:%s big than svr version:%s", qVar.f428888j, qVar.f428884f, this.f343091b.f229399o, qVar.f428890l);
            this.f343094e.j(this.f343090a, this.f343091b, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37586x3e0f4e8, 2, com.p314xaae8f345.p3006xb8ff1437.p3059xeb76ee26.p3061x5a71016.C26489x58a14bb2.f54056xf1449bd6, this.f343092c);
            jc3.m0 m0Var2 = this.f343093d;
            if (m0Var2 != null) {
                m0Var2.J("cur version big than svr version");
                return;
            }
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.MagicPkgLogic", "start to download magicpkg:%s,patchid:%s,url:%s", qVar.f428888j, qVar.f428884f, qVar.f428882d);
        fe3.i.INSTANCE.a(qVar, this.f343091b, this.f343090a, this.f343093d);
        this.f343094e.j(this.f343090a, this.f343091b, 0, com.p314xaae8f345.mm.p1006xc5476f33.p1832x5dc4f1ad.p1845xc84c5534.EnumC16453x290f8fed.f37586x3e0f4e8, 1, 0, this.f343092c);
        if (this.f343090a.equalsIgnoreCase("MagicPkgConfig".toLowerCase())) {
            if (fe3.e.f343074a == null) {
                synchronized (fe3.e.class) {
                    fe3.e.f343074a = new fe3.e();
                }
            }
            fe3.e.f343074a.getClass();
        }
    }
}
