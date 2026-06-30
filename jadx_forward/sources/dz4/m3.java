package dz4;

/* loaded from: classes8.dex */
public final class m3 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public final ih0.p f326885d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f326886e;

    public m3(ih0.p noteDataHolder) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(noteDataHolder, "noteDataHolder");
        this.f326885d = noteDataHolder;
        this.f326886e = "MicroMsg.WeNoteFlutterPlugin";
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326886e, "onAttachedToActivity: ");
        ((ez4.u) this.f326885d).d(binding.mo137508x19263085());
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326886e, "onAttachedToEngine: ");
        ez4.u uVar = (ez4.u) this.f326885d;
        uVar.getClass();
        dz4.s1 s1Var = (dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class));
        s1Var.getClass();
        java.util.ArrayList arrayList = (java.util.ArrayList) s1Var.f326930e;
        if (!arrayList.contains(uVar)) {
            arrayList.add(uVar);
            return;
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w(s1Var.f326929d, "registerFavNoteActivityHolder: holder already exists, key: " + uVar.f339476b);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326886e, "onDetachedFromActivity: ");
        ((ez4.u) this.f326885d).d(null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326886e, "onDetachedFromActivityForConfigChanges: ");
        ((ez4.u) this.f326885d).d(null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326886e, "onDetachedFromEngine: ");
        ez4.u uVar = (ez4.u) this.f326885d;
        if (uVar.f339478d) {
            return;
        }
        ((dz4.s1) ((ih0.r) i95.n0.c(ih0.r.class))).Ai(uVar);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(this.f326886e, "onReattachedToActivityForConfigChanges: ");
        ((ez4.u) this.f326885d).d(binding.mo137508x19263085());
    }
}
