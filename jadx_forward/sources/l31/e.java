package l31;

/* loaded from: classes9.dex */
public final class e extends l31.b {

    /* renamed from: e, reason: collision with root package name */
    public final e31.l f396871e;

    /* renamed from: f, reason: collision with root package name */
    public final k31.a f396872f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String username, k31.a storageManager, e31.l lVar) {
        super(username);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(storageManager, "storageManager");
        this.f396872f = storageManager;
        this.f396871e = lVar;
    }

    @Override // l31.u
    public void run() {
        com.p314xaae8f345.p542x3306d5.p550x382fcc.Log.i("MicroMsg.GetAllSubscribeListTask", "getAllSubscribeStatus run");
        java.lang.String username = this.f396846a;
        l31.d dVar = new l31.d(this);
        p3321xbce91901.jvm.p3324x21ffc6bd.o.g(username, "username");
        f31.f fVar = new f31.f(username, 3);
        fVar.f340810f = dVar;
        c(fVar);
    }
}
