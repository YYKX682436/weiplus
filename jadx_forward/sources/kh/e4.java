package kh;

/* loaded from: classes10.dex */
public final class e4 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f389322d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ android.view.ViewTreeObserver f389323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f389324f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e4(android.content.Context context, android.view.ViewTreeObserver viewTreeObserver, java.lang.String str) {
        super(1);
        this.f389322d = context;
        this.f389323e = viewTreeObserver;
        this.f389324f = str;
    }

    @Override // yz5.l
    /* renamed from: invoke */
    public java.lang.Object mo146xb9724478(java.lang.Object obj) {
        java.util.List list = (java.util.List) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("dumpObservers: context=");
        android.content.Context context = this.f389322d;
        sb6.append(context);
        sb6.append("(isFinishing=");
        sb6.append(((android.app.Activity) context).isFinishing());
        sb6.append("), observer=");
        sb6.append(this.f389323e);
        sb6.append(", ");
        java.lang.String str = this.f389324f;
        sb6.append(str);
        sb6.append(" size=");
        sb6.append(list.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", sb6.toString());
        java.util.Iterator it = list.iterator();
        while (it.hasNext()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Matrix.battery.TraversalTracker", " - " + kh.y3.f389487d.a(it.next()));
        }
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.List V = kz5.n0.V(list);
        java.util.LinkedHashMap linkedHashMap2 = new java.util.LinkedHashMap();
        java.util.Iterator it6 = ((java.util.ArrayList) V).iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            java.lang.String name = next.getClass().getName();
            java.lang.Object obj2 = linkedHashMap2.get(name);
            if (obj2 == null) {
                obj2 = new java.util.ArrayList();
                linkedHashMap2.put(name, obj2);
            }
            ((java.util.List) obj2).add(next);
        }
        for (java.util.Map.Entry entry : kz5.c1.q(kz5.n0.F0(kz5.e1.v(linkedHashMap2), new kh.d4())).entrySet()) {
            java.lang.String str2 = (java.lang.String) entry.getKey();
            java.util.List list2 = (java.util.List) entry.getValue();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str2);
            linkedHashMap.put(str2, list2);
        }
        ap.a.a(1, "errTrackTraversal", null, linkedHashMap, "leaking", context.getClass().getName(), str);
        return jz5.f0.f384359a;
    }
}
