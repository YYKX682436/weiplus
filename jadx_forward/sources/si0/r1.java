package si0;

/* loaded from: classes4.dex */
public final class r1 implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40, io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f {

    /* renamed from: d, reason: collision with root package name */
    public android.app.Activity f489695d;

    @Override // com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40
    /* renamed from: choosePickerDate */
    public void mo92103x6ba256d3(byte[] dateInfo, long j17, long j18, yz5.l callback) {
        bw5.lk0 mo11468x92b714fd;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(dateInfo, "dateInfo");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.SnsUserDatePickerFlutterPlugin", "choosePickerDate");
        android.app.Activity activity = this.f489695d;
        if (activity == null || (mo11468x92b714fd = new bw5.lk0().mo11468x92b714fd(dateInfo)) == null) {
            return;
        }
        ca4.r0 r0Var = new ca4.r0();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        java.util.LinkedHashMap linkedHashMap = new java.util.LinkedHashMap();
        java.util.Iterator it = mo11468x92b714fd.f111368d.iterator();
        java.lang.String str = "";
        while (it.hasNext()) {
            bw5.tk0 tk0Var = (bw5.tk0) it.next();
            java.lang.String valueOf = java.lang.String.valueOf(tk0Var.f115030d);
            java.lang.String valueOf2 = java.lang.String.valueOf(tk0Var.f115031e);
            long j19 = tk0Var.f115032f;
            if (!p3321xbce91901.jvm.p3324x21ffc6bd.o.b(str, valueOf)) {
                arrayList = new java.util.ArrayList();
                linkedHashMap = new java.util.LinkedHashMap();
                r0Var.f121542a.add(valueOf);
                r0Var.f121543b.add(arrayList);
                java.util.Map map = r0Var.f121544c;
                p3321xbce91901.jvm.p3324x21ffc6bd.o.f(map, "map");
                ((java.util.HashMap) map).put(valueOf, linkedHashMap);
                str = valueOf;
            }
            arrayList.add(valueOf2);
            linkedHashMap.put(valueOf2, java.lang.Long.valueOf(j19));
        }
        java.util.ArrayList arrayList2 = r0Var.f121542a;
        java.util.ArrayList arrayList3 = r0Var.f121543b;
        com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0 c0Var = new com.p314xaae8f345.mm.ui.p2747xd1075a44.p2763xc515088e.c0(activity, arrayList2, arrayList3);
        c0Var.g(android.view.View.inflate(activity, com.p314xaae8f345.mm.R.C30864xbddafb2a.f571065cv2, null));
        int indexOf = arrayList2.indexOf(java.lang.String.valueOf(j17));
        c0Var.j(java.lang.Math.max(indexOf, 0), java.lang.Math.max(indexOf < 0 ? 0 : ((java.util.List) arrayList3.get(indexOf)).indexOf(java.lang.String.valueOf(j18)), 0));
        c0Var.f293792t = new si0.q1(r0Var, callback, c0Var);
        c0Var.l();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onAttachedToActivity */
    public void mo260x9f807ad(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f489695d = binding.mo137508x19263085();
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40.Companion.m92105x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivity */
    public void mo262x262a05ea() {
        this.f489695d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onDetachedFromActivityForConfigChanges */
    public void mo263x145650e2() {
        this.f489695d = null;
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40.Companion companion = com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.sns.InterfaceC24882xd25a4c40.Companion.m92105x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28625xf037586f
    /* renamed from: onReattachedToActivityForConfigChanges */
    public void mo265x37859a58(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.p3293x9d4bf30f.InterfaceC28627xb16524e3 binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        this.f489695d = binding.mo137508x19263085();
    }
}
