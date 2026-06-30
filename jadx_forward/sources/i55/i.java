package i55;

/* loaded from: classes8.dex */
public final class i extends i55.d {

    /* renamed from: e, reason: collision with root package name */
    public java.lang.ref.WeakReference f370385e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f370386f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i() {
        super(2);
        f55.e eVar = f55.e.f341304e;
        this.f370386f = true;
    }

    @Override // i55.d
    public void a(java.lang.ref.WeakReference weakView) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(weakView, "weakView");
        this.f370385e = weakView;
    }

    @Override // i55.d
    public boolean b(java.lang.String key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(this.f370373a);
        sb6.append('@');
        if (r26.i0.y(key, sb6.toString(), false)) {
            return true;
        }
        java.lang.String str = com.p314xaae8f345.mm.sdk.p2603x2137b148.z.f274638a;
        return false;
    }

    @Override // i55.d
    public java.lang.String c(java.lang.String eventId) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(eventId, "eventId");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        java.lang.String lowerCase = "FindMoreFriendsUI".toLowerCase(java.util.Locale.ROOT);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(lowerCase, "toLowerCase(...)");
        sb6.append(lowerCase);
        sb6.append('_');
        sb6.append(eventId);
        return sb6.toString();
    }

    @Override // i55.d
    public java.util.Map d() {
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        linkedHashMap.put("is_show_all_item", java.lang.Integer.valueOf(this.f370386f ? 1 : 2));
        return linkedHashMap;
    }

    @Override // i55.d
    public void e(long j17) {
        android.view.View view;
        java.lang.ref.WeakReference weakReference = this.f370385e;
        if (weakReference != null && (view = (android.view.View) weakReference.get()) != null && (view instanceof android.widget.AbsListView)) {
            android.widget.AbsListView absListView = (android.widget.AbsListView) view;
            int firstVisiblePosition = absListView.getFirstVisiblePosition();
            int childCount = absListView.getChildCount();
            int count = absListView.getCount();
            this.f370386f = firstVisiblePosition + childCount >= count && count != 0;
        }
        super.e(j17);
    }

    @Override // i55.d
    public void f(long j17, java.lang.String prefKey) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prefKey, "prefKey");
        super.f(j17, prefKey);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendTabRedDotLogic", j17 + "  " + prefKey + " on click");
    }

    @Override // i55.d
    public void h(java.lang.String event, g55.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(event, "event");
        java.util.Objects.toString(eVar);
        java.util.Map a17 = eVar != null ? eVar.a() : new java.util.LinkedHashMap();
        e55.e eVar2 = e55.e.f331200a;
        a17.putAll(eVar2.j());
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        int i17 = this.f370373a;
        sb6.append(i17);
        sb6.append(" callRedDotEvent ");
        sb6.append(event);
        sb6.append(' ');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FindMoreFriendTabRedDotLogic", sb6.toString());
        com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5893x481fedbf c5893x481fedbf = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5893x481fedbf();
        am.jq jqVar = c5893x481fedbf.f136201g;
        jqVar.f88595a = i17;
        jqVar.f88596b = event;
        if (eVar != null) {
            java.lang.String str = eVar.f350495a;
            jqVar.f88598d = str;
            jqVar.f88597c = eVar2.a(str);
            jqVar.f88599e = a17;
        }
        c5893x481fedbf.e();
        ((cy1.a) ((dy1.r) i95.n0.c(dy1.r.class))).Ej(event, a17, 32024);
    }
}
