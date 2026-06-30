package vd0;

/* loaded from: classes8.dex */
public final class z2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f517078a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f517079b;

    /* renamed from: c, reason: collision with root package name */
    public final int f517080c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f517081d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f517082e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f517083f;

    /* renamed from: g, reason: collision with root package name */
    public final int f517084g;

    /* renamed from: h, reason: collision with root package name */
    public final int f517085h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f517086i;

    /* renamed from: j, reason: collision with root package name */
    public final java.lang.String f517087j;

    /* renamed from: k, reason: collision with root package name */
    public final java.lang.String f517088k;

    /* renamed from: l, reason: collision with root package name */
    public final java.lang.String f517089l;

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f517090m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f517091n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f517092o;

    public z2(java.lang.String key, java.lang.String parentKey, int i17, boolean z17, boolean z18, boolean z19, int i18, int i19, java.lang.String name, java.lang.String nameLower, java.lang.String summary, java.lang.String summaryLower, java.lang.String header, java.lang.String headerLower, java.lang.String path) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(key, "key");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(parentKey, "parentKey");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(nameLower, "nameLower");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(summary, "summary");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(summaryLower, "summaryLower");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(header, "header");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headerLower, "headerLower");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(path, "path");
        this.f517078a = key;
        this.f517079b = parentKey;
        this.f517080c = i17;
        this.f517081d = z17;
        this.f517082e = z18;
        this.f517083f = z19;
        this.f517084g = i18;
        this.f517085h = i19;
        this.f517086i = name;
        this.f517087j = nameLower;
        this.f517088k = summary;
        this.f517089l = summaryLower;
        this.f517090m = header;
        this.f517091n = headerLower;
        this.f517092o = path;
    }

    /* renamed from: equals */
    public boolean m171576xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vd0.z2)) {
            return false;
        }
        vd0.z2 z2Var = (vd0.z2) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517078a, z2Var.f517078a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517079b, z2Var.f517079b) && this.f517080c == z2Var.f517080c && this.f517081d == z2Var.f517081d && this.f517082e == z2Var.f517082e && this.f517083f == z2Var.f517083f && this.f517084g == z2Var.f517084g && this.f517085h == z2Var.f517085h && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517086i, z2Var.f517086i) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517087j, z2Var.f517087j) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517088k, z2Var.f517088k) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517089l, z2Var.f517089l) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517090m, z2Var.f517090m) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517091n, z2Var.f517091n) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f517092o, z2Var.f517092o);
    }

    /* renamed from: hashCode */
    public int m171577x8cdac1b() {
        return (((((((((((((((((((((((((((this.f517078a.hashCode() * 31) + this.f517079b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f517080c)) * 31) + java.lang.Boolean.hashCode(this.f517081d)) * 31) + java.lang.Boolean.hashCode(this.f517082e)) * 31) + java.lang.Boolean.hashCode(this.f517083f)) * 31) + java.lang.Integer.hashCode(this.f517084g)) * 31) + java.lang.Integer.hashCode(this.f517085h)) * 31) + this.f517086i.hashCode()) * 31) + this.f517087j.hashCode()) * 31) + this.f517088k.hashCode()) * 31) + this.f517089l.hashCode()) * 31) + this.f517090m.hashCode()) * 31) + this.f517091n.hashCode()) * 31) + this.f517092o.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m171578x9616526c() {
        return "IndexedNode(key=" + this.f517078a + ", parentKey=" + this.f517079b + ", type=" + this.f517080c + ", searchable=" + this.f517081d + ", isSwitch=" + this.f517082e + ", isRoot=" + this.f517083f + ", depth=" + this.f517084g + ", originalOrder=" + this.f517085h + ", name=" + this.f517086i + ", nameLower=" + this.f517087j + ", summary=" + this.f517088k + ", summaryLower=" + this.f517089l + ", header=" + this.f517090m + ", headerLower=" + this.f517091n + ", path=" + this.f517092o + ')';
    }
}
