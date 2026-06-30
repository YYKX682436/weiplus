package iy4;

/* loaded from: classes11.dex */
public final class y extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f377561d;

    /* renamed from: e, reason: collision with root package name */
    public int f377562e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ug3.k f377563f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.content.Context f377564g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377565h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(ug3.k kVar, android.content.Context context, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377563f = kVar;
        this.f377564g = context;
        this.f377565h = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iy4.y(this.f377563f, this.f377564g, this.f377565h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((iy4.y) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377562e;
        try {
        } catch (java.lang.Exception e17) {
            ot5.g.a("MicroMsg.ExtDeviceService", "open unlock page failed for uuid: " + this.f377565h + ", error: " + e17.getMessage());
        }
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ext_device", null, false, null, 28, null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            byte[] mo14344x5f01b1f6 = this.f377563f.mo14344x5f01b1f6();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
            linkedHashMap.put("deviceInfo", mo14344x5f01b1f6);
            this.f377561d = l1Var;
            this.f377562e = 1;
            if (l1Var.o("unlockDevice", linkedHashMap, this) == aVar) {
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
            l1Var = (pi0.l1) this.f377561d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l1Var.a(kz5.b0.c(new iy4.p()));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        c10716x931597c6.f149651e = 1;
        android.content.Context context = this.f377564g;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "$context");
        this.f377561d = null;
        this.f377562e = 2;
        if (pi0.l1.v(l1Var, context, c10716x931597c6, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
