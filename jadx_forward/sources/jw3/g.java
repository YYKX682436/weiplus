package jw3;

/* loaded from: classes8.dex */
public final class g extends com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ jw3.i f383855e;

    public g(jw3.i iVar) {
        this.f383855e = iVar;
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    public java.lang.String Ni() {
        try {
            zg0.q2 q2Var = this.f383855e.f383859h;
            if (q2Var == null) {
                return "";
            }
            java.lang.String str = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).E;
            return str == null ? "" : str;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SelectTextDialog", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }

    @Override // com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.b, com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2416x3608ae.z0
    /* renamed from: getCurrentUrl */
    public java.lang.String mo70208xad58292c() {
        try {
            zg0.q2 q2Var = this.f383855e.f383859h;
            if (q2Var == null) {
                return "";
            }
            java.lang.String Z = ((com.p314xaae8f345.mm.p1006xc5476f33.p2403x48fb3bf9.p2404x2eaf9f.r0) q2Var).Z();
            return Z == null ? "" : Z;
        } catch (java.lang.Throwable th6) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("MicroMsg.SelectTextDialog", th6, "getCommitUrl exception", new java.lang.Object[0]);
            return "";
        }
    }
}
