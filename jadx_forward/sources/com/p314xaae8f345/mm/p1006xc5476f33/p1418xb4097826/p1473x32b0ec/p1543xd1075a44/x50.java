package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44;

/* loaded from: classes3.dex */
public final class x50 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f201827a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f201828b;

    /* renamed from: c, reason: collision with root package name */
    public final java.lang.Integer f201829c;

    /* renamed from: d, reason: collision with root package name */
    public final yz5.a f201830d;

    /* renamed from: e, reason: collision with root package name */
    public final yz5.a f201831e;

    public x50(java.lang.String id6, java.lang.String title, java.lang.Integer num, yz5.a aVar, yz5.a aVar2) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(title, "title");
        this.f201827a = id6;
        this.f201828b = title;
        this.f201829c = num;
        this.f201830d = aVar;
        this.f201831e = aVar2;
    }

    /* renamed from: equals */
    public boolean m58184xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50 x50Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1543xd1075a44.x50) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201827a, x50Var.f201827a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201828b, x50Var.f201828b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201829c, x50Var.f201829c) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201830d, x50Var.f201830d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f201831e, x50Var.f201831e);
    }

    /* renamed from: hashCode */
    public int m58185x8cdac1b() {
        int hashCode = ((this.f201827a.hashCode() * 31) + this.f201828b.hashCode()) * 31;
        java.lang.Integer num = this.f201829c;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        yz5.a aVar = this.f201830d;
        int hashCode3 = (hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        yz5.a aVar2 = this.f201831e;
        return hashCode3 + (aVar2 != null ? aVar2.hashCode() : 0);
    }

    /* renamed from: toString */
    public java.lang.String m58186x9616526c() {
        return "OptionItem(id=" + this.f201827a + ", title=" + this.f201828b + ", iconRes=" + this.f201829c + ", showCondition=" + this.f201830d + ", disableCondition=" + this.f201831e + ')';
    }

    public /* synthetic */ x50(java.lang.String str, java.lang.String str2, java.lang.Integer num, yz5.a aVar, yz5.a aVar2, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(str, str2, (i17 & 4) != 0 ? null : num, (i17 & 8) != 0 ? null : aVar, (i17 & 16) != 0 ? null : aVar2);
    }
}
