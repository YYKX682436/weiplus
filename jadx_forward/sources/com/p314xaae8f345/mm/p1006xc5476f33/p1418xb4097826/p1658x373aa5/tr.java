package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes2.dex */
public final class tr {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f214681a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f214682b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f214683c;

    /* renamed from: d, reason: collision with root package name */
    public final java.util.List f214684d;

    public tr(java.lang.String id6, java.lang.String displayText, boolean z17, java.util.List list, int i17, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        z17 = (i17 & 4) != 0 ? false : z17;
        list = (i17 & 8) != 0 ? null : list;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(id6, "id");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(displayText, "displayText");
        this.f214681a = id6;
        this.f214682b = displayText;
        this.f214683c = z17;
        this.f214684d = list;
    }

    /* renamed from: equals */
    public boolean m63017xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr trVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.tr) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214681a, trVar.f214681a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214682b, trVar.f214682b) && this.f214683c == trVar.f214683c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f214684d, trVar.f214684d);
    }

    /* renamed from: hashCode */
    public int m63018x8cdac1b() {
        int hashCode = ((((this.f214681a.hashCode() * 31) + this.f214682b.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f214683c)) * 31;
        java.util.List list = this.f214684d;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m63019x9616526c() {
        return "OptionItem(id=" + this.f214681a + ", displayText=" + this.f214682b + ", isSelected=" + this.f214683c + ", payload=" + this.f214684d + ')';
    }
}
