package rg1;

/* loaded from: classes7.dex */
public final class n extends com.p314xaae8f345.mm.p944x882e457a.i {

    /* renamed from: m, reason: collision with root package name */
    public final java.lang.String f476758m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f476759n;

    public n(java.lang.String str, java.lang.String str2) {
        this.f476758m = str;
        this.f476759n = str2;
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    /* renamed from: k */
    public void x(int i17, int i18, java.lang.String str, com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, com.p314xaae8f345.mm.p944x882e457a.m1 m1Var) {
        r45.v54 v54Var = (r45.v54) fVar;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiPrefetchLaunchWxaApp", "onCgiBack, instance[" + hashCode() + "] errType[" + i17 + "] errCode[" + i18 + "] errMsg[" + str + "], accHasReady[" + gm0.j1.a() + ']');
        if (gm0.j1.a()) {
            java.lang.String str2 = v54Var != null ? v54Var.f469441m : null;
            if (!(str2 == null || str2.length() == 0) && th1.a.a(i17, i18, v54Var)) {
                com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1138xd7c2f34f.i9 Zi = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.app.r9.Zi();
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(v54Var);
                java.lang.String str3 = v54Var.f469441m;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str3);
                Zi.z0(str3, v54Var);
            }
        }
    }

    @Override // com.p314xaae8f345.mm.p944x882e457a.i
    public pq5.g l() {
        java.lang.String str = this.f476758m;
        if (str == null || str.length() == 0) {
            return pq5.h.d(new rg1.m(this));
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("run() with username[");
        sb6.append(str);
        sb6.append("] enterPath[");
        java.lang.String str2 = this.f476759n;
        sb6.append(str2);
        sb6.append("] instance[");
        sb6.append(hashCode());
        sb6.append(']');
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AppBrand.CgiPrefetchLaunchWxaApp", sb6.toString());
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        r45.u54 u54Var = new r45.u54();
        u54Var.f468598q = str;
        r45.ac7 ac7Var = new r45.ac7();
        ac7Var.f451462g = str2;
        u54Var.f468589e = ac7Var;
        u54Var.f468599r = true;
        u54Var.f468600s = true;
        r45.fd7 fd7Var = new r45.fd7();
        com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1033x6ff8513a.InterfaceC11702x4ae7c33 a17 = com.p314xaae8f345.mm.p1006xc5476f33.p1026x45c4fe06.p1029x45cb6201.x7.a();
        fd7Var.f455779d = a17 != null ? a17.i() : -1;
        u54Var.f468592h = fd7Var;
        r45.y50 y50Var = new r45.y50();
        y50Var.f472332f = 1;
        u54Var.f468604w = y50Var;
        lVar.f152197a = u54Var;
        lVar.f152200d = 1122;
        lVar.f152199c = "/cgi-bin/mmbiz-bin/wxaattr/launchwxaapp";
        lVar.f152198b = new r45.v54();
        com.p314xaae8f345.mm.p944x882e457a.o a18 = lVar.a();
        com.p314xaae8f345.mm.p944x882e457a.m mVar = a18.f152243a;
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = mVar.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.L((r45.u54) fVar);
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar2 = mVar.f152217a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar2, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.LaunchWxaAppRequest");
        qg1.d.K((r45.u54) fVar2);
        p(a18);
        pq5.g l17 = super.l();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(l17);
        return l17;
    }
}
