package va3;

/* loaded from: classes12.dex */
public class g0 implements w25.i {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.HashMap f515822a = new java.util.HashMap();

    /* renamed from: b, reason: collision with root package name */
    public final java.util.HashMap f515823b = new java.util.HashMap();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.HashMap f515824c = new java.util.HashMap();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.HashMap f515825d = new java.util.HashMap();

    /* renamed from: e, reason: collision with root package name */
    public final java.util.HashMap f515826e = new java.util.HashMap();

    /* renamed from: f, reason: collision with root package name */
    public final java.util.HashMap f515827f = new java.util.HashMap();

    /* renamed from: g, reason: collision with root package name */
    public final java.util.HashSet f515828g = new java.util.HashSet();

    /* renamed from: h, reason: collision with root package name */
    public int f515829h = 300;

    /* renamed from: i, reason: collision with root package name */
    public int f515830i = 300;

    public g0() {
        a();
    }

    public void a() {
        va3.i0 Ni = va3.j0.Ni();
        java.util.ArrayList arrayList = (java.util.ArrayList) Ni.f515844g;
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (equals((w25.i) it.next())) {
                return;
            }
        }
        arrayList.add(this);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.StaticMapServer", "addMapCallBack " + arrayList.size());
        if (arrayList.size() == 1) {
            gm0.j1.d().a(me1.b.f72880x366c91de, Ni);
        }
    }
}
