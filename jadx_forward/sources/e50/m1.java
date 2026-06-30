package e50;

/* loaded from: classes15.dex */
public final class m1 implements io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 {

    /* renamed from: a, reason: collision with root package name */
    public io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 f331055a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f331056b = new java.util.ArrayList();

    /* renamed from: c, reason: collision with root package name */
    public final java.util.List f331057c = new java.util.ArrayList();

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: send */
    public void mo126981x35cf88(java.lang.String channel, java.nio.ByteBuffer byteBuffer) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        mo126982x35cf88(channel, byteBuffer, null);
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: setMessageHandler */
    public void mo126983x12ef5e45(java.lang.String channel, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryMessageHandler binaryMessageHandler) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2 = this.f331055a;
        if (interfaceC28679x1b8c77f2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28679x1b8c77f2);
            interfaceC28679x1b8c77f2.mo126983x12ef5e45(channel, binaryMessageHandler);
        } else {
            ((java.util.ArrayList) this.f331057c).add(new e50.k1(channel, binaryMessageHandler));
        }
    }

    @Override // io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2
    /* renamed from: send */
    public void mo126982x35cf88(java.lang.String channel, java.nio.ByteBuffer byteBuffer, io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2.BinaryReply binaryReply) {
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(channel, "channel");
        io.p3284xd2ae381c.p3301xc5476f33.p3302xaf3f29eb.InterfaceC28679x1b8c77f2 interfaceC28679x1b8c77f2 = this.f331055a;
        if (interfaceC28679x1b8c77f2 != null) {
            p3321xbce91901.jvm.p3324x21ffc6bd.o.d(interfaceC28679x1b8c77f2);
            interfaceC28679x1b8c77f2.mo126982x35cf88(channel, byteBuffer, binaryReply);
        } else {
            ((java.util.ArrayList) this.f331056b).add(new e50.l1(channel, byteBuffer, binaryReply));
        }
    }
}
