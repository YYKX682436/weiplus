package com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71;

/* loaded from: classes8.dex */
public final class z0 extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f269488d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f269489e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f269490f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.f1 f1Var, java.lang.String str, yz5.l lVar) {
        super(0);
        this.f269488d = f1Var;
        this.f269489e = str;
        this.f269490f = lVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        nw4.n nVar = (nw4.n) this.f269488d.f269344a.get();
        if (nVar != null) {
            com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y0 y0Var = new com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2438xd5635c71.y0(this.f269490f);
            boolean e17 = com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.e();
            java.lang.String str = this.f269489e;
            if (e17) {
                nVar.f422420a.mo14660x738236e6(str, y0Var);
            } else {
                com.p314xaae8f345.mm.sdk.p2603x2137b148.u3.h(new nw4.j2(nVar, str, y0Var));
            }
        }
        return jz5.f0.f384359a;
    }
}
