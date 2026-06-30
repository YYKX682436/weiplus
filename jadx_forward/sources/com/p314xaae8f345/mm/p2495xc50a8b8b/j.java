package com.p314xaae8f345.mm.p2495xc50a8b8b;

/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.k f273691a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Object f273692b;

    public j(com.p314xaae8f345.mm.p2495xc50a8b8b.k attr, java.lang.Object obj, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        obj = (i17 & 2) != 0 ? null : obj;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(attr, "attr");
        this.f273691a = attr;
        this.f273692b = obj;
    }

    /* renamed from: equals */
    public boolean m75967xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.j)) {
            return false;
        }
        com.p314xaae8f345.mm.p2495xc50a8b8b.j jVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.j) obj;
        if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f273691a.f273694b, jVar.f273691a.f273694b)) {
            return false;
        }
        if (p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f273692b, jVar.f273692b)) {
            return true;
        }
        java.lang.Object obj2 = this.f273692b;
        if (!(obj2 instanceof java.util.List) || !(jVar.f273692b instanceof java.util.List)) {
            if (!(obj2 instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.e) || !(jVar.f273692b instanceof com.p314xaae8f345.mm.p2495xc50a8b8b.e)) {
                return false;
            }
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProto3Buf");
            java.lang.Object obj3 = jVar.f273692b;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj3, "null cannot be cast to non-null type com.tencent.mm.protobuf.BaseProto3Buf");
            return ((com.p314xaae8f345.mm.p2495xc50a8b8b.e) obj2).mo516x5c5a33d4((com.p314xaae8f345.mm.p2495xc50a8b8b.e) obj3);
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj2, "null cannot be cast to non-null type kotlin.collections.List<*>");
        java.util.List list = (java.util.List) obj2;
        java.lang.Object obj4 = jVar.f273692b;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(obj4, "null cannot be cast to non-null type kotlin.collections.List<*>");
        java.util.List list2 = (java.util.List) obj4;
        if (list.size() != list2.size()) {
            return false;
        }
        int size = list.size();
        for (int i17 = 0; i17 < size; i17++) {
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(list.get(i17), list2.get(i17))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: hashCode */
    public int m75968x8cdac1b() {
        int hashCode = this.f273691a.hashCode() * 31;
        java.lang.Object obj = this.f273692b;
        return hashCode + (obj != null ? obj.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m75969x9616526c() {
        java.lang.Object obj = this.f273692b;
        com.p314xaae8f345.mm.p2495xc50a8b8b.k kVar = this.f273691a;
        if (obj != null) {
            return kVar + " => " + obj;
        }
        return kVar + " => " + kVar.f273699g + "(default)";
    }
}
