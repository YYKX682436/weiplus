package md2;

/* loaded from: classes8.dex */
public final class h implements io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f, com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7 {

    /* renamed from: d, reason: collision with root package name */
    public final android.content.Context f407380d;

    public h(android.content.Context context, gk2.e eVar) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        this.f407380d = context;
    }

    @Override // com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7
    /* renamed from: modLivePersonalCenterRecentWatchOptions */
    public void mo90628xd2f55b8d(long j17, java.util.List list, yz5.l callback) {
        java.util.LinkedList linkedList;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        if (list != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            java.util.Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(java.lang.Long.valueOf(com.p314xaae8f345.mm.sdk.p2603x2137b148.t8.q0((java.lang.String) it.next(), 0L)));
            }
            linkedList = new java.util.LinkedList();
            kz5.n0.O0(arrayList, linkedList);
        } else {
            linkedList = new java.util.LinkedList();
        }
        ((zy2.b6) i95.n0.c(zy2.b6.class)).getClass();
        md2.g gVar = new md2.g(j17, this, callback);
        hb2.h hVar = hb2.h.f361580e;
        hVar.getClass();
        bw5.br brVar = new bw5.br();
        brVar.f107330d = (int) j17;
        boolean[] zArr = brVar.f107332f;
        zArr[1] = true;
        brVar.f107331e = linkedList;
        zArr[2] = true;
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(hb2.h.f361581f, "modifyPlayHistorySet op_type:" + brVar.f107330d);
        hb2.w0.m(hVar, brVar, gVar, false, false, null, null, 60, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onAttachedToEngine */
    public void mo261xdddc9e60(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7.Companion.m90630x97a46f3a(companion, m137983x3b5b91dc, this, null, 4, null);
    }

    @Override // io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f
    /* renamed from: onDetachedFromEngine */
    public void mo264x6a0307dd(io.p3284xd2ae381c.p3285xac0c4757.p3287xb297fa42.p3292xe3a677a0.InterfaceC28623x7c9e3e4f.FlutterPluginBinding binding) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(binding, "binding");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7.Companion companion = com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7.INSTANCE;
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 m137983x3b5b91dc = binding.m137983x3b5b91dc();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(m137983x3b5b91dc, "getBinaryMessenger(...)");
        com.p314xaae8f345.p2845xc516c4b6.p2869x14de6a99.InterfaceC24403xdb54dbf7.Companion.m90630x97a46f3a(companion, m137983x3b5b91dc, null, null, 4, null);
    }
}
