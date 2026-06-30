package y16;

/* loaded from: classes16.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final y16.h f540476c = new y16.h(null);

    /* renamed from: d, reason: collision with root package name */
    public static int f540477d = 1;

    /* renamed from: e, reason: collision with root package name */
    public static final int f540478e;

    /* renamed from: f, reason: collision with root package name */
    public static final int f540479f;

    /* renamed from: g, reason: collision with root package name */
    public static final int f540480g;

    /* renamed from: h, reason: collision with root package name */
    public static final int f540481h;

    /* renamed from: i, reason: collision with root package name */
    public static final int f540482i;

    /* renamed from: j, reason: collision with root package name */
    public static final int f540483j;

    /* renamed from: k, reason: collision with root package name */
    public static final int f540484k;

    /* renamed from: l, reason: collision with root package name */
    public static final int f540485l;

    /* renamed from: m, reason: collision with root package name */
    public static final y16.i f540486m;

    /* renamed from: n, reason: collision with root package name */
    public static final y16.i f540487n;

    /* renamed from: o, reason: collision with root package name */
    public static final y16.i f540488o;

    /* renamed from: p, reason: collision with root package name */
    public static final y16.i f540489p;

    /* renamed from: q, reason: collision with root package name */
    public static final y16.i f540490q;

    /* renamed from: r, reason: collision with root package name */
    public static final java.util.List f540491r;

    /* renamed from: s, reason: collision with root package name */
    public static final java.util.List f540492s;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f540493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f540494b;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        y16.g gVar;
        y16.g gVar2;
        int i17 = f540477d;
        int i18 = i17 << 1;
        f540478e = i17;
        int i19 = i18 << 1;
        f540479f = i18;
        int i27 = i19 << 1;
        f540480g = i19;
        int i28 = i27 << 1;
        f540481h = i27;
        int i29 = i28 << 1;
        f540482i = i28;
        int i37 = i29 << 1;
        f540483j = i29;
        f540477d = i37 << 1;
        int i38 = i37 - 1;
        f540484k = i38;
        int i39 = i17 | i18 | i19;
        f540485l = i39;
        int i47 = 2;
        f540486m = new y16.i(i38, null, i47, 0 == true ? 1 : 0);
        f540487n = new y16.i(i28 | i29, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i17, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i18, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i19, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        f540488o = new y16.i(i39, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i27, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        f540489p = new y16.i(i28, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        f540490q = new y16.i(i29, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        new y16.i(i18 | i28 | i29, 0 == true ? 1 : 0, i47, 0 == true ? 1 : 0);
        java.lang.reflect.Field[] fields = y16.i.class.getFields();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fields, "getFields(...)");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        for (java.lang.reflect.Field field : fields) {
            if (java.lang.reflect.Modifier.isStatic(field.getModifiers())) {
                arrayList.add(field);
            }
        }
        java.util.ArrayList arrayList2 = new java.util.ArrayList();
        java.util.Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            java.lang.reflect.Field field2 = (java.lang.reflect.Field) it.next();
            java.lang.Object obj = field2.get(null);
            y16.i iVar = obj instanceof y16.i ? (y16.i) obj : null;
            if (iVar != null) {
                java.lang.String name = field2.getName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name, "getName(...)");
                gVar2 = new y16.g(iVar.f540494b, name);
            } else {
                gVar2 = null;
            }
            if (gVar2 != null) {
                arrayList2.add(gVar2);
            }
        }
        f540491r = arrayList2;
        java.lang.reflect.Field[] fields2 = y16.i.class.getFields();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(fields2, "getFields(...)");
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        for (java.lang.reflect.Field field3 : fields2) {
            if (java.lang.reflect.Modifier.isStatic(field3.getModifiers())) {
                arrayList3.add(field3);
            }
        }
        java.util.ArrayList arrayList4 = new java.util.ArrayList();
        java.util.Iterator it6 = arrayList3.iterator();
        while (it6.hasNext()) {
            java.lang.Object next = it6.next();
            if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(((java.lang.reflect.Field) next).getType(), java.lang.Integer.TYPE)) {
                arrayList4.add(next);
            }
        }
        java.util.ArrayList arrayList5 = new java.util.ArrayList();
        java.util.Iterator it7 = arrayList4.iterator();
        while (it7.hasNext()) {
            java.lang.reflect.Field field4 = (java.lang.reflect.Field) it7.next();
            java.lang.Object obj2 = field4.get(null);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.Int");
            int intValue = ((java.lang.Integer) obj2).intValue();
            if ((intValue == ((-intValue) & intValue)) == true) {
                java.lang.String name2 = field4.getName();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(name2, "getName(...)");
                gVar = new y16.g(intValue, name2);
            } else {
                gVar = null;
            }
            if (gVar != null) {
                arrayList5.add(gVar);
            }
        }
        f540492s = arrayList5;
    }

    public i(int i17, java.util.List excludes) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(excludes, "excludes");
        this.f540493a = excludes;
        java.util.Iterator it = excludes.iterator();
        while (it.hasNext()) {
            i17 &= ~((y16.f) it.next()).a();
        }
        this.f540494b = i17;
    }

    public final boolean a(int i17) {
        return (i17 & this.f540494b) != 0;
    }

    /* renamed from: equals */
    public boolean m176397xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(y16.i.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj, "null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.DescriptorKindFilter");
        y16.i iVar = (y16.i) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540493a, iVar.f540493a) && this.f540494b == iVar.f540494b;
    }

    /* renamed from: hashCode */
    public int m176398x8cdac1b() {
        return (this.f540493a.hashCode() * 31) + this.f540494b;
    }

    /* renamed from: toString */
    public java.lang.String m176399x9616526c() {
        java.lang.Object obj;
        java.util.Iterator it = f540491r.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y16.g) obj).f540471a == this.f540494b) {
                break;
            }
        }
        y16.g gVar = (y16.g) obj;
        java.lang.String str = gVar != null ? gVar.f540472b : null;
        if (str == null) {
            java.util.List<y16.g> list = f540492s;
            java.util.ArrayList arrayList = new java.util.ArrayList();
            for (y16.g gVar2 : list) {
                java.lang.String str2 = a(gVar2.f540471a) ? gVar2.f540472b : null;
                if (str2 != null) {
                    arrayList.add(str2);
                }
            }
            str = kz5.n0.g0(arrayList, com.p314xaae8f345.p592x631407a.p595x2eaf0c.log.p598x36f002.C4772x9611bb53.f20377xba9c5eaa, null, null, 0, null, null, 62, null);
        }
        return "DescriptorKindFilter(" + str + ", " + this.f540493a + ')';
    }

    public /* synthetic */ i(int i17, java.util.List list, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, (i18 & 2) != 0 ? kz5.p0.f395529d : list);
    }
}
