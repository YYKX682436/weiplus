package ey2;

/* loaded from: classes2.dex */
public final class x0 implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ey2.b1 f339097a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f339098b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ int f339099c;

    public x0(ey2.b1 b1Var, int i17, int i18) {
        this.f339097a = b1Var;
        this.f339098b = i17;
        this.f339099c = i18;
    }

    @Override // db2.d3
    /* renamed from: isBeginHistory */
    public boolean mo11121xd9b295f5() {
        return false;
    }

    @Override // db2.d3
    /* renamed from: isResultConsume */
    public boolean mo11122x83d23815(int i17, int i18, r45.ny3 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        return false;
    }

    @Override // db2.d3
    /* renamed from: onBuildRequest */
    public void mo11123x6b44d7c0(db2.b3 request) {
        java.util.ArrayList arrayList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
        com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5[] O6 = this.f339097a.O6(this.f339098b, hc2.d0.b(this.f339099c), 32767);
        boolean z17 = true;
        if (O6 != null) {
            arrayList = new java.util.ArrayList(O6.length);
            for (com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1570x633fb29.AbstractC14490x69736cb5 abstractC14490x69736cb5 : O6) {
                r45.vw2 vw2Var = new r45.vw2();
                vw2Var.set(0, java.lang.Long.valueOf(abstractC14490x69736cb5.getFeedObject().m59251x5db1b11()));
                vw2Var.set(1, abstractC14490x69736cb5.g0());
                arrayList.add(vw2Var);
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null && !arrayList.isEmpty()) {
            z17 = false;
        }
        request.set(35, z17 ? null : new java.util.LinkedList(arrayList));
    }

    @Override // db2.d3
    /* renamed from: onLoadFinish */
    public void mo11124xa374d858() {
    }
}
