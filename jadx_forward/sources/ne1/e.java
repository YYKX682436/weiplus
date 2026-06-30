package ne1;

/* loaded from: classes7.dex */
public class e implements com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 f418050a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f418051b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ne1.f f418052c;

    public e(ne1.f fVar, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1187x7643c6b5.c0 c0Var, int i17) {
        this.f418052c = fVar;
        this.f418050a = c0Var;
        this.f418051b = i17;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0
    public void a(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1045xaf3f8342.C11809xbc286be4 c11809xbc286be4, com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1183xc84c5534.C12559xbdae8559 c12559xbdae8559) {
        if (c11809xbc286be4 == null) {
            this.f418050a.a(this.f418051b, this.f418052c.o("fail sync error"));
        } else if (this.f418050a.t3() == null || this.f418050a.t3().S || this.f418050a.t3().L0()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.JsApiUpdateApp", "onResult with newConfig(%s %d %d) but runtime destroyed", c11809xbc286be4.f158811d, java.lang.Integer.valueOf(c11809xbc286be4.f158814g), java.lang.Integer.valueOf(c11809xbc286be4.L));
        } else {
            this.f418050a.m(new ne1.d(this, c11809xbc286be4));
        }
    }
}
