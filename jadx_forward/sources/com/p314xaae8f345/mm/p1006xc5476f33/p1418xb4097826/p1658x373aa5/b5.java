package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5;

/* loaded from: classes10.dex */
public final class b5 {

    /* renamed from: a, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 f213223a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f213224b;

    /* renamed from: c, reason: collision with root package name */
    public final long f213225c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f213226d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f213227e;

    /* renamed from: f, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 f213228f;

    public b5(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObj, boolean z17, long j17, boolean z18, boolean z19, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(feedObj, "feedObj");
        this.f213223a = feedObj;
        this.f213224b = z17;
        this.f213225c = j17;
        this.f213226d = z18;
        this.f213227e = z19;
        this.f213228f = yj0Var;
    }

    /* renamed from: equals */
    public boolean m62525xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b5)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b5 b5Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1658x373aa5.b5) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213223a, b5Var.f213223a) && this.f213224b == b5Var.f213224b && this.f213225c == b5Var.f213225c && this.f213226d == b5Var.f213226d && this.f213227e == b5Var.f213227e && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f213228f, b5Var.f213228f);
    }

    /* renamed from: hashCode */
    public int m62526x8cdac1b() {
        int hashCode = ((((((((this.f213223a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f213224b)) * 31) + java.lang.Long.hashCode(this.f213225c)) * 31) + java.lang.Boolean.hashCode(this.f213226d)) * 31) + java.lang.Boolean.hashCode(this.f213227e)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = this.f213228f;
        return hashCode + (yj0Var == null ? 0 : yj0Var.hashCode());
    }

    /* renamed from: toString */
    public java.lang.String m62527x9616526c() {
        return "DrawerOpenData(feedObj=" + this.f213223a + ", isSingleMode=" + this.f213224b + ", refCommentId=" + this.f213225c + ", blinkRefComment=" + this.f213226d + ", showFooter=" + this.f213227e + ", replyCommentObj=" + this.f213228f + ')';
    }
}
