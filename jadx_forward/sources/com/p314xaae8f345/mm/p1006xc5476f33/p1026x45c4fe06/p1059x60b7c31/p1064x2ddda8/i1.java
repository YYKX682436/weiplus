package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8;

/* loaded from: classes7.dex */
public final class i1 {

    /* renamed from: a, reason: collision with root package name */
    public final int f161116a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f161117b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f161118c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f161119d;

    public i1(int i17, java.lang.String str, java.util.List list, boolean z17, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        str = (i18 & 2) != 0 ? null : str;
        list = (i18 & 4) != 0 ? null : list;
        z17 = (i18 & 8) != 0 ? false : z17;
        this.f161116a = i17;
        this.f161117b = str;
        this.f161118c = list;
        this.f161119d = z17;
    }

    public final java.lang.String a() {
        return this.f161117b;
    }

    public final int b() {
        return this.f161116a;
    }

    public final java.util.List c() {
        return this.f161118c;
    }

    public final boolean d() {
        return this.f161119d;
    }

    /* renamed from: equals */
    public boolean m50627xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i1)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i1 i1Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1059x60b7c31.p1064x2ddda8.i1) obj;
        return this.f161116a == i1Var.f161116a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161117b, i1Var.f161117b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f161118c, i1Var.f161118c) && this.f161119d == i1Var.f161119d;
    }

    /* renamed from: hashCode */
    public int m50628x8cdac1b() {
        int hashCode = java.lang.Integer.hashCode(this.f161116a) * 31;
        java.lang.String str = this.f161117b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        java.util.List list = this.f161118c;
        return ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31) + java.lang.Boolean.hashCode(this.f161119d);
    }

    /* renamed from: toString */
    public java.lang.String m50629x9616526c() {
        return "UserPromptResult(resultCode=" + this.f161116a + ", errMsg=" + this.f161117b + ", selectedScopes=" + this.f161118c + ", userAgreementChecked=" + this.f161119d + ')';
    }
}
