package tr1;

/* loaded from: classes7.dex */
public final class a extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff f502902d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff c23235xb7425dff, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f502902d = c23235xb7425dff;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new tr1.a(this.f502902d, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        tr1.a aVar = (tr1.a) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2);
        jz5.f0 f0Var = jz5.f0.f384359a;
        aVar.mo150x989b7ca4(f0Var);
        return f0Var;
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("updateCommentImg cancel mediaId:");
        com.p314xaae8f345.p2845xc516c4b6.biz.C23235xb7425dff c23235xb7425dff = this.f502902d;
        sb6.append(c23235xb7425dff.m85571x75e04be9());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.BizInteractionCommentImgUploader", sb6.toString());
        sx.b0 b0Var = (sx.b0) i95.n0.c(sx.b0.class);
        if (b0Var != null) {
            java.lang.String m85571x75e04be9 = c23235xb7425dff.m85571x75e04be9();
            if (m85571x75e04be9 == null) {
                m85571x75e04be9 = "";
            }
            ((rx.f) b0Var).Bi(m85571x75e04be9);
        }
        return jz5.f0.f384359a;
    }
}
