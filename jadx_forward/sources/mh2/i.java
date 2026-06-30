package mh2;

/* loaded from: classes3.dex */
public final class i extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f407900d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mh2.k f407901e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ om2.d0 f407902f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(mh2.k kVar, om2.d0 d0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f407901e = kVar;
        this.f407902f = d0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new mh2.i(this.f407901e, this.f407902f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((mh2.i) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        jz5.f0 f0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f407900d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            mh2.k kVar = this.f407901e;
            om2.e0 e0Var = (om2.e0) this.f407902f;
            this.f407900d = 1;
            obj = mh2.k.a(kVar, e0Var, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        java.lang.String coverUrl = (java.lang.String) obj;
        mh2.k kVar2 = this.f407901e;
        if (kVar2.f407914m instanceof om2.e0) {
            kVar2.getClass();
            if (coverUrl == null || coverUrl.length() == 0) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("KTVCoverBackgroundWidget", "updateKTVCover got null song cover url");
                kVar2.g();
            } else {
                com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i iVar = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i.f197073a;
                mh2.j jVar = new mh2.j(kVar2);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.g(coverUrl, "coverUrl");
                com.p314xaae8f345.mm.sdk.p2603x2137b148.r2 r2Var = com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.i.f197074b;
                synchronized (r2Var) {
                    obj2 = r2Var.get(coverUrl);
                }
                java.lang.StringBuilder sb6 = new java.lang.StringBuilder("loadSongCoverBlurBg coverUrl:");
                sb6.append(coverUrl);
                sb6.append(",cache bm is null:");
                sb6.append(obj2 == null);
                sb6.append('!');
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("BlurAvatarUtil", sb6.toString());
                jz5.l lVar = (jz5.l) obj2;
                if (lVar != null) {
                    zl2.r4.f555483a.R2(kVar2, (android.graphics.Bitmap) lVar.f384367e);
                    jVar.mo146xb9724478(lVar.f384366d);
                    f0Var = jz5.f0.f384359a;
                } else {
                    f0Var = null;
                }
                if (f0Var == null) {
                    mn2.g1 g1Var = mn2.g1.f411508a;
                    wo0.c b17 = g1Var.e().b(new mn2.q3(coverUrl, com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1636x8fb0427b.y90.f209888e), g1Var.h(mn2.f1.G));
                    com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h hVar = new com.p314xaae8f345.mm.p1006xc5476f33.p1418xb4097826.p1473x32b0ec.p1531x36f002.h(iVar, coverUrl, kVar2, jVar);
                    b17.getClass();
                    b17.f529406d = hVar;
                    b17.f();
                }
            }
        }
        return jz5.f0.f384359a;
    }
}
