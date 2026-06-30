package bh0;

/* loaded from: classes7.dex */
public final class c1 extends com.tencent.mm.sdk.event.n {
    public c1() {
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
        ku4.i iVar = ku4.i.f312514a;
        if (((java.util.LinkedList) ((jz5.n) ku4.i.f312515b).getValue()).contains(str)) {
            jx3.f.INSTANCE.w(1454L, 55L, 1L);
            kotlin.jvm.internal.o.d(str);
            iVar.b(str, c30Var.f6313d);
            com.tencent.mars.xlog.Log.i("WebCanvasDownPkgUpdateEventListener", "pkgUpdateEventListener appId=%s, version=%d, md5=%s", str, java.lang.Integer.valueOf(c30Var.f6313d), c30Var.f6312c);
        }
        return false;
    }
}
