package ey2;

/* loaded from: classes8.dex */
public final class f0 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f338898d;

    /* renamed from: e, reason: collision with root package name */
    public int f338899e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f338900f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ey2.k0 f338901g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.d0 f338902h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.d0 f338903i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ey2.k0 k0Var, p3321xbce91901.jvm.p3324x21ffc6bd.d0 d0Var, p3321xbce91901.jvm.p3324x21ffc6bd.d0 d0Var2, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f338901g = k0Var;
        this.f338902h = d0Var;
        this.f338903i = d0Var2;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        ey2.f0 f0Var = new ey2.f0(this.f338901g, this.f338902h, this.f338903i, interfaceC29045xdcb5ca57);
        f0Var.f338900f = obj;
        return f0Var;
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((ey2.f0) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object m143895xf1229813;
        ey2.k0 k0Var;
        java.lang.Object a17;
        ey2.k0 k0Var2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f338899e;
        jz5.f0 f0Var = jz5.f0.f384359a;
        try {
            if (i17 == 0) {
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                k0Var = this.f338901g;
                p3321xbce91901.jvm.p3324x21ffc6bd.d0 d0Var = this.f338902h;
                p3321xbce91901.jvm.p3324x21ffc6bd.d0 d0Var2 = this.f338903i;
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                db2.e4 e4Var = new db2.e4(d0Var.f391647d, d0Var2.f391647d);
                this.f338900f = k0Var;
                this.f338898d = k0Var;
                this.f338899e = 1;
                a17 = rm0.h.a(e4Var, 0L, null, this, 3, null);
                if (a17 == aVar) {
                    return aVar;
                }
                k0Var2 = k0Var;
            } else {
                if (i17 != 1) {
                    throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ey2.k0 k0Var3 = (ey2.k0) this.f338898d;
                k0Var2 = (ey2.k0) this.f338900f;
                p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
                k0Var = k0Var3;
                a17 = obj;
            }
            k0Var.f338944e = (r45.ae3) a17;
            r45.ae3 ae3Var = k0Var2.f338944e;
            jz5.f0 f0Var2 = null;
            if (ae3Var != null) {
                if (com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.K0(ae3Var.f451499d)) {
                    k0Var2.f338944e = null;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "Get Location Fail");
                } else {
                    java.lang.String str = ae3Var.f451500e;
                    if (str == null) {
                        str = "";
                    }
                    ae3Var.f451500e = str;
                    java.lang.String str2 = ae3Var.f451501f;
                    if (str2 == null) {
                        str2 = "";
                    }
                    ae3Var.f451501f = str2;
                    com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "Get Location " + ae3Var.f451499d + ' ' + ae3Var.f451500e + ' ' + ae3Var.f451501f);
                }
                f0Var2 = f0Var;
            }
            if (f0Var2 == null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.GlobalLocationVM", "Get Location Fail");
            }
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var);
        } catch (java.lang.Throwable th6) {
            p3321xbce91901.C29043x91b2b43d.Companion companion2 = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            m143895xf1229813 = p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6));
        }
        java.lang.Throwable m143898xd4a2fc34 = p3321xbce91901.C29043x91b2b43d.m143898xd4a2fc34(m143895xf1229813);
        if (m143898xd4a2fc34 != null) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.m40542x58ef3d35("Finder.GlobalLocationVM", m143898xd4a2fc34, "", new java.lang.Object[0]);
        }
        return f0Var;
    }
}
