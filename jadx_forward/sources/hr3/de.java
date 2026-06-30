package hr3;

/* loaded from: classes5.dex */
public final class de extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365020d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f365021e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f365022f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de(java.lang.String str, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365021e = str;
        this.f365022f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr3.de(this.f365021e, this.f365022f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.de) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        r45.dz3 dz3Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365020d;
        hr3.ag agVar = hr3.ag.f364937a;
        java.lang.String str = this.f365021e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            boolean z17 = j62.e.g().c(new com.p314xaae8f345.mm.p2502xe5c27cfa.p2506xaf3f8342.p2559xed8e89a9.C20620xe8cb0f9c()) == 1;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "startUpload localPathExist:" + com.p314xaae8f345.mm.vfs.w6.j(str) + " isUseC2C:" + z17);
            this.f365020d = 1;
            obj = agVar.f(str, z17, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        r45.v60 v60Var = (r45.v60) obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startUpload result imgInfo:");
        sb6.append(v60Var != null ? v60Var.mo12245xcc313de3() : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", sb6.toString());
        if (v60Var != null) {
            java.lang.String d17 = agVar.d(v60Var);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUIC", "checkUploadPicture() copy file success oldPath:" + str + " newPath:" + d17 + " ret:" + com.p314xaae8f345.mm.vfs.w6.d(str, d17, false));
            dz3Var = new r45.dz3();
            java.util.LinkedList linkedList = dz3Var.f454402e;
            linkedList.add(v60Var);
            dz3Var.f454401d = linkedList.size();
        } else {
            dz3Var = null;
        }
        p3325xe03a0797.p3326xc267989b.p0 p0Var = p3325xe03a0797.p3326xc267989b.q1.f392101a;
        p3325xe03a0797.p3326xc267989b.g3 g3Var = p3325xe03a0797.p3326xc267989b.p3329x21ffc6bd.b0.f392017a;
        hr3.ce ceVar = new hr3.ce(this.f365022f, dz3Var, null);
        this.f365020d = 2;
        if (p3325xe03a0797.p3326xc267989b.l.g(g3Var, ceVar, this) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
