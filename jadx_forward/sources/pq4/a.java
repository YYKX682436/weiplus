package pq4;

/* loaded from: classes12.dex */
public final class a extends p3321xbce91901.jvm.p3324x21ffc6bd.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ pq4.c f439211d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(pq4.c cVar) {
        super(0);
        this.f439211d = cVar;
    }

    @Override // yz5.a
    /* renamed from: invoke */
    public java.lang.Object mo152xb9724478() {
        pq4.c cVar = this.f439211d;
        rs0.h hVar = cVar.f439216d;
        if (hVar != null) {
            rs0.i.f480829a.u(hVar);
        }
        android.os.HandlerThread handlerThread = cVar.f439215c;
        handlerThread.quitSafely();
        com.p314xaae8f345.mm.sdk.p2603x2137b148.n3 n3Var = cVar.f439214b;
        if (n3Var != null) {
            n3Var.m77787xbe88f509();
        }
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.VoipThread", "release: " + handlerThread.getName());
        return jz5.f0.f384359a;
    }
}
