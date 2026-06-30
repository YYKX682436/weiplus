package oz;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f431675a;

    /* renamed from: b, reason: collision with root package name */
    public final oz.a f431676b;

    /* renamed from: c, reason: collision with root package name */
    public final oz.v f431677c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Set f431678d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.Set f431679e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f431680f;

    public b(java.lang.String name, oz.a config) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(config, "config");
        this.f431675a = name;
        this.f431676b = config;
        this.f431677c = new oz.v();
        this.f431678d = new java.util.LinkedHashSet();
        this.f431679e = new java.util.LinkedHashSet();
        this.f431680f = new java.util.LinkedHashSet();
    }

    public final void a() {
        java.lang.String sceneName = this.f431676b.f431674d;
        oz.v vVar = this.f431677c;
        vVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(sceneName, "sceneName");
        vVar.f431729c = com.p314xaae8f345.mm.sdk.p2603x2137b148.o4.J("auto_download_task_queue", gm0.j1.b().h(), 2);
        vVar.f431730d = sceneName.length() == 0 ? "tasks" : "tasks_".concat(sceneName);
        vVar.f431727a = new com.p314xaae8f345.mm.p2621x8fb0427b.x9();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.o4 o4Var = vVar.f431729c;
        byte[] j17 = o4Var != null ? o4Var.j(vVar.f431730d) : null;
        if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.M0(j17)) {
            return;
        }
        try {
            vVar.f431727a.mo11468x92b714fd(j17);
            vVar.f431727a.f277869d.size();
        } catch (java.lang.Exception e17) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.AutoDownloadTaskQueue", "load: parseFailed, key=" + vVar.f431730d + ", error=" + e17);
        }
    }

    public final void b() {
        this.f431678d.clear();
        this.f431679e.clear();
        this.f431680f.clear();
        java.util.LinkedHashMap linkedHashMap = this.f431677c.f431728b;
        int size = linkedHashMap.size();
        linkedHashMap.clear();
        if (size > 0) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AutoDownloadTaskQueue", "clearNonPersistent: cleared " + size + " tasks");
        }
    }
}
