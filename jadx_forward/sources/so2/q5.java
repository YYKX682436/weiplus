package so2;

/* loaded from: classes3.dex */
public final class q5 extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f492085d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ so2.w5 f492086e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f492087f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(so2.w5 w5Var, java.lang.String str, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f492086e = w5Var;
        this.f492087f = str;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new so2.q5(this.f492086e, this.f492087f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((so2.q5) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f492085d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            this.f492085d = 1;
            this.f492086e.getClass();
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            java.lang.String str = this.f492087f;
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("Finder.SetProfileCoverViewModel", "cover file length %d KB", new java.lang.Long(com.p314xaae8f345.mm.vfs.w6.k(str) / 1024));
            rVar.m(new so2.u5(rVar));
            ((qs2.q) ((w40.e) i95.n0.c(w40.e.class))).getClass();
            mv2.f0 f0Var = mv2.f0.f413094a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(str);
            mv2.f0.f413095b.b(new mv2.i0(str), new so2.v5(rVar));
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
