package c82;

/* loaded from: classes4.dex */
public final class c extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final c82.c f121199d = new c82.c();

    public c() {
        super(0);
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.lang.String str = gm0.j1.u().h() + "/enFavorite.db";
        h62.d dVar = (h62.d) ((e42.e0) i95.n0.c(e42.e0.class));
        int i17 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.aj("clicfg_wcdb2_perfopts_sync_checkpoint", "0"), "1") ? 16 : 0;
        int i18 = p3321xbce91901.jvm.p3324x21ffc6bd.o.b(dVar.aj("clicfg_wcdb2_perfopts_trace_sql", "0"), "1") ? 8 : 0;
        int i19 = i17 | 1 | i18;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FavDBProvider", "Open enFavorite.db, syncCp: " + i17 + ", trace: " + i18);
        return d95.q.a(str, c82.f.f121206a, i19);
    }
}
