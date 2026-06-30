package com.p314xaae8f345.mm.vfs;

/* loaded from: classes10.dex */
public final class c6 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f294406a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f294407b;

    /* renamed from: c, reason: collision with root package name */
    public final int f294408c;

    /* renamed from: d, reason: collision with root package name */
    public final int f294409d;

    /* renamed from: e, reason: collision with root package name */
    public final com.p314xaae8f345.mm.vfs.u f294410e;

    /* renamed from: f, reason: collision with root package name */
    public final java.util.Map f294411f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f294412g;

    /* renamed from: h, reason: collision with root package name */
    public final yz5.l f294413h;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.List f294414i;

    public c6(java.lang.String name, java.lang.String dirName, int i17, int i18, com.p314xaae8f345.mm.vfs.u cleanPolicy, java.util.Map map, java.util.List list, yz5.l lVar, java.util.List list2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(name, "name");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dirName, "dirName");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cleanPolicy, "cleanPolicy");
        this.f294406a = name;
        this.f294407b = dirName;
        this.f294408c = i17;
        this.f294409d = i18;
        this.f294410e = cleanPolicy;
        this.f294411f = map;
        this.f294412g = list;
        this.f294413h = lVar;
        this.f294414i = list2;
    }

    /* renamed from: equals */
    public boolean m82376xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.vfs.c6)) {
            return false;
        }
        com.p314xaae8f345.mm.vfs.c6 c6Var = (com.p314xaae8f345.mm.vfs.c6) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294406a, c6Var.f294406a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294407b, c6Var.f294407b) && this.f294408c == c6Var.f294408c && this.f294409d == c6Var.f294409d && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294410e, c6Var.f294410e) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294411f, c6Var.f294411f) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294412g, c6Var.f294412g) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294413h, c6Var.f294413h) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f294414i, c6Var.f294414i);
    }

    /* renamed from: hashCode */
    public int m82377x8cdac1b() {
        int hashCode = ((((((((this.f294406a.hashCode() * 31) + this.f294407b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f294408c)) * 31) + java.lang.Integer.hashCode(this.f294409d)) * 31) + this.f294410e.hashCode()) * 31;
        java.util.Map map = this.f294411f;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        java.util.List list = this.f294412g;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        yz5.l lVar = this.f294413h;
        int hashCode4 = (hashCode3 + (lVar == null ? 0 : lVar.hashCode())) * 31;
        java.util.List list2 = this.f294414i;
        return hashCode4 + (list2 != null ? list2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m82378x9616526c() {
        return "StorageConfig(name=" + this.f294406a + ", dirName=" + this.f294407b + ", flags=" + this.f294408c + ", tag=" + this.f294409d + ", cleanPolicy=" + this.f294410e + ", env=" + this.f294411f + ", paths=" + this.f294412g + ", wrapper=" + this.f294413h + ", noCleanPaths=" + this.f294414i + ')';
    }
}
