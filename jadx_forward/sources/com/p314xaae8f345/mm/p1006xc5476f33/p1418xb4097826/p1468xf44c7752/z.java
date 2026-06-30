package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752;

/* loaded from: classes2.dex */
public final class z implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a0 f192951a;

    public z(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.a0 a0Var) {
        this.f192951a = a0Var;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 wxRVData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxRVData, "wxRVData");
        int i17 = wxRVData.f374681a;
        if (i17 == 0 || i17 == 8) {
            java.util.Iterator it = wxRVData.f374686f.iterator();
            while (it.hasNext()) {
                in5.c cVar = ((in5.x0) it.next()).f374691a;
                if (cVar instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5) {
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1468xf44c7752.b0.f192883a.d(cVar.mo2128x1ed62e84(), this.f192951a.f192882m, -1, "");
                }
            }
        }
    }
}
