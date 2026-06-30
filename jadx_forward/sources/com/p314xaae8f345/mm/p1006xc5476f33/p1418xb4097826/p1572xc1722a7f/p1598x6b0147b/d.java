package com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b;

/* loaded from: classes2.dex */
public final class d implements db2.d3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f f203706a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ db2.v3 f203707b;

    public d(com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1572xc1722a7f.p1598x6b0147b.f fVar, db2.v3 v3Var) {
        this.f203706a = fVar;
        this.f203707b = v3Var;
    }

    @Override // db2.d3
    /* renamed from: isBeginHistory */
    public boolean mo11121xd9b295f5() {
        return this.f203706a.f203724m;
    }

    @Override // db2.d3
    /* renamed from: isResultConsume */
    public boolean mo11122x83d23815(int i17, int i18, r45.ny3 resp) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(resp, "resp");
        db2.v3 v3Var = this.f203707b;
        if (v3Var != null) {
            return v3Var.a(i17, i18, null, resp);
        }
        return false;
    }

    @Override // db2.d3
    /* renamed from: onBuildRequest */
    public void mo11123x6b44d7c0(db2.b3 request) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(request, "request");
    }

    @Override // db2.d3
    /* renamed from: onLoadFinish */
    public void mo11124xa374d858() {
    }
}
