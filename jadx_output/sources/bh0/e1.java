package bh0;

/* loaded from: classes7.dex */
public final class e1 extends com.tencent.mm.sdk.event.n {
    public e1() {
        super(0);
    }

    @Override // com.tencent.mm.sdk.event.n
    public boolean callback(com.tencent.mm.sdk.event.IEvent iEvent) {
        com.tencent.mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent event = (com.tencent.mm.autogen.events.WxaPkgDownloadCompleteNotifyEvent) iEvent;
        kotlin.jvm.internal.o.g(event, "event");
        am.c30 c30Var = event.f55001g;
        java.lang.String str = c30Var.f6310a;
        if (c30Var.f6314e != 0) {
            return true;
        }
        ku4.z zVar = ku4.z.f312539a;
        if (zVar.j().contains(str)) {
            com.tencent.mm.plugin.appbrand.service.o6 o6Var = (com.tencent.mm.plugin.appbrand.service.o6) i95.n0.c(com.tencent.mm.plugin.appbrand.service.o6.class);
            if (o6Var != null) {
                o6Var.Uf(str, event.f55001g.f6313d);
            }
            com.tencent.mars.xlog.Log.i("WebCanvasPkgUpdateEventListener", "pkgUpdateEventListener appId=%s, version=%d, md5=%s", str, java.lang.Integer.valueOf(event.f55001g.f6313d), event.f55001g.f6312c);
            jx3.f.INSTANCE.w(1454L, 62L, 1L);
            kotlin.jvm.internal.o.d(str);
            java.lang.String filePath = event.f55001g.f6311b;
            kotlin.jvm.internal.o.f(filePath, "filePath");
            ((ku5.t0) ku5.t0.f312615d).g(new ku4.k(filePath, str, 0));
            if (com.tencent.mm.vfs.w6.j(event.f55001g.f6311b)) {
                java.lang.String str2 = ku4.z.f312540b + '/' + str;
                if (!com.tencent.mm.vfs.w6.j(str2)) {
                    com.tencent.mm.vfs.w6.u(str2);
                }
                java.lang.String str3 = str2 + '/' + java.lang.System.currentTimeMillis() + ".wcpkg";
                com.tencent.mm.vfs.w6.c(event.f55001g.f6311b, str3);
                r45.mt mtVar = new r45.mt();
                mtVar.f380816d = str;
                mtVar.f380817e = new com.tencent.mm.vfs.r6(str3).o();
                am.c30 c30Var2 = event.f55001g;
                mtVar.f380818f = c30Var2.f6313d;
                mtVar.f380819g = c30Var2.f6314e;
                mtVar.f380820h = c30Var2.f6312c;
                try {
                    zVar.n(str, mtVar);
                } catch (java.lang.Exception e17) {
                    com.tencent.mars.xlog.Log.e("WebCanvasPkgUpdateEventListener", "save pkg info fail " + e17.getMessage());
                }
            }
        }
        return false;
    }
}
