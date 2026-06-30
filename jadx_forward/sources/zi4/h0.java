package zi4;

/* loaded from: classes4.dex */
public abstract class h0 extends zi4.a {

    /* renamed from: g, reason: collision with root package name */
    public final yz5.a f554756g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host, yz5.a requestFactory) {
        super(cmdId, weakReference, host);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(requestFactory, "requestFactory");
        this.f554756g = requestFactory;
    }

    @Override // zi4.a
    public final void a(byte[] bArr, yz5.l callback) {
        com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar;
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        java.lang.String str = this.f554713d;
        if (bArr != null) {
            try {
                java.lang.Object mo152xb9724478 = this.f554756g.mo152xb9724478();
                ((com.p314xaae8f345.mm.p2495xc50a8b8b.f) mo152xb9724478).mo11468x92b714fd(bArr);
                fVar = (com.p314xaae8f345.mm.p2495xc50a8b8b.f) mo152xb9724478;
                if (fVar == null) {
                }
                b(fVar, new zi4.r1(callback, this));
            } catch (java.lang.Throwable th6) {
                com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FLTStatusAsyncActionHandler", "handleRequest cmd=" + str + ", err=" + th6.getMessage());
                p3321xbce91901.C29043x91b2b43d.Companion companion = p3321xbce91901.C29043x91b2b43d.INSTANCE;
                callback.mo146xb9724478(p3321xbce91901.C29043x91b2b43d.m143894x8377ece2(p3321xbce91901.C29043x91b2b43d.m143895xf1229813(p3321xbce91901.C29044xefd6a286.m143914x452354ee(th6))));
                return;
            }
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.e("MicroMsg.FLTStatusAsyncActionHandler", "handleRequest: cmd=" + str + ", request is null");
        fVar = null;
        b(fVar, new zi4.r1(callback, this));
    }

    public abstract void b(com.p314xaae8f345.mm.p2495xc50a8b8b.f fVar, zi4.r1 r1Var);
}
