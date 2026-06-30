package yh5;

/* loaded from: classes12.dex */
public final class g extends lf3.n implements qf3.b {

    /* renamed from: d, reason: collision with root package name */
    public java.util.List f543965d;

    /* renamed from: e, reason: collision with root package name */
    public int[] f543966e;

    /* renamed from: f, reason: collision with root package name */
    public java.util.BitSet f543967f;

    /* renamed from: g, reason: collision with root package name */
    public int f543968g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(p012xc85e97e9.p016x746ad0e3.app.ActivityC0065xcd7aa112 activity) {
        super(activity);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(activity, "activity");
        this.f543965d = kz5.p0.f395529d;
        this.f543966e = new int[0];
        this.f543967f = new java.util.BitSet();
        this.f543968g = -1;
    }

    @Override // qf3.b
    public boolean X0(android.content.Intent intent, qf3.a listener) {
        java.util.List list;
        java.util.BitSet bitSet;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(intent, "intent");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listener, "listener");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanMediaDataProvider", "fetch");
        mf3.f fVar = new mf3.f();
        java.lang.String str = "";
        java.lang.String stringExtra = intent.getStringExtra("clean_gallery_target_file_path");
        yh5.a aVar = yh5.a.f543952a;
        synchronized (aVar) {
            list = yh5.a.f543953b;
        }
        synchronized (aVar) {
            bitSet = yh5.a.f543954c;
        }
        this.f543967f = bitSet;
        java.lang.Iterable Z0 = kz5.n0.Z0(list);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = ((kz5.v0) Z0).iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            java.lang.Object obj = ((kz5.u0) next).f395549b;
            if (((bw1.l) obj).f106343b == 1 || ((bw1.l) obj).f106343b == 3) {
                arrayList.add(next);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it6 = arrayList.iterator();
        while (it6.hasNext()) {
            arrayList2.add((bw1.l) ((kz5.u0) it6.next()).f395549b);
        }
        this.f543965d = arrayList2;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(arrayList, 10));
        java.util.Iterator it7 = arrayList.iterator();
        while (it7.hasNext()) {
            arrayList3.add(java.lang.Integer.valueOf(((kz5.u0) it7.next()).f395548a));
        }
        this.f543966e = kz5.n0.R0(arrayList3);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanMediaDataProvider", "data size=" + this.f543965d.size() + " displayToOrigin=" + this.f543966e.length);
        for (bw1.l lVar : this.f543965d) {
            yh5.h hVar = new yh5.h(lVar);
            fVar.add(hVar);
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(stringExtra, lVar.f106345d)) {
                this.f543968g = fVar.size() - 1;
                str = hVar.mo2110x5db1b11();
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("CleanMediaDataProvider", "enterId=" + str + " selection=" + this.f543968g);
        lf3.c0 c0Var = (lf3.c0) listener;
        c0Var.Y6(str);
        c0Var.X6(fVar, false);
        listener.T3(this.f543968g);
        return true;
    }
}
