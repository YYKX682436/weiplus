package com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36;

/* loaded from: classes14.dex */
public final class g0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f218671d;

    /* renamed from: e, reason: collision with root package name */
    public int f218672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 f218673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f218674g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f218673f = j0Var;
        this.f218674g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.g0(this.f218673f, this.f218674g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.g0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var;
        java.lang.String str;
        java.lang.Object Hi;
        dn.m mVar;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f218672e;
        java.lang.String str3 = this.f218674g;
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0 j0Var2 = this.f218673f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean K0 = com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(j0Var2.f218683f);
            tz2.q qVar = j0Var2.f218681d;
            if (K0 || !com.p314xaae8f345.mm.vfs.w6.j(j0Var2.f218683f)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionRecordUIC", "cdn upload filePath is empty");
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.O6(j0Var2, "", "", str3);
                qVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "cancelRecord");
                h72.s.e().d();
            } else if (com.p314xaae8f345.mm.vfs.w6.k(j0Var2.f218683f) <= j0Var2.f218687m) {
                java.lang.String str4 = j0Var2.f218683f;
                dn.m mVar2 = new dn.m();
                mVar2.f323318d = "task_FaceUploadVideoForPaySafetyService";
                mVar2.f69601xaca5bdda = com.p314xaae8f345.mm.p1006xc5476f33.p1404x3e850340.p1405x633fb29.s0.f(str4);
                mVar2.f69595x6d25b0d9 = str4;
                mVar2.f69619xe9ed65f6 = "";
                mVar2.f69592xf1ebe47b = 5;
                mVar2.f69618x114ef53e = "";
                mVar2.f69609xd84b8349 = 2;
                mVar2.f69606xccdbf540 = false;
                mVar2.f69597x853bb235 = false;
                mVar2.f69580x454032b6 = 0;
                mVar2.f69584x89a4c0cf = 0;
                mVar2.f69598x47e3df1e = 0;
                i95.m c17 = i95.n0.c(sx.b0.class);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
                this.f218671d = mVar2;
                this.f218672e = 1;
                j0Var = j0Var2;
                str = "";
                Hi = sx.b0.Hi((sx.b0) c17, mVar2, 0L, null, this, 6, null);
                if (Hi == aVar) {
                    return aVar;
                }
                mVar = mVar2;
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionRecordUIC", "file size too big, cancel upload");
                com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.O6(j0Var2, "", "", str3);
                qVar.getClass();
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "cancelRecord");
                h72.s.e().d();
            }
            return jz5.f0.f384359a;
        }
        if (i17 != 1) {
            throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dn.m mVar3 = (dn.m) this.f218671d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        mVar = mVar3;
        j0Var = j0Var2;
        str = "";
        Hi = obj;
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) Hi;
        if ((n1Var == null) || n1Var.f152636a != com.p314xaae8f345.mm.p947xba6de98f.m1.f152612h) {
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doUploadFailResult] cdn upload failed, mediaId: ");
            sb6.append(mVar.f69601xaca5bdda);
            sb6.append(", ret：");
            sb6.append(n1Var != null ? new java.lang.Integer(n1Var.f152638c) : null);
            sb6.append(", action: ");
            sb6.append(n1Var != null ? n1Var.f152636a : null);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FaceFlashActionRecordUIC", sb6.toString());
            str2 = str;
        } else {
            dn.h hVar = n1Var.f152641f;
            str2 = hVar != null ? hVar.f69522xf9dbbe9c : null;
            if (str2 == null) {
                str2 = str;
            }
            java.lang.String str5 = hVar != null ? hVar.f69502xf11df5f5 : null;
            if (str5 != null) {
                str = str5;
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashActionRecordUIC", "[doUploadFailResult] cdn upload success, mediaId:" + mVar.f69601xaca5bdda + ", fileId: " + str2 + ", aesKey: " + str);
        }
        com.p314xaae8f345.mm.p1006xc5476f33.p1696x5cfeff0.p1697xab2f7e36.j0.O6(j0Var, str2, str, str3);
        j0Var.f218681d.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.FaceFlashRecordManagerForPay", "cancelRecord");
        h72.s.e().d();
        return jz5.f0.f384359a;
    }
}
