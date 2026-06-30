package hr3;

/* loaded from: classes5.dex */
public final class me extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f365336d;

    /* renamed from: e, reason: collision with root package name */
    public int f365337e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f365338f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr3.pf f365339g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ r45.dz3 f365340h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public me(p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, hr3.pf pfVar, r45.dz3 dz3Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f365338f = h0Var;
        this.f365339g = pfVar;
        this.f365340h = dz3Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new hr3.me(this.f365338f, this.f365339g, this.f365340h, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((hr3.me) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        java.util.LinkedList linkedList;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f365337e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            hr3.ag agVar = hr3.ag.f364937a;
            java.lang.String a17 = en1.a.a();
            this.f365339g.getClass();
            r45.dz3 dz3Var = this.f365340h;
            r45.v60 v60Var = (dz3Var == null || (linkedList = dz3Var.f454402e) == null) ? null : (r45.v60) kz5.n0.Z(linkedList);
            p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f365338f;
            this.f365336d = h0Var2;
            this.f365337e = 1;
            obj = agVar.c(a17, v60Var, this);
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f365336d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        h0Var.f391656d = obj;
        return jz5.f0.f384359a;
    }
}
