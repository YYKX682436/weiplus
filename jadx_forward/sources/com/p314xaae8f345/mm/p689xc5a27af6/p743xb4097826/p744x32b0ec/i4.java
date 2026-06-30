package com.p314xaae8f345.mm.p689xc5a27af6.p743xb4097826.p744x32b0ec;

/* loaded from: classes.dex */
public final class i4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148301a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f148302b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.r f148303c;

    public i4(java.lang.String str, java.lang.String str2, yz5.r rVar) {
        this.f148301a = str;
        this.f148302b = str2;
        this.f148303c = rVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        r45.ov0 ov0Var;
        java.util.LinkedList m75941xfb821914;
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMicInfos errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152148a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f152149b) : null);
        sb6.append(" encryptedId:");
        sb6.append(this.f148301a);
        sb6.append(" nonceId:");
        sb6.append(this.f148302b);
        sb6.append(" result:");
        sb6.append((fVar == null || (ov0Var = (r45.ov0) fVar.f152151d) == null || (m75941xfb821914 = ov0Var.m75941xfb821914(1)) == null) ? null : java.lang.Integer.valueOf(m75941xfb821914.size()));
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar != null ? fVar.f152148a : 0);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar != null ? fVar.f152149b : 0);
        java.lang.String str = fVar != null ? fVar.f152150c : null;
        if (str == null) {
            str = "";
        }
        this.f148303c.C(valueOf, valueOf2, str, fVar != null ? (r45.ov0) fVar.f152151d : null);
        return jz5.f0.f384359a;
    }
}
