package tf2;

/* loaded from: classes3.dex */
public final class d extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tf2.k f500445d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f500446e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tf2.k kVar, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f500445d = kVar;
        this.f500446e = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tf2.d(this.f500445d, this.f500446e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((tf2.d) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        android.view.ViewGroup viewGroup;
        android.view.View view;
        java.lang.String str;
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        zi2.w wVar = (zi2.w) this.f500445d.R6(zi2.w.class);
        if (wVar != null) {
            km2.q qVar = (km2.q) this.f500446e.f391656d;
            if (qVar == null || (str = qVar.f390703a) == null) {
                str = "";
            }
            sj2.m y17 = wVar.y1(str);
            if (y17 != null && (viewGroup = y17.mo124433x9681e6d()) != null) {
                view = viewGroup.findViewById(com.p314xaae8f345.mm.R.id.ezw);
                if (view == null && viewGroup != null) {
                    return new tf2.e(view.getLeft() + (view.getWidth() / 2), viewGroup.getTop() + (viewGroup.getHeight() / 2));
                }
            }
        }
        viewGroup = null;
        view = null;
        return view == null ? null : null;
    }
}
