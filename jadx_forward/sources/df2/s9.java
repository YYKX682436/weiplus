package df2;

/* loaded from: classes3.dex */
public final class s9 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f312853d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f312854e;

    /* renamed from: f, reason: collision with root package name */
    public int f312855f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.t9 f312856g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f312857h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ wh2.b f312858i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s9(df2.t9 t9Var, int i17, wh2.b bVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f312856g = t9Var;
        this.f312857h = i17;
        this.f312858i = bVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new df2.s9(this.f312856g, this.f312857h, this.f312858i, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((df2.s9) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f312855f;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            df2.t9 t9Var = this.f312856g;
            this.f312853d = t9Var;
            wh2.b bVar = this.f312858i;
            this.f312854e = bVar;
            this.f312855f = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            java.lang.String str = t9Var.f312959m;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder("startPlay, count:");
            int i18 = this.f312857h;
            sb6.append(i18);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(str, sb6.toString());
            p3321xbce91901.jvm.p3324x21ffc6bd.c0 c0Var = new p3321xbce91901.jvm.p3324x21ffc6bd.c0();
            tn0.w0 w0Var = dk2.ef.f314911d;
            if (w0Var != null) {
                java.lang.String i19 = com.p314xaae8f345.mm.vfs.w6.i(bVar.f527478a, false);
                df2.r9 r9Var = new df2.r9(c0Var, t9Var, i18, rVar);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.LiveCore", "setInteractiveGiftEffect " + i19);
                w0Var.f502304r.l(new tn0.s(w0Var, i19, r9Var));
            }
            obj = rVar.j();
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        return obj;
    }
}
