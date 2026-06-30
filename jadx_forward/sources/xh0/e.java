package xh0;

/* loaded from: classes11.dex */
public class e implements vh0.f1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f536019a;

    /* renamed from: b, reason: collision with root package name */
    public final android.content.ContentValues f536020b = new android.content.ContentValues(8);

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ xh0.b f536021c;

    public e(xh0.b bVar, java.lang.String str, xh0.c cVar) {
        this.f536021c = bVar;
        this.f536019a = str;
    }

    public boolean a() {
        dm.w1 w1Var = new dm.w1();
        w1Var.mo9762xbf5d97fd(this.f536020b, true);
        w1Var.m125649x66ad9b78(this.f536019a);
        java.lang.String str = this.f536019a;
        p75.d dVar = dm.w1.f322252r;
        p75.i0 h17 = dm.w1.f322251q.h(dVar);
        h17.f434190d = dVar.j(str);
        h17.f434189c = "MicroMsg.SDK.BaseChatBotConfig";
        h17.c(1, 0);
        if (!(!h17.a().h(this.f536021c.f536007d) ? super/*l75.n0*/.mo880xb970c2b9(w1Var) : super/*l75.n0*/.mo9952xce0038c9(w1Var, new java.lang.String[0]))) {
            return false;
        }
        for (java.util.Map.Entry<java.lang.String, java.lang.Object> entry : this.f536020b.valueSet()) {
            xh0.d dVar2 = (xh0.d) ((java.util.HashMap) xh0.b.f536006r).get(entry.getKey());
            if (dVar2 == null) {
                throw new java.lang.NullPointerException("cannot find corresponding CachedValue of db column '" + entry.getKey() + '\"');
            }
            java.lang.String str2 = this.f536019a;
            java.lang.Object value = entry.getValue();
            synchronized (dVar2) {
                ((java.util.HashMap) dVar2.f536017b).put(str2, value);
            }
        }
        return true;
    }

    public vh0.f1 b(java.lang.String str) {
        this.f536020b.put("shortcutList", str);
        return this;
    }
}
