package cx0;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f306033a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f306034b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f306035c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.EnumSet f306036d;

    /* renamed from: e, reason: collision with root package name */
    public final cx0.e f306037e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Set f306038f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.Set f306039g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.Set f306040h;

    public c(java.util.List inserts, java.util.List deletes, java.util.List updates, java.util.EnumSet options, cx0.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(inserts, "inserts");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(deletes, "deletes");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(updates, "updates");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(options, "options");
        this.f306033a = inserts;
        this.f306034b = deletes;
        this.f306035c = updates;
        this.f306036d = options;
        this.f306037e = eVar;
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(inserts, 10));
        java.util.Iterator it = inserts.iterator();
        while (it.hasNext()) {
            arrayList.add(((cx0.b) it.next()).f306029a);
        }
        this.f306038f = kz5.n0.X0(arrayList);
        java.util.List list = this.f306034b;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        java.util.Iterator it6 = list.iterator();
        while (it6.hasNext()) {
            arrayList2.add(((cx0.b) it6.next()).f306029a);
        }
        this.f306039g = kz5.n0.X0(arrayList2);
        java.util.List list2 = this.f306035c;
        java.util.ArrayList arrayList3 = new java.util.ArrayList(kz5.d0.q(list2, 10));
        java.util.Iterator it7 = list2.iterator();
        while (it7.hasNext()) {
            arrayList3.add(((cx0.b) it7.next()).f306029a);
        }
        this.f306040h = kz5.n0.X0(arrayList3);
    }

    public final boolean a() {
        return (this.f306033a.size() + this.f306034b.size()) + this.f306035c.size() > 0;
    }

    /* renamed from: toString */
    public java.lang.String m123063x9616526c() {
        java.lang.StringBuilder sb6;
        java.lang.StringBuilder sb7;
        java.lang.StringBuilder sb8;
        java.util.List list = this.f306033a;
        if (list.isEmpty()) {
            sb6 = new java.lang.StringBuilder();
            sb6.append(list.size());
            sb6.append(" inserts");
        } else {
            sb6 = new java.lang.StringBuilder();
            sb6.append(list.size());
            sb6.append(" inserts\n");
            sb6.append(list);
        }
        java.lang.String sb9 = sb6.toString();
        java.util.List list2 = this.f306034b;
        if (list2.isEmpty()) {
            sb7 = new java.lang.StringBuilder();
            sb7.append(list2.size());
            sb7.append(" deletes");
        } else {
            sb7 = new java.lang.StringBuilder();
            sb7.append(list2.size());
            sb7.append(" deletes\n");
            sb7.append(list2);
        }
        java.lang.String sb10 = sb7.toString();
        java.util.List list3 = this.f306035c;
        if (list3.isEmpty()) {
            sb8 = new java.lang.StringBuilder();
            sb8.append(list3.size());
            sb8.append(" updates");
        } else {
            sb8 = new java.lang.StringBuilder();
            sb8.append(list3.size());
            sb8.append(" updates\n");
            sb8.append(list3);
        }
        return "TimelineMutationInfo " + super.toString() + "; \n" + sb9 + " \n" + sb10 + " \n" + sb8.toString() + '>';
    }
}
