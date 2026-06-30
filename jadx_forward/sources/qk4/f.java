package qk4;

/* loaded from: classes10.dex */
public final class f implements qk4.b {

    /* renamed from: a, reason: collision with root package name */
    public final p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 f445976a;

    /* renamed from: b, reason: collision with root package name */
    public final int f445977b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.String f445978c;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f445979d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentLinkedDeque f445980e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentHashMap f445981f;

    public f(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity, int i17, int i18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f445976a = activity;
        this.f445977b = i17;
        this.f445978c = "TP.Recycler";
        this.f445979d = "MicroMsg.TP.MMVideoLayoutRecycler";
        this.f445980e = new java.util.concurrent.ConcurrentLinkedDeque();
        this.f445981f = new java.util.concurrent.ConcurrentHashMap();
    }

    public qk4.a a() {
        java.lang.String str;
        java.util.concurrent.ConcurrentLinkedDeque concurrentLinkedDeque = this.f445980e;
        com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806 c18698xd8450806 = (com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806) kz5.n0.Y(concurrentLinkedDeque);
        if (c18698xd8450806 != null) {
            concurrentLinkedDeque.remove(c18698xd8450806);
            str = "from idle queue";
        } else {
            c18698xd8450806 = new com.p314xaae8f345.mm.p1006xc5476f33.p2278xb8ff1437.p2282x373aa5.p2283xd0e2e03f.C18698xd8450806(this.f445976a);
            str = "from create";
        }
        c18698xd8450806.setId(this.f445977b);
        this.f445981f.put(c18698xd8450806, java.lang.Long.valueOf(c01.id.c()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f445979d, "getOrCreateVideoLayout ".concat(str));
        return c18698xd8450806;
    }
}
