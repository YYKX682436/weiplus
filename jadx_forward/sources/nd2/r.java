package nd2;

/* loaded from: classes10.dex */
public final class r implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public nd2.q f418004d;

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.mo137508x19263085();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "onAttachedToActivity: " + binding.mo137508x19263085());
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo137508x19263085);
        ms5.f.d(mo137508x19263085, bm5.a1.a(mo137508x19263085));
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "onAttachedToEngine");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        nd2.q qVar = new nd2.q(m137983x3b5b91dc, binding.m137982x6e669035());
        this.f418004d = qVar;
        binding.m137987x9883be8b().mo138696x7b3a4002("com.tencent.xin.flutter.platformViewType.cdnliveplayer", qVar);
        com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc2 = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc2, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8.Companion.m90039x97a46f3a(companion, m137983x3b5b91dc2, qVar.f418003e, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "onDetachedFromActivity");
        ms5.f.f412691a.a("onDetach_LiveCDNPlayerPlugin");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "onDetachedFromActivityForConfigChanges");
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "onDetachedFromEngine");
        com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2867x33741466.InterfaceC24291xeb3bcf8.Companion.m90039x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
        nd2.q qVar = this.f418004d;
        if (qVar != null) {
            java.util.concurrent.ConcurrentHashMap concurrentHashMap = qVar.f418001c;
            java.util.Collection values = concurrentHashMap.values();
            p3321xbce91901.jvm.p3324x21ffc6bd.o.f(values, "<get-values>(...)");
            java.util.Iterator it = values.iterator();
            while (it.hasNext()) {
                ((nd2.o) it.next()).mo31847x63a5261f();
            }
            concurrentHashMap.clear();
            qVar.f418002d.clear();
        }
        this.f418004d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        binding.mo137508x19263085();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MMLiveCDNPlayerPlugin", "onReattachedToActivityForConfigChanges: " + binding.mo137508x19263085());
        android.app.Activity mo137508x19263085 = binding.mo137508x19263085();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(mo137508x19263085);
        ms5.f.d(mo137508x19263085, bm5.a1.a(mo137508x19263085));
    }
}
