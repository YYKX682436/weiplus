package nq;

/* loaded from: classes8.dex */
public class r extends android.os.Handler {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ nq.s f420432a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(nq.s sVar, android.os.Looper looper) {
        super(looper);
        this.f420432a = sVar;
    }

    @Override // android.os.Handler
    public void handleMessage(android.os.Message message) {
        nq.t tVar = com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb.f146412s;
        synchronized (tVar) {
            switch (message.what) {
                case 0:
                    mq.h.b("MicroMsg.GLThread", "surfaceCreated tid=" + this.f420432a.getId(), new java.lang.Object[0]);
                    nq.s sVar = this.f420432a;
                    sVar.f420440n = true;
                    sVar.f420445s = false;
                    tVar.notifyAll();
                    break;
                case 1:
                    mq.h.b("MicroMsg.GLThread", "surfaceDestroyed tid=" + this.f420432a.getId(), new java.lang.Object[0]);
                    this.f420432a.f420440n = false;
                    tVar.notifyAll();
                    break;
                case 2:
                    mq.h.b("MicroMsg.GLThread", "onPause tid=" + this.f420432a.getId(), new java.lang.Object[0]);
                    this.f420432a.f420438i = true;
                    tVar.notifyAll();
                    break;
                case 3:
                    mq.h.b("MicroMsg.GLThread", "onResume tid=" + this.f420432a.getId(), new java.lang.Object[0]);
                    nq.s sVar2 = this.f420432a;
                    sVar2.f420438i = false;
                    sVar2.f420449w = true;
                    sVar2.getClass();
                    tVar.notifyAll();
                    break;
                case 4:
                    int i17 = message.arg1;
                    int i18 = message.arg2;
                    nq.s sVar3 = this.f420432a;
                    if (sVar3.f420446t != i17 || sVar3.f420447u != i18) {
                        mq.h.b("MicroMsg.GLThread", "windowResize w:%d h:%d tid=", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Long.valueOf(this.f420432a.getId()));
                        nq.s sVar4 = this.f420432a;
                        sVar4.f420446t = i17;
                        sVar4.f420447u = i18;
                        sVar4.f420452z = true;
                        sVar4.f420449w = true;
                        sVar4.getClass();
                        tVar.notifyAll();
                        break;
                    } else {
                        return;
                    }
                case 5:
                    mq.h.b("MicroMsg.GLThread", "requestExitAndWaitForDestroy tid=" + this.f420432a.getId(), new java.lang.Object[0]);
                    nq.s sVar5 = this.f420432a;
                    sVar5.f420437h = true;
                    com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb surfaceHolderCallback2C10435xb52e77fb = (com.p314xaae8f345.mm.p676x4c4db2ad.p678x373aa5.SurfaceHolderCallback2C10435xb52e77fb) sVar5.C.get();
                    if (surfaceHolderCallback2C10435xb52e77fb != null) {
                        ((nq.f) surfaceHolderCallback2C10435xb52e77fb.f146416g).g();
                    }
                    tVar.notifyAll();
                    break;
                case 6:
                    mq.h.b("MicroMsg.GLThread", "requestRender tid=" + this.f420432a.getId(), new java.lang.Object[0]);
                    this.f420432a.f420449w = true;
                    tVar.notifyAll();
                    break;
            }
        }
    }
}
