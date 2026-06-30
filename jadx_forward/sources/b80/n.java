package b80;

/* loaded from: classes10.dex */
public final class n extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f99789d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f99790e;

    /* renamed from: f, reason: collision with root package name */
    public int f99791f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ o70.h f99792g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ b80.u f99793h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(o70.h hVar, b80.u uVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f99792g = hVar;
        this.f99793h = uVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new b80.n(this.f99792g, this.f99793h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((b80.n) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String ij6;
        java.lang.Object c17;
        java.lang.Object a17;
        java.lang.StringBuilder sb6;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f99791f;
        jz5.f0 f0Var = jz5.f0.f384359a;
        java.lang.String str = "MicroMsg.ImgUpload.SendImgPreFeatureService";
        b80.u uVar = this.f99793h;
        o70.h hVar = this.f99792g;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            if (com.p314xaae8f345.mm.sdk.p2603x2137b148.y1.c(hVar.f424770e)) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "[" + hVar.f424767b + "] img is gif no need to build " + hVar.f424770e);
                return f0Var;
            }
            b80.f fVar = b80.u.f99807n;
            uVar.getClass();
            ij6 = uVar.ij(hVar.f424770e, hVar.f424769d);
            v65.h hVar2 = (v65.h) ((jz5.n) uVar.f99812f).mo141623x754a37bb();
            this.f99789d = ij6;
            this.f99791f = 1;
            c17 = hVar2.c(ij6, this);
            if (c17 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                if (i17 != 2) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                sb6 = (java.lang.StringBuilder) this.f99790e;
                str = (java.lang.String) this.f99789d;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                a17 = obj;
                sb6.append(a17);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
                return f0Var;
            }
            ij6 = (java.lang.String) this.f99789d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            c17 = obj;
        }
        if (((java.lang.Boolean) c17).booleanValue()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.ImgUpload.SendImgPreFeatureService", "inFlow " + ij6);
            v65.i.b((com.p314xaae8f345.mm.sdk.p2597xc267989b.C20976x6ba6452a) ((jz5.n) uVar.f99814h).mo141623x754a37bb(), null, new b80.m(uVar, hVar, ij6, null), 1, null);
            return f0Var;
        }
        jx3.f.INSTANCE.mo68477x336bdfd8(1949L, 1L, 1L, false);
        java.lang.StringBuilder sb7 = new java.lang.StringBuilder();
        sb7.append("already in flow check:");
        sb7.append(ij6);
        sb7.append(" inFlow:");
        v65.h hVar3 = (v65.h) ((jz5.n) uVar.f99812f).mo141623x754a37bb();
        this.f99789d = "MicroMsg.ImgUpload.SendImgPreFeatureService";
        this.f99790e = sb7;
        this.f99791f = 2;
        a17 = hVar3.a(this);
        if (a17 == aVar) {
            return aVar;
        }
        sb6 = sb7;
        sb6.append(a17);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
        return f0Var;
    }
}
