package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e;

/* loaded from: classes2.dex */
public final class ns implements in5.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os f190130a;

    public ns(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os osVar) {
        this.f190130a = osVar;
    }

    @Override // in5.y0
    public void a(p012xc85e97e9.p103xe821e364.p104xd1075a44.C1163xf1deaba4 recyclerView, in5.w0 wxRVData) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(recyclerView, "recyclerView");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(wxRVData, "wxRVData");
        int i17 = wxRVData.f374681a;
        if (i17 == 0 || i17 == 8) {
            com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1452x2fe59e.os osVar = this.f190130a;
            if (!osVar.f190211z) {
                osVar.f190211z = true;
                return;
            }
            java.util.Iterator it = wxRVData.f374686f.iterator();
            while (it.hasNext()) {
                boolean z17 = ((in5.x0) it.next()).f374691a instanceof com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5;
            }
        }
    }
}
