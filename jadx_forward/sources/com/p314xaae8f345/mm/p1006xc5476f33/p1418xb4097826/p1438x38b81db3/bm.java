package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes3.dex */
public final class bm {

    /* renamed from: a, reason: collision with root package name */
    public final int f184517a;

    /* renamed from: b, reason: collision with root package name */
    public final int f184518b;

    public bm(int i17, int i18) {
        this.f184517a = i17;
        this.f184518b = i18;
    }

    /* renamed from: equals */
    public boolean m55637xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bm)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bm bmVar = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.bm) obj;
        return this.f184517a == bmVar.f184517a && this.f184518b == bmVar.f184518b;
    }

    /* renamed from: hashCode */
    public int m55638x8cdac1b() {
        return (java.lang.Integer.hashCode(this.f184517a) * 31) + java.lang.Integer.hashCode(this.f184518b);
    }

    /* renamed from: toString */
    public java.lang.String m55639x9616526c() {
        return "MsgSceneData(scene=" + this.f184517a + ", requestScene=" + this.f184518b + ')';
    }
}
