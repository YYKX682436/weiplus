package com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui;

/* loaded from: classes11.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public final int f255715a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.ArrayList f255716b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.ArrayList f255717c;

    public q(int i17, java.util.ArrayList labelIdList, java.util.ArrayList userNameList) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(labelIdList, "labelIdList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userNameList, "userNameList");
        this.f255715a = i17;
        this.f255716b = labelIdList;
        this.f255717c = userNameList;
    }

    /* renamed from: equals */
    public boolean m71886xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q qVar = (com.p314xaae8f345.mm.p1006xc5476f33.p2264xa4f4bf5f.ui.q) obj;
        return this.f255715a == qVar.f255715a && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255716b, qVar.f255716b) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f255717c, qVar.f255717c);
    }

    /* renamed from: hashCode */
    public int m71887x8cdac1b() {
        return (((java.lang.Integer.hashCode(this.f255715a) * 31) + this.f255716b.hashCode()) * 31) + this.f255717c.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m71888x9616526c() {
        return "LastRecentVisibleRange(state=" + this.f255715a + ", labelIdList=" + this.f255716b + ", userNameList=" + this.f255717c + ')';
    }
}
