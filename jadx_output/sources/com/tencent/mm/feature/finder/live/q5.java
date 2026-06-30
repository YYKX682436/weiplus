package com.tencent.mm.feature.finder.live;

/* loaded from: classes3.dex */
public final class q5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.q f66875a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.feature.finder.live.z5 f66876b;

    public q5(kotlinx.coroutines.q qVar, com.tencent.mm.feature.finder.live.z5 z5Var) {
        this.f66875a = qVar;
        this.f66876b = z5Var;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        com.tencent.mm.protobuf.g byteString;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        boolean z17 = fVar != null && fVar.f70615a == 0;
        kotlinx.coroutines.q qVar = this.f66875a;
        r45.wa1 wa1Var = null;
        if (z17 && fVar.f70616b == 0) {
            r45.wa1 wa1Var2 = new r45.wa1();
            r45.nd2 nd2Var = (r45.nd2) fVar.f70618d;
            byte[] g17 = (nd2Var == null || (byteString = nd2Var.getByteString(1)) == null) ? null : byteString.g();
            if (g17 != null) {
                try {
                    wa1Var2.parseFrom(g17);
                    wa1Var = wa1Var2;
                } catch (java.lang.Exception e17) {
                    com.tencent.mm.sdk.platformtools.Log.a("safeParser", "", e17);
                }
            }
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(wa1Var));
        } else {
            ((kotlinx.coroutines.r) qVar).resumeWith(kotlin.Result.m521constructorimpl(null));
            com.tencent.mars.xlog.Log.e(this.f66876b.f67057d, "FinderGetWindowProductProfileCardInfo Request Fail!");
        }
        return jz5.f0.f302826a;
    }
}
