package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes10.dex */
public final class kp {

    /* renamed from: a, reason: collision with root package name */
    public final int f185384a;

    /* renamed from: b, reason: collision with root package name */
    public final int f185385b;

    public kp(int i17, int i18) {
        this.f185384a = i17;
        this.f185385b = i18;
    }

    /* renamed from: equals */
    public boolean m55691xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp kpVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.kp) obj;
        return this.f185384a == kpVar.f185384a && this.f185385b == kpVar.f185385b;
    }

    /* renamed from: hashCode */
    public int m55692x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f185384a) * 31) + java.lang.Integer.hashCode(this.f185385b);
    }

    /* renamed from: toString */
    public java.lang.String m55693x9616526c() {
        return "MsgSceneData(scene=" + this.f185384a + ", requestScene=" + this.f185385b + ')';
    }
}
