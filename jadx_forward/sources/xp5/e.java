package xp5;

/* loaded from: classes15.dex */
public final class e extends com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22916x74ff688a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ xp5.f f537499a;

    public e(xp5.f fVar) {
        this.f537499a = fVar;
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22916x74ff688a
    /* renamed from: onConnectClose */
    public void mo83288xe5ca02ad(long j17, int i17, java.lang.String reason) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(reason, "reason");
        xp5.f fVar = this.f537499a;
        java.lang.Object obj = fVar.f537500a.get(java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "websocket onClose, code: " + i17 + ", reason: " + reason + ", url: " + ((qa3.n) ((xp5.d) obj)).f442583a);
        m83285xc59599cb(j17);
        fVar.f537500a.remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22916x74ff688a
    /* renamed from: onConnectError */
    public void mo83289xe5e8f6bd(long j17, long j18, java.lang.String errMsg) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(errMsg, "errMsg");
        xp5.f fVar = this.f537499a;
        java.lang.Object obj = fVar.f537500a.get(java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "websocket onError, code: " + ((int) j18) + ", reason: " + errMsg + ", url: " + ((qa3.n) ((xp5.d) obj)).f442583a);
        m83285xc59599cb(j17);
        fVar.f537500a.remove(java.lang.Long.valueOf(j17));
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22916x74ff688a
    /* renamed from: onConnectOpen */
    public void mo83290x834e16f5(long j17, java.util.Map headers) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(headers, "headers");
        java.lang.Object obj = this.f537499a.f537500a.get(java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "websocket onOpen: " + ((qa3.n) ((xp5.d) obj)).f442583a);
        qa3.o.b(qa3.o.f442584a);
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22916x74ff688a
    /* renamed from: onMessageBinary */
    public void mo83291xb8a07b49(long j17, java.nio.ByteBuffer message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        java.lang.Object obj = this.f537499a.f537500a.get(java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        int remaining = message.remaining();
        byte[] bArr = new byte[remaining];
        message.get(bArr);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "websocket onBinaryMessage: size: " + remaining + ", url: " + ((qa3.n) ((xp5.d) obj)).f442583a);
        qa3.o.a(qa3.o.f442584a, bArr);
    }

    @Override // com.p314xaae8f345.mm.p2809x52b77bcb.AbstractC22916x74ff688a
    /* renamed from: onMessageText */
    public void mo83292xe883e675(long j17, java.lang.String message) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(message, "message");
        java.lang.Object obj = this.f537499a.f537500a.get(java.lang.Long.valueOf(j17));
        p3321xbce91901.jvm.p3324x21ffc6bd.o.d(obj);
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("LiteAppTestService", "websocket onMessage: size: " + message + ", url: " + ((qa3.n) ((xp5.d) obj)).f442583a);
        qa3.o oVar = qa3.o.f442584a;
        byte[] bytes = message.getBytes(r26.c.f450398a);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.f(bytes, "getBytes(...)");
        qa3.o.a(oVar, bytes);
    }
}
