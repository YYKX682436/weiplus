package s50;

@j95.b
/* loaded from: classes5.dex */
public final class k0 extends jm0.o implements u50.w {

    /* renamed from: m, reason: collision with root package name */
    public static boolean f484603m;

    @Override // jm0.o
    public void Di(java.util.HashSet set) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(set, "set");
        set.add(v13.e.class);
    }

    public boolean Zi() {
        boolean l17 = j62.e.g().l("clicfg_android_use_search_global_sug_stick_bottom", false, true, true);
        if (f484603m != l17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FTSSearchFeatureService", "enableSearchGlobalSugStickBottom: " + f484603m + " -> " + l17);
            f484603m = l17;
        }
        return f484603m;
    }

    public void aj(java.lang.String query, long j17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(query, "query");
        if (!jm0.g.class.isAssignableFrom(v13.e.class)) {
            throw new java.lang.IllegalArgumentException(getClass().getName().concat(" must extends FeatureServiceComponent"));
        }
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new jm0.e(this)).a(v13.e.class);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        v13.e eVar = (v13.e) ((jm0.g) a17);
        com.p314xaae8f345.mm.p1006xc5476f33.fts.t tVar = ((com.p314xaae8f345.mm.p1006xc5476f33.fts.d0) i95.n0.c(com.p314xaae8f345.mm.p1006xc5476f33.fts.d0.class)).f218912d;
        if (tVar != null) {
            tVar.b(65536, new v13.c(query, j17, eVar));
        }
    }
}
