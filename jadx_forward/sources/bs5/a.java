package bs5;

/* loaded from: classes13.dex */
public class a extends bs5.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ bs5.b f105539b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(bs5.b bVar) {
        super(bVar);
        this.f105539b = bVar;
    }

    @Override // bs5.e
    public boolean a() {
        java.nio.channels.SocketChannel socketChannel = this.f105539b.f105540i;
        return socketChannel != null ? socketChannel.isConnected() && super.a() : super.a();
    }

    @Override // bs5.e
    public boolean b() {
        bs5.b bVar = this.f105539b;
        if (bVar.f105540i == null) {
            return super.b();
        }
        or5.b.a(bVar.f105546o.g() + ", channel isConnected:" + bVar.f105540i.isConnected() + ", writable:" + super.b(), new java.lang.Object[0]);
        return bVar.f105540i.isConnected() && super.b();
    }
}
