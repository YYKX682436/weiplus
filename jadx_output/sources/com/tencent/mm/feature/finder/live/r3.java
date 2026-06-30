package com.tencent.mm.feature.finder.live;

/* loaded from: classes.dex */
public final class r3 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ yz5.q f66886a;

    public r3(yz5.q qVar) {
        this.f66886a = qVar;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        r45.nw1 liveInfo;
        r45.nw1 liveInfo2;
        com.tencent.mm.modelbase.f fVar = (com.tencent.mm.modelbase.f) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("getFinderLivePreviewUrl errCode:");
        sb6.append(fVar.f70616b);
        sb6.append(" errType:");
        sb6.append(fVar.f70615a);
        sb6.append(" url:");
        com.tencent.mm.protocal.protobuf.FinderObject finderObject = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
        java.lang.String str = null;
        sb6.append((finderObject == null || (liveInfo2 = finderObject.getLiveInfo()) == null) ? null : liveInfo2.getString(3));
        com.tencent.mars.xlog.Log.i("MicroMsg.FinderLiveFeatureService", sb6.toString());
        int i17 = fVar.f70615a;
        yz5.q qVar = this.f66886a;
        if (i17 == 0 && fVar.f70616b == 0) {
            com.tencent.mm.protocal.protobuf.FinderObject finderObject2 = (com.tencent.mm.protocal.protobuf.FinderObject) ((r45.h51) fVar.f70618d).getCustom(2);
            if (finderObject2 != null && (liveInfo = finderObject2.getLiveInfo()) != null) {
                str = liveInfo.getString(3);
            }
            qVar.invoke(str, fVar.f70617c, java.lang.Integer.valueOf(fVar.f70616b));
        } else {
            qVar.invoke("", fVar.f70617c, -1);
        }
        return jz5.f0.f302826a;
    }
}
