package yf0;

/* loaded from: classes11.dex */
public final class w extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f543147d;

    /* renamed from: e, reason: collision with root package name */
    public int f543148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zf0.v0 f543149f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ p3321xbce91901.jvm.p3324x21ffc6bd.h0 f543150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(zf0.v0 v0Var, p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f543149f = v0Var;
        this.f543150g = h0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new yf0.w(this.f543149f, this.f543150g, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((yf0.w) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f543148e;
        p3321xbce91901.jvm.p3324x21ffc6bd.h0 h0Var2 = this.f543150g;
        zf0.v0 v0Var = this.f543149f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            v0Var.t();
            this.f543147d = h0Var2;
            this.f543148e = 1;
            obj = v0Var.y(this);
            if (obj == aVar) {
                return aVar;
            }
            h0Var = h0Var2;
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            h0Var = (p3321xbce91901.jvm.p3324x21ffc6bd.h0) this.f543147d;
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        h0Var.f391656d = obj;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
        sb6.append(v0Var.id());
        sb6.append(" compress upload retCode:");
        qi3.i0 i0Var = (qi3.i0) h0Var2.f391656d;
        sb6.append(i0Var != null ? new java.lang.Integer(i0Var.f445258a) : null);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VideoMsg.VideoSendFSC", sb6.toString());
        return jz5.f0.f384359a;
    }
}
