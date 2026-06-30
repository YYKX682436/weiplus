package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29;

/* loaded from: classes2.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    public final java.util.ArrayList f189833a;

    /* renamed from: b, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p2495xc50a8b8b.g f189834b;

    /* renamed from: c, reason: collision with root package name */
    public final int f189835c;

    /* renamed from: d, reason: collision with root package name */
    public final com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c f189836d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f189837e;

    public r9(java.util.ArrayList dataList, com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar, int i17, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c cVar, java.lang.String stack, int i18, p3321xbce91901.jvm.p3324x21ffc6bd.i iVar) {
        if ((i18 & 16) != 0) {
            boolean z17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.f274522a;
            stack = com.p314xaae8f345.mm.sdk.p2603x2137b148.z3.b(true);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(stack, "toString(...)");
        }
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dataList, "dataList");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(stack, "stack");
        this.f189833a = dataList;
        this.f189834b = gVar;
        this.f189835c = i17;
        this.f189836d = cVar;
        this.f189837e = stack;
    }

    /* renamed from: equals */
    public boolean m56494xb2c87fbf(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9)) {
            return false;
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9 r9Var = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.r9) obj;
        return p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189833a, r9Var.f189833a) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189834b, r9Var.f189834b) && this.f189835c == r9Var.f189835c && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189836d, r9Var.f189836d) && p3321xbce91901.jvm.p3324x21ffc6bd.o.b(this.f189837e, r9Var.f189837e);
    }

    /* renamed from: hashCode */
    public int m56495x8cdac1b() {
        int hashCode = this.f189833a.hashCode() * 31;
        com.p314xaae8f345.mm.p2495xc50a8b8b.g gVar = this.f189834b;
        int hashCode2 = (((hashCode + (gVar == null ? 0 : gVar.hashCode())) * 31) + java.lang.Integer.hashCode(this.f189835c)) * 31;
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.p1459x633fb29.c cVar = this.f189836d;
        return ((hashCode2 + (cVar != null ? cVar.hashCode() : 0)) * 31) + this.f189837e.hashCode();
    }

    /* renamed from: toString */
    public java.lang.String m56496x9616526c() {
        return "LoaderCache(dataList=" + this.f189833a + ", lastBuffer=" + this.f189834b + ", position=" + this.f189835c + ", customData=" + this.f189836d + ", stack=" + this.f189837e + ')';
    }
}
