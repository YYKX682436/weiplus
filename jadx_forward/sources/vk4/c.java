package vk4;

/* loaded from: classes2.dex */
public final class c extends com.p314xaae8f345.mm.p944x882e457a.i {
    public c(bw5.v70 listenItem) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItem, "listenItem");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        bw5.x70 x70Var = new bw5.x70();
        x70Var.f116524m = listenItem;
        boolean[] zArr = x70Var.f116527p;
        zArr[8] = true;
        x70Var.f116519e = 2;
        zArr[3] = true;
        byte[] mo14344x5f01b1f6 = x70Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        lVar.f152197a = new qk.s9(mo14344x5f01b1f6);
        lVar.f152198b = new qk.t9();
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listenitem";
        lVar.f152200d = 8167;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingFetchListenItemCGI", "fetchListenItem listenId: " + listenItem.m13170xcc16feb8() + ", title: " + listenItem.m13171x7531c8a2());
    }
}
