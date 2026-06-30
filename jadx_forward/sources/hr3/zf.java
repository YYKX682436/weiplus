package hr3;

/* loaded from: classes.dex */
public final class zf extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f365777d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ r45.v60 f365778e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zf(r45.v60 v60Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365778e = v60Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr3.zf(this.f365778e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.zf) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365777d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hr3.ag agVar = hr3.ag.f364937a;
            java.lang.String a17 = en1.a.a();
            this.f365777d = 1;
            obj = agVar.c(a17, this.f365778e, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SayHiPictureUploader", "trySaveCommonSayHiPicture() called getImgFile finish USERINFO_COMMON_SAY_HI_STRING_SYNC set imgFilePath:" + ((java.lang.String) obj));
        return jz5.f0.f384359a;
    }
}
