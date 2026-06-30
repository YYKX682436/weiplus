package vk4;

/* loaded from: classes2.dex */
public final class b extends com.p314xaae8f345.mm.p944x882e457a.i {
    public b(bw5.v70 listenItem, bw5.ar0 scene) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(listenItem, "listenItem");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(scene, "scene");
        com.p314xaae8f345.mm.p944x882e457a.l lVar = new com.p314xaae8f345.mm.p944x882e457a.l();
        bw5.g40 g40Var = new bw5.g40();
        g40Var.f109209d = 2;
        boolean[] zArr = g40Var.f109217o;
        zArr[7] = true;
        g40Var.f109215m = scene.f106955d;
        zArr[8] = true;
        g40Var.f109210e = listenItem;
        zArr[2] = true;
        g40Var.f109213h = false;
        zArr[4] = true;
        byte[] mo14344x5f01b1f6 = g40Var.mo14344x5f01b1f6();
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(mo14344x5f01b1f6, "toByteArray(...)");
        lVar.f152197a = new qk.s9(mo14344x5f01b1f6);
        lVar.f152198b = new qk.t9();
        lVar.f152199c = "/cgi-bin/mmlistenappsvr/listenaddtoplaylist";
        lVar.f152200d = 10585;
        p(lVar.a());
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.TingAddToPlayListCGI", "addToPlayListCgi request listenType: " + listenItem.f115722e + ", listenId: " + listenItem.m13170xcc16feb8() + ", scene: " + scene);
    }
}
