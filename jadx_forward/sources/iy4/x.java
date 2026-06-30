package iy4;

/* loaded from: classes11.dex */
public final class x extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f377555d;

    /* renamed from: e, reason: collision with root package name */
    public int f377556e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ byte[] f377557f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f377558g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(byte[] bArr, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f377557f = bArr;
        this.f377558g = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new iy4.x(this.f377557f, this.f377558g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((iy4.x) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pi0.l1 l1Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f377556e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            l1Var = new pi0.l1(((e50.z0) ((f50.y) i95.n0.c(f50.y.class))).Ui(), "ext_device", null, false, null, 28, null);
            java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
            linkedHashMap.put("deviceInfoResponse", this.f377557f);
            linkedHashMap.put("loginURL", this.f377558g);
            this.f377555d = l1Var;
            this.f377556e = 1;
            if (l1Var.o("extraDeviceLogin", linkedHashMap, this) == aVar) {
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
            l1Var = (pi0.l1) this.f377555d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        l1Var.a(kz5.b0.c(new iy4.p()));
        com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6 c10716x931597c6 = new com.p314xaae8f345.mm.p775xd2ae381c.ui.C10716x931597c6(0, 0, null, false, false, false, null, 0, false, false, false, null, 4095, null);
        c10716x931597c6.f149651e = 1;
        android.content.Context context = com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(context, "getContext(...)");
        this.f377555d = null;
        this.f377556e = 2;
        if (pi0.l1.v(l1Var, context, c10716x931597c6, null, null, null, this, 28, null) == aVar) {
            return aVar;
        }
        return jz5.f0.f384359a;
    }
}
