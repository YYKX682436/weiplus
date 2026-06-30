package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f184741a;

    /* renamed from: b, reason: collision with root package name */
    public final int f184742b;

    /* renamed from: c, reason: collision with root package name */
    public final int f184743c;

    public e(int i17, int i18, int i19) {
        this.f184741a = i17;
        this.f184742b = i18;
        this.f184743c = i19;
    }

    /* renamed from: equals */
    public boolean m55665xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e eVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.e) obj;
        return this.f184741a == eVar.f184741a && this.f184742b == eVar.f184742b && this.f184743c == eVar.f184743c;
    }

    /* renamed from: hashCode */
    public int m55666x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f184741a) * 31) + java.lang.Integer.hashCode(this.f184742b)) * 31) + java.lang.Integer.hashCode(this.f184743c);
    }

    /* renamed from: toString */
    public java.lang.String m55667x9616526c() {
        return "PlayParams(percentageNum=" + this.f184741a + ", progressMs=" + this.f184742b + ", durationMs=" + this.f184743c + ')';
    }
}
