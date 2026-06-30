package y1;

/* loaded from: classes14.dex */
public final class l implements y1.p0, java.lang.Iterable, zz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final java.util.Map f540299d = new java.util.LinkedHashMap();

    /* renamed from: e, reason: collision with root package name */
    public boolean f540300e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f540301f;

    public final boolean d(y1.o0 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        return this.f540299d.containsKey(key);
    }

    public final java.lang.Object e(y1.o0 key) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        java.lang.Object obj = ((java.util.LinkedHashMap) this.f540299d).get(key);
        if (obj != null) {
            return obj;
        }
        throw new java.lang.IllegalStateException("Key not present: " + key + " - consider getOrElse or getOrNull");
    }

    /* renamed from: equals */
    public boolean m176340xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1.l)) {
            return false;
        }
        y1.l lVar = (y1.l) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f540299d, lVar.f540299d) && this.f540300e == lVar.f540300e && this.f540301f == lVar.f540301f;
    }

    public void g(y1.o0 key, java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        this.f540299d.put(key, obj);
    }

    /* renamed from: hashCode */
    public int m176341x8cdac1b() {
        return (((this.f540299d.hashCode() * 31) + java.lang.Boolean.hashCode(this.f540300e)) * 31) + java.lang.Boolean.hashCode(this.f540301f);
    }

    @Override // java.lang.Iterable
    public java.util.Iterator iterator() {
        return ((java.util.LinkedHashMap) this.f540299d).entrySet().iterator();
    }

    /* renamed from: toString */
    public java.lang.String m176342x9616526c() {
        java.lang.String str;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        if (this.f540300e) {
            sb6.append("mergeDescendants=true");
            str = ", ";
        } else {
            str = "";
        }
        if (this.f540301f) {
            sb6.append(str);
            sb6.append("isClearingSemantics=true");
            str = ", ";
        }
        for (java.util.Map.Entry entry : ((java.util.LinkedHashMap) this.f540299d).entrySet()) {
            y1.o0 o0Var = (y1.o0) entry.getKey();
            java.lang.Object value = entry.getValue();
            sb6.append(str);
            sb6.append(o0Var.f540316a);
            sb6.append(" : ");
            sb6.append(value);
            str = ", ";
        }
        return p012xc85e97e9.p064x38a77192.ui.p069x6fbd6873.k3.a(this, null) + "{ " + ((java.lang.Object) sb6) + " }";
    }
}
