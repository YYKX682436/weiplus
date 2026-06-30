package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class i4 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f66769b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ yz5.r f66770c;

    public i4(java.lang.String str, java.lang.String str2, yz5.r rVar) {
        this.f66768a = str;
        this.f66769b = str2;
        this.f66770c = rVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.ov0 ov0Var;
        java.util.LinkedList list;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadMicInfos errType:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70615a) : null);
        sb6.append(" errCode:");
        sb6.append(fVar != null ? java.lang.Integer.valueOf(fVar.f70616b) : null);
        sb6.append(" encryptedId:");
        sb6.append(this.f66768a);
        sb6.append(" nonceId:");
        sb6.append(this.f66769b);
        sb6.append(" result:");
        sb6.append((fVar == null || (ov0Var = (r45.ov0) fVar.f70618d) == null || (list = ov0Var.getList(1)) == null) ? null : java.lang.Integer.valueOf(list.size()));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        java.lang.Integer valueOf = java.lang.Integer.valueOf(fVar != null ? fVar.f70615a : 0);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(fVar != null ? fVar.f70616b : 0);
        java.lang.String str = fVar != null ? fVar.f70617c : null;
        if (str == null) {
            str = "";
        }
        this.f66770c.C(valueOf, valueOf2, str, fVar != null ? (r45.ov0) fVar.f70618d : null);
        return jz5.f0.f302826a;
    }
}
