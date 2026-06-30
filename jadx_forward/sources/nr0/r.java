package nr0;

/* loaded from: classes14.dex */
public final class r extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f420635d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nr0.x f420636e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(nr0.x xVar, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f420636e = xVar;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new nr0.r(this.f420636e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((nr0.r) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        java.lang.Object obj2;
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f420635d;
        jz5.f0 f0Var = jz5.f0.f384359a;
        nr0.x xVar = this.f420636e;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            xVar.f420656o = rs0.g.n(rs0.i.f480829a, null, null, 1, 1, null, 16, null);
            zr0.p pVar = xVar.f420655n;
            pVar.f556699f = xVar.f420656o;
            this.f420635d = 1;
            pVar.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.CameraRenderPipeline", "setUpInGLEnv");
            pVar.f556700g = new os0.f(0, 0, 0, 0, 2, 2);
            pVar.f556701h = new os0.c(0, 0, 0, 0, 2, 2);
            pVar.f556702i = new os0.e(0, 0, 0, 0, 0, 0, 48, null);
            nr0.c cVar = pVar.f556703m;
            if (cVar == null || (obj2 = cVar.a(this)) != aVar) {
                obj2 = f0Var;
            }
            if (obj2 == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57 = xVar.f420658q;
        if (interfaceC29045xdcb5ca57 != null) {
            p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
            interfaceC29045xdcb5ca57.mo48700xdecd0e93(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(f0Var));
        }
        xVar.f420658q = null;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.Camera.GLEnvBuilder", "gl env set up finish,thread-id:[" + android.os.Process.myTid() + "] name:" + java.lang.Thread.currentThread().getName());
        return f0Var;
    }
}
