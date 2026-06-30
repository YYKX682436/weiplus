package gk2;

/* loaded from: classes3.dex */
public final class e extends gk2.g implements p012xc85e97e9.p093xedfae76a.y {

    /* renamed from: n, reason: collision with root package name */
    public static gk2.e f354004n;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f354005f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f354006g;

    /* renamed from: h, reason: collision with root package name */
    public p012xc85e97e9.p093xedfae76a.b0 f354007h;

    /* renamed from: i, reason: collision with root package name */
    public yg2.b f354008i;

    /* renamed from: m, reason: collision with root package name */
    public final gk2.h f354009m;

    static {
        new gk2.b(null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String tag) {
        super(tag);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(tag, "tag");
        this.f354005f = tag;
        this.f354006g = "LiveBuContext_TAG";
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveBuContext_TAG", "init name = " + tag + ", hashCode = " + hashCode());
        this.f354007h = new p012xc85e97e9.p093xedfae76a.b0(this, true);
        this.f354008i = new yg2.b(this, "liveScope");
        this.f354009m = new gk2.h();
    }

    public final p012xc85e97e9.p093xedfae76a.c1 a(java.lang.Class bu6) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(bu6, "bu");
        p012xc85e97e9.p093xedfae76a.c1 a17 = new p012xc85e97e9.p093xedfae76a.j1(getViewModel(), new gk2.a(this)).a(bu6);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(a17, "get(...)");
        return a17;
    }

    public void b() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f354006g, "clear name = " + this.f354005f + ", hashCode = " + hashCode());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("LiveContext clear ");
        sb6.append(this.f354012d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveContext", sb6.toString());
        try {
            java.util.LinkedList<mm2.e> linkedList = new java.util.LinkedList();
            gk2.f fVar = this.f354012d;
            synchronized (fVar) {
                java.util.Iterator it = fVar.entrySet().iterator();
                while (it.hasNext()) {
                    java.lang.Object value = ((java.util.Map.Entry) it.next()).getValue();
                    mm2.e eVar = value instanceof mm2.e ? (mm2.e) value : null;
                    if (eVar != null) {
                        linkedList.add(eVar);
                    }
                }
            }
            for (mm2.e eVar2 : linkedList) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiveContext", "[reset] " + eVar2.hashCode());
                eVar2.mo528x82b764cd();
                eVar2.f410497e.mo10668x2efc64();
            }
        } catch (java.lang.Exception e17) {
            hc2.c.a(e17, "LiveContext clear");
        }
        pm0.v.X(new gk2.d(this));
    }

    @Override // p012xc85e97e9.p093xedfae76a.y
    /* renamed from: getLifecycle */
    public p012xc85e97e9.p093xedfae76a.o mo273xed6858b4() {
        return this.f354007h;
    }

    /* renamed from: toString */
    public java.lang.String m131705x9616526c() {
        return this.f354005f + '_' + a(mm2.c1.class);
    }

    public /* synthetic */ e(java.lang.String str, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this((i17 & 1) != 0 ? "" : str);
    }
}
