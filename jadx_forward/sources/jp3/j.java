package jp3;

/* loaded from: classes14.dex */
public final class j extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f382537d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dn.m f382538e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382539f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ jp3.k f382540g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f382541h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ r45.t45 f382542i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ kp3.g f382543m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dn.m mVar, java.lang.String str, jp3.k kVar, java.lang.String str2, r45.t45 t45Var, kp3.g gVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f382538e = mVar;
        this.f382539f = str;
        this.f382540g = kVar;
        this.f382541h = str2;
        this.f382542i = t45Var;
        this.f382543m = gVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new jp3.j(this.f382538e, this.f382539f, this.f382540g, this.f382541h, this.f382542i, this.f382543m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((jp3.j) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object Hi;
        dn.h hVar;
        byte[] bArr;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f382537d;
        dn.m mVar = this.f382538e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            jp3.t.f382562a.b(mVar.f69601xaca5bdda);
            i95.m c17 = i95.n0.c(sx.b0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            dn.m mVar2 = this.f382538e;
            this.f382537d = 1;
            Hi = sx.b0.Hi((sx.b0) c17, mVar2, 0L, null, this, 6, null);
            if (Hi == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            Hi = obj;
        }
        com.p314xaae8f345.mm.p947xba6de98f.n1 n1Var = (com.p314xaae8f345.mm.p947xba6de98f.n1) Hi;
        boolean z17 = n1Var == null;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!z17 && n1Var.f152636a == com.p314xaae8f345.mm.p947xba6de98f.m1.f152612h) {
            jp3.t tVar = jp3.t.f382562a;
            java.lang.String str = mVar.f69601xaca5bdda;
            java.lang.String str2 = mVar.f69591xf9dbbe9c;
            java.lang.String str3 = this.f382539f;
            java.lang.Integer num = new java.lang.Integer(0);
            dn.h hVar2 = n1Var.f152641f;
            tVar.e(str, str2, str3, num, hVar2 != null ? new java.lang.Long(hVar2.f69523x17c343e7) : null);
            dn.h hVar3 = n1Var.f152641f;
            java.lang.String str4 = hVar3 != null ? hVar3.f69522xf9dbbe9c : null;
            if (str4 == null) {
                str4 = "";
            }
            java.lang.String str5 = str4;
            java.lang.String str6 = hVar3 != null ? hVar3.f69502xf11df5f5 : null;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.PalmPrintLogic", "[doUploadFailResult] cdn upload success, mediaId:" + mVar.f69601xaca5bdda + ", fileId: " + str5);
            jp3.g gVar = jp3.g.f382533a;
            if (str6 != null) {
                bArr = str6.getBytes(r26.c.f450398a);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bArr, "getBytes(...)");
            } else {
                bArr = null;
            }
            java.lang.String f17 = gVar.f(bArr, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
            java.lang.String f18 = gVar.f(this.f382540g.f382547g, "0425f42ebcd1f19badf9b41753227383721e2df2a36b36420cda9b46d9f9c72f6025b2bc388defa7cb1c6482b156e7c9c44ffdd5a16a82f007e1e929a178769554");
            boolean z18 = f17.length() == 0;
            java.lang.String str7 = this.f382541h;
            if (!z18) {
                if (!(f18.length() == 0)) {
                    tVar.d("uploadonlineopenresource");
                    java.lang.String str8 = this.f382539f;
                    r45.t45 t45Var = this.f382542i;
                    kp3.g gVar2 = this.f382543m;
                    new ip3.c(str8, f17, f18, str5, t45Var, gVar2 != null ? gVar2.f392523b : null).l().K(new jp3.i(this.f382539f, str7));
                }
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintLogic", "[doUploadFailResult] error, encrypt key failed. encryptedCdnKey.len:" + f17.length() + "，encryptedPalmFileKey.len:" + f18.length());
            gVar.a(str7);
            return f0Var;
        }
        jp3.t.f382562a.e(mVar.f69601xaca5bdda, mVar.f69591xf9dbbe9c, this.f382539f, new java.lang.Integer(-1), (n1Var == null || (hVar = n1Var.f152641f) == null) ? null : new java.lang.Long(hVar.f69523x17c343e7));
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("[doUploadFailResult] cdn upload failed, mediaId: ");
        sb6.append(mVar.f69601xaca5bdda);
        sb6.append(", ret：");
        sb6.append(n1Var != null ? new java.lang.Integer(n1Var.f152638c) : null);
        sb6.append(", action: ");
        sb6.append(n1Var != null ? n1Var.f152636a : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.PalmPrintLogic", sb6.toString());
        return f0Var;
    }
}
