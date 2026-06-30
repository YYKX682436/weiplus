package bs5;

/* loaded from: classes13.dex */
public class a extends bs5.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs5.b f24006b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bs5.b bVar) {
        super(bVar);
        this.f24006b = bVar;
    }

    @Override // bs5.e
    public boolean a() {
        java.nio.channels.SocketChannel socketChannel = this.f24006b.f24007i;
        return socketChannel != null ? socketChannel.isConnected() && super.a() : super.a();
    }

    @Override // bs5.e
    public boolean b() {
        bs5.b bVar = this.f24006b;
        if (bVar.f24007i == null) {
            return super.b();
        }
        or5.b.a(bVar.f24013o.g() + ", channel isConnected:" + bVar.f24007i.isConnected() + ", writable:" + super.b(), new java.lang.Object[0]);
        return bVar.f24007i.isConnected() && super.b();
    }
}
