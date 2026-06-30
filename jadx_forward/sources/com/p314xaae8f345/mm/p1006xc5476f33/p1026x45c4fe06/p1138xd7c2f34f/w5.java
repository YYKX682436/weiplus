package com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f;

/* loaded from: classes7.dex */
public final class w5 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u f166859a;

    public w5(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u uVar) {
        this.f166859a = uVar;
    }

    @Override // gm5.a
    /* renamed from: call */
    public java.lang.Object mo1059x2e7a5e(java.lang.Object obj) {
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        if (!th1.a.b(fVar)) {
            return com.p314xaae8f345.mm.p944x882e457a.f.a(fVar != null ? fVar.f152148a : -1, fVar != null ? fVar.f152149b : -1, fVar != null ? fVar.f152150c : null, null, null, fVar != null ? fVar.f152153f : null);
        }
        java.util.LinkedList resp_list = ((r45.kf) fVar.f152151d).f460177d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp_list, "resp_list");
        r45.me3 me3Var = (r45.me3) kz5.n0.Z(resp_list);
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.u uVar = this.f166859a;
        if (me3Var == null) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
            r45.os3 D = uVar.D();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D, "getRequest(...)");
            sb6.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f(D));
            sb6.append(" useNewCgi=TRUE, get NULL respItem");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb6.toString());
            return com.p314xaae8f345.mm.p944x882e457a.f.a(-1, -1, null, null, null, this.f166859a);
        }
        r45.ps3 ps3Var = new r45.ps3();
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
        r45.os3 D2 = uVar.D();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D2, "getRequest(...)");
        sb7.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f(D2));
        sb7.append(", get resp_list.size:");
        sb7.append(((r45.kf) fVar.f152151d).f460177d.size());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb7.toString());
        java.util.LinkedList<r45.me3> resp_list2 = ((r45.kf) fVar.f152151d).f460177d;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(resp_list2, "resp_list");
        for (r45.me3 me3Var2 : resp_list2) {
            java.lang.StringBuilder sb8 = new java.lang.StringBuilder("wormholeForLegacyReleaseCode with ");
            r45.os3 D3 = uVar.D();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(D3, "getRequest(...)");
            sb8.append(com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.x5.f(D3));
            sb8.append(", get item[ errcode:");
            sb8.append(me3Var2.f461931d);
            sb8.append(", md5:");
            sb8.append(me3Var2.f461933f);
            sb8.append(", is_patch:");
            sb8.append(me3Var2.f461936i);
            sb8.append(", is_zstd:");
            sb8.append(me3Var2.f461937m);
            sb8.append(", url:");
            sb8.append(me3Var2.f461932e);
            sb8.append(" ]");
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.GetPkgDownloadUrlUnifiedCgiRouter", sb8.toString());
            ps3Var.f464909f = me3Var2.f461934g;
            if (me3Var2.f461937m) {
                ps3Var.f464913m = me3Var2.f461932e;
            } else if (me3Var2.f461936i) {
                ps3Var.f464910g = me3Var2.f461932e;
            } else {
                ps3Var.f464908e = me3Var2.f461932e;
            }
        }
        return com.p314xaae8f345.mm.p944x882e457a.f.a(fVar.f152148a, fVar.f152149b, fVar.f152150c, ps3Var, null, this.f166859a);
    }
}
