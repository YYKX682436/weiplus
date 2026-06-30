package se1;

/* loaded from: classes13.dex */
public class l {

    /* renamed from: a, reason: collision with root package name */
    public final re1.b f488323a;

    /* renamed from: b, reason: collision with root package name */
    public final se1.p f488324b;

    /* renamed from: c, reason: collision with root package name */
    public final se1.n f488325c;

    /* renamed from: d, reason: collision with root package name */
    public final re1.d f488326d;

    /* renamed from: e, reason: collision with root package name */
    public final te1.s f488327e;

    /* renamed from: f, reason: collision with root package name */
    public final se1.d f488328f;

    public l(re1.b bVar, te1.c cVar, te1.s sVar) {
        if (this.f488328f == null) {
            this.f488328f = new se1.j(null, null);
        }
        this.f488325c = new se1.a0("com.tencent.mm.video", new ve1.f(), this.f488328f, cVar, new ve1.c(sVar.f499369p, sVar.f()), sVar);
        this.f488324b = new se1.p();
        this.f488323a = bVar;
        if (bVar != null) {
            this.f488326d = new re1.d(bVar, qe1.a.a().f443559k);
        }
        this.f488327e = sVar;
    }

    public se1.g a(java.lang.String str, java.lang.String str2) {
        se1.n nVar = this.f488325c;
        nVar.f488352u = str2;
        re1.d dVar = this.f488326d;
        if (dVar != null) {
            dVar.f475844k = str2;
        }
        se1.p pVar = this.f488324b;
        pVar.getClass();
        boolean z17 = !android.webkit.URLUtil.isNetworkUrl(str);
        int i17 = ve1.g.f517615a;
        boolean z18 = !android.text.TextUtils.isEmpty(str) && str.startsWith("file:///android_asset");
        boolean z19 = !android.text.TextUtils.isEmpty(str) && str.startsWith("android.resource://");
        if (z18) {
            se1.b bVar = new se1.b(qe1.a.a().f443549a);
            ve1.g.p(4, str2 + "DataSourceBuilder", "play asset file, dataSource:" + bVar, null);
            return bVar;
        }
        if (z19) {
            se1.c0 c0Var = new se1.c0(qe1.a.a().f443549a);
            ve1.g.p(4, str2 + "DataSourceBuilder", "play raw file, dataSource:" + c0Var, null);
            return c0Var;
        }
        if (z17) {
            ve1.g.p(4, str2 + "DataSourceBuilder", "play local file, dataSource:" + pVar, null);
            return pVar;
        }
        if (this.f488323a == null || !qe1.a.a().f443552d) {
            ve1.g.p(5, str2 + "DataSourceBuilder", "cache disabled, dataSource:" + nVar, null);
            return nVar;
        }
        re1.f fVar = new re1.f(this.f488323a, nVar, pVar, this.f488327e.f499365l ? dVar : null, false, true, new se1.k(this));
        fVar.f475866v = str2;
        ve1.g.p(4, str2 + "DataSourceBuilder", "cache enabled, dataSource:" + fVar, null);
        return fVar;
    }
}
