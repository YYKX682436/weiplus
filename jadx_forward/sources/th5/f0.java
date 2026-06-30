package th5;

/* loaded from: classes12.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f500909d;

    /* renamed from: e, reason: collision with root package name */
    public int f500910e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.o f500911f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f500912g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(th5.o oVar, th5.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500911f = oVar;
        this.f500912g = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new th5.f0(this.f500911f, this.f500912g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        java.lang.String str2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500910e;
        th5.o oVar = this.f500911f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oVar.getClass();
            java.lang.String b17 = th5.m.f500940a.b(oVar.b());
            java.lang.String str3 = oVar.f500953e;
            if (str3 == null) {
                str3 = "";
            }
            if (r26.n0.N(str3)) {
                java.lang.String str4 = oVar.f500952d;
                str = str4 != null ? str4 : "";
            } else {
                str = str3;
            }
            th5.f1 f1Var = th5.f1.f500913a;
            java.lang.String str5 = "thumb_download id=" + oVar.mo2110x5db1b11();
            this.f500909d = b17;
            this.f500910e = 1;
            java.lang.Object a17 = f1Var.a(str, b17, str5, th5.c1.f500890d, this);
            if (a17 == aVar) {
                return aVar;
            }
            str2 = b17;
            obj = a17;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str2 = (java.lang.String) this.f500909d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        th5.g0 g0Var = this.f500912g;
        if (!booleanValue) {
            g0Var.W6(oVar, sf3.k.f488931f, oVar.e().a(sf3.m.f488937f));
            return f0Var;
        }
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str2, "<set-?>");
        oVar.f500955g = str2;
        g0Var.W6(oVar, sf3.k.f488930e, oVar.e().a(sf3.m.f488937f));
        return f0Var;
    }
}
