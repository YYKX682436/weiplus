package gi2;

/* loaded from: classes10.dex */
public abstract class e extends gi2.d {

    /* renamed from: c, reason: collision with root package name */
    public final android.content.Context f353802c;

    /* renamed from: d, reason: collision with root package name */
    public final lj2.v0 f353803d;

    /* renamed from: e, reason: collision with root package name */
    public final lj2.x0 f353804e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f353805f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.LinkedList f353806g;

    public e(android.content.Context context, lj2.v0 pluginAbility, lj2.x0 service) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(pluginAbility, "pluginAbility");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(service, "service");
        this.f353802c = context;
        this.f353803d = pluginAbility;
        this.f353804e = service;
        this.f353805f = new java.util.HashMap();
        this.f353806g = new java.util.LinkedList();
        new android.graphics.Rect();
    }

    public final void e(java.util.LinkedList data) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(data, 10));
        java.util.Iterator it = data.iterator();
        while (it.hasNext()) {
            arrayList.add(((xh2.a) it.next()).b());
        }
        java.util.HashMap hashMap = this.f353805f;
        java.util.Iterator it6 = hashMap.entrySet().iterator();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicBaseVoiceRoomAdapter", "checkRemoveCacheView before: " + hashMap.size());
        while (it6.hasNext()) {
            java.lang.Object key = ((java.util.Map.Entry) it6.next()).getKey();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(key, "<get-key>(...)");
            java.util.List f07 = r26.n0.f0((java.lang.String) key, new java.lang.String[]{"@"}, false, 0, 6, null);
            java.lang.String str = f07.isEmpty() ^ true ? (java.lang.String) f07.get(0) : "";
            java.lang.String str2 = str != null ? str : "";
            java.util.Iterator it7 = arrayList.iterator();
            while (true) {
                if (!it7.hasNext()) {
                    obj = null;
                    break;
                } else {
                    obj = it7.next();
                    if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b((java.lang.String) obj, str2)) {
                        break;
                    }
                }
            }
            if (obj == null) {
                it6.remove();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("FinderLiveMicBaseVoiceRoomAdapter", "checkRemoveCacheView after: " + hashMap.size());
    }

    public abstract android.view.View f(xh2.a aVar, int i17);

    public xh2.a g(int i17) {
        java.lang.Object obj = this.f353806g.get(i17);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(obj, "get(...)");
        return (xh2.a) obj;
    }

    public final int h(xh2.a aVar) {
        km2.q qVar = aVar.f536053a;
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(qVar != null ? qVar.f390703a : null, this.f353803d.a0().p())) {
            return 1;
        }
        km2.q qVar2 = aVar.f536053a;
        if (qVar2 == null || aVar.f536054b.f536089h) {
            return (qVar2 == null && aVar.f536054b.f536089h) ? 3 : 0;
        }
        return 2;
    }

    public abstract java.lang.String i();

    public void j(java.util.LinkedList data, android.graphics.Rect viewRect) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(viewRect, "viewRect");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(i(), "updateData data: " + data);
        e(data);
        java.util.LinkedList linkedList = this.f353806g;
        linkedList.clear();
        linkedList.addAll(data);
        c();
    }
}
