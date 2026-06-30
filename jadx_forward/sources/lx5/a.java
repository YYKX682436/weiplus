package lx5;

/* loaded from: classes15.dex */
public class a implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ lx5.b f403690d;

    public a(lx5.b bVar) {
        this.f403690d = bVar;
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler
    /* renamed from: onMethodCall */
    public void mo294x9bfdc61e(io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28687x4bb242ff c28687x4bb242ff, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.Result result) {
        java.lang.String str = c28687x4bb242ff.f71610xbfc5d0e1;
        str.getClass();
        boolean equals = str.equals("onDartChannelReady");
        lx5.b bVar = this.f403690d;
        if (!equals) {
            io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2.MethodCallHandler methodCallHandler = bVar.f403693c;
            if (methodCallHandler != null) {
                methodCallHandler.mo294x9bfdc61e(c28687x4bb242ff, result);
                return;
            }
            return;
        }
        nx5.c.a("WxaRouter.SafeMethodChannel", "onMethodCall onDartChannelReady", new java.lang.Object[0]);
        if (bVar.f403691a) {
            return;
        }
        bVar.f403691a = true;
        while (true) {
            java.util.concurrent.LinkedBlockingQueue linkedBlockingQueue = bVar.f403694d;
            if (linkedBlockingQueue.isEmpty()) {
                return;
            }
            lx5.c cVar = (lx5.c) linkedBlockingQueue.poll();
            if (cVar != null) {
                io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.C28688xe8dbe4c2 c28688xe8dbe4c2 = bVar.f403692b;
                java.lang.String str2 = cVar.f403696a;
                c28688xe8dbe4c2.m138439xd8c5c779(str2, cVar.f403697b, cVar.f403698c);
                nx5.c.a("WxaRouter.SafeMethodChannel", "notifyChannelReady doing invoke method %s", str2);
            }
        }
    }
}
