package zi4;

/* loaded from: classes11.dex */
public final class y0 extends zi4.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f554809g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f554809g = "MicroMsg.FLTStatusOpenGroupDialogHandler";
    }

    @Override // zi4.a
    public void a(byte[] bArr, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.qb qbVar = new bw5.qb();
        qbVar.mo11468x92b714fd(bArr);
        pm0.v.X(new zi4.x0(this, qbVar));
    }
}
