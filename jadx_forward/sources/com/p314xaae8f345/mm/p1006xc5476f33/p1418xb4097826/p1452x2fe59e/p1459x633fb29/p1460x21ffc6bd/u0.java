package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd;

/* loaded from: classes2.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f189585a;

    /* renamed from: b, reason: collision with root package name */
    public int f189586b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.LinkedList f189587c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f189588d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f189589e;

    public u0(int i17, int i18, java.util.LinkedList changeIndex, boolean z17, boolean z18) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(changeIndex, "changeIndex");
        this.f189585a = i17;
        this.f189586b = i18;
        this.f189587c = changeIndex;
        this.f189588d = z17;
        this.f189589e = z18;
    }

    /* renamed from: equals */
    public boolean m56466xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0 u0Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.p1460x21ffc6bd.u0) obj;
        return this.f189585a == u0Var.f189585a && this.f189586b == u0Var.f189586b && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189587c, u0Var.f189587c) && this.f189588d == u0Var.f189588d && this.f189589e == u0Var.f189589e;
    }

    /* renamed from: hashCode */
    public int m56467x8cdac1b() {
        return (((((((java.lang.Integer.hashCode(this.f189585a) * 31) + java.lang.Integer.hashCode(this.f189586b)) * 31) + this.f189587c.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f189588d)) * 31) + java.lang.Boolean.hashCode(this.f189589e);
    }

    /* renamed from: toString */
    public java.lang.String m56468x9616526c() {
        return "MergeResult(insertIndex=" + this.f189585a + ", insertCount=" + this.f189586b + ", changeIndex=" + this.f189587c + ", isRemoveBeforeInsert=" + this.f189588d + ", dataReplace=" + this.f189589e + ')';
    }

    public /* synthetic */ u0(int i17, int i18, java.util.LinkedList linkedList, boolean z17, boolean z18, int i19, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        this(i17, i18, linkedList, (i19 & 8) != 0 ? false : z17, (i19 & 16) != 0 ? false : z18);
    }
}
