package wq2;

/* loaded from: classes2.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p944x882e457a.f f530040d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ wq2.h f530041e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ boolean f530042f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.mm.p944x882e457a.f fVar, wq2.h hVar, boolean z17, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f530040d = fVar;
        this.f530041e = hVar;
        this.f530042f = z17;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new wq2.a(this.f530040d, this.f530041e, this.f530042f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        wq2.a aVar = (wq2.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("#loadDataWithCgi cgi end. errType=");
        com.p314xaae8f345.mm.p944x882e457a.f fVar = this.f530040d;
        sb6.append(fVar.f152148a);
        sb6.append(", errCode=");
        sb6.append(fVar.f152149b);
        sb6.append(", errMsg=");
        sb6.append(fVar.f152150c);
        sb6.append(", themeId=");
        wq2.h hVar = this.f530041e;
        sb6.append(hVar.f530068g);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveSpecialFragmentViewCallback", sb6.toString());
        if (fVar.f152148a == 0 && fVar.f152149b == 0) {
            r45.yz2 yz2Var = (r45.yz2) fVar.f152151d;
            hVar.f530065d = yz2Var;
            hVar.a(yz2Var, this.f530042f);
            hVar.f530070i.R6(((r45.yz2) fVar.f152151d).f473066w * 1000);
        }
        if (((r45.yz2) fVar.f152151d).mo11484xe92ab0a8().f458492d == -101) {
            r45.du5 du5Var = ((r45.yz2) fVar.f152151d).mo11484xe92ab0a8().f458493e;
            java.lang.String str = du5Var != null ? du5Var.f454289d : null;
            if (str == null) {
                str = "";
            }
            if (str.length() == 0) {
                str = ((com.p314xaae8f345.mm.ui.AbstractActivityC21394xb3d2c0cf) hVar.f530062a).getResources().getString(com.p314xaae8f345.mm.R.C30867xcad56011.m9h);
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(str, "getString(...)");
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.LiveSpecialFragmentViewCallback", "loadDataWithCgi: theme is disable, finish activity, toastMsg=".concat(str));
            db5.t7.m123883x26a183b(hVar.f530062a, str, 0).show();
            hVar.f530062a.finish();
        }
        return jz5.f0.f384359a;
    }
}
