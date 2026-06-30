package xt2;

/* loaded from: classes3.dex */
public final class s2 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f538538d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ xt2.e3 f538539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.LinkedList f538540f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f538541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s2(xt2.e3 e3Var, java.util.LinkedList linkedList, int i17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f538539e = e3Var;
        this.f538540f = linkedList;
        this.f538541g = i17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new xt2.s2(this.f538539e, this.f538540f, this.f538541g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((xt2.s2) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f538538d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xt2.e3 e3Var = this.f538539e;
            xt2.k1 m175934xb9052958 = e3Var.m175934xb9052958();
            if (m175934xb9052958 != null) {
                java.lang.String str = e3Var.f538239h;
                java.util.LinkedList linkedList = this.f538540f;
                android.widget.LinearLayout linearLayout = e3Var.f538256z;
                int i18 = this.f538541g;
                xt2.r2 r2Var = new xt2.r2(e3Var);
                this.f538538d = 1;
                if (m175934xb9052958.c(str, linkedList, false, linearLayout, i18, r2Var, this) == aVar) {
                    return aVar;
                }
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return jz5.f0.f384359a;
    }
}
