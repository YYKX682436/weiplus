package v13;

/* loaded from: classes12.dex */
public final class c extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public java.lang.String f514051n = "";

    /* renamed from: o, reason: collision with root package name */
    public long f514052o;

    /* renamed from: p, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f514053p;

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ long f514054q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ v13.e f514055r;

    public c(java.lang.String str, long j17, v13.e eVar) {
        this.f514053p = str;
        this.f514054q = j17;
        this.f514055r = eVar;
    }

    @Override // p13.c
    public boolean i() {
        com.p314xaae8f345.mm.p1006xc5476f33.fts.o oVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218914f;
        dm.i3 i3Var = new dm.i3();
        java.lang.String input = this.f514053p;
        java.util.regex.Pattern compile = java.util.regex.Pattern.compile("[,|，']");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(compile, "compile(...)");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(input, "input");
        java.lang.String replaceAll = compile.matcher(input).replaceAll("");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(replaceAll, "replaceAll(...)");
        this.f514051n = replaceAll;
        i3Var.y0(replaceAll);
        i3Var.w0(this.f514054q);
        i3Var.z0(c01.id.c());
        this.f514052o = i3Var.m125053x19a4110d(oVar.l(), false);
        final r45.cw5 cw5Var = new r45.cw5();
        cw5Var.f453403d = this.f514051n;
        cw5Var.f453404e = c01.id.c();
        cw5Var.f453406g = this.f514054q == 0;
        java.util.List list = com.p314xaae8f345.mm.p1006xc5476f33.fts.ui.y2.f219913a;
        if (list != null) {
            try {
                list.removeIf(new java.util.function.Predicate() { // from class: com.tencent.mm.plugin.fts.ui.y2$$a
                    @Override // java.util.function.Predicate
                    public final boolean test(java.lang.Object obj) {
                        return ((r45.cw5) obj).f453403d.equals(r45.cw5.this.f453403d);
                    }
                });
                list.add(cw5Var);
                while (list.size() > 30) {
                    list.remove(0);
                }
            } catch (java.lang.Exception e17) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.FTS.FTSSearchPrefixUserInfo", e17, "[fts] updateLatestSearchClickHistory failed.", new java.lang.Object[0]);
            }
        }
        oVar.d();
        this.f514055r.f514064f = dm.i3.f319087g.h(dm.i3.f319088h.h()).a().n(oVar.l());
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "processQuery:" + this.f514051n + " result:" + this.f514052o;
    }
}
