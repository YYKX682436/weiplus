package sf;

/* loaded from: classes7.dex */
public interface f {
    default java.lang.String a(jc1.d dVar) {
        return g(dVar.f380437b);
    }

    default java.lang.String b(jc1.d dVar, java.util.Map map) {
        return h(dVar.f380437b, map);
    }

    org.json.JSONObject c();

    default java.lang.String d(java.lang.String str, jc1.d dVar) {
        return g(str);
    }

    void e(sf.e eVar);

    void f();

    java.lang.String g(java.lang.String str);

    /* renamed from: getAppId */
    java.lang.String mo50271x74292566();

    /* renamed from: getContext */
    android.content.Context mo50272x76847179();

    java.lang.String h(java.lang.String str, java.util.Map map);

    void i(sf.e eVar);

    boolean j();

    boolean k();

    java.lang.String l();

    com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.l m();
}
