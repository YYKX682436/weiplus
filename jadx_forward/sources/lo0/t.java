package lo0;

/* loaded from: classes14.dex */
public final class t {

    /* renamed from: i, reason: collision with root package name */
    public static final lo0.t f401607i = new lo0.t();

    /* renamed from: j, reason: collision with root package name */
    public static final int f401608j = 1;

    /* renamed from: a, reason: collision with root package name */
    public final java.util.List f401609a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f401610b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f401611c;

    /* renamed from: d, reason: collision with root package name */
    public final lo0.f f401612d;

    /* renamed from: e, reason: collision with root package name */
    public lo0.a0 f401613e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f401614f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f401615g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f401616h;

    public t(java.lang.String packageDirectory) {
        java.lang.String concat;
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
                if (!(optString == null || optString.length() == 0) && !r26.i0.p(optString, "beautify", false)) {
                    throw new lo0.u("Beauty package item type mismatch. " + optString);
                }
                java.lang.String optString2 = jSONObject.optString("functionalVersion");
                lo0.q0 q0Var = lo0.r0.f401603c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(optString2);
                lo0.r0 a17 = q0Var.a(optString2);
                if (!(a17 == null) && (a17.f401605a != f401608j || java.lang.Integer.compare(a17.f401606b ^ Integer.MIN_VALUE, Integer.MIN_VALUE) < 0)) {
                    throw new lo0.u("Incompatible beauty package functional version. ".concat(optString2));
                }
                java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
                org.json.JSONArray optJSONArray = jSONObject.optJSONArray("badges");
                if (optJSONArray != null) {
                    c75.c.d(optJSONArray, new lo0.p(linkedHashMap));
                }
                org.json.JSONObject optJSONObject = jSONObject.optJSONObject("attributes");
                java.lang.String str = null;
                java.lang.String optString3 = optJSONObject != null ? optJSONObject.optString("opaqueResourcesPath") : null;
                optString3 = optString3 == null ? "" : optString3;
                if (optString3.length() > 0) {
                    if (!(optString3.length() == 0)) {
                        if (!(packageDirectory.length() == 0)) {
                            java.lang.String b17 = lo0.n.b(packageDirectory);
                            java.lang.String o17 = new com.p314xaae8f345.mm.vfs.r6(packageDirectory, optString3).o();
                            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(o17, "getAbsolutePath(...)");
                            java.lang.String b18 = lo0.n.b(o17);
                            if (r26.i0.y(b18, b17, false)) {
                                str = b18;
                            }
                        }
                    }
                    if (!(str == null || str.length() == 0)) {
                        this.f401610b = str;
                    } else {
                        throw new lo0.u("Failed normalizing suite resource path. " + packageDirectory + ", " + optString3);
                    }
                } else {
                    this.f401610b = null;
                }
                org.json.JSONArray optJSONArray2 = jSONObject.optJSONArray("items");
                if (!(optJSONArray2 == null) && optJSONArray2.length() != 0) {
                    java.util.ArrayList arrayList = new java.util.ArrayList();
                    java.util.ArrayList arrayList2 = new java.util.ArrayList();
                    c75.c.d(optJSONArray2, new lo0.q(packageDirectory, linkedHashMap, this, arrayList2, arrayList));
                    if (!arrayList2.isEmpty()) {
                        if (arrayList2.size() > 1) {
                            kz5.g0.t(arrayList2, new lo0.s());
                        }
                        this.f401609a = arrayList2;
                        java.lang.String optString4 = jSONObject.optString("femaleDefaultItem");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString4, "optString(...)");
                        this.f401614f = optString4;
                        java.lang.String optString5 = jSONObject.optString("maleDefaultItem");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString5, "optString(...)");
                        this.f401615g = optString5;
                        java.lang.String optString6 = jSONObject.optString("defaultItem");
                        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(optString6, "optString(...)");
                        this.f401616h = optString6;
                        this.f401613e = a();
                        this.f401611c = true;
                        this.f401612d = new lo0.f(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15506x7f57ec74, arrayList);
                        return;
                    }
                    throw new lo0.u("Resource package contains no valid beauty suites.");
                }
                throw new lo0.u("Resource package contains no beauty suites.");
            } catch (java.lang.Exception unused) {
                throw new lo0.u("Failed to parse configuration file for beauty package.");
            }
        }
        throw new lo0.u("Failed to read configuration file for beauty package.");
    }

    public final lo0.a0 a() {
        com.p314xaae8f345.mm.p2621x8fb0427b.z3 g17 = c01.z1.g();
        java.lang.Object obj = null;
        java.lang.Integer valueOf = g17 != null ? java.lang.Integer.valueOf(g17.I) : null;
        java.lang.String str = this.f401616h;
        java.lang.String str2 = (valueOf != null && valueOf.intValue() == 2) ? this.f401614f : (valueOf != null && valueOf.intValue() == 1) ? this.f401615g : str;
        if (!(str2.length() == 0)) {
            str = str2;
        }
        boolean z17 = str.length() == 0;
        java.util.List list = this.f401609a;
        if (z17) {
            return (lo0.a0) kz5.n0.X(list);
        }
        java.util.Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            java.lang.Object next = it.next();
            if (r26.i0.p(((lo0.a0) next).f401483a, str, false)) {
                obj = next;
                break;
            }
        }
        lo0.a0 a0Var = (lo0.a0) obj;
        return a0Var == null ? (lo0.a0) kz5.n0.X(list) : a0Var;
    }

    public t() {
        this.f401609a = kz5.b0.c(new lo0.a0());
        this.f401614f = "off";
        this.f401615g = "off";
        this.f401616h = "off";
        this.f401613e = a();
        this.f401610b = "";
        this.f401611c = false;
        this.f401612d = new lo0.f(com.p314xaae8f345.p420x6236cc6.p422x8bf0a1bc.C3887x3868849.f15506x7f57ec74, kz5.p0.f395529d);
    }

    public t(lo0.t tVar) {
        java.util.Collection<lo0.b> values = ((java.util.LinkedHashMap) tVar.f401612d.f401519b).values();
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(values, 10));
        for (lo0.b bVar : values) {
            bVar.getClass();
            arrayList.add(new lo0.b(bVar));
        }
        java.util.Map d17 = d75.b.d(arrayList, lo0.r.f401602d);
        java.util.List<lo0.a0> list = tVar.f401609a;
        java.util.ArrayList arrayList2 = new java.util.ArrayList(kz5.d0.q(list, 10));
        for (lo0.a0 a0Var : list) {
            a0Var.getClass();
            arrayList2.add(new lo0.a0(a0Var, d17));
        }
        this.f401609a = arrayList2;
        this.f401614f = tVar.f401614f;
        this.f401615g = tVar.f401615g;
        this.f401616h = tVar.f401616h;
        this.f401613e = a();
        this.f401610b = tVar.f401610b;
        java.util.ArrayList arrayList3 = new java.util.ArrayList();
        java.util.Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            lo0.a0 a0Var2 = (lo0.a0) it.next();
            kz5.h0.u(arrayList3, kz5.n0.u0(((java.util.LinkedHashMap) a0Var2.f401491i.f401519b).values(), a0Var2.f401490h));
        }
        this.f401612d = new lo0.f(tVar.f401612d.f401518a, kz5.n0.V(arrayList3));
        this.f401611c = tVar.f401611c;
    }
}
