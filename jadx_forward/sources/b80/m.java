package b80;

/* loaded from: classes10.dex */
public final class m extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f99785d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ b80.u f99786e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ o70.h f99787f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f99788g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(b80.u uVar, o70.h hVar, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99786e = uVar;
        this.f99787f = hVar;
        this.f99788g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b80.m(this.f99786e, this.f99787f, this.f99788g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b80.m) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f99785d;
        java.lang.String str = this.f99788g;
        b80.u uVar = this.f99786e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            o70.h hVar = this.f99787f;
            uVar.pj(hVar);
            boolean booleanValue = ((java.lang.Boolean) ((jz5.n) uVar.f99816m).mo141623x754a37bb()).booleanValue();
            this.f99785d = 1;
            if (uVar.qj(hVar, booleanValue, this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "outFlow " + str);
                return jz5.f0.f384359a;
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        v65.h hVar2 = (v65.h) ((jz5.n) uVar.f99812f).mo141623x754a37bb();
        this.f99785d = 2;
        if (hVar2.d(str, this) == aVar) {
            return aVar;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "outFlow " + str);
        return jz5.f0.f384359a;
    }
}
