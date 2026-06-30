package th5;

/* loaded from: classes12.dex */
public final class e0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f500903d;

    /* renamed from: e, reason: collision with root package name */
    public int f500904e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ th5.o f500905f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ th5.g0 f500906g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(th5.o oVar, th5.g0 g0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500905f = oVar;
        this.f500906g = g0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new th5.e0(this.f500905f, this.f500906g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((th5.e0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f500904e;
        th5.g0 g0Var = this.f500906g;
        th5.o oVar = this.f500905f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            oVar.getClass();
            java.lang.String a17 = th5.m.f500940a.a(oVar.b());
            java.lang.String str2 = oVar.f500952d;
            th5.f1 f1Var = th5.f1.f500913a;
            java.lang.String str3 = "origin_download id=" + oVar.mo2110x5db1b11();
            th5.d0 d0Var = new th5.d0(oVar, g0Var);
            this.f500903d = a17;
            this.f500904e = 1;
            java.lang.Object a18 = f1Var.a(str2, a17, str3, d0Var, this);
            if (a18 == aVar) {
                return aVar;
            }
            str = a17;
            obj = a18;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (java.lang.String) this.f500903d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (!booleanValue) {
            oVar.f500957i = 0.0f;
            v65.i.c(g0Var.f500481f, null, new th5.a0(oVar, null), 1, null);
            g0Var.W6(oVar, sf3.k.f488931f, oVar.e().a(sf3.m.f488936e));
            return f0Var;
        }
        oVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(str, "<set-?>");
        oVar.f500956h = str;
        oVar.f500957i = 1.0f;
        v65.i.c(g0Var.f500481f, null, new th5.b0(oVar, null), 1, null);
        g0Var.W6(oVar, sf3.k.f488930e, oVar.e().a(sf3.m.f488936e));
        return f0Var;
    }
}
