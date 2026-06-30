package fq5;

/* loaded from: classes5.dex */
public final class b implements aq5.q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 f347193a;

    public b(com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8) {
        this.f347193a = c22927xe8447aa8;
    }

    @Override // aq5.q0
    public void a() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "onConnected() called");
    }

    @Override // aq5.q0
    public void b(int i17, byte[] data, r45.y77 fileInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfo, "fileInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeDrop.TransferFileUIC", "onReceiveFile() called");
    }

    @Override // aq5.q0
    public void c(bw5.ge0 userInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(userInfo, "userInfo");
        com.p314xaae8f345.mm.p2812xd0cf26bd.ui.p2813x2eaded.C22927xe8447aa8 c22927xe8447aa8 = this.f347193a;
        c22927xe8447aa8.getClass();
        c22927xe8447aa8.getClass();
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "goToTransferPage() called");
        c22927xe8447aa8.f295812h = true;
        gh0.e eVar = (gh0.e) i95.n0.c(gh0.e.class);
        android.app.Activity context = c22927xe8447aa8.m80379x76847179();
        zp5.f fVar = (zp5.f) eVar;
        fVar.getClass();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(context, "context");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i(fVar.f556496d, "startWeDropReceiveUI() called");
        android.content.Intent intent = new android.content.Intent(context, (java.lang.Class<?>) com.p314xaae8f345.mm.ui.p2694xe7814c81.ActivityC22353x5623e3da.class);
        intent.putExtra("isSender", false);
        intent.putExtra("toUserNick", userInfo.m11989x80025a04());
        intent.putExtra("toUserHeadUrl", userInfo.m11988x341984a2());
        pf5.j0.a(intent, hq5.i.class);
        pf5.j0.a(intent, hq5.a0.class);
        pf5.j0.a(intent, hq5.k0.class);
        pf5.j0.a(intent, hq5.w.class);
        pf5.j0.a(intent, gq5.p.class);
        pf5.j0.a(intent, gq5.i.class);
        pf5.j0.a(intent, hq5.m.class);
        lk5.s.e(intent, true);
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(intent);
        java.util.Collections.reverse(arrayList);
        yj0.a.d(context, arrayList.toArray(), "com/tencent/mm/wedrop/WeDropFeatureService", "startWeDropReceiveUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/MigrateMsgUserInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
        context.startActivity((android.content.Intent) arrayList.get(0));
        yj0.a.f(context, "com/tencent/mm/wedrop/WeDropFeatureService", "startWeDropReceiveUI", "(Landroid/content/Context;Lcom/tencent/wechat/aff/proto/MigrateMsgUserInfo;)V", "Undefined", "startActivity", "(Landroid/content/Intent;)V");
    }

    @Override // aq5.q0
    public void d() {
    }

    @Override // aq5.q0
    public void e(int i17, byte[] data, r45.y77 fileInfo) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(data, "data");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(fileInfo, "fileInfo");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeDrop.TransferFileUIC", "onSendFile() called");
    }

    @Override // aq5.q0
    public void f(r45.b87 prepareSendRequest, int i17) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(prepareSendRequest, "prepareSendRequest");
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.w("MicroMsg.WeDrop.TransferFileUIC", "onPrepareSend() called prepareErrorCode:" + i17);
    }

    @Override // aq5.q0
    public void g(int i17) {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.WeDrop.TransferFileUIC", "onDisconnect() called errCode:" + i17);
        this.f347193a.V6(5);
    }
}
