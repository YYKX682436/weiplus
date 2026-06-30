package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes10.dex */
public final class i3 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f188516d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 f188517e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ fp0.r f188518f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ so2.y0 f188519g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i3(java.util.LinkedList linkedList, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var, fp0.r rVar, so2.y0 y0Var) {
        super(0);
        this.f188516d = linkedList;
        this.f188517e = a7Var;
        this.f188518f = rVar;
        this.f188519g = y0Var;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        java.util.LinkedList level2Comments = this.f188516d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(level2Comments, "$level2Comments");
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.Iterator it = level2Comments.iterator();
        while (true) {
            boolean hasNext = it.hasNext();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7 a7Var = this.f188517e;
            so2.y0 y0Var = this.f188519g;
            if (!hasNext) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.a7.p(a7Var, arrayList, y0Var, true);
                a7Var.f187739J = true;
                this.f188518f.b(fp0.u.f346823f);
                return jz5.f0.f384359a;
            }
            com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87 c19781xd1c47b87 = (com.p314xaae8f345.mm.p2496xc50a8ce6.p2497xc50a8b8b.C19781xd1c47b87) it.next();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(c19781xd1c47b87);
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c079 = a7Var.f187745i;
            if (c14994x9b99c079 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            long m59251x5db1b11 = c14994x9b99c079.m59251x5db1b11();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 c14994x9b99c0792 = a7Var.f187745i;
            if (c14994x9b99c0792 == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("feedObj");
                throw null;
            }
            java.lang.String m59229xb5af1dd5 = c14994x9b99c0792.m59229xb5af1dd5();
            long mo2128x1ed62e84 = y0Var.mo2128x1ed62e84();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0 yj0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.yj0();
            yj0Var.f68959xf9a02e3e = m59251x5db1b11;
            yj0Var.f68957xec748fc6 = m59229xb5af1dd5;
            yj0Var.f68965x29d3a50c = 2;
            yj0Var.f68953x27838069.set(1, c19781xd1c47b87);
            yj0Var.n1(mo2128x1ed62e84);
            arrayList.add(new so2.y0(yj0Var));
        }
    }
}
