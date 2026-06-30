package vd0;

/* loaded from: classes11.dex */
public final class h1 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f516955d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f516956e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac f516957f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wd0.c2 f516958g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830 f516959h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ vd0.v1 f516960i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ r45.k57 f516961m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(int i17, com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac, wd0.c2 c2Var, com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830 c10686xf24fb830, vd0.v1 v1Var, r45.k57 k57Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f516956e = i17;
        this.f516957f = c10685x7a6659ac;
        this.f516958g = c2Var;
        this.f516959h = c10686xf24fb830;
        this.f516960i = v1Var;
        this.f516961m = k57Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new vd0.h1(this.f516956e, this.f516957f, this.f516958g, this.f516959h, this.f516960i, this.f516961m, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((vd0.h1) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f516955d;
        int i18 = this.f516956e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.th thVar = new r45.th();
            wd0.f[] fVarArr = wd0.f.f526244d;
            r45.dy6 dy6Var = null;
            if (i18 == 2) {
                thVar.f467951d = 2;
                thVar.f467952e = null;
            } else {
                thVar.f467951d = i18;
                com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10686xf24fb830 c10686xf24fb830 = this.f516959h;
                if (c10686xf24fb830 != null) {
                    this.f516960i.getClass();
                    dy6Var = new r45.dy6();
                    r45.gc6 gc6Var = new r45.gc6();
                    r45.hc6 hc6Var = new r45.hc6();
                    r45.ic6 ic6Var = new r45.ic6();
                    com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10683xdec4b5b4 c10683xdec4b5b4 = c10686xf24fb830.f149350d;
                    gc6Var.f456628d = c10683xdec4b5b4.f149340e;
                    gc6Var.f456629e = c10683xdec4b5b4.f149341f;
                    com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10684xe921b56 c10684xe921b56 = c10686xf24fb830.f149351e;
                    java.lang.String str = c10684xe921b56.f149344e;
                    gc6Var.f456630f = str;
                    java.lang.String str2 = c10684xe921b56.f149345f;
                    gc6Var.f456631g = str2;
                    java.lang.String str3 = c10683xdec4b5b4.f149342g;
                    hc6Var.f457586d = str3;
                    hc6Var.f457587e = "920";
                    hc6Var.f457588f = str;
                    hc6Var.f457589g = str2;
                    ic6Var.f458468d = str3;
                    ic6Var.f458469e = "920";
                    ic6Var.f458470f = str;
                    ic6Var.f458471g = str2;
                    dy6Var.f454394e = gc6Var;
                    dy6Var.f454395f = hc6Var;
                    dy6Var.f454396g = ic6Var;
                    dy6Var.f454393d = str3.length() == 0 ? 1 : 2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] cgiVerifyParam: " + dy6Var);
                }
                thVar.f467952e = dy6Var;
            }
            thVar.f467953f = new com.p314xaae8f345.mm.p2495xc50a8b8b.g(this.f516961m.mo14344x5f01b1f6());
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152200d = 10842;
            lVar.f152199c = "/cgi-bin/micromsg-bin/bindfingerprintforlogin";
            lVar.f152197a = thVar;
            lVar.f152198b = new r45.uh();
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p944x882e457a.i iVar = new com.p314xaae8f345.mm.p944x882e457a.i();
            iVar.p(a17);
            this.f516955d = 1;
            obj = rm0.h.b(iVar, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        com.p314xaae8f345.mm.p944x882e457a.f fVar = (com.p314xaae8f345.mm.p944x882e457a.f) obj;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("SettingFingerprintService", "[fingerprint login] bindFingerprintCgi errType: " + fVar.f152148a + ", errCode: " + fVar.f152149b + ", errMsg isNull: " + fVar.f152150c + ",opcode is " + i18);
        int i19 = fVar.f152149b;
        com.p314xaae8f345.mm.p689xc5a27af6.p763x765f0e50.api.C10685x7a6659ac c10685x7a6659ac = this.f516957f;
        c10685x7a6659ac.f149347e = i19;
        c10685x7a6659ac.f149346d = fVar.f152148a;
        java.lang.String str4 = fVar.f152150c;
        if (str4 != null) {
            c10685x7a6659ac.getClass();
            c10685x7a6659ac.f149348f = str4;
        }
        java.lang.String obj2 = ((r45.uh) fVar.f152151d).toString();
        c10685x7a6659ac.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(obj2, "<set-?>");
        c10685x7a6659ac.f149349g = obj2;
        this.f516958g.a(c10685x7a6659ac);
        return jz5.f0.f384359a;
    }
}
