package fo5;

/* loaded from: classes14.dex */
public final class l extends qz5.l implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public int f346547d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ fo5.r0 f346548e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(fo5.r0 r0Var, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        super(2, interfaceC29045xdcb5ca57);
        this.f346548e = r0Var;
    }

    @Override // qz5.a
    /* renamed from: create */
    public final p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 mo148xaf65a0fc(java.lang.Object obj, p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57 interfaceC29045xdcb5ca57) {
        return new fo5.l(this.f346548e, interfaceC29045xdcb5ca57);
    }

    @Override // yz5.p
    /* renamed from: invoke */
    public java.lang.Object mo149xb9724478(java.lang.Object obj, java.lang.Object obj2) {
        return ((fo5.l) mo148xaf65a0fc((p3325xe03a0797.p3326xc267989b.y0) obj, (p3321xbce91901.p3322xc267989b.InterfaceC29045xdcb5ca57) obj2)).mo150x989b7ca4(jz5.f0.f384359a);
    }

    @Override // qz5.a
    /* renamed from: invokeSuspend */
    public final java.lang.Object mo150x989b7ca4(java.lang.Object obj) {
        pz5.a aVar = pz5.a.f440719d;
        int i17 = this.f346547d;
        if (i17 == 0) {
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "before call end");
            if (this.f346548e.k()) {
                com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f c5716x51d5635f = new com.p314xaae8f345.mm.p632xd97a1f41.p633xb307e119.C5716x51d5635f();
                c5716x51d5635f.f136037g.f87792a = 0;
                c5716x51d5635f.e();
            }
            nq4.e.f420541a.a();
            if (this.f346548e.a()) {
                nq4.f.f420547a.d();
            }
            ((jp5.o) i95.n0.c(jp5.o.class)).y9();
            if (this.f346548e.n()) {
                this.f346548e.f346621g.b();
            }
            co5.c.f125347a.b();
            go5.x xVar = this.f346548e.f346621g;
            xVar.f355689h = false;
            go5.g0 f17 = xVar.f();
            f17.getClass();
            i95.m c17 = i95.n0.c(cv.w0.class);
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(c17, "getService(...)");
            cv.w0.f9((cv.w0) c17, 0, null, 2, null);
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).oj(f17.f355666b);
            ((gl.i) ((cv.w0) i95.n0.c(cv.w0.class))).m131720x41012807();
            go5.z c18 = xVar.c();
            f25.m0 m0Var = c18.f355690a;
            if (m0Var != null) {
                ((f25.n0) i95.n0.c(f25.n0.class)).yg(m0Var);
            }
            c18.f355690a = null;
            go5.c0 c0Var = (go5.c0) xVar.d();
            c0Var.getClass();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.AudioPlayerImpl", "release: ");
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar = c0Var.f355657a;
            if (eVar != null) {
                eVar.e();
            }
            com.p314xaae8f345.mm.p1006xc5476f33.p2346x3751a0.p2348x633fb29.e eVar2 = c0Var.f355657a;
            if (eVar2 != null) {
                eVar2.f();
            }
            c0Var.f355657a = null;
            ((go5.k) xVar.e()).a();
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.VoIPMPAudioController", "release");
            hp5.e eVar3 = this.f346548e.f346624j;
            if (eVar3 != null) {
                eVar3.a();
            }
            fo5.r0 r0Var = this.f346548e;
            r0Var.f346624j = null;
            r0Var.f346623i.g();
            io5.e eVar4 = this.f346548e.f346631q;
            if (eVar4.f375067b) {
                eVar4.f375067b = false;
                di3.d dVar = eVar4.f375076k;
                if (dVar != null) {
                    dVar.disable();
                }
                di3.d dVar2 = eVar4.f375076k;
                if (dVar2 != null) {
                    dVar2.f314222g = null;
                }
                eVar4.f375076k = null;
                eVar4.f375074i.unregisterContentObserver(eVar4.f375075j);
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPDeviceController", "device controller stopped");
            } else {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPDeviceController", "device controller not started, ignore stop call");
            }
            qo5.b.f447196a.a();
            ro5.b bVar = this.f346548e.f346630p;
            if (bVar == null) {
                p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                throw null;
            }
            bVar.B();
            lo5.h.b(this.f346548e.f346628n, false, 1, null);
            jp5.o oVar = (jp5.o) i95.n0.c(jp5.o.class);
            this.f346547d = 1;
            if (oVar.x4(this) == aVar) {
                return aVar;
            }
        } else {
            if (i17 != 1) {
                throw new java.lang.IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p3321xbce91901.C29044xefd6a286.m143926x4e770e65(obj);
        }
        hp5.l lVar = this.f346548e.f346625k;
        lVar.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPSystemStatusController", "unregisterScreenBroadcastReceiver: ");
        if (lVar.f364493a) {
            lVar.f364493a = false;
            com.p314xaae8f345.mm.sdk.p2603x2137b148.x2.f274604a.unregisterReceiver((com.p314xaae8f345.mm.p2793xcfa97743.v2.p2801xca0053ba.C22893xb093c84b) ((jz5.n) lVar.f364494b).mo141623x754a37bb());
        }
        fo5.r0 r0Var2 = this.f346548e;
        r0Var2.f346620f = null;
        r0Var2.I = null;
        r0Var2.f346615J = false;
        if (!r0Var2.k()) {
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "playEndSound() called");
            gp5.g gVar = r0Var2.f346629o;
            gVar.getClass();
            ((ku5.t0) ku5.t0.f394148d).g(new gp5.f(gVar));
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "call end");
        return jz5.f0.f384359a;
    }
}
