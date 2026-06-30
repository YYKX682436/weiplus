package pb1;

/* loaded from: classes7.dex */
public final class b implements pb1.v {

    /* renamed from: d, reason: collision with root package name */
    public static final boolean f434661d;

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f434662a;

    /* renamed from: b, reason: collision with root package name */
    public java.util.Map f434663b;

    /* renamed from: c, reason: collision with root package name */
    public int f434664c;

    static {
        f434661d = com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40535xf2ceb016() <= 1;
    }

    public b(java.lang.String tag) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f434662a = tag;
    }

    @Override // pb1.v
    public void a(int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1073x755ac2ae.sdk.p1074x35c67d.C12040xecd7293c resultCompat) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resultCompat, "resultCompat");
        if (f434661d) {
            resultCompat.m50740x9616526c();
            return;
        }
        java.util.Map map = this.f434663b;
        if (map == null) {
            map = new java.util.HashMap();
            this.f434663b = map;
        }
        pb1.a aVar = new pb1.a(resultCompat);
        java.lang.Integer num = (java.lang.Integer) map.get(aVar);
        java.lang.String str = this.f434662a;
        if (num != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, "onScanResult, id: " + num + ", result: " + aVar);
            return;
        }
        int i18 = this.f434664c;
        this.f434664c = i18 + 1;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(i18);
        map.put(aVar, valueOf);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("onScanResult, id: ");
        sb6.append(valueOf);
        sb6.append(", result: ");
        java.lang.String m50740x9616526c = aVar.f434660a.m50740x9616526c();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m50740x9616526c, "toString(...)");
        sb6.append(m50740x9616526c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
    }
}
