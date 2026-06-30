package lo0;

/* loaded from: classes14.dex */
public final class g0 {

    /* renamed from: f, reason: collision with root package name */
    public static final lo0.g0 f401523f = new lo0.g0();

    /* renamed from: g, reason: collision with root package name */
    public static final int f401524g = 1;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f401525a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f401526b;

    /* renamed from: c, reason: collision with root package name */
    public final lo0.b0 f401527c;

    /* renamed from: d, reason: collision with root package name */
    public final lo0.f f401528d;

    /* renamed from: e, reason: collision with root package name */
    public lo0.b0 f401529e;

    public g0(java.lang.String packageDirectory) {
        java.lang.String concat;
        java.lang.Object obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(packageDirectory, "packageDirectory");
        if (android.os.Build.VERSION.SDK_INT >= 26) {
            java.nio.file.Path path = java.nio.file.Paths.get(packageDirectory, new java.lang.String[0]);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(path, "get(...)");
            java.nio.file.Path resolve = path.resolve("contents.json");
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resolve, "resolve(...)");
            concat = resolve.toAbsolutePath().toString();
        } else {
            concat = packageDirectory.concat("/contents.json");
        }
        java.lang.String M = com.p314xaae8f345.mm.vfs.w6.M(concat);
        if (!(M == null || M.length() == 0)) {
            try {
                org.json.JSONObject jSONObject = new org.json.JSONObject(M);
                java.lang.String optString = jSONObject.optString("itemsType");
                if (!(optString == null || optString.length() == 0) && !r26.i0.p(optString, "filter", false)) {
                    throw new lo0.u("Filter package item type mismatch. " + optString);
                }
                java.lang.String optString2 = jSONObject.optString("functionalVersion");
                lo0.q0 q0Var = lo0.r0.f401603c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                lo0.r0 a17 = q0Var.a(optString2);
                if (!(a17 == null) && (a17.f401605a != f401524g || java.lang.Integer.compare(a17.f401606b ^ Integer.MIN_VALUE, Integer.MIN_VALUE) < 0)) {
                    throw new lo0.u("Incompatible filter package functional version. ".concat(optString2));
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("badges");
                if (optJSONArray != null) {
                    c75.c.d(optJSONArray, new lo0.c0(linkedHashMap));
                }
                java.util.ArrayList arrayList = new java.util.ArrayList();
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("items");
                if (!(optJSONArray2 == null) && optJSONArray2.length() != 0) {
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    c75.c.d(optJSONArray2, new lo0.d0(packageDirectory, linkedHashMap, arrayList2, arrayList));
                    if (!arrayList2.isEmpty()) {
                        java.util.Iterator it = arrayList2.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            } else {
                                obj = it.next();
                                if (!((lo0.b0) obj).f401501b) {
                                    break;
                                }
                            }
                        }
                        lo0.b0 b0Var = (lo0.b0) obj;
                        if (b0Var == null) {
                            lo0.b0 b0Var2 = new lo0.b0();
                            this.f401527c = b0Var2;
                            arrayList2.add(0, b0Var2);
                        } else {
                            this.f401527c = b0Var;
                        }
                        if (arrayList2.size() > 1) {
                            kz5.g0.t(arrayList2, new lo0.f0());
                        }
                        this.f401525a = true;
                        this.f401526b = arrayList2;
                        this.f401528d = new lo0.f("filter", arrayList);
                        this.f401529e = this.f401527c;
                        return;
                    }
                    throw new lo0.u("Resource package contains no valid filter items.");
                }
                throw new lo0.u("Resource package contains no filter items.");
            } catch (java.lang.Exception unused) {
                throw new lo0.u("Failed to parse configuration file for filter package.");
            }
        }
        throw new lo0.u("Failed to read configuration file for filter package.");
    }

    public g0() {
        lo0.b0 b0Var = new lo0.b0();
        this.f401525a = false;
        this.f401526b = kz5.b0.c(b0Var);
        this.f401527c = b0Var;
        this.f401528d = new lo0.f("filter", kz5.p0.f395529d);
        this.f401529e = b0Var;
    }

    public g0(lo0.g0 g0Var) {
        java.util.Collection<lo0.b> values = ((java.util.LinkedHashMap) g0Var.f401528d.f401519b).values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        for (lo0.b bVar : values) {
            bVar.getClass();
            arrayList.add(new lo0.b(bVar));
        }
        java.util.Map d17 = d75.b.d(arrayList, lo0.e0.f401517d);
        this.f401525a = g0Var.f401525a;
        java.util.List<lo0.b0> list = g0Var.f401526b;
        java.util.ArrayList<lo0.b0> arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.b0 b0Var : list) {
            b0Var.getClass();
            arrayList2.add(new lo0.b0(b0Var, d17));
        }
        this.f401526b = arrayList2;
        for (lo0.b0 b0Var2 : arrayList2) {
            if (!b0Var2.f401501b) {
                this.f401527c = b0Var2;
                java.util.List list2 = this.f401526b;
                java.util.ArrayList arrayList3 = new java.util.ArrayList();
                java.util.Iterator it = list2.iterator();
                while (it.hasNext()) {
                    lo0.b bVar2 = ((lo0.b0) it.next()).f401506g;
                    if (bVar2 != null) {
                        arrayList3.add(bVar2);
                    }
                }
                this.f401528d = new lo0.f("filter", arrayList3);
                this.f401529e = this.f401527c;
                return;
            }
        }
        throw new java.util.NoSuchElementException("Collection contains no element matching the predicate.");
    }
}
