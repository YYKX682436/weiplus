package zi4;

/* loaded from: classes9.dex */
public final class w0 extends zi4.a {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f554804g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(java.lang.String cmdId, java.lang.ref.WeakReference weakReference, zi4.g0 host) {
        super(cmdId, weakReference, host);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(cmdId, "cmdId");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(host, "host");
        this.f554804g = "MicroMsg.FLTStatusOpenGroupDialogHandler";
    }

    @Override // zi4.a
    public void a(byte[] bArr, yz5.l callback) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(callback, "callback");
        bw5.pb pbVar = new bw5.pb();
        pbVar.mo11468x92b714fd(bArr);
        pm0.v.X(new zi4.v0(this, pbVar));
    }
}
