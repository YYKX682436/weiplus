package yf5;

/* loaded from: classes11.dex */
public final class h extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ yf5.m f543418d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f543419e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ yz5.l f543420f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(yf5.m mVar, int i17, yz5.l lVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543418d = mVar;
        this.f543419e = i17;
        this.f543420f = lVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf5.h(this.f543418d, this.f543419e, this.f543420f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf5.h) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        yf5.k0 k0Var = new yf5.k0();
        yf5.m mVar = this.f543418d;
        k0Var.f543430c = mVar.f543445f.f543396a;
        int i17 = this.f543419e;
        k0Var.f543429b = i17;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("get convList, requestVersion: ");
        sb6.append(k0Var.f543429b);
        sb6.append(", id: ");
        sb6.append(k0Var.f543428a);
        sb6.append(", flagVersion.version: ");
        yf5.e eVar = mVar.f543445f;
        sb6.append(eVar.f543397b);
        sb6.append(", flag: ");
        sb6.append(k0Var.f543430c);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(mVar.f543441b, sb6.toString());
        int i18 = k0Var.f543429b;
        int i19 = eVar.f543397b;
        jz5.f0 f0Var = jz5.f0.f384359a;
        if (i18 < i19) {
            return f0Var;
        }
        yf5.l0 g17 = mVar.f543440a.g(k0Var);
        java.util.ArrayList arrayList = g17.f543437b;
        if (arrayList == null) {
            arrayList = new java.util.ArrayList();
        }
        java.util.ArrayList arrayList2 = arrayList;
        yf5.x xVar = (yf5.x) kz5.n0.k0(arrayList2);
        if (xVar != null && xVar.f543528d != null) {
            mVar.d(k0Var.f543429b, g17.f543439d);
        }
        v65.i.b(mVar.f543443d, null, new yf5.g(mVar, g17, this.f543420f, arrayList2, k0Var, null), 1, null);
        if (g17.f543438c) {
            v65.i.b(mVar.f543442c, null, new yf5.h(mVar, i17, null, null), 1, null);
        } else {
            mVar.d(k0Var.f543429b, Long.MIN_VALUE);
        }
        return f0Var;
    }
}
