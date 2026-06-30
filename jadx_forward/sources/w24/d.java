package w24;

/* loaded from: classes.dex */
public final class d extends xm3.a {

    /* renamed from: n, reason: collision with root package name */
    public static int f524145n;

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f524146d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f524147e;

    /* renamed from: f, reason: collision with root package name */
    public android.view.View f524148f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f524149g;

    /* renamed from: h, reason: collision with root package name */
    public yz5.l f524150h;

    /* renamed from: i, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f524151i;

    /* renamed from: m, reason: collision with root package name */
    public android.view.ViewGroup.LayoutParams f524152m;

    public d(java.lang.String key, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        key = (i17 & 1) != 0 ? "" : key;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f524146d = key;
        java.lang.String str = "GroupItem@UniqueId_" + f524145n;
        f524145n++;
        this.f524147e = str;
        this.f524149g = new java.util.ArrayList();
    }

    @Override // xm3.d
    public boolean X(java.lang.Object obj) {
        w24.d other = (w24.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        java.util.ArrayList arrayList = (java.util.ArrayList) other.f524149g;
        if (arrayList.size() != ((java.util.ArrayList) this.f524149g).size()) {
            return false;
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        int i17 = 0;
        while (it.hasNext()) {
            java.lang.Object next = it.next();
            int i18 = i17 + 1;
            if (i17 < 0) {
                kz5.c0.p();
                throw null;
            }
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b((w24.l) next, r1.get(i17))) {
                arrayList2.add(next);
            }
            i17 = i18;
        }
        return arrayList2.isEmpty();
    }

    @Override // xm3.a
    /* renamed from: clone */
    public java.lang.Object mo14053x5a5dd5d() {
        return super.mo14053x5a5dd5d();
    }

    @Override // java.lang.Comparable
    public int compareTo(java.lang.Object obj) {
        w24.d other = (w24.d) obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(other, "other");
        return 0;
    }

    public final void n(w24.l item) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(item, "item");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupListControl", this + ' ' + this.f524146d + " switch addItem: " + item.f524160a);
        if (item.f524161b != null) {
            throw new java.lang.IllegalArgumentException("parent is not null! this item has attach parent: " + item.f524161b);
        }
        item.f524161b = this;
        yz5.l lVar = this.f524150h;
        if (lVar != null) {
            lVar.mo146xb9724478(this);
        }
        ((java.util.ArrayList) this.f524149g).add(item);
    }

    public final void o(yz5.l notifyCallback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(notifyCallback, "notifyCallback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GroupListControl", this + ' ' + this.f524146d + " bindNotifyCallback");
        this.f524150h = notifyCallback;
    }

    public final w24.l p(java.lang.String key) {
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.util.Iterator it = this.f524149g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((w24.l) obj).f524160a, key)) {
                break;
            }
        }
        return (w24.l) obj;
    }

    @Override // xm3.d
    public java.lang.String v() {
        java.lang.String str = this.f524146d;
        return str.length() == 0 ? this.f524147e : str;
    }
}
