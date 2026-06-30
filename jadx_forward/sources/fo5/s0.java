package fo5;

/* loaded from: classes11.dex */
public final class s0 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public final fo5.t0 f346645d;

    /* renamed from: e, reason: collision with root package name */
    public com.p314xaae8f345.p2845xc516c4b6.p2883xcfa97743.C25218x782e0ab3 f346646e;

    public s0(fo5.t0 t0Var) {
        this.f346645d = t0Var;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.FlutterPlugin", "onAttachedToActivity: " + binding.mo137508x19263085());
        ((jp5.o) i95.n0.c(jp5.o.class)).Z4(binding);
        binding.mo137508x19263085().getWindow().addFlags(6815872);
        binding.mo137508x19263085().setRequestedOrientation(7);
        n3.h2.a(binding.mo137508x19263085().getWindow(), false);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.FlutterPlugin", "onAttachedToEngine ");
        fo5.t0 t0Var = this.f346645d;
        if (t0Var != null) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 m137988x3128f042 = binding.m137988x3128f042();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137988x3128f042, "getTextureRegistry(...)");
            long m137429xe85cb873 = binding.m137986xf7af55c8().m137429xe85cb873();
            fo5.x0 x0Var = (fo5.x0) t0Var;
            java.util.Map map = x0Var.f346682f;
            fo5.u0 u0Var = (fo5.u0) p3321xbce91901.jvm.p3324x21ffc6bd.m0.c(map).remove(x0Var.f346680d);
            if (u0Var != null) {
                ((fo5.z0) u0Var).a();
            }
            x0Var.f346680d = m137988x3128f042;
            fo5.u0 u0Var2 = x0Var.f346681e;
            if (u0Var2 != null) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.Launcher", "registerFlutterTextureRegister");
                fo5.q2 q2Var = fo5.q2.f346604d;
                ro5.b bVar = q2Var.f().f346630p;
                if (bVar == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                    throw null;
                }
                bVar.l();
                fo5.r0 f17 = q2Var.f();
                f17.getClass();
                f17.f346633s = true;
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.CoreV2", "attach engine");
                ro5.b bVar2 = f17.f346630p;
                if (bVar2 == null) {
                    p3321xbce91901.jvm.p3324x21ffc6bd.o.o("renderController");
                    throw null;
                }
                bVar2.u(m137988x3128f042);
                map.put(m137988x3128f042, u0Var2);
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPFlutterSessionManager", "textureRegistry registered, engineId=" + m137429xe85cb873);
        }
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        this.f346646e = new com.p314xaae8f345.p2845xc516c4b6.p2883xcfa97743.C25218x782e0ab3(m137983x3b5b91dc, null, 2, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        ((jp5.o) i95.n0.c(jp5.o.class)).v1();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        ((jp5.o) i95.n0.c(jp5.o.class)).v1();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMP.FlutterPlugin", "onDetachedFromEngine ");
        fo5.t0 t0Var = this.f346645d;
        if (t0Var != null) {
            io.p3284xd2ae381c.p3320x373aa5.InterfaceC28980x1159d658 m137988x3128f042 = binding.m137988x3128f042();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137988x3128f042, "getTextureRegistry(...)");
            long m137429xe85cb873 = binding.m137986xf7af55c8().m137429xe85cb873();
            fo5.u0 u0Var = (fo5.u0) ((fo5.x0) t0Var).f346682f.remove(m137988x3128f042);
            if (u0Var != null) {
                ((fo5.z0) u0Var).a();
            }
            com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoIPMPFlutterSessionManager", "textureRegistry released, engineId=" + m137429xe85cb873);
        }
        this.f346646e = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        ((jp5.o) i95.n0.c(jp5.o.class)).Z4(binding);
    }
}
