package s72;

/* loaded from: classes11.dex */
public final class f extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f485557d;

    /* renamed from: e, reason: collision with root package name */
    public int f485558e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.kq0 f485559f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(r45.kq0 kq0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f485559f = kq0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new s72.f(this.f485559f, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((s72.f) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f485558e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            r45.kq0 kq0Var = this.f485559f;
            this.f485557d = kq0Var;
            this.f485558e = 1;
            p3325xe03a0797.p3326xc267989b.r rVar = new p3325xe03a0797.p3326xc267989b.r(pz5.f.b(this), 1);
            rVar.k();
            com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
            lVar.f152197a = kq0Var;
            lVar.f152198b = new r45.lq0();
            lVar.f152199c = "/cgi-bin/micromsg-bin/favsync";
            lVar.f152200d = 400;
            lVar.f152201e = 195;
            lVar.f152202f = 1000000195;
            lVar.f152203g = false;
            com.p314xaae8f345.mm.p944x882e457a.o a17 = lVar.a();
            com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar = a17.f152243a.f152217a;
            p3321xbce91901.jvm.p3324x21ffc6bd.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FavSyncRequest");
            r45.kq0 kq0Var2 = (r45.kq0) fVar;
            kq0Var2.f460432d = kq0Var.f460432d;
            kq0Var2.f460433e = kq0Var.f460433e;
            gm0.j1.d().g(new s72.d(a17, new s72.g(new s72.e(rVar, "/cgi-bin/micromsg-bin/favsync"))));
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
