package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public class k0 implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 f166243d;

    public k0(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 c12330xa378a092) {
        this.f166243d = c12330xa378a092;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        java.lang.String str = (java.lang.String) obj;
        java.lang.Boolean bool = (java.lang.Boolean) obj2;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrandPreInitTask", "AppBrandTeenModeTempAuthMgr check callback appId:%s, canGoOn:%b", str, bool);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.C12330xa378a092 c12330xa378a092 = this.f166243d;
        boolean equals = str.equals(c12330xa378a092.f165905q.f158811d);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.o0 o0Var = c12330xa378a092.f165897f;
        if (equals && bool.booleanValue()) {
            o0Var.a(c12330xa378a092.f165905q, c12330xa378a092.f165901m.f166443o);
        } else {
            o0Var.a(null, null);
        }
        c12330xa378a092.x();
        return null;
    }
}
