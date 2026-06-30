package a35;

/* loaded from: classes5.dex */
public final class q implements c01.yc {
    @Override // c01.yc
    public void O0(com.tencent.mm.modelbase.p0 addMsgInfo) {
        java.lang.String str;
        kotlin.jvm.internal.o.g(addMsgInfo, "addMsgInfo");
        if (gm0.j1.a()) {
            boolean z17 = false;
            r45.j4 j4Var = addMsgInfo.f70726a;
            if (j4Var != null && j4Var.f377560g == 10002) {
                z17 = true;
            }
            if (z17) {
                java.lang.String g17 = x51.j1.g(j4Var.f377561h);
                w15.c cVar = new w15.c();
                kotlin.jvm.internal.o.d(g17);
                cVar.fromXml(g17);
                w15.b j17 = cVar.j();
                if (j17 != null) {
                    com.tencent.mm.storage.f9 o27 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().o2(kotlin.jvm.internal.o.b(c01.z1.r(), j17.getToUsername()) ? j17.getFromUsername() : j17.getToUsername(), j17.j());
                    com.tencent.mars.xlog.Log.i("MicroMsg.FileUploadFinishStaticSysCmdMsgNewXmlListener", "uploadfinishmsg, svrid:" + j17.j() + ", msgId:" + o27.getMsgId() + ", from:" + j17.getFromUsername() + ", to:" + j17.getToUsername());
                    if (o27.getMsgId() > 0) {
                        l15.c cVar2 = new l15.c();
                        java.lang.String j18 = o27.j();
                        if (j18 == null) {
                            j18 = "";
                        }
                        cVar2.fromXml(j18);
                        v05.b k17 = cVar2.k();
                        v05.a aVar = k17 != null ? (v05.a) k17.getCustom(k17.f432315e + 8) : null;
                        if (aVar != null) {
                            aVar.T(2);
                        }
                        java.lang.String V1 = o27.V1();
                        if (com.tencent.mm.sdk.platformtools.t8.K0(V1)) {
                            str = cVar2.toXml();
                        } else {
                            str = V1 + ":\n" + cVar2.toXml();
                        }
                        o27.d1(str);
                        ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).cj().lb(o27.getMsgId(), o27, true);
                    }
                }
            }
        }
    }

    @Override // c01.yc
    public void g1(com.tencent.mm.modelbase.r0 msg) {
        kotlin.jvm.internal.o.g(msg, "msg");
    }
}
