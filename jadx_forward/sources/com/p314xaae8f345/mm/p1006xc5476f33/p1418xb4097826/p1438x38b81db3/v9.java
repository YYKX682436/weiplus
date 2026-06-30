package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3;

/* loaded from: classes2.dex */
public final class v9 extends xc2.e1 {

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe f186307c;

    public v9(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar) {
        this.f186307c = qeVar;
    }

    @Override // xc2.c1
    public void a(int i17, java.util.List list) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(list, "list");
        in5.s0 s0Var = this.f534654a;
        if (s0Var != null) {
            boolean isEmpty = list.isEmpty();
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1438x38b81db3.qe qeVar = this.f186307c;
            if (isEmpty) {
                qeVar.L = true;
            } else {
                qeVar.t(s0Var);
                if (i17 == 5 && (!list.isEmpty())) {
                    qeVar.L = true;
                }
            }
            if (!qeVar.L || (abstractC14490x69736cb5 = this.f534655b) == null) {
                return;
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb52 = (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) s0Var.f374658i;
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.C14994x9b99c079 feedObject = abstractC14490x69736cb52 != null ? abstractC14490x69736cb52.getFeedObject() : null;
            if (feedObject != null && feedObject.m59251x5db1b11() == abstractC14490x69736cb5.mo2128x1ed62e84()) {
                qeVar.N0(s0Var, abstractC14490x69736cb5);
                return;
            }
            java.lang.Object[] objArr = new java.lang.Object[2];
            objArr[0] = java.lang.Long.valueOf(feedObject != null ? feedObject.m59251x5db1b11() : 0L);
            objArr[1] = java.lang.Long.valueOf(abstractC14490x69736cb5.mo2128x1ed62e84());
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.FeedFullConvert", "jumper add feed not match %d %d", objArr);
        }
    }

    @Override // xc2.c1
    public int b(in5.s0 holder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(holder, "holder");
        return this.f186307c.R(holder);
    }

    @Override // xc2.c1
    public com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.k8 c() {
        return this.f186307c.f185891f;
    }
}
